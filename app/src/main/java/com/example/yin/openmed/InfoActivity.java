package com.example.yin.openmed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
    }
    public void changeView(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, Home1.class);
        startActivity(intent);
    }
}
