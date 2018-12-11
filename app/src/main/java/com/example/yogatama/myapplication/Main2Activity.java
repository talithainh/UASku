package com.example.yogatama.myapplication;

import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    public static String title;
    public static String body;

    public TextView tvjudul, tvisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        MyFirebaseMessagingService ambilToken= new MyFirebaseMessagingService();

        ambilToken.onTokenRefresh();

        tvjudul = (TextView) findViewById(R.id.tvjudul);
        tvisi = (TextView) findViewById(R.id.tvisi);

        Intent lala = getIntent();
        String syafri = lala.getStringExtra("wira");
        String cakep = lala.getStringExtra("ganteng");

        tvjudul.setText(syafri);
        tvisi.setText(cakep);

        if(title !=null || body !=null)
        {
            tvjudul.setText(title);
            tvisi.setText(body);
        }
    }
}
