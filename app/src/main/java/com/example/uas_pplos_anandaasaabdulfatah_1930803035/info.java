package com.example.uas_pplos_anandaasaabdulfatah_1930803035;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class info extends AppCompatActivity {


        ListView lv;

        int[] iconList = new int[]{
                R.mipmap.kentang_foreground, R.mipmap.sosis_foreground, R.mipmap.ramenn_foreground,
                R.mipmap.milkshake_foreground, R.mipmap.v60_foreground,
                R.mipmap.latte_foreground
        };

        String[] Headline = {"Kentang", "Sosis", "Ramen", "MilkShake", "V60", "Latte"
        };

        String[] Subhead = {"Rp.15.000", "Rp.18.000", "Rp.22.000", "Rp.18.000 - Rp.20.000", "Rp.20.000 - Rp.25.000", "Rp.20.000 - Rp.25.000"
        };
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_info);


            lv = findViewById(R.id.iii);
            adaptermotor adaptermotor = new adaptermotor(this, iconList, Headline, Subhead);
            lv.setAdapter(adaptermotor);
            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    if (position == 0) {
                        Intent intent = new Intent(view.getContext(), akhir.class);

                        startActivityForResult(intent, 0);
                    }

                    //Position 1 is Twitter

                    if (position == 1) {
                        Intent intent = new Intent(view.getContext(), akhir2.class);


                        startActivityForResult(intent, 0);
                    }

                    if (position == 2) {
                        Intent intent = new Intent(view.getContext(), akhir3.class);
                        startActivityForResult(intent, 0);
                    }

                    if (position == 3) {
                        Intent intent = new Intent(view.getContext(), akhir4.class);
                        startActivityForResult(intent, 0);
                    }

                    if (position == 4) {
                        Intent intent = new Intent(view.getContext(), akhir5.class);
                        startActivityForResult(intent, 0);
                    }

                    if (position == 5) {
                        Intent intent = new Intent(view.getContext(), akhir6.class);
                        startActivityForResult(intent, 0);
                    }





                    //Do the same thing next time

                    Toast.makeText(getApplicationContext(),
                            "You have selected : " + Headline[position],
                            Toast.LENGTH_SHORT).show();

                }
            });

        }




    public void oke(View view) {

        Intent ok = new Intent(info.this, Menu.class);
        startActivity(ok);
    }



    public void sss(View view) {
            Intent ss= new Intent(info.this,Menu.class);
            startActivity(ss);
    }
}