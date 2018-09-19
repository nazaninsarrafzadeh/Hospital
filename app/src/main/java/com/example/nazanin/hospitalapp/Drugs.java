package com.example.nazanin.hospitalapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;



public class Drugs extends Fragment {



    Button btnShayee, btnTerali;

    public static Drugs newInstance() {
        Drugs fragment = new Drugs();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_drugs, container, false);

        btnShayee = v.findViewById(R.id.btnShayee);
        btnTerali = v.findViewById(R.id.btnTerali);

        btnTerali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction().addToBackStack(null);
                DrugsList fragment = new DrugsList();
                transaction.replace(R.id.frame_layout, fragment);
                transaction.commit();
            }
        });

        btnShayee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                DrugsList fragment = new DrugsList();
                transaction.replace(R.id.frame_layout, fragment);
                transaction.commit();
            }
        });

        return v;
    }

}

