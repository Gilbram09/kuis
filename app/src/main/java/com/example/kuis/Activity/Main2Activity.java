package com.example.kuis.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.kuis.R;
import com.example.kuis.screen.splashscreen1;
import com.example.kuis.screen.splashscreen2;

public class Main2Activity extends AppCompatActivity {
    Button pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        pindah = (Button) findViewById(R.id.level1);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.level1:
                        Intent intent = new Intent(Main2Activity.this, splashscreen1.class);
                        startActivity(intent);
                        break;
                }

            }
        });

        pindah = (Button) findViewById(R.id.level2);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.level2:
                        Intent intent = new Intent(Main2Activity.this, splashscreen2.class);
                        startActivity(intent);
                        break;
                }

            }

        });

        pindah = (Button) findViewById(R.id.locked1);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Main2Activity.this, "COMING SOON", Toast.LENGTH_SHORT).show();

            }

        });
    }
}




