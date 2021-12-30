package com.example.uas_pplos_anandaasaabdulfatah_1930803035;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class selesai1 extends AppCompatActivity {
    TextView ids;
    TextView hrg;
    TextView hrsg;
    Button pesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selesai1);


        ids = (TextView) findViewById(R.id.mo);
        hrg = (TextView) findViewById(R.id.motoX);
        hrsg = (TextView) findViewById(R.id.h);
        pesan = (Button) findViewById(R.id.simpan);

        ids.setText(getIntent().getStringExtra("des"));
        hrg.setText(getIntent().getStringExtra("harga"));
        hrsg.setText(getIntent().getStringExtra("mtr"));


    }


    public void pesan(View view) {
        Intent psn = new Intent(selesai1.this,Menu.class);
        startActivity(psn);

            Toast.makeText(getApplicationContext(),
                    "PESAN DITERIMA HARAP DI TUNGGU ",
                    Toast.LENGTH_SHORT).show();
        }


    public void yy(View view) {
        Intent yy = new Intent(selesai1.this,Menu.class);
        startActivity(yy);
    }
}

