package com.example.nazanin.hospitalapp;


import android.app.FragmentManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.nazanin.hospitalapp.Illness.Illnesses;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainActivity extends AppCompatActivity{

    private Toolbar toolbar;
    private ImageButton backButton;

    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView =
                findViewById(R.id.navigation);
        toolbar=findViewById(R.id.home_toolbar);
        backButton=findViewById(R.id.backButton);
        backButton.setVisibility(View.INVISIBLE);

        //disable app name
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setTitle("داروها");

        bottomNavigationView.setOnNavigationItemSelectedListener
                (new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        Fragment selectedFragment = null;
                        switch (item.getItemId()) {

                case R.id.navigation_drugs:
                    toolbar.setTitle("داروها");
                    selectedFragment = Drugs.newInstance();
                    break;

                case R.id.navigation_illness:
                    toolbar.setTitle("بیماری ها");
                    selectedFragment = Illnesses.newInstance();
                    break;
                case R.id.navigation_rig:
                    toolbar.setTitle("تجهیزات");
                    selectedFragment = Rigs.newInstance();
                    break;

                case R.id.navigation_paraclinic:
                    toolbar.setTitle("پاراکلینیکی");
                    selectedFragment= Paraclinic.newInstance();
                    break;
                case R.id.navigation_info:
                    toolbar.setTitle("درباره ما");
                    selectedFragment = AboutUs.newInstance();
                    break;
                        }
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.frame_layout, selectedFragment);
                        transaction.commit();
                        return true;
                    }
                });


        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout, Drugs.newInstance());
        transaction.commit();


    }

    boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "برای خروج دوباره کلیک کنید", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }



}
