package com.example.nazanin.hospitalapp;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;


public class DrugsList extends Fragment {



    String [] list = {"اپی نفرین  (Epinephrine)" , "آتروپین  (Atropin)","آمیودارون  (Amiodarone)",
            "آدنوزین  (Adenosine)", "دوپامین  (Dopamin)", "دوبو تامین  (Dobutamine)", "دیگوکسین  (Digoxin)",
            "کلسیم گلوکانات  (Calcium Gluconate)", "لیدو کائین  (Lidocaine)", "وراپامیل  (Verapamil)" ,
            "فورزماید  (Furosemide)", "منیزیم سولفات  (Magnesium Sulfate)", "پروپرانولول  (Propranolol)" ,
            "نیتروگلیسرین  (Nitroglycerin)" , "هپارین  (HEPARIN SODIUM)", "بیکربنات سدیم  (Sodium  bicarbonate)" };

    String [] dasteList = {"آدرنرژیک  (گشادکننده برونش – بالابرنده فشارخون )", "پاراسمپاتولیتیک (آنتی کولینزژیک) – ضد آریتمی",
            "مشتق بنزوفوران (ضدآریتمی فوق بطنی و بطنی)", "نوکلئوزید (ضد آریتمی)",
            "آدرنرژیک – سمپاتومیمتیک (اینوتروپ قلبی-تنگ کننده ی عروق)", "آدرنژیک – آگونیست بتا 1 (محرک قلب)",
            "گلیکوزید دیژیتال (ضد آرتیمی – اینوتروپیک)", "جانشین کلسیم (کمک در تعادل الکترولیت ها)",
            "مشتق آمیدی (ضد آرتیمی – بی حس کننده موضعی)", "مسدد کانال کلسیم (ضد آنژین صدری – ضد هیپرتانسیون – ضد آرتیمی)",
            "لوپ دیوریتیک (ضد هایپرتانسیون - دیورتیک)", "ضد تشنج",
            "مسدد گیرنده ی بتا آدرنرژیک (ضد هایپرتانسیون – درمان کمکی میگرن)", "نیترات (ضد آنژین – متسع کننده ی عروقی)",
            "ضد انعقاد", "قلیایی کننده سیستمیک "};

    String [] sheklList = {"آمپول   mg/ml    1","آمپول\tmg/ml   5/0 \n" +
            "قرص\tmg 5/0\n","آمپول  150 mg/ml\n" +
            "قرص  200mg\n", "آمپول   3  mg/ml","آمپول 200 mg","آمپول ml20/mg250",
            "قرص mg 25/0\n" +
                    "آمپول mg / 2 ml    5/0\n","آمپول %10","آمپول %1 - %2 ( ml  5)\n" +
            "آمپول %1 - %2 - %4 (ml   50)\n",
            "قرص mg40 و mg 80\n" +
                    "آمپول  ml 2    /   mg 5\n",
            "قرص mg40 \n" +
                    "آمپول mg/ml 10\n","آمپول 10% - 20% - 50%",
            "آمپول mg/ml  1","پرل زیر زبانی – پماد 2% - آمپول mg/ml  1 – اسپری",
            "آمپول 5000 واحدی در 1 سی سی    و آمپول 10000 واحدی در 1 سی سی","ویال 7.5% \t50 سی سی (  هریک سی سی 9/0 میلی  اکی والان است.)\n" +
            "ویال 4/8%\t10 سی سی (هر یک سی سی یک میلی اکی والان است.)\n" };

    String [] antiDutList = {"در صورت هیپرتانسیون، فنتولامین  (آلفا بلوکر) – در صورت آریتمی (بتا بلوکر)",
            "در بزرگسالان: نئوستیگمین\n" +
                    "درکودکان: فیزوستیگمین\n",
            "دوپامین","آنتی دوت اختصاصی ندارد.","فنتولامین","آنتی دوت اختصاصی ندارد.",
            "زیلوکائین","در صورت ایجاد عوارض، درمان عوارض دارو","در صورت ایجاد عوارض، درمان عوارض دارو",
            "آنتی دوت اختصاصی ندارد.","آنتی دوت اختصاصی ندارد.",
            "گلونات کلسیم","آنتی دوت اختصاصی ندارد.","آنتی دوت اختصاصی ندارد.","آنتی دوت اختصاصی ندارد.","آنتی دوت اختصاصی ندارد."};

