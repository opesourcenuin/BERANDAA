package com.example.uas_pplos_anandaasaabdulfatah_1930803035;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


    }

    public void motor(View view) {
        Intent motorr = new Intent(Menu.this,listtt.class);
        startActivity(motorr);
    }

    public void ext(View view) {
        finishAffinity();

    }

    public void tambah(View view) {
        Intent tmbh = new Intent(Menu.this,tambahkanmotor.class);
        startActivity(tmbh);
    }

    public void info(View view) {
        Intent ig = new Intent (Menu.this,info.class);
        startActivity(ig);
    }
}