package com.example.tugas1_akb.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.tugas1_akb.MainActivity;
import com.example.tugas1_akb.R;

public class Splash extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent panggil = new Intent(Splash.this, MainActivity.class);
                startActivity(panggil);
                finish();
            }
        }, 5000);
    }
}
