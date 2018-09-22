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

import com.example.nazanin.hospitalapp.MainActivity;
import com.example.nazanin.hospitalapp.R;


public class IllnessCCU extends Fragment {


    private ListView listCCU;
    private String[] list={"آنژین صدری","سکته قلبی","فشار خون","فیبریلاسیون دهلیزی" ,"نارسایی قلبی"};


    public static IllnessEye newInstance() {
        IllnessEye fragment = new IllnessEye();

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
        View v = inflater.inflate(R.layout.fragment_illness_ccu, container, false);
        listCCU = v.findViewById(R.id.listCCU);
        ArrayAdapter<String> adapter=new ArrayAdapter<>(getContext(),R.layout.list_textview,list);
        listCCU.setAdapter(adapter);
        listCCU.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        FragmentTransaction transaction = getFragmentManager().beginTransaction();
                        InfoIllness fragment = new InfoIllness();
                        fragment.SetTitle("آنژین صدری چیست؟");
                        fragment.SetBody("احساس درد و ناراحتی در قفسه سینه می باشد و زمانی رخ می دهد که قلب اکسیژن مورد نیاز خود را دریافت نمی کند. عضله قلب مانند سایر نقاط بدن برای سالم ماندن و فعالیت بهتر و دریافت غذا نیاز به خون رسانی و اکسیژن دارد که این عمل توسط رگهای موجود در قلب به نام شریانهای کرونری انجام می شود به هر علتی که شریانهای قلبی (کرونری) خون کافی دریافت نکنند خون رسانی به عضله قلب کم شده غذا و اکسیژن کافی به آن نمی رسد و فرد دچار درد قلبی می شود که به این درد آنژین صدری می گویند.\n" +
                                "علت آنژین صدری چیست؟\n" +
                                "•\tتنگ شدن شریانهای قلبی (کرونری) در اثر رسوب چربی و سایر مواد در دیواره آنها (تصلب شرایین)\n" +
                                "•\tنامنظم بودن ضربان قلب و آریتمی های قلبی\n" +
                                "•\tکم خونی\n" +
                                "•\tبیماری شریانهای کرونر، فشردگی (تنگ شدن= انقباض) و یا اسپاسم شریانهای کرونر که به نوبه خود باعث کاهش خونرسانی به قلب می شود.\n" +
                                "عوامل افزایش دهنده خطر ابتلا به آنژین صدری چیست؟\n" +
                                "•\tفشارخون بالا\n" +
                                "•\tچربی خون بالا (کلسترول بالا)\n" +
                                "•\tمرض قند (دیابت)\n" +
                                "•\tنداشتن تحرک و ورزش منظم\n" +
                                "•\tمصرف سیگار\n" +
                                "•\tچاقی\n" +
                                "•\tخوردن زیاده از حد نمک وچربی\n" +
                                "•\tمردان بالای 60 سال\n" +
                                "•\tیائسگی در زنان\n" +
                                "•\tوعده های سنگین غذا (انحراف خون به سمت معده و نرسیدن خون کافی به قلب)\n" +
                                "•\tقرار گرفتن در معرض سرما (تنگ شدن عروق کرونر شده)\n" +
                                "•\tاسترس ، اضطراب و عصبانیت و هر گونه فعالیت هیجانی\n" +
                                "•\tسابقه خانوادگی بیماری قلبی\n" +
                                "•\tانجام فعالیت و ورزش سنگین\n" +
                                "علائم و نشانه ای آنژین صدری چیست؟\n" +
                                "•\tدرد در قفسه سینه به صورت له کننده، فشار دهنده است از نظر اغلب افراد شدت آن به حدی است که قبلاً مانند آن را تجربه نکرده اند.\n" +
                                "•\tغالباً درد فقط محدود به منطقه قلب نیست و به گردن، فک و شانه ها، بازوها، مچ دست، انگشتان چهارم و پنجم دست (بخصوص دست چپ) تیر می کشد ولی با استراحت و یا با مصرف قرص زیر زبانی بهبود می یابد.\n" +
                                "•\tمدت زمان درد نهایتاً سه تا پنج دقیقه می باشد.\n" +
                                "•\tعلاوه بر درد ممکن است علائمی مانند سختی در نفس کشیدن، کوتاه شدن نفس، رنگ پریدگی، عرق سرد، گیجی، طپش قلب، تهوع و استفراغ؛ اضطراب، سوء هاضمه، احساس خفگی شدید نیز وجود داشته باشد.\n" +
                                "در افراد دیابتی: ممکن است به دلیل درگیری گیرنده های عصبی احساس درد کاهش یابد.\n" +
                                "\n" +
                                "در افراد سالمند آنژین صدری با علامت تنگی نفس وجود دارد.\n" +
                                "گاهي حمله های آنژین صدری در سالمندان بدون درد و همراه با ضعف و بی حالی بروز می کند.\n" +
                                "آنژین صدری چگونه تشخیص داده می شود؟\n" +
                                "با توجه و علائم و نشانه های مشاهده شده و انجام آزمایشات خون و نوار قلب و تست ورزش و انجام آنژیوگرافی قلبی تشخیص داده می شود.\n" +
                                "راههای پیشگیری از آنژین صدری چیست ؟\n" +
                                "•\tسیگار نکشید و از افراد سیگاری دوری کنید.\n" +
                                "•\tدر صورت بالا بودن فشار خون آن را درمان کنید.\n" +
                                "•\tاز رژیم کم نمک و کم چرب استفاده کنید.\n" +
                                "•\tدست کم 30 دقیقه در بیشتر یا تمامی روزهای هفته ورزش کنید.\n" +
                                "•\tوزن خود را در سطح سالمی حفظ نمایید.\n" +
                                "•\tپزشک خود را به شکل منظم ملاقات نمایید.\n" +
                                "•\tداروهای خود را درست مطابق دستور پزشک مصرف نمایید.\n" +
                                "•\tاگر مبتلا به مرض قند (دیابت) هستید قند خون را کنترل کنید.\n" +
                                "•\tاز عوامل فیزیکی و عاطفی استرس زا دوری کنید.\n" +
                                "•\tعلائم هشدار دهنده حمله قلبی را بیاموزیم.\n" +
                                "عوارضی که در صورت عدم توجه به دردهای قلبی برایم پیش می آید چیست؟\n" +
                                "-\tسکته قلبی (انفارکتوس میوکارد)\n" +
                                "-\tنامنظمی ضربان قلب (آریتمی)\n" +
                                "-\tاختلال کار قلب (نارسایی قلب)\n" +
                                "-\tمرگ ناگهانی\n" +
                                "مراقبت در مددجوی مبتلا به آنژین صدری\n" +
                                "1- حتماً بین فعالیت و استراحت خود تعادل برقرار کنید.\n" +
                                "•\tفعالیت روزانه تان منظم و تا حدی باشد که موجب ایجاد درد در قفسه سینه، تنگی نفس و خستگی شما نشود.\n" +
                                "•\tاز ورزشهای سنگین و ناگهانی بپرهیزید.\n" +
                                "•\tتا حد امکان فعالیت هایتان را سبک کنید مثلا به جای پله از آسانسور استفاده نمایید.\n" +
                                "•\tما بین فعالیت های خود دوره های استراحت بگنجانید.\n" +
                                "•\tاز ورزش کردن بعد از وعده غذا، در هنگام آشفتگی و اضطراب و روزهای مه آلود بسیار گرم و به خصوص در هوای سرد خودداری کنید.\n" +
                                "•\tقبل از شروع کار یا صرف غذا ورزش های سبک انجام دهید.\n" +
                                "حتماً در زمستان نکات ذیل را رعایت نمایید.\n" +
                                "•\tبا شال گردن روی دهان و بینی تان را بپوشانید.\n" +
                                "•\tاز لباس گرم استفاده کنید.\n" +
                                "•\tدر مقابل باد حرکت نکنید\n" +
                                "•\tدر هوای سرد آهسته حرکت کنید و زودتر خود را به منزل برسانید.\n" +
                                "2- هرگز سیگار نکشید و درمعرض دود سیگار قرار نداشته باشید.\n" +
                                "3- در مورد مصرف داروها به نکات زیر توجه کنید:\n" +
                                "•\tبه یاد داشته باشید که دارو شما مخصوص خود شماست و هرگز به دوستان و آشنایانی که بیماری مشابه دارند توصیه نکنید.\n" +
                                "•\tاز مصرف خودسرانه داروهایی نظیر (داروی لاغری- قطره های ضداحتقان بینی و غیره) بپرهیزید چون می تواند باعث افزایش ضربان قلب و فشارخون شود.\n" +
                                "•\tداروها را منظم مصرف کرده خودسرانه آن را قطع نکنید\n" +
                                "•\tقرص زیرزبانی همواره با خود داشته باشید.\n" +
                                "دستورالعمل استفاده از قرص زیرزبانی هنگام درد:\n" +
                                "•\tتمام فعالیتهایتان را متوقف کرده، بنشینید و اولین قرص را زبر زبانتان بگذارید و تا قطع کامل درد استراحت مطلق داشته باشید.\n" +
                                "•\tبعد از گذاشتن قرص زیر زبانی صبر کنید تا خوب حل شود و بزاق را کمی نگهدارید بعد آنرا قورت دهید.\n" +
                                "•\tدراز بکشید، سعی کنید ذهنتان آزاد باشد و هیچ استرسی به خود وارد نکنید.\n" +
                                "•\tپنج تا ده دقیقه صبر کنید، اگر دردتان کمتر نشد دومین قرص را استفاده نمایید. چنانچه بعد از ده دقیقه دردتان تسکین نیافت، سومین قرص را زیر زبانتان گذاشته و به نزدیکترین مرکز درمانی مراجعه نمایید.\n" +
                                "•\tقرصهای زیرزبانی تا 6 ماه قابل استفاده هستند.\n" +
                                "•\tقرصها را در جای خشک و خنک و در شیشه تیره رنگ نگهداری کنید. \n" +
                                "•\tقبل از فعالیت های سنگین و شرکت در موقعیت های هیجانی یک قرص زیر زبانتان بگذارید.\n" +
                                "4- وزنتان را بطور منظم کنترل کنید: اگر اضافه وزن دارید با یک برنامه صحیح غذایی اقدام به کاهش وزن نمایید.\n" +
                                "5- نکات قابل توجه در مورد رژیم غذایی\n" +
                                "•\tرژیم غذایی (کم کالری، کم چرب و با فیبر زیاد) را رعایت نمایید.\n" +
                                "•\tهرگز پرخوری نکنید، می توانید حجم غذا کمتری را در وعده های بیشتر دریافت کنید و میان وعده ها را بین وعده های اصلی بگنجائید.\n" +
                                "•\tاز نوشیدن چای پررنگ و نوشیدنی های حاوی کافئین (قهوه) خودداری کنید.\n" +
                                "•\tغذاهای نفاخ مصرف نکنید. بعد از صرف غذا مدت کوتاهی استراحت کنید و تا2ساعت فعالیت بدنی نداشته باشید.\n" +
                                "•\tرژیم پرفیبر (سبزیجات و میوه ها مانند شوید، هویج و سیب ...) را در برنامه غذایی تان بگنجانید چون فیبر باعث کاهش زور زدن حین اجابت مزاج و احتمال یبوست و سایر ناراحتی های روده ای می شود ضمناً سطح چربیهای مضر خون (کلسترول و تری گلیسرید) را کم کرده و از شدت حملات آنژین می کاهد .\n" +
                                "تمام عواملی را که احتمال می دهید روبرو شدن با آنها در شما \n" +
                                "موجب شروع درد می شود، شناسایی کرده و از مواجهه با آنها بپرهیزد.\n" +
                                "•\tاسترس نداشته باشید. در انجام کارها عجله نکنید و برای کارهایتان برنامه ریزی داشته باشید.\n" +
                                "•\tاگر سابقه مشکل روانی، اضطراب دارید حتماً به روانشناس مراجعه کنید.\n" +
                                "•\tدر مواقع تنش زا به نزدیکترین مرکز درمانی (مشاور، پزشک، پرستار) مراجعه کنید.\n" +
                                "در چه مواردی باید حتماً به پزشک مراجعه کنید؟\n" +
                                "•\tدردها، تعدادش بیش از حد معمول شود.\n" +
                                "•\tبدون فعالیت هم بروز کند.\n" +
                                "•\tبا استراحت تسکین نیابد\n" +
                                "•\tبا داروی زیرزبانی برطرف نشود\n" +
                                "•\tبیش از 5 دقیقه طول بکشد\n" +
                                "\n");
                        transaction.replace(R.id.frame_layout, fragment);
                        transaction.addToBackStack(null);
                        transaction.commit();
                        break;

                    case 1:
                        FragmentTransaction transaction1 = getFragmentManager().beginTransaction();
                        InfoIllness fragment1 = new InfoIllness();
                        fragment1.SetTitle("تشنج");
                        fragment1.SetBody("تشنج\u200C (كه\u200C حمله\u200C تشنجي\u200C يا حمله\u200C غش\u200C هم\u200C نام\u200C دارد) شامل\u200C انقباضات\u200C غيرارادي\u200C تعداد زيادي\u200C از عضلات\u200C بدن\u200C است\u200C. اين\u200C وضعيت\u200C  ناشی از تغییر ناگهانی و موقتی در عملکرد مغز است که بعلت تخلیه الکتریکی گروهی از سلولهای عصبی مغز ایجاد میشود. تخلیه الکتریکی همزمان، حمله ای و گذرای سلولهای عصبی،تغییراتی را در فعالیت ذهنی و رفتار فرد ایجاد می کند که از دوره زمانی بدون توجه تا بدون واکنش به تحریکات و انقباض پرشی عضلات متغیر است. تشنج یک بیماری نیست بلکه نشانه ای از نقایص زمینه ای، آسیب یا بیماری است.");
                        transaction1.replace(R.id.frame_layout, fragment1);
                        transaction1.addToBackStack(null);
                        transaction1.commit();
                        break;

                    case 2:
                        FragmentTransaction transaction2 = getFragmentManager().beginTransaction();
                        InfoIllness fragment2 = new InfoIllness();
                        fragment2.SetTitle("سکته قلبی ( انفارکتوس میوکارد ) ");
                        fragment2.SetBody("سکته قلبی ( انفارکتوس میوکارد ) چیست ؟ \n" +
                                "یک وضعیت اورژانسی است و رمانی رخ می دهد که عروق کرونر ( عروقی که به قلب خون رسانی می کنند ) دچار کاهش ناگهانی یا قطع کلی جریان خون می شوند و اجازه عبور خون کافی را به عضله قلب نمی دهند در صورتی که درمان سریع برای آن انجام نگردد باعث مرگ عضله قلبی و سکته قلبی می شود . \n");
                        transaction2.replace(R.id.frame_layout, fragment2);
                        transaction2.addToBackStack(null);
                        transaction2.commit();
                        break;

                    case 3:
                        FragmentTransaction transaction3 = getFragmentManager().beginTransaction();
                        InfoIllness fragment3 = new InfoIllness();
                        fragment3.SetTitle("سکته مغزي ");
                        fragment3.SetBody("سکته مغزي يک آسيب ناگهاني به سيستم عصبي است\n" +
                                " که طي آن ، جريان خوني که تامين کننده مواد غذايي\n" +
                                " و اکسيژن قسمتي از مغز مي باشد قطع مي شود . در نتيجه\n" +
                                " عملکرد عصبي ناحيه آسيب ديده دچار اشکال مي شود .\n" +
                                " شدت اختلال عملکرد ، براساس ناحيه ي درگير و وسعت ان متفاوت مي باشد که اين وضعيت را اصطلاحاً سکته مغزي مي گويند . \n");
                        transaction3.replace(R.id.frame_layout, fragment3);
                        transaction3.addToBackStack(null);
                        transaction3.commit();
                        break;

                    case 4:
                        FragmentTransaction transaction4 = getFragmentManager().beginTransaction();
                        InfoIllness fragment4 = new InfoIllness();
                        fragment4.SetTitle("سکته مغزي ");
                        fragment4.SetBody("سکته مغزي يک آسيب ناگهاني به سيستم عصبي است\n" +
                                " که طي آن ، جريان خوني که تامين کننده مواد غذايي\n" +
                                " و اکسيژن قسمتي از مغز مي باشد قطع مي شود . در نتيجه\n" +
                                " عملکرد عصبي ناحيه آسيب ديده دچار اشکال مي شود .\n" +
                                " شدت اختلال عملکرد ، براساس ناحيه ي درگير و وسعت ان متفاوت مي باشد که اين وضعيت را اصطلاحاً سکته مغزي مي گويند . \n");
                        transaction4.replace(R.id.frame_layout, fragment4);
                        transaction4.addToBackStack(null);
                        transaction4.commit();
                        break;

                }
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
