package com.example.nazanin.hospitalapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.nazanin.hospitalapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RadiologyFragment extends Fragment implements View.OnClickListener {

    private Button Ct,sono;


    public RadiologyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_radiology, container, false);
        Ct=view.findViewById(R.id.btnCT);
        sono=view.findViewById(R.id.btnSono);
        Ct.setOnClickListener(this);
        sono.setOnClickListener(this);
        showBackButton();
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnSono:
                FragmentTransaction transactionSono = getFragmentManager().beginTransaction();
                ParaclinicDetailsFragment fragmentSono = new ParaclinicDetailsFragment();
                fragmentSono.SetTitle("سونوگرافی شکم و لگن");
                fragmentSono.SetBody("مكانيسم سونوگرافي چيست؟\n" +
                        " يكي از روشهاي تشخيص بيماري در پزشكي است. به اين روش اكوگرافي، پژواكنگاري و صوتنگاري نيز گفته ميشودامواج مورد استفاده در سونوگرافي از جنس امواج صوتي و در واقع صدا هستند كه ضرري براي بدن ندارد. اينها امواج فراصوتي هستند. جنس آنها دقيقا مانند صدا است ولي به علت بالا بودن فركانس يا بسامد آنها قابل شنيدن به توسط گوش انسان نيستند. سونوگرافي تفسير امواج منعكس شده از بافت هاي مختلف بدن است.\n" +
                        "آيا با انجام سونوگرافي خطري انسان را تهديد ميكند؟\n" +
                        " اين روش تشخيصي بيش از 35 سال است كه به كار برده مي شود و تاكنون هيچگونه خطري ناشي از آن به اثبات نرسيده است. با اين حال خواص صوت و صدا را دارند يعني در برخورد با موانع منعكس ميشوند .\n" +
                        "سونوگرافي چگونه انجام ميشود؟ \n" +
                        " سونوگرافي روش تصوير برداري دردناكي نيست و يك روش تشخيصي غير تهاجمي است . در حين انجام آن بيمار احساس ناراحتي نميكند . براي انجام سونوگرافي بيمار بر روي تخت دراز كشيده و پزشك متخصص سونولوژيست ژل خاصي را بر روي پوست بيمار در محل مورد بررسي قرار ميدهد.. ژل گفته شده اجازه ميدهد كه امواج فراصوتي راحت تر و به شكل يكنواخت تري به درون بدن نفوذ كنندبراي انجام سونوگرافي، پزشك سونولوژيست( متخصص تصويربرداري كه سونوگرافي ميكند) توسط يك وسيله اي بنام پروب كه روي اندام شما قرار ميدهد امواج صوتي با فركانس بالا به درون بدن تابانده ميشوند. اين امواج بعد از برخورد به بافت هاي مختلف بدن بازتابيده شده و امواج بازتابش شده به توسط همان دستگاه مجددا دريافت ميشود سونوگرافي ساده معمولا ده دقيقه زمان نياز دارد .\n" +
                        "سونوگرافي در حاملگي نيز كاربردهاي وسيعي دارد. همچنين امروزه سونوگرافي كاربردهاي درماني نيز دارد . نوشيدن مايعات قبل از انجام بعضي از سونوگرافي هاي ناحيه شكم و لگن به خاطر پر بودن مثانه حين آزمون و بهتر ديده شدن آن يا ارگانهاي مجاور آن مثل رحم مي باشد.\n" +
                        " سونوگرافي شكم ولگن \n" +
                        "اين ازمون به منظور بررسي احشا داخل حفره شكم ولگن(كليه ها ، طحال ، كبد ، كيسه صفرا ، پانكراس ، مثانه ، رحم و تخمدانها و پروستات) و بيماريهاي آنها و وجود مايع ازاد در داخل شكم يا لگن و غيره انجام ميگيرد.\n" +
                        "انجام اين سونو با تعيين وقت قبلي انجام ميگيرد لذا بيمار بايد ابتدا به بخش درا يولوژي مراجعه و برگه دستورات مربوط به آمادگي لازم را دريافت و طبق آن عمل نموده ، در زمان تعيين شده مراجعه نمايد\n" +
                        "آمادگي هاي لازم براي سونوگرافي شكم و لگن:\n" +
                        "1.\tحداقل از ۶ ساعت قبل از انجام سونوگرافي جھت بھتر ديده شدن كيسه ومجاري صفراوي چيزي ميل ننمايد\n" +
                        "2.\tشب قبل از انجام سونوگرافي ميتواند سيب زميني پخته يا مربا ويا عسل ميل نمايد\n" +
                        "3.\tهنگام انجام سونوگرافي شكم و لگن ، مثانه بيمار بايد پر باشد .\n" +
                        "در سونوگرافي بيشتر، بافت هاي نرم اندام ديده شده و بررسي ميشوند. پس سونوگرافي وسيله مناسبي براي تشخيص مشكلات استخوان نيست ولي با آن ميتوان مشكلات عضلات، رباط ها، تاندون ها و بسياري بافت هاي ديگر را بررسي كرد.\n" +
                        "نحوه نوبت دهی و جوابدهی:\n" +
                        "قبل از انجام سونوگرافی با بخش مربوطه تماس گرفته می شود. زمان را مشخص کرده سپس ازآن بخش نام بیمار و نوع سونوگرافی که برای بیمار باید انجام بگیرد را از طریق سیستم HIS  ثبت می کنند و بیمار را به همراه برگه درخواست و آمادگی های لازم به بخش سونوگرافی انتقال می دهند.\n" +
                        "بعد از انجام سونوگرافی از طریق پزشک رادیولوژیست گزارش سونوگرافی در سیستم ثبت شده و پزشک معالج از طریق سیستم می توانند ریپورت سونوگرافی بیمار را ببیند.\n");
                transactionSono.replace(R.id.frame_layout, fragmentSono);
                transactionSono.addToBackStack(null);
                transactionSono.commit();
                break;
            case R.id.btnCT:
                FragmentTransaction transactionCt = getFragmentManager().beginTransaction();
                ParaclinicDetailsFragment fragmentCt = new ParaclinicDetailsFragment();
                fragmentCt.SetTitle("سی تی اسکن");
                fragmentCt.SetBody("کاربرد \n" +
                        "  بعد از رادیوگرافی ساده ،سی تی اسکن بیشترین کمک را به بررسی بدن انسان بخصوص استخوان ها می کند . امروزه استفاده از سی تی اسکن جزء جدایی ناپذیر در تشخیص بسیاری از بیماری ها شده است . برای انجام سی تی اسکن از اشعه ایکس استفاده می شود .در این روش باریکه ی نازکی از اشعه ایکس به اندام بیمار تابانده می شود ، این تشعشع از تمامی بافت هایی که در سر راه آن قرار دارد عبور کرده و مقداری که از طرف مقابل خارج می شود به آشکار ساز برخورد کرده و تصویر را ایجاد می کند. .\n" +
                        "با توجه به موارد گفته شده گستردگی کاربرد سی تی اسکن به حدی است که امروزه این دستگاه جزء ملزومات یک بیمارستان عمومی است. . \n" +
                        "استفاده از سی تی اسکن در موارد زیر به عنوان ابزار اصلی تشخیص در پزشکی محسوب می گردد :\n" +
                        "•\tقدرت تشخیص تصاویر سی تی اسکن در خونریزی های مغزی بسیار بالاست . به طوری که در موارد اورژانس بهترین روش تشخیصی محسوب می شود .\n" +
                        "•\tسی تی اسکن می تواند به طور عام با دقت حدود 95% در تشخیص یا رد تومور مغزی مورد استفاده قرار گیرد .\n" +
                        "سی تی اسکن در تشخیص بیماری های بافت شش ها (ریه ) نیز بسیار دقیق عمل می کند\n" +
                        "اما این بدان معنا نیست که برای هر بیماری در همان ابتدای امر از سی تی اسکن استفاده شود . بلکه باید ابتدا شرح حال دقیقی از بیمار را در اختیار پزشک معالج قرار داده سپس با صلاحدید وی پس از انجام یک رادیولوژی ساده اقدام به انجام سی تی اسکن شود .\n" +
                        "•\tیکی از کاربرد های سی تی اسکن کنترل پاسخ به درمان پس از اعمال جراحی و یا سایر روش های درمانی است .\n" +
                        "•\tسی تی اسکن اسپیرال بدون ماده حاجب از شکم دقیق ترین روش برای تشخیص سنگ های کوچک حتی به اندازه ی چند میلی متر است .\n" +
                        "در انجام سی تی اسکن باید به چه نکاتی توجه کنیم ؟\n" +
                        "1-\tچون در سی تی اسکن از اشعه ایکس استفاده می شود ، قبل از انجام آزمون ، پزشک معالج شما باید در جریان باردار بودن بیمار خانم قرار بگیرد . استفاده از این روش تصویربرداری در سه ماهه اول بارداری ممکن است مشکلاتی برای جنین بوجود آورد .\n" +
                        "2-\tدر حین انجام آزمون سی تی اسکن بیمار باید کاملا بی حرکت باشد .حرکت بیمار ،باعث ایجاد تصویر نا واضح و اشکال در امر تشخیص خواهد شد .\n" +
                        "3-\tدستگاه سی تی اسکن در داخل اتاق بزرگی قرار دارد که هوای داخل آن بسیار خنک است ، با توجه به حرارت زیادی که در جریان تولید اشعه ایکس ایجاد می شود این اتاق به صورت اجباری باید خنک باشد ، در تحمل خنکی اتاق برای چند دقیقه شکیبا باشید .\n" +
                        "4-\tاین دستگاه شامل حلقه بزرگ و تختی است که درون آن قرار دارد ، در هنگام تصویربرداری منبع تولید اشعه در داخل حلقه گردش می کند . این گردش ممکن است با صدایی همراه باشد ، این صدا طبیعی است و آسیبی به بیمار نمی زند .\n" +
                        "5-\tهزینه تهیه سی تی اسکن و مدت زمان انجام آن ، هم چنین مقدار اشعه ایکسی که به بیمار تابیده می شود بیش از رادیوگرافی ساده است . پس با توجه به هزینه بالا و خطرات ناشی از اشعه باید تنها زمانی مورد استفاده قرار گیرد که اطلاعات بدست آمده از آن به تشخیص و یا درمان کمک کند .لذا لطفا از پزشکتان درخواست بی مورد این نوع تصویر برداری را نفرمایید.\n" +
                        "6-\tآزمون سی تی اسکن آزمونی بدون درد است ،و مدت زمان انجام آن تنها چند دقیقه است ،بنابراین از انجام این آزمون  \n" +
                        "7-\tلطفا در حین انجام آزمون در صورتی که کارشناس از شما در خواست کرد ، تنفس خود را برای چند لحظه نگهدارید .\n" +
                        "8-\tتزریق ماده حاجب در سی تی اسکن \n" +
                        "9-\tدر برخی آزمون ها با توجه به ماهیت و نوع کاربرد سی تی اسکن درخواست شده کارشناس باید داروی کنتراست را به درون ورید بیمار تزریق کند . مقدار ماده حاجب مورد استفاده در سی تی اسکن 1-2 سی سی به ازای هر کیلوگرم وزن بدن در بالغین و حداکثر 150 سی سی در نظر گرفته می شود . مصرف کمتر از حد ماده حاجب دقت تصویر را کم میکند و مصرف بیش از حد آن باعث آسیب جدی به بدن می شود لذا ماده حاجب باید به میزان مناسب مورد استفاده قرار گیرد.\n" +
                        "10-\tدر صورتی که سی تی اسکن شما نیاز به تزریق ماده حاجب داشت ، لطفا به نکات زیر توجه فرمایید :\n" +
                        "11-\tقبل از تزریق ماده حاجب ، عملکرد کلیه شما قطعا چک خواهد شد ، در صورتی که مقدار اوره و کراتینین خون شما از حد نصاب تعیین شده بالاتر باشد با توجه به آسیب جبران ناپذیری که این مواد می توانند به بدن شما وارد نمایند ، ممکن است این آزمون انجام نشود .\n" +
                        "12-\tحتما قبل از تزریق سابقه حساسیت دارویی ،حساسیت به غذای خاص و نیز سابقه ابتلا به آسم و آلرژی را به پزشک ، پرستار و یا کارشناس سی تی اسکن اطلاع دهید .\n" +
                        "13-\tدر صورتی که از بیماری دیابت رنج می برید  و جهت درمان این بیماری دارویی استفاده می کنید ، حتما پزشک ، پرستار و یا کارشناس سی تی اسکن را در جریان قرار دهید .\n" +
                        "14-\tپس از انجام آزمون سی تی اسکن با استفاده از ماده حاجب جهت دفع این ماده از بدن خود ، لطفا آب کافی مصرف کنید. \n" +
                        "نحوه نوبت دهی و جوابدهی:.\n" +
                        "قبل از انجام سی تی اسکن و رادیوگرافی با بخش مربوطه تماس گرفته می شود. زمان را مشخص کرده سپس ازآن بخش نام بیمار و نوع سی تی اسکن و رادیوگرافی که برای بیمار باید انجام بگیرد را از طریق سیستم HIS  ثبت می کنند و بیمار را به همراه برگه درخواست و آمادگی های لازم به بخش رادیولوژی انتقال می دهند.\n" +
                        "بعد از انجام رادیولوژی و سی تی اسکن از طریق پزشک رادیولوژیست گزارش در سیستم ثبت شده و پزشک معالج از طریق سیستم می توانند ریپورت رادیولوژی و سی تی اسکن بیمار را ببیند.\n");
                transactionCt.replace(R.id.frame_layout, fragmentCt);
                transactionCt.addToBackStack(null);
                transactionCt.commit();
                break;
        }


    }
    public void showBackButton() {
        if (getActivity() instanceof MainActivity) {
            ((MainActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
}
