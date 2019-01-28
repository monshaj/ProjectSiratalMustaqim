package com.example.nasim.projectsirat_al_mustaqim;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Ayat extends AppCompatActivity {
    ListView listView;
    ArrayList<String> ayat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayat);

        listView = findViewById(R.id.listview2);
        ayat = new ArrayList<String>();
        ayat.clear();

        String surahName = null;
        Bundle b = getIntent().getExtras();
        if(b != null)
        {
            surahName = b.getString("Surah");
            Toast.makeText(this, "You pressed on Surah "+surahName, Toast.LENGTH_SHORT).show();
        }


        if(surahName.equals("1. Al_Fatihah"))
        {
            setTitle("Surah Fatiha");
            ayat.add("1\n" +
                    "بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n" +
                    "TRANSLITERATION\n" +
                    "bi-smi llāhi r-raḥmāni r-raḥīmi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("2\n" +
                    "الحَمدُ لِلَّهِ رَبِّ العالَمينَ\n" +
                    "TRANSLITERATION\n" +
                    "al-ḥamdu li-llāhi rabbi l-ʿālamīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "All praise belongs to Allah,1\n" +
                    "Lord of all the worlds,");
            ayat.add("3\n" +
                    "الرَّحمٰنِ الرَّحيمِ\n" +
                    "TRANSLITERATION\n" +
                    "ar-raḥmāni r-raḥīmi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "the All-beneficent, the All-merciful,3\n"
                    );
            ayat.add("4\n" +
                    "مالِكِ يَومِ الدّينِ\n" +
                    "TRANSLITERATION\n" +
                    "māliki yawmi d-dīni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Master1 of the Day of Retribution.");
            ayat.add("5\n" +
                    "إِيّاكَ نَعبُدُ وَإِيّاكَ نَستَعينُ\n" +
                    "TRANSLITERATION\n" +
                    "ʾiyyāka naʿbudu wa-ʾiyyāka nastaʿīnu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "You [alone] do we worship,\n" +
                    "and to You [alone] do we turn for help.");
            ayat.add("6\n" +
                    "اهدِنَا الصِّراطَ المُستَقيمَ\n" +
                    "TRANSLITERATION\n" +
                    "ihdinā ṣ-ṣirāṭa l-mustaqīma\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Guide us on the straight path,");
            ayat.add("7\n" +
                    "صِراطَ الَّذينَ أَنعَمتَ عَلَيهِم غَيرِ المَغضوبِ عَلَيهِم وَلَا الضّالّينَ\n" +
                    "TRANSLITERATION\n" +
                    "ṣirāṭa lladhīna ʾanʿamta ʿalayhim ghayri l-maghḍūbi ʿalayhim wa-lā ḍ-ḍāllīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "the path of those whom You have blessed1\n" +
                    "—such as2 have not incurred Your wrath,3\n" +
                    "nor are astray.4");

        }
        else if(surahName.equals("2. Al_Baqarah"))
        {
            ayat.add("1\n" +
                    "الم\n" +
                    "TRANSLITERATION\n" +
                    "a-l-m (ʾalif lām mīm)\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Alif, Lām, Mīm.");
            ayat.add("2\n" +
                    "ذٰلِكَ الكِتابُ لا رَيبَ ۛ فيهِ ۛ هُدًى لِلمُتَّقينَ\n" +
                    "TRANSLITERATION\n" +
                    "dhālika l-kitābu lā rayba fīhi hudan li-l-muttaqīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "This is the Book,1 there is no doubt in it,\n" +
                    "a guidance to the Godwary,2");
            ayat.add("3\n" +
                    "الَّذينَ يُؤمِنونَ بِالغَيبِ وَيُقيمونَ الصَّلاةَ وَمِمّا رَزَقناهُم يُنفِقونَ\n" +
                    "TRANSLITERATION\n" +
                    "alladhīna yuʾminūna bi-l-ghaybi wa-yuqīmūna ṣ-ṣalāta wa-mimmā razaqnāhum yunfiqūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "who believe in the Unseen,\n" +
                    "and maintain the prayer,\n" +
                    "and spend1 out of what We have provided for them;");
            ayat.add("4\n" +
                    "وَالَّذينَ يُؤمِنونَ بِما أُنزِلَ إِلَيكَ وَما أُنزِلَ مِن قَبلِكَ وَبِالآخِرَةِ هُم يوقِنونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-lladhīna yuʾminūna bi-mā ʾunzila ʾilayka wa-mā ʾunzila min qablika wa-bi-l-ʾākhirati hum yūqinūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and who believe in what has been sent down to you1\n" +
                    "and what was sent down before you,\n" +
                    "and are certain of the Hereafter.");
            ayat.add("5\n" +
                    "أُولٰئِكَ عَلىٰ هُدًى مِن رَبِّهِم ۖ وَأُولٰئِكَ هُمُ المُفلِحونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾulāʾika ʿalā hudan min rabbihim wa-ʾulāʾika humu l-mufliḥūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Those follow their Lord’s guidance,\n" +
                    "and it is they who are the felicitous.");
            ayat.add("B 6");
            ayat.add("B 6");
            ayat.add("B 6");
            ayat.add("B 6");
            ayat.add("B 6");
            ayat.add("B 6");
            ayat.add("B 6");
            ayat.add("B 6");
            ayat.add("B 6");
        }
        else if(surahName.equals("2. Al_Baqarah"))
        {
            ayat.add("1\n" +
                    "الم\n" +
                    "TRANSLITERATION\n" +
                    "a-l-m (ʾalif lām mīm)\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Alif, Lām, Mīm.");
            ayat.add("B 2");
            ayat.add("B 3");
            ayat.add("B 4");
            ayat.add("B 5");
            ayat.add("B 6");
        }else if(surahName.equals("2. Al_Baqarah"))
        {
            ayat.add("1\n" +
                    "الم\n" +
                    "TRANSLITERATION\n" +
                    "a-l-m (ʾalif lām mīm)\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Alif, Lām, Mīm.");
            ayat.add("B 2");
            ayat.add("B 3");
            ayat.add("B 4");
            ayat.add("B 5");
            ayat.add("B 6");
        }else if(surahName.equals("2. Al_Baqarah"))
        {
            ayat.add("1\n" +
                    "الم\n" +
                    "TRANSLITERATION\n" +
                    "a-l-m (ʾalif lām mīm)\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Alif, Lām, Mīm.");
            ayat.add("B 2");
            ayat.add("B 3");
            ayat.add("B 4");
            ayat.add("B 5");
            ayat.add("B 6");
        }else if(surahName.equals("2. Al_Baqarah"))
        {
            ayat.add("1\n" +
                    "الم\n" +
                    "TRANSLITERATION\n" +
                    "a-l-m (ʾalif lām mīm)\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Alif, Lām, Mīm.");
            ayat.add("B 2");
            ayat.add("B 3");
            ayat.add("B 4");
            ayat.add("B 5");
            ayat.add("B 6");
        }else if(surahName.equals("2. Al_Baqarah"))
        {
            ayat.add("1\n" +
                    "الم\n" +
                    "TRANSLITERATION\n" +
                    "a-l-m (ʾalif lām mīm)\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Alif, Lām, Mīm.");
            ayat.add("B 2");
            ayat.add("B 3");
            ayat.add("B 4");
            ayat.add("B 5");
            ayat.add("B 6");
        }else if(surahName.equals("2. Al_Baqarah"))
        {
            ayat.add("1\n" +
                    "الم\n" +
                    "TRANSLITERATION\n" +
                    "a-l-m (ʾalif lām mīm)\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Alif, Lām, Mīm.");
            ayat.add("B 2");
            ayat.add("B 3");
            ayat.add("B 4");
            ayat.add("B 5");
            ayat.add("B 6");
        }else if(surahName.equals("2. Al_Baqarah"))
        {
            ayat.add("1\n" +
                    "الم\n" +
                    "TRANSLITERATION\n" +
                    "a-l-m (ʾalif lām mīm)\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Alif, Lām, Mīm.");
            ayat.add("B 2");
            ayat.add("B 3");
            ayat.add("B 4");
            ayat.add("B 5");
            ayat.add("B 6");
        }else if(surahName.equals("2. Al_Baqarah"))
        {
            ayat.add("1\n" +
                    "الم\n" +
                    "TRANSLITERATION\n" +
                    "a-l-m (ʾalif lām mīm)\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Alif, Lām, Mīm.");
            ayat.add("B 2");
            ayat.add("B 3");
            ayat.add("B 4");
            ayat.add("B 5");
            ayat.add("B 6");
        }else if(surahName.equals("2. Al_Baqarah"))
        {
            ayat.add("1\n" +
                    "الم\n" +
                    "TRANSLITERATION\n" +
                    "a-l-m (ʾalif lām mīm)\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Alif, Lām, Mīm.");
            ayat.add("B 2");
            ayat.add("B 3");
            ayat.add("B 4");
            ayat.add("B 5");
            ayat.add("B 6");
        }else if(surahName.equals("2. Al_Baqarah"))
        {
            ayat.add("1\n" +
                    "الم\n" +
                    "TRANSLITERATION\n" +
                    "a-l-m (ʾalif lām mīm)\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Alif, Lām, Mīm.");
            ayat.add("B 2");
            ayat.add("B 3");
            ayat.add("B 4");
            ayat.add("B 5");
            ayat.add("B 6");
        }else if(surahName.equals("2. Al_Baqarah"))
        {
            ayat.add("1\n" +
                    "الم\n" +
                    "TRANSLITERATION\n" +
                    "a-l-m (ʾalif lām mīm)\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Alif, Lām, Mīm.");
            ayat.add("B 2");
            ayat.add("B 3");
            ayat.add("B 4");
            ayat.add("B 5");
            ayat.add("B 6");
        }else if(surahName.equals("2. Al_Baqarah"))
        {
            ayat.add("1\n" +
                    "الم\n" +
                    "TRANSLITERATION\n" +
                    "a-l-m (ʾalif lām mīm)\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Alif, Lām, Mīm.");
            ayat.add("B 2");
            ayat.add("B 3");
            ayat.add("B 4");
            ayat.add("B 5");
            ayat.add("B 6");
        }else if(surahName.equals("2. Al_Baqarah"))
        {
            ayat.add("1\n" +
                    "الم\n" +
                    "TRANSLITERATION\n" +
                    "a-l-m (ʾalif lām mīm)\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Alif, Lām, Mīm.");
            ayat.add("B 2");
            ayat.add("B 3");
            ayat.add("B 4");
            ayat.add("B 5");
            ayat.add("B 6");
        }else if(surahName.equals("2. Al_Baqarah"))
        {
            ayat.add("1\n" +
                    "الم\n" +
                    "TRANSLITERATION\n" +
                    "a-l-m (ʾalif lām mīm)\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Alif, Lām, Mīm.");
            ayat.add("B 2");
            ayat.add("B 3");
            ayat.add("B 4");
            ayat.add("B 5");
            ayat.add("B 6");
        }else if(surahName.equals("2. Al_Baqarah"))
        {
            ayat.add("1\n" +
                    "الم\n" +
                    "TRANSLITERATION\n" +
                    "a-l-m (ʾalif lām mīm)\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Alif, Lām, Mīm.");
            ayat.add("B 2");
            ayat.add("B 3");
            ayat.add("B 4");
            ayat.add("B 5");
            ayat.add("B 6");
        }else if(surahName.equals("2. Al_Baqarah"))
        {
            ayat.add("1\n" +
                    "الم\n" +
                    "TRANSLITERATION\n" +
                    "a-l-m (ʾalif lām mīm)\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Alif, Lām, Mīm.");
            ayat.add("B 2");
            ayat.add("B 3");
            ayat.add("B 4");
            ayat.add("B 5");
            ayat.add("B 6");
        }else if(surahName.equals("2. Al_Baqarah"))
        {
            ayat.add("1\n" +
                    "الم\n" +
                    "TRANSLITERATION\n" +
                    "a-l-m (ʾalif lām mīm)\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Alif, Lām, Mīm.");
            ayat.add("B 2");
            ayat.add("B 3");
            ayat.add("B 4");
            ayat.add("B 5");
            ayat.add("B 6");
        }else if(surahName.equals("2. Al_Baqarah"))
        {
            ayat.add("1\n" +
                    "الم\n" +
                    "TRANSLITERATION\n" +
                    "a-l-m (ʾalif lām mīm)\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Alif, Lām, Mīm.");
            ayat.add("B 2");
            ayat.add("B 3");
            ayat.add("B 4");
            ayat.add("B 5");
            ayat.add("B 6");
        }else if(surahName.equals("2. Al_Baqarah"))
        {
            ayat.add("1\n" +
                    "الم\n" +
                    "TRANSLITERATION\n" +
                    "a-l-m (ʾalif lām mīm)\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Alif, Lām, Mīm.");
            ayat.add("B 2");
            ayat.add("B 3");
            ayat.add("B 4");
            ayat.add("B 5");
            ayat.add("B 6");
        }else if(surahName.equals("2. Al_Baqarah"))
        {
            ayat.add("1\n" +
                    "الم\n" +
                    "TRANSLITERATION\n" +
                    "a-l-m (ʾalif lām mīm)\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Alif, Lām, Mīm.");
            ayat.add("B 2");
            ayat.add("B 3");
            ayat.add("B 4");
            ayat.add("B 5");
            ayat.add("B 6");
        }else if(surahName.equals("2. Al_Baqarah"))
        {
            ayat.add("1\n" +
                    "الم\n" +
                    "TRANSLITERATION\n" +
                    "a-l-m (ʾalif lām mīm)\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Alif, Lām, Mīm.");
            ayat.add("B 2");
            ayat.add("B 3");
            ayat.add("B 4");
            ayat.add("B 5");
            ayat.add("B 6");
        }else if(surahName.equals("2. Al_Baqarah"))
        {
            ayat.add("1\n" +
                    "الم\n" +
                    "TRANSLITERATION\n" +
                    "a-l-m (ʾalif lām mīm)\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Alif, Lām, Mīm.");
            ayat.add("B 2");
            ayat.add("B 3");
            ayat.add("B 4");
            ayat.add("B 5");
            ayat.add("B 6");
        }else if(surahName.equals("2. Al_Baqarah"))
        {
            ayat.add("1\n" +
                    "الم\n" +
                    "TRANSLITERATION\n" +
                    "a-l-m (ʾalif lām mīm)\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Alif, Lām, Mīm.");
            ayat.add("B 2");
            ayat.add("B 3");
            ayat.add("B 4");
            ayat.add("B 5");
            ayat.add("B 6");
        }else if(surahName.equals("2. Al_Baqarah"))
        {
            ayat.add("1\n" +
                    "الم\n" +
                    "TRANSLITERATION\n" +
                    "a-l-m (ʾalif lām mīm)\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Alif, Lām, Mīm.");
            ayat.add("B 2");
            ayat.add("B 3");
            ayat.add("B 4");
            ayat.add("B 5");
            ayat.add("B 6");
        }else if(surahName.equals("2. Al_Baqarah"))
        {
            ayat.add("1\n" +
                    "الم\n" +
                    "TRANSLITERATION\n" +
                    "a-l-m (ʾalif lām mīm)\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Alif, Lām, Mīm.");
            ayat.add("B 2");
            ayat.add("B 3");
            ayat.add("B 4");
            ayat.add("B 5");
            ayat.add("B 6");
        }else if(surahName.equals("2. Al_Baqarah"))
        {
            ayat.add("1\n" +
                    "الم\n" +
                    "TRANSLITERATION\n" +
                    "a-l-m (ʾalif lām mīm)\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Alif, Lām, Mīm.");
            ayat.add("B 2");
            ayat.add("B 3");
            ayat.add("B 4");
            ayat.add("B 5");
            ayat.add("B 6");
        }else if(surahName.equals("2. Al_Baqarah"))
        {
            ayat.add("1\n" +
                    "الم\n" +
                    "TRANSLITERATION\n" +
                    "a-l-m (ʾalif lām mīm)\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Alif, Lām, Mīm.");
            ayat.add("B 2");
            ayat.add("B 3");
            ayat.add("B 4");
            ayat.add("B 5");
            ayat.add("B 6");
        }else if(surahName.equals("2. Al_Baqarah"))
        {
            ayat.add("1\n" +
                    "الم\n" +
                    "TRANSLITERATION\n" +
                    "a-l-m (ʾalif lām mīm)\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Alif, Lām, Mīm.");
            ayat.add("B 2");
            ayat.add("B 3");
            ayat.add("B 4");
            ayat.add("B 5");
            ayat.add("B 6");
        }else if(surahName.equals("2. Al_Baqarah"))
        {
            ayat.add("1\n" +
                    "الم\n" +
                    "TRANSLITERATION\n" +
                    "a-l-m (ʾalif lām mīm)\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Alif, Lām, Mīm.");
            ayat.add("B 2");
            ayat.add("B 3");
            ayat.add("B 4");
            ayat.add("B 5");
            ayat.add("B 6");
        }else if(surahName.equals("2. Al_Baqarah"))
        {
            ayat.add("1\n" +
                    "الم\n" +
                    "TRANSLITERATION\n" +
                    "a-l-m (ʾalif lām mīm)\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Alif, Lām, Mīm.");
            ayat.add("B 2");
            ayat.add("B 3");
            ayat.add("B 4");
            ayat.add("B 5");
            ayat.add("B 6");
        }else if(surahName.equals("2. Al_Baqarah"))
        {
            ayat.add("1\n" +
                    "الم\n" +
                    "TRANSLITERATION\n" +
                    "a-l-m (ʾalif lām mīm)\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Alif, Lām, Mīm.");
            ayat.add("B 2");
            ayat.add("B 3");
            ayat.add("B 4");
            ayat.add("B 5");
            ayat.add("B 6");
        }else if(surahName.equals("2. Al_Baqarah"))
        {
            ayat.add("1\n" +
                    "الم\n" +
                    "TRANSLITERATION\n" +
                    "a-l-m (ʾalif lām mīm)\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Alif, Lām, Mīm.");
            ayat.add("B 2");
            ayat.add("B 3");
            ayat.add("B 4");
            ayat.add("B 5");
            ayat.add("B 6");
        }else if(surahName.equals("2. Al_Baqarah"))
        {
            ayat.add("1\n" +
                    "الم\n" +
                    "TRANSLITERATION\n" +
                    "a-l-m (ʾalif lām mīm)\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Alif, Lām, Mīm.");
            ayat.add("B 2");
            ayat.add("B 3");
            ayat.add("B 4");
            ayat.add("B 5");
            ayat.add("B 6");
        }else if(surahName.equals("2. Al_Baqarah"))
        {
            ayat.add("1\n" +
                    "الم\n" +
                    "TRANSLITERATION\n" +
                    "a-l-m (ʾalif lām mīm)\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Alif, Lām, Mīm.");
            ayat.add("B 2");
            ayat.add("B 3");
            ayat.add("B 4");
            ayat.add("B 5");
            ayat.add("B 6");
        }else if(surahName.equals("2. Al_Baqarah"))
        {
            ayat.add("1\n" +
                    "الم\n" +
                    "TRANSLITERATION\n" +
                    "a-l-m (ʾalif lām mīm)\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Alif, Lām, Mīm.");
            ayat.add("B 2");
            ayat.add("B 3");
            ayat.add("B 4");
            ayat.add("B 5");
            ayat.add("B 6");
        }else if(surahName.equals("2. Al_Baqarah"))
        {
            ayat.add("1\n" +
                    "الم\n" +
                    "TRANSLITERATION\n" +
                    "a-l-m (ʾalif lām mīm)\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Alif, Lām, Mīm.");
            ayat.add("B 2");
            ayat.add("B 3");
            ayat.add("B 4");
            ayat.add("B 5");
            ayat.add("B 6");
        }













        ListViewAdapter adapter = new ListViewAdapter(this,ayat);
        listView.setAdapter(adapter);
        // for inserting back arrow
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

    }

    //For coming back to Main_Menu
    @Override
    public void onBackPressed() {
        Intent intent= new Intent(Ayat.this,Surahs.class);
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home)
        {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