    String [] mecanismList = {"\uD83D\uDD39 گشادکننده برونش- باعث افزایش فعالیت سمپاتیک شده و درنتیجه فعالیت قلب راافزایش داده وبا تنگ کردن عروق،افزایش فشارخون را بدنبال دارد .\n" +
            "\n" +
            "\uD83D\uDD39 درواکنش حساسیتی روی رسپتورهای آلفاوبتا اثر گذاشته ازآزادشدن هیستامین جلوگیری می کند.\n",
            "بلوک گیرنده های استیل کولین،افزایش ضربان قلب،کاهش حرکات دستگاه گوارشی،دستگاه ادراری و صفراوی و با اثرات آنتی کولینرژیک باعث جلوگیری از ترشح  بزاق و عرق می شود. سرعت تخلیه الکتریکی گره  SA را افزایش و دوره ی عدم پاسخ مؤثر گره  AV را کاهش می دهد.",
            "داروی ضدآریتمی که باعث بلوک کانال سدیم-پتاسیم-کلسیم می شود.\n" +
                    "افزایش دوره ای تحریک ناپذیری درتمام بافت قلب- افزایش سرعت هدایت درگره AV\n",
            "کاهش ضربان گره سینوسی دهلیزی-کاهش هدایت گره دهلیزی بطنی- افزایش مدت تحریک ناپذیری در گره SA",
            "داروی محرک سمپاتیک و محرک گیرنده های دوپامین- آلفا و بتا است ترشح نور اپی نفرین رادربدن افزایش می دهد. اثرات دوپامین وابسته به دوز است .",
            "بیشتر روی رسپتورهای بتا 1 و کمتر روی رسپتورهای بتا 2 و آلفا اثر می کند. این دارو باعث افزایش قدرت انقباض عضله ی قلب و بالا رفتن برون ده قلبی می شود. پره لود و افتر لود را نیز کاهش می دهد.",
            "دیگوکسین نیروی انقباضی قلب را افزایش و هدایت الکتریکی آن را کاهش می دهد. احتمالاً افزایش نیروی انقباضی عضله قلب، ناشی از مهار پمپ مبادله یون های سدیم و پتاسیم در غشای سلولی عضله قلب می باشد. بر اثر بلوک این پمپ سطح سدیم داخل سلولی افزایش می یابد و منجر به افزایش فعالیت پمپ  سدیم / کلسیم در غشای سلول های میوکارد می شود. حاصل نهایی این فرایند افزایش سطح یون های کلسیم در داخل سلول های میوکارد است که بر فعالیت انقباضی فیبرهای میوکارد افزوده می شود. این دارو سرعت هدایت قلبی را کاهش و دوره تحریک ناپذیری گره دهلیزی – بطنی را افزایش می دهد.",
            "کلسیم برای عملکرد صحیح دستگاه عصبی، عضلانی و اسکلتی ضروری است.کلسیم در عملکرد طبیعی قلب، کلیه، تنفس، انعقاد خون و نفوذپذیری مویرگ ها و غشاء سلولی، نقش مهمی را ایفا می کند. کلسیم همچنین به تنظیم آزادسازی و ذخیره ناقل های عصبی و هورمون ها، برداشت و اتصال اسیدهای آمینه، جذب ویتامین B12 کمک می کند.",
            "لیدوکائین در رقابت با کلسیم در نشستن بر روی گیرنده های غشائی عصبی باعث کنترل عبور سدیم از غشای سلولس می شود و مرحله دپولاریزاسیون پتاسیل عمل را کاهش می دهد. \n" +
                    "این اثرات با تثبیت برگشت پذیری غشای سلول های عصبی در نتیجه کاهش نفوذپذیری این غشاء به یون سدیم، شروع و هدایت امواج عصبی را متوقف می کند.در صورت جذب مقادیر زیاد لیدوکائین ابتدا می تواند اثر تحریکی و سپس اثر تضعیفی بر روی سیستم عصبی مرکزی داشته باشد.\n",
            "این دارو با کم کردن پس بار قلب موجب کاهش نیاز عضله به اکسیژن می گردد. این دارو موجب مهار اسپاسم عروق کرونری نیز می شود. همچنین عروق محیطی را متسع می کند .\n" +
                    "موجب کاهش هدایت در گره  AV  می گردد.\n",
            "این دارو موجب مهار باز جذب کلرو سدیم در لوله های پروگزیمال وقوس صعودی هنله می شود. همچنین این دارو باعث کاهش مقاومت عروق محیطی و افزایش GFR می شود.",
            "مهار آزاد سازی استیل کولین در محل اتصال عصب – عضله – مهار داخل شدن کلسیم به درون میومتر",
            "یک بتا بلوکر است و اثرات سمپاتیک را بر روی گیرنده های بتا مهار می کند. اثر ضد اریتمی دارد و باعث کاهش برون ده قلبی و کاهش ضربان قلب و کاهش قدرت انقباض قلب می شود و در نتیجه با کم کردن نیاز میوکارد به اکسیژن اثر ضد آنژینی دارد.",
            "این دارو باعث می شود تا نیاز میوکارد به اکسیژن کم شود که این اثر را با شل کردن عضلات صاف جدار عروق اعمال می نماید.",
            "از تبدیل فیبرینوژن به فیبرین و پروترومبین به ترومبین جلوگیری می کند. این کار بوسیله افزایش اثرات مهاری آنتی ترومبین III  انجام میشود.",
            "\uD83D\uDD39 بیکربنات سدیم یک داروی قلیایی کننده است که بعد از تجزیه ، یون بی کربنات را فراهم می سازد. مصرف بی کربنات بیش از مقداری که برای بافره کردن یون های هیدروژن ، سبب قلیایی شدن سیستمیک و هنگام دفع موجب قلیایی شدن ادرار می شود.\n" +
                    "\uD83D\uDD39 عملکرد آنتی اسید : به دنبال مصرف خوراکی  سدیم بی کربنات منجر به خنثی شدن اسید معده با مکانیسم ذکر شده می شود.\n"};

