package com.example.yin.openmed;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.icu.text.IDNA;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Calendar;

public class Home1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void changeView(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, SettingActivity.class);
        startActivity(intent);
    }
    public void changeView2(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, InfoActivity.class);
        startActivity(intent);
    }
}

