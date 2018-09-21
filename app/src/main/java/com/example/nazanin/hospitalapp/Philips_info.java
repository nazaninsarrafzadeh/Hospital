package com.example.nazanin.hospitalapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.nazanin.hospitalapp.Illness.InfoIllness;


public class Philips_info extends Fragment {

    private ListView list;
    private static final String [] headers = {"نشانگر آماده به کار (Ready for use Indicator)" ,"آلارم ها","تست شوک هفتگی","نحوه ی شوک دادن در حالت دیفیبریلاسیون دستی","ضربانسازی غیرتهاجمی (nonInvasive Pacing)","چک عملیاتی (operational check)"};

    public Philips_info (){}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_philips_info, container, false);
        list = v.findViewById(R.id.lvPhilips);

        ArrayAdapter<String> adapter=new ArrayAdapter<>(getContext(), R.layout.list_textview,headers);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                InfoIllness fragmentInfo=new InfoIllness();


                switch (position){
                    case 0:
//                        fragmentInfo.SetTitle();
//                        fragmentInfo.SetBody();
                        transaction.replace(R.id.frame_layout, fragmentInfo);
                        break;
                    case 1:
//                        fragmentInfo.SetTitle();
//                        fragmentInfo.SetBody();
                        transaction.replace(R.id.frame_layout, fragmentInfo);
                        break;
                    case 2:

                        break;
                    case 3:
                        break;
                    case 4:
//                        fragmentInfo.SetTitle();
//                        fragmentInfo.SetBody();
                        transaction.replace(R.id.frame_layout, fragmentInfo);
                        break;
                    case 5:
//                        fragmentInfo.SetTitle();
//                        fragmentInfo.SetBody();
                        transaction.replace(R.id.frame_layout, fragmentInfo);
                        break;
                    case 6:
//                        fragmentInfo.SetTitle();
//                        fragmentInfo.SetBody();
                        transaction.replace(R.id.frame_layout, fragmentInfo);
                        break;
                }

                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
        showBackButton();
        return v;
    }
    public void showBackButton() {
        if (getActivity() instanceof MainActivity) {
            ((MainActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

}