    String [] andicasionList = {"ایست قلبی (آسیستول ،VT.PEA  و VF بدون نبض) برادریکاردی علامت دار، آنافیلاکسی شدید-برونکواسپاسم (گشادکننده برونش)-واکنش افزایش حساسیت",
            "برادیکاردی سینوسی – مسمومیت با ارگانوفسفره- بلوک رفلکس واگر قبل از عمل – کاهش ترشحات بزاق و برونش درطی بیهوشی",
            "مقاوم به درمان (فیبریلاسیون بطنی) وتاکی کاردی بطنی ناپایدار- آنژین- فیبریلاسیون دهلیزی .  VT بدون نبض-PSVT -. WPW \n" +
                    "آریتمی های بطنی و PVC  های علامت دار (آریتمی قلبی مانند فیبریلاسیون بطنی .فیبریلاسیون دهلیزی و تاکیکاردی بطنی)\n",
            "تبدیل PSVT به ریتم سینوسی",
            "درمان کمکی در شوک برای افزایش برون ده قلبی-فشارخون و جریان ادراری - درمان کوتاه مدت نارسایی مزمن ،بعداز  CPR جهت حفظ گردش خون مغز",
            "در درمان بیماران با احتقان ریوی و برون ده قلبی  پایین – در بیماران هایپوتانسیون همراه با  احتقان ریوی و بدکاری بطن چپ",
            "نارسایی احتقانی قلب – فلوتر و فیبریلاسیون دهلیزی – آریتمی فوق بطنی – PSVT – PVC های مکرر",
            "هیپوکلسمی – مصرف بیش از حد سولفات منیزیوم – هایپرکالمی – در خلال انتقال خون – درمان سوختگی با اسید هیدروفلوریک و ایست قلبی",
            "آریتمی متعاقب MI – مسمومیت با دیژیتال – بی حس کننده ی موضعی ",
            "کنترل آنژین (پایدار مزمن) – کنترل آنژین ناپایدار در بیمارانی که قادر به تحمل دارو های مسدود کننده گیرنده بتا آدرنرژیک یا نیترات ها نیستند – کننترل فشار خون – آرتیمی قلبی و برخی سردردها مانند سردرد خوشه ای و میگرن – پیشگیری از تاکی کاردی فوق بطنی حمله ای تکرار شونده",
            "هایپرتانسیون – هایپر کلسمی – ادم حاد ریه – نارسایی ممن کلیه – افزایش جریان ادرار – نارسایی قلبی",
            "سولفات منیزیم تزریقی جهت پیشگیری از تشنج در پره اکلامپسی ، زایمان زودرس و بندرت در درمان آریتمی های قلبی (تاکی کاردی بطنی پایدار و تورساد دپونیت) مصرف می شود. به صورت تزریقی و خوراکی نیز در درمان هیپومنیزیمی استفاده شده است. به عنوان گشاد کننده برونش نیز مطرح است. محلول خوراکی آن مسهل اسموتیک رایجی است. ",
            "هیپرتانسیون – در درمان کمکی اضطراب – آنژین صدری – پیشگیری از میگرن","کاهش درد آنژین صدری – پروفیلاکسی حملات آنژینی – بحران هایپرتانسیون",
            "\uD83D\uDD39 در پیشگیری و درمان ترومبوز وریدهای عمقی و ترومبوآمبولی ریوی ، پیشگیری از ترومبوآمبولی \n" +
                    "\uD83D\uDD39 پیشگیری از آمبولی ، بعد از MI ، ترومبوز مغزی بدنبال سکته مغزی ، لخته در بطن چپ\n" +
                    "\uD83D\uDD39 مصرف در جراحی باز قلب\n" +
                    "\uD83D\uDD39 انعقاد منتشر داخل عروقی\n" +
                    "\uD83D\uDD39 باز نگه داشتن کاتترهای داخل وریدی\n" +
                    "\uD83D\uDD39 آنژین ناپایدار\n" +
                    "\uD83D\uDD39 اثر ضد انعقادی درترنسفیوژن خون و نمونه های خونی\n",
            "درمان اسیدوز متابولیک  -  برقراری دیورز قلیا یی - درمان هیپرکالمی - احیا قلبی ریوی"};

    String [] dozList = {"\uD83D\uDD39 واکنش های آلرژیک بالغین: mg 0/5-0/1 زیرجلدی از محلول 1:1000\n" +
            "کودکان: mg/kg0/01 زیرجلدی ازمحلول 1:1000\n" +
            "\n" +
            "\uD83D\uDD39 آنافیلاسکی شدید 1میلی گرم آهسته وریدی از محلول1:10000\n" +
            "\n" +
            "\uD83D\uDD39 ایست قلبی: بزرگسالان:داخل استخوانی یاداخل وریدی: IV/IO) 1mg  ) از محلول 1:10000 که هر 3تا 5 دقیقه بدون داشتن سقف دوز درحین احیا قلبی –ریوی قابل تکرار است.\n" +
            "کودکان: داخل استخوانی یا داخل وریدی: (01/0 mg IV/IO ) از محلول 1:10000 داخل تراشه : mg 1/0  از محلول 1:1000 درواقع 10 برابر دوز داخل استخوانی  یا داخل وریدی استفاده شود.\n",
            "برادیکاردی سینوسی :   mg iv  1-5/0 هر 3-5 دقیقه حداکثر تا  mg 3\n" +
                    "مسمومیت با ارگانوفسفره : درشروع mg 2   ( IM یا IV  ) وتکرار آن هر 60-5 دقیقه و درصورت شدید بودن مسمومیت mg6     ( IM یا IV  ) هر 60-5 دقیقه\n",
            "ایست قلبی ناشی از VF و  VT  300mg     (دوزنگهدارنده: 150 mg)\n" +
                    "پروتکل 24 ساعته در آریتمی ها شامل:  1-  150 میلی گرم  دارو در 100 سی سی سرم قندی رقیق شده  و طی 10 دقیقه انفوزیون می گردد. 2 –  360 میلی گرم دارو طی  6ساعت به میزان 1 میلی گرم در دقیقه انفوزیون می گردد 3- 540 میلی گرم دارو طی 18 ساعت به میزان 5/0 میلی گرم در دقیقه انفوزیون می گردد.\n",
            "6 mg  به صورت تزریق سریع وریدی ( IV PUSH) در عرض 1 تا 3 ثانیه و اگر موثر نبود 1تا 2 دقیقه بعد 12 میلی گرم دیگر داده  می شود و درصورت عدم پاسخگویی\n" +
                    "12 میلی گرم دیگر نیز داده  می شود.\n",
            "درمان کمکی بالغین واطفال : mcg/kg/min   5-2 انفوزیون وریدی",
            "mcg/Kg/min 2- 20","بالغین در شروع mg 5 – 1/0  خوراکی یا وریدی \n" +
            "دوز نگه دارنده :   5/0 – 125/0  میلی گرم در روز  (   خوراکی یا وریدی  )\n",
            "\uD83D\uDD39 هیپوکلسمی\tبالغین mEq: 7-14 یا   970 میلی گرم \n" +
                    "اطفال mEq: 1-7 یا    500-200 میلی گرم\n" +
                    "\uD83D\uDD39 هایپرکالمی      g 1-2\n" +
                    "\uD83D\uDD39 هیپرمنیزیومی    g 1-2\n" +
                    "\uD83D\uDD39 انتقال خون\tبالغین و کودکان: بعد از انتقال هر ml 100 خون ml 5/0 گلوکونات کلسیم\n",
            "Mg/kg    5/1  - 1  هر 5 –  3  دقیقه  (max:3mg/kg)\n" +
                    "دوز نگهدارنده      mg/min 1 – 4\n",
            "Mg      5- 5/2 \n" +
                    "در صورت عدم پاسخ          mg       10-5\n",
            "\uD83D\uDD39 هایپرتانسیون\tبالغین : mg40 خوراکی روزانه دو بار\n" +
                    "\uD83D\uDD39 هایپرکلسمی\tبالغین : mg  80 – 100 وریدی هر 1 تا 2 ساعت  یا   mg  120 خوراکی روزانه\n" +
                    "\uD83D\uDD39 ادم حاد ریه\tبالغین : mg   40 وریدی آهسته\n" +
                    "\uD83D\uDD39 نارسایی مزمن کلیه\tبالغین : mg  80 خوراکی روزانه\n",
            " گرم به صورت  IM  و      1- 4 گرم به صورت محلول 20- 10 درصد وریدی  (   4 گرم  در ml  250  از محلول 5%  DW یا محلول کلرور سدیم 19% رقیق شود.",
            "\uD83D\uDD39 هیپرتانسیون بالغین : mg    80 خوراکی روزانه در 4 – 2 دوز منقسم\n" +
                    "\uD83D\uDD39 درمان کمکی اضطراب  بالغین : mg  10 – 80 خوراکی روزانه 4 – 3 بار\n" +
                    "\uD83D\uDD39 آنژین صدری بالغین : mg   10 – 20 خوراکی روزانه 4 – 3 بار\n" +
                    "\uD83D\uDD39 پیشگیری میگرن بالغین : روزانه mg  80 خوراکی در دوزهای منقسم\n",
            "\uD83D\uDD39 کاهش درد آنژین صدری\tبالغین : یک عدد قرص زیر زبانی هر 5 دقیقه که تا    min   15- 30 می توان این دوز را  مجددا  تکرار کرد.\n" +
                    "\uD83D\uDD39 پروفیلاکسی حملات آنژینی   بالغین : یک عدد کپسول SR هر 12 – 8 ساعت\n" +
                    "\uD83D\uDD39 بحران هایپرتانسیون بالغین : mcg5 – 100 در دقیقه وریدی\n",
            "",""};

