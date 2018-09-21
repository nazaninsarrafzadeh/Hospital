package com.example.nazanin.hospitalapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class AboutUs extends Fragment {


    String text;

    public void SetTitle(String para)
    {
        this.text = para;
    }
    public TextView tvAbtUs;


    public static AboutUs newInstance() {
        AboutUs fragment = new AboutUs();

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
        View v= inflater.inflate(R.layout.fragment_about_us, container, false);
        tvAbtUs = v.findViewById(R.id.textAbtUs);
        tvAbtUs.setText("این نرم افزار در راستای آموزش پرسنل پرستاری و هم چنین آموزش به بیماران مراجعه کننده به بیمارستان ها و سنجه های اعتبار بخشی معاونت درمان و آموزش پزشکی در سال ۱۳۹۷ تهیه شد.\n" +
                "این نرم افزار توسط مرکز آموزشی، پژوهشی و درمانی امام حسن(ع) بجنورد جهت پرسنل پرستاری و بخش های بالینی ارائه گردیده است. \n" +
                "\n" +
                "این نرم افزار به همت \n" +
                "دکتر فاطمه خراشادی زاده\n" +
                "دکتر رامین حقیقی\n" +
                "سالارپوربرات\n" +
                "دکتر محمد باقر اوغازیان\n" +
                "دکتر حبیبه سادات شاکری\n" +
                "دکتر امیرعلی قهرمانی\n" +
                "زهرا جوانوش\n" +
                "لاله زار حسین زاده\n" +
                "نازنین صراف زاده قدیمی\n" +
                "سیده فاطمه میراشرفی\n" +
                "تهیه شده است\n" +
                "\n" +
                "باتشکر\n");
        return v;
    }

}
