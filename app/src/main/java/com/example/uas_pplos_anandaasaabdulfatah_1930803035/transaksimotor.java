package com.example.uas_pplos_anandaasaabdulfatah_1930803035;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class transaksimotor extends AppCompatActivity {


    TextView ids;
    TextView nma;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaksikopi);

        ids = (TextView) findViewById(R.id.motorR);
        nma = (TextView) findViewById(R.id.harga);


        ids.setText(getIntent().getStringExtra("id"));
        nma.setText(getIntent().getStringExtra("nama"));


    }


    public void awal(View view) {
        Intent awl = new Intent(transaksimotor.this, tambahkanmotor.class
        );
        startActivity(awl);
    }

    public void ok(View view) {
        Intent ok = new Intent(transaksimotor.this, Menu.class);
        startActivity(ok);
    }


    public void ll(View view) {

        Intent sss = new Intent(transaksimotor.this, Menu.class);
        startActivity(sss);
        Toast.makeText(getApplicationContext()
                , "Data telah disimpan", Toast.LENGTH_SHORT).show();
    }

    public void lo(View view) {
        Intent lo = new Intent(transaksimotor.this,Menu.class);
        startActivity(lo);
    }
}