    String [] contraList = {"بیماری قلبی- دیلاتاسیون قلب-دیس ریتمی قلب-شوک (بجز آنافیلاکتیک)-گلوکوم زاویه بسته –زایمان",
            "حساسیت مفرط-خونریزی حاد-گلوکوم زاویه بسته-بزرگی پروستات-انسداد لوله های گوارشی",
            "اختلال شدید گره سینوسی – برادیکاردی- حاملگی-شیردهی",
            "حساسیت مفرط- بلوک قلبی درجه 2 و3 و در موارد آسم-پریکاردیت- تنگی دریچه ی قلبی  باید با احتیاط مصرف شود.",
            "فیبریلاسیون بطنی –تاکی کاردی-برادی کاردی-تهوع واستفراغ- تنگی نفس – پهن شدن   QRS",
            "حساسیت مفرط","علائم مسمومیت با گلیکوزید های قلبی – سندرم سینوس کاروتید حساس – فیبریلاسیون بطنی",
            "افزایش کلسیم ادرار – سنگ های کلسیمی در کلیه – فیبریلاسیون بطنی – سنگ کلیوی – مسمومیت با دیژیتال ها",
            "بلوک قلبی – اختلالات هدایت قلب – بیماری های عصبی – هیپوولمی",
            "نارسایی احتقانی قلب – شوک کاردیوژنیک – هیپوتانسیون شدید – شیردهی – بلوک AV",
            "آنوری – شیردهی و همچنین در مواقع آسیت – سیروز کبدی – باید با احتیاط مصرف شود.",
            "حساسیت مفرط – آنوری – دردهای فعال زایمان – بلوک قلبی","تاکی کاردی سینوسی – نارسایی قلبی – شوک کاردیوژنیک\n" +
            "در موارد هیپرتیروئیدیسم – اختلال عملکرد کبدی – بیماری تنفسی – نارسایی کرونر باید با احتیاط مصرف شود.\n",
            "تروما به سر – آنمی شدید – خونریزی مغزی – تامپوناد قلبی – هیپوتانسیون – افزایش فشار داخل جمجمه\n" +
                    "در موارد گلوکوم زاویه بسته – افزایش ICP باید با احتیاط مصرف شود. در بیماران inferior MI همراه با  RV MI منع نسبی دارد.\n",
            "خونریزی فعال  ، هموفیلی ، ترومبو سیتوپنی ، یا بیماری کبدی همراه با کمی پروترومبین خون ، موارد مشکوک به خونریزی داخل جمجمه ای ، ترومبوفلبیت چرکی ، ضایعات \n" +
                    "اولسراتیو غیر قابل دسترس (بخصوص در دستگاه گوارش) ، جراحات زخمی باز ، از بین رفتن وسیع پوست ، کمبود اسید آسکوربیک و سایر مواردی که موجب نفوذپذیری مویرگ ها می شود. آندو کاردیت تحت حاد باکتریایی ، شوک ، بیماری پشرفته کلیوی ، تهدید به سقط جنین یا زیادی شدید فشارخون\n",
            "\uD83D\uDD39 آلکالوز متابولیک یا تنفسی ، آلکالوز همراه با کاهش کلرید خون ناشی از مصرف مدرها ، استفراغ یا تخلیه مایعات از لوله بینی - معدی  از طریق ساکشن ، کاهش کلسیم خون (آلکالوز ممکن است موجب بروز تتانی شود) ، مصرف طولانی مدت (ممکن است موجب بروز افزایش بار سدیم یا اسیدوز متابولیک شود.)\n" +
                    "\uD83D\uDD39 در کسانی که بدنبال مصرف دیورتیک دچار آلکالوز هایپوکلرمیک شده اند ، هایپرتانسیون ، تشنج یا نارسایی قلبی مصرف آن ممنوع است. مصرف سدیم بی کربنات خوراکی در کسانی که اسیدهای معدنی قوی بلعیده اند ممنوع است. نباید از این دارو بعنوان درمان زخم معده استفاده شود.\n"};

