package com.example.nasim.projectsirat_al_mustaqim;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;

public class BroadcastClass extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        String namajText = intent.getStringExtra("Namaj");

        int nId = 0;
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context)
                .setSmallIcon(R.drawable.siratallllt)
                .setContentTitle("Namaj Alert")
                .setContentText(namajText+" namaj wakth started.")
                .setAutoCancel(true)
                .setDefaults(NotificationCompat.DEFAULT_ALL);

        Uri path = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        builder.setSound(path);

        NotificationManager notificationManager = (NotificationManager) context.getApplicationContext().getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(nId,builder.build());
    }
}
