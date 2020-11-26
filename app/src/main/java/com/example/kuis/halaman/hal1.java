package com.example.kuis.halaman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.kuis.MudahLV1.MUDAH1;
import com.example.kuis.R;

public class hal1 extends AppCompatActivity {
    Button pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal1);

        pindah = (Button) findViewById(R.id.button1);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.button1:
                        Intent intent = new Intent(hal1.this, MUDAH1.class);
                        startActivity(intent);
                        break;
                }

            }
        });

        pindah = (Button) findViewById(R.id.locked1);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(hal1.this, "LEVEL IS LOCKED",Toast.LENGTH_SHORT).show();

            }

        });

        pindah = (Button) findViewById(R.id.locked2);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(hal1.this, "LEVEL IS LOCKED",Toast.LENGTH_SHORT).show();

            }

        });
        pindah = (Button) findViewById(R.id.locked3);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(hal1.this, "LEVEL IS LOCKED",Toast.LENGTH_SHORT).show();

            }

        });

        pindah = (Button) findViewById(R.id.locked4);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(hal1.this, "LEVEL IS LOCKED",Toast.LENGTH_SHORT).show();

            }

        });

        pindah = (Button) findViewById(R.id.locked5);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(hal1.this, "LEVEL IS LOCKED",Toast.LENGTH_SHORT).show();

            }

        });
    }
}
