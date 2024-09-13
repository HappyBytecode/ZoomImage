package com.demo.zoomimage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ZoomImageView zoomIv = findViewById(R.id.zoomIv);
        zoomIv.setImageResource(R.drawable.driver_license_example);
    }
}