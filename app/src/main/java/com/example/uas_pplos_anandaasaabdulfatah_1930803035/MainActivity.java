package com.example.uas_pplos_anandaasaabdulfatah_1930803035;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    private int timer = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent waktu = new Intent(MainActivity.this, getstarted.class);
                startActivity(waktu);
                finish();

            }

        }, timer);
    }
}