package com.example.nazanin.hospitalapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Rigs extends Fragment implements View.OnClickListener {

    private Button zoll,philips;

    public static Rigs newInstance() {
        Rigs fragment = new Rigs();
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
        View view= inflater.inflate(R.layout.fragment_rigs, container, false);
        zoll=view.findViewById(R.id.btn_Zol);
        philips=view.findViewById(R.id.btn_philips);
        zoll.setOnClickListener(this);
        philips.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        FragmentTransaction transaction=getFragmentManager().beginTransaction();
        ZollHeadersFragment fragment=new ZollHeadersFragment();
        transaction.replace(R.id.frame_layout,fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
