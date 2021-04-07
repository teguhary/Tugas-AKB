package com.example.tugas1_akb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tugas1_akb.views.Menu;
import com.example.tugas1_akb.views.Register;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLogin1 = (Button)findViewById(R.id.btnLogin1);

        btnLogin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Menu.class);

                startActivity(i);

            }
        });

        Button btnRegister1 = (Button)findViewById(R.id.btnRegister1);

        btnRegister1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Register.class);

                startActivity(i);
            }
        });
    }
}
