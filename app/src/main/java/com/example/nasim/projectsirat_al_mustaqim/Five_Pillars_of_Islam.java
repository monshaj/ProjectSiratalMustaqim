package com.example.nasim.projectsirat_al_mustaqim;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Five_Pillars_of_Islam extends AppCompatActivity {
    ListView pillarsListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five__pillars_of__islam);
        setTitle("Five Pillars of Islam");

        pillarsListView = findViewById(R.id.PillarsListViewId);
        final String[] fivePillars = getResources().getStringArray(R.array.five_Pillars_of_Islam);

        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.five_pillars_list,R.id.fivePillarsListId,fivePillars);
        pillarsListView.setAdapter(adapter);

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
        Intent intent= new Intent(Five_Pillars_of_Islam.this,Main_Menu.class);
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
