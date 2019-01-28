package com.example.nasim.projectsirat_al_mustaqim;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.spark.submitbutton.SubmitButton;

public class Zakat extends AppCompatActivity {
    EditText gold, money, silver;
    SubmitButton submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zakat);

        gold = findViewById(R.id.goldInput);
        money = findViewById(R.id.tkInput);
        silver = findViewById(R.id.silverInput);
        submit = findViewById(R.id.submit);

        setTitle("Zakat");

      //   For inserting back arrow
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String goldText = "0";
                String moneyText = "0";
                String silverText = "0";
                if(!(gold.getText().toString().isEmpty()))
                {
                    goldText = gold.getText().toString();
                }
                if(!(money.getText().toString().isEmpty()))
                {
                    moneyText = money.getText().toString();
                }
                if(!(silver.getText().toString().isEmpty()))
                {
                    silverText = silver.getText().toString();
                }



                int total = 0;
                int goldTK = 0;
                int moneyTK = 0;
                int silverTK = 0;
                double finalAmount = 0.0;

                //convert gold
                if(!(goldText.equals(null)))
                goldTK = Integer.parseInt(goldText)*37000;

                //convert money
                if(!(moneyText.equals(null)))
                moneyTK = Integer.parseInt(moneyText);
                //convert silver
                if(!(silverText.equals(null)))
                silverTK = Integer.parseInt(silverText)*500;

                total = goldTK+moneyTK+silverTK;
                finalAmount = (total*2.5)/100;

                AlertDialog.Builder builder1 = new AlertDialog.Builder(Zakat.this, R.style.AlertDialogStyle);
                builder1.setMessage("Total Zakat "+finalAmount+" Tk");
                builder1.setCancelable(true);

                builder1.setPositiveButton(
                        "Okay",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });

                AlertDialog alert11 = builder1.create();
                alert11.show();
            }
        });
    }
    @Override
    public void onBackPressed() {
        startActivity(new Intent(Zakat.this,Main_Menu.class));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home)
        {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