    String [] avarezList = {"سردرد-سرگیجه-بیخوابی-عصبانیت-افزایش ضربان قلب-افزایش فشارخون-تغییرات ECG –دیس ریتمی-تاری دید-ضعف وتعریق-لرزش دست-استفراغ",
            "سردرد-سرگیجه-بی خوابی-آژیتاسیون-تاکی کاردی-برادیکاری (درمواقع مصرف دوزپایین تراز 5/0 میلی گرم  )- خشکی دهان  -گشادی مردمک",
            "برادیکارد ی-دیس ریتمی وآریتمی-هیپوتانسیون-هیپر وهیپو تیروئیدی-مسمومیت ریوی-اختلال الکترولیتی-حساسیت به نور-آسیب کبدی-تهوع و استفراغ- پهن شدن QRS    - طولانی شدن فاصله  PR وQT – بلوک قلبی درجه 2 و 3  - PEA",
            "سرگیجه-تاری دید-درد گردن-سنگینی بازوها-درد قفسه سینه-هیپوتانسیون-طعم فلزی دهان-هیپرونتیلاسیون-بروز آریتمی های زود گذر مثل دوره های کوتاه آسیستول می باشد که در موقع تغییر ریتم بیمار ظاهر می شود.",
            "طپش قلب – آنژین – دیس ریتمی بطنی – تاکی کاردی – برادی کاردی – تهوع و استفراغ – تنگی نفس – پهن شدن QRS",
            "ضربان اپتوپیک قلب – تاکی کاردی – درد قفسه سینه – طپش قلب – هیپرتانسیون – تهوع و استفراغ – سردرد – پارستزی",
            "افزایش بیش از حد دیگوکسین در بدن باعث بروز مسمومیت  می شود .\n" +
                    "اثرات سمی دیگوکسین بر روی قلب شامل:\n" +
                    "1)\tبلوک گره سینوسی \n" +
                    "2)\tبلوک گره   AV  \n" +
                    "3)\tآریتمی جانکشنال یا بطنی\n" +
                    "\uD83D\uDD39 بر روی سیستم گوارش شامل: بی اشتهایی، تهوع ، استفراغ و اسهال\n" +
                    "\uD83D\uDD39 بر روی سیستم عصبی مرکزی: اختلالات بینایی (دیر رنگی: دیدن هاله زرد و سبز اطراف اشیا)\n" +
                    "\uD83D\uDD39 علائم مسمومیت با دیگوکسین در ECG شامل:\n" +
                    "1)\tمعکوس شدن قطعه ST به شکل عکس (cheek mark)  \n" +
                    "2)\tموج T کاملاً مسطح می شود    \n" +
                    "3)\tQT کوتاه می گردد.\n" +
                    "4)\tپیدایش موج U\n",
            "سنکوب (تزریق وریدی سریع) – گز گز – استفراغ – آریتمی – ایست قلبی (تزریق وریدی سریع) – هایپوتانسیون – برادی کاردی",
            "لرزش دستها – بی قراری – وزوز گوش – تیرگی دید یا دوبینی – تشنج – ایست قلبی – برادی کاردی – هیپوتانسیون – آسم و ایست تنفسی",
            "ادم – بلوک قلبی – برادی کاردی – آسیستول – سرگیجه – سردرد – درد شکم – ادم ریه – ژینکو مایستی",
            "کاهش سدیم خون – هیپوکالمی و هیپومنیزیمی – آلکالوز ناشی از کمی کلرور خون – افزایش دفع کلسیم – کاهش فشار خون – تهوع – اختلالات گوارشی – افزایش تریگلیسرید",
            "از بین رفتن رفلکسهای تاندونی عمقی – دپرسیون تنفسی – تهوع و استفراغ – گر گرفتگی – احساس تشنگی – هیپوتانسیون – خواب آلودگی – گیجی – ضعف عضلانی – برادی کاردی – کوما. وقتی سطوح پلاسمایی به بالاتر از حد درمان برسد ابتدا رفلکسهای پاتلا از بین می روند. این امر نشان دهنده مسمومیت قریب الوقوع با منیزیم است. در غلظت  بیشتر از 12 میکرو گرم   فلج تنفسی رخ می دهد.",
            "خواب آلودگی – خستگی – مشکل در خوابیدن – اضطراب – یبوست یا اسهال – کابوس – یا کاهش توانایی جنسی – برادی کاردی – هیپوتانسیون",
            "ضعف – سردرد  سرگیجه – تحریک – تپش قلب – هیپوتانسیون – تاکی کاردی – خشکی دهان – واکنش افزایش حساسیت – تهوع – استفراغ ",
            "خونریزی ، نکروز پوست ، کمی پلاکت خون ، واکنش های حساسیتی (از جمله کهیر ، آنژیوادم و آنافیلاکسی) ، پوکی استخوان پس از مصرف طولانی مدت",
            "تتانی – سر درد – تشنج ناشی از آلکالوز- ایست قلبی- ادم – فلج ایلئوس- تهوع- آپنه"};

