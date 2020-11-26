package com.example.kuis.halaman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.kuis.EXPERT;
import com.example.kuis.MudahLV1.MUDAH1;
import com.example.kuis.R;
import com.example.kuis.SULIT;
import com.example.kuis.sedanglv1.SEDANG1;
import com.example.kuis.sedanglv1.SEDANG2;

public class halaman4 extends AppCompatActivity {
    Button pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman4);

        pindah = (Button) findViewById(R.id.button1);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.button1:
                        Intent intent = new Intent(halaman4.this, MUDAH1.class);
                        startActivity(intent);
                        break;
                }

            }
        });

        pindah = (Button) findViewById(R.id.open1);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(halaman4.this, "LEVEL IS OPEN",Toast.LENGTH_SHORT).show();

                switch (view.getId()) {
                    case R.id.open1:
                        Intent intent = new Intent(halaman4.this, SEDANG2.class);
                        startActivity(intent);
                        break;

                }

            }
        });

        pindah = (Button) findViewById(R.id.open2);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(halaman4.this, "LEVEL IS OPEN",Toast.LENGTH_SHORT).show();
                switch (view.getId()) {
                    case R.id.open2:
                        Intent intent = new Intent(halaman4.this, SEDANG1.class);
                        startActivity(intent);
                        break;

                }

            }

        });
        pindah = (Button) findViewById(R.id.open3);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(halaman4.this, "LEVEL IS OPEN",Toast.LENGTH_SHORT).show();
                switch (view.getId()) {
                    case R.id.open3:
                        Intent intent = new Intent(halaman4.this, SULIT.class);
                        startActivity(intent);
                        break;

                }


            }

        });

        pindah = (Button) findViewById(R.id.open4);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(halaman4.this, "LEVEL IS OPEN",Toast.LENGTH_SHORT).show();
                switch (view.getId()) {
                    case R.id.open4:
                        Intent intent = new Intent(halaman4.this, EXPERT.class);
                        startActivity(intent);
                        break;
                }

            }

        });

    }
}

