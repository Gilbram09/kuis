package com.example.kuis.sedanglv1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.kuis.R;

public class SEDANG2 extends AppCompatActivity {

    AlertDialog.Builder builder;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sedang2);

        radioGroup = (RadioGroup) findViewById(R.id.RadioA1);
    }


    public void onRadioButton(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {

            case R.id.RadioB1:
                if (checked)
                    jawabansalah();
                break;

            case R.id.RadioB2:
                if (checked)
                    tampildialog();
                break;


            case R.id.RadioB3:
                if (checked)
                    jawabansalah();
                break;


            case R.id.RadioB4:
                if (checked)
                    jawabansalah();
                break;

        }

    }


    public void tampildialog() {


        builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setTitle("Selamat!!!");
        builder.setMessage("jawaban anda benar : -4");
        builder.setPositiveButton("Lanjutkan", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent jancuk = new Intent(SEDANG2.this, SEDANG22.class);
                startActivity(jancuk);
                Toast.makeText(SEDANG2.this, "Lanjutkan",Toast.LENGTH_SHORT).show();

            }
        });

        builder.setNegativeButton("Ulang", new DialogInterface.OnClickListener(){

            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                radioGroup.clearCheck();
            }
        });

        builder.create().show();

    }

    public void jawabansalah(){

        Toast.makeText(this,"JAWABAN ANDA SALAH",Toast.LENGTH_SHORT).show();
    }
}
