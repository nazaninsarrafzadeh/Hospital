package com.example.nazanin.hospitalapp.Illness;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.nazanin.hospitalapp.R;


public class Illnesses extends Fragment {

    private ListView illnesses;
    private String[] list={"اورژانس","چشم","داخلی","عفونی","فوق تخصص","قلب","نورولوژی","CCU","ICU"};
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
        illnesses=v.findViewById(R.id.illnesses);
        ArrayAdapter<String> adapter=new ArrayAdapter<>(getContext(),R.layout.list_textview,list);
        illnesses.setAdapter(adapter);
        illnesses.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {

                    case 0:

                        FragmentTransaction transaction = getFragmentManager().beginTransaction();
                        IllnessOrjans fragment = new IllnessOrjans();
                        transaction.replace(R.id.frame_layout, fragment);
                        transaction.addToBackStack(null);
                        transaction.commit();
                        break;


                    case 1:

                        FragmentTransaction transaction1 = getFragmentManager().beginTransaction();
                        IllnessEye fragment1 = new IllnessEye();
                        transaction1.replace(R.id.frame_layout, fragment1);
                        transaction1.addToBackStack(null);
                        transaction1.commit();
                        break;


                    case 2:
                        FragmentTransaction transaction2 = getFragmentManager().beginTransaction();
                        IllnessDakheli fragment2 = new IllnessDakheli();
                        transaction2.replace(R.id.frame_layout, fragment2);
                        transaction2.addToBackStack(null);
                        transaction2.commit();
                        break;


                    case 3:
                        FragmentTransaction transaction3 = getFragmentManager().beginTransaction();
                        IllnessOfuni fragment3 = new IllnessOfuni();
                        transaction3.replace(R.id.frame_layout, fragment3);
                        transaction3.addToBackStack(null);
                        transaction3.commit();
                        break;


                    case 4:
                        FragmentTransaction transaction4 = getFragmentManager().beginTransaction();
                        IllnessFogh fragment4 = new IllnessFogh();
                        transaction4.replace(R.id.frame_layout, fragment4);
                        transaction4.addToBackStack(null);
                        transaction4.commit();
                        break;


                    case 5:
                        FragmentTransaction transaction5 = getFragmentManager().beginTransaction();
                        IllnessGhalb fragment5 = new IllnessGhalb();
                        transaction5.replace(R.id.frame_layout, fragment5);
                        transaction5.addToBackStack(null);
                        transaction5.commit();
                        break;


                    case 6:

                        FragmentTransaction transaction6 = getFragmentManager().beginTransaction();
                        IllnessNorology fragment6 = new IllnessNorology();
                        transaction6.replace(R.id.frame_layout, fragment6);
                        transaction6.addToBackStack(null);
                        transaction6.commit();
                        break;

                    case 7:
                        FragmentTransaction transaction7 = getFragmentManager().beginTransaction();
                        IllnessCCU fragment7 = new IllnessCCU();
                        transaction7.replace(R.id.frame_layout, fragment7);
                        transaction7.addToBackStack(null);
                        transaction7.commit();
                        break;

                    case 8:
                        FragmentTransaction transaction8 = getFragmentManager().beginTransaction();
                        IllnessICU fragment8 = new IllnessICU();
                        transaction8.replace(R.id.frame_layout, fragment8);
                        transaction8.addToBackStack(null);
                        transaction8.commit();
                        break;

                }



            }



        });
        return v;
    }
}