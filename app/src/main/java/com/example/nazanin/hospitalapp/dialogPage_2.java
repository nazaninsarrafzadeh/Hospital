package com.example.nazanin.hospitalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class dialogPage_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_page_2);
        Intent intent = getIntent();

        String val = intent.getStringExtra("value");
        String sheklDrug = intent.getStringExtra("Tf1");
        String bakhsh = intent.getStringExtra("Tf2");
        String asar = intent.getStringExtra("Tf3");
        String zaman = intent.getStringExtra("Tf4");
        String nokat = intent.getStringExtra("Tf5");




        TextView tv = (TextView)findViewById(R.id.tf);
        tv.setText(val);

        TextView tv1 = findViewById(R.id.tf1);
        tv1.setText(sheklDrug);

        TextView tv2 = findViewById(R.id.tf2);
        tv2.setText(bakhsh);

        TextView tv3 = findViewById(R.id.tf3);
        tv3.setText(asar);

        TextView tv4 = findViewById(R.id.tf4);
        tv4.setText(zaman);

        TextView tv5 = findViewById(R.id.tf5);
        tv5.setText(nokat);


        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.9),(int)(height*.8));
    }
}
