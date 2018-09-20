package com.example.nazanin.hospitalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

public class dialogPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_page);

        Intent intent = getIntent();
        String val = intent.getStringExtra("value");
        String dasteDrug = intent.getStringExtra("Tf1");
        String shekl = intent.getStringExtra("Tf2");
        String antiDut = intent.getStringExtra("Tf3");
        String mecanism = intent.getStringExtra("Tf4");
        String andicasion = intent.getStringExtra("Tf5");
        String doz = intent.getStringExtra("Tf6");
        String contra = intent.getStringExtra("Tf7");
        String avarez = intent.getStringExtra("Tf8");
        String eghdamat = intent.getStringExtra("Tf9");



        TextView tv = (TextView)findViewById(R.id.tv);
        tv.setText(val);

        TextView tv1 = findViewById(R.id.tv1);
        tv1.setText(dasteDrug);

        TextView tv2 = findViewById(R.id.tv2);
        tv2.setText(shekl);

        TextView tv3 = findViewById(R.id.tv3);
        tv3.setText(antiDut);

        TextView tv4 = findViewById(R.id.tv4);
        tv4.setText(mecanism);

        TextView tv5 = findViewById(R.id.tv5);
        tv5.setText(andicasion);

        TextView tv6 = findViewById(R.id.tv6);
        tv6.setText(doz);

        TextView tv7 = findViewById(R.id.tv7);
        tv7.setText(contra);

        TextView tv8 = findViewById(R.id.tv8);
        tv8.setText(avarez);

        TextView tv9 = findViewById(R.id.tv9);
        tv9.setText(eghdamat);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.9),(int)(height*.8));
    }
}