    String [] eghdamatList = {"\uD83D\uDD39 کنترل فشارخون ونبض (باعث افزایش BP می شود.)\n" +
            "\n" +
            "\uD83D\uDD39 کنترل ECGدرطی تجویز دارو\n" +
            "\n" +
            "\uD83D\uDD39 در بیماران دیابتی مقدارانسولین تزریقی باید بیشتر شود (اپی نفرین باعث افزایش قندخون می شود)\n" +
            "\n" +
            "\uD83D\uDD39 محلول رقیق شده اپی نفرین فقط 24 ساعت در یخچال قابل نگهداری می باشد. محلولهایی که تغییررنگ داده است نباید استفاده شود.\n" +
            "دوزداخل تراشه  5/2  - 2 برابردوز داخل وریدی و داخل استخوانی است.\n" +
            "\n" +
            "\uD83D\uDD39 تجویز اپی نفرین همراه با دیگوکسین باعث افزایش خطر بروزآریتمی های بطنی می شود.\n",
            "\uD83D\uDD39 بیمار از نظر احتباس ادراری و مدفوع کنترل شود.\n" +
                    "\n" +
                    "\uD83D\uDD39 وضعیت تنفسی از نظرتعداد،ریتم، سیانوز،ویزینگ ریه ، دیسپنه و پرخونی عروق گردن چک شود.\n" +
                    "\n" +
                    "\uD83D\uDD39 انجام ECG جهت بررسی بیمارازنظر ضربانات اکتوپیک بطنی، PVC  و تاکیکاردی.بررسی بیماراز نظر واکنشهای آلرژیک مانند کهیر و راش\n" +
                    "\n" +
                    "\uD83D\uDD39 دوز کمتر از  5/0 میلی گرم اثر عکس دارد وسبب برادیکاردی می گردد.\n" +
                    "\n" +
                    "\uD83D\uDD39 در صورت عدم دسترسی  به مسیرهای داخل وریدی وداخل استخوانی در حین CPR می توان آتروپین را از طریق لوله تراشه استفاده کرد.دوز داخل لوله تراشه 2 تا 5/2 برابر دوز وریدی این دارو است و می بایست با   10  سی سی آب مقطر رقیق شده و سپس بیمارهایپر ونتیله شود\n",
            "\uD83D\uDD39 کنترل الکترولیتهای و تستهای کبدی\n" +
                    "\uD83D\uDD39 در 15% از بیماران تجویز آمیودارون باعث مسمومیت ریوی با علایم تنگی نفس،سرفه وتب می شود.\n" +
                    "\uD83D\uDD39 ایجاد  پیگمانتاسیون های قهوه ای (آبی - خاکستری)\n" +
                    "\uD83D\uDD39 ترجیحا با محلول قندی رقیق شود.\n" +
                    "\uD83D\uDD39 در بیماران بلوک AV و برادیکاری که پیس میکر ندارند نباید استفاده شود.\n" +
                    "\uD83D\uDD39 مصرف این داروباعث یبوست و حساسیت به نور می شود.\n" +
                    "\uD83D\uDD39 تعداد ضربان قلب و  تنفس و ریتم  و درد قفسه سینه در بیمار کنترل شود .مرتبا BP چک شود\n" +
                    "\uD83D\uDD39 مصرف همزمان با بتابلوکرها و بلوک کننده های کانال کلسیمی خطر برادی کاردی را افزایش می دهد.\n" +
                    "\uD83D\uDD39 موثرترین داروی ضد آریتمی است و طولانی ترین نیمه عمررا دربین داروهای ضد آریتمی دارد.( 56-40 روز)\n",
            "\uD83D\uDD39 میزان الکترولیت ها بررسی شود.\n" +
                    "\uD83D\uDD39  ECGکنترل شود.\n" +
                    "\uD83D\uDD39 این محلول در درجه حرارت اتاق بایدنگهداری شود.\n" +
                    "\uD83D\uDD39 محلول بصورت شفاف است.\n" +
                    "\uD83D\uDD39 از راه یک ورید محیطی می توان 30 ml از وبال را بصورت رقیق نشده تزریق کرد.\n" +
                    "\uD83D\uDD39 دربیماران مبتلا به sss بدون استفاده ازپیس میکر تزریق آدنوزین ممنوع است.\n" +
                    "\uD83D\uDD39 آدنوزین تاثیری در درمان فیبریلاسیون وفلوتر دهلیزی ندارد.\n",
            "\uD83D\uDD39 اثر محرک آلفاآدرنرژیک دوپامین می تواند منجر به احتقان ریوی و اختلال در برون ده قلبی شود در این صورت باید دوز دارورا کم  یا  قطع نمود.\n" +
                    "\uD83D\uDD39 مقادیر بالای دوپامین موجب تهوع و استفراغ می شود.\n" +
                    "\uD83D\uDD39 نشت وریدی دوپامین می تواند موجب نکروز بافت زیرپوست گردد.تا دوازده ساعت بعداز نشت دارو می توان با  تزریق زیر جلدی محلول فنتولامین mg 10 -5 ازبروزنکروزپیشگیری کرد.\n" +
                    "\uD83D\uDD39 دوپامین را نباید همراه با محلول بی کربنات سدیم ویا سایر محلول های قلیایی به طورهمزمان تزریق کرد زیرا در PH قلیایی دارو به آرامی غیرفعال می شود.\n" +
                    "\uD83D\uDD39 دارو باید با سرم دکستروز 5% رقیق شود.\n" +
                    "\uD83D\uDD39 قطع دارو باید تدریجی صورت گیرد.\n" +
                    "\uD83D\uDD39 ابتدا باید هیپوولمی واسیدوزمتابولیک اصلاح شود وسپس درمان آغاز گردد  چون در غیر این صورت درمان با دوپامین نتیجه ای نخواهد داشت.\n" +
                    "\uD83D\uDD39 در دوزهای بالا به پاراستزی و سردی اندام ها توجه شود علت این عوارض کاهش پرفیوژن محیطی است.\n" +
                    "\uD83D\uDD39 استفاده از مقادیر کم ( 2-5/0 میکروگرم)  دوپامین موجب  تحریک گیرنده های دوپامینرژیک شده و عروق مغز- کلیه- مزانتر را گشاد می کند.و به این ترتیب برون ده ادراری افزایش می یابد.\n" +
                    "\uD83D\uDD39 استفاده از مقادیر متوسط ( 7-2 میکروگرم)   دوپامین : اثر بتا آدنرژیک و باعث افزایش قدرت انقباضی قلب می شود.\n" +
                    "\uD83D\uDD39 استفاده از مقادیر بالای( 10-7 میکروگرم)    دوپامین : اگر آلفا و بتا آدنرژیک اشته و باعث تنگ شدن عروق (افزایش فشارخون) و افزایش قدرت انقباضی قلب می شود.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "فرمول محاسبه دوپامین : وزن × قطره 60 × میکروست 100 × دوز دستور داده شده\n" +
                    "                                  1000 × 200 (دوز دارو)\n",
            "\uD83D\uDD39 در صورت هایپوولمی اول باید با تجویز گلیکوزید های قلبی مشکل برطرف شود سپس دوبو تامین شروع گردد.\n" +
                    "\uD83D\uDD39 بیمار از نظر نقص در اکسیژناسیون و پرفیوژن بررسی شود.\n" +
                    "\uD83D\uDD39 طی تجویز باید مرتب ECG کنترل شود و در صورت افزایش BP دوز دارو کاهش یابد.\n" +
                    "\uD83D\uDD39 حساسیت به سولفیت ها باید بررسی گردد زیرا کشنده است.\n" +
                    "\uD83D\uDD39 آمپول دوبوتامین به صورت mg250 در بازار موجود است و هنگام آماده کردن آن باید با سرم دکستروز %5 رقیق شود.\n",
            "\uD83D\uDD39 طی اولین دوز تزریقی به طور مداوم ECG کنترل شود.\n" +
                    "\uD83D\uDD39 قبل از اولین دوره ی درمان الکترولیت ها – تست کبدی و کلیوی و خونی حتما کنترل شود.\n" +
                    "\uD83D\uDD39 توجه به تورگور پوستی – ادم – صداهای ریوی\n" +
                    "\uD83D\uDD39 این دارو را می توان همراه غذا  یا بدون آن مصرف نمود و همچنین می توان دارو را خرد یا با مایعات و غذا مخلوط نمود.\n" +
                    "\uD83D\uDD39 قبل از اجرای دارو ضربان قلب باید چک شود، در صورت ضربان قلب کمتر از  60 از اجرای دارو خودداری گردد.\n",
            "\uD83D\uDD39 ECG از نظر کاهش فاصله QT و برعکس شدن موج T کنترل شود.\n" +
                    "\uD83D\uDD39 می توان دارو را به صورت رقیق نشده تزریق کرد.\n" +
                    "\uD83D\uDD39 برای جلوگیری از افزایش غلظت کلسیم در خون و ایست قلبی، دارو باید به آهستگی تزریق وریدی شود.\n" +
                    "\uD83D\uDD39 تزریق عضلانی می تواند سبب سوختگی – نکروز و تخریب  بافت  شود.\n" +
                    "\uD83D\uDD39 برای جذب بهتر دارو همراه غذا یا بعد از غذا مصرف شود.\n",
            "\uD83D\uDD39 به طور مداوم ECG از نظر افزایش زمان PR یا قطعه QRS کنترل شود.\n" +
                    "\uD83D\uDD39 دوزهای بالای لیدوکائین می تواند موجب تغییرات نورولوژیک شود علائم مسمومیت با آن خواب آلودگی – گیجی – پاراستزی و پرش عضلانی است و درمان ان قطع دارو و در موارد شدید تجویز داروهای ضد تشنج نظیر باربی تورات ها – بنزودیازپین ها می باشد.\n" +
                    "\uD83D\uDD39 تزریق سریع دوز اولیه ممکن است سبب کوما یا تشنج شود.\n" +
                    "\uD83D\uDD39 جهت انفوزیون وریدی می توان لیدوکائین را با سرم %5 D/W رقیق نمود.\n" +
                    "\uD83D\uDD39 دوزهای بالای لیدوکائین ممکن است موجب تضعیف میوکارد شود.\n" +
                    "\uD83D\uDD39 وضعیت تنفسی از نظر ریتم – تعداد و صداهای ریوی چک شود.\n" +
                    "\uD83D\uDD39 میزان الکترولیت ها بررسی شود.\n",
            "\uD83D\uDD39 وضعیت قلبی – BP – نبض و تنفس بررسی شود.\n" +
                    "\uD83D\uDD39 قبل از غذا به هنگام خواب مصرف شود.\n" +
                    "\uD83D\uDD39 دارو را خرد نکرده و جویده نشود.\n" +
                    "\uD83D\uDD39 در کودکان به خصوص کودکان زیر دو سال با احتیاط فراوان مصرف شود  (به علت کاهش کلسیم و ارست قلبی)\n" +
                    "\uD83D\uDD39 در حضور AV و SSS (سندرم سینوس بیمار) از تجویز آن خودداری شود.\n" +
                    "\uD83D\uDD39 باعث افزایش غلظت سرمی دیژیتال می شود.\n" +
                    "\uD83D\uDD39 به خاطر تاثیری که وراپامیل بر روی گره AV دارد جهت درمان تاکی کاردی های فوق بطنی تجویز می گردد و قادر است پاسخ بطنی را در AF کند نماید.\n",
            "\uD83D\uDD39 استفاده ی این دارو با دوز بالا به مدت طولانی ممکن است وزوز گوش و نواقص شنوایی ایجاد کند.\n" +
                    "\uD83D\uDD39 به منظور پیشگیری از تداخل دارو با خواب صبح  باید مصرف شود.\n" +
                    "\uD83D\uDD39 BP را در دو وضعیت خوابیده و ایستاده کنترل نمایید ممکن است هیپوتانسیون وضعیتی رخ دهد.\n",
            "\uD83D\uDD39 در صورت بروز موارد زیر دارو باید قطع شود: کرامپ – خون ریزی رکتوم – تهوع و استفراغ\n" +
                    "\uD83D\uDD39 مصرف طولانی مدت این دارو می تواد سبب عفونت ادراری و یا سنگ کلیه شود.\n" +
                    "\uD83D\uDD39 تزریق را به صورت عمیق در داخل گلوتئال انجام دهید.\n" +
                    "\uD83D\uDD39 گلوکونات کلسیم در دسترس باشد تا بتوانید با مسمومیت منیزیوم مقابله کنید.\n" +
                    "\uD83D\uDD39 تزریق داخل وریدی حداقل با سرعت mg/min  150 انجام شود در غیر اینصورت ممکن است کلاپس خون پدید آید.\n" +
                    "\uD83D\uDD39 در ریتم تورساد دپوینت منیزیوم سولفات با دوز 2- 1 گرم رقیق شده در 10 سی سی دکستروز 5% به صورت آهسته تجویز شود.\n",
            "\uD83D\uDD39 ECG کنترل شود.\n" +
                    "\uD83D\uDD39 از کپسول های تاخیری این دارو برای رفع ترمور اولیه MI – دیس زیتمی قلبی نمی توان استفاده کرد.\n" +
                    "\uD83D\uDD39 می توان محلول خوراکی را با مایعات و یا غذاهای نیمه جامد مخلوط نمود.\n" +
                    "\uD83D\uDD39 دارو را با یک لیوان و همراه با غذا مصرف کنید.\n" +
                    "\uD83D\uDD39 این دارو را نباید با فرآورده های حاوی آلومینیوم مثل آنتی اسید مصرف نمود. چون جذب گوارشی را کاهش می دهد.\n" +
                    "\uD83D\uDD39 دارو را میتوان به صورت رقیق شده و یا رقیق نشده استفاده کرد.\n",
            "\uD83D\uDD39 سردرد – احساس سبکی سر و کاهش میزان فشارخون ازمواردی هستند که نیاز به کاهش میزان دوزاژ دارو دارند.\n" +
                    "\uD83D\uDD39 قرص با یک لیوان آب و با معده ی خالی 1 ساعت قبل یا 2 ساعت بعد از غذا مصرف شود.\n" +
                    "\uD83D\uDD39 این دارو را میتوان در DW و نرمال سالین رقیق نمود. میکروست باید شیشه ای باشد نباید از جنس pvc باشد. برای انفوزیون از فیلتر استفاده نکنید.\n",
            "\uD83D\uDD39 برای بدست آوردن حداکثر اثر بخشی دارو و کاهش امکان خونریزی ، دستورات مربوط به مصرف دارو باید کاملا رعایت شود.\n" +
                    "\uD83D\uDD39 در طول درمان با هپارین ، از مصرف اسید سالیسیلیک یا داروهای حاوی آن ، ایبوپروفن و سایر داروهائی که بر روی پلاکت ها موثرند ، خودداری شود.\n" +
                    "\uD83D\uDD39 پزشک و دندانپزشک باید از مصرف این دارو آگاه شوند.\n" +
                    "\uD83D\uDD39 هنگام انفوزیون هپارین باید PTT باید چک شود و مقادیر 1.5  تا 2  برابر زمان نرمال حفظ می گردد.\n" +
                    "\uD83D\uDD39 قبل از تزریق هپارین می بایست BP بیمار کنترل شود و در صورت SBP بیشتر از 180   از تزریق هپارین خودداری شود\n",
            "\uD83D\uDD39 در صورت مصرف دارو از راه خوراکی ، آن را یک ساعت قبل یا دو ساعت بعد از قرص های دارای روکش روده ای مصرف کنید ، زیرا این دارو ممکن است موجب حل شدن روکش آنها در معده شود. از مصرف دارو با شیر پرهیز شود ، چرا که می تواند باعث هایپر کلسمی ، آلکالوز و احتمالا تشکیل سنگ های کلیوی شود.\n" +
                    "\uD83D\uDD39 مصرف در سالمندان : بیماران سالخورده مبتلا به نارسایی احتقانی قلب (CHF) یا سایر مواردی که موجب احتباس مایعات می شوند ، در معرض خطر بیشتری از نظر احتباس مایعات قرار دارند . بنابراین ، دارو در این بیماران باید با احتیاط  تجویز شود. \n" +
                    "\uD83D\uDD39 مصرف در کودکان : از انفوزیون سریع 10 (ml/min) محلول های هیپرتونیک در کودکان کوچکتر از دو سال باید اجتناب کرد.\n" +
                    "\uD83D\uDD39 علائم حیاتی بیمار به طور مرتب پیگیری شود. در صورت مصرف دارو به عنوان قلیایی کننده ادرار PH ادرار پیگیری شود.\n" +
                    "\uD83D\uDD39 از نشت محلول هنگام تزریق وریدی خودداری شود اضافه کردن املاح کلسیم ممکن است موجب رسوب محلول گردد.\n" +
                    "\uD83D\uDD39 بی کربنات ممکن است سبب غیر فعال شدن کاتکول آمین های محلول (اپی نفرین ، فنیل افرین و دوپامین) شود.\n" +
                    "\uD83D\uDD39 در صورت مصرف طولانی مدت دارو ، باید بیمار از نظر بروز سندرم شیر – قلیا  بررسی شود.\n" +
                    "\uD83D\uDD39 ممکن است از این داروها همراه با دکستروز و انسولین ، بعنوان درمان کمکی هایپر کالمی استفاده شود.\n" +
                    "\uD83D\uDD39 استفاده روتین از این دارو حین CPR توصیه نمی شود(در بعضی موقعیت های اختصاصی مثل اسیدوز متابولیک اثبات شده با آزمایش ، هایپر کالمی و یا اوردوزهای دارویی مثل داروی ضد افسردگی سه حلقه ای بی کربنات می تواند مفید باشد.)\n"};


