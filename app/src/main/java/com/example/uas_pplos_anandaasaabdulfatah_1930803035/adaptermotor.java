package com.example.uas_pplos_anandaasaabdulfatah_1930803035;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adaptermotor  extends ArrayAdapter {

    private int[] Icon;
    private String[] Headline;
    private String[] Subhead;
    private Context context;

    adaptermotor(@NonNull Context context, int[] icon, String[] headline, String[] subhead) {
        super(context, R.layout.cardmotor, headline);
        this.Icon = icon;
        this.Headline = headline;
        this.Subhead = subhead;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.cardmotor, null, true);
        ImageView icon = view.findViewById(R.id.imageList);
        TextView headline = view.findViewById(R.id.text_headline);
        TextView subhead = view.findViewById(R.id.text_subhead);

        icon.setImageResource(Icon[position]);
        headline.setText(Headline[position]);
        subhead.setText(Subhead[position]);
        return view;
    }


    }

