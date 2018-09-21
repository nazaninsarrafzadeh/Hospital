package com.example.nazanin.hospitalapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



/**
 * A simple {@link Fragment} subclass.
 */
public class ParaclinicDetailsFragment extends Fragment {

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

    private Paraclinic paraclinic;
    public TextView strLblTitle;
    public TextView strLblBody;

    public ParaclinicDetailsFragment() {
        // Required empty public constructor
    }

    public static ParaclinicDetailsFragment newInstance(String param1, String param2) {
        ParaclinicDetailsFragment fragment = new ParaclinicDetailsFragment();


        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
        paraclinic=new Paraclinic();
        transaction.commit();

        View v= inflater.inflate(R.layout.fragment_illness_info, container, false);
        strLblBody = (TextView) v.findViewById(R.id.lblBody);
        strLblTitle = (TextView) v.findViewById(R.id.lblTitle);
        strLblBody.setText(GetBody());
        strLblTitle.setText(GetTitle());
        showBackButton();
        return v;
    }

    public void showBackButton() {
        if (getActivity() instanceof MainActivity) {
            ((MainActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

}
