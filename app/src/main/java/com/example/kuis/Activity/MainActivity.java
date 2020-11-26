package com.example.kuis.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.kuis.R;
import com.example.kuis.screen.splashscreen1;

public class MainActivity extends AppCompatActivity {

    Button pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pindah = (Button) findViewById(R.id.level1);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.level1:
                        Intent intent = new Intent(MainActivity.this, splashscreen1.class);
                        startActivity(intent);
                        break;
                }

            }
        });

        pindah = (Button) findViewById(R.id.locked);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Toast.makeText(MainActivity.this, "LEVEL IS LOCKED",Toast.LENGTH_SHORT).show();

                }

        });

        pindah = (Button) findViewById(R.id.locked1);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "COMING SOON",Toast.LENGTH_SHORT).show();

            }

        });
    }
}

