package com.example.nasim.projectsirat_al_mustaqim;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.spark.submitbutton.SubmitButton;

public class Zakat extends AppCompatActivity {
    EditText gold, money, silver, goldBori, silverBori;
    SubmitButton submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zakat);

        gold = findViewById(R.id.goldInput);
        money = findViewById(R.id.tkInput);
        silver = findViewById(R.id.silverInput);
        submit = findViewById(R.id.submit);
        goldBori = findViewById(R.id.goldBoriPriceInput);
        silverBori = findViewById(R.id.silverBoriPriceInput);

        setTitle("Zakat");

      //   For inserting back arrow
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        final Handler handler = new Handler();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run()
                    {
                        String goldText = "0";
                        String moneyText = "0";
                        String silverText = "0";
                        String goldBoriText = "0";
                        String silverBoriText = "0";
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
                        if(!(goldBori.getText().toString().isEmpty()))
                        {
                            goldBoriText = goldBori.getText().toString();
                        }
                        if(!(silverBori.getText().toString().isEmpty()))
                        {
                            silverBoriText = silverBori.getText().toString();
                        }



                        double total = 0.0;
                        double goldTK = 0.0;
                        double moneyTK = 0.0;
                        double silverTK = 0.0;
                        double finalAmount = 0.0;

                        //convert gold
                        if(!(goldText.equals(null)))
                        {
                            double moneyGold = Double.valueOf(goldBoriText);
                            goldTK = Double.valueOf(goldText)*moneyGold;
                        }


                        //convert money
                        if(!(moneyText.equals(null)))
                        {
                            moneyTK = Double.valueOf(moneyText);
                        }

                        //convert silver
                        if(!(silverText.equals(null)))
                        {
                            double silverMoney = Double.valueOf(silverBoriText);
                            silverTK = Double.valueOf(silverText)*silverMoney;
                        }

                        if((silverBori.getText().toString().isEmpty()) || (goldBori.getText().toString().isEmpty()))
                        {
                            Toast.makeText(Zakat.this, "Please insert the amount of bori", Toast.LENGTH_SHORT).show();
                        }
                        else
                        {
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

                    }
                }, 3000);

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
