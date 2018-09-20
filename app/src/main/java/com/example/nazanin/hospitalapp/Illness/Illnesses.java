package com.example.nazanin.hospitalapp.Illness;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.nazanin.hospitalapp.R;


public class Illnesses extends Fragment {

    Button orjans_btn, cheshm_btn, dakheli_btn, ofuni_btn, fogh_btn, ghalb_btn, norology_btn, ccu_btn, icu_btn;

    public static Illnesses newInstance() {
        Illnesses fragment = new Illnesses();
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
        View v = inflater.inflate(R.layout.fragment_illnesses, container, false);

        orjans_btn = v.findViewById(R.id.btn_orjans);
        cheshm_btn = v.findViewById(R.id.btn_cheshm);
        dakheli_btn = v.findViewById(R.id.btn_dakheli);
        ofuni_btn = v.findViewById(R.id.btn_ofuni);
        fogh_btn = v.findViewById(R.id.btn_fogh);
        ghalb_btn = v.findViewById(R.id.btn_ghalb);
        norology_btn = v.findViewById(R.id.btn_norologi);
        ccu_btn = v.findViewById(R.id.btn_ccu);
        icu_btn = v.findViewById(R.id.btn_icu);

        orjans_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                IllnessOrjans fragment = new IllnessOrjans();
                transaction.replace(R.id.frame_layout, fragment);
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });

        cheshm_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                IllnessEye fragment = new IllnessEye();
                transaction.replace(R.id.frame_layout, fragment);
                transaction.commit();

            }
        });

        dakheli_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                IllnessDakheli fragment = new IllnessDakheli();
                transaction.replace(R.id.frame_layout, fragment);
                transaction.commit();

            }
        });

        ofuni_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                IllnessOfuni fragment = new IllnessOfuni();
                transaction.replace(R.id.frame_layout, fragment);
                transaction.commit();

            }
        });

        fogh_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                IllnessFogh fragment = new IllnessFogh();
                transaction.replace(R.id.frame_layout, fragment);
                transaction.commit();

            }
        });

        ghalb_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                IllnessGhalb fragment = new IllnessGhalb();
                transaction.replace(R.id.frame_layout, fragment);
                transaction.commit();

            }
        });

        norology_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                IllnessNorology fragment = new IllnessNorology();
                transaction.replace(R.id.frame_layout, fragment);
                transaction.commit();

            }
        });

        ccu_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                IllnessCCU fragment = new IllnessCCU();
                transaction.replace(R.id.frame_layout, fragment);
                transaction.commit();

            }
        });

        icu_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                IllnessICU fragment = new IllnessICU();
                transaction.replace(R.id.frame_layout, fragment);
                transaction.commit();

            }
        });








        return v;
    }


}
