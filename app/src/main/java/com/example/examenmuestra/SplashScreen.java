package com.example.examenmuestra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        TimerTask task= new TimerTask() {
            @Override
            public void run() {
                Intent i= new Intent().setClass(SplashScreen.this, MainActivity.class);
                startActivity(i);

                finish();
            }

        };

        Timer timer=new Timer();
        timer.schedule(task, 3000);


    }
}