package com.example.kuis.screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.kuis.R;
import com.example.kuis.halaman.hal1;

public class splashscreen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen2);

        final int WelcomeScreenDisplay = 3000;
        Thread WelcomeThread = new Thread() {

            int wait = 0;
            @Override
            public void run (){
                try {
                    super.run();
                    while (wait< WelcomeScreenDisplay) {
                        sleep(100);
                        wait +=100;
                    }
                } catch (Exception e) {
                    System.out.println("EXc=" + e);


                }finally {
                    Intent intent= new Intent(splashscreen2.this, hal1.class);
                    finish();
                    startActivity(intent);

                }
            }
        };
        WelcomeThread.start();
    }
}

