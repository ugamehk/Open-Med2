package com.example.yin.openmed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MedicineSettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine_setting);
    }
    public void changeView(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, Home1.class);
        startActivity(intent);
    }
    public void changeView2(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, SettingActivity.class);
        startActivity(intent);
    }
    public void changeView3(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, TimeSettingActivity.class);
        startActivity(intent);
    }
}
