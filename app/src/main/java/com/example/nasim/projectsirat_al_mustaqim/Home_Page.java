package com.example.nasim.projectsirat_al_mustaqim;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class Home_Page extends AppCompatActivity {
    Button nextsecbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__page);
        getSupportActionBar().hide();



        new CountDownTimer(5000,2000)
        {
            @Override
            public void onTick(long l) {

            }
            @Override
            public void onFinish() {
                startActivity(new Intent(Home_Page.this,Main_Menu.class));

            }
        }.start();

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);


    }
}