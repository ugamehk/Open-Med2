package com.example.yin.openmed;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class SettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
    }
    public void changeView(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, Home1.class);
        startActivity(intent);
    }
    public void changeView2(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, MedicineSettingActivity.class);
        startActivity(intent);
    }

}
