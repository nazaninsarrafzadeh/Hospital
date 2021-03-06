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
                        fragment1.SetTitle("سکته قلبی ( انفارکتوس میوکارد ) ");
                        fragment1.SetBody("سکته قلبی ( انفارکتوس میوکارد ) چیست ؟ \n" +
                                "یک وضعیت اورژانسی است و رمانی رخ می دهد که عروق کرونر ( عروقی که به قلب خون رسانی می کنند ) دچار کاهش ناگهانی یا قطع کلی جریان خون می شوند و اجازه عبور خون کافی را به عضله قلب نمی دهند در صورتی که درمان سریع برای آن انجام نگردد باعث مرگ عضله قلبی و سکته قلبی می شود . \n");
                        transaction1.replace(R.id.frame_layout, fragment1);
                        transaction1.addToBackStack(null);
                        transaction1.commit();
                        break;

                    case 2:
                        FragmentTransaction transaction2 = getFragmentManager().beginTransaction();
                        InfoIllness fragment2 = new InfoIllness();
                        fragment2.SetTitle("فشار خون");
                        fragment2.SetBody("فشار خون از عواملی است که برای ادامه حیات به آن نیاز داریم.\n" +
                                "فشار خون نیرویی است که همزمان با پمپ کردن خون توسط قلب به دیواره، عروق خونی وارد می شود. فشار خون ایده ال معمولاً 120/80 می باشد ولی می تواند بعد از ورزش استراحت یا تغییرات روحی و روانی بالا و پایین رود. فشار خون شما همیشه در یک حد ثابت نیست از یک روز به روز دیگر، از یک لحظه به لحظه دیگر و بر حسب نیاز بدن در حال تغییر است برای مثال حوالی9 صبح فشار خود شما حداکثر مقدار خود را دارد و عصرها فشار خون کاهش یافته و در شب به حداقل میزان خود می رسد.\n" +
                                "فشار خون با عواملي نظیر وضعیت بدن، فعالیت مغز، فعالیت گوارش، فعالیت عضلانی، تحریکات عصبی، تحریکات دردناک، مثانه پر، دمای هوا، میزان سر و صدا، مصرف سیگار، الکل، قهوه، چای و دارو در طول روز تغییر می کند اما موقتی است.\n" +
                                "فشارخون شامل دو رقم است . رقم بزرگتر فشار خون سيستولي است و مربوط به زماني است كه قلب منقبض جمع ميشود و خون را به درون رگهاي بدن مي راند. رقم كوچكتر فشار خون دياستولي است و مربوط به زماني است كه قلب مابين دو انقباض در حال استراحت است . واحدي كه فشار خون باآن اندازه گرفته مي شود ميليمتر جيوه  نام دارد .\n" +
                                "فشار خون بالا چیست؟\n" +
                                "به حداقل دوبار فشار خون بیش از 140/90 فشار خون بالا گفته می شود.\n" +
                                "با افزایش سن احتمال بروز فشار خون بالا بیشتر می شود و در افراد بالای60 سال شیوع فشار خون بالا به 50 درصد می رسد یعنی از هر دو نفر یک نفر مبتلا به فشار خون بالاست بنابراین در طول زندگی نیاز به کنترل دقیق فشار خون می باشد.\n");
                                transaction2.replace(R.id.frame_layout, fragment2);
                        transaction2.addToBackStack(null);
                        transaction2.commit();
                        break;

                    case 3:
                        FragmentTransaction transaction3 = getFragmentManager().beginTransaction();
                        InfoIllness fragment3 = new InfoIllness();
                        fragment3.SetTitle("فیبریلاسیون دهلیزی");
                        fragment3.SetBody("هدف کلی:\n" +
                                "آگاهی و شناخت بیماری و چگونگی مراقبت از این افراد و آموزش مراقبت از خود\n" +
                                "اهداف رفتاری\n" +
                                "شناختی :  \n" +
                                "•\tشناخت ماهیت بیماری، علایم و روش های تشخیصی و درمان\n" +
                                "روانی –حرکتی : \n" +
                                "•\tاجرای صحیح مراقبت های پرستاری در رابطه با بیماری\n" +
                                "•\tآموزش صحیح به بیماران جهت خودمراقبتی در منزل و پیگیری مجدد\n" +
                                "عاطفی : \n" +
                                "•\tدرک اهمیت اصول صحیح مراقبت های پرستاری\n" +
                                "•\tدرک اهمیت آموزش صحیح به بیمار \n" +
                                "\n" +
                                "فیبریلاسیون دهلیزی چیست ؟\n" +
                                "\n" +
                                "\n" +
                                "در شرایط طبیعی قلب با ضربان منظمی دچار انقباض شده و سپس شل می شود . برخی از سلولهای قلب، پیامهایی الکتریکی ایجاد می کنند که سبب انقباض قلب و پمپ خون می شود . این سیگنال های الکتریکی در نوار قلب (الکتروکاردیوگرام) یا ECG نشان داده می شوند . پزشک شما ECG شما را خوانده و مشخص می کند که آیا پیامهای الکتریکی قلب شماطبیعی هستند یا خیر؟\n" +
                                "قلب شما دارای یک ضربانساز طبیعی است که گره سینوسی نامیده می شود و پیامهای الکتریکی را ایجاد می کند . این پیامها سبب انقباض قلب و پمپ کردن خون می شوند .در فیبرلاسیون دهلیزی دو حفره فوقانی قلب یعنی دهلیزهای قلب، فاقد ضربان مطلوب می باشند . بجای ضربان منظم و الگوی طبیعی ، دهلیزها به شکل غیر منظم و تند منقبض می شوند و همین امر سبب تشکیل لخته خون در قلب و پرتاب شدن آن به سایر ارگان های حیاتی بدن از جمله قلب، مغز و ایجاد سکته مغزی و حمله ی قلبی می شود.\n" +
                                "پمپ کردن مناسب خون توسط قلب مهم است چرا که با پمپ مناسب خون توسط قلب ،نیازهای اکسیژن و تغذیه ای بدن تامین می شوند. شما می توانید با فیبریلاسیون دهلیزی زندگی کنید، اما این مشکل منجر به سایر مشکلات ریتم قلبی مانند خستگی مزمن، نارسایی قلبی و بدتر از همه افزایش احتمال سکته مغزی و حمله قلبی می شود. جهت کنترل این مشکل مراجعه منظم به پزشک ضروری می باشد .\n" +
                                "\n" +
                                "من چگونه بفهمم که مبتلا به فیبریلاسیون دهلیزی هستم ؟\n" +
                                "دراین قسمت برخی از علایمی که ممکن است شما تجربه کنید ذکر میشود :\n" +
                                "_   ضربان سریع و نامنظم.\n" +
                                "_   تپش قلب یا احساس ضربه سریع درداخل قفسه سینه.\n" +
                                "_   سرگیجه ، تعریق و درد یا فشار در قفسه سینه.\n" +
                                "_   تنگی نفس ، اضطراب.\n" +
                                "_   خسته شدن زودرس به هنگام ورزش .\n" +
                                "_   غش کردن (سنکوپ)\n" +
                                "\n" +
                                " چه چیزی می تواندفیبریلاسیون دهلیزی رااصلاح نماید ؟\n" +
                                "برخی مواقع فیبریلاسیون دهلیزی را با شوک الکتریکی می توان درمان نمود. ممکن است این شوک ضربان قلب را به شکل طبیعی در آورد .\n" +
                                " ممکن است شما از داروهایی مانندمهارکننده های بتا یا داروهای ضدآریتمی جهت کمک به برگشت ریتم قلبتان به حالت طبیعی، یاازداروهای دیژیتال، مهارکننده های کانال کلسیم یاآمیودارون جهت کمک به آهسته نمودن ضربان قلبتان استفاده کنید.\n" +
                                "ممکن است شما نیاز به جراحی ، ضربان ساز یا سایر اعمال پزشکی داشته باشید. این امر بستگی به علت زمینه ای و سطح ناتوانی شما دارد .\n" +
                                "\n" +
                                "لازم است بدانید فیبریلاسیون دهلیزی خطر ابتلا به سکته مغزی و حمله قلبی را افزایش می دهد، بنابرابن در مورد حمله قلبی و سکته مغزی آموزش های لازم را ببینید. هرچه زمان بیشتری بگذرد، مغز یا قلب آسیب بیشتری می بیند. در صورتی که دچار علائم سکته مغزی یا حمله قلبی شدید، با ۱۱۵ تماس بگیرید و فورا به بیمارستان مراجعه کنید.\n" +
                                "\n" +
                                "  من چگونه می توانم خطر سکته مغزی را کاهش دهم ؟\n" +
                                "ممکن است پزشک شما داروهایی را جهت پیشگیری از ایجاد لخته خون برای شما تجویز نماید؛ دو نمونه از این داروها، داروهای ضدانعقادی و ضدپلاکتی مانند وارفارین وآسپرین می باشند .\n" +
                                "همواره به پزشک ، دندانپزشک و داروساز خود بگویید که از  وارفارین یاآسپرین  استفاده می کنید .\n" +
                                "اگر دچار هر گونه خونریزی یا کبودشدگی غیر طبیعی یا سایر مشکلات شدید، فورا با پزشک خود مشورت کنید .\n" +
                                "اگر قرص وارفارین مصرف می نمایید در فواصلی که پزشکتان آن را تعیین می نماید ازمایش خون   PT , INR بدهید.این فواصل نباید بیشتر از یک ماه باشد.\n" +
                                "\n" +
                                "علائم هشدار دهنده حمله قلبی یا سکته کدامند؟\n" +
                                "برخی از حملات قلبی ناگهانی و شدید هستند، اما اکثر آنها به آهستگی آغاز می شده و همراه با احساس درد و ناراحتی خفیف و یک یا تعداد بیشتری از علائم زیر هستند :\n" +
                                "_   احساس درد و ناراحتی در قفسه سینه.\n" +
                                "_   احساس ناراحتی در سایر نواحی فوقانی بدن مانند احساس درد در فک، کتف چپ، شانه ی چپ.\n" +
                                "_   تنگی نفس با یا بدون احساس ناراحتی در قفسه سینه.\n" +
                                "_   سایر علائم شامل تعریق سرد، تهوع، احساس سبکی سر.\n" +
                                "\n" +
                                "علائم هشدار دهنده سکته مغزی کدامند؟\n" +
                                "_   احساس ضعف یا بی حسی ناگهانی در صورت، بازو یا پا به ویژه در یک طرف بدن.\n" +
                                "_   کاهش سطح هوشیاری، مشکل در درک مفاهیم یا صحبت کردن به شکل ناگهانی.\n" +
                                "_   مشکل ناگهانی در دید یک یا هر دو چشم.\n" +
                                "_   اختلال در راه رفتن، سرگیجه، عدم تعادل یا عدم هماهنگی ناگهانی.\n" +
                                "_   سردرد شدید ناگهانی بدون علت مشخص.\n" +
                                "\n" +
                                "\n" +
                                "\n" +
                                "آیا پرسش یا توضیحی از پزشک\u200Cخود دارید؟\n" +
                                "دقایقی را برای یادداشت سوالات خود در ملاقات بعدی خود با پزشکتان اختصاص دهید. برای مثال:\n" +
                                "تعداد ضربان قلب من باید چقدر باشد؟\n" +
                                "من چگونه باید نبض خود را بگیرم؟\n");
                        transaction3.replace(R.id.frame_layout, fragment3);
                        transaction3.addToBackStack(null);
                        transaction3.commit();
                        break;

                    case 4:
                        FragmentTransaction transaction4 = getFragmentManager().beginTransaction();
                        InfoIllness fragment4 = new InfoIllness();
                        fragment4.SetTitle("نارسایی قلبی");
                        fragment4.SetBody("هدف کلی:\n" +
                                "آگاهی و شناخت بیماری و چگونگی مراقبت از این افراد و آموزش مراقبت از خود\n" +
                                "اهداف رفتاری\n" +
                                "شناختی :  \n" +
                                "•\tشناخت ماهیت بیماری، علایم و روش های تشخیصی و درمان\n" +
                                "روانی –حرکتی : \n" +
                                "•\tاجرای صحیح مراقبت های پرستاری در رابطه با بیماری\n" +
                                "•\tآموزش صحیح به بیماران جهت خودمراقبتی در منزل و پیگیری مجدد\n" +
                                "عاطفی : \n" +
                                "•\tدرک اهمیت اصول صحیح مراقبت های پرستاری\n" +
                                "•\tدرک اهمیت آموزش صحیح به بیمار \n" +
                                "\n" +
                                "نارسائی قلبی چیست؟\n" +
                                "نارسائی قلب یکی از شایع ترین علل مراجعه به بیمارستان در افراد 65 سال یا بیشتر می باشد معمولاً سال ها طول می کشد تا نارسائی قلب ایجاد شود در طول هفته ها و ماهها بدنبال ضعیف تر شدن قلب و توانایی کمتر آن برای پمپ کردن خون بر اساس نیازهای بدن ایجاد می شود.\n" +
                                "نارسایی قلب به دلیل عدم توانایی قلب در پمپاژ کافی خون برای رفع نیاز بافتها به اکسیژن و مواد مغذی ایجاد می شود.\n" +
                                "علائم و نشانه ها\n" +
                                "•\tتنگی نفس به هنگام دراز کشیدن و تنگی نفس حمله ای شبانه\n" +
                                "•\tورم دستها و پاها که به صورت گوده گذرا باشد\n" +
                                "•\tسرفه خشک یا مرطوب، وجود خلط کف آلودگاهی صورتی رنگ\n" +
                                "•\tخستگی، تعریق، کیجی، بی قراری و اضطراب و سبکی سر ، سردرد\n" +
                                "•\tبی اشتهایی ، تهوع و استفراغ، ضعف و شب ادرای\n" +
                                "•\tافزایش وزن به علت تجمع مایع در بدن\n" +
                                "علل نارسایی قلب چیست؟\n" +
                                "•\tعدم دریافت جریان خون کافی به قلب به دلیل گرفتگی سرخرگهاي کرونری\n" +
                                "•\tآسیب به عضله قلبی ناشی از حمله قلبی پیشین\n" +
                                "•\tنقص مادرزادی قلب\n" +
                                "•\tبیماری دریچه ای قلب\n" +
                                "•\tعفونت قلب و یا دریچه های قلب\n" +
                                "•\tفشار خون بالا\n" +
                                "•\tبیماری عضلات قلب (کاردیومیوپاتی)\n" +
                                "درمان\n" +
                                "اهداف کلی درمان نارسایی قلبی\n" +
                                "کاهش علائم و نشانه های بیماری جهت افزایش عملکرد بهتر قلبی و افزایش کیفیت زندگی و افزایش طول عمر می باشد .\n" +
                                "درمان بر اساس شدت بیماری متفاوت است ممکن است شامل داروها بصورت خوراکی و تزریق وریدی باشد. تغییرات در سبک زندگی، اکسیژن رسانی و عمل های جراحی باشد.\n" +
                                "\n" +
                                "\n" +
                                "داروهای رایج مورد استفاده در درمان نارسایی قلب\n" +
                                "آنالاپریل، لوزار، هیدرولازین، ایزوسورباید، متورال، کارویدولول، لازیکس و هیدروکلرو تيازید و اسپیرنولاکتون باعث کاهش فشار خون و کاهش بار قلب و کاهش علائم بیماری مي شود .\n" +
                                "دیگوگسین باعث افزایش قدرت انقباض قلب و کاهش علائم بیماری می شوند .\n" +
                                "\n" +
                                "نکات آموزشی: \n" +
                                "فعالیت و استراحت:\n" +
                                "•\tمدد جوی عزیز به شما توصیه می شود که درمرحله حاد بیماري ، در طول روز استراحت کافی داشته باشید و درزمان استراحت ، براي کاهش تنگی نفس بهتراست سربستر را 20 الی 30 سانتیمتر بالا برده ودرحالت نشسته یا نیمه نشسته قرار بگیرید.\n" +
                                "•\tدرصورتیکه درحالت درازکش دچارتنگی نفس می شوید بهتر است لبه ي تخت بنشینید و پاهاي خود را  آویزان روي صندلی قرارداده و دستها وسر خود را روي میزٍ بالاي تخت قراردهید .\n" +
                                "•\tپس از بهتر شدن بیماري ، فعالیت خود را به آهستگی و با کمک دیگران شروع کنید و کم کم آنرا افزایش دهید.\n" +
                                "•\tبراي جلوگیري از سرگیجه به آهستگی تغییروضعیت دهید و از حالت نشسته به ایستاده درآیید.\n" +
                                "•\tپس از هر بار فعالیت کمی استراحت نیز داشته باشید .\n" +
                                "•\tباتوجه به شرایط، فعالیت خود را افزایش دهید می توانید ورزش هایی مانند پیاده روي ، شنا ودوچرخه سواري انجام دهید ، درصورتیکه قادر به تحمل فعالیت نیستید ، بلافاصله آنرا متوقف کنید .\n" +
                                "•\tازقرارگرفتن در معرض هواي خیلی سرد یاگرم خودداري کنید و درهواي سرد روي بینی و دهان خود را با شالگردن بپوشانید و لباس گرم و مناسب استفاده کنید. همچنین بهتر است فعالیت خود را در موقعی از روز که هوا معتدل است انجام دهید .\n" +
                                "\n" +
                                "\n" +
                                "تغذیه\n" +
                                "•\tبه شما توصیه می شود درغذاي خود از نمک(سدیم) کمتر استفاده نمایید ، هر یک گرم نمک تقریبا\" 400 میلیگرم سدیم دارد . میزان سدیم مورد نیاز در رژیم غذایی افراد سالم 3 الی 10 گرم در روز است ،ولی لازم است شما مصرف آنرا به کمتر از 1 گرم در روز محدود نمایید ، یعنی به هنگام طبخ و صرف غذا به آن نمک اضافه نکنید و از مصرف غذاهاي نمک دار نیز خودداري نمایید ، زیرا این مقدار سدیم در مواد خام غذایی بدون  اضافه کردن نمک وجود دارد . ولی براي خوش طعم کردن غذاها می توانید از آبلیمو ، گیاهان معطر ، میخک ، فلفل فرنگی و مرکبات استفاده کنید.\n" +
                                "•\tمواد غذایی باسدیم فراوان شامل : گوشت نمک سود شده ، گوشتهاي آماده و غذاهاي کنسرو شده ، سوسیس ، همبرگر، انواع سسها ، ترشی ، شورها ، ادویه جات و برخی پنیرها می باشد که لازم است از خوردن آنها خودداري کنید.\n" +
                                "•\tغذاهایی مانند : مرغ ، برنج ، سیب زمینی، سدیم کمی دارند ، از این دسته از مواد غذایی     می توانید استفاده کنید.\n" +
                                "•\tبرچسب مواد غذایی، نوشیدنی ها و غذاهاي آماده را از نظرمیزان سدیم کنترل کنید. همچنین داروهایی مانند آنتی اسیدها (شربتهاي معده) ، مسهل ها ، شربت ضد سرفه وقرصهاي مسکن ممکن است حاوي سدیم فراوان باشند ، بنابراین بدون نسخه پزشک دارویی را مصرف نکنید.\n" +
                                "•\tتعداد وعده هاي غذایی خود را بیشتر ، ولی حجم آنرا کم کنید و از مصرف مواد محرك مانند : قهوه ، مواد حاوي کافئین ، الکل و سیگار خودداري نمایید.\n" +
                                "•\tبسته به وضعیت خود و با نظر پزشک محدودیت مصرف مایعات را رعایت کنید.\n" +
                                "•\tممکن است نیاز به محدود کردن مایعات به کمتر از 5/1 لیتر در روز باشد برای رفع خشکی دهانتان می توانید از آبنبات سفت و آدامس بدون قند استفاده کنید و یا دهانتان را شستشو دهید. البته در صورتی که سدیم موجود در رژیم غذایی خود را کنترل نمایید و داروی ادرارآور مصرف کنید، معمولاً مصرف مایعات خودبه خود تنظیم می شودو نیازی به محدودیت شدید مایعات ندارید، مگر اینکه دستور پزشکی خاصی داشته باشید.\n" +
                                "•\tجهت بررسی حجم مایعات بدنتان ، هر روز صبح در یکساعت مشخص پس از تخلیه ي مثانه وزن خود را کنترل و یادداشت نمایید و هر گونه افزایش  وزن ناگهانی به میزان (4/1-9/0) کیلوگرم در روز یا (5/2-3/2) کيلوگرم در عرض یک هفته را گزارش دهید.\n" +
                                "•\tبسته به نوع داروی ادرار آوری که مصرف می کنید ممکن است یک رژیم غذایی با پتاسیم کم یا زیاد به شما توصیه شود. مواد غذایی با پتاسیم بالا شامل: موز، مرکبات، سبزیجات برگدار سبز، گوجه فرنگی، خرما، زردآلو، هلو، انجیر، و غذاهای دریایی می باشد.\n" +
                                "در مورد مصرف داروهای قلبی\n" +
                                "مددجوي عزیز لطفا\" در صورتیکه دیگوگسین مصرف میکنید:\n" +
                                "حتما\" قبل از مصرف آن نبض خود را کنترل کنید و در صورتیکه کمتر از 60 ضربه در دقیقه بود به پزشک خود اطلاع دهید .\n" +
                                "حتما\" به علایم مسمومیت با دیگوگسین مانند : بی اشتهایی ، گیجی ، تهوع و استفراغ ، خستگی و اختلالات  بینایی توجه داشته باشید و در صورت بروز این علایم به پزشک خود مراجعه نمایید .\n" +
                                "به خاطر داشته باشید که مصرف همزمان دیگوگسین با برخی از مواد غذایی پرفیبر مانند : سبزیجات خام ، میوه ها ، سبوس ، داروهاي آنتی اسید (شربت معده)، داروهاي ضد اسهال وملین ها باعث کاهش جذب دیگوگسین میشود ، بنابراین از مصرف همزمان آنها خودداري کنید.\n" +
                                "در صورت مصرف داروهاي ادرارآور:\n" +
                                "•\tاین داروها را در ابتداي صبح مصرف کنید.\n" +
                                "•\tوزن و فشار خون خود را تحت نظر پزشک کنترل نمایید.\n" +
                                "•\tعوارض این داروها از جمله : گیجی ، نبض نامنظم ، شلی عضلانی ، کرختی و مورمور شدن دست و پا ، اسهال ، تهوع و درد شکمی ، خشکی دهان ، تشنگی زیاد ، تب ، ضعف و خستگی را در نظر داشته باشید.\n" +
                                "•\tبصورت دوره ای جهت اندازه گیری سدیم و پتاسیم خون به پزشک مراجعه کرده و آزمایش انجام دهید.\n" +
                                "•\tتوصیه می شود برای جلوگیری از عفونتهاي تنفسي از رفتن به محلهای آلوده و شلوغ و تماس با افراد عفونی خوداری کنید.\n" +
                                "•\tاول پاییز جهت پیشگیری از آنفولانزا به پزشک خود مراجعه کرده و واکسن بزنید.\n");
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
