package com.example.uas_pplos_anandaasaabdulfatah_1930803035;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class kopi5 extends AppCompatActivity {

    TextView des;
    TextView mtr;
    TextView harga;
    Button prosees;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kopi5);

        prosees = (Button) findViewById(R.id.simpan);
        des = (TextView) findViewById(R.id.motRRR);
        harga = (TextView) findViewById(R.id.motor);
        mtr = (TextView) findViewById(R.id.harga);


        prosees.setOnClickListener(v -> {
            Intent intent = new Intent(kopi5.this, selesai1.class);
            intent.putExtra("des", Objects.requireNonNull(des.getText()).toString());
            intent.putExtra("harga", Objects.requireNonNull(harga.getText()).toString());
            intent.putExtra("mtr", Objects.requireNonNull(mtr.getText()).toString());
            startActivity(intent);

        });
    }

    public void ab(View view) {
        Intent ah = new Intent(kopi5.this, Menu.class);
        startActivity(ah);
    }
}