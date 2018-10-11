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
        tvAbtUs.setText("نرم افزار پیش روی شما در راستای آموزش و ارتقاء دانش پرسنل پرستاری در حیطه پرستاری و سنجه های اعتبار بخشی معاونت درمان و آموزش پزشکی از سال ۱۳۹۷ توسط مرکز آموزشی، پژوهشی و درمانی امام حسن(ع) بجنورد ارائه گردیده است.\n" +
                "باتوجه به طیف گسترده دانش مورد نیاز پرستاران و اطلاعاتی که باید یک پرستار شاغل در بیمارستان بداند. به علت عدم وجود یک مرجع کامل جهت دسترسی سریع و راحت تر شما سفید پوشان عرصه سلامت باجمعی از همکاران برآن شدیم تا نرم افزار پرستار دانا را تهیه کنیم.\n" +
                "\n" +
                "این نرم افزار به همت:\n" +
                "دکتر فاطمه خراشادی زاده\n" +
                "دکتر رامین حقیقی\n" +
                "سالارپوربرات\n" +
                "مهدی فرح دل\n" +
                "دکتر محمد باقر اوغازیان\n" +
                "دکتر حبیبه سادات شاکری\n" +
                "دکتر امیرعلی قهرمانی\n" +
                "زهرا جوانوش\n" +
                "لاله زار حسین زاده\n" +
                "سیده فاطمه میراشرفی\n" +
                "نازنین صراف زاده\n" +
                "تهیه شده است\n" +
                "باتشکر\n" +
                "\n");
        return v;
    }

}
