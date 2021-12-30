package com.example.uas_pplos_anandaasaabdulfatah_1930803035;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Objects;

public class tambahkanmotor extends AppCompatActivity {

    EditText motor;
    EditText harga;

    Button prosees;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambahkanmenu);


        motor=(EditText) findViewById(R.id.motor);
        harga = (EditText) findViewById(R.id.harga);
        prosees = (Button) findViewById(R.id.simpan);

        prosees.setOnClickListener(v -> {
            Intent intent = new Intent(tambahkanmotor.this, transaksimotor.class);
            intent.putExtra("id", Objects.requireNonNull(motor.getText()).toString());
            intent.putExtra("nama", Objects.requireNonNull(harga.getText()).toString());
            startActivity(intent);
        });

    }


    public void kembali(View view) {
        Intent kbl = new Intent(tambahkanmotor.this,Menu.class);
        startActivity(kbl);
    }


    public void lewati(View view) {
        Intent lkembali = new Intent (tambahkanmotor.this,Menu.class);
        startActivity(lkembali);
    }


    public void pp(View view) {
        Intent pp = new Intent(tambahkanmotor.this,Menu.class);
    }
}