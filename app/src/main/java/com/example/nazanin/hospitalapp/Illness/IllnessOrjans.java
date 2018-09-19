package com.example.nazanin.hospitalapp.Illness;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.nazanin.hospitalapp.MainActivity;
import com.example.nazanin.hospitalapp.R;


public class IllnessOrjans extends Fragment {
    Button btn1, btn2 , btn3, btn4, btn5, btn6, btn7;
    private ImageButton backButton;



    public static IllnessOrjans newInstance() {
        IllnessOrjans fragment = new IllnessOrjans();

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
        View v = inflater.inflate(R.layout.fragment_illness_orjans, container, false);
        btn1 = v.findViewById(R.id.btn_anjinOrjans);
        btn2 = v.findViewById(R.id.btn_tashanojOrjans);
        btn3 = v.findViewById(R.id.btn_sekteGhalbiOrjans);
        btn4 = v.findViewById(R.id.btn_sekteMaghziOrjans);
        btn5 = v.findViewById(R.id.btn_shekameHad);
        btn6 = v.findViewById(R.id.btn_masmumiatOrjans);
        btn7 = v.findViewById(R.id.btn_masmumiatCOorjans);
        //find back arrow vector asset from mainactivity
        backButton= ((MainActivity)getActivity()).findViewById(R.id.backButton);
        backButton.setVisibility(View.VISIBLE);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check if backstack is more than 0 close fragment

                int backStackCount = getFragmentManager().getBackStackEntryCount();
             //   Toast.makeText(getContext(),String.valueOf(backStackCount),Toast.LENGTH_SHORT).show();
                if (backStackCount >= 1) {

                    getFragmentManager().popBackStack();
                }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              FragmentTransaction transaction = getFragmentManager().beginTransaction().addToBackStack(null);
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
              transaction.commit();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                InfoIllness fragment = new InfoIllness();
                fragment.SetTitle("تشنج");
                fragment.SetBody("تشنج\u200C (كه\u200C حمله\u200C تشنجي\u200C يا حمله\u200C غش\u200C هم\u200C نام\u200C دارد) شامل\u200C انقباضات\u200C غيرارادي\u200C تعداد زيادي\u200C از عضلات\u200C بدن\u200C است\u200C. اين\u200C وضعيت\u200C  ناشی از تغییر ناگهانی و موقتی در عملکرد مغز است که بعلت تخلیه الکتریکی گروهی از سلولهای عصبی مغز ایجاد میشود. تخلیه الکتریکی همزمان، حمله ای و گذرای سلولهای عصبی،تغییراتی را در فعالیت ذهنی و رفتار فرد ایجاد می کند که از دوره زمانی بدون توجه تا بدون واکنش به تحریکات و انقباض پرشی عضلات متغیر است. تشنج یک بیماری نیست بلکه نشانه ای از نقایص زمینه ای، آسیب یا بیماری است.");
                transaction.replace(R.id.frame_layout, fragment);
                transaction.commit();

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction().addToBackStack(null);
                InfoIllness fragment = new InfoIllness();
                fragment.SetTitle("سکته قلبی ( انفارکتوس میوکارد ) ");
                fragment.SetBody("سکته قلبی ( انفارکتوس میوکارد ) چیست ؟ \n" +
                        "یک وضعیت اورژانسی است و رمانی رخ می دهد که عروق کرونر ( عروقی که به قلب خون رسانی می کنند ) دچار کاهش ناگهانی یا قطع کلی جریان خون می شوند و اجازه عبور خون کافی را به عضله قلب نمی دهند در صورتی که درمان سریع برای آن انجام نگردد باعث مرگ عضله قلبی و سکته قلبی می شود . \n");
                transaction.replace(R.id.frame_layout, fragment);
                transaction.commit();

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction().addToBackStack(null);
                InfoIllness fragment = new InfoIllness();
                fragment.SetTitle("سکته مغزي ");
                fragment.SetBody("سکته مغزي يک آسيب ناگهاني به سيستم عصبي است\n" +
                        " که طي آن ، جريان خوني که تامين کننده مواد غذايي\n" +
                        " و اکسيژن قسمتي از مغز مي باشد قطع مي شود . در نتيجه\n" +
                        " عملکرد عصبي ناحيه آسيب ديده دچار اشکال مي شود .\n" +
                        " شدت اختلال عملکرد ، براساس ناحيه ي درگير و وسعت ان متفاوت مي باشد که اين وضعيت را اصطلاحاً سکته مغزي مي گويند . \n");
                transaction.replace(R.id.frame_layout, fragment);
                transaction.commit();

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction().addToBackStack(null);
                InfoIllness fragment = new InfoIllness();
                fragment.SetTitle("شکم حاد ");
                fragment.SetBody("اصطلاح درد حاد شكمي به حالتي اطلاق مي شود كه درد معمولا در كمتر از 48 ساعت ( حداكثر كمتر از ده روز ) بصورت ناگهاني در شكم شروع شده است و ممكن است ناشي از حوادث حاد داخل شكمي باشد كه نياز به دخالت سريع تيم جراحي دارد و يا ممكنست ناشي از مشكلات خارج از پريتوان باشد كه نياز به مداخله درماني خواهد داشت. در هر صورت تا رد بيماريهايي كه نياز به جراحي اورژانس دارند بايد بيمار مورد بررسي سريع قرار گيرد.\n" +
                        "درد معمولاً تظاهر عمده و غالب شکم حاد است. براى مشخص شدن علت درد بايد محل، نحوه شروع و ادامه، و ماهيت درد مشخص باشد\n" +
                        "حس احشائى عمدتاً توسط فيبرهاى آوران C که در ديواره  احشاء توخالى و کپسول ارگان\u200Cهاى توپر قرار دارند، منتقل مى\u200Cشود. برخلاف درد پوستي، درد احشائى يا با اتساع، التهاب، يا ايسکمى که باعث تحريک نورون\u200Cهاى گيرنده مى\u200Cشود، و يا با درگيرى مستقيم اعصاب حسى (نظير انفيلتراسيون بدخيمى\u200Cها) آغاز مى\u200Cشود. درد احشائى غالباً به\u200Cدليل ورود اعصاب حسى به دو طرف نخاع در خط ميانى احساس مى\u200Cشود.\n");
                transaction.replace(R.id.frame_layout, fragment);
                transaction.commit();

            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction().addToBackStack(null);
                InfoIllness fragment = new InfoIllness();
                fragment.SetTitle("مسمومیت");
                fragment.SetBody("مسمومیت هایی که برخی از آنها در کشور ما شایع است خیلی وقت ها به دلیل ناآگاهی و نداشتن اطلاعات رخ می دهد. گاهی هم علت مسمومیت این است که فرد قصد خودکشی داشته است. آمارها می گوید در سال های اخیر مسومیت با مواد مخدر بیشتر از انواع دیگر مسمومیت شیوع داشته و بعد از آن مسمومیت با سموم دفع آفات و الکل \n" +
                        "در مورد فرد مسموم و چگونگی برخورد با او باورهای غلطی بین مردم وجود دارد. برخی معتقدندباید او را وادار به استفراغ کرد و برخی دیگر مقدار زیادی شیر یا آب به مصدوم می دهند که این اقدام ها گاهی کار را خراب تر از آنچه هست، می کند.\n");
                transaction.replace(R.id.frame_layout, fragment);
                transaction.commit();

            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction().addToBackStack(null);
                InfoIllness fragment = new InfoIllness();
                fragment.SetTitle("مسمومیت با منواکسید کربن co (گازگرفتگی)");
                fragment.SetBody("مسمومیت با منواکسید کربن به دنبال حوادث خانگی ،بدنبال نقص فنی و یا در نتیجه اقدام به خودکشی رخ     می دهد . منو اکسید کربن بیش از هر ماده سمی دیگری به استثنای (الکل) منجر به مرگ افراد می شود.\n" +
                        "کلیه موادی که به عنوان سوخت استفاده می کنیم اگر با مقدار کافی اکسیژن و به طور کامل بسوزند گازی بنام دی اکسید کربن (co2 ) ایجاد می کنند که وارد هوا می شود ولی اگر سوختن به طور ناقص انجام شود گاز سمی و بی بوی منو اکسید کربن تولید می شود.\n");
                transaction.replace(R.id.frame_layout, fragment);
                transaction.commit();

            }
        });

        return v;
    }

}
