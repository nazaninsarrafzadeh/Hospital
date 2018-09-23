package com.example.nazanin.hospitalapp;


import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
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
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.nazanin.hospitalapp.Illness.Illnesses;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainActivity extends AppCompatActivity{


    private Toolbar toolbar;
    private TextView title;
    private android.support.v4.app.FragmentManager fm;

    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final BottomNavigationView bottomNavigationView = findViewById(R.id.navigation);
        toolbar=findViewById(R.id.home_toolbar);
        title=findViewById(R.id.title);
        fm = getSupportFragmentManager();

        //disable app name
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        if (fm.getBackStackEntryCount()>0) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        bottomNavigationView.setOnNavigationItemSelectedListener
                (new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        clearStack();
                        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
                        Fragment selectedFragment = null;
                        switch (item.getItemId()) {

                            case R.id.navigation_drugs:
                                title.setText("داروها");
                                selectedFragment = Drugs.newInstance();
                                break;

                            case R.id.navigation_illness:
                                title.setText("بیماری ها");
                                selectedFragment = Illnesses.newInstance();
                                break;
//                            case R.id.navigation_rig:
//                                toolbar.setTitle("تجهیزات");
//                                selectedFragment = Rigs.newInstance();
//                                break;

                            case R.id.navigation_paraclinic:
                                title.setText("پاراکلینیکی");
                                selectedFragment= Paraclinic.newInstance();
                                break;
                            case R.id.navigation_info:
                                title.setText("درباره ما");
                                selectedFragment = AboutUs.newInstance();
                                break;
                        }
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.frame_layout, selectedFragment);
                        transaction.commit();
                        return true;
                    }
                });

        title.setText("داروها");
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout, Drugs.newInstance());
        transaction.commit();


    }

    private void clearStack(){
        getSupportFragmentManager().popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
    }

    boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }
        clearStack();
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "برای خروج دوباره کلیک کنید", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:

                int backStackCount = fm.getBackStackEntryCount();

                if (backStackCount==1 ) {
                    fm.popBackStack();
                    getSupportActionBar().setDisplayHomeAsUpEnabled(false);
                }
                else if (backStackCount >0) {
                    fm.popBackStack();
                //    String name = getSupportFragmentManager().getBackStackEntryAt(0).getName();
                //    Toast.makeText(this,name,Toast.LENGTH_SHORT).show();
                 //   fm.beginTransaction();

                }
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

