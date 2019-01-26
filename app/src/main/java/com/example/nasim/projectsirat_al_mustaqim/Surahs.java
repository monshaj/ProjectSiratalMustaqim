package com.example.nasim.projectsirat_al_mustaqim;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Surahs extends AppCompatActivity {
    ListView surahListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surahs);

        surahListView = findViewById(R.id.SurahListViewId);
        final String[] surahNames = getResources().getStringArray(R.array.surah_names);

        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.sample_surah_names_list,R.id.sampleSurahNamesId,surahNames);
        surahListView.setAdapter(adapter);

        surahListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String value = surahNames[i];

                if (i==0)
                {
                    Intent intent = new Intent(getApplicationContext(),Al_Fatiha.class);
                    startActivity(intent);
                }
                if (i==1)
                {
                    Intent intent = new Intent(getApplicationContext(),Al_Baqarah.class);
                    startActivity(intent);
                }
                if (i==2)
                {
                    Intent intent = new Intent(getApplicationContext(),Al_Imran.class);
                    startActivity(intent);
                }
                if (i==3)
                {
                    Intent intent = new Intent(getApplicationContext(),An_Nisa.class);
                    startActivity(intent);
                }
                if (i==4)
                {
                    Intent intent = new Intent(getApplicationContext(),Al_Maidah.class);
                    startActivity(intent);
                }
            }
        });

        // for inserting back arrow
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

    }

    //For coming back to Main_Menu
    @Override
    public void onBackPressed() {
        Intent intent= new Intent(Surahs.this,Main_Menu.class);
        startActivity(intent);
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
