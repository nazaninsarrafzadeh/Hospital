package com.example.nazanin.hospitalapp;

import android.content.Context;
import android.net.Uri;
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

import com.example.nazanin.hospitalapp.Illness.InfoIllness;


public class Paraclinic extends Fragment{

    Button btn1, btn2 , btn3, btn4, btn5, btn6, btn7,btn8,btn9;

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
        btn1 = v.findViewById(R.id.btnNavar);
        btn2 = v.findViewById(R.id.btnCheshm);
        btn3 = v.findViewById(R.id.btnDakheli);
        btn4 = v.findViewById(R.id.btnOfuni);
        btn5 = v.findViewById(R.id.btnFogh);
        btn6 = v.findViewById(R.id.btnGhalb);
        btn7 = v.findViewById(R.id.btnNorology);
        btn8 = v.findViewById(R.id.btnCCU);
        btn9 = v.findViewById(R.id.btnICU);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transactionNavarAzole = getFragmentManager().beginTransaction();
                ParaclinicDetailsFragment fragmentNavarAzole = new ParaclinicDetailsFragment();
                fragmentNavarAzole.SetTitle("نوار عصب و عضله");
                fragmentNavarAzole.SetBody("آمادگی لازم :\n" +
                        " \tلباس راحت و آزاد پوشیده شود\n" +
                        " \tمحل انجام تست تمیز باشد( از کرم و پودر استفاده نشود)\n" +
                        " \tدر نوارد عصب تحتانی پاها از زانو به پایین شیو شود\n" +
                        " \tزیور آلات خارج شود\n" +
                        " \tدارو های رقیق کننده خون مصرف نشود\n" +
                        " \tقبل از انجام نوار ماده شیرین مصرف کند\n" +
                        "نحوه انجام نوار عصب و عضله:\n" +
                        " \tجهت نوار عصب اول NCN تحریک عصبی با شوکر ( تحریک برقی) انجام  شده سپس با سوزن یکبار مصرف EMG انجام شده بسته به مشکلات عصب و عضله بین 30 دقیقه تا 2 ساعت ممکن است بطول انجامد\n" +
                        " \tنوار عصب های انجام شده: فوقانی ( دستها)- تحتانی( پاها)- چهار اندام( دست و پاها)- سه اندام- چشم و عضلات صورت انجام می شود.\n" +
                        "نحوه نوبت دهی:\n" +
                        "\uF0FC\tبه صورت تلفنی و حضوری می باشد.\n" +
                        "\uF0FC\tروز های ایام هفته طبق برنامه اول ماه بین پزشکان تقسیم می شود.\n" +
                        "جوابدهی:\n" +
                        "\uF0FC\tدر VEP و نوار عصب و عضله هنگام انجام توسط خود پزشک تحویل بیمار داده می شود\n" +
                        "\uF0FC\tدر نوار مغز جوابها پس از 24 -72 ساعت توسط پزشک مربوطه ریپورت و تحویل بیمار داده می شود، در بیماران بستری بخشی به بخش تحویل داده می شود و در مواقعی که اورژانسی بوده یا مشاوره باشد یاهماهنگی با پزشک مربوطه در همان موقع ریپورت انجام میشود.\n");
                transactionNavarAzole.replace(R.id.frame_layout, fragmentNavarAzole);
                transactionNavarAzole.addToBackStack(null);
                transactionNavarAzole.commit();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transactionVarzesh = getFragmentManager().beginTransaction();
                ParaclinicDetailsFragment fragmentVarzesh  = new ParaclinicDetailsFragment();
                fragmentVarzesh .SetTitle("تست ورزش");
                fragmentVarzesh .SetBody("این روش برا ی تشخیص گرفتگی رگهای قلب به کار میرود . \n" +
                        "معمولا دردناک نیست فقط ممکن است ایجاد خستگی کند .\n" +
                        "شما در طول تست ورزش باید روی دوچرخه رکاب بزنید یا روی \n" +
                        "دستگاه به نام تردمیل راه بروید. قبل ،حین و بعد از انجام تست ورزش از شما نوار قلب ،فشار خون و نبض گرفته می شود.مقایسه نتایج نوار قلب ،نبض و فشار خون به پزشک نشان میدهد که قلب شما چگونه با افزایش فعالیت می تواند کار کند \n" +
                        "آمادگی لازم قبل از انجام تست ورزش :\n" +
                        "1-\tشب قبل ،از خوردن غذای سنگین خودداری کنید.\n" +
                        "2-\tشب قبل از انجام تست ،استراحت کافی داشته باشید.\n" +
                        "3-\tاز سیگار و مواد محرک استفاده نکنید.\n" +
                        "4-\tادامه یا قطع داروهای مصرفی شما با نظر پزشک باشد.\n" +
                        "5-\tموهای قفسه سینه در مردان لازم است تراشیده شود.\n" +
                        "6-\tاستفاده از سینه بند محکم و سفت در خانمها الزامی است.\n" +
                        "7-\tلباس شما باید جلو باز باشد.\n" +
                        "مراقبتهای حین انجام تست ورزش :\n" +
                        "-\tممکن است بعضی از شما شرایط دویدن را از نظر فیزیکی نداشته باشید.\n" +
                        "-\tبعضی از شما ممکن است قبل از ورزش،دارویی بخورید که روی نتیجه ی تست اثر گذار باشد ،ممکن است روز قبل از انجام تست ،و برخی از داروهای مصرفی با نظر پزشکتان قطع شود.\n" +
                        "-\tپرستار ابتدا فشار خون و نبض شما را کنترل می کند ،سپس الکترودهایی را روی سینه و شکم شما وصل می نماید و کاف فشار سنج را بر بازوهای شما می بندد تا ضمن تست ورزش بتواند از شما نوار قلب و فشار خون بگیرد.\n" +
                        "-\tبعد از اینکه آهسته بر روی نوار متحرک راه رفتید سرعت و شیب دستگاه تردمیل در نرم افزار آ« تعیین شده است به طوریکه هر 3 دقیقه شیب و سرعت دستگاه افزایش می یابد و بیماران باید تا افزایش حداکثر HR  ضربان قلب که مورد تایید پزشک معالج است را ادامه داد که معمولا به طور متوسط حدود 4 Stage  میشوند حداکثر  HR در خانم ها و آقایان باتوجه به سن در فرمول گذاشته شده و به دست می آید که بیمار لازم است به آن برسد در غیر اینصورت تست ورزش قابل قبول نیست\n" +
                        "خطرات و عوارض :\n" +
                        "-\tاین روش خیلی ایمن است اما در موارد نادر ممکن است ضمن انجام تست یا مدتی پس از آن احساس ناراحتی کنید ،لازم است شما این علائم را بدانید تا هنگام بروز آن پزشکتان را با خبر کنید.\n" +
                        "ممکن است در طی انجام تست ،شما دچار خستگی ،تنگی نفس ،درد قفسه سینه ،درد بازو ،سرگیجه ،طپش قلب و افت فشار خون و درد در ناحیه پاها شوید. در اینصورت حتما به پزشکان اطلاع دهید. چون ممکن است نیاز به قطع ورزش باشد. ممکن است توسط پزشکی که این تست تحت نظر ایشان انجام میشود به کمک فوری احتیاج داشته باشید.\n" +
                        "مراقبتهای بعد از تست ورزش:\n" +
                        "•\tتست ورزش یک روش سرپایی است ،یعنی شما می توانید بعد از پایان تست ورزش به منزل بروید.\n" +
                        "•\tبعد از تست لازم است مدتی استراحت کنید،سپس می توانید فعالیتهای روزانه تان را از سر بگیرید.\n" +
                        "بعد از انجام تست از حمام داغ صرفنظر کنید،چون باعث افت فشار خون می شود.\n" +
                        "\n" +
                        "نحوه نوبت دهی و جوابدهی:\n" +
                        "\uF0FC\tاز قبل نوبت ها توسط پزشک معالج یا مسئول واحد تست ورزش بعد از انجام اکو یا در صورت صلاحدید پزشک معالج قلب به بیمار داده  می شود.\n" +
                        "\uF0FC\tبعد از انجام تست ورزش باتوجه بروز علائم در بیمار در حین انجام تست ورزش داشته است جواب پزشک معالج نوشته شده و بیمار تحویل داده می شود.\n");
                transactionVarzesh .replace(R.id.frame_layout, fragmentVarzesh );
                transactionVarzesh .addToBackStack(null);
                transactionVarzesh .commit();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transactionVep = getFragmentManager().beginTransaction();
                ParaclinicDetailsFragment fragmentVep = new ParaclinicDetailsFragment();
                fragmentVep.SetTitle("VEP");
                fragmentVep.SetBody("آمادگی لازم: \n" +
                        "•\tسر بیمار باید شسته و تمیز باشد\n" +
                        "نحوه انجام VEP: \n" +
                        "اتاق باید کاملا تاریک و ساکت باشد، لید ها به سر وصل شده و با چشم بند یک چشم به ترتیب بسته شده و یا چشم دیگر به تحریک نوری که در مانیتورینگ بوده خیره می شود و امواج ثبت می گردد.\n" +
                        "نوار عصب و عضله:\n" +
                        "آمادگی لازم :\n" +
                        " \tلباس راحت و آزاد پوشیده شود\n" +
                        " \tمحل انجام تست تمیز باشد( از کرم و پودر استفاده نشود)\n" +
                        " \tدر نوارد عصب تحتانی پاها از زانو به پایین شیو شود\n" +
                        " \tزیور آلات خارج شود\n" +
                        " \tدارو های رقیق کننده خون مصرف نشود\n" +
                        " \tقبل از انجام نوار ماده شیرین مصرف کند\n" +
                        "نحوه انجام نوار عصب و عضله:\n" +
                        " \tجهت نوار عصب اول NCN تحریک عصبی با شوکر ( تحریک برقی) انجام  شده سپس با سوزن یکبار مصرف EMG انجام شده بسته به مشکلات عصب و عضله بین 30 دقیقه تا 2 ساعت ممکن است بطول انجامد\n" +
                        " \tنوار عصب های انجام شده: فوقانی ( دستها)- تحتانی( پاها)- چهار اندام( دست و پاها)- سه اندام- چشم و عضلات صورت انجام می شود.\n" +
                        "نحوه نوبت دهی:\n" +
                        "\uF0FC\tبه صورت تلفنی و حضوری می باشد.\n" +
                        "\uF0FC\tروز های ایام هفته طبق برنامه اول ماه بین پزشکان تقسیم می شود.\n" +
                        "جوابدهی:\n" +
                        "\uF0FC\tدر VEP و نوار عصب و عضله هنگام انجام توسط خود پزشک تحویل بیمار داده می شود\n" +
                        "\uF0FC\tدر نوار مغز جوابها پس از 24 -72 ساعت توسط پزشک مربوطه ریپورت و تحویل بیمار داده می شود، در بیماران بستری بخشی به بخش تحویل داده می شود و در مواقعی که اورژانسی بوده یا مشاوره باشد یاهماهنگی با پزشک مربوطه در همان موقع ریپورت انجام میشود.\n");
                transactionVep.replace(R.id.frame_layout, fragmentVep);
                transactionVep.addToBackStack(null);
                transactionVep.commit();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transactionEcho = getFragmentManager().beginTransaction();
                ParaclinicDetailsFragment fragmentEcho = new ParaclinicDetailsFragment();
                fragmentEcho.SetTitle("اکو");
                fragmentEcho.SetBody("پزشک می تواند با گوش دادن به ضربان قلب ،گرفتن نبض ،فشارخون ،\n" +
                        "نوار قلب و با دیگر روشهای تشخیصی ،اطلاعاتی در مورد وضعیت قلبی شما\n" +
                        " بدست آورد.\n" +
                        "اکو کاردیوگرافی هم تست تشخیص بدون درد و بی خطر است که بدون اینکه\n" +
                        " به بدن شما آسیبی وارد کند،می تواند برای تشخیص بیشتر بیماریهای قلبی کمک کننده باشد.این روش اطلاعات بیشتری به پزشک شما داده و نشان می دهد قلب شما چگونه کار می کند. دستگاهی که دراکو استفاده می شود شبیه دستگاهی است که در سونوگرافی برای خانم ها ی حامله استفاده میشود . دستگاه اکوامواج صوتی را با فرکانس بالا به قلب فرستاده ،بازتاب صدا را می گیرد و آن را به امواج الکتریکی تبدیل می کند ،سپس امواج دریافتی را روی صفحه ای شفاف نمایش می دهد و آنرا ضبط می کند.\n" +
                        "قبل از اکو :\n" +
                        "اگر شما دارو استفاده می کنید با پزشکان هماهنگ کنید که روز انجام اکو می توانید از داروهایتان استفاده کنید یا خیر؟\n" +
                        "به شما گفته می شود که پیراهنتان را در اورید و یا دکمه های پیراهنتان را باز کنید و روی تخت مخصوص دراز بکشید.\n" +
                        "-\tاگر در حین اکو احساس ناراحتی کردید حتماً به پزشکان اطلاع دهید.\n" +
                        "-\tاگر شما علاقمند هستید،می توانید در مورد وضعیت قلبتان بپرسید.\n" +
                        "-\tحین اکو :\n" +
                        "ژل مخصوصی بر روی سینه شما می مالند که این ژل به کار \n" +
                        "رفته بر روی پوست ،به انتقال امواج صوتی کمک می کند .\n" +
                        " امواج توسط یک قلم (مبدل) مخصوص به سمت قلب هدایت میشود.\n" +
                        "پزشک قلم را روی قفسه ی سینه ی شما به حرکت در می آورد و به آرامی فشار می دهد تا بتواند قسمتهای مختلف قلب را مشاهده کند. در حین اکو لازم است شما به طور دوره ای به پهلوی چپ برگشته یا تنفس خود را نگهدارید،کل این روش حدود 45 دقیقه طول میکشد. پس از اتمام کار،ژلهایی را که روی سینه ی شما بوده با دستمال کاغذی پاک می کنند.\n" +
                        "این روش تصویر  برداری ،ساختمان قلب را همراه با وضعیت گردش خون و دریچه های قلب نشان می دهد،پزشک شما عکسهای مربوط به عضله ی قلب ،دریچه ها و ساختار عملکرد قلب را دیده ،تجزیه و تحلیل می کند و در مورد جزئیات آن با شما و با بستگانتان صحبت می نماید.\n" +
                        "بعد از اکو :\n" +
                        "اکو یک روش سرپایی است ،یعنی شما می توانید بعد از پایان اکو به منزل بروید بعد از انجام اکو به مراقبت خاصی نیاز ندارید و می توانید فعالیتهای روزانه تان را از سر بگیربد. در صورت بستری بودن پس از اتمام کار می توانید با کمک پرسنل به بخش خود باز گردید.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "نحوه نوبت دهی و جوابدهی:\n" +
                        " نوبت دهی اکو به صورتی است که پزشک معالج بعد از ویزیت بیمار و دستور انجام اکو، تاریخ و ساعت حضور بیمار در اکو سرپایی مستقیما به بیمار اعلام می کند و بیمار در تاریخ و ساعت مقرر در واحد اکو حضوری می یابد و اکوی وی توسط پزشک نوشته شده و تحویل بیمار می شود\n");
                transactionEcho.replace(R.id.frame_layout, fragmentEcho);
                transactionEcho.addToBackStack(null);
                transactionEcho.commit();
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction transactionRadio = getFragmentManager().beginTransaction();
                RadiologyFragment fragmentRadio = new RadiologyFragment();
                transactionRadio.replace(R.id.frame_layout, fragmentRadio);
                transactionRadio.addToBackStack(null);
                transactionRadio.commit();
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transactionAndoskopi = getFragmentManager().beginTransaction();
                ParaclinicDetailsFragment fragmentAndoskopi = new ParaclinicDetailsFragment();
                fragmentAndoskopi.SetTitle("آندوسکوپی و کلونوسکوپی");
                fragmentAndoskopi.SetBody("آندوسکوپی چیست؟\n" +
                        "آندوسکوپی روشی است که پزشک میتواند به کمک اندوسکوپ اعضا داخلی\u200C بدن را با مقاصد تشخیصی و درمانی مورد معاینه قرار دهد. در این روش پزشک میتواند تصویر ویدیوئی اندوسکوپ را به طور مستقیم بر روی مانیتور مشاهده کرده و بدینوسیله اعضای داخلی\u200C بدن  را مورد معاینه قرار دهد.\n" +
                        "\uF0FC\tامروزه اندوسکوپی دقیق\u200Cترین ،پیشرفته\u200Cترین و رایج\u200Cترین روش معاینه اعضای داخلی\u200C بدن است.\n" +
                        " \tرایجترین انواع اندوسکوپی، کولونوسکوپی (معاینه روده بزرگ) و گاستروسکوپی (معاینه معده و مری) میباشند.\n" +
                        "o\tانجام عمل اندوسکوپی بسیار ساده و سرپایی انجام میشود و نیازی به بستری شدن بیمار نیست. \n" +
                        "•\tبرای آرامش بیشتر بیمار به او آمپول آرامبخش با اثر کوتاه مدت تزریق میشود، و یا با داروهای آرامبخش تسکین داده خواهد شد، تا درد و ناراحتی\u200C بیمار به حداقل برسد. چرا که اعتماد و راحتی بیمار از اهداف اولیه مرکز پزشکی مدیکوم می\u200Cباشد.\n" +
                        "•\tاندسکوپی روده و معده در چند دقیقه انجام شده و بیمار در بیهوشی بسیار سطحی به سر میبرد و پس از معاینه نیز به راحتی\u200C به هوشیاری اولیه\u200C باز میگردد..\n" +
                        "•\tدر مدت معاینه که ۲۰-۴۰ دقیقه به طول می\u200Cانجامد، بیمار هیچ دردی را احساس نخواهد کرد و پزشک متخص مرکز پزشکی\u200C مدیکوم تمام تلاش خود را در راستای\u200C راحتی\u200C و اطمینان خاطر بیمار خواهد کرد.\n" +
                        "•\tدر بیهوشی سطحی به گلوی فرد داروی بی\u200C حسّی زده میشود تا در طول انجام اندوسکوپی چیزی احساس نکند. در تمام مراحل آندوسکوپی فرد احتیاج به تنفس مصنوعی پیدا نمیکند و میتواند به طور طبیعی\u200C تنفس کند.\n" +
                        "•\tاکثر افراد پس از حدود نیم ساعت استراحت بعد از اندوسکوپی میتوانند با هوشیاری و وضعبت بالینی معمولی به خانه بازگردند.\n" +
                        "خطرات ناشی از آندوسکوپی چیست؟\n" +
                        "خطرات ناشی از آندوسکوپی قسمت فوقانی دستگاه گوارش، می\u200Cتواند شامل موارد زیر باشد:\n" +
                        "\uF0D8\tخونریزی از محلی که پزشک نمونه \u200Cبرداری انجام داده است و یا محلی که پولیپ از آن خارج شده است.\n" +
                        "\uF0D8\tسوراخ شدن لایه پوششی دستگاه گوارش\n" +
                        "\uF0D8\tواکنش غیرطبیعی بدن به آرام\u200Cبخش، از جمله ایجاد مشکلات تنفسی و یا قلبی\n" +
                        "\uF0D8\tخونریزی و سوراخ شدن جداره دستگاه گوارش در آندوسکوپی\u200Cهای درمانی شایع\u200Cتر از آندوسکوپی\u200Cهای تشخیصی می\u200Cباشد. خونریزی ناشی از آندوسکوپی، اغلب بدون درمان متوقف می\u200Cشود.\n" +
                        "\n" +
                        "نحوه نوبت دهی و جوابدهی:\n" +
                        "نوبت دهی سرپایی:\n" +
                        "\uF0FC\tمراجعه مددجوبا برگه دستورات پزشک\n" +
                        "\uF0FC\tدادن نوبت طبق نوبت کاری پزشکان\n" +
                        "\uF0FC\tآموزش جهت آمادگی های قبل از پروسیجر به مددجو\n" +
                        "\uF0FC\tحضور مددجو در زمان تعیین شده با آمادگی لازم\n" +
                        "\uF0FC\tثبت مشخصات مددجو و بیه پذیرش\n" +
                        "\uF0FC\tراهنمایی مددجو یا همراه به داروخانه جهت تهیه وسایل مصرفی\n" +
                        "\uF0FC\tتکمیل برگه رضایت شخصی\n" +
                        "نوبت دهی بستری\n" +
                        "•\tتماس از بخش بستری جهت گرفتن نوبت\n" +
                        "•\tحضور مددجو در زمان مقرر پس از هماهنگی بخش آندوسکوپی و بخش مورد نظر (با پرونده بستری)\n" +
                        "نحوه ارسال نتایج\n" +
                        "فایل شامل اطلاعات آژمایش برای بیمار بستری بصورت برگه در پرونده بیمار قرار داده می شود و به پرستار بیمار تحویل داده و به اطلاع پزشک می رساند. و برای بیمار سرپایی به خود بیمار یا همراه وی تحویل داده می شود.\n");
                transactionAndoskopi.replace(R.id.frame_layout, fragmentAndoskopi);
                transactionAndoskopi.addToBackStack(null);
                transactionAndoskopi.commit();
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transactionErcp = getFragmentManager().beginTransaction();
                ParaclinicDetailsFragment fragmentErcp = new ParaclinicDetailsFragment();
                fragmentErcp.SetTitle("ERCP\n" +
                        "(ای آر سی پی)\n");
                fragmentErcp.SetBody("ای آر سی پی (کلانژیو پانکراتو گرافی رتروگراید) روشی است که برای بررسی ، تشخیص و درمان بیماریهای پانکراس ، کیسه صفرا و مجاری صفراوی و کبد استفاده می شود.\n" +
                        "ای آر سی پی : تصویر برداری از مجرای صفراوی و مجرای پانکراس از طریق آندوسکوپی است.\n" +
                        "پانکراس (لوزالمعده) \n" +
                        "غده ای نزدیک معده است که یکی از وظایف آن تولید موادی به نام آنزیم است که به هضم غذا کمک می کنند.\n" +
                        "این آنزیم های تولید شده در پانکرانس از راه یک لوله باریک به دوازدهه ( ابتدای روده کوچک ) وارد می شوند .\n" +
                        "کیسه صفرا \n" +
                        "o\tیک کیسه گلابی شکل کوچک است زیر کبد قرار دارد ، صفرا ( زرد آب ) تولید شده توسط کبد در آن نگهداری می شود ، وقتی غذا می خوریم بخصوص اگر چرب باشد کیسه صفرا منقبض ( جمع می شود ) و صفرا که برای هضم چربی لازم است را از راه یک لوله باریک به نام مجرای صفراوی به دوزادهه می ریزد . \n" +
                        "o\tدر این روش پزشک آندوسکوپ را که یک لوله ظریف ، قابل انعطاف و نورانی و دورربین دار است را از راه دهان به آرامی وارد کرده و پس از عبور از گلو ، مری ، معده و دوازدهه وارد مجاری صفراوی و پانکراس شده سپس با تزریق ماده حاجب ( رنگی ) و همزمان با کمک اشعه ایکس ، تصاویر واضحی از این مجاری و یانکراس و کیسه صفرا بدست می آید . با کمک این تصاویر پزشک به مشکلات موجود پی برده و در صورت لزوم اقدامات لازم را نیز همزمان انجام می دهد .\n" +
                        "در چه مواردی ای آر سی پی انجام می شود \n" +
                        "•\tپیدا کردن علل بعضی دردهای شکمی یا زردی \n" +
                        "•\tتشخیص تومورهای مجاری ضفراوی و پانکراس \n" +
                        "•\tنمونه برداری برای انجام آزمایش ( یبوپسپی ) در صورت وجود ضایعات \n" +
                        "•\tیافتن سنگ های کیسه صفرا و یا بیماری های کبدی ، مجاری صفراوی و پانکراس .\n" +
                        "•\tبرداشتن سنگ های کیسه صفرا از مجاری صفراوی و پانکراس در مواردی که مشکلی مانند گیر کردن مجرا بوسیله سنگ ، التهاب یا عفونت در مجاری صفراوی و یا پانکراس رخ داده باشد.\n" +
                        "•\tباز کردن مجرای صفراوی تنگ شده  با بالون ، و در مواردی کار گذاشتن یک لوله پلاستیکی و یا فلزی ( استنت ) در مجرا برای تخلیه صفرا .\n" +
                        "نکات قابل توجه در ای آر سی پی \n" +
                        "•\tای آر سی پی در بخش آندوسکوپی انجام می شود . ممکن است \n" +
                        "\tبین نیم تا 2 ساعت به طول بینجامد \n" +
                        "اقدامات قبل از آزمون ای آرسی پی\n" +
                        "•\t8-6 ساعت ناشتا باشید. از نیمه شب قبل از آزمون از خوردن و آشامیدن مواد غذایی اجتناب کنید .\n" +
                        "•\tآزمایش خون انجام می شود ( لازمه انجام ای آر سی پی اینست که پلاکت خون شما بیشتر از 100 هزار  باشد و INR ( آی ان ار) کمتر از 4/1 باشد) .\n" +
                        "•\tگزارش حساسیت دارویی بخصوص حساسیت به غذاهای دریایی و ماه حاجب یددار \n" +
                        "•\tگزارش لیست داروهای مصرفی بخصوص داروهایی مثل آسپرین و وارفارین به پزشک یا پرستار .\n" +
                        "•\tامضاء برگه رضایت نامه .\n" +
                        "•\tخارج کردن زیورآلات ، دندان مصنوعی و لنزهای تماسی\n" +
                        "•\tقبل از انجام آزمون ادرار کنید زیرا داروها باعث احتباس ادرار می شود .\n" +
                        "حین انجام آزمون \n" +
                        "\uF0D8\tدر واحد آندوسکوپی شما روی تخت در وضعیت خوابیده به پهلوی چپ با زانوی خم دراز کشیده و سپس خوابیده به شکم قرار میگیرید. در حین انجام آزمون ، فشار خون و نبض شما کنترل خواهد شد . برای اینکه در طی عمل کمتر احساس ناراحتی کنید برای شما یک آرامبخش تجویز خواهد شد .\n" +
                        "\uF0D8\tبرای بی حسی در ناحیه دهان و گلو ، داروی بی حس کننده که ممکن است مزه تلخی داشته باشد به داخل گلوی شما اسپری می شود .\n" +
                        "\uF0D8\tبه دلیل اینکه در اثر بی حسی قدرت بلع شما مختل شده ، لذا توسط یک ساکشن آب دهان خارج می شود.\n" +
                        "\uF0D8\tبرای باز نگه داشتن دهان و حفاظت از دندانهای شما از یک محافظ دهانی استفاده می شود .\n" +
                        "\uF0D8\tدر طی انجام عمل ، شما قادر به صحبت کردن نخواهید بود ، اما مشکلی در نفس کشیدن نخواهید داشت .\n" +
                        "\uF0D8\tاز طریق یک آنژیوکت که بر روی دست تعبیه می شود ، داروهای آرامبخش و شل کننده عضلات دستگاه گوارش برای شما تزریق می شود .\n" +
                        "\uF0D8\tپزشک لوله باریکی از طریق آندوسکوپ  به سمت مجاری صفراوی و پانکراس هدایت خواهد کرد و از طریق آن ماده حاجب را به داخل مجرای صفراوی تزریق کرده و به سرعت چندین عکس از زوایای مختلف تهیه خواهد نمود . \n" +
                        "\uF0D8\tبعد از عکسبرداری بر حسب بیماری، اقدام لازم ( خارج کردن سنگ صفراوی ، باز کردن مجرای تنگ شده ، گذاشتن استنت و یا نمونه برداری ) انجام می شود . سپس به آرامی لوله اندوسکوپ از دهان خارج خواهد شد \n" +
                        "مراقبتهای پس از آزمون\n" +
                        "•\tبرای مدت 1 تا 2 ساعت شما در اتاق روی تخت مراقبت قرار می گیرید. نبض و فشار خون و تنفس شما مرتب توسط پرستار کنترل می شود .\n" +
                        "•\tبدلیل دریافت داروها ، تا چند ساعت اول بعد از ای آر سی پی احساس خواب آلودگی ، بی حسی و درد در گلو خواهید داشت . برا ی پیشگیری از برگشت ترشحات به درون راه هوایی به پهلو بخوابید و سر به یک طرف برگردانده شود . \n" +
                        "•\tبیمار باید حدوداً تا 2 ساعت بعد از انجام آزمون ناشتا باشد مگر اینکه پزشک دستور خاص دیگری داده باشد \n" +
                        "•\tرژیم مایعات شفاف شروع کرده و پس از تحمل ، رژیم مایعات غلیظ و نرم استفاده نمایید .\n" +
                        "•\tدر صورتی که قادر به دفع ادرار نبودید و یا درد شدید شکم ، استفراغ ، تب و لرز ، گلودرد شدید داشتید به پزشک معالج و پرستار بخش اطلاع دهید .\n" +
                        "•\tتا 24 ساعت بعد از آزمون از رانندگی اجتناب نمائید .\n" +
                        "علائم قابل توجه بعد از ترخیص \n" +
                        "در صورت بروز درد شدید شکم ، تهوع ، استفراغ ، تب و لرز ، زردی و مشکل در بلع یا گلودرد شدید به اورژانس بیمارستان یا نزدیک ترین مرکز درمانی مراجعه نماید .\n" +
                        "نحوه نوبت دهی و جوابدهی:\n" +
                        "نوبت دهی سرپایی:\n" +
                        "\uF0FC\tمراجعه مددجوبا برگه دستورات پزشک\n" +
                        "\uF0FC\tدادن نوبت طبق نوبت کاری پزشکان\n" +
                        "\uF0FC\tآموزش جهت آمادگی های قبل از پروسیجر به مددجو\n" +
                        "\uF0FC\tحضور مددجو در زمان تعیین شده با آمادگی لازم\n" +
                        "\uF0FC\tثبت مشخصات مددجو و بیه پذیرش\n" +
                        "\uF0FC\tراهنمایی مددجو یا همراه به داروخانه جهت تهیه وسایل مصرفی\n" +
                        "\uF0FC\tتکمیل برگه رضایت شخصی\n" +
                        "نوبت دهی بستری\n" +
                        "•\tتماس از بخش بستری جهت گرفتن نوبت\n" +
                        "•\tحضور مددجو در زمان مقرر پس از هماهنگی بخش آندوسکوپی و بخش مورد نظر (با پرونده بستری)\n" +
                        "نحوه ارسال نتایج\n" +
                        "فایل شامل اطلاعات آژمایش برای بیمار بستری بصورت برگه در پرونده بیمار قرار داده می شود و به پرستار بیمار تحویل داده و به اطلاع پزشک می رساند. و برای بیمار سرپایی به خود بیمار یا همراه وی تحویل داده می شود.\n");
                transactionErcp.replace(R.id.frame_layout, fragmentErcp);
                transactionErcp.addToBackStack(null);
                transactionErcp.commit();
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transactionAz = getFragmentManager().beginTransaction();
                ParaclinicDetailsFragment fragmentAz = new ParaclinicDetailsFragment();
                fragmentAz.SetTitle("آزمایشگاه");
                fragmentAz.SetBody("آزمایش هایی که انجام آنها الزاما نیاز به ناشتابودن بیمار دارد:\n" +
                        " \tACTH, Plasma  (ناشتایی از نیمه شب)\n" +
                        " \tAlkaline Phosphatase, Serum\n" +
                        " \tα l- Acid Glycoprotein, serum\n" +
                        " \tAmino Acids, Plasma (شیرخواران چهار ساعت ناشتایی ولی کودکان و بزرگسالان 12 ساعت)\n" +
                        " \tAscorbic Acid, serum\n" +
                        " \tCalcitonin, serum or plasma\n" +
                        " \tCeruloplasmin, serum or plasma\n" +
                        " \tFBS\n" +
                        " \tFolic Acid, Serum\n" +
                        " \tGlucagon, Plasma\n" +
                        " \tHDL, LDL\n" +
                        " \tIron, Serum\n" +
                        " \t(12ساعت ناشتایی) Leptin, Serum\n" +
                        " \tLipase, Serum\n" +
                        " \tPTH, Serum\n" +
                        " \tSchilling Test\n" +
                        " \tTransthyretin, Serum\n" +
                        " \tTriglycerides, Serum or Plasma (10 تا14 ساعت)\n" +
                        " \tVitamin A, Serum or Plasma(حداقل هشت ساعت)  \n" +
                        "آزمایش هایی که بیمار باید ترجیحا ناشتا باشد:\n" +
                        " \tAcid Phosphatase, Serum\n" +
                        " \tα l-Antitrypsin, Serum\n" +
                        " \tAmylase, Urine (قبل از جمع آوری، ناشتایی از ده شب تا شش صبح توصیه می شود)\n" +
                        " \tAndrostenedione, Serum\n" +
                        " \tApo A-I, Serum\n" +
                        " \tApolipoprotein B-100, Serum\n" +
                        " \tCalcium, Serum\n" +
                        " \tCholesterol, Total, Serum or Plasma\n" +
                        " \tGlucose Tolerance Test (GGT), Serum\n" +
                        " \tInsulin, Serum\n" +
                        " \t5-Nucleotidase, Serum\n" +
                        " \tPhosphorus, Serum\n" +
                        "آزمایش هایی که انجام آن ها نیازمند رعایت رژیم غذایی خاصی است:\n" +
                        "\uF0FC\tFat, Semi quantitative, Stool: یک فرد بزرگسال باید تحت رژیم حاوی حدود 100 تا 150 گرم چربی یاg/m2 60 در روز برای حدود یک هفته قبل و در طی انجام آژمایش باشد و از مصرف غذاهای پرفیبر برای چند روز قبل از انجام آزمایش پرهیز نماید. پیش از جمع آوری نمونه نیز بیمار نباید از شیاف یا مواد روغنی استفاده کرده باشد. از یک هفته قبل بیمار نباید بیسموت، روغن کرچک، یا روغن معدنی مصرف کرده باشد.\n" +
                        "\uF0FC\tLDL  و HDL : جهت حصول بهترین نتیجه، بیمار باید به مدت سه هفته یک رژیم ثابت غذایی و وزن بدن ثابت داشته باشد و حداقل ده ساعت ناشتا باشد.\n" +
                        "\uF0FC\tTriglycerides, Serum or Plasma: بیمار باید از سه هفته قبل رژیم غذایی ثابت داشته باشد و از سه روز قبل از نمونه گیری الکل مصرف نکرده و حداقل از 24 ساعت قبل نیز ورزش سنگین انجام نداده باشد.\n" +
                        "\uF0FC\tPhenylalanine, Blood: نوزاد باید تغذیه مطلوب با شیر ( پروتئین) به مدت 48 ساعت قبل از آزمایش داشته باشد. نمونه باید حتی المقدور زمان ترخیص نوزاد از بیمارستان گرفته شود. برای نوزادان با وزن تولد کم (Low Birth Weight= LBW) نمونه گیری در روزهای چهارم تا دهم پس از تولد پیشنهاد میشود.\n" +
                        "\uF0FC\tUrine 5-HIAA: برای حداقل 48-72 ساعت قبل از نمونه گیری و در طی جمع آوری نمونه بیمار می باسد از مصرف انبه، موز، طالبی، شکلات، خرما، بادمجان، گریپ فروت، گردو، کیوی، هندوانه، خربزه، آجیل، آناناس، بارهنگ، گوجه سبز و گوجه فرنگی  پرهیز نماید.\n" +
                        "آزمایش هایی که انجام آنها نیازمند رعایت رژیم دارویی است:\n" +
                        "•\tAldosterone, Serum or Urine: قبل از انجام آزمایش باید هیپوکالمی اصلاح گردد و در صورت استفاده از دارو های ضد فشار خون و دیورتیک ، حداقل از دوهفته قبل ( ترجیها تا شش هفته قبل) از انجام آزمایش با نظر پزشک قطع گردند.\n" +
                        "•\tAluminum, Serum or Urine: بیمار نباید از 24 ساعت قبل از آنتی اسید های حاوی آلومینیوم مانند آمفوژل یا سوکرالفیت استفاده نماید.\n" +
                        "•\tACE, Serum: داروهای کاپتوپریل و انالاپریل باعث کاهش مقادیر ACE می گردند\n" +
                        "•\tPlasma ADH : بیمار باید از مصرف موادی مانند نیکوتین ، الکل، کافئین و دیورتیک ها که با ترشح ADHتداخل می نمایند، طی هفته قبل از آزمایش خودداری نمایند.\n" +
                        "•\tBleeding Time: بیمار باید از مصرف آسپرین و دارو های مشابه در طی هفته قبل از آزمایش منع گردد.\n" +
                        "•\tUrine 5-HIAA:برای حداقل 48-72 ساعت قبل از نمونه گیری و طی جمع آوری نمونه بیمار می بایست از مصرف دارو های استامینوفن، سالیسیلات ها، فناستین، شربت سرفه حاوی گلیکولات گلیسیرین، ناپروکسن، متاکاربامول، ایمی پرامین، ایزونیازید، مهار کننده های منوآمین اکسیداز، فنتامین، متیل دوپا، رزرپین و فنوتازین ها اجتناب نماید.\n" +
                        "•\tHomovanillic Acid : بیمار باید حدالمقدور 48 ساعت پیش از جمع آوری نمونه های آسپرین، دی سولفیرام، رزرپین و پیریدوکسین مصرف نکرده باشد. لوودوپا هم باید تا دوهفته قبل مصرف نشده باشد.\n" +
                        "•\tPT  و PTT  : هرچند که هپارین را طولانی می کند ولی به مقادیر کمتر می تواند PT را هم طولانی کند. هیرودین و آرگاتروبان PT و PTT را طولانی می کنند. بنابراین بهتر است که نمونه مربوط به آزمایش های انعقادی مستقیما از یک ورید محیطی گرفته شود و خون گیری از بازویی که هپارین ، هیرودین یا آرگاتروبان تزریق می شود، صورت نگیرد.\n" +
                        "•\tPlatelet Aggregation: بیمار از هفت روز قبل از انجام آزمایش نباید آسپرین دریافت کرده باشد و باید از مصرف دارو های ضد التهابی غیراستروئیدی (NSAIDs) یا سایر عوامل مهرکننده پلاکت هم اجتناب کند.\n" +
                        "\n" +
                        "نحوه نوبت دهی و جوابدهی:\n" +
                        "برای بیماران بستری در بخش های مختلف بیمارستان پرستار بیمار از طریق سیستم HIS نام آزمایش هارا وارد سیستم کرده و نمونه هارا به بخش آزمایشگاه می فرستد تمامی آزمایش ها در شیفت صبح انجام می دهند و در شیفت عصر و شب فقط آزمایش های اورژانسی انجام میگیرد جواب آزمایش ها از طریق سیستم HIS برای پرستار بیمار ارسال شده و وی پرینت آزمایش را گرفته و در پرونده بیمار قرار داده می شود.\n");
                transactionAz.replace(R.id.frame_layout, fragmentAz);
                transactionAz.addToBackStack(null);
                transactionAz.commit();
            }
        });

        return v;
    }


    public void showBackButton() {
        if (getActivity() instanceof MainActivity) {
            ((MainActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

}
