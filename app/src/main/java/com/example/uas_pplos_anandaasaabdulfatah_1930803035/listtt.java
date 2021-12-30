package com.example.uas_pplos_anandaasaabdulfatah_1930803035;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class listtt extends AppCompatActivity {

    ListView lv;

    int[] iconList = new int[]{
            R.mipmap.arabica_foreground, R.mipmap.arabicapga_foreground, R.mipmap.pagaralam_foreground,
            R.mipmap.robusta_foreground, R.mipmap.blandkultur_foreground,
            R.mipmap.vietnam_foreground, R.mipmap.slide1_foreground
    };

    String[] Headline = {"KOPI ARABIKA", "KOPI ARABIKA PGA", "KOPI ROBUSTA PGA", "KOPI ROBUSTA", "KOPI KULTUR", "KOPI VIETNAM"
    };

    String[] Subhead = {"Rp.60.000", "Rp.80.000", "Rp.50.000","Rp.40.000", "Rp.70.000", "Rp.80.000"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listt);


        lv = findViewById(R.id.iii);
        adaptermotor adaptermotor = new adaptermotor(this, iconList, Headline, Subhead);
        lv.setAdapter(adaptermotor);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Intent intent = new Intent(view.getContext(), kopi1.class);

                    startActivityForResult(intent, 0);
                }

                //Position 1 is Twitter

                if (position == 1) {
                    Intent intent = new Intent(view.getContext(), kopi2.class);


                    startActivityForResult(intent, 0);
                }

                if (position == 2) {
                    Intent intent = new Intent(view.getContext(), kopi3.class);
                    startActivityForResult(intent, 0);
                }

                if (position == 3) {
                    Intent intent = new Intent(view.getContext(), kopi4.class);
                    startActivityForResult(intent, 0);
                }

                if (position == 4) {
                    Intent intent = new Intent(view.getContext(), kopi5.class);
                    startActivityForResult(intent, 0);
                }

                if (position == 5) {
                    Intent intent = new Intent(view.getContext(), kopi6.class);
                    startActivityForResult(intent, 0);
                }





                //Do the same thing next time

                Toast.makeText(getApplicationContext(),
                        "You have selected : " + Headline[position],
                        Toast.LENGTH_SHORT).show();

            }
        });

    }


    public void ss(View view) {
        Intent ss = new Intent(listtt.this,Menu.class);
        startActivity(ss);
    }
}
