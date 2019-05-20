package com.example.bars;

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
        Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
        intent.putExtra("id", "hite");  //예시를 위해 main에서 바로 result로 넘겼습니다. (intent 담아서)
        startActivityForResult(intent, MAIN_CAMERA_REQUESTCODE);
    }

}
