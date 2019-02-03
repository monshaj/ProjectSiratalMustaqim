package com.example.nasim.projectsirat_al_mustaqim;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.Calendar;

public class Main_Menu extends AppCompatActivity {
    Button btnnames, btnmosques, btnzakat, btntasbih, btnadhan, btnsurah;
    int count = 0;


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
        btntasbih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main_Menu.this,tasbih.class));
            }
        });



    }

    //For coming back to Home
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    private void broadcastNotification() {
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        Calendar c3 = Calendar.getInstance();
        Calendar c4 = Calendar.getInstance();
        Calendar c5 = Calendar.getInstance();
        Calendar c6 = Calendar.getInstance();
        c1.set(c1.get(Calendar.YEAR), c1.get(Calendar.MONTH), c1.get(Calendar.DAY_OF_MONTH), 4, 5, 0);
        c2.set(c2.get(Calendar.YEAR), c2.get(Calendar.MONTH), c2.get(Calendar.DAY_OF_MONTH), 5, 30, 0);
        c3.set(c3.get(Calendar.YEAR), c3.get(Calendar.MONTH), c3.get(Calendar.DAY_OF_MONTH), 12, 21, 0);
        c4.set(c4.get(Calendar.YEAR), c4.get(Calendar.MONTH), c4.get(Calendar.DAY_OF_MONTH), 16, 10, 0);
        c5.set(c5.get(Calendar.YEAR), c5.get(Calendar.MONTH), c5.get(Calendar.DAY_OF_MONTH), 17, 30, 0);
        c6.set(c6.get(Calendar.YEAR), c6.get(Calendar.MONTH), c6.get(Calendar.DAY_OF_MONTH), 19, 10, 0);
        setAlarm(c1.getTimeInMillis(), "Tahajjud");
        setAlarm(c2.getTimeInMillis(), "Fojor");
        setAlarm(c3.getTimeInMillis(), "Juhur");
        setAlarm(c4.getTimeInMillis(), "Asor");
        setAlarm(c5.getTimeInMillis(), "Magrib");
        setAlarm(c6.getTimeInMillis(), "Esha");
    }

    private void setAlarm(long timeInMillis, String namaj) {
        String namajText = namaj;
        AlarmManager alarmManager =(AlarmManager) getSystemService(Context.ALARM_SERVICE);

        Intent intent = new Intent(Main_Menu.this,BroadcastClass.class);

        intent.putExtra("Namaj", namajText);

        PendingIntent pendingIntent = PendingIntent.getBroadcast(this,count,intent,0);

        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,timeInMillis,AlarmManager.INTERVAL_DAY,pendingIntent);

        count++;

    }

}
