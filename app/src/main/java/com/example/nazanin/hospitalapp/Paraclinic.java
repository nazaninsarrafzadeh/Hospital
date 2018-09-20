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

import com.example.nazanin.hospitalapp.Illness.InfoIllness;


public class Paraclinic extends Fragment implements View.OnClickListener {

    private Button navarMaghz,echo,azmayeshgah,varzesh,vep,sonography,andoskopy,nazrAzole,ctscan,radiology,ercp;

    public static Paraclinic newInstance() {
        Paraclinic fragment = new Paraclinic();
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
        View v= inflater.inflate(R.layout.fragment_paraclinic, container, false);
         navarMaghz= v.findViewById(R.id.navarMaghz);
        echo = v.findViewById(R.id.echo);
        azmayeshgah= v.findViewById(R.id.azmayeshgah);
        varzesh = v.findViewById(R.id.varzesh);
        vep = v.findViewById(R.id.vep);
        sonography = v.findViewById(R.id.sonography);
        andoskopy = v.findViewById(R.id.andoskopi);
        nazrAzole= v.findViewById(R.id.navarAzole);
        radiology = v.findViewById(R.id.radiology);
        ctscan=v.findViewById(R.id.ctscan);
        ercp=v.findViewById(R.id.ercp);
        navarMaghz.setOnClickListener(this);
        nazrAzole.setOnClickListener(this);
        vep.setOnClickListener(this);
        ercp.setOnClickListener(this);
        radiology.setOnClickListener(this);
        sonography.setOnClickListener(this);
        echo.setOnClickListener(this);
        varzesh.setOnClickListener(this);
        andoskopy.setOnClickListener(this);
        azmayeshgah.setOnClickListener(this);
        ctscan.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.navarMaghz:
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                ParaclinicDetailsFragment fragment = new ParaclinicDetailsFragment();
                fragment.SetTitle("نوار مغز");
                fragment.SetBody("آمادگی لازم :\n" +
                        "•\tشستشوی سر و تمیز بودن پوست سر ترجیحا از شب قبل\n" +
                        "•\tخشک بودن موها\n" +
                        "•\tخارج کردن گوشواره ها و وسایل فلزی\n" +
                        "•\tدر صورت stable  بودن عدم مصرف مصرف قهوه، چای، شکلات، نوشابه، مسکن از 24 ساعت قبل مصرف نکند\n" +
                        "•\tبه هیچ عنوان NPO نباشد\n" +
                        "•\tخاموش کردن موبایل\n" +
                        "•\tغذای بیمار حذف نمی گردد چون اختلال در سطح قند خون می توان سبب تغییر الگوهای امواج مغزی گردد \n" +
                        "•\t24 تا 48 ساعت قبل از انجام نوار مغز مسکن استفاده نکنید .\n" +
                        "•\tشب قبل از انجام نوار مغز بیدار خوابی داشته باشید و چندین ساعت نخوابید و در شرایط کم خوابی برای انجام نوار مغز مراجعه کنید .\n" +
                        "نحوه انجام نوار مغز:\n" +
                        "در حالیکه بیمار نشسته یا بر روی تخت دراز کشیده و هر دوچشم خود را کاملاً ببندد . در حین انجام نوار باید آرامش خود را حفظ کرده پلک نزنید از کنار بیمار رد نشوید آب دهان را به زور قورت ندهید و تعریق بیمار ممکن است باعث جداشدن الکترودها شود . پرستار الکترودهای کوچکی را با ژل به سر بیمار متصل می کند .\n" +
                        "اگر چه برای انجام تست نوار مغز نیازی به تراشیدن موی سر نیست ولی سر باید کاملاً تمیز باشد  و محلی که الکترود قرار می گیرد از هرگونه چربی اضافه پاک باشد .\n" +
                        "ممکن است از ژل مخصوص (TN20) در محل اتصال الکترودها استفاده شود ( این ژل به صورت جامد می باشد و بعد از انجام نوار مغز باید سر بیمار با آب گرم شسته شود )تا این امواج به راحتی بتوانند دریافت شوند . پس از دریافت امواج تقویت شده و بروی کاغذ ثبت می شود. با بررسی این امواج توسط پزشک طبیعی و یا غیر طبیعی بودن آنرا گزارش می کند .\n" +
                        "در هنگام انجام نوار مغز ، پرستار ممکن است از شما بخواهد چشم های خود را باز یا بسته کنید و یا اینکه به سرعت نفس بکشید و یا تنفس عمیق انجام دهید ، \n" +
                        "در مواردی که نوار مغز برای کودکان و نوزادان انجام می شود . گاهی نیاز است که به دستور پزشک برای کودک دارو (شربت کلرهیدرات ) تجویز شود که صبح روز انجام تست در واحد نوار مغز به کودک شما داده می شود . تا حین انجام نوار مغز کاملاً خواب باشد ، ( بسیاری از موارد غیر طبیعی امواج مغزی تنها وقتی که بیمار در خواب است دیده می شود. در صورت همکاری کامل بیمار زمان انجام تست حدود 40 تا 60 دقیقه می باشد .\n" +
                        "\n" +
                        "اتاق باید کاملا ساکت و بدون صدا و دور از تحریک باشد. بیمار روی تخت چوبی دراز کشیده لیدهای مربوطه به سروگوش و دست متصل می شود و بیمار چشمانش را می بندد( در بیماران اورینته)ولی در بیماران دیس اورینته باید sadate ( سدیت) باشد و در سه مرحله با چشمان بسته اخذ می گردد و سپس مرحله تحریک نوری بوده که با چشمان یاز انجام می شود سپس چشمانش بسته و H.V و Status داریم سپس مرحله چشمان باز انجام می شود، در بیماران که بیهوش یا خواب می باشند 3 مرحله اول انجام می شود. تایم اخذ نوارمغز 20-30 دقیقه می باشد.\n");
                transaction.replace(R.id.frame_layout, fragment);
                transaction.addToBackStack(null);
                transaction.commit();
                break;
            case R.id.navarAzole:
                FragmentTransaction transactionNavarAzole = getFragmentManager().beginTransaction();
                ParaclinicDetailsFragment fragmentNavarAzole = new ParaclinicDetailsFragment();
                fragmentNavarAzole.SetTitle("نوار مغز");
                fragmentNavarAzole.SetBody("");
                transactionNavarAzole.replace(R.id.frame_layout, fragmentNavarAzole);
                transactionNavarAzole.addToBackStack(null);
                transactionNavarAzole.commit();
                break;
            case R.id.varzesh:
                FragmentTransaction transactionVarzesh = getFragmentManager().beginTransaction();
                ParaclinicDetailsFragment fragmentVarzesh  = new ParaclinicDetailsFragment();
                fragmentVarzesh .SetTitle("نوار مغز");
                fragmentVarzesh .SetBody("");
                transactionVarzesh .replace(R.id.frame_layout, fragmentVarzesh );
                transactionVarzesh .addToBackStack(null);
                transactionVarzesh .commit();
                break;
            case R.id.vep:
                FragmentTransaction transactionVep = getFragmentManager().beginTransaction();
                ParaclinicDetailsFragment fragmentVep = new ParaclinicDetailsFragment();
                fragmentVep.SetTitle("نوار مغز");
                fragmentVep.SetBody("");
                transactionVep.replace(R.id.frame_layout, fragmentVep);
                transactionVep.addToBackStack(null);
                transactionVep.commit();
                break;
            case R.id.echo:
                FragmentTransaction transactionEcho = getFragmentManager().beginTransaction();
                ParaclinicDetailsFragment fragmentEcho = new ParaclinicDetailsFragment();
                fragmentEcho.SetTitle("نوار مغز");
                fragmentEcho.SetBody("");
                transactionEcho.replace(R.id.frame_layout, fragmentEcho);
                transactionEcho.addToBackStack(null);
                transactionEcho.commit();
                break;
            case R.id.radiology:
                FragmentTransaction transactionRadio = getFragmentManager().beginTransaction();
                ParaclinicDetailsFragment fragmentRadio = new ParaclinicDetailsFragment();
                fragmentRadio.SetTitle("نوار مغز");
                fragmentRadio.SetBody("");
                transactionRadio.replace(R.id.frame_layout, fragmentRadio);
                transactionRadio.addToBackStack(null);
                transactionRadio.commit();
                break;
            case R.id.sonography:
                FragmentTransaction transactionSono = getFragmentManager().beginTransaction();
                ParaclinicDetailsFragment fragmentSono = new ParaclinicDetailsFragment();
                fragmentSono.SetTitle("نوار مغز");
                fragmentSono.SetBody("");
                transactionSono.replace(R.id.frame_layout, fragmentSono);
                transactionSono.addToBackStack(null);
                transactionSono.commit();
                break;
            case R.id.andoskopi:
                FragmentTransaction transactionAndoskopi = getFragmentManager().beginTransaction();
                ParaclinicDetailsFragment fragmentAndoskopi = new ParaclinicDetailsFragment();
                fragmentAndoskopi.SetTitle("نوار مغز");
                fragmentAndoskopi.SetBody("");
                transactionAndoskopi.replace(R.id.frame_layout, fragmentAndoskopi);
                transactionAndoskopi.addToBackStack(null);
                transactionAndoskopi.commit();
                break;
            case R.id.ctscan:
                FragmentTransaction transactionCt = getFragmentManager().beginTransaction();
                ParaclinicDetailsFragment fragmentCt = new ParaclinicDetailsFragment();
                fragmentCt.SetTitle("نوار مغز");
                fragmentCt.SetBody("");
                transactionCt.replace(R.id.frame_layout, fragmentCt);
                transactionCt.addToBackStack(null);
                transactionCt.commit();
                break;
            case R.id.ercp:
                FragmentTransaction transactionErcp = getFragmentManager().beginTransaction();
                ParaclinicDetailsFragment fragmentErcp = new ParaclinicDetailsFragment();
                fragmentErcp.SetTitle("نوار مغز");
                fragmentErcp.SetBody("");
                transactionErcp.replace(R.id.frame_layout, fragmentErcp);
                transactionErcp.addToBackStack(null);
                transactionErcp.commit();
                break;
            case R.id.azmayeshgah:
                FragmentTransaction transactionAz = getFragmentManager().beginTransaction();
                ParaclinicDetailsFragment fragmentAz = new ParaclinicDetailsFragment();
                fragmentAz.SetTitle("نوار مغز");
                fragmentAz.SetBody("");
                transactionAz.replace(R.id.frame_layout, fragmentAz);
                transactionAz.addToBackStack(null);
                transactionAz.commit();
                break;
        }
    }
}