    public static Drugs newInstance() {
        Drugs fragment = new Drugs();
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
        View v = inflater.inflate(R.layout.fragment_drugs_list, container, false);
        ListView lv = (ListView)v.findViewById(R.id.lvDrugs);
        sortAlephabetically();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1,list);
        lv.setAdapter(arrayAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                AlertDialog.Builder mBuilder = new AlertDialog.Builder(getActivity());
//                View mView = getLayoutInflater().inflate(R.layout.dialog,null);
//                TextView tv = (TextView)mView.findViewById(R.id.tvTest);
//                mBuilder.setView(mView);
//                AlertDialog dialog = mBuilder.create();
//                dialog.show();
                Intent intent = new Intent(getContext(),dialogPage.class);
                intent.putExtra("value", list[position]);

                intent.putExtra("Tf1", dasteList[position]);
                intent.putExtra("Tf2", sheklList[position]);
                intent.putExtra("Tf3", antiDutList[position]);
                intent.putExtra("Tf4", mecanismList[position]);
                intent.putExtra("Tf5", andicasionList[position]);
                intent.putExtra("Tf6", dozList[position]);
                intent.putExtra("Tf7", contraList[position]);
                intent.putExtra("Tf8", avarezList[position]);
                intent.putExtra("Tf9", eghdamatList[position]);

                startActivity(intent);


            }
        });
        return v;
    }

    private void sortAlephabetically(){

    }

}

