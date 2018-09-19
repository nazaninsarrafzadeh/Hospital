package com.example.nazanin.hospitalapp.Illness;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.nazanin.hospitalapp.R;


public class InfoIllness extends Fragment {


    String _strT;
    String _strB;

    public String GetTitle()
    {
        return this._strT;
    }

    public void SetTitle(String para)
    {
        this._strT = para;
    }

    public String GetBody()
    {
        return this._strB;
    }

    public void SetBody(String para)
    {
        this._strB = para;
    }

    IllnessOrjans illnessOrjansFragment;
    public TextView strLblTitle;
    public TextView strLblBody;

    public static InfoIllness newInstance(String param1, String param2) {
        InfoIllness fragment = new InfoIllness();


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
        illnessOrjansFragment = new IllnessOrjans();

        View v= inflater.inflate(R.layout.fragment_illness_info, container, false);
       strLblBody = (TextView) v.findViewById(R.id.lblBody);
       strLblTitle = (TextView) v.findViewById(R.id.lblTitle);
       strLblBody.setText(GetBody());
       strLblTitle.setText(GetTitle());
        return v;
    }

}
