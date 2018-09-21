package com.example.nazanin.hospitalapp;


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


/**
 * A simple {@link Fragment} subclass.
 */
public class ZollHeadersFragment extends Fragment {

    private ListView headers;
    private String[] listHeaders={"نکات ایمنی","معرفی کلیدها","دفیبریلاستیون","پیس میکروفونت","مانیتورینگ","نگهداری","باطری"};

    public ZollHeadersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_zoll_headers, container, false);
        headers=view.findViewById(R.id.zollHeaders);
        ArrayAdapter<String> adapter=new ArrayAdapter<>(getContext(), R.layout.list_textview,listHeaders);
        headers.setAdapter(adapter);
        headers.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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
        return view;
    }

    public void showBackButton() {
        if (getActivity() instanceof MainActivity) {
            ((MainActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

}
