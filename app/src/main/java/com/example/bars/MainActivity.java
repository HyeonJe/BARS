package org.sajae.myapplication8;
//package com.example.bars;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final int MAIN_CAMERA_REQUESTCODE = 101;

    Button buttonCamera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCamera = findViewById(R.id.button_camera);

        buttonCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCameraActivity();
            }
        });
    }

    public void showCameraActivity() {
        Intent intent = new Intent(getApplicationContext(), CameraActivity.class);
        startActivityForResult(intent, MAIN_CAMERA_REQUESTCODE);
    }

}
