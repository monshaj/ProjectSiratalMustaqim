package com.example.nasim.projectsirat_al_mustaqim;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Nearby_Mosque extends AppCompatActivity {


    Button masjid1,masjid2,masjid3,masjid4,masjid5,masjid7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nearby__mosque);
        setTitle("Mosques of Sylhet");

        masjid1 = findViewById(R.id.masjid1);
        masjid2 = findViewById(R.id.masjid2);
        masjid3 = findViewById(R.id.masjid3);
        masjid4 = findViewById(R.id.masjid4);
        masjid5 = findViewById(R.id.masjid5);
        masjid7 = findViewById(R.id.masjid7);


        masjid1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.google.com/maps/dir/24.9003339,91.8747702/shahjalal+dargah+google+map/@24.9021295,91.866434,16z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x37505528cd70ca2f:0x9eb2841db52a65c0!2m2!1d91.8660182!2d24.9022847");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        masjid2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.google.com/maps/dir//Hazrat+Shah+Paran/@24.9046463,91.9322463,16.25z/data=!4m8!4m7!1m0!1m5!1m1!1s0x3750533a6a2e500b:0xf103c258013c0d0!2m2!1d91.9355775!2d24.905079");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        }); masjid3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.google.com/maps/dir//Kazitula+Uchasharak+Jame+Moshjid,+Kazitula+Rd,+Sylhet/@24.9041673,91.878387,18.5z/data=!4m8!4m7!1m0!1m5!1m1!1s0x375054da872624db:0x1828c873bdefda1b!2m2!1d91.8783318!2d24.9046907");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        }); masjid4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.google.com/maps/dir//Sylhet+Collectorate+Mosque,+Sylhet/@24.8916503,91.8694606,18.75z/data=!4m8!4m7!1m0!1m5!1m1!1s0x3751aad54f25d3ab:0x3c985cc6477060ed!2m2!1d91.8700589!2d24.8918796");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        }); masjid5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.google.com/maps/dir//Noyasharak+Jame+Masjid,+Medical+College+Rd,+Sylhet/@24.8996979,91.8742492,19.75z/data=!4m8!4m7!1m0!1m5!1m1!1s0x375054d69577a0ab:0x68f72b142d7c94fc!2m2!1d91.8745727!2d24.8996164");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        }); masjid7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.google.com/maps/dir//Ambarkhana+Jame+Masjid+%D9%85%D8%B3%D8%AC%D8%AF,+N2,+Sylhet%E2%80%AD%E2%80%AD/@24.9051472,91.8696551,21z/data=!4m8!4m7!1m0!1m5!1m1!1s0x37505527e841611b:0x3718b209835e1765!2m2!1d91.8696948!2d24.9052429");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


        //   For inserting back arrow
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }
    @Override
    public void onBackPressed() {
        startActivity(new Intent(Nearby_Mosque.this,Main_Menu.class));
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