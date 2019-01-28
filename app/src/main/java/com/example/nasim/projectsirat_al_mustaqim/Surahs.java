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

import java.util.ArrayList;

public class Surahs extends AppCompatActivity {
    ListView surahListView;
    ArrayList<String> surahs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surahs);

        surahListView = findViewById(R.id.SurahListViewId);
        surahs = new ArrayList<String>();
        //Add all surah name here
        surahs.add("Fatiha");
        surahs.add("Bakarah");
        surahs.add("Fatiha");
        surahs.add("Fatiha");
        surahs.add("Fatiha");
        surahs.add("Fatiha");

        ListViewAdapter adapter = new ListViewAdapter(this,surahs);
        surahListView.setAdapter(adapter);

        surahListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String surahName = "";

                if(i == 0)
                {
                    surahName = "Fatiha";
                }
                else if(i == 1)
                {
                    surahName = "Bakarah";
                }


                Intent intent = new Intent(Surahs.this,Ayat.class);
                intent.putExtra("Surah",surahName);
                startActivity(intent);
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
