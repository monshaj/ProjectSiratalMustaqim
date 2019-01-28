package com.example.nasim.projectsirat_al_mustaqim;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Main_Menu extends AppCompatActivity {
    Button btnnames, btnmosques, btnzakat, btntasbih, btnadhan, btnsurah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menue);

        btnnames = findViewById(R.id.btnnames);
        btnmosques = findViewById(R.id.btnmosques);
        btnzakat = findViewById(R.id.btnzakat);
        btntasbih = findViewById(R.id.btntasbih);
        btnadhan = findViewById(R.id.btnadhan);
        btnsurah = findViewById(R.id.btnsurah);

        btnnames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main_Menu.this,Names_of_Allah.class);
                startActivity(intent);
            }
        });

        btnsurah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main_Menu.this,Surahs.class);
                startActivity(intent);
            }
        });

        btnzakat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main_Menu.this,Zakat.class));
            }
        });

        // For inserting back arrow
//        ActionBar actionBar = getSupportActionBar();
//        if (actionBar != null){
//            actionBar.setHomeButtonEnabled(true);
//            actionBar.setDisplayHomeAsUpEnabled(true);
//        }
    }

    //For coming back to Home
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

}
