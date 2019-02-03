package com.example.nasim.projectsirat_al_mustaqim;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SeekBar;
import java.util.ArrayList;

public class Ayat extends AppCompatActivity implements View.OnClickListener {
    ListView listView;
    ArrayList<String> ayat;
    MediaPlayer mediaPlayer;
    Runnable runnable;
    Handler handler;
    SeekBar seekBar;
    Button play;
    boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayat);

        initialization();

        listView = findViewById(R.id.listview2);
        ayat = new ArrayList<String>();
        ayat.clear();

        ayat.clear();
        play = (Button)findViewById(R.id.play);
        play.setOnClickListener(this);

        String surahName = getIntent().getStringExtra("Surah");
//        Bundle b = getIntent().getExtras();
//        if(b != null)




        if(surahName.equals("1. Al-Fatihah"))
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.a );
            setTitle("Al-Fatihah( الفاتحة ) : The Opening");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n\n" +
                    "الحَمدُ لِلَّهِ رَبِّ العالَمينَ\n\n" +
                    "TRANSLITERATION :\n" +
                    "al-ḥamdu li-llāhi rabbil-ʿālamīna\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "All praise belongs to Allah,\n" +
                    "Lord of all the worlds,");
            ayat.add("2\n\n" +
                    "الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "ar-raḥmāni r-raḥīmi\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "the All-beneficent, the All-merciful,\n"
            );
            ayat.add("3\n\n" +
                    "مالِكِ يَومِ الدّينِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "māliki yawmid-dīni\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "Master1 of the Day of Retribution.");
            ayat.add("4\n\n" +
                    "إِيّاكَ نَعبُدُ وَإِيّاكَ نَستَعينُ\n\n" +
                    "TRANSLITERATION :\n" +
                    "ʾiyyāka naʿbudu wa-ʾiyyāka nastaʿīnu\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "You do we worship,\n" +
                    "and to You do we turn for help.");
            ayat.add("5\n\n" +
                    "اهدِنَا الصِّراطَ المُستَقيمَ\n\n" +
                    "TRANSLITERATION :\n" +
                    "ihdinās-ṣirāṭ-al-mustaqīma\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "Guide us on the straight path,");
            ayat.add("6\n\n" +
                    "صِراطَ الَّذينَ أَنعَمتَ عَلَيهِم غَيرِ المَغضوبِ عَلَيهِم وَلَا الضّالّينَ\n\n" +
                    "TRANSLITERATION :\n" +
                    "ṣirāṭa lladhīna ʾanʿamta ʿalayhim ghayri l-maghḍūbi ʿalayhim wa-lā ḍ-ḍāllīna\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "the path of those whom You have blessed\n" +
                    "such as have not incurred Your wrath,\n" +
                    "nor are astray.");

        }
        else if(surahName.equals("2. Al-Baqarah"))
        {
            setTitle("Al-Baqarah( البقرة ) : The Cow");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n\n" +
                    "الم\n\n" +
                    "TRANSLITERATION :\n" +
                    "alif lām mīm\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "Alif, Lām, Mīm.");
            ayat.add("2\n\n" +
                    "ذٰلِكَ الكِتابُ لا رَيبَ ۛ فيهِ ۛ هُدًى لِلمُتَّقينَ\n\n" +
                    "TRANSLITERATION :\n" +
                    "dhālika l-kitābu lā rayba fīhi hudan li-l-muttaqīna\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "This is the Book,1 there is no doubt in it,\n" +
                    "a guidance to the Godwary,2");
            ayat.add("3\n\n" +
                    "الَّذينَ يُؤمِنونَ بِالغَيبِ وَيُقيمونَ الصَّلاةَ وَمِمّا رَزَقناهُم يُنفِقونَ\n\n" +
                    "TRANSLITERATION :\n" +
                    "alladhīna yuʾminūna bi-l-ghaybi wa-yuqīmūna ṣ-ṣalāta wa-mimmā razaqnāhum yunfiqūna\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "who believe in the Unseen,\n" +
                    "and maintain the prayer,\n" +
                    "and spend1 out of what We have provided for them;");
            ayat.add("4\n\n" +
                    "وَالَّذينَ يُؤمِنونَ بِما أُنزِلَ إِلَيكَ وَما أُنزِلَ مِن قَبلِكَ وَبِالآخِرَةِ هُم يوقِنونَ\n\n" +
                    "TRANSLITERATION :\n" +
                    "wa-lladhīna yuʾminūna bi-mā ʾunzila ʾilayka wa-mā ʾunzila min qablika wa-bi-l-ʾākhirati hum yūqinūna\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "and who believe in what has been sent down to you1\n" +
                    "and what was sent down before you,\n" +
                    "and are certain of the Hereafter.");
            ayat.add("5\n\n" +
                    "أُولٰئِكَ عَلىٰ هُدًى مِن رَبِّهِم ۖ وَأُولٰئِكَ هُمُ المُفلِحونَ\n\n" +
                    "TRANSLITERATION :\n" +
                    "ʾulāʾika ʿalā hudan min rabbihim wa-ʾulāʾika humu l-mufliḥūna\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "Those follow their Lord’s guidance,\n" +
                    "and it is they who are the felicitous.");
            ayat.add("\n6\n" +
                    "إِنَّ الَّذينَ كَفَروا سَواءٌ عَلَيهِم أَأَنذَرتَهُم أَم لَم تُنذِرهُم لا يُؤمِنونَ\n\n" +
                    "TRANSLITERATION :\n" +
                    "ʾinna lladhīna kafarū sawāʾun ʿalayhim ʾa-ʾandhartahum ʾam lam tundhirhum lā yuʾminūna\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "As for the faithless, it is the same to them\n" +
                    "whether you warn them or do not warn them,\n" +
                    "they will not have faith.");
            ayat.add("7\n\n" +
                    "خَتَمَ اللَّهُ عَلىٰ قُلوبِهِم وَعَلىٰ سَمعِهِم ۖ وَعَلىٰ أَبصارِهِم غِشاوَةٌ ۖ وَلَهُم عَذابٌ عَظيمٌ\n\n" +
                    "TRANSLITERATION :\n" +
                    "khatama llāhu ʿalā qulūbihim wa-ʿalā samʿihim wa-ʿalā ʾabṣārihim ghishāwatun wa-lahum ʿadhābun ʿaẓīmun\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "Allah has set a seal on their hearts\n" +
                    "and their hearing,\n" +
                    "and there is a blindfold on their sight,1\n" +
                    "and there is a great punishment for them.");
            ayat.add("8\n" +
                    "وَمِنَ النّاسِ مَن يَقولُ آمَنّا بِاللَّهِ وَبِاليَومِ الآخِرِ وَما هُم بِمُؤمِنينَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-mina n-nāsi man yaqūlu ʾāmannā bi-llāhi wa-bi-l-yawmi l-ʾākhiri wa-mā hum bi-muʾminīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And among the people are those who say,\n" +
                    "‘We have faith in Allah and the Last Day,’\n" +
                    "but they have no faith.");
            ayat.add("9\n" +
                    "يُخادِعونَ اللَّهَ وَالَّذينَ آمَنوا وَما يَخدَعونَ إِلّا أَنفُسَهُم وَما يَشعُرونَ\n" +
                    "TRANSLITERATION\n" +
                    "yukhādiʿūna llāha wa-lladhīna ʾāmanū wa-mā yakhdaʿūna ʾillā ʾanfusahum wa-mā yashʿurūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They seek to deceive Allah\n" +
                    "and those who have faith,\n" +
                    "yet they deceive no one but themselves,\n" +
                    "but they are not aware.");
            ayat.add("10\n" +
                    "في قُلوبِهِم مَرَضٌ فَزادَهُمُ اللَّهُ مَرَضًا ۖ وَلَهُم عَذابٌ أَليمٌ بِما كانوا يَكذِبونَ\n" +
                    "TRANSLITERATION\n" +
                    "fī qulūbihim maraḍun fa-zādahumu llāhu maraḍan wa-lahum ʿadhābun ʾalīmun bi-mā kānū yakdhibūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "There is a sickness in their hearts;\n" +
                    "then Allah increased their sickness,\n" +
                    "and there is a painful punishment for them\n" +
                    "because of the lies they used to tell.");
            ayat.add("11\n" +
                    "وَإِذا قيلَ لَهُم لا تُفسِدوا فِي الأَرضِ قالوا إِنَّما نَحنُ مُصلِحونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾidhā qīla lahum lā tufsidū fī l-ʾarḍi qālū ʾinnamā naḥnu muṣliḥūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "When they are told,\n" +
                    "‘Do not cause corruption on the earth,’\n" +
                    "they say, ‘We are only reformers!’");
            ayat.add("12\n" +
                    "أَلا إِنَّهُم هُمُ المُفسِدونَ وَلٰكِن لا يَشعُرونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-lā ʾinnahum humu l-mufsidūna wa-lākin lā yashʿurūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Look! They are themselves the agents of corruption,\n" +
                    "but they are not aware.");
            ayat.add("13\n" +
                    "وَإِذا قيلَ لَهُم آمِنوا كَما آمَنَ النّاسُ قالوا أَنُؤمِنُ كَما آمَنَ السُّفَهاءُ ۗ أَلا إِنَّهُم هُمُ السُّفَهاءُ وَلٰكِن لا يَعلَمونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾidhā qīla lahum ʾāminū ka-mā ʾāmana n-nāsu qālū ʾa-nuʾminu ka-mā ʾāmana s-sufahāʾu ʾa-lā ʾinnahum humu s-sufahāʾu wa-lākin lā yaʿlamūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And when they are told,\n" +
                    "‘Believe like the people who have believed,’\n" +
                    "they say, ‘Shall we believe\n" +
                    "like the fools who have believed?’\n" +
                    "Look! They are themselves the fools,\n" +
                    "but they do not know.");
            ayat.add("14\n" +
                    "وَإِذا لَقُوا الَّذينَ آمَنوا قالوا آمَنّا وَإِذا خَلَوا إِلىٰ شَياطينِهِم قالوا إِنّا مَعَكُم إِنَّما نَحنُ مُستَهزِئونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾidhā laqū lladhīna ʾāmanū qālū ʾāmannā wa-ʾidhā khalaw ʾilā shayāṭīnihim qālū ʾinnā maʿakum ʾinnamā naḥnu mustahziʾūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "When they meet the faithful,\n" +
                    "they say, ‘We believe,’\n" +
                    "but when they are alone with their devils,\n" +
                    "they say, ‘We are with you;\n" +
                    "we were only deriding [them].");
            ayat.add("15\n" +
                    "اللَّهُ يَستَهزِئُ بِهِم وَيَمُدُّهُم في طُغيانِهِم يَعمَهونَ\n" +
                    "TRANSLITERATION\n" +
                    "allāhu yastahziʾu bihim wa-yamudduhum fī ṭughyānihim yaʿmahūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "It is Allah who derides them,1\n" +
                    "and leaves them bewildered in their rebellion.");
            ayat.add("16\n" +
                    "أُولٰئِكَ الَّذينَ اشتَرَوُا الضَّلالَةَ بِالهُدىٰ فَما رَبِحَت تِجارَتُهُم وَما كانوا مُهتَدينَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾulāʾika lladhīna shtarawu ḍ-ḍalālata bi-l-hudā fa-mā rabiḥat tijāratuhum wa-mā kānū muhtadīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They are the ones who bought error\n" +
                    "for guidance,\n" +
                    "so their trade did not profit them,\n" +
                    "nor were they guided.");
            ayat.add("17\n" +
                    "مَثَلُهُم كَمَثَلِ الَّذِي استَوقَدَ نارًا فَلَمّا أَضاءَت ما حَولَهُ ذَهَبَ اللَّهُ بِنورِهِم وَتَرَكَهُم في ظُلُماتٍ لا يُبصِرونَ\n" +
                    "TRANSLITERATION\n" +
                    "mathaluhum ka-mathali lladhī stawqada nāran fa-lammā ʾaḍāʾat mā ḥawlahū dhahaba llāhu bi-nūrihim wa-tarakahum fī ẓulumātin lā yubṣirūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Their parable\n" +
                    "is that of one who lighted a torch,\n" +
                    "and when it had lit up all around him,\n" +
                    "Allah took away their light,\n" +
                    "and left them sightless in a manifold darkness.1\n" +
                    "The one who lights the torch in the parable is the Prophet (ṣ), who illuminated the spiritual horizons of the Arabia of those days with the message of Islam. But the hypocrites, with their inward blindness, did not benefit from its light and continued to remain in the darkness of their faithlessness.");
            ayat.add("18\n" +
                    "صُمٌّ بُكمٌ عُميٌ فَهُم لا يَرجِعونَ\n" +
                    "TRANSLITERATION\n" +
                    "ṣummun bukmun ʿumyun fa-hum lā yarjiʿūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Deaf, dumb, and blind,\n" +
                    "they will not come back.");
            ayat.add("19\n" +
                    "أَو كَصَيِّبٍ مِنَ السَّماءِ فيهِ ظُلُماتٌ وَرَعدٌ وَبَرقٌ يَجعَلونَ أَصابِعَهُم في آذانِهِم مِنَ الصَّواعِقِ حَذَرَ المَوتِ ۚ وَاللَّهُ مُحيطٌ بِالكافِرينَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾaw ka-ṣayyibin mina s-samāʾi fīhi ẓ-ẓulumātun wa-raʿdun wa-barqun yajʿalūna ʾaṣābiʿahum fī ʾādhānihim mina ṣ-ṣawāʿiqi ḥadhara l-mawti wa-llāhu muḥīṭun bi-l-kāfirīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Or that of a rainstorm from the sky,\n" +
                    "wherein is darkness, thunder, and lightning:\n" +
                    "they put their fingers in their ears\n" +
                    "due to the thunderclaps, apprehensive of death;\n" +
                    "and Allah besieges the faithless.");
            ayat.add("20\n" +
                    "يَكادُ البَرقُ يَخطَفُ أَبصارَهُم ۖ كُلَّما أَضاءَ لَهُم مَشَوا فيهِ وَإِذا أَظلَمَ عَلَيهِم قاموا ۚ وَلَو شاءَ اللَّهُ لَذَهَبَ بِسَمعِهِم وَأَبصارِهِم ۚ إِنَّ اللَّهَ عَلىٰ كُلِّ شَيءٍ قَديرٌ\n" +
                    "TRANSLITERATION\n" +
                    "yakādu l-barqu yakhṭafu ʾabṣārahum kullamā ʾaḍāʾa lahum mashaw fīhi wa-ʾidhā ʾaẓlama ʿalayhim qāmū wa-law shāʾa llāhu la-dhahaba bi-samʿihim wa-ʾabṣārihim ʾinna llāha ʿalā kulli shayʾin qadīrun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The lightning almost snatches away their sight:\n" +
                    "whenever it shines for them, they walk in it,\n" +
                    "and when the darkness falls upon them, they stand.\n" +
                    "Had Allah willed,\n" +
                    "He would have taken away their hearing\n" +
                    "and their sight.\n" +
                    "Indeed Allah has power over all things.\n");
            ayat.add("21\n" +
                    "يا أَيُّهَا النّاسُ اعبُدوا رَبَّكُمُ الَّذي خَلَقَكُم وَالَّذينَ مِن قَبلِكُم لَعَلَّكُم تَتَّقونَ\n" +
                    "TRANSLITERATION\n" +
                    "yā-ʾayyuhā n-nāsu ʿbudū rabbakumu lladhī khalaqakum wa-lladhīna min qablikum laʿallakum tattaqūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "O mankind! Worship your Lord,\n" +
                    "who created you\n" +
                    "and those who were before you,\n" +
                    "so that you may be Godwary.");
            ayat.add("22\n" +
                    "الَّذي جَعَلَ لَكُمُ الأَرضَ فِراشًا وَالسَّماءَ بِناءً وَأَنزَلَ مِنَ السَّماءِ ماءً فَأَخرَجَ بِهِ مِنَ الثَّمَراتِ رِزقًا لَكُم ۖ فَلا تَجعَلوا لِلَّهِ أَندادًا وَأَنتُم تَعلَمونَ\n" +
                    "TRANSLITERATION\n" +
                    "alladhī jaʿala lakumu l-ʾarḍa firāshan wa-s-samāʾa bināʾan wa-ʾanzala mina s-samāʾi māʾan fa-ʾakhraja bihī mina th-thamarāti rizqan lakum fa-lā tajʿalū li-llāhi ʾandādan wa-ʾantum taʿlamūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "He who made the earth a place of repose for you,\n" +
                    "and the sky a canopy,\n" +
                    "and He sends down water from the sky,\n" +
                    "and with it He brings forth crops\n" +
                    "for your sustenance.\n" +
                    "So do not set up equals to Allah,\n" +
                    "while you know.");
            ayat.add("23\n" +
                    "وَإِن كُنتُم في رَيبٍ مِمّا نَزَّلنا عَلىٰ عَبدِنا فَأتوا بِسورَةٍ مِن مِثلِهِ وَادعوا شُهَداءَكُم مِن دونِ اللَّهِ إِن كُنتُم صادِقينَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾin kuntum fī raybin mimmā nazzalnā ʿalā ʿabdinā fa-ʾtū bi-sūratin min mithlihī wa-dʿū shuhadāʾakum min dūni llāhi ʾin kuntum ṣādiqīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And if you are in doubt\n" +
                    "concerning what We have sent down\n" +
                    "to Our servant,\n" +
                    "then bring a sūrah like it,\n" +
                    "and invoke your helpers besides Allah,\n" +
                    "should you be truthful.");
            ayat.add("24\n" +
                    "فَإِن لَم تَفعَلوا وَلَن تَفعَلوا فَاتَّقُوا النّارَ الَّتي وَقودُهَا النّاسُ وَالحِجارَةُ ۖ أُعِدَّت لِلكافِرينَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾin lam tafʿalū wa-lan tafʿalū fa-ttaqū n-nāra llatī waqūduhā n-nāsu wa-l-ḥijāratu ʾuʿiddat li-l-kāfirīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And if you do not—and you will not—\n" +
                    "then beware the Fire whose fuel will be humans\n" +
                    "and stones,\n" +
                    "prepared for the faithless.");
            ayat.add("25\n" +
                    "وَبَشِّرِ الَّذينَ آمَنوا وَعَمِلُوا الصّالِحاتِ أَنَّ لَهُم جَنّاتٍ تَجري مِن تَحتِهَا الأَنهارُ ۖ كُلَّما رُزِقوا مِنها مِن ثَمَرَةٍ رِزقًا ۙ قالوا هٰذَا الَّذي رُزِقنا مِن قَبلُ ۖ وَأُتوا بِهِ مُتَشابِهًا ۖ وَلَهُم فيها أَزواجٌ مُطَهَّرَةٌ ۖ وَهُم فيها خالِدونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-bashshiri lladhīna ʾāmanū wa-ʿamilū ṣ-ṣāliḥāti ʾanna lahum jannātin tajrī min taḥtihā l-ʾanhāru kullamā ruziqū minhā min thamaratin rizqan qālū hādhā lladhī ruziqnā min qablu wa-ʾutū bihī mutashābihan wa-lahum fīhā ʾazwājun muṭahharatun wa-hum fīhā khālidūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And give good news to those who have faith\n" +
                    "and do righteous deeds,\n" +
                    "that for them shall be gardens\n" +
                    "with streams running in them:\n" +
                    "whenever they are provided with their fruit\n" +
                    "for nourishment,\n" +
                    "they will say,\n" +
                    "‘This is what we were provided before,’\n" +
                    "and they were given something resembling it.\n" +
                    "In it there will be chaste mates for them,\n" +
                    "and they will remain in it [forever].");
            ayat.add("26\n" +
                    "۞ إِنَّ اللَّهَ لا يَستَحيي أَن يَضرِبَ مَثَلًا ما بَعوضَةً فَما فَوقَها ۚ فَأَمَّا الَّذينَ آمَنوا فَيَعلَمونَ أَنَّهُ الحَقُّ مِن رَبِّهِم ۖ وَأَمَّا الَّذينَ كَفَروا فَيَقولونَ ماذا أَرادَ اللَّهُ بِهٰذا مَثَلًا ۘ يُضِلُّ بِهِ كَثيرًا وَيَهدي بِهِ كَثيرًا ۚ وَما يُضِلُّ بِهِ إِلَّا الفاسِقينَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna llāha lā yastaḥyī ʾan yaḍriba mathalan mā baʿūḍatan fa-mā fawqahā fa-ʾammā lladhīna ʾāmanū fa-yaʿlamūna ʾannahu l-ḥaqqu min rabbihim wa-ʾammā lladhīna kafarū fa-yaqūlūna mādhā ʾarāda llāhu bi-hādhā mathalan yuḍillu bihī kathīran wa-yahdī bihī kathīran wa-mā yuḍillu bihī ʾillā l-fāsiqīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed Allah is not ashamed to draw a parable\n" +
                    "whether it is that of a gnat or something above it.\n" +
                    "As for those who have faith,\n" +
                    "they know it is the truth from their Lord;\n" +
                    "and as for the faithless, they say,\n" +
                    "‘What did Allah mean by this parable?’\n" +
                    "Thereby He leads many astray,\n" +
                    "and thereby He guides many;\n" +
                    "and He leads no one astray thereby\n" +
                    "except the transgressors");
            ayat.add("27\n" +
                    "الَّذينَ يَنقُضونَ عَهدَ اللَّهِ مِن بَعدِ ميثاقِهِ وَيَقطَعونَ ما أَمَرَ اللَّهُ بِهِ أَن يوصَلَ وَيُفسِدونَ فِي الأَرضِ ۚ أُولٰئِكَ هُمُ الخاسِرونَ\n" +
                    "TRANSLITERATION\n" +
                    "alladhīna yanquḍūna ʿahda llāhi min baʿdi mīthāqihī wa-yaqṭaʿūna mā ʾamara llāhu bihī ʾan yūṣala wa-yufsidūna fī l-ʾarḍi ʾulāʾika humu l-khāsirūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "—those who break the covenant made with Allah\n" +
                    "after having pledged it solemnly,\n" +
                    "and sever\n" +
                    "what Allah has commanded to be joined,\n" +
                    "and cause corruption on the earth—\n" +
                    "it is they who are the losers.");
            ayat.add("28\n" +
                    "كَيفَ تَكفُرونَ بِاللَّهِ وَكُنتُم أَمواتًا فَأَحياكُم ۖ ثُمَّ يُميتُكُم ثُمَّ يُحييكُم ثُمَّ إِلَيهِ تُرجَعونَ\n" +
                    "TRANSLITERATION\n" +
                    "kayfa takfurūna bi-llāhi wa-kuntum ʾamwātan fa-ʾaḥyākum thumma yumītukum thumma yuḥyīkum thumma ʾilayhi turjaʿūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "How can you be unfaithful to Allah,\n" +
                    "[seeing that] you were lifeless\n" +
                    "and He gave you life,\n" +
                    "then He will make you die,\n" +
                    "and then He shall bring you to life,\n" +
                    "and then you will be brought back to Him?");
            ayat.add("29\n" +
                    "هُوَ الَّذي خَلَقَ لَكُم ما فِي الأَرضِ جَميعًا ثُمَّ استَوىٰ إِلَى السَّماءِ فَسَوّاهُنَّ سَبعَ سَماواتٍ ۚ وَهُوَ بِكُلِّ شَيءٍ عَليمٌ\n" +
                    "TRANSLITERATION\n" +
                    "huwa lladhī khalaqa lakum mā fī l-ʾarḍi jamīʿan thumma stawā ʾilā s-samāʾi fa-sawwāhunna sabʿa samāwātin wa-huwa bi-kulli shayʾin ʿalīmun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "It is He who created for you\n" +
                    "all that is in the earth,\n" +
                    "then He turned to the heaven,\n" +
                    "and fashioned it into seven heavens,\n" +
                    "and He has knowledge of all things.");
            ayat.add("30\n" +
                    "وَإِذ قالَ رَبُّكَ لِلمَلائِكَةِ إِنّي جاعِلٌ فِي الأَرضِ خَليفَةً ۖ قالوا أَتَجعَلُ فيها مَن يُفسِدُ فيها وَيَسفِكُ الدِّماءَ وَنَحنُ نُسَبِّحُ بِحَمدِكَ وَنُقَدِّسُ لَكَ ۖ قالَ إِنّي أَعلَمُ ما لا تَعلَمونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾidh qāla rabbuka li-l-malāʾikati ʾinnī jāʿilun fī l-ʾarḍi khalīfatan qālū ʾa-tajʿalu fīhā man yufsidu fīhā wa-yasfiku d-dimāʾa wa-naḥnu nusabbiḥu bi-ḥamdika wa-nuqaddisu laka qāla ʾinnī ʾaʿlamu mā lā taʿlamūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "When your Lord said to the angels,\n" +
                    "‘Indeed I am going to set a viceroy on the earth,’\n" +
                    "they said, ‘Will You set in it\n" +
                    "someone who will cause corruption in it,\n" +
                    "and shed blood,\n" +
                    "while we celebrate Your praise\n" +
                    "and proclaim Your sanctity?’\n" +
                    "He said, ‘Indeed I know what you do not know.");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
        }
        else if (surahName.equals(""))
        {
            setTitle("");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
        }
        else if (surahName.equals(""))
        {
            setTitle("");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
        }
        else if (surahName.equals(""))
        {
            setTitle("");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
        }
        else if (surahName.equals(""))
        {
            setTitle("");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
        }
        else if (surahName.equals(""))
        {
            setTitle("");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
        }
        else if (surahName.equals(""))
        {
            setTitle("");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
        }
        else if (surahName.equals(""))
        {
            setTitle("");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
        }
        else if (surahName.equals(""))
        {
            setTitle("");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
        }
        else if (surahName.equals(""))
        {
            setTitle("");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
        }
        else if (surahName.equals(""))
        {
            setTitle("");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
        }
        else if (surahName.equals(""))
        {
            setTitle("");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
        }
        else if (surahName.equals(""))
        {
            setTitle("");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
        }
        else if (surahName.equals(""))
        {
            setTitle("");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
        }
        else if (surahName.equals(""))
        {
            setTitle("");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
        }
        else if (surahName.equals(""))
        {
            setTitle("");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
        }
        else if (surahName.equals(""))
        {
            setTitle("");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
        }
        else if (surahName.equals(""))
        {
            setTitle("");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
        }
        else if (surahName.equals(""))
        {
            setTitle("");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
        }
        else if (surahName.equals(""))
        {
            setTitle("");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
        }
        else if (surahName.equals(""))
        {
            setTitle("");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
        }
        else if (surahName.equals(""))
        {
            setTitle("");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
        }
        else if (surahName.equals(""))
        {
            setTitle("");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
        }
        else if (surahName.equals("40. Ghafir"))
        {
            setTitle("Ghafir() : ");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
        }
        else if (surahName.equals("41. Fussilat"))
        {
            setTitle("Fussilat() : ");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
        }
        else if (surahName.equals("42. Ash-Shura"))
        {
            setTitle("Ash-Shura() : ");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
        }
        else if (surahName.equals("43. Az-Zukhruf"))
        {
            setTitle("Az-Zukhruf() : ");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
        }
        else if (surahName.equals("44. Ad-Dukhan"))
        {
            setTitle("Ad-Dukhan() : ");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
        }
        else if (surahName.equals("45. Al-Jathiyah"))
        {
            setTitle("Al-Jathiyah(الجاثية) : Crowling");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "حم\n" +
                    "TRANSLITERATION\n" +
                    "ḥ-m (ḥā mīm)\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Ḥā, Mīm.");
            ayat.add("2\n" +
                    "تَنزيلُ الكِتابِ مِنَ اللَّهِ العَزيزِ الحَكيمِ\n" +
                    "TRANSLITERATION\n" +
                    "tanzīlu l-kitābi mina llāhi l-ʿazīzi l-ḥakīmi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The [gradual] sending down of the Book is from Allah,\n" +
                    "the All-mighty, All-wise.");
            ayat.add("3\n" +
                    "إِنَّ فِي السَّماواتِ وَالأَرضِ لَآياتٍ لِلمُؤمِنينَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna fī s-samāwāti wa-l-ʾarḍi la-ʾāyātin li-l-muʾminīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed in the heavens and the earth there are signs\n" +
                    "for the faithful.");
            ayat.add("4\n" +
                    "وَفي خَلقِكُم وَما يَبُثُّ مِن دابَّةٍ آياتٌ لِقَومٍ يوقِنونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-fī khalqikum wa-mā yabuththu min dābbatin ʾāyātun li-qawmin yūqinūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And in your creation [too],\n" +
                    "and whatever animals that He scatters abroad,\n" +
                    "there are signs for a people who have certainty.");
            ayat.add("5\n" +
                    "وَاختِلافِ اللَّيلِ وَالنَّهارِ وَما أَنزَلَ اللَّهُ مِنَ السَّماءِ مِن رِزقٍ فَأَحيا بِهِ الأَرضَ بَعدَ مَوتِها وَتَصريفِ الرِّياحِ آياتٌ لِقَومٍ يَعقِلونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-khtilāfi l-layli wa-n-nahāri wa-mā ʾanzala llāhu mina s-samāʾi min rizqin fa-ʾaḥyā bihi l-ʾarḍa baʿda mawtihā wa-taṣrīfi r-riyāḥi ʾāyātun li-qawmin yaʿqilūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And in the alternation of night and day\n" +
                    "and what Allah sends down from the sky\n" +
                    "of [His] provision\n" +
                    "with which He revives the earth after its death,\n" +
                    "and in the changing of the winds\n" +
                    "there are signs for a people who apply reason.");
            ayat.add("6\n" +
                    "تِلكَ آياتُ اللَّهِ نَتلوها عَلَيكَ بِالحَقِّ ۖ فَبِأَيِّ حَديثٍ بَعدَ اللَّهِ وَآياتِهِ يُؤمِنونَ\n" +
                    "TRANSLITERATION\n" +
                    "tilka ʾāyātu llāhi natlūhā ʿalayka bi-l-ḥaqqi fa-bi-ʾayyi ḥadīthin baʿda llāhi wa-ʾāyātihī yuʾminūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "These are the signs of Allah\n" +
                    "that We recite for you in truth.\n" +
                    "So what discourse\n" +
                    "will they believe after Allah and His signs?");
            ayat.add("7\n" +
                    "وَيلٌ لِكُلِّ أَفّاكٍ أَثيمٍ\n" +
                    "TRANSLITERATION\n" +
                    "waylun li-kulli ʾaffākin ʾathīmin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Woe to every sinful liar,");
            ayat.add("8\n" +
                    "يَسمَعُ آياتِ اللَّهِ تُتلىٰ عَلَيهِ ثُمَّ يُصِرُّ مُستَكبِرًا كَأَن لَم يَسمَعها ۖ فَبَشِّرهُ بِعَذابٍ أَليمٍ\n" +
                    "TRANSLITERATION\n" +
                    "yasmaʿu ʾāyāti llāhi tutlā ʿalayhi thumma yuṣirru mustakbiran ka-ʾan lam yasmaʿhā fa-bashshirhu bi-ʿadhābin ʾalīmin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "who hears the signs of Allah being recited to him,\n" +
                    "yet persists disdainfully,\n" +
                    "as if he had not heard them.\n" +
                    "So inform him of a painful punishment.");
            ayat.add("9\n" +
                    "وَإِذا عَلِمَ مِن آياتِنا شَيئًا اتَّخَذَها هُزُوًا ۚ أُولٰئِكَ لَهُم عَذابٌ مُهينٌ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾidhā ʿalima min ʾāyātinā shayʾan-i ttakhadhahā huzuwan ʾulāʾika lahum ʿadhābun muhīnun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Should he learn anything about Our signs,\n" +
                    "he takes them in derision.\n" +
                    "For such there is a humiliating punishment.");
            ayat.add("10\n" +
                    "مِن وَرائِهِم جَهَنَّمُ ۖ وَلا يُغني عَنهُم ما كَسَبوا شَيئًا وَلا مَا اتَّخَذوا مِن دونِ اللَّهِ أَولِياءَ ۖ وَلَهُم عَذابٌ عَظيمٌ\n" +
                    "TRANSLITERATION\n" +
                    "min warāʾihim jahannamu wa-lā yughnī ʿanhum mā kasabū shayʾan wa-lā mā ttakhadhū min dūni llāhi ʾawliyāʾa wa-lahum ʿadhābun ʿaẓīmun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Ahead of them is hell\n" +
                    "and what they have earned will not avail them in any way,\n" +
                    "nor what they had taken as guardians besides Allah,\n" +
                    "and there is a great punishment for them.");
            ayat.add("11\n" +
                    "هٰذا هُدًى ۖ وَالَّذينَ كَفَروا بِآياتِ رَبِّهِم لَهُم عَذابٌ مِن رِجزٍ أَليمٌ\n" +
                    "TRANSLITERATION\n" +
                    "hādhā hudan wa-lladhīna kafarū bi-ʾāyāti rabbihim lahum ʿadhābun min rijzin ʾalīmun-i\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "This is a guidance,\n" +
                    "and as for those who defy the signs of their Lord,\n" +
                    "for them is a painful punishment due to defilement.");
            ayat.add("12\n" +
                    "۞ اللَّهُ الَّذي سَخَّرَ لَكُمُ البَحرَ لِتَجرِيَ الفُلكُ فيهِ بِأَمرِهِ وَلِتَبتَغوا مِن فَضلِهِ وَلَعَلَّكُم تَشكُرونَ\n" +
                    "TRANSLITERATION\n" +
                    "allāhu lladhī sakhkhara lakumu l-baḥra li-tajriya l-fulku fīhi bi-ʾamrihī wa-li tabtaghū min faḍlihī wa-laʿallakum tashkurūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "It is Allah who disposed the sea for you[r benefit]\n" +
                    "so that the ships may sail in it by His command,\n" +
                    "and that you may seek of His grace,\n" +
                    "and that you may give thanks.");
            ayat.add("13\n" +
                    "وَسَخَّرَ لَكُم ما فِي السَّماواتِ وَما فِي الأَرضِ جَميعًا مِنهُ ۚ إِنَّ في ذٰلِكَ لَآياتٍ لِقَومٍ يَتَفَكَّرونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-sakhkhara lakum mā fī s-samāwāti wa-mā fī l-ʾarḍi jamīʿan minhu ʾinna fī dhālika la-ʾāyātin li-qawmin yatafakkarūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And He has disposed for you[r benefit]\n" +
                    "whatever is in the heavens\n" +
                    "and whatever is on the earth;\n" +
                    "all is from Him.\n" +
                    "There are indeed signs in that\n" +
                    "for a people who reflect.");
            ayat.add("14\n" +
                    "قُل لِلَّذينَ آمَنوا يَغفِروا لِلَّذينَ لا يَرجونَ أَيّامَ اللَّهِ لِيَجزِيَ قَومًا بِما كانوا يَكسِبونَ\n" +
                    "TRANSLITERATION\n" +
                    "qul li-lladhīna ʾāmanū yaghfirū li-lladhīna lā yarjūna ʾayyāma llāhi li-yajziya qawman bi-mā kānū yaksibūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Say to the faithful\n" +
                    "to forgive those who do not expect Allah’s days,\n" +
                    "that He may [Himself] requite a people\n" +
                    "for what they used to earn.");
            ayat.add("15\n" +
                    "مَن عَمِلَ صالِحًا فَلِنَفسِهِ ۖ وَمَن أَساءَ فَعَلَيها ۖ ثُمَّ إِلىٰ رَبِّكُم تُرجَعونَ\n" +
                    "TRANSLITERATION\n" +
                    "man ʿamila ṣāliḥan fa-li-nafsihī wa-man ʾasāʾa fa-ʿalayhā thumma ʾilā rabbikum turjaʿūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Whoever acts righteously, it is for his own soul,\n" +
                    "and whoever does evil, it is to its own detriment,\n" +
                    "then you will be brought back to your Lord.\n");
            ayat.add("16\n" +
                    "وَلَقَد آتَينا بَني إِسرائيلَ الكِتابَ وَالحُكمَ وَالنُّبُوَّةَ وَرَزَقناهُم مِنَ الطَّيِّباتِ وَفَضَّلناهُم عَلَى العالَمينَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-la-qad ʾātaynā banī ʾisrāʾīla l-kitāba wa-l-ḥukma wa-n-nubuwwata wa-razaqnāhum mina ṭ-ṭayyibāti wa-faḍḍalnāhum ʿalā l-ʿālamīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Certainly We gave the Children of Israel the Book,\n" +
                    "judgement and prophethood\n" +
                    "and We provided them with all the good things,\n" +
                    "and We gave them an advantage over all the nations,");
            ayat.add("17\n" +
                    "وَآتَيناهُم بَيِّناتٍ مِنَ الأَمرِ ۖ فَمَا اختَلَفوا إِلّا مِن بَعدِ ما جاءَهُمُ العِلمُ بَغيًا بَينَهُم ۚ إِنَّ رَبَّكَ يَقضي بَينَهُم يَومَ القِيامَةِ فيما كانوا فيهِ يَختَلِفونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾātaynāhum bayyinātin mina l-ʾamri fa-mā khtalafū ʾillā min baʿdi mā jāʾahumu l-ʿilmu baghyan baynahum ʾinna rabbaka yaqḍī baynahum yawma l-qiyāmati fī-mā kānū fīhi yakhtalifūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and We gave them manifest precepts.\n" +
                    "But they did not differ\n" +
                    "except after knowledge had come to them,\n" +
                    "out of envy among themselves.\n" +
                    "Indeed your Lord will judge between them\n" +
                    "on the Day of Resurrection\n" +
                    "concerning that about which they used to differ.");
            ayat.add("18\n" +
                    "ثُمَّ جَعَلناكَ عَلىٰ شَريعَةٍ مِنَ الأَمرِ فَاتَّبِعها وَلا تَتَّبِع أَهواءَ الَّذينَ لا يَعلَمونَ\n" +
                    "TRANSLITERATION\n" +
                    "thumma jaʿalnāka ʿalā sharīʿatin mina l-ʾamri fa-ttabiʿhā wa-lā tattabiʿ ʾahwāʾa lladhīna lā yaʿlamūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Then We set you upon a clear course of the Law;\n" +
                    "so follow it,\n" +
                    "and do not follow the desires of those\n" +
                    "who do not know.");
            ayat.add("19\n" +
                    "إِنَّهُم لَن يُغنوا عَنكَ مِنَ اللَّهِ شَيئًا ۚ وَإِنَّ الظّالِمينَ بَعضُهُم أَولِياءُ بَعضٍ ۖ وَاللَّهُ وَلِيُّ المُتَّقينَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnahum lan yughnū ʿanka mina llāhi shayʾan wa-ʾinna ẓ-ẓālimīna baʿḍuhum ʾawliyāʾu baʿḍin wa-llāhu waliyyu l-muttaqīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed they will not avail you\n" +
                    "in any way against Allah.\n" +
                    "Indeed the wrongdoers are allies of one another,\n" +
                    "but Allah is the guardian1 of the Godwary.");
            ayat.add("20\n" +
                    "هٰذا بَصائِرُ لِلنّاسِ وَهُدًى وَرَحمَةٌ لِقَومٍ يوقِنونَ\n" +
                    "TRANSLITERATION\n" +
                    "hādhā baṣāʾiru li-n-nāsi wa-hudan wa-raḥmatun li-qawmin yūqinūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "These are eye-openers for mankind,\n" +
                    "and guidance and mercy\n" +
                    "for a people who have certainty.");
            ayat.add("21\n" +
                    "أَم حَسِبَ الَّذينَ اجتَرَحُوا السَّيِّئَاتِ أَن نَجعَلَهُم كَالَّذينَ آمَنوا وَعَمِلُوا الصّالِحاتِ سَواءً مَحياهُم وَمَماتُهُم ۚ ساءَ ما يَحكُمونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾam ḥasiba lladhīna jtaraḥū s-sayyiʾāti ʾan najʿalahum ka-lladhīna ʾāmanū wa-ʿamilū ṣ-ṣāliḥāti sawāʾan maḥyāhum wa-mamātuhum sāʾa mā yaḥkumūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Do those who have perpetrated misdeeds suppose\n" +
                    "that We shall treat them as those who have faith\n" +
                    "and do righteous deeds,\n" +
                    "their life and death being equal?\n" +
                    "Evil is the judgement that they make!");
            ayat.add("22\n" +
                    "وَخَلَقَ اللَّهُ السَّماواتِ وَالأَرضَ بِالحَقِّ وَلِتُجزىٰ كُلُّ نَفسٍ بِما كَسَبَت وَهُم لا يُظلَمونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-khalaqa llāhu s-samāwāti wa-l-ʾarḍa bi-l-ḥaqqi wa-li-tujzā kullu nafsin bi-mā kasabat wa-hum lā yuẓlamūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Allah created the heavens and the earth\n" +
                    "with reason,\n" +
                    "so that every soul may be requited\n" +
                    "for what it has earned,\n" +
                    "and they will not be wronged.");
            ayat.add("23\n" +
                    "أَفَرَأَيتَ مَنِ اتَّخَذَ إِلٰهَهُ هَواهُ وَأَضَلَّهُ اللَّهُ عَلىٰ عِلمٍ وَخَتَمَ عَلىٰ سَمعِهِ وَقَلبِهِ وَجَعَلَ عَلىٰ بَصَرِهِ غِشاوَةً فَمَن يَهديهِ مِن بَعدِ اللَّهِ ۚ أَفَلا تَذَكَّرونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-fa-raʾayta mani ttakhadha ʾilāhahū hawāhu wa-ʾaḍallahu llāhu ʿalā ʿilmin wa-khatama ʿalā samʿihī wa-qalbihī wa-jaʿala ʿalā baṣarihī ghishāwatan fa-man yahdīhi min baʿdi llāhi ʾa-fa-lā tadhakkarūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Have you seen him who has taken\n" +
                    "his desire to be his god\n" +
                    "and whom Allah has led astray knowingly,\n" +
                    "and set a seal upon his hearing and his heart,\n" +
                    "and put a blindfold on his sight?\n" +
                    "So who will guide him after Allah?\n" +
                    "Will you not then take admonition?");
            ayat.add("24\n" +
                    "وَقالوا ما هِيَ إِلّا حَياتُنَا الدُّنيا نَموتُ وَنَحيا وَما يُهلِكُنا إِلَّا الدَّهرُ ۚ وَما لَهُم بِذٰلِكَ مِن عِلمٍ ۖ إِن هُم إِلّا يَظُنّونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-qālū mā hiya ʾillā ḥayātunā d-dunyā namūtu wa-naḥyā wa-mā yuhlikunā ʾillā d-dahru wa-mā lahum bi-dhālika min ʿilmin ʾin hum ʾillā yaẓunnūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They say,\n" +
                    "‘There is nothing but the life of this world:\n" +
                    "we live and we die,\n" +
                    "and nothing but time destroys us.’\n" +
                    "But they do not have any knowledge of that,\n" +
                    "and they only make conjectures.");
            ayat.add("25\n" +
                    "وَإِذا تُتلىٰ عَلَيهِم آياتُنا بَيِّناتٍ ما كانَ حُجَّتَهُم إِلّا أَن قالُوا ائتوا بِآبائِنا إِن كُنتُم صادِقينَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾidhā tutlā ʿalayhim ʾāyātunā bayyinātin mā kāna ḥujjatahum ʾillā ʾan qālū ʾtū bi-ʾābāʾinā ʾin kuntum ṣādiqīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And when Our manifest signs are recited to them,\n" +
                    "their only argument is to say,\n" +
                    "‘Bring our fathers back [to life],\n" +
                    "should you be truthful.’");
            ayat.add("26\n" +
                    "قُلِ اللَّهُ يُحييكُم ثُمَّ يُميتُكُم ثُمَّ يَجمَعُكُم إِلىٰ يَومِ القِيامَةِ لا رَيبَ فيهِ وَلٰكِنَّ أَكثَرَ النّاسِ لا يَعلَمونَ\n" +
                    "TRANSLITERATION\n" +
                    "quli llāhu yuḥyīkum thumma yumītukum thumma yajmaʿukum ʾilā yawmi l-qiyāmati lā rayba fīhi wa-lākinna ʾakthara n-nāsi lā yaʿlamūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Say, ‘It is Allah who gives you life,\n" +
                    "then He makes you die.\n" +
                    "Then He will gather you\n" +
                    "on the Day of Resurrection,\n" +
                    "in which there is no doubt.\n" +
                    "But most people do not know.’");
            ayat.add("27\n" +
                    "وَلِلَّهِ مُلكُ السَّماواتِ وَالأَرضِ ۚ وَيَومَ تَقومُ السّاعَةُ يَومَئِذٍ يَخسَرُ المُبطِلونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-li-llāhi mulku s-samāwāti wa-l-ʾarḍi wa-yawma taqūmu s-sāʿatu yawmaʾidhin yakhsaru l-mubṭilūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "To Allah belongs the kingdom of the heavens\n" +
                    "and the earth,\n" +
                    "and when the Hour sets in,\n" +
                    "the falsifiers will be losers on that day.");
            ayat.add("28\n" +
                    "وَتَرىٰ كُلَّ أُمَّةٍ جاثِيَةً ۚ كُلُّ أُمَّةٍ تُدعىٰ إِلىٰ كِتابِهَا اليَومَ تُجزَونَ ما كُنتُم تَعمَلونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-tarā kulla ʾummatin jāthiyatan kullu ʾummatin tudʿā ʾilā kitābihā l-yawma tujzawna mā kuntum taʿmalūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And you will see every nation fallen on its knees.\n" +
                    "Every nation will be summoned to its book:\n" +
                    "‘Today you will be requited for\n" +
                    "what you used to do.");
            ayat.add("29\n" +
                    "هٰذا كِتابُنا يَنطِقُ عَلَيكُم بِالحَقِّ ۚ إِنّا كُنّا نَستَنسِخُ ما كُنتُم تَعمَلونَ\n" +
                    "TRANSLITERATION\n" +
                    "hādhā kitābunā yanṭiqu ʿalaykum bi-l-ḥaqqi ʾinnā kunnā nastansikhu mā kuntum taʿmalūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "This is Our book, which speaks truly against you.\n" +
                    "Indeed We used to record what you used to do.’");
            ayat.add("30\n" +
                    "فَأَمَّا الَّذينَ آمَنوا وَعَمِلُوا الصّالِحاتِ فَيُدخِلُهُم رَبُّهُم في رَحمَتِهِ ۚ ذٰلِكَ هُوَ الفَوزُ المُبينُ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾammā lladhīna ʾāmanū wa-ʿamilū ṣ-ṣāliḥāti fa-yudkhiluhum rabbuhum fī raḥmatihī dhālika huwa l-fawzu l-mubīnu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "As for those who have faith\n" +
                    "and do righteous deeds,\n" +
                    "their Lord will admit them into His mercy.\n" +
                    "That is the manifest success!");
            ayat.add("31\n" +
                    "وَأَمَّا الَّذينَ كَفَروا أَفَلَم تَكُن آياتي تُتلىٰ عَلَيكُم فَاستَكبَرتُم وَكُنتُم قَومًا مُجرِمينَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾammā lladhīna kafarū ʾa-fa-lam takun ʾāyātī tutlā ʿalaykum fa-stakbartum wa-kuntum qawman mujrimīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "But as for the faithless, [they will be asked,]\n" +
                    "‘Were not My signs recited to you?\n" +
                    "But you were disdainful,\n" +
                    "and you were a guilty lot.");
            ayat.add("32\n" +
                    "وَإِذا قيلَ إِنَّ وَعدَ اللَّهِ حَقٌّ وَالسّاعَةُ لا رَيبَ فيها قُلتُم ما نَدري مَا السّاعَةُ إِن نَظُنُّ إِلّا ظَنًّا وَما نَحنُ بِمُستَيقِنينَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾidhā qīla ʾinna waʿda llāhi ḥaqqun wa-s-sāʿatu lā rayba fīhā qultum mā nadrī mā s-sāʿatu ʾin naẓunnu ʾillā ẓannan wa-mā naḥnu bi-mustayqinīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And when it was said,\n" +
                    "“Allah’s promise is indeed true,\n" +
                    "and there is no doubt about the Hour,”\n" +
                    "you said, “We do not know what the Hour is.\n" +
                    "We know nothing beyond conjectures,\n" +
                    "and we do not possess any certainty.” ’");
            ayat.add("33\n" +
                    "وَبَدا لَهُم سَيِّئَاتُ ما عَمِلوا وَحاقَ بِهِم ما كانوا بِهِ يَستَهزِئونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-badā lahum sayyiʾātu mā ʿamilū wa-ḥāqa bihim mā kānū bihī yastahziʾūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The evils of what they had done will appear to them,\n" +
                    "and they will be besieged\n" +
                    "by what they used to deride.");
            ayat.add("34\n" +
                    "وَقيلَ اليَومَ نَنساكُم كَما نَسيتُم لِقاءَ يَومِكُم هٰذا وَمَأواكُمُ النّارُ وَما لَكُم مِن ناصِرينَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-qīla l-yawma nansākum ka-mā nasītum liqāʾa yawmikum hādhā wa-maʾwākumu n-nāru wa-mā lakum min nāṣirīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And it will be said, ‘Today We will forget you,\n" +
                    "just as you forgot the encounter of this day of yours.\n" +
                    "The Fire will be your abode,\n" +
                    "and you will not have any helpers.");
            ayat.add("35\n" +
                    "ذٰلِكُم بِأَنَّكُمُ اتَّخَذتُم آياتِ اللَّهِ هُزُوًا وَغَرَّتكُمُ الحَياةُ الدُّنيا ۚ فَاليَومَ لا يُخرَجونَ مِنها وَلا هُم يُستَعتَبونَ\n" +
                    "TRANSLITERATION\n" +
                    "dhālikum bi-ʾannakumu ttakhadhtum ʾāyāti llāhi huzuwan wa-gharratkumu l-ḥayātu d-dunyā fa-l-yawma lā yukhrajūna minhā wa-lā hum yustaʿtabūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "That is because you took the signs of Allah\n" +
                    "in derision,\n" +
                    "and the life of the world had deceived you.’\n" +
                    "So today they will not be brought out of it,\n" +
                    "nor will they be asked to propitiate [Allah].");
            ayat.add("36\n" +
                    "فَلِلَّهِ الحَمدُ رَبِّ السَّماواتِ وَرَبِّ الأَرضِ رَبِّ العالَمينَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-li-llāhi l-ḥamdu rabbi s-samāwāti wa-rabbi l-ʾarḍi rabbi l-ʿālamīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So all praise belongs to Allah,\n" +
                    "the Lord of the heavens and the Lord of the earth,\n" +
                    "the Lord of all the worlds.");
            ayat.add("37\n" +
                    "وَلَهُ الكِبرِياءُ فِي السَّماواتِ وَالأَرضِ ۖ وَهُوَ العَزيزُ الحَكيمُ\n" +
                    "TRANSLITERATION\n" +
                    "wa-lahu l-kibriyāʾu fī s-samāwāti wa-l-ʾarḍi wa-huwa l-ʿazīzu l-ḥakīmu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "To Him belongs all supremacy in the heavens\n" +
                    "and the earth,\n" +
                    "and He is the All-mighty, the All-wise.");
        }
        else if (surahName.equals("46. Al-Ahqaf"))
        {
            setTitle("Al-Ahqaf(الأحقاف) : Aḥqāf");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "حم\n" +
                    "TRANSLITERATION\n" +
                    "ḥ-m (ḥā mīm)\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Ḥā, Mīm.");
            ayat.add("2\n" +
                    "تَنزيلُ الكِتابِ مِنَ اللَّهِ العَزيزِ الحَكيمِ\n" +
                    "TRANSLITERATION\n" +
                    "tanzīlu l-kitābi mina llāhi l-ʿazīzi l-ḥakīmi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The [gradual] sending down of the Book is from Allah,\n" +
                    "the All-mighty, the All-wise.");
            ayat.add("3\n" +
                    "ما خَلَقنَا السَّماواتِ وَالأَرضَ وَما بَينَهُما إِلّا بِالحَقِّ وَأَجَلٍ مُسَمًّى ۚ وَالَّذينَ كَفَروا عَمّا أُنذِروا مُعرِضونَ\n" +
                    "TRANSLITERATION\n" +
                    "mā khalaqnā s-samāwāti wa-l-ʾarḍa wa-mā baynahumā ʾillā bi-l-ḥaqqi wa-ʾajalin musamman wa-lladhīna kafarū ʿammā ʾundhirū muʿriḍūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "We did not create the heavens and the earth\n" +
                    "and whatever is between them\n" +
                    "except with reason and for a specified term.\n" +
                    "Yet the faithless\n" +
                    "are disregardful of what they are warned.");
            ayat.add("4\n" +
                    "قُل أَرَأَيتُم ما تَدعونَ مِن دونِ اللَّهِ أَروني ماذا خَلَقوا مِنَ الأَرضِ أَم لَهُم شِركٌ فِي السَّماواتِ ۖ ائتوني بِكِتابٍ مِن قَبلِ هٰذا أَو أَثارَةٍ مِن عِلمٍ إِن كُنتُم صادِقينَ\n" +
                    "TRANSLITERATION\n" +
                    "qul ʾa-raʾaytum mā tadʿūna min dūni llāhi ʾarūnī mādhā khalaqū mina l-ʾarḍi ʾam lahum shirkun fī s-samāwāti ʾtūnī bi-kitābin min qabli hādhā ʾaw ʾathāratin min ʿilmin ʾin kuntum ṣādiqīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Say, ‘Tell me about\n" +
                    "what you invoke besides Allah.\n" +
                    "Show me\n" +
                    "what [part] of the earth have they created.\n" +
                    "Do they have any share in the heavens?\n" +
                    "Bring me a scripture [revealed] before this,\n" +
                    "or some vestige of [divine] knowledge,\n" +
                    "should you be truthful.’");
            ayat.add("5\n" +
                    "وَمَن أَضَلُّ مِمَّن يَدعو مِن دونِ اللَّهِ مَن لا يَستَجيبُ لَهُ إِلىٰ يَومِ القِيامَةِ وَهُم عَن دُعائِهِم غافِلونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-man ʾaḍallu mimman yadʿū min dūni llāhi man lā yastajību lahū ʾilā yawmi l-qiyāmati wa-hum ʿan duʿāʾihim ghāfilūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Who is more astray than him who invokes\n" +
                    "besides Allah\n" +
                    "such as would not respond to him\n" +
                    "until the Day of Resurrection,\n" +
                    "and who are oblivious of their invocation?");
            ayat.add("6\n" +
                    "وَإِذا حُشِرَ النّاسُ كانوا لَهُم أَعداءً وَكانوا بِعِبادَتِهِم كافِرينَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾidhā ḥushira n-nāsu kānū lahum ʾaʿdāʾan wa-kānū bi-ʿibādatihim kāfirīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "When mankind are mustered [on Judgement’s Day]\n" +
                    "they will be their enemies,\n" +
                    "and they will disavow their worship.");
            ayat.add("7\n" +
                    "وَإِذا تُتلىٰ عَلَيهِم آياتُنا بَيِّناتٍ قالَ الَّذينَ كَفَروا لِلحَقِّ لَمّا جاءَهُم هٰذا سِحرٌ مُبينٌ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾidhā tutlā ʿalayhim ʾāyātunā bayyinātin qāla lladhīna kafarū li-l-ḥaqqi lammā jāʾahum hādhā ṣiḥrun mubīnun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "When Our manifest signs are recited to them,\n" +
                    "the faithless say of the truth when it comes to them:\n" +
                    "‘This is plain magic.’");
            ayat.add("8\n" +
                    "أَم يَقولونَ افتَراهُ ۖ قُل إِنِ افتَرَيتُهُ فَلا تَملِكونَ لي مِنَ اللَّهِ شَيئًا ۖ هُوَ أَعلَمُ بِما تُفيضونَ فيهِ ۖ كَفىٰ بِهِ شَهيدًا بَيني وَبَينَكُم ۖ وَهُوَ الغَفورُ الرَّحيمُ\n" +
                    "TRANSLITERATION\n" +
                    "ʾam yaqūlūna ftarāhu qul ʾini ftaraytuhū fa-lā tamlikūna lī mina llāhi shayʾan huwa ʾaʿlamu bi-mā tufīḍūna fīhi kafā bihī shahīdan baynī wa-baynakum wa-huwa l-ghafūru r-raḥīmu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Do they say, ‘He has fabricated it?’\n" +
                    "Say, ‘Should I have fabricated it,\n" +
                    "you would not avail me anything against Allah.\n" +
                    "He best knows what you gossip concerning it.\n" +
                    "He suffices as a witness between me and you,\n" +
                    "and He is the All-forgiving, the All-merciful.’");
            ayat.add("9\n" +
                    "قُل ما كُنتُ بِدعًا مِنَ الرُّسُلِ وَما أَدري ما يُفعَلُ بي وَلا بِكُم ۖ إِن أَتَّبِعُ إِلّا ما يوحىٰ إِلَيَّ وَما أَنا إِلّا نَذيرٌ مُبينٌ\n" +
                    "TRANSLITERATION\n" +
                    "qul mā kuntu bidʿan mina r-rusuli wa-mā ʾadrī mā yufʿalu bī wa-lā bikum ʾin ʾattabiʿu ʾillā mā yūḥā ʾilayya wa-mā ʾana ʾillā nadhīrun mubīnun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Say, ‘I am not a novelty among the apostles,\n" +
                    "nor do I know what will be done with me,\n" +
                    "or with you.\n" +
                    "I just follow whatever is revealed to me,\n" +
                    "and I am just a manifest warner.’");
            ayat.add("10\n" +
                    "قُل أَرَأَيتُم إِن كانَ مِن عِندِ اللَّهِ وَكَفَرتُم بِهِ وَشَهِدَ شاهِدٌ مِن بَني إِسرائيلَ عَلىٰ مِثلِهِ فَآمَنَ وَاستَكبَرتُم ۖ إِنَّ اللَّهَ لا يَهدِي القَومَ الظّالِمينَ\n" +
                    "TRANSLITERATION\n" +
                    "qul ʾa-raʾaytum ʾin kāna min ʿindi llāhi wa-kafartum bihī wa-shahida shāhidun min banī ʾisrāʾīla ʿalā mithlihī fa-ʾāmana wa-stakbartum ʾinna llāha lā yahdī l-qawma ẓ-ẓālimīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Say, ‘Tell me, if it is from Allah\n" +
                    "and you disbelieve in it,\n" +
                    "and a witness from the Children of Israel has testified\n" +
                    "to its like\n" +
                    "and believed [in it],\n" +
                    "while you are disdainful [of it]?’1\n" +
                    "Indeed Allah does not guide the wrongdoing lot.");
            ayat.add("11\n" +
                    "وَقالَ الَّذينَ كَفَروا لِلَّذينَ آمَنوا لَو كانَ خَيرًا ما سَبَقونا إِلَيهِ ۚ وَإِذ لَم يَهتَدوا بِهِ فَسَيَقولونَ هٰذا إِفكٌ قَديمٌ\n" +
                    "TRANSLITERATION\n" +
                    "wa-qāla lladhīna kafarū li-lladhīna ʾāmanū law kāna khayran mā sabaqūnā ʾilayhi wa-ʾidh lam yahtadū bihī fa-sa-yaqūlūna hādhā ʾifkun qadīmun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The faithless say about the faithful,\n" +
                    "‘Had it been [anything] good,\n" +
                    "they would not have taken the lead over us\n" +
                    "toward [accepting] it.’\n" +
                    "And since they could not find the way to it,\n" +
                    "they will say, ‘It is an ancient lie.’");
            ayat.add("12\n" +
                    "وَمِن قَبلِهِ كِتابُ موسىٰ إِمامًا وَرَحمَةً ۚ وَهٰذا كِتابٌ مُصَدِّقٌ لِسانًا عَرَبِيًّا لِيُنذِرَ الَّذينَ ظَلَموا وَبُشرىٰ لِلمُحسِنينَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-min qablihī kitābu mūsā ʾimāman wa-raḥmatan wa-hādhā kitābun muṣaddiqun lisānan ʿarabiyyan li-yundhira lladhīna ẓalamū wa-bushrā li-l-muḥsinīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Yet before it the Book of Moses\n" +
                    "was a guide and a mercy,\n" +
                    "and this is a Book which confirms it,\n" +
                    "in the Arabic language,\n" +
                    "to warn those who do wrong,\n" +
                    "and is a [bearer of] good news for the virtuous.");
            ayat.add("13\n" +
                    "إِنَّ الَّذينَ قالوا رَبُّنَا اللَّهُ ثُمَّ استَقاموا فَلا خَوفٌ عَلَيهِم وَلا هُم يَحزَنونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna lladhīna qālū rabbunā llāhu thumma staqāmū fa-lā khawfun ʿalayhim wa-lā hum yaḥzanūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed those who say, ‘Our Lord is Allah,’\n" +
                    "and then remain steadfast,\n" +
                    "they will have no fear,\n" +
                    "nor will they grieve.");
            ayat.add("14\n" +
                    "أُولٰئِكَ أَصحابُ الجَنَّةِ خالِدينَ فيها جَزاءً بِما كانوا يَعمَلونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾulāʾika ʾaṣḥābu l-jannati khālidīna fīhā jazāʾan bi-mā kānū yaʿmalūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They shall be the inhabitants of paradise,\n" +
                    "remaining in it [forever]\n" +
                    "a reward for what they used to do.");
            ayat.add("15\n" +
                    "وَوَصَّينَا الإِنسانَ بِوالِدَيهِ إِحسانًا ۖ حَمَلَتهُ أُمُّهُ كُرهًا وَوَضَعَتهُ كُرهًا ۖ وَحَملُهُ وَفِصالُهُ ثَلاثونَ شَهرًا ۚ حَتّىٰ إِذا بَلَغَ أَشُدَّهُ وَبَلَغَ أَربَعينَ سَنَةً قالَ رَبِّ أَوزِعني أَن أَشكُرَ نِعمَتَكَ الَّتي أَنعَمتَ عَلَيَّ وَعَلىٰ والِدَيَّ وَأَن أَعمَلَ صالِحًا تَرضاهُ وَأَصلِح لي في ذُرِّيَّتي ۖ إِنّي تُبتُ إِلَيكَ وَإِنّي مِنَ المُسلِمينَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-waṣṣaynā l-ʾinsāna bi-wālidayhi ʾiḥsānan ḥamalathu ʾummuhū kurhan wa-waḍaʿathu kurhan wa-ḥamluhū wa-fiṣāluhū thalāthūna shahran ḥattā ʾidhā balagha ʾashuddahū wa-balagha ʾarbaʿīna sanatan qāla rabbi ʾawziʿnī ʾan ʾashkura niʿmataka llatī ʾanʿamta ʿalayya wa-ʿalā wālidayya wa-ʾan ʾaʿmala ṣāliḥan tarḍāhu wa-ʾaṣliḥ lī fī dhurriyyatī ʾinnī tubtu ʾilayka wa-ʾinnī mina l-muslimīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "We have enjoined man to be kind to his parents.\n" +
                    "His mother has carried him in travail,\n" +
                    "and bore him in travail,\n" +
                    "and his gestation and weaning take thirty months.\n" +
                    "When he comes of age\n" +
                    "and reaches forty years,\n" +
                    "he says, ‘My Lord!\n" +
                    "Inspire me to give thanks for Your blessing\n" +
                    "with which You have blessed me\n" +
                    "and my parents,\n" +
                    "and that I may do righteous deeds\n" +
                    "which may please You,\n" +
                    "and invest my descendants with righteousness.\n" +
                    "Indeed I have turned to you in penitence,\n" +
                    "and I am one of the muslims.’");
            ayat.add("16\n" +
                    "أُولٰئِكَ الَّذينَ نَتَقَبَّلُ عَنهُم أَحسَنَ ما عَمِلوا وَنَتَجاوَزُ عَن سَيِّئَاتِهِم في أَصحابِ الجَنَّةِ ۖ وَعدَ الصِّدقِ الَّذي كانوا يوعَدونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾulāʾika lladhīna nataqabbalu ʿanhum ʾaḥsana mā ʿamilū wa-natajāwazu ʿan sayyiʾātihim fī ʾaṣḥābi l-jannati waʿda ṣ-ṣidqi lladhī kānū yūʿadūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Such are the ones from whom We accept\n" +
                    "the best of what they do,\n" +
                    "and overlook their misdeeds,\n" +
                    "[who will be] among the inhabitants of paradise\n" +
                    "—a true promise which they had been given.");
            ayat.add("17\n" +
                    "وَالَّذي قالَ لِوالِدَيهِ أُفٍّ لَكُما أَتَعِدانِني أَن أُخرَجَ وَقَد خَلَتِ القُرونُ مِن قَبلي وَهُما يَستَغيثانِ اللَّهَ وَيلَكَ آمِن إِنَّ وَعدَ اللَّهِ حَقٌّ فَيَقولُ ما هٰذا إِلّا أَساطيرُ الأَوَّلينَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-lladhī qāla li-wālidayhi ʾuffin lakumā ʾa-taʿidāninī ʾan ʾukhraja wa-qad khalati l-qurūnu min qablī wa-humā yastaghīthāni llāha waylaka ʾāmin ʾinna waʿda llāhi ḥaqqun fa-yaqūlu mā hādhā ʾillā ʾasāṭīru l-ʾawwalīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "As for him who says to his parents,\n" +
                    "‘Fie on you!\n" +
                    "Do you promise me\n" +
                    "that I shall be raised [from the dead]\n" +
                    "when generations have passed away before me?’\n" +
                    "And they invoke Allah’s help\n" +
                    "[and say]: ‘Woe to you!\n" +
                    "Believe! Indeed Allah’s promise is true.’\n" +
                    "But he says,\n" +
                    "‘These are nothing but myths of the ancients.’");
            ayat.add("18\n" +
                    "أُولٰئِكَ الَّذينَ حَقَّ عَلَيهِمُ القَولُ في أُمَمٍ قَد خَلَت مِن قَبلِهِم مِنَ الجِنِّ وَالإِنسِ ۖ إِنَّهُم كانوا خاسِرينَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾulāʾika lladhīna ḥaqqa ʿalayhimu l-qawlu fī ʾumamin qad khalat min qablihim mina l-jinni wa-l-ʾinsi ʾinnahum kānū khāsirīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Such are the ones against whom the word became due\n" +
                    "concerning the nations\n" +
                    "that have passed away before them\n" +
                    "of jinn and humans.\n" +
                    "They were indeed the losers.");
            ayat.add("19\n" +
                    "وَلِكُلٍّ دَرَجاتٌ مِمّا عَمِلوا ۖ وَلِيُوَفِّيَهُم أَعمالَهُم وَهُم لا يُظلَمونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-li-kullin darajātun mimmā ʿamilū wa-li-yuwaffiyahum ʾaʿmālahum wa-hum lā yuẓlamūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "For each [person] there will be degrees [of merit]\n" +
                    "pertaining to what he has done,\n" +
                    "that He may recompense them fully for their works,\n" +
                    "and they will not be wronged.");
            ayat.add("20\n" +
                    "وَيَومَ يُعرَضُ الَّذينَ كَفَروا عَلَى النّارِ أَذهَبتُم طَيِّباتِكُم في حَياتِكُمُ الدُّنيا وَاستَمتَعتُم بِها فَاليَومَ تُجزَونَ عَذابَ الهونِ بِما كُنتُم تَستَكبِرونَ فِي الأَرضِ بِغَيرِ الحَقِّ وَبِما كُنتُم تَفسُقونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-yawma yuʿraḍu lladhīna kafarū ʿalā n-nāri ʾadhhabtum ṭayyibātikum fī ḥayātikumu d-dunyā wa-stamtaʿtum bihā fa-l-yawma tujzawna ʿadhāba l-hūni bi-mā kuntum tastakbirūna fī l-ʾarḍi bi-ghayri l-ḥaqqi wa-bi-mā kuntum tafsuqūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The day when the faithless are exposed\n" +
                    "to the Fire, [they will be told,]\n" +
                    "‘You have exhausted your good things\n" +
                    "in the life of the world\n" +
                    "and enjoyed them.\n" +
                    "So today you will be requited\n" +
                    "with a humiliating punishment\n" +
                    "for your acting arrogantly in the earth\n" +
                    "unduly,\n" +
                    "and because you used to transgress.’");
            ayat.add("21\n" +
                    "۞ وَاذكُر أَخا عادٍ إِذ أَنذَرَ قَومَهُ بِالأَحقافِ وَقَد خَلَتِ النُّذُرُ مِن بَينِ يَدَيهِ وَمِن خَلفِهِ أَلّا تَعبُدوا إِلَّا اللَّهَ إِنّي أَخافُ عَلَيكُم عَذابَ يَومٍ عَظيمٍ\n" +
                    "TRANSLITERATION\n" +
                    "wa-dhkur ʾakhā ʿādin ʾidh ʾandhara qawmahū bi-l-ʾaḥqāfi wa-qad khalati n-nudhuru min bayni yadayhi wa-min khalfihī ʾallā taʿbudū ʾillā llāha ʾinnī ʾakhāfu ʿalaykum ʿadhāba yawmin ʿaẓīmin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And mention [Hūd] the brother of ʿĀd,\n" +
                    "when he warned his people at Aḥqāf\n" +
                    "—and warners have passed away\n" +
                    "before and after him—\n" +
                    "saying, ‘Do not worship anyone but Allah.\n" +
                    "Indeed I fear for you the punishment\n" +
                    "of a tremendous day.’");
            ayat.add("22\n" +
                    "قالوا أَجِئتَنا لِتَأفِكَنا عَن آلِهَتِنا فَأتِنا بِما تَعِدُنا إِن كُنتَ مِنَ الصّادِقينَ\n" +
                    "TRANSLITERATION\n" +
                    "qālū ʾa-jiʾtanā li-taʾfikanā ʿan ʾālihatinā fa-ʾtinā bi-mā taʿidunā ʾin kunta mina ṣ-ṣādiqīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They said,\n" +
                    "‘Have you come to turn us away from our gods?\n" +
                    "Then bring us what you threaten us with,\n" +
                    "should you be truthful.");
            ayat.add("23\n" +
                    "قالَ إِنَّمَا العِلمُ عِندَ اللَّهِ وَأُبَلِّغُكُم ما أُرسِلتُ بِهِ وَلٰكِنّي أَراكُم قَومًا تَجهَلونَ\n" +
                    "TRANSLITERATION\n" +
                    "qāla ʾinnamā l-ʿilmu ʿinda llāhi wa-ʾuballighukum mā ʾursiltu bihī wa-lākinnī ʾarākum qawman tajhalūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "He said,\n" +
                    "‘The knowledge is with Allah alone.\n" +
                    "I communicate to you what I have been sent with.\n" +
                    "But I see that you are a senseless lot.’");
            ayat.add("24\n" +
                    "فَلَمّا رَأَوهُ عارِضًا مُستَقبِلَ أَودِيَتِهِم قالوا هٰذا عارِضٌ مُمطِرُنا ۚ بَل هُوَ مَا استَعجَلتُم بِهِ ۖ ريحٌ فيها عَذابٌ أَليمٌ\n" +
                    "TRANSLITERATION\n" +
                    "fa-lammā raʾawhu ʿāriḍan mustaqbila ʾawdiyatihim qālū hādhā ʿāriḍun mumṭirunā bal huwa mā staʿjaltum bihī rīhun fīhā ʿadhābun ʾalīmun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "When they saw it as a cloud\n" +
                    "advancing toward their valleys,\n" +
                    "they said, ‘This cloud brings us rain.’\n" +
                    "‘Rather it is what you sought to hasten:\n" +
                    "a hurricane carrying a painful punishment,");
            ayat.add("25\n" +
                    "تُدَمِّرُ كُلَّ شَيءٍ بِأَمرِ رَبِّها فَأَصبَحوا لا يُرىٰ إِلّا مَساكِنُهُم ۚ كَذٰلِكَ نَجزِي القَومَ المُجرِمينَ\n" +
                    "TRANSLITERATION\n" +
                    "tudammiru kulla shayʾin bi-ʾamri rabbihā fa-ʾaṣbaḥū lā yurā ʾillā masākinuhum ka-dhālika najzī l-qawma l-mujrimīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "destroying everything by its Lord’s command.’\n" +
                    "So they became such that nothing could be seen\n" +
                    "except their dwellings.\n" +
                    "Thus do We requite the guilty lot.");
            ayat.add("26\n" +
                    "وَلَقَد مَكَّنّاهُم فيما إِن مَكَّنّاكُم فيهِ وَجَعَلنا لَهُم سَمعًا وَأَبصارًا وَأَفئِدَةً فَما أَغنىٰ عَنهُم سَمعُهُم وَلا أَبصارُهُم وَلا أَفئِدَتُهُم مِن شَيءٍ إِذ كانوا يَجحَدونَ بِآياتِ اللَّهِ وَحاقَ بِهِم ما كانوا بِهِ يَستَهزِئونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-la-qad makkannāhum fī-mā ʾin makkannākum fīhi wa-jaʿalnā lahum samʿan wa-ʾabṣāran wa-ʾafʾidatan fa-mā ʾaghnā ʿanhum samʿuhum wa-lā ʾabṣāruhum wa-lā ʾafʾidatuhum min shayʾin ʾidh kānū yajḥadūna bi-ʾāyāti llāhi wa-ḥāqa bihim mā kānū bihī yastahziʾūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Certainly We had granted them power\n" +
                    "in respects that We have not granted you,\n" +
                    "and We had vested them with hearing and sight\n" +
                    "and hearts.\n" +
                    "But neither their hearing availed them\n" +
                    "nor did their sight,\n" +
                    "nor their hearts, in any way\n" +
                    "when they used to impugn the signs of Allah.\n" +
                    "So they were besieged\n" +
                    "by what they used to deride.");
            ayat.add("27\n" +
                    "وَلَقَد أَهلَكنا ما حَولَكُم مِنَ القُرىٰ وَصَرَّفنَا الآياتِ لَعَلَّهُم يَرجِعونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-la-qad ʾahlaknā mā ḥawlakum mina l-qurā wa-ṣarrafnā l-ʾāyāti laʿallahum yarjiʿūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Certainly We destroyed towns that were around you,\n" +
                    "and We have paraphrased the signs\n" +
                    "so that they may come back.");
            ayat.add("28\n" +
                    "فَلَولا نَصَرَهُمُ الَّذينَ اتَّخَذوا مِن دونِ اللَّهِ قُربانًا آلِهَةً ۖ بَل ضَلّوا عَنهُم ۚ وَذٰلِكَ إِفكُهُم وَما كانوا يَفتَرونَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-law-lā naṣarahumu lladhīna ttakhadhū min dūni llāhi qurbānan ʾālihatan bal ḍallū ʿanhum wa-dhālika ʾifkuhum wa-mā kānū yaftarūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So why did not those [false gods] help\n" +
                    "them whom they had taken, besides Allah,\n" +
                    "as gods, as means of nearness [to Him]?\n" +
                    "Rather they forsook them;\n" +
                    "and that was their lie\n" +
                    "and what they used to fabricate.");
            ayat.add("29\n" +
                    "وَإِذ صَرَفنا إِلَيكَ نَفَرًا مِنَ الجِنِّ يَستَمِعونَ القُرآنَ فَلَمّا حَضَروهُ قالوا أَنصِتوا ۖ فَلَمّا قُضِيَ وَلَّوا إِلىٰ قَومِهِم مُنذِرينَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾidh ṣarafnā ʾilayka nafaran mina l-jinni yastamiʿūna l-qurʾāna fa-lammā ḥaḍarūhu qālū ʾanṣitū fa-lammā quḍiya wallaw ʾilā qawmihim mundhirīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "When We dispatched toward you a team of jinn\n" +
                    "listening to the Qurʾān,\n" +
                    "when they were in its presence,\n" +
                    "they said, ‘Be silent!’\n" +
                    "When it was finished, they went back to their people\n" +
                    "as warners.\n");
            ayat.add("30\n" +
                    "قالوا يا قَومَنا إِنّا سَمِعنا كِتابًا أُنزِلَ مِن بَعدِ موسىٰ مُصَدِّقًا لِما بَينَ يَدَيهِ يَهدي إِلَى الحَقِّ وَإِلىٰ طَريقٍ مُستَقيمٍ\n" +
                    "TRANSLITERATION\n" +
                    "qālū yā-qawmanā ʾinnā samiʿnā kitāban ʾunzila min baʿdi mūsā muṣaddiqan li-mā bayna yadayhi yahdī ʾilā l-ḥaqqi wa-ʾilā ṭarīqin mustaqīmin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They said, ‘O our people!\n" +
                    "Indeed we have heard a Book\n" +
                    "which has been sent down after Moses,\n" +
                    "confirming what was before it.\n" +
                    "It guides to the truth\n" +
                    "and to a straight path.");
            ayat.add("31\n" +
                    "يا قَومَنا أَجيبوا داعِيَ اللَّهِ وَآمِنوا بِهِ يَغفِر لَكُم مِن ذُنوبِكُم وَيُجِركُم مِن عَذابٍ أَليمٍ\n" +
                    "TRANSLITERATION\n" +
                    "yā-qawmanā ʾajībū dāʿiya llāhi wa-ʾāminū bihī yaghfir lakum min dhunūbikum wa-yujirkum min ʿadhābin ʾalīmin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "O our people!\n" +
                    "Respond to Allah’s summoner\n" +
                    "and have faith in Him.\n" +
                    "He will forgive you some of your sins\n" +
                    "and shelter you from a painful punishment.’");
            ayat.add("32\n" +
                    "وَمَن لا يُجِب داعِيَ اللَّهِ فَلَيسَ بِمُعجِزٍ فِي الأَرضِ وَلَيسَ لَهُ مِن دونِهِ أَولِياءُ ۚ أُولٰئِكَ في ضَلالٍ مُبينٍ\n" +
                    "TRANSLITERATION\n" +
                    "wa-man lā yujib dāʿiya llāhi fa-laysa bi-muʿjizin fī l-ʾarḍi wa-laysa lahū min dūnihī ʾawliyāʾu ʾulāʾika fī ḍalālin mubīnin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Those who do not respond to Allah’s summoner\n" +
                    "cannot thwart [Allah] on the earth,\n" +
                    "and they will not find any protectors besides Him.\n" +
                    "They are in manifest error.");
            ayat.add("33\n" +
                    "أَوَلَم يَرَوا أَنَّ اللَّهَ الَّذي خَلَقَ السَّماواتِ وَالأَرضَ وَلَم يَعيَ بِخَلقِهِنَّ بِقادِرٍ عَلىٰ أَن يُحيِيَ المَوتىٰ ۚ بَلىٰ إِنَّهُ عَلىٰ كُلِّ شَيءٍ قَديرٌ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-wa-lam yaraw ʾanna llāha lladhī khalaqa s-samāwāti wa-l-ʾarḍa wa-lam yaʿya bi-khalqihinna bi-qādirin ʿalā ʾan yuḥyiya l-mawtā balā ʾinnahū ʿalā kulli shayʾin qadīrun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Do they not see that Allah,\n" +
                    "who created the heavens and the earth\n" +
                    "and [who] was not exhausted by their creation,\n" +
                    "is able to revive the dead?\n" +
                    "Yes, indeed He has power over all things.");
            ayat.add("34\n" +
                    "وَيَومَ يُعرَضُ الَّذينَ كَفَروا عَلَى النّارِ أَلَيسَ هٰذا بِالحَقِّ ۖ قالوا بَلىٰ وَرَبِّنا ۚ قالَ فَذوقُوا العَذابَ بِما كُنتُم تَكفُرونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-yawma yuʿraḍu lladhīna kafarū ʿalā n-nāri ʾa-laysa hādhā bi-l-ḥaqqi qālū balā wa-rabbinā qāla fa-dhūqū l-ʿadhāba bi-mā kuntum takfurūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The day when the faithless are exposed\n" +
                    "to the Fire,\n" +
                    "[He will say,] ‘Is this not a fact?’\n" +
                    "They will say, ‘Yes, by our Lord!’\n" +
                    "He will say, ‘So taste the punishment\n" +
                    "because of what you used to disbelieve.’");
            ayat.add("35\n" +
                    "فَاصبِر كَما صَبَرَ أُولُو العَزمِ مِنَ الرُّسُلِ وَلا تَستَعجِل لَهُم ۚ كَأَنَّهُم يَومَ يَرَونَ ما يوعَدونَ لَم يَلبَثوا إِلّا ساعَةً مِن نَهارٍ ۚ بَلاغٌ ۚ فَهَل يُهلَكُ إِلَّا القَومُ الفاسِقونَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ṣbir ka-mā ṣabara ʾulū l-ʿazmi mina r-rusuli wa-lā tastaʿjil lahum ka-ʾannahum yawma yarawna mā yūʿadūna lam yalbathū ʾillā sāʿatan min nahārin balāghun fa-hal yuhlaku ʾillā l-qawmu l-fāsiqūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So be patient\n" +
                    "just as the resolute among the apostles were patient,\n" +
                    "and do not seek to hasten [the punishment]\n" +
                    "for them.\n" +
                    "The day when they see\n" +
                    "what they are promised, [it will be]\n" +
                    "as though they had remained only an hour of a day.\n" +
                    "This is a proclamation.\n" +
                    "So shall anyone be destroyed\n" +
                    "except the transgressing lot?");
        }
        else if (surahName.equals("47. Muhammad"))
        {
            setTitle("Muhammad(محمد) : Muhammad");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "الَّذينَ كَفَروا وَصَدّوا عَن سَبيلِ اللَّهِ أَضَلَّ أَعمالَهُم\n" +
                    "TRANSLITERATION\n" +
                    "alladhīna kafarū wa-ṣaddū ʿan sabīli llāhi ʾaḍalla ʾaʿmālahum\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Those who are [themselves] faithless\n" +
                    "and bar [others] from the way of Allah\n" +
                    "—He has made their works go awry.");
            ayat.add("2\n" +
                    "وَالَّذينَ آمَنوا وَعَمِلُوا الصّالِحاتِ وَآمَنوا بِما نُزِّلَ عَلىٰ مُحَمَّدٍ وَهُوَ الحَقُّ مِن رَبِّهِم ۙ كَفَّرَ عَنهُم سَيِّئَاتِهِم وَأَصلَحَ بالَهُم\n" +
                    "TRANSLITERATION\n" +
                    "wa-lladhīna ʾāmanū wa-ʿamilū ṣ-ṣāliḥāti wa-ʾāmanū bi-mā nuzzila ʿalā muḥammadin wa-huwa l-ḥaqqu min rabbihim kaffara ʿanhum sayyiʾātihim wa-ʾaṣlaḥa bālahum\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "But those who have faith and do righteous deeds\n" +
                    "and believe in what has been sent down\n" +
                    "to Muḥammad\n" +
                    "and it is the truth from their Lord\n" +
                    "He shall absolve them of their misdeeds\n" +
                    "and set right their affairs.");
            ayat.add("3\n" +
                    "ذٰلِكَ بِأَنَّ الَّذينَ كَفَرُوا اتَّبَعُوا الباطِلَ وَأَنَّ الَّذينَ آمَنُوا اتَّبَعُوا الحَقَّ مِن رَبِّهِم ۚ كَذٰلِكَ يَضرِبُ اللَّهُ لِلنّاسِ أَمثالَهُم\n" +
                    "TRANSLITERATION\n" +
                    "dhālika bi-ʾanna lladhīna kafarū ttabaʿū l-bāṭila wa-ʾanna lladhīna ʾāmanū ttabaʿū l-ḥaqqa min rabbihim ka-dhālika yaḍribu llāhu li-n-nāsi ʾamthālahum\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "That is because the faithless\n" +
                    "follow falsehood,\n" +
                    "and because the faithful follow the truth\n" +
                    "from their Lord.\n" +
                    "That is how Allah draws comparisons for mankind.");
            ayat.add("4\n" +
                    "فَإِذا لَقيتُمُ الَّذينَ كَفَروا فَضَربَ الرِّقابِ حَتّىٰ إِذا أَثخَنتُموهُم فَشُدُّوا الوَثاقَ فَإِمّا مَنًّا بَعدُ وَإِمّا فِداءً حَتّىٰ تَضَعَ الحَربُ أَوزارَها ۚ ذٰلِكَ وَلَو يَشاءُ اللَّهُ لَانتَصَرَ مِنهُم وَلٰكِن لِيَبلُوَ بَعضَكُم بِبَعضٍ ۗ وَالَّذينَ قُتِلوا في سَبيلِ اللَّهِ فَلَن يُضِلَّ أَعمالَهُم\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾidhā laqītumu lladhīna kafarū fa-ḍarba r-riqābi ḥattā ʾidhā ʾathkhantumūhum fa-shuddū l-wathāqa fa-ʾimmā mannan baʿdu wa-ʾimmā fidāʾan ḥattā taḍaʿa l-ḥarbu ʾawzārahā dhālika wa-law yashāʾu llāhu la-ntaṣara minhum wa-lākin li-yabluwa baʿḍakum bi-baʿḍin wa-lladhīna qutilū fī sabīli llāhi fa-lan yuḍilla ʾaʿmālahum\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "When you meet the faithless in battle,\n" +
                    "strike their necks.\n" +
                    "When you have thoroughly decimated them,\n" +
                    "bind the captives firmly.\n" +
                    "Thereafter either oblige them [by setting them free]\n" +
                    "or take ransom\n" +
                    "till the war lays down its burdens.\n" +
                    "That [is Allah’s ordinance],\n" +
                    "and had Allah wished\n" +
                    "He could have taken vengeance on them,1\n" +
                    "but that He may test some of you by means of others.\n" +
                    "As for those who were slain in the way of Allah,\n" +
                    "He will not let their works go awry.");
            ayat.add("5\n" +
                    "سَيَهديهِم وَيُصلِحُ بالَهُم\n" +
                    "TRANSLITERATION\n" +
                    "sa-yahdīhim wa-yuṣliḥu bālahum\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "He will guide them and set right their affairs,");
            ayat.add("6\n" +
                    "وَيُدخِلُهُمُ الجَنَّةَ عَرَّفَها لَهُم\n" +
                    "TRANSLITERATION\n" +
                    "wa-yudkhiluhumu l-jannata ʿarrafahā lahum\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and admit them into paradise\n" +
                    "with which He has acquainted them.");
            ayat.add("7\n" +
                    "يا أَيُّهَا الَّذينَ آمَنوا إِن تَنصُرُوا اللَّهَ يَنصُركُم وَيُثَبِّت أَقدامَكُم\n" +
                    "TRANSLITERATION\n" +
                    "yā-ʾayyuhā lladhīna ʾāmanū ʾin tanṣurū llāha yanṣurkum wa-yuthabbit ʾaqdāmakum\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "O you who have faith!\n" +
                    "If you help Allah, He will help you\n" +
                    "and make your feet steady.");
            ayat.add("8\n" +
                    "وَالَّذينَ كَفَروا فَتَعسًا لَهُم وَأَضَلَّ أَعمالَهُم\n" +
                    "TRANSLITERATION\n" +
                    "wa-lladhīna kafarū fa-taʿsan lahum wa-ʾaḍalla ʾaʿmālahum\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "As for the faithless,\n" +
                    "their lot will be to fall [into ruin],\n" +
                    "and He will make their works go awry.");
            ayat.add("9\n" +
                    "ذٰلِكَ بِأَنَّهُم كَرِهوا ما أَنزَلَ اللَّهُ فَأَحبَطَ أَعمالَهُم\n" +
                    "TRANSLITERATION\n" +
                    "dhālika bi-ʾannahum karihū mā ʾanzala llāhu fa-ʾaḥbaṭa ʾaʿmālahum\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "That is because they loathed\n" +
                    "what Allah has sent down,\n" +
                    "so He made their works fail.");
            ayat.add("10\n" +
                    "۞ أَفَلَم يَسيروا فِي الأَرضِ فَيَنظُروا كَيفَ كانَ عاقِبَةُ الَّذينَ مِن قَبلِهِم ۚ دَمَّرَ اللَّهُ عَلَيهِم ۖ وَلِلكافِرينَ أَمثالُها\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-fa-lam yasīrū fī l-ʾarḍi fa-yanẓurū kayfa kāna ʿāqibatu lladhīna min qablihim dammara llāhu ʿalayhim wa-li-l-kāfirīna ʾamthāluhā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Have they not travelled over the land\n" +
                    "so that they may observe\n" +
                    "how was the fate of those who were before them?\n" +
                    "Allah destroyed them,\n" +
                    "and a similar [fate] awaits the faithless.");
            ayat.add("11\n" +
                    "ذٰلِكَ بِأَنَّ اللَّهَ مَولَى الَّذينَ آمَنوا وَأَنَّ الكافِرينَ لا مَولىٰ لَهُم\n" +
                    "TRANSLITERATION\n" +
                    "dhālika bi-ʾanna llāha mawlā lladhīna ʾāmanū wa-ʾanna l-kāfirīna lā mawlā lahum\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "That is because Allah is the protector of the faithful,\n" +
                    "and because the faithless have no protector.");
            ayat.add("12\n" +
                    "إِنَّ اللَّهَ يُدخِلُ الَّذينَ آمَنوا وَعَمِلُوا الصّالِحاتِ جَنّاتٍ تَجري مِن تَحتِهَا الأَنهارُ ۖ وَالَّذينَ كَفَروا يَتَمَتَّعونَ وَيَأكُلونَ كَما تَأكُلُ الأَنعامُ وَالنّارُ مَثوًى لَهُم\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna llāha yudkhilu lladhīna ʾāmanū wa-ʿamilū ṣ-ṣāliḥāti jannātin tajrī min taḥtihā l-ʾanhāru wa-lladhīna kafarū yatamattaʿūna wa-yaʾkulūna ka-mā taʾkulu l-ʾanʿāmu wa-n-nāru mathwan lahum\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed Allah will admit those who have faith\n" +
                    "and do righteous deeds\n" +
                    "into gardens with streams running in them.\n" +
                    "As for the faithless, they enjoy and eat\n" +
                    "just like the cattle eat,\n" +
                    "and the Fire will be their [final] abode.");
            ayat.add("13\n" +
                    "وَكَأَيِّن مِن قَريَةٍ هِيَ أَشَدُّ قُوَّةً مِن قَريَتِكَ الَّتي أَخرَجَتكَ أَهلَكناهُم فَلا ناصِرَ لَهُم\n" +
                    "TRANSLITERATION\n" +
                    "wa-ka-ʾayyin min qaryatin hiya ʾashaddu quwwatan min qaryatika llatī ʾakhrajatka ʾahlaknāhum fa-lā nāṣira lahum\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "How many a town there has been\n" +
                    "which was more powerful than your town\n" +
                    "which expelled you,\n" +
                    "which We have destroyed,\n" +
                    "and they had no helper.\n");
            ayat.add("14\n" +
                    "أَفَمَن كانَ عَلىٰ بَيِّنَةٍ مِن رَبِّهِ كَمَن زُيِّنَ لَهُ سوءُ عَمَلِهِ وَاتَّبَعوا أَهواءَهُم\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-fa-man kāna ʿalā bayyinatin min rabbihī ka-man zuyyina lahū sūʾu ʿamalihī wa-ttabaʿū ʾahwāʾahum\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Is he who stands on a manifest proof from his Lord\n" +
                    "like someone\n" +
                    "to whom the evil of his conduct is made to seem decorous,\n" +
                    "and who follow their desires?");
            ayat.add("15\n" +
                    "مَثَلُ الجَنَّةِ الَّتي وُعِدَ المُتَّقونَ ۖ فيها أَنهارٌ مِن ماءٍ غَيرِ آسِنٍ وَأَنهارٌ مِن لَبَنٍ لَم يَتَغَيَّر طَعمُهُ وَأَنهارٌ مِن خَمرٍ لَذَّةٍ لِلشّارِبينَ وَأَنهارٌ مِن عَسَلٍ مُصَفًّى ۖ وَلَهُم فيها مِن كُلِّ الثَّمَراتِ وَمَغفِرَةٌ مِن رَبِّهِم ۖ كَمَن هُوَ خالِدٌ فِي النّارِ وَسُقوا ماءً حَميمًا فَقَطَّعَ أَمعاءَهُم\n" +
                    "TRANSLITERATION\n" +
                    "mathalu l-jannati llatī wuʿida l-muttaqūna fīhā ʾanhārun min māʾin ghayri ʾāsinin wa-ʾanhārun min labanin lam yataghayyar ṭaʿmuhū wa-ʾanhārun min khamrin ladhdhatin li-sh-shāribīna wa-ʾanhārun min ʿasalin muṣaffan wa-lahum fīhā min kulli th-thamarāti wa-maghfiratun min rabbihim ka-man huwa khālidun fī n-nāri wa-suqū māʾan ḥamīman fa-qaṭṭaʿa ʾamʿāʾahum\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "A description of the paradise\n" +
                    "promised to the Godwary:\n" +
                    "therein are streams of unstaling water,\n" +
                    "and streams of milk unchanging in flavour,\n" +
                    "and streams of wine delicious to the drinkers,\n" +
                    "and streams of purified honey;\n" +
                    "there will be for them every kind of fruit in it,\n" +
                    "and forgiveness from their Lord.\n" +
                    "[Are such ones] like those who abide in the Fire\n" +
                    "and are given to drink boiling water\n" +
                    "which cuts up their bowels?");
            ayat.add("16\n" +
                    "وَمِنهُم مَن يَستَمِعُ إِلَيكَ حَتّىٰ إِذا خَرَجوا مِن عِندِكَ قالوا لِلَّذينَ أوتُوا العِلمَ ماذا قالَ آنِفًا ۚ أُولٰئِكَ الَّذينَ طَبَعَ اللَّهُ عَلىٰ قُلوبِهِم وَاتَّبَعوا أَهواءَهُم\n" +
                    "TRANSLITERATION\n" +
                    "wa-minhum man yastamiʿu ʾilayka ḥattā ʾidhā kharajū min ʿindika qālū li-lladhīna ʾūtū l-ʿilma mādhā qāla ʾānifan ʾulāʾika lladhīna ṭabaʿa llāhu ʿalā qulūbihim wa-ttabaʿū ʾahwāʾahum\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "There are some among them\n" +
                    "who prick up their ears at you.\n" +
                    "But when they go out from your presence,\n" +
                    "they say to those who have been given knowledge,\n" +
                    "‘What did he say just now?’\n" +
                    "They are the ones\n" +
                    "on whose hearts Allah has set a seal,\n" +
                    "and they follow their own desires.");
            ayat.add("17\n" +
                    "وَالَّذينَ اهتَدَوا زادَهُم هُدًى وَآتاهُم تَقواهُم\n" +
                    "TRANSLITERATION\n" +
                    "wa-lladhīna htadaw zādahum hudan wa-ʾātāhum taqwāhum\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "As for those who are [rightly] guided,\n" +
                    "He enhances their guidance,\n" +
                    "and invests them with their Godwariness.");
            ayat.add("18\n" +
                    "فَهَل يَنظُرونَ إِلَّا السّاعَةَ أَن تَأتِيَهُم بَغتَةً ۖ فَقَد جاءَ أَشراطُها ۚ فَأَنّىٰ لَهُم إِذا جاءَتهُم ذِكراهُم\n" +
                    "TRANSLITERATION\n" +
                    "fa-hal yanẓurūna ʾillā s-sāʿata ʾan taʾtiyahum baghtatan fa-qad jāʾa ʾashrāṭuhā fa-ʾannā lahum ʾidhā jāʾathum dhikrāhum\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Do they await anything except that the Hour\n" +
                    "should overtake them suddenly?\n" +
                    "Certainly its portents have come.\n" +
                    "Of what avail to them\n" +
                    "will their admonition be when it overtakes them?");
            ayat.add("19\n" +
                    "فَاعلَم أَنَّهُ لا إِلٰهَ إِلَّا اللَّهُ وَاستَغفِر لِذَنبِكَ وَلِلمُؤمِنينَ وَالمُؤمِناتِ ۗ وَاللَّهُ يَعلَمُ مُتَقَلَّبَكُم وَمَثواكُم\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʿlam ʾannahū lā ʾilāha ʾillā llāhu wa-staghfir li-dhanbika wa-li-l-muʾminīna wa-l-muʾmināti wa-llāhu yaʿlamu mutaqallabakum wa-mathwākum\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Know that there is no god except Allah,\n" +
                    "and plead [to Allah] for forgiveness of your sin\n" +
                    "and for the faithful, men and women.\n" +
                    "Allah knows your itinerary\n" +
                    "and your [final] abode.\n");
            ayat.add("20\n" +
                    "وَيَقولُ الَّذينَ آمَنوا لَولا نُزِّلَت سورَةٌ ۖ فَإِذا أُنزِلَت سورَةٌ مُحكَمَةٌ وَذُكِرَ فيهَا القِتالُ ۙ رَأَيتَ الَّذينَ في قُلوبِهِم مَرَضٌ يَنظُرونَ إِلَيكَ نَظَرَ المَغشِيِّ عَلَيهِ مِنَ المَوتِ ۖ فَأَولىٰ لَهُم\n" +
                    "TRANSLITERATION\n" +
                    "wa-yaqūlu lladhīna ʾāmanū law-lā nuzzilat sūratun fa-ʾidhā ʾunzilat sūratun muḥkamatun wa-dhukira fīhā l-qitālu raʾayta lladhīna fī qulūbihim maraḍun yanẓurūna ʾilayka naẓara l-maghshiyyi ʿalayhi mina l-mawti fa-ʾawlā lahum\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The faithful say,\n" +
                    "‘If only a sūrah were sent down!’\n" +
                    "But when a definitive sūrah is sent down\n" +
                    "and war is mentioned in it,\n" +
                    "you see those in whose hearts is a sickness1\n" +
                    "looking upon you\n" +
                    "with the look of someone fainting at death.\n" +
                    "So woe to them!");
            ayat.add("21\n" +
                    "طاعَةٌ وَقَولٌ مَعروفٌ ۚ فَإِذا عَزَمَ الأَمرُ فَلَو صَدَقُوا اللَّهَ لَكانَ خَيرًا لَهُم\n" +
                    "TRANSLITERATION\n" +
                    "ṭāʿatun wa-qawlun maʿrūfun fa-ʾidhā ʿazama l-ʾamru fa-law ṣadaqū llāha la-kāna khayran lahum\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Obedience and upright speech….\n" +
                    "So when the matter has been resolved upon,\n" +
                    "if they remain true to Allah\n" +
                    "that will surely be better for them.");
            ayat.add("22\n" +
                    "فَهَل عَسَيتُم إِن تَوَلَّيتُم أَن تُفسِدوا فِي الأَرضِ وَتُقَطِّعوا أَرحامَكُم\n" +
                    "TRANSLITERATION\n" +
                    "fa-hal ʿasaytum ʾin tawallaytum ʾan tufsidū fī l-ʾarḍi wa-tuqaṭṭiʿū ʾarḥāmakum\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "May it not be that if you were to wield authority\n" +
                    "you would cause corruption in the land\n" +
                    "and ill-treat your blood relations?");
            ayat.add("23\n" +
                    "أُولٰئِكَ الَّذينَ لَعَنَهُمُ اللَّهُ فَأَصَمَّهُم وَأَعمىٰ أَبصارَهُم\n" +
                    "TRANSLITERATION\n" +
                    "ʾulāʾika lladhīna laʿanahumu llāhu fa-ʾaṣammahum wa-ʾaʿmā ʾabṣārahum\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They are the ones whom Allah has cursed,\n" +
                    "so He made them deaf, and blinded their sight.");
            ayat.add("24\n" +
                    "أَفَلا يَتَدَبَّرونَ القُرآنَ أَم عَلىٰ قُلوبٍ أَقفالُها\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-fa-lā yatadabbarūna l-qurʾāna ʾam ʿalā qulūbin ʾaqfāluhā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Do they not contemplate the Qurʾān,\n" +
                    "or are there locks on the hearts?");
            ayat.add("25\n" +
                    "إِنَّ الَّذينَ ارتَدّوا عَلىٰ أَدبارِهِم مِن بَعدِ ما تَبَيَّنَ لَهُمُ الهُدَى ۙ الشَّيطانُ سَوَّلَ لَهُم وَأَملىٰ لَهُم\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna lladhīna rtaddū ʿalā ʾadbārihim min baʿdi mā tabayyana lahumu l-hudā sh-shayṭānu sawwala lahum wa-ʾamlā lahum\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed those who turned their backs\n" +
                    "after the guidance had become clear to them,\n" +
                    "it was Satan who had seduced them,\n" +
                    "and he had given them [far-flung] hopes.");
            ayat.add("26\n" +
                    "ذٰلِكَ بِأَنَّهُم قالوا لِلَّذينَ كَرِهوا ما نَزَّلَ اللَّهُ سَنُطيعُكُم في بَعضِ الأَمرِ ۖ وَاللَّهُ يَعلَمُ إِسرارَهُم\n" +
                    "TRANSLITERATION\n" +
                    "dhālika bi-ʾannahum qālū li-lladhīna karihū mā nazzala llāhu sa-nuṭīʿukum fī baʿḍi l-ʾamri wa-llāhu yaʿlamu ʾisrārahum\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "That is because they said\n" +
                    "to those who loathed what Allah had sent down:\n" +
                    "‘We shall obey you in some matters,’\n" +
                    "and Allah knows their secret dealings.");
            ayat.add("27\n" +
                    "فَكَيفَ إِذا تَوَفَّتهُمُ المَلائِكَةُ يَضرِبونَ وُجوهَهُم وَأَدبارَهُم\n" +
                    "TRANSLITERATION\n" +
                    "fa-kayfa ʾidhā tawaffathumu l-malāʾikatu yaḍribūna wujūhahum wa-ʾadbārahum\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "But how will it be [with them]\n" +
                    "when the angels take them away,\n" +
                    "striking their faces and their backs?!");
            ayat.add("28\n" +
                    "ذٰلِكَ بِأَنَّهُمُ اتَّبَعوا ما أَسخَطَ اللَّهَ وَكَرِهوا رِضوانَهُ فَأَحبَطَ أَعمالَهُم\n" +
                    "TRANSLITERATION\n" +
                    "dhālika bi-ʾannahumu ttabaʿū mā ʾaskhaṭa llāha wa-karihū riḍwānahū fa-ʾaḥbaṭa ʾaʿmālahum\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "That, because they pursued what displeased Allah,\n" +
                    "and loathed His pleasure.\n" +
                    "So He has made their works fail.");
            ayat.add("29\n" +
                    "أَم حَسِبَ الَّذينَ في قُلوبِهِم مَرَضٌ أَن لَن يُخرِجَ اللَّهُ أَضغانَهُم\n" +
                    "TRANSLITERATION\n" +
                    "ʾam ḥasiba lladhīna fī qulūbihim maraḍun ʾan lan yukhrija llāhu ʾaḍghānahum\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Do those in whose hearts is a sickness suppose\n" +
                    "that Allah will not expose their spite?");
            ayat.add("30\n" +
                    "وَلَو نَشاءُ لَأَرَيناكَهُم فَلَعَرَفتَهُم بِسيماهُم ۚ وَلَتَعرِفَنَّهُم في لَحنِ القَولِ ۚ وَاللَّهُ يَعلَمُ أَعمالَكُم\n" +
                    "TRANSLITERATION\n" +
                    "wa-law nashāʾu la-ʾaraynākahum fa-la-ʿaraftahum bi-sīmāhum wa-la-taʿrifannahum fī laḥni l-qawli wa-llāhu yaʿlamu ʾaʿmālakum\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "If We wish, We will show them1 to you\n" +
                    "so that you recognize them by their mark.\n" +
                    "Yet you will recognize them by their tone of speech,\n" +
                    "and Allah knows your deeds.");
            ayat.add("31\n" +
                    "وَلَنَبلُوَنَّكُم حَتّىٰ نَعلَمَ المُجاهِدينَ مِنكُم وَالصّابِرينَ وَنَبلُوَ أَخبارَكُم\n" +
                    "TRANSLITERATION\n" +
                    "wa-la-nabluwannakum ḥattā naʿlama l-mujāhidīna minkum wa-ṣ-ṣābirīna wa-nabluwa ʾakhbārakum\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "We will surely test you\n" +
                    "until We ascertain those of you who wage jihād\n" +
                    "and those who are steadfast,\n" +
                    "and We shall appraise your record.");
            ayat.add("32\n" +
                    "إِنَّ الَّذينَ كَفَروا وَصَدّوا عَن سَبيلِ اللَّهِ وَشاقُّوا الرَّسولَ مِن بَعدِ ما تَبَيَّنَ لَهُمُ الهُدىٰ لَن يَضُرُّوا اللَّهَ شَيئًا وَسَيُحبِطُ أَعمالَهُم\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna lladhīna kafarū wa-ṣaddū ʿan sabīli llāhi wa-shāqqū r-rasūla min baʿdi mā tabayyana lahumu l-hudā lan yaḍurrū llāha shayʾan wa-sa-yuḥbiṭu ʾaʿmālahum\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed those who are faithless\n" +
                    "and bar from the way of Allah\n" +
                    "and defy the Apostle\n" +
                    "after guidance has become clear to them,\n" +
                    "will not hurt Allah in the least,\n" +
                    "and He shall make their works fail.");
            ayat.add("33\n" +
                    "۞ يا أَيُّهَا الَّذينَ آمَنوا أَطيعُوا اللَّهَ وَأَطيعُوا الرَّسولَ وَلا تُبطِلوا أَعمالَكُم\n" +
                    "TRANSLITERATION\n" +
                    "yā-ʾayyuhā lladhīna ʾāmanū ʾaṭīʿū llāha wa-ʾaṭīʿū r-rasūla wa-lā tubṭilū ʾaʿmālakum\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "O you who have faith!\n" +
                    "Obey Allah and obey the Apostle,\n" +
                    "and do not render your works void.");
            ayat.add("34\n" +
                    "إِنَّ الَّذينَ كَفَروا وَصَدّوا عَن سَبيلِ اللَّهِ ثُمَّ ماتوا وَهُم كُفّارٌ فَلَن يَغفِرَ اللَّهُ لَهُم\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna lladhīna kafarū wa-ṣaddū ʿan sabīli llāhi thumma mātū wa-hum kuffārun fa-lan yaghfira llāhu lahum\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed those who are faithless\n" +
                    "and bar from the way of Allah\n" +
                    "and then die faithless,\n" +
                    "Allah will never forgive them.");
            ayat.add("35\n" +
                    "فَلا تَهِنوا وَتَدعوا إِلَى السَّلمِ وَأَنتُمُ الأَعلَونَ وَاللَّهُ مَعَكُم وَلَن يَتِرَكُم أَعمالَكُم\n" +
                    "TRANSLITERATION\n" +
                    "fa-lā tahinū wa-tadʿū ʾilā s-salmi wa-ʾantumu l-ʾaʿlawna wa-llāhu maʿakum wa-lan yatirakum ʾaʿmālakum\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So do not slacken and [do not] call for peace\n" +
                    "when you have the upper hand\n" +
                    "and Allah is with you,\n" +
                    "and He will not stint [the reward of] your works.");
            ayat.add("36\n" +
                    "إِنَّمَا الحَياةُ الدُّنيا لَعِبٌ وَلَهوٌ ۚ وَإِن تُؤمِنوا وَتَتَّقوا يُؤتِكُم أُجورَكُم وَلا يَسأَلكُم أَموالَكُم\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnamā l-ḥayātu d-dunyā laʿibun wa-lahwun wa-ʾin tuʾminū wa-tattaqū yuʾtikum ʾujūrakum wa-lā yasʾalkum ʾamwālakum\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The life of the world is just play and diversion,\n" +
                    "but if you are faithful and Godwary,\n" +
                    "He will give you your rewards,\n" +
                    "and will not ask your wealth [in return] from you.");
            ayat.add("37\n" +
                    "إِن يَسأَلكُموها فَيُحفِكُم تَبخَلوا وَيُخرِج أَضغانَكُم\n" +
                    "TRANSLITERATION\n" +
                    "ʾin yasʾalkumūhā fa-yuḥfikum tabkhalū wa-yukhrij ʾaḍghānakum\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Should He ask it from you, and press you,\n" +
                    "you will be stingy, and He will expose your spite.");
            ayat.add("38\n" +
                    "ها أَنتُم هٰؤُلاءِ تُدعَونَ لِتُنفِقوا في سَبيلِ اللَّهِ فَمِنكُم مَن يَبخَلُ ۖ وَمَن يَبخَل فَإِنَّما يَبخَلُ عَن نَفسِهِ ۚ وَاللَّهُ الغَنِيُّ وَأَنتُمُ الفُقَراءُ ۚ وَإِن تَتَوَلَّوا يَستَبدِل قَومًا غَيرَكُم ثُمَّ لا يَكونوا أَمثالَكُم\n" +
                    "TRANSLITERATION\n" +
                    "hā-ʾantum hāʾulāʾi tudʿawna li-tunfiqū fī sabīli llāhi fa-minkum man yabkhalu wa-man yabkhal fa-ʾinnamā yabkhalu ʿan nafsihī wa-llāhu l-ghaniyyu wa-ʾantumu l-fuqarāʾu wa-ʾin tatawallaw yastabdil qawman ghayrakum thumma lā yakūnū ʾamthālakum\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Ah! There you are,\n" +
                    "being invited to spend in the way of Allah;\n" +
                    "yet among you there are those who are stingy;\n" +
                    "and whoever is stingy is stingy only to himself.\n" +
                    "Allah is the All-sufficient, and you are all-needy,\n" +
                    "and if you turn away\n" +
                    "He will replace you with another people,\n" +
                    "and they will not be like you.");
        }
        else if (surahName.equals("48. Al-Fath"))
        {
            setTitle("Al-Fath(الفتح) : Victory");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "إِنّا فَتَحنا لَكَ فَتحًا مُبينًا\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnā fataḥnā laka fatḥan mubīnan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed We have inaugurated for you a clear victory,");
            ayat.add("2\n" +
                    "لِيَغفِرَ لَكَ اللَّهُ ما تَقَدَّمَ مِن ذَنبِكَ وَما تَأَخَّرَ وَيُتِمَّ نِعمَتَهُ عَلَيكَ وَيَهدِيَكَ صِراطًا مُستَقيمًا\n" +
                    "TRANSLITERATION\n" +
                    "li-yaghfira laka llāhu mā taqaddama min dhanbika wa-mā taʾakhkhara wa-yutimma niʿmatahū ʿalayka wa-yahdiyaka ṣirāṭan mustaqīman\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "that Allah may forgive you\n" +
                    "what is past of your sin and what is to come,\n" +
                    "and that He may perfect His blessing upon you\n" +
                    "and guide you on a straight path,");
            ayat.add("3\n" +
                    "وَيَنصُرَكَ اللَّهُ نَصرًا عَزيزًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-yanṣuraka llāhu naṣran ʿazīzan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and Allah will help you with a mighty help");
            ayat.add("4\n" +
                    "هُوَ الَّذي أَنزَلَ السَّكينَةَ في قُلوبِ المُؤمِنينَ لِيَزدادوا إيمانًا مَعَ إيمانِهِم ۗ وَلِلَّهِ جُنودُ السَّماواتِ وَالأَرضِ ۚ وَكانَ اللَّهُ عَليمًا حَكيمًا\n" +
                    "TRANSLITERATION\n" +
                    "huwa lladhī ʾanzala s-sakīnata fī qulūbi l-muʾminīna li-yazdādū ʾīmānan maʿa ʾīmānihim wa-li-llāhi junūdu s-samāwāti wa-l-ʾarḍi wa-kāna llāhu ʿalīman ḥakīman\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "It is He who sent down composure\n" +
                    "into the hearts of the faithful\n" +
                    "that they might enhance their faith.\n" +
                    "To Allah belong the hosts of the heavens and the earth,\n" +
                    "and Allah is all-knowing, all-wise.");
            ayat.add("5\n" +
                    "لِيُدخِلَ المُؤمِنينَ وَالمُؤمِناتِ جَنّاتٍ تَجري مِن تَحتِهَا الأَنهارُ خالِدينَ فيها وَيُكَفِّرَ عَنهُم سَيِّئَاتِهِم ۚ وَكانَ ذٰلِكَ عِندَ اللَّهِ فَوزًا عَظيمًا\n" +
                    "TRANSLITERATION\n" +
                    "li-yudkhila l-muʾminīna wa-l-muʾmināti jannātin tajrī min taḥtihā l-ʾanhāru khālidīna fīhā wa-yukaffira ʿanhum sayyiʾātihim wa-kāna dhālika ʿinda llāhi fawzan ʿaẓīman\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "That He may admit the faithful, men and women,\n" +
                    "into gardens with streams running in them,\n" +
                    "to remain in them [forever],\n" +
                    "and that He may absolve them of their misdeeds.\n" +
                    "That is a great success with Allah.");
            ayat.add("6\n" +
                    "وَيُعَذِّبَ المُنافِقينَ وَالمُنافِقاتِ وَالمُشرِكينَ وَالمُشرِكاتِ الظّانّينَ بِاللَّهِ ظَنَّ السَّوءِ ۚ عَلَيهِم دائِرَةُ السَّوءِ ۖ وَغَضِبَ اللَّهُ عَلَيهِم وَلَعَنَهُم وَأَعَدَّ لَهُم جَهَنَّمَ ۖ وَساءَت مَصيرًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-yuʿadhdhiba l-munāfiqīna wa-l-munāfiqāti wa-l-mushrikīna wa-l-mushrikāti ẓ-ẓānnīna bi-llāhi ẓanna s-sawʾi ʿalayhim dāʾiratu s-sawʾi wa-ghaḍiba llāhu ʿalayhim wa-laʿanahum wa-ʾaʿadda lahum jahannama wa-sāʾat maṣīran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "That He may punish the hypocrites, men and women,\n" +
                    "and the polytheists, men and women,\n" +
                    "who entertain a bad opinion of Allah.\n" +
                    "For them shall be an adverse turn of fortune:\n" +
                    "Allah is wrathful with them\n" +
                    "and He has cursed them,\n" +
                    "and prepared for them hell,\n" +
                    "and it is an evil destination.");
            ayat.add("7\n" +
                    "وَلِلَّهِ جُنودُ السَّماواتِ وَالأَرضِ ۚ وَكانَ اللَّهُ عَزيزًا حَكيمًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-li-llāhi junūdu s-samāwāti wa-l-ʾarḍi wa-kāna llāhu ʿazīzan ḥakīman\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "To Allah belong the hosts of the heavens\n" +
                    "and the earth,\n" +
                    "and Allah is all-mighty, all-wise.");
            ayat.add("8\n" +
                    "إِنّا أَرسَلناكَ شاهِدًا وَمُبَشِّرًا وَنَذيرًا\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnā ʾarsalnāka shāhidan wa-mubashshiran wa-nadhīran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed We have sent you as a witness,\n" +
                    "and as a bearer of good news and warner,");
            ayat.add("9\n" +
                    "لِتُؤمِنوا بِاللَّهِ وَرَسولِهِ وَتُعَزِّروهُ وَتُوَقِّروهُ وَتُسَبِّحوهُ بُكرَةً وَأَصيلًا\n" +
                    "TRANSLITERATION\n" +
                    "li-tuʾminū bi-llāhi wa-rasūlihī wa-tuʿazzirūhu wa-tuwaqqirūhu wa-tusabbiḥūhu bukratan wa-ʾaṣīlan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "that you may have faith in Allah and His Apostle,\n" +
                    "and that you may support him and revere him,\n" +
                    "and that you may glorify Him morning\n" +
                    "and evening.");
            ayat.add("10\n" +
                    "إِنَّ الَّذينَ يُبايِعونَكَ إِنَّما يُبايِعونَ اللَّهَ يَدُ اللَّهِ فَوقَ أَيديهِم ۚ فَمَن نَكَثَ فَإِنَّما يَنكُثُ عَلىٰ نَفسِهِ ۖ وَمَن أَوفىٰ بِما عاهَدَ عَلَيهُ اللَّهَ فَسَيُؤتيهِ أَجرًا عَظيمًا\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna lladhīna yubāyiʿūnaka ʾinnamā yubāyiʿūna llāha yadu llāhi fawqa ʾaydīhim fa-man nakatha fa-ʾinnamā yankuthu ʿalā nafsihī wa-man ʾawfā bi-mā ʿāhada ʿalayhu llāha fa-sa-yuʾtīhi ʾajran ʿaẓīman\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed those who swear allegiance to you,\n" +
                    "swear allegiance only to Allah:\n" +
                    "the hand of Allah is above their hands.\n" +
                    "So whosoever breaks his oath,\n" +
                    "breaks it only to his own detriment,\n" +
                    "and whoever fulfills\n" +
                    "the covenant he has made with Allah,\n" +
                    "He will give him a great reward.");
            ayat.add("11\n" +
                    "سَيَقولُ لَكَ المُخَلَّفونَ مِنَ الأَعرابِ شَغَلَتنا أَموالُنا وَأَهلونا فَاستَغفِر لَنا ۚ يَقولونَ بِأَلسِنَتِهِم ما لَيسَ في قُلوبِهِم ۚ قُل فَمَن يَملِكُ لَكُم مِنَ اللَّهِ شَيئًا إِن أَرادَ بِكُم ضَرًّا أَو أَرادَ بِكُم نَفعًا ۚ بَل كانَ اللَّهُ بِما تَعمَلونَ خَبيرًا\n" +
                    "TRANSLITERATION\n" +
                    "sa-yaqūlu laka l-mukhallafūna mina l-ʾaʿrābi shaghalatnā ʾamwālunā wa-ʾahlūnā fa-staghfir lanā yaqūlūna bi-ʾalsinatihim mā laysa fī qulūbihim qul fa-man yamliku lakum mina llāhi shayʾan ʾin ʾarāda bikum ḍarran ʾaw ʾarāda bikum nafʿan bal kāna llāhu bi-mā taʿmalūna khabīran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The Bedouins who were left behind will tell you,\n" +
                    "‘Our possessions and our families kept us occupied.\n" +
                    "So plead [to Allah] for our forgiveness!’\n" +
                    "They say with their tongues\n" +
                    "what is not in their hearts.\n" +
                    "Say, ‘Who can be of any avail to you against Allah,\n" +
                    "should He desire to cause you harm\n" +
                    "or desire to bring you benefit?\n" +
                    "Rather Allah is well aware of what you do.’");
            ayat.add("12\n" +
                    "بَل ظَنَنتُم أَن لَن يَنقَلِبَ الرَّسولُ وَالمُؤمِنونَ إِلىٰ أَهليهِم أَبَدًا وَزُيِّنَ ذٰلِكَ في قُلوبِكُم وَظَنَنتُم ظَنَّ السَّوءِ وَكُنتُم قَومًا بورًا\n" +
                    "TRANSLITERATION\n" +
                    "bal ẓanantum ʾan lan yanqaliba r-rasūlu wa-l-muʾminūna ʾilā ʾahlīhim ʾabadan wa-zuyyina dhālika fī qulūbikum wa-ẓanantum ẓanna s-sawʾi wa-kuntum qawman būran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Rather you thought\n" +
                    "that the Apostle and the faithful will not return\n" +
                    "to their folk ever,\n" +
                    "and that was made to seem decorous to your hearts,\n" +
                    "and you entertained evil thoughts,\n" +
                    "and you were a ruined lot.");
            ayat.add("13\n" +
                    "وَمَن لَم يُؤمِن بِاللَّهِ وَرَسولِهِ فَإِنّا أَعتَدنا لِلكافِرينَ سَعيرًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-man lam yuʾmin bi-llāhi wa-rasūlihī fa-ʾinnā ʾaʿtadnā li-l-kāfirīna saʿīran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "As for those who have no faith in Allah\n" +
                    "and His Apostle,\n" +
                    "We have prepared a blaze for the faithless.");
            ayat.add("14\n" +
                    "وَلِلَّهِ مُلكُ السَّماواتِ وَالأَرضِ ۚ يَغفِرُ لِمَن يَشاءُ وَيُعَذِّبُ مَن يَشاءُ ۚ وَكانَ اللَّهُ غَفورًا رَحيمًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-li-llāhi mulku s-samāwāti wa-l-ʾarḍi yaghfiru li-man yashāʾu wa-yuʿadhdhibu man yashāʾu wa-kāna llāhu ghafūran raḥīman\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "To Allah belongs the kingdom of the heavens\n" +
                    "and the earth:\n" +
                    "He forgives whomever He wishes,\n" +
                    "and punishes whomever He wishes,\n" +
                    "and Allah is all-forgiving, all-merciful.");
            ayat.add("15\n" +
                    "سَيَقولُ المُخَلَّفونَ إِذَا انطَلَقتُم إِلىٰ مَغانِمَ لِتَأخُذوها ذَرونا نَتَّبِعكُم ۖ يُريدونَ أَن يُبَدِّلوا كَلامَ اللَّهِ ۚ قُل لَن تَتَّبِعونا كَذٰلِكُم قالَ اللَّهُ مِن قَبلُ ۖ فَسَيَقولونَ بَل تَحسُدونَنا ۚ بَل كانوا لا يَفقَهونَ إِلّا قَليلًا\n" +
                    "TRANSLITERATION\n" +
                    "sa-yaqūlu l-mukhallafūna ʾidhā nṭalaqtum ʾilā maghānima li-taʾkhudhūhā dharūnā nattabiʿkum yurīdūna ʾan yubaddilū kalāma llāhi qul lan tattabiʿūnā ka-dhālikum qāla llāhu min qablu fa-sa-yaqūlūna bal taḥsudūnanā bal kānū lā yafqahūna ʾillā qalīlan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Those who were left to stay behind will say,\n" +
                    "when you set out to capture booty:\n" +
                    "‘Let us follow you.’\n" +
                    "They desire to change the word of Allah.\n" +
                    "Say, ‘You shall never follow us!\n" +
                    "Thus has Allah said beforehand.’\n" +
                    "Then they will say, ‘You are envious of us.’\n" +
                    "Rather they do not understand but a little.");
            ayat.add("16\n" +
                    "قُل لِلمُخَلَّفينَ مِنَ الأَعرابِ سَتُدعَونَ إِلىٰ قَومٍ أُولي بَأسٍ شَديدٍ تُقاتِلونَهُم أَو يُسلِمونَ ۖ فَإِن تُطيعوا يُؤتِكُمُ اللَّهُ أَجرًا حَسَنًا ۖ وَإِن تَتَوَلَّوا كَما تَوَلَّيتُم مِن قَبلُ يُعَذِّبكُم عَذابًا أَليمًا\n" +
                    "TRANSLITERATION\n" +
                    "qul li-l-mukhallafīna mina l-ʾaʿrābi sa-tudʿawna ʾilā qawmin ʾulī baʾsin shadīdin tuqātilūnahum ʾaw yuslimūna fa-ʾin tuṭīʿū yuʾtikumu llāhu ʾajran ḥasanan wa-ʾin tatawallaw ka-mā tawallaytum min qablu yuʿadhdhibkum ʿadhāban ʾalīman\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Say to the Bedouins who were left to stay behind,\n" +
                    "‘You will be called against a people\n" +
                    "of a great might:\n" +
                    "they will embrace Islam, or you will fight them.\n" +
                    "So if you obey, Allah will give you a good reward;\n" +
                    "but if you turn away like you turned away before,\n" +
                    "He will punish you with a painful punishment.’\n");
            ayat.add("17\n" +
                    "لَيسَ عَلَى الأَعمىٰ حَرَجٌ وَلا عَلَى الأَعرَجِ حَرَجٌ وَلا عَلَى المَريضِ حَرَجٌ ۗ وَمَن يُطِعِ اللَّهَ وَرَسولَهُ يُدخِلهُ جَنّاتٍ تَجري مِن تَحتِهَا الأَنهارُ ۖ وَمَن يَتَوَلَّ يُعَذِّبهُ عَذابًا أَليمًا\n" +
                    "TRANSLITERATION\n" +
                    "laysa ʿalā l-ʾaʿmā ḥarajun wa-lā ʿalā l-ʾaʿraji ḥarajun wa-lā ʿalā l-marīḍi ḥarajun wa-man yuṭiʿi llāha wa-rasūlahū yudkhilhu jannātin tajrī min taḥtihā l-ʾanhāru wa-man yatawalla yuʿadhdhibhu ʿadhāban ʾalīman\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "There is no blame on the blind,\n" +
                    "nor is there any blame on the lame,\n" +
                    "nor is there blame on the sick;\n" +
                    "and whoever obeys Allah and His Apostle,\n" +
                    "He will admit him into gardens\n" +
                    "with streams running in them,\n" +
                    "and whoever refuses to comply,\n" +
                    "He will punish him with a painful punishment.");
            ayat.add("18\n" +
                    "۞ لَقَد رَضِيَ اللَّهُ عَنِ المُؤمِنينَ إِذ يُبايِعونَكَ تَحتَ الشَّجَرَةِ فَعَلِمَ ما في قُلوبِهِم فَأَنزَلَ السَّكينَةَ عَلَيهِم وَأَثابَهُم فَتحًا قَريبًا\n" +
                    "TRANSLITERATION\n" +
                    "la-qad raḍiya llāhu ʿani l-muʾminīna ʾidh yubāyiʿūnaka taḥta sh-shajarati fa-ʿalima mā fī qulūbihim fa-ʾanzala s-sakīnata ʿalayhim wa-ʾathābahum fatḥan qarīban\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Allah was certainly pleased with the faithful\n" +
                    "when they swore allegiance to you under the tree.\n" +
                    "He knew what was in their hearts,\n" +
                    "so He sent down composure on them,\n" +
                    "and requited them with a victory near at hand");
            ayat.add("19\n" +
                    "وَمَغانِمَ كَثيرَةً يَأخُذونَها ۗ وَكانَ اللَّهُ عَزيزًا حَكيمًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-maghānima kathīratan yaʾkhudhūnahā wa-kāna llāhu ʿazīzan ḥakīman\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and abundant spoils that they will capture,\n" +
                    "and Allah is all-mighty, all-wise.");
            ayat.add("20\n" +
                    "وَعَدَكُمُ اللَّهُ مَغانِمَ كَثيرَةً تَأخُذونَها فَعَجَّلَ لَكُم هٰذِهِ وَكَفَّ أَيدِيَ النّاسِ عَنكُم وَلِتَكونَ آيَةً لِلمُؤمِنينَ وَيَهدِيَكُم صِراطًا مُستَقيمًا\n" +
                    "TRANSLITERATION\n" +
                    "waʿadakumu llāhu maghānima kathīratan taʾkhudhūnahā fa-ʿajjala lakum hādhihī wa-kaffa ʾaydiya n-nāsi ʿankum wa-li-takūna ʾāyatan li-l-muʾminīna wa-yahdiyakum ṣirāṭan mustaqīman\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Allah has promised you abundant spoils\n" +
                    "which you will capture.\n" +
                    "He has expedited this one for you,\n" +
                    "and withheld men’s hands from you,\n" +
                    "so that it may be a sign for the faithful,\n" +
                    "and that He may guide you to a straight path.");
            ayat.add("21\n" +
                    "وَأُخرىٰ لَم تَقدِروا عَلَيها قَد أَحاطَ اللَّهُ بِها ۚ وَكانَ اللَّهُ عَلىٰ كُلِّ شَيءٍ قَديرًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾukhrā lam taqdirū ʿalayhā qad ʾaḥāṭa llāhu bihā wa-kāna llāhu ʿalā kulli shayʾin qadīran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And other [spoils]\n" +
                    "which you have not yet captured:\n" +
                    "Allah has comprehended them,\n" +
                    "and Allah has power over all things.");
            ayat.add("22\n" +
                    "وَلَو قاتَلَكُمُ الَّذينَ كَفَروا لَوَلَّوُا الأَدبارَ ثُمَّ لا يَجِدونَ وَلِيًّا وَلا نَصيرًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-law qātalakumu lladhīna kafarū la-wallawu l-ʾadbāra thumma lā yajidūna waliyyan wa-lā naṣīran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "If the faithless fight you,\n" +
                    "they will turn their backs [to flee].\n" +
                    "Then they will not find any protector or helper.");
            ayat.add("23\n" +
                    "سُنَّةَ اللَّهِ الَّتي قَد خَلَت مِن قَبلُ ۖ وَلَن تَجِدَ لِسُنَّةِ اللَّهِ تَبديلًا\n" +
                    "TRANSLITERATION\n" +
                    "sunnata llāhi llatī qad khalat min qablu wa-lan tajida li-sunnati llāhi tabdīlan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "[It is] Allah’s precedent that has passed before,\n" +
                    "and you will never find in Allah’s precedent\n" +
                    "any change.");
            ayat.add("24\n" +
                    "وَهُوَ الَّذي كَفَّ أَيدِيَهُم عَنكُم وَأَيدِيَكُم عَنهُم بِبَطنِ مَكَّةَ مِن بَعدِ أَن أَظفَرَكُم عَلَيهِم ۚ وَكانَ اللَّهُ بِما تَعمَلونَ بَصيرًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-huwa lladhī kaffa ʾaydiyahum ʿankum wa-ʾaydiyakum ʿanhum bi-baṭni makkata min baʿdi ʾan ʾaẓfarakum ʿalayhim wa-kāna llāhu bi-mā taʿmalūna baṣīran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "It is He who withheld their hands from you,\n" +
                    "and your hands from them,\n" +
                    "in the valley of Makkah,\n" +
                    "after He had given you victory over them,\n" +
                    "and Allah sees best what you do.");
            ayat.add("25\n" +
                    "هُمُ الَّذينَ كَفَروا وَصَدّوكُم عَنِ المَسجِدِ الحَرامِ وَالهَديَ مَعكوفًا أَن يَبلُغَ مَحِلَّهُ ۚ وَلَولا رِجالٌ مُؤمِنونَ وَنِساءٌ مُؤمِناتٌ لَم تَعلَموهُم أَن تَطَئوهُم فَتُصيبَكُم مِنهُم مَعَرَّةٌ بِغَيرِ عِلمٍ ۖ لِيُدخِلَ اللَّهُ في رَحمَتِهِ مَن يَشاءُ ۚ لَو تَزَيَّلوا لَعَذَّبنَا الَّذينَ كَفَروا مِنهُم عَذابًا أَليمًا\n" +
                    "TRANSLITERATION\n" +
                    "humu lladhīna kafarū wa-ṣaddūkum ʿani l-masjidi l-ḥarāmi wa-l-hadya maʿkūfan ʾan yablugha maḥillahū wa-law-lā rijālun muʾminūna wa-nisāʾun muʾminātun lam taʿlamūhum ʾan taṭʾūhum fa-tuṣībakum minhum maʿarratun bi-ghayri ʿilmin li-yudkhila llāhu fī raḥmatihī man yashāʾu law tazayyalū la-ʾadhdhabnā lladhīna kafarū minhum ʿadhāban ʾalīman\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They are the ones who disbelieved\n" +
                    "and barred you from the Sacred Mosque,\n" +
                    "and kept the offering from reaching its destination.\n" +
                    "And were it not for [certain] faithful men\n" +
                    "and faithful women,\n" +
                    "whom you did not know\n" +
                    "—lest you should trample them,\n" +
                    "and thus blame for [killing] them should fall on you\n" +
                    "unawares;1 [He held you back]\n" +
                    "so that Allah may admit into His mercy\n" +
                    "whomever He wishes.\n" +
                    "And had they been separate,\n" +
                    "We would have surely punished the faithless\n" +
                    "among them\n" +
                    "with a painful punishment.");
            ayat.add("26\n" +
                    "إِذ جَعَلَ الَّذينَ كَفَروا في قُلوبِهِمُ الحَمِيَّةَ حَمِيَّةَ الجاهِلِيَّةِ فَأَنزَلَ اللَّهُ سَكينَتَهُ عَلىٰ رَسولِهِ وَعَلَى المُؤمِنينَ وَأَلزَمَهُم كَلِمَةَ التَّقوىٰ وَكانوا أَحَقَّ بِها وَأَهلَها ۚ وَكانَ اللَّهُ بِكُلِّ شَيءٍ عَليمًا\n" +
                    "TRANSLITERATION\n" +
                    "ʾidh jaʿala lladhīna kafarū fī qulūbihimu l-ḥamiyyata ḥamiyyata l-jāhiliyyati fa-ʾanzala llāhu sakīnatahū ʿalā rasūlihī wa-ʿalā l-muʾminīna wa-ʾalzamahum kalimata t-taqwā wa-kānū ʾaḥaqqa bihā wa-ʾahlahā wa-kāna llāhu bi-kulli shayʾin ʿalīman\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "When the faithless nourished\n" +
                    "bigotry in their hearts,\n" +
                    "the bigotry of pagan ignorance,\n" +
                    "Allah sent down His composure\n" +
                    "upon His Apostle and upon the faithful,\n" +
                    "and made them abide by the word of Godwariness,\n" +
                    "for they were the worthiest of it and deserved it,\n" +
                    "and Allah has knowledge of all things.");
            ayat.add("27\n" +
                    "لَقَد صَدَقَ اللَّهُ رَسولَهُ الرُّؤيا بِالحَقِّ ۖ لَتَدخُلُنَّ المَسجِدَ الحَرامَ إِن شاءَ اللَّهُ آمِنينَ مُحَلِّقينَ رُءوسَكُم وَمُقَصِّرينَ لا تَخافونَ ۖ فَعَلِمَ ما لَم تَعلَموا فَجَعَلَ مِن دونِ ذٰلِكَ فَتحًا قَريبًا\n" +
                    "TRANSLITERATION\n" +
                    "la-qad ṣadaqa llāhu rasūlahu r-ruʾyā bi-l-ḥaqqi la-tadkhulunna l-masjida l-ḥarāma ʾin shāʾa llāhu ʾāminīna muḥalliqīna ruʾūsakum wa-muqaṣṣirīna lā takhāfūna fa-ʿalima mā lam taʿlamū fa-jaʿala min dūni dhālika fatḥan qarīban\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Certainly Allah has fulfilled His Apostle’s vision\n" +
                    "in all truth:\n" +
                    "You will surely enter the Sacred Mosque,\n" +
                    "God willing,\n" +
                    "in safety,\n" +
                    "with your heads shaven or hair cropped,\n" +
                    "without any fear.\n" +
                    "So He knew what you did not know,\n" +
                    "and He assigned [you] besides that\n" +
                    "a victory near at hand.");
            ayat.add("28\n" +
                    "هُوَ الَّذي أَرسَلَ رَسولَهُ بِالهُدىٰ وَدينِ الحَقِّ لِيُظهِرَهُ عَلَى الدّينِ كُلِّهِ ۚ وَكَفىٰ بِاللَّهِ شَهيدًا\n" +
                    "TRANSLITERATION\n" +
                    "huwa lladhī ʾarsala rasūlahū bi-l-hudā wa-dīni l-ḥaqqi li-yuẓhirahū ʿalā d-dīni kullihī wa-kafā bi-llāhi shahīdan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "It is He who has sent His Apostle with guidance\n" +
                    "and the true religion,\n" +
                    "that He may make it prevail over all religions,\n" +
                    "and Allah suffices as witness.");
            ayat.add("29\n" +
                    "مُحَمَّدٌ رَسولُ اللَّهِ ۚ وَالَّذينَ مَعَهُ أَشِدّاءُ عَلَى الكُفّارِ رُحَماءُ بَينَهُم ۖ تَراهُم رُكَّعًا سُجَّدًا يَبتَغونَ فَضلًا مِنَ اللَّهِ وَرِضوانًا ۖ سيماهُم في وُجوهِهِم مِن أَثَرِ السُّجودِ ۚ ذٰلِكَ مَثَلُهُم فِي التَّوراةِ ۚ وَمَثَلُهُم فِي الإِنجيلِ كَزَرعٍ أَخرَجَ شَطأَهُ فَآزَرَهُ فَاستَغلَظَ فَاستَوىٰ عَلىٰ سوقِهِ يُعجِبُ الزُّرّاعَ لِيَغيظَ بِهِمُ الكُفّارَ ۗ وَعَدَ اللَّهُ الَّذينَ آمَنوا وَعَمِلُوا الصّالِحاتِ مِنهُم مَغفِرَةً وَأَجرًا عَظيمًا\n" +
                    "TRANSLITERATION\n" +
                    "muḥammadun rasūlu llāhi wa-lladhīna maʿahū ʾashiddāʾu ʿalā l-kuffāri ruḥamāʾu baynahum tarāhum rukkaʿan sujjadan yabtaghūna faḍlan mina llāhi wa-riḍwānan sīmāhum fī wujūhihim min ʾathari s-sujūdi dhālika mathaluhum fī t-tawrāti wa-mathaluhum fī l-ʾinjīli ka-zarʿin ʾakhraja shaṭʾahū fa-ʾāzarahū fa-staghlaẓa fa-stawā ʿalā sūqihī yuʿjibu z-zurrāʿa li-yaghīẓa bihimu l-kuffāra waʿada llāhu lladhīna ʾāmanū wa-ʿamilū ṣ-ṣāliḥāti minhum maghfiratan wa-ʾajran ʿaẓīman\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Muḥammad, the Apostle of Allah,\n" +
                    "and those who are with him\n" +
                    "are hard against the faithless\n" +
                    "and merciful amongst themselves.\n" +
                    "You see them bowing and prostrating [in worship],\n" +
                    "seeking Allah’s grace and [His] pleasure.\n" +
                    "Their mark is [visible] on their faces,\n" +
                    "from the effect of prostration.\n" +
                    "Such is their description in the Torah\n" +
                    "and their description in the Evangel.\n" +
                    "Like a tillage\n" +
                    "that sends out its shoots and builds them up,\n" +
                    "and they grow stout\n" +
                    "and settle on their stalks,\n" +
                    "impressing the sowers,\n" +
                    "so that He may enrage the faithless by them.\n" +
                    "Allah has promised those\n" +
                    "of them who have faith and do righteous deeds\n" +
                    "forgiveness and a great reward.");
        }
        else if (surahName.equals("49. Al-Hujurat"))
        {
            setTitle("Al-Hujurat(الحجرات) : Apartments");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "يا أَيُّهَا الَّذينَ آمَنوا لا تُقَدِّموا بَينَ يَدَيِ اللَّهِ وَرَسولِهِ ۖ وَاتَّقُوا اللَّهَ ۚ إِنَّ اللَّهَ سَميعٌ عَليمٌ\n" +
                    "TRANSLITERATION\n" +
                    "yā-ʾayyuhā lladhīna ʾāmanū lā tuqaddimū bayna yadayi llāhi wa-rasūlihī wa-ttaqū llāha ʾinna llāha samīʿun ʿalīmun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "O you who have faith!\n" +
                    "Do not venture ahead of Allah and His Apostle,\n" +
                    "and be wary of Allah.\n" +
                    "Indeed Allah is all-hearing, all-knowing.");
            ayat.add("2\n" +
                    "يا أَيُّهَا الَّذينَ آمَنوا لا تَرفَعوا أَصواتَكُم فَوقَ صَوتِ النَّبِيِّ وَلا تَجهَروا لَهُ بِالقَولِ كَجَهرِ بَعضِكُم لِبَعضٍ أَن تَحبَطَ أَعمالُكُم وَأَنتُم لا تَشعُرونَ\n" +
                    "TRANSLITERATION\n" +
                    "yā-ʾayyuhā lladhīna ʾāmanū lā tarfaʿū ʾaṣwātakum fawqa ṣawti n-nabiyyi wa-lā tajharū lahū bi-l-qawli ka-jahri baʿḍikum li-baʿḍin ʾan taḥbaṭa ʾaʿmālukum wa-ʾantum lā tashʿurūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "O you who have faith!\n" +
                    "Do not raise your voices\n" +
                    "above the voice of the Prophet,\n" +
                    "and do not speak aloud to him\n" +
                    "as you shout to one another,\n" +
                    "lest your works should fail\n" +
                    "without your being aware.");
            ayat.add("3\n" +
                    "إِنَّ الَّذينَ يَغُضّونَ أَصواتَهُم عِندَ رَسولِ اللَّهِ أُولٰئِكَ الَّذينَ امتَحَنَ اللَّهُ قُلوبَهُم لِلتَّقوىٰ ۚ لَهُم مَغفِرَةٌ وَأَجرٌ عَظيمٌ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna lladhīna yaghuḍḍūna ʾaṣwātahum ʿinda rasūli llāhi ʾulāʾika lladhīna mtaḥana llāhu qulūbahum li-t-taqwā lahum maghfiratun wa-ʾajrun ʿaẓīmun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed those who lower their voices\n" +
                    "in the presence of the Apostle of Allah\n" +
                    "—they are the ones whose hearts Allah has tested\n" +
                    "for Godwariness.\n" +
                    "For them will be forgiveness and a great reward.");
            ayat.add("4\n" +
                    "إِنَّ الَّذينَ يُنادونَكَ مِن وَراءِ الحُجُراتِ أَكثَرُهُم لا يَعقِلونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna lladhīna yunādūnaka min warāʾi l-ḥujurāti ʾaktharuhum lā yaʿqilūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed those who call you\n" +
                    "from behind the apartments,\n" +
                    "most of them do not apply reason.");
            ayat.add("5\n" +
                    "وَلَو أَنَّهُم صَبَروا حَتّىٰ تَخرُجَ إِلَيهِم لَكانَ خَيرًا لَهُم ۚ وَاللَّهُ غَفورٌ رَحيمٌ\n" +
                    "TRANSLITERATION\n" +
                    "wa-law ʾannahum ṣabarū ḥattā takhruja ʾilayhim la-kāna khayran lahum wa-llāhu ghafūrun raḥīmun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Had they been patient until you came out for them,\n" +
                    "it would have been better for them,\n" +
                    "and Allah is all-forgiving, all-merciful.");
            ayat.add("6\n" +
                    "يا أَيُّهَا الَّذينَ آمَنوا إِن جاءَكُم فاسِقٌ بِنَبَإٍ فَتَبَيَّنوا أَن تُصيبوا قَومًا بِجَهالَةٍ فَتُصبِحوا عَلىٰ ما فَعَلتُم نادِمينَ\n" +
                    "TRANSLITERATION\n" +
                    "yā-ʾayyuhā lladhīna ʾāmanū ʾin jāʾakum fāsiqun bi-nabaʾin fa-tabayyanū ʾan tuṣībū qawman bi-jahālatin fa-tuṣbiḥū ʿalā mā faʿaltum nādimīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "O you who have faith!\n" +
                    "If a profligate [person] should bring you some news,\n" +
                    "verify it,\n" +
                    "lest you should visit [harm] on some people\n" +
                    "out of ignorance,\n" +
                    "and then become regretful for what you have done.");
            ayat.add("7\n" +
                    "وَاعلَموا أَنَّ فيكُم رَسولَ اللَّهِ ۚ لَو يُطيعُكُم في كَثيرٍ مِنَ الأَمرِ لَعَنِتُّم وَلٰكِنَّ اللَّهَ حَبَّبَ إِلَيكُمُ الإيمانَ وَزَيَّنَهُ في قُلوبِكُم وَكَرَّهَ إِلَيكُمُ الكُفرَ وَالفُسوقَ وَالعِصيانَ ۚ أُولٰئِكَ هُمُ الرّاشِدونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʿlamū ʾanna fīkum rasūla llāhi law yuṭīʿukum fī kathīrin mina l-ʾamri la-ʿanittum wa-lākinna llāha ḥabbaba ʾilaykumu l-ʾīmāna wa-zayyanahū fī qulūbikum wa-karraha ʾilaykumu l-kufra wa-l-fusūqa wa-l-ʿiṣyāna ʾulāʾika humu r-rāshidūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Know that the Apostle of Allah is among you.\n" +
                    "Should he obey you in many matters,\n" +
                    "you would surely suffer.\n" +
                    "But Allah has endeared faith to you\n" +
                    "and made it appealing in your hearts,\n" +
                    "and He has made hateful to you\n" +
                    "faithlessness, transgression and disobedience.\n" +
                    "It is such who are the right-minded");
            ayat.add("8\n" +
                    "فَضلًا مِنَ اللَّهِ وَنِعمَةً ۚ وَاللَّهُ عَليمٌ حَكيمٌ\n" +
                    "TRANSLITERATION\n" +
                    "faḍlan mina llāhi wa-niʿmatan wa-llāhu ʿalīmun ḥakīmun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "—a grace and blessing from Allah,\n" +
                    "and Allah is all-knowing, all-wise.");
            ayat.add("9\n" +
                    "وَإِن طائِفَتانِ مِنَ المُؤمِنينَ اقتَتَلوا فَأَصلِحوا بَينَهُما ۖ فَإِن بَغَت إِحداهُما عَلَى الأُخرىٰ فَقاتِلُوا الَّتي تَبغي حَتّىٰ تَفيءَ إِلىٰ أَمرِ اللَّهِ ۚ فَإِن فاءَت فَأَصلِحوا بَينَهُما بِالعَدلِ وَأَقسِطوا ۖ إِنَّ اللَّهَ يُحِبُّ المُقسِطينَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾin ṭāʾifatāni mina l-muʾminīna qtatalū fa-ʾaṣliḥū baynahumā fa-ʾin baghat ʾiḥdāhumā ʿalā l-ʾukhrā fa-qātilū llatī tabghī ḥattā tafīʾa ʾilā ʾamri llāhi fa-ʾin fāʾat fa-ʾaṣliḥū baynahumā bi-l-ʿadli wa-ʾaqsiṭū ʾinna llāha yuḥibbu l-muqsiṭīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "If two groups of the faithful fight one another,\n" +
                    "make peace between them.\n" +
                    "But if one party of them aggresses against the other,\n" +
                    "fight the one which aggresses\n" +
                    "until it returns to Allah’s ordinance.\n" +
                    "Then, if it returns,\n" +
                    "make peace between them fairly,\n" +
                    "and do justice.\n" +
                    "Indeed Allah loves the just.");
            ayat.add("10\n" +
                    "إِنَّمَا المُؤمِنونَ إِخوَةٌ فَأَصلِحوا بَينَ أَخَوَيكُم ۚ وَاتَّقُوا اللَّهَ لَعَلَّكُم تُرحَمونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnamā l-muʾminūna ʾikhwatun fa-ʾaṣliḥū bayna ʾakhawaykum wa-ttaqū llāha laʿallakum turḥamūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The faithful are indeed brothers.\n" +
                    "Therefore make peace between your brothers\n" +
                    "and be wary of Allah,\n" +
                    "so that you may receive [His] mercy.");
            ayat.add("11\n" +
                    "يا أَيُّهَا الَّذينَ آمَنوا لا يَسخَر قَومٌ مِن قَومٍ عَسىٰ أَن يَكونوا خَيرًا مِنهُم وَلا نِساءٌ مِن نِساءٍ عَسىٰ أَن يَكُنَّ خَيرًا مِنهُنَّ ۖ وَلا تَلمِزوا أَنفُسَكُم وَلا تَنابَزوا بِالأَلقابِ ۖ بِئسَ الِاسمُ الفُسوقُ بَعدَ الإيمانِ ۚ وَمَن لَم يَتُب فَأُولٰئِكَ هُمُ الظّالِمونَ\n" +
                    "TRANSLITERATION\n" +
                    "yā-ʾayyuhā lladhīna ʾāmanū lā yaskhar qawmun min qawmin ʿasā ʾan yakūnū khayran minhum wa-lā nisāʾun min nisāʾin ʿasā ʾan yakunna khayran minhunna wa-lā talmizū ʾanfusakum wa-lā tanābazū bi-l-ʾalqābi biʾsa l-ʾismu l-fusūqu baʿda l-ʾīmāni wa-man lam yatub fa-ʾulāʾika humu ẓ-ẓālimūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "O you who have faith!\n" +
                    "Let not any people ridicule another people:\n" +
                    "it may be that they are better than they are;\n" +
                    "nor let women [ridicule] women:\n" +
                    "it may be that they are better than they are.\n" +
                    "And do not defame one another,\n" +
                    "nor insult one another by [calling] nicknames.\n" +
                    "How evil are profane names subsequent to faith!\n" +
                    "And whoever is not penitent\n" +
                    "—such are the wrongdoers.");
            ayat.add("12\n" +
                    "يا أَيُّهَا الَّذينَ آمَنُوا اجتَنِبوا كَثيرًا مِنَ الظَّنِّ إِنَّ بَعضَ الظَّنِّ إِثمٌ ۖ وَلا تَجَسَّسوا وَلا يَغتَب بَعضُكُم بَعضًا ۚ أَيُحِبُّ أَحَدُكُم أَن يَأكُلَ لَحمَ أَخيهِ مَيتًا فَكَرِهتُموهُ ۚ وَاتَّقُوا اللَّهَ ۚ إِنَّ اللَّهَ تَوّابٌ رَحيمٌ\n" +
                    "TRANSLITERATION\n" +
                    "yā-ʾayyuhā lladhīna ʾāmanū jtanibū kathīran mina ẓ-ẓanni ʾinna baʿḍa ẓ-ẓanni ʾithmun wa-lā tajassasū wa-lā yaghtab baʿḍukum baʿḍan ʾa-yuḥibbu ʾaḥadukum ʾan yaʾkula laḥma ʾakhīhi maytan fa-karihtumūhu wa-ttaqū llāha ʾinna llāha tawwābun raḥīmun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "O you who have faith!\n" +
                    "Avoid much suspicion.\n" +
                    "Indeed some suspicions are sins.\n" +
                    "And do not spy on\n" +
                    "or backbite one another.\n" +
                    "Will any of you love\n" +
                    "to eat the flesh of his dead brother?\n" +
                    "You would hate it.\n" +
                    "And be wary of Allah;\n" +
                    "indeed Allah is all-clement, all-merciful.");
            ayat.add("13\n" +
                    "يا أَيُّهَا النّاسُ إِنّا خَلَقناكُم مِن ذَكَرٍ وَأُنثىٰ وَجَعَلناكُم شُعوبًا وَقَبائِلَ لِتَعارَفوا ۚ إِنَّ أَكرَمَكُم عِندَ اللَّهِ أَتقاكُم ۚ إِنَّ اللَّهَ عَليمٌ خَبيرٌ\n" +
                    "TRANSLITERATION\n" +
                    "yā-ʾayyuhā n-nāsu ʾinnā khalaqnākum min dhakarin wa-ʾunthā wa-jaʿalnākum shuʿūban wa-qabāʾila li-taʿārafū ʾinna ʾakramakum ʿinda llāhi ʾatqākum ʾinna llāha ʿalīmun khabīrun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "O mankind!\n" +
                    "Indeed We created you from a male and a female,\n" +
                    "and made you nations and tribes\n" +
                    "that you may identify yourselves with one another.\n" +
                    "Indeed the noblest1 of you\n" +
                    "in the sight of Allah\n" +
                    "is the most Godwary among you.\n" +
                    "Indeed Allah is all-knowing, all-aware.");
            ayat.add("14\n" +
                    "۞ قالَتِ الأَعرابُ آمَنّا ۖ قُل لَم تُؤمِنوا وَلٰكِن قولوا أَسلَمنا وَلَمّا يَدخُلِ الإيمانُ في قُلوبِكُم ۖ وَإِن تُطيعُوا اللَّهَ وَرَسولَهُ لا يَلِتكُم مِن أَعمالِكُم شَيئًا ۚ إِنَّ اللَّهَ غَفورٌ رَحيمٌ\n" +
                    "TRANSLITERATION\n" +
                    "qālati l-ʾaʿrābu ʾāmannā qul lam tuʾminū wa-lākin qūlū ʾaslamnā wa-lammā yadkhuli l-ʾīmānu fī qulūbikum wa-ʾin tuṭīʿū llāha wa-rasūlahū lā yalitkum min ʾaʿmālikum shayʾan ʾinna llāha ghafūrun raḥīmun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The Bedouins say, ‘We have faith.’\n" +
                    "Say, ‘You do not have faith yet;\n" +
                    "rather say, “We have embraced Islam,”1\n" +
                    "for faith has not yet entered into your hearts.\n" +
                    "Yet if you obey Allah and His Apostle,\n" +
                    "He will not stint anything of [the reward of] your works.\n" +
                    "Indeed Allah is all-forgiving, all-merciful.’");
            ayat.add("15\n" +
                    "إِنَّمَا المُؤمِنونَ الَّذينَ آمَنوا بِاللَّهِ وَرَسولِهِ ثُمَّ لَم يَرتابوا وَجاهَدوا بِأَموالِهِم وَأَنفُسِهِم في سَبيلِ اللَّهِ ۚ أُولٰئِكَ هُمُ الصّادِقونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnamā l-muʾminūna lladhīna ʾāmanū bi-llāhi wa-rasūlihī thumma lam yartābū wa-jāhadū bi-ʾamwālihim wa-ʾanfusihim fī sabīli llāhi ʾulāʾika humu ṣ-ṣādiqūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The faithful are only those who have attained faith\n" +
                    "in Allah and His Apostle\n" +
                    "and then have never doubted,\n" +
                    "and who wage jihād with their possessions\n" +
                    "and their persons\n" +
                    "in the way of Allah.\n" +
                    "It is they who are the truthful.");
            ayat.add("16\n" +
                    "قُل أَتُعَلِّمونَ اللَّهَ بِدينِكُم وَاللَّهُ يَعلَمُ ما فِي السَّماواتِ وَما فِي الأَرضِ ۚ وَاللَّهُ بِكُلِّ شَيءٍ عَليمٌ\n" +
                    "TRANSLITERATION\n" +
                    "qul ʾa-tuʿallimūna llāha bi-dīnikum wa-llāhu yaʿlamu mā fī s-samāwāti wa-mā fī l-ʾarḍi wa-llāhu bi-kulli shayʾin ʿalīmun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Say, ‘Will you inform Allah about your faith\n" +
                    "while Allah knows whatever there is in the heavens\n" +
                    "and whatever there is in the earth,\n" +
                    "and Allah has knowledge of all things?’");
            ayat.add("17\n" +
                    "يَمُنّونَ عَلَيكَ أَن أَسلَموا ۖ قُل لا تَمُنّوا عَلَيَّ إِسلامَكُم ۖ بَلِ اللَّهُ يَمُنُّ عَلَيكُم أَن هَداكُم لِلإيمانِ إِن كُنتُم صادِقينَ\n" +
                    "TRANSLITERATION\n" +
                    "yamunnūna ʿalayka ʾan ʾaslamū qul lā tamunnū ʿalayya ʾislāmakum bali llāhu yamunnu ʿalaykum ʾan hadākum li-l-ʾīmāni ʾin kuntum ṣādiqīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They count it as a favour to you\n" +
                    "that they have embraced Islam.\n" +
                    "Say, ‘Do not count it as a favour to me\n" +
                    "your embracing of Islam.\n" +
                    "Rather it is Allah who has done you a favour\n" +
                    "in that He has guided you to faith,\n" +
                    "should you be truthful.");
            ayat.add("18\n" +
                    "إِنَّ اللَّهَ يَعلَمُ غَيبَ السَّماواتِ وَالأَرضِ ۚ وَاللَّهُ بَصيرٌ بِما تَعمَلونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna llāha yaʿlamu ghayba s-samāwāti wa-l-ʾarḍi wa-llāhu baṣīrun bi-mā taʿmalūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed Allah knows the Unseen of the heavens\n" +
                    "and the earth,\n" +
                    "and Allah sees best what you do.’");
        }
        else if (surahName.equals("50. Qaf"))
        {
            setTitle("Qaf(ق) : Qāf");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "ق ۚ وَالقُرآنِ المَجيدِ\n" +
                    "TRANSLITERATION\n" +
                    "q (qāf) wa-l-qurʾāni l-majīdi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Qāf.\n" +
                    "By the glorious Qurʾān.");
            ayat.add("2\n" +
                    "بَل عَجِبوا أَن جاءَهُم مُنذِرٌ مِنهُم فَقالَ الكافِرونَ هٰذا شَيءٌ عَجيبٌ\n" +
                    "TRANSLITERATION\n" +
                    "bal ʿajibū ʾan jāʾahum mundhirun minhum fa-qāla l-kāfirūna hādhā shayʾun ʿajībun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Rather they consider it odd\n" +
                    "that a warner should have come to them\n" +
                    "from among themselves.\n" +
                    "So the faithless say, ‘This is an odd thing.");
            ayat.add("3\n" +
                    "أَإِذا مِتنا وَكُنّا تُرابًا ۖ ذٰلِكَ رَجعٌ بَعيدٌ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-ʾidhā mitnā wa-kunnā turāban dhālika rajʿun baʿīdun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "What! When we are dead\n" +
                    "and have become dust [shall we be raised again]?\n" +
                    "That is a far-fetched return!’");
            ayat.add("4\n" +
                    "قَد عَلِمنا ما تَنقُصُ الأَرضُ مِنهُم ۖ وَعِندَنا كِتابٌ حَفيظٌ\n" +
                    "TRANSLITERATION\n" +
                    "qad ʿalimnā mā tanquṣu l-ʾarḍu minhum wa-ʿindanā kitābun ḥafīẓun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "We know what the earth diminishes from them,1\n" +
                    "and with Us is a preserving Book.");
            ayat.add("5\n" +
                    "بَل كَذَّبوا بِالحَقِّ لَمّا جاءَهُم فَهُم في أَمرٍ مَريجٍ\n" +
                    "TRANSLITERATION\n" +
                    "bal kadhdhabū bi-l-ḥaqqi lammā jāʾahum fa-hum fī ʾamrin marījin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Rather they denied the truth when it came to them;\n" +
                    "so they are now in a perplexed state of affairs.");
            ayat.add("6\n" +
                    "أَفَلَم يَنظُروا إِلَى السَّماءِ فَوقَهُم كَيفَ بَنَيناها وَزَيَّنّاها وَما لَها مِن فُروجٍ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-fa-lam yanẓurū ʾilā s-samāʾi fawqahum kayfa banaynāhā wa-zayyannāhā wa-mā lahā min furūjin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Have they not then observed the sky above them,\n" +
                    "how We have built it and adorned it,\n" +
                    "and that there are no cracks in it?");
            ayat.add("7\n" +
                    "وَالأَرضَ مَدَدناها وَأَلقَينا فيها رَواسِيَ وَأَنبَتنا فيها مِن كُلِّ زَوجٍ بَهيجٍ\n" +
                    "TRANSLITERATION\n" +
                    "wa-l-ʾarḍa madadnāhā wa-ʾalqaynā fīhā rawāsiya wa-ʾanbatnā fīhā min kulli zawjin bahījin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And We spread out the earth,\n" +
                    "and cast in it firm mountains,\n" +
                    "and caused every delightful kind to grow in it.");
            ayat.add("8\n" +
                    "تَبصِرَةً وَذِكرىٰ لِكُلِّ عَبدٍ مُنيبٍ\n" +
                    "TRANSLITERATION\n" +
                    "tabṣiratan wa-dhikrā li-kulli ʿabdin munībin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "[In this there is] an insight and admonition\n" +
                    "for every penitent servant.");
            ayat.add("9\n" +
                    "وَنَزَّلنا مِنَ السَّماءِ ماءً مُبارَكًا فَأَنبَتنا بِهِ جَنّاتٍ وَحَبَّ الحَصيدِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-nazzalnā mina s-samāʾi māʾan mubārakan fa-ʾanbatnā bihī jannātin wa-ḥabba l-ḥaṣīdi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And We send down from the sky salubrious water,\n" +
                    "with which We grow gardens\n" +
                    "and the grain which is harvested,");
            ayat.add("10\n" +
                    "وَالنَّخلَ باسِقاتٍ لَها طَلعٌ نَضيدٌ\n" +
                    "TRANSLITERATION\n" +
                    "wa-n-nakhla bāsiqātin lahā ṭalʿun naḍīdun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and tall date palms with regularly set spathes,");
            ayat.add("11\n" +
                    "رِزقًا لِلعِبادِ ۖ وَأَحيَينا بِهِ بَلدَةً مَيتًا ۚ كَذٰلِكَ الخُروجُ\n" +
                    "TRANSLITERATION\n" +
                    "rizqan li-l-ʿibādi wa-ʾaḥyaynā bihī baldatan maytan ka-dhālika l-khurūju\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "as a provision for servants;\n" +
                    "and with it We revive a dead country.\n" +
                    "Likewise will be the rising [from the dead].");
            ayat.add("12\n" +
                    "كَذَّبَت قَبلَهُم قَومُ نوحٍ وَأَصحابُ الرَّسِّ وَثَمودُ\n" +
                    "TRANSLITERATION\n" +
                    "kadhdhabat qablahum qawmu nūḥin wa-ʾaṣḥābu r-rassi wa-thamūdu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The people of Noah denied before them,\n" +
                    "and [so did] the inhabitants of Rass1 and Thamūd,");
            ayat.add("13\n" +
                    "وَعادٌ وَفِرعَونُ وَإِخوانُ لوطٍ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʿādun wa-firʿawnu wa-ʾikhwānu lūṭin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and ʿĀd, Pharaoh, and the brethren of Lot,");
            ayat.add("14\n" +
                    "وَأَصحابُ الأَيكَةِ وَقَومُ تُبَّعٍ ۚ كُلٌّ كَذَّبَ الرُّسُلَ فَحَقَّ وَعيدِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾaṣhābu l-ʾaykati wa-qawmu tubbaʿin kullun kadhdhaba r-rusula fa-ḥaqqa waʿīdi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and the inhabitants of Aykah\n" +
                    "and the people of Tubbaʿ.1\n" +
                    "Each [of them] impugned the apostles,\n" +
                    "and so My threat became due [against them].");
            ayat.add("15\n" +
                    "أَفَعَيينا بِالخَلقِ الأَوَّلِ ۚ بَل هُم في لَبسٍ مِن خَلقٍ جَديدٍ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-fa-ʿayīnā bi-l-khalqi l-ʾawwali bal hum fī labsin min khalqin jadīdin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Were We exhausted by the first creation?\n" +
                    "Rather they are in doubt about a new creation.");
            ayat.add("16\n" +
                    "وَلَقَد خَلَقنَا الإِنسانَ وَنَعلَمُ ما تُوَسوِسُ بِهِ نَفسُهُ ۖ وَنَحنُ أَقرَبُ إِلَيهِ مِن حَبلِ الوَريدِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-la-qad khalaqnā l-ʾinsāna wa-naʿlamu mā tuwaswisu bihī nafsuhū wa-naḥnu ʾaqrabu ʾilayhi min ḥabli l-warīdi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Certainly We have created man\n" +
                    "and We know to what his soul tempts him,\n" +
                    "and We are nearer to him\n" +
                    "than his jugular vein.");
            ayat.add("17\n" +
                    "إِذ يَتَلَقَّى المُتَلَقِّيانِ عَنِ اليَمينِ وَعَنِ الشِّمالِ قَعيدٌ\n" +
                    "TRANSLITERATION\n" +
                    "ʾidh yatalaqqā l-mutalaqqiyāni ʿani l-yamīni wa-ʿani sh-shimāli qaʿīdun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "When the twin recorders record [his deeds],\n" +
                    "seated on the right hand and on the left:");
            ayat.add("18\n" +
                    "ما يَلفِظُ مِن قَولٍ إِلّا لَدَيهِ رَقيبٌ عَتيدٌ\n" +
                    "TRANSLITERATION\n" +
                    "mā yalfiẓu min qawlin ʾillā ladayhi raqībun ʿatīdun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "he says no word\n" +
                    "but that there is a ready observer beside him.");
            ayat.add("19\n" +
                    "وَجاءَت سَكرَةُ المَوتِ بِالحَقِّ ۖ ذٰلِكَ ما كُنتَ مِنهُ تَحيدُ\n" +
                    "TRANSLITERATION\n" +
                    "wa-jāʾat sakratu l-mawti bi-l-ḥaqqi dhālika mā kunta minhu taḥīdu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Then the agony of death brings the truth:1\n" +
                    "‘This is what you used to shun!’");
            ayat.add("20\n" +
                    "وَنُفِخَ فِي الصّورِ ۚ ذٰلِكَ يَومُ الوَعيدِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-nufikha fī ṣ-ṣūri dhālika yawmu l-waʿīdi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Then the Trumpet will be blown:\n" +
                    "‘This is the promised day.’");
            ayat.add("21\n" +
                    "وَجاءَت كُلُّ نَفسٍ مَعَها سائِقٌ وَشَهيدٌ\n" +
                    "TRANSLITERATION\n" +
                    "wa-jāʾat kullu nafsin maʿahā sāʾiqun wa-shahīdun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Then every soul will come\n" +
                    "accompanied by a driver and a witness:");
            ayat.add("22\n" +
                    "لَقَد كُنتَ في غَفلَةٍ مِن هٰذا فَكَشَفنا عَنكَ غِطاءَكَ فَبَصَرُكَ اليَومَ حَديدٌ\n" +
                    "TRANSLITERATION\n" +
                    "la-qad kunta fī ghaflatin min hādhā fa-kashafnā ʿanka ghiṭāʾaka fa-baṣaruka l-yawma ḥadīdun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "‘You were certainly oblivious of this.\n" +
                    "We have removed your veil from you,\n" +
                    "and so your sight is acute today.’");
            ayat.add("23\n" +
                    "وَقالَ قَرينُهُ هٰذا ما لَدَيَّ عَتيدٌ\n" +
                    "TRANSLITERATION\n" +
                    "wa-qāla qarīnuhū hādhā mā ladayya ʿatīdun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Then his companion will say,\n" +
                    "‘This is what is ready with me [of testimony].’");
            ayat.add("24\n" +
                    "أَلقِيا في جَهَنَّمَ كُلَّ كَفّارٍ عَنيدٍ\n" +
                    "TRANSLITERATION\n" +
                    "ʾalqiyā fī jahannama kulla kaffārin ʿanīdin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "‘The two of you cast every obdurate ingrate into hell,");
            ayat.add("25\n" +
                    "مَنّاعٍ لِلخَيرِ مُعتَدٍ مُريبٍ\n" +
                    "TRANSLITERATION\n" +
                    "mannāʿin li-l-khayri muʿtadin murībin-i\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "[every] hinderer of all good,\n" +
                    "transgressor, and skeptic,");
            ayat.add("26\n" +
                    "الَّذي جَعَلَ مَعَ اللَّهِ إِلٰهًا آخَرَ فَأَلقِياهُ فِي العَذابِ الشَّديدِ\n" +
                    "TRANSLITERATION\n" +
                    "alladhī jaʿala maʿa llāhi ʾilāhan ʾākhara fa-ʾalqiyāhu fī l-ʿadhābi sh-shadīdi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "who has set up another god along with Allah!\n" +
                    "So the two of you cast him\n" +
                    "into the severe punishment.’");
            ayat.add("27\n" +
                    "۞ قالَ قَرينُهُ رَبَّنا ما أَطغَيتُهُ وَلٰكِن كانَ في ضَلالٍ بَعيدٍ\n" +
                    "TRANSLITERATION\n" +
                    "qāla qarīnuhū rabbanā mā ʾaṭghaytuhū wa-lākin kāna fī ḍalālin baʿīdin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "His companion1 will say, ‘Our Lord!\n" +
                    "I did not make him a rebel,\n" +
                    "but he [himself] was in extreme error.’");
            ayat.add("28\n" +
                    "قالَ لا تَختَصِموا لَدَيَّ وَقَد قَدَّمتُ إِلَيكُم بِالوَعيدِ\n" +
                    "TRANSLITERATION\n" +
                    "qāla lā takhtaṣimū ladayya wa-qad qaddamtu ʾilaykum bi-l-waʿīdi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "He will say, ‘Do not wrangle in My presence,\n" +
                    "for I had already warned you in advance.");
            ayat.add("29\n" +
                    "ما يُبَدَّلُ القَولُ لَدَيَّ وَما أَنا بِظَلّامٍ لِلعَبيدِ\n" +
                    "TRANSLITERATION\n" +
                    "mā yubaddalu l-qawlu ladayya wa-mā ʾana bi-ẓallāmin li-l-ʿabīdi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The word [of judgement] is unalterable with Me,\n" +
                    "and I am not tyrannical to the servants.’");
            ayat.add("30\n" +
                    "يَومَ نَقولُ لِجَهَنَّمَ هَلِ امتَلَأتِ وَتَقولُ هَل مِن مَزيدٍ\n" +
                    "TRANSLITERATION\n" +
                    "yawma naqūlu li-jahannama hali mtalaʾti wa-taqūlu hal min mazīdin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The day when We shall say to hell,\n" +
                    "‘Are you full?’\n" +
                    "It will say, ‘Is there any more?");
            ayat.add("31\n" +
                    "وَأُزلِفَتِ الجَنَّةُ لِلمُتَّقينَ غَيرَ بَعيدٍ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾuzlifati l-jannatu li-l-muttaqīna ghayra baʿīdin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And paradise will be brought near for the Godwary,\n" +
                    "not distant [any more]:");
            ayat.add("32\n" +
                    "هٰذا ما توعَدونَ لِكُلِّ أَوّابٍ حَفيظٍ\n" +
                    "TRANSLITERATION\n" +
                    "hādhā mā tūʿadūna li-kulli ʾawwābin ḥafīẓin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "‘This is what you were promised.\n" +
                    "[It is] for every penitent and dutiful [servant]");
            ayat.add("33\n" +
                    "مَن خَشِيَ الرَّحمٰنَ بِالغَيبِ وَجاءَ بِقَلبٍ مُنيبٍ\n" +
                    "TRANSLITERATION\n" +
                    "man khashiya r-raḥmāna bi-l-ghaybi wa-jāʾa bi-qalbin munībin-i\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "who fears the All-beneficent in secret\n" +
                    "and comes with a penitent heart.");
            ayat.add("34\n" +
                    "ادخُلوها بِسَلامٍ ۖ ذٰلِكَ يَومُ الخُلودِ\n" +
                    "TRANSLITERATION\n" +
                    "udkhulūhā bi-salāmin dhālika yawmu l-khulūdi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Enter it in peace!\n" +
                    "This is the day of immortality.’");
            ayat.add("35\n" +
                    "لَهُم ما يَشاءونَ فيها وَلَدَينا مَزيدٌ\n" +
                    "TRANSLITERATION\n" +
                    "lahum mā yashāʾūna fīhā wa-ladaynā mazīdun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "There they will have whatever they wish,\n" +
                    "and with Us there is yet more.");
            ayat.add("36\n" +
                    "وَكَم أَهلَكنا قَبلَهُم مِن قَرنٍ هُم أَشَدُّ مِنهُم بَطشًا فَنَقَّبوا فِي البِلادِ هَل مِن مَحيصٍ\n" +
                    "TRANSLITERATION\n" +
                    "wa-kam ʾahlaknā qablahum min qarnin hum ʾashaddu minhum baṭshan fa-naqqabū fī l-bilādi hal min maḥīṣin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "How many generations We have destroyed before them,\n" +
                    "who were stronger than these,\n" +
                    "insomuch that they ransacked the towns?!\n" +
                    "Is there any escape [from Allah’s punishment]?");
            ayat.add("37\n" +
                    "إِنَّ في ذٰلِكَ لَذِكرىٰ لِمَن كانَ لَهُ قَلبٌ أَو أَلقَى السَّمعَ وَهُوَ شَهيدٌ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna fī dhālika la-dhikrā li-man kāna lahū qalbun ʾaw ʾalqā s-samʿa wa-huwa shahīdun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "There is indeed an admonition in that\n" +
                    "for one who has a heart,\n" +
                    "or gives ear, being attentive.");
            ayat.add("38\n" +
                    "وَلَقَد خَلَقنَا السَّماواتِ وَالأَرضَ وَما بَينَهُما في سِتَّةِ أَيّامٍ وَما مَسَّنا مِن لُغوبٍ\n" +
                    "TRANSLITERATION\n" +
                    "wa-la-qad khalaqnā s-samāwāti wa-l-ʾarḍa wa-mā baynahumā fī sittati ʾayyāmin wa-mā massanā min lughūbin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Certainly We created the heavens and the earth,\n" +
                    "and whatever is between them,\n" +
                    "in six days,\n" +
                    "and any fatigue did not touch Us.");
            ayat.add("39\n" +
                    "فَاصبِر عَلىٰ ما يَقولونَ وَسَبِّح بِحَمدِ رَبِّكَ قَبلَ طُلوعِ الشَّمسِ وَقَبلَ الغُروبِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ṣbir ʿalā mā yaqūlūna wa-sabbiḥ bi-ḥamdi rabbika qabla ṭulūʿi sh-shamsi wa-qabla l-ghurūbi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So be patient over what they say,\n" +
                    "and celebrate the praise of your Lord\n" +
                    "before the rising of the sun\n" +
                    "and before the sunset,");
            ayat.add("40\n" +
                    "وَمِنَ اللَّيلِ فَسَبِّحهُ وَأَدبارَ السُّجودِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-mina l-layli fa-sabbiḥhu wa-ʾadbāra s-sujūdi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and glorify Him through part of the night\n" +
                    "and after the prostrations.");
            ayat.add("41\n" +
                    "وَاستَمِع يَومَ يُنادِ المُنادِ مِن مَكانٍ قَريبٍ\n" +
                    "TRANSLITERATION\n" +
                    "wa-stamiʿ yawma yunādi l-munādi min makānin qarībin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And be on the alert for the day\n" +
                    "when the caller calls from a close quarter,");
            ayat.add("42\n" +
                    "يَومَ يَسمَعونَ الصَّيحَةَ بِالحَقِّ ۚ ذٰلِكَ يَومُ الخُروجِ\n" +
                    "TRANSLITERATION\n" +
                    "yawma yasmaʿūna ṣ-ṣayḥata bi-l-ḥaqqi dhālika yawmu l-khurūji\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "the day when they hear the Cry in all truth.\n" +
                    "That is the day of rising [from the dead].");
            ayat.add("43\n" +
                    "إِنّا نَحنُ نُحيي وَنُميتُ وَإِلَينَا المَصيرُ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnā naḥnu nuḥyī wa-numītu wa-ʾilaynā l-maṣīru\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed it is We who give life and bring death,\n" +
                    "and toward Us is the destination.");
            ayat.add("44\n" +
                    "يَومَ تَشَقَّقُ الأَرضُ عَنهُم سِراعًا ۚ ذٰلِكَ حَشرٌ عَلَينا يَسيرٌ\n" +
                    "TRANSLITERATION\n" +
                    "yawma tashaqqaqu l-ʾarḍu ʿanhum sirāʿan dhālika ḥashrun ʿalaynā yasīrun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The day the earth is split open for [disentombing] them,\n" +
                    "[they will come out] hastening.\n" +
                    "That mustering1 is easy for Us [to carry out].");
            ayat.add("45\n" +
                    "نَحنُ أَعلَمُ بِما يَقولونَ ۖ وَما أَنتَ عَلَيهِم بِجَبّارٍ ۖ فَذَكِّر بِالقُرآنِ مَن يَخافُ وَعيدِ\n" +
                    "TRANSLITERATION\n" +
                    "naḥnu ʾaʿlamu bi-mā yaqūlūna wa-mā ʾanta ʿalayhim bi-jabbārin fa-dhakkir bi-l-qurʾāni man yakhāfu waʿīdi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "We know best what they say,\n" +
                    "and you are not to be a tyrant over them.\n" +
                    "So admonish by the Qurʾān him who fears My threat.");
        }
        else if (surahName.equals("51. Ad-Dhariyat"))
        {
            setTitle("Ad-Dhariyat(الذاريات) : The Scattering");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "وَالذّارِياتِ ذَروًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-dh-dhāriyāti dharwan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "By the scattering [winds]\n" +
                    "that scatter [the clouds];");
            ayat.add("2\n" +
                    "فَالحامِلاتِ وِقرًا\n" +
                    "TRANSLITERATION\n" +
                    "fa-l-ḥāmilāti wiqran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "by the [rain] bearing [clouds]\n" +
                    "laden [with water];");
            ayat.add("3\n" +
                    "فَالجارِياتِ يُسرًا\n" +
                    "TRANSLITERATION\n" +
                    "fa-l-jāriyāti yusran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "by [the ships] which move gently [on the sea];");
            ayat.add("4\n" +
                    "فَالمُقَسِّماتِ أَمرًا\n" +
                    "TRANSLITERATION\n" +
                    "fa-l-muqassimāti ʾamran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "by [the angels] who dispense [livelihood]\n" +
                    "by [His] command:");
            ayat.add("5\n" +
                    "إِنَّما توعَدونَ لَصادِقٌ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnamā tūʿadūna la-ṣādiqun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "indeed what you are promised is true,");
            ayat.add("6\n" +
                    "وَإِنَّ الدّينَ لَواقِعٌ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾinna d-dīna la-wāqiʿun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and indeed the retribution1 will surely come to pass!");
            ayat.add("7\n" +
                    "وَالسَّماءِ ذاتِ الحُبُكِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-s-samāʾi dhāti l-ḥubuki\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "By the sky full of adornment [with stars],");
            ayat.add("8\n" +
                    "إِنَّكُم لَفي قَولٍ مُختَلِفٍ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnakum la-fī qawlin mukhtalifin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "indeed you are of different opinions!");
            ayat.add("9\n" +
                    "يُؤفَكُ عَنهُ مَن أُفِكَ\n" +
                    "TRANSLITERATION\n" +
                    "yuʾfaku ʿanhu man ʾufika\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "He is turned away from it1\n" +
                    "who has been turned away [from the truth].");
            ayat.add("10\n" +
                    "قُتِلَ الخَرّاصونَ\n" +
                    "TRANSLITERATION\n" +
                    "qutila-l-kharrāṣūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Perish the liars,");
            ayat.add("11\n" +
                    "الَّذينَ هُم في غَمرَةٍ ساهونَ\n" +
                    "TRANSLITERATION\n" +
                    "alladhīna hum fī ghamratin sāhūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "who are heedless in a stupor!");
            ayat.add("12\n" +
                    "يَسأَلونَ أَيّانَ يَومُ الدّينِ\n" +
                    "TRANSLITERATION\n" +
                    "yasʾalūna ʾayyāna yawmu d-dīni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They ask, ‘When will be the Day of Retribution?’");
            ayat.add("13\n" +
                    "يَومَ هُم عَلَى النّارِ يُفتَنونَ\n" +
                    "TRANSLITERATION\n" +
                    "yawma hum ʿalā n-nāri yuftanūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "It is the day when they will be tormented in the Fire,");
            ayat.add("14\n" +
                    "ذوقوا فِتنَتَكُم هٰذَا الَّذي كُنتُم بِهِ تَستَعجِلونَ\n" +
                    "TRANSLITERATION\n" +
                    "dhūqū fitnatakum hādhā lladhī kuntum bihī tastaʿjilūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "[and will be told]: ‘Taste your torment.\n" +
                    "This is what you used to hasten.’");
            ayat.add("15\n" +
                    "إِنَّ المُتَّقينَ في جَنّاتٍ وَعُيونٍ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna l-muttaqīna fī jannātin wa-ʿuyūnin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed the Godwary will be amid gardens\n" +
                    "and springs,");
            ayat.add("16\n" +
                    "آخِذينَ ما آتاهُم رَبُّهُم ۚ إِنَّهُم كانوا قَبلَ ذٰلِكَ مُحسِنينَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾākhidhīna mā ʾātāhum rabbuhum ʾinnahum kānū qabla dhālika muḥsinīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "receiving what their Lord has given them,\n" +
                    "for they had been virtuous aforetime.");
            ayat.add("17\n" +
                    "كانوا قَليلًا مِنَ اللَّيلِ ما يَهجَعونَ\n" +
                    "TRANSLITERATION\n" +
                    "kānū qalīlan mina l-layli mā yahjaʿūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They used to sleep a little during the night,");
            ayat.add("18\n" +
                    "وَبِالأَسحارِ هُم يَستَغفِرونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-bi-l-ʾasḥāri hum yastaghfirūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and at dawns they would plead for forgiveness,");
            ayat.add("19\n" +
                    "وَفي أَموالِهِم حَقٌّ لِلسّائِلِ وَالمَحرومِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-fī ʾamwālihim ḥaqqun li-s-sāʾili wa-l-maḥrūmi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and there was a share in their wealth\n" +
                    "for the beggar and the deprived.");
            ayat.add("20\n" +
                    "وَفِي الأَرضِ آياتٌ لِلموقِنينَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-fī l-ʾarḍi ʾāyātun li-l-mūqinīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "In the earth are signs for those who have conviction,");
            ayat.add("21\n" +
                    "وَفي أَنفُسِكُم ۚ أَفَلا تُبصِرونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-fī ʾanfusikum ʾa-fa-lā tubṣirūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and in your souls [as well].\n" +
                    "Will you not then perceive?");
            ayat.add("22\n" +
                    "وَفِي السَّماءِ رِزقُكُم وَما توعَدونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-fī s-samāʾi rizqukum wa-mā tūʿadūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And in the sky is your provision\n" +
                    "and what you are promised.");
            ayat.add("23\n" +
                    "فَوَرَبِّ السَّماءِ وَالأَرضِ إِنَّهُ لَحَقٌّ مِثلَ ما أَنَّكُم تَنطِقونَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-wa-rabbi s-samāʾi wa-l-ʾarḍi ʾinnahū la-ḥaqqun mithla mā ʾannakum tanṭiqūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "By the Lord of the sky and the earth,\n" +
                    "it is indeed the truth,\n" +
                    "just as [it is a fact that] you speak.");
            ayat.add("24\n" +
                    "هَل أَتاكَ حَديثُ ضَيفِ إِبراهيمَ المُكرَمينَ\n" +
                    "TRANSLITERATION\n" +
                    "hal ʾatāka ḥadīthu ḍayfi ʾibrāhīma l-mukramīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Did you receive the story\n" +
                    "of Abraham’s honoured guests?");
            ayat.add("25\n" +
                    "إِذ دَخَلوا عَلَيهِ فَقالوا سَلامًا ۖ قالَ سَلامٌ قَومٌ مُنكَرونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾidh dakhalū ʿalayhi fa-qālū salāman qāla salāmun qawmun munkarūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "When they entered into his presence,\n" +
                    "they said, ‘Peace!’\n" +
                    "‘Peace!’ He answered,\n" +
                    "‘[You are] an unfamiliar folk.'");
            ayat.add("26\n" +
                    "فَراغَ إِلىٰ أَهلِهِ فَجاءَ بِعِجلٍ سَمينٍ\n" +
                    "TRANSLITERATION\n" +
                    "fa-rāgha ʾilā ʾahlihī fa-jāʾa bi-ʿijlin samīnin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Then he retired to his family\n" +
                    "and brought a fat [roasted] calf,");
            ayat.add("27\n" +
                    "فَقَرَّبَهُ إِلَيهِم قالَ أَلا تَأكُلونَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-qarrabahū ʾilayhim qāla ʾa-lā taʾkulūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and put it near them.\n" +
                    "He said, ‘Will you not eat?’");
            ayat.add("28\n" +
                    "فَأَوجَسَ مِنهُم خيفَةً ۖ قالوا لا تَخَف ۖ وَبَشَّروهُ بِغُلامٍ عَليمٍ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾawjasa minhum khīfatan qālū lā takhaf wa-bashsharūhu bi-ghulāmin ʿalīmin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Then he felt a fear of them.\n" +
                    "They said, ‘Do not be afraid!’\n" +
                    "and they gave him the good news of a wise son.");
            ayat.add("29\n" +
                    "فَأَقبَلَتِ امرَأَتُهُ في صَرَّةٍ فَصَكَّت وَجهَها وَقالَت عَجوزٌ عَقيمٌ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾaqbalati mraʾatuhū fī ṣarratin fa-ṣakkat wajhahā wa-qālat ʿajūzun ʿaqīmun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Then his wife came forward crying [with joy].\n" +
                    "She beat her face,\n" +
                    "and said, ‘A barren old woman!’");
            ayat.add("30\n" +
                    "قالوا كَذٰلِكِ قالَ رَبُّكِ ۖ إِنَّهُ هُوَ الحَكيمُ العَليمُ\n" +
                    "TRANSLITERATION\n" +
                    "qālū ka-dhāliki qāla rabbuki ʾinnahū huwa l-ḥakīmu l-ʿalīmu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They said, ‘So has your Lord said.\n" +
                    "Indeed He is the All-wise, the All-knowing.’");
            ayat.add("31\n" +
                    "۞ قالَ فَما خَطبُكُم أَيُّهَا المُرسَلونَ\n" +
                    "TRANSLITERATION\n" +
                    "qāla fa-mā khaṭbukum ʾayyuhā l-mursalūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "He said,\n" +
                    "‘O messengers, what is now your errand?’");
            ayat.add("32\n" +
                    "قالوا إِنّا أُرسِلنا إِلىٰ قَومٍ مُجرِمينَ\n" +
                    "TRANSLITERATION\n" +
                    "qālū ʾinnā ʾursilnā ʾilā qawmin mujrimīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They said,\n" +
                    "‘We have been sent toward a guilty people,");
            ayat.add("33\n" +
                    "لِنُرسِلَ عَلَيهِم حِجارَةً مِن طينٍ\n" +
                    "TRANSLITERATION\n" +
                    "li-nursila ʿalayhim ḥijāratan min ṭīnin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "that We may rain upon them stones of clay,");
            ayat.add("34\n" +
                    "مُسَوَّمَةً عِندَ رَبِّكَ لِلمُسرِفينَ\n" +
                    "TRANSLITERATION\n" +
                    "musawwamatan ʿinda rabbika li-l-musrifīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "marked with your Lord for the profligate.");
            ayat.add("35\n" +
                    "فَأَخرَجنا مَن كانَ فيها مِنَ المُؤمِنينَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾakhrajnā man kāna fīhā mina l-muʾminīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So We picked out those who were in it\n" +
                    "of the faithful,");
            ayat.add("36\n" +
                    "فَما وَجَدنا فيها غَيرَ بَيتٍ مِنَ المُسلِمينَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-mā wajadnā fīhā ghayra baytin mina l-muslimīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "but We did not find there\n" +
                    "other than one house of muslims,");
            ayat.add("37\n" +
                    "وَتَرَكنا فيها آيَةً لِلَّذينَ يَخافونَ العَذابَ الأَليمَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-taraknā fīhā ʾāyatan li-lladhīna yakhāfūna l-ʿadhāba l-ʾalīma\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and We have left therein a sign\n" +
                    "for those who fear a painful punishment.’");
            ayat.add("38\n" +
                    "وَفي موسىٰ إِذ أَرسَلناهُ إِلىٰ فِرعَونَ بِسُلطانٍ مُبينٍ\n" +
                    "TRANSLITERATION\n" +
                    "wa-fī mūsā ʾidh ʾarsalnāhu ʾilā firʿawna bi-sulṭānin mubīnin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And in Moses [too there is a sign]\n" +
                    "when We sent him to Pharaoh\n" +
                    "with a manifest authority.");
            ayat.add("39\n" +
                    "فَتَوَلّىٰ بِرُكنِهِ وَقالَ ساحِرٌ أَو مَجنونٌ\n" +
                    "TRANSLITERATION\n" +
                    "fa-tawallā bi-ruknihī wa-qāla sāḥirun ʾaw majnūnun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "But he turned away assured of his might,\n" +
                    "and said, ‘A magician or a crazy man!’");
            ayat.add("40\n" +
                    "فَأَخَذناهُ وَجُنودَهُ فَنَبَذناهُم فِي اليَمِّ وَهُوَ مُليمٌ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾakhadhnāhu wa-junūdahū fa-nabadhnāhum fī l-yammi wa-huwa mulīmun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So We seized him and his hosts,\n" +
                    "and cast them into the sea,\n" +
                    "while he was blameworthy.");
            ayat.add("41\n" +
                    "وَفي عادٍ إِذ أَرسَلنا عَلَيهِمُ الرّيحَ العَقيمَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-fī ʿādin ʾidh ʾarsalnā ʿalayhimu r-rīḥa l-ʿaqīma\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And in ʿĀd when We unleashed upon them\n" +
                    "a barren wind.");
            ayat.add("42\n" +
                    "ما تَذَرُ مِن شَيءٍ أَتَت عَلَيهِ إِلّا جَعَلَتهُ كَالرَّميمِ\n" +
                    "TRANSLITERATION\n" +
                    "mā tadharu min shayʾin ʾatat ʿalayhi ʾillā jaʿalathu ka-r-ramīmi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "It left nothing that it came upon\n" +
                    "without making it like decayed bones.");
            ayat.add("43\n" +
                    "وَفي ثَمودَ إِذ قيلَ لَهُم تَمَتَّعوا حَتّىٰ حينٍ\n" +
                    "TRANSLITERATION\n" +
                    "wa-fī thamūda ʾidh qīla lahum tamattaʿū ḥattā ḥīnin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And in Thamūd, when they were told,\n" +
                    "‘Enjoy for a while.’");
            ayat.add("44\n" +
                    "فَعَتَوا عَن أَمرِ رَبِّهِم فَأَخَذَتهُمُ الصّاعِقَةُ وَهُم يَنظُرونَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʿataw ʿan ʾamri rabbihim fa-ʾakhadhathumu ṣ-ṣāʿiqatu wa-hum yanẓurūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Then they defied the command of their Lord;\n" +
                    "so the thunderbolt seized them\n" +
                    "as they looked on.");
            ayat.add("45\n" +
                    "فَمَا استَطاعوا مِن قِيامٍ وَما كانوا مُنتَصِرينَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-mā staṭāʿū min qiyāmin wa-mā kānū muntaṣirīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So they were neither able to rise up,\n" +
                    "nor to come to one another’s aid.");
            ayat.add("46\n" +
                    "وَقَومَ نوحٍ مِن قَبلُ ۖ إِنَّهُم كانوا قَومًا فاسِقينَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-qawma nūḥin min qablu ʾinnahum kānū qawman fāsiqīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And the people of Noah aforetime.\n" +
                    "Indeed they were a transgressing lot.");
            ayat.add("47\n" +
                    "وَالسَّماءَ بَنَيناها بِأَيدٍ وَإِنّا لَموسِعونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-s-samāʾa banaynāhā bi-ʾaydin wa-ʾinnā la-mūsiʿūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "We have built the sky with might,\n" +
                    "and indeed it is We who are its expanders.");
            ayat.add("48\n" +
                    "وَالأَرضَ فَرَشناها فَنِعمَ الماهِدونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-l-ʾarḍa farashnāhā fa-niʿma l-māhidūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And the earth We have spread it out,\n" +
                    "so how excellent spreaders We have been!");
            ayat.add("49\n" +
                    "وَمِن كُلِّ شَيءٍ خَلَقنا زَوجَينِ لَعَلَّكُم تَذَكَّرونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-min kulli shayʾin khalaqnā zawjayni laʿallakum tadhakkarūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "In all things We have created pairs\n" +
                    "so that you may take admonition.");
            ayat.add("50\n" +
                    "فَفِرّوا إِلَى اللَّهِ ۖ إِنّي لَكُم مِنهُ نَذيرٌ مُبينٌ\n" +
                    "TRANSLITERATION\n" +
                    "fa-firrū ʾilā llāhi ʾinnī lakum minhu nadhīrun mubīnun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "[Say,] ‘So flee toward Allah.\n" +
                    "Indeed I am a manifest warner to you from Him.");
            ayat.add("51\n" +
                    "وَلا تَجعَلوا مَعَ اللَّهِ إِلٰهًا آخَرَ ۖ إِنّي لَكُم مِنهُ نَذيرٌ مُبينٌ\n" +
                    "TRANSLITERATION\n" +
                    "wa-lā tajʿalū maʿa llāhi ʾilāhan ʾākhara ʾinnī lakum minhu nadhīrun mubīnun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Do not set up another god besides Allah.\n" +
                    "Indeed I am a manifest warner to you from Him.’");
            ayat.add("52\n" +
                    "كَذٰلِكَ ما أَتَى الَّذينَ مِن قَبلِهِم مِن رَسولٍ إِلّا قالوا ساحِرٌ أَو مَجنونٌ\n" +
                    "TRANSLITERATION\n" +
                    "ka-dhālika mā ʾatā lladhīna min qablihim min rasūlin ʾillā qālū sāḥirun ʾaw majnūnun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So it was\n" +
                    "that there did not come to those who were before them\n" +
                    "any apostle\n" +
                    "but they said, ‘A magician,’ or ‘A crazy man!’");
            ayat.add("53\n" +
                    "أَتَواصَوا بِهِ ۚ بَل هُم قَومٌ طاغونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-tawāṣaw bihī bal hum qawmun ṭāghūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Did they enjoin this upon one another?!\n" +
                    "Rather they were a rebellious lot.");
            ayat.add("54\n" +
                    "فَتَوَلَّ عَنهُم فَما أَنتَ بِمَلومٍ\n" +
                    "TRANSLITERATION\n" +
                    "fa-tawalla ʿanhum fa-mā ʾanta bi-malūmin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So turn away from them,\n" +
                    "for you will not be blameworthy.");
            ayat.add("55\n" +
                    "وَذَكِّر فَإِنَّ الذِّكرىٰ تَنفَعُ المُؤمِنينَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-dhakkir fa-ʾinna dh-dhikrā tanfaʿu l-muʾminīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And admonish,\n" +
                    "for admonition indeed benefits the faithful.");
            ayat.add("56\n" +
                    "وَما خَلَقتُ الجِنَّ وَالإِنسَ إِلّا لِيَعبُدونِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-mā khalaqtu l-jinna wa-l-ʾinsa ʾillā li-yaʿbudūni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "I did not create the jinn and the humans\n" +
                    "except that they may worship Me.");
            ayat.add("57\n" +
                    "ما أُريدُ مِنهُم مِن رِزقٍ وَما أُريدُ أَن يُطعِمونِ\n" +
                    "TRANSLITERATION\n" +
                    "mā ʾurīdu minhum min rizqin wa-mā ʾurīdu ʾan yuṭʿimūni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "I desire no provision from them,\n" +
                    "nor do I desire that they should feed Me.");
            ayat.add("58\n" +
                    "إِنَّ اللَّهَ هُوَ الرَّزّاقُ ذُو القُوَّةِ المَتينُ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna llāha huwa r-razzāqu dhū l-quwwati l-matīnu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed it is Allah who is the All-provider,\n" +
                    "Powerful, All-strong.");
            ayat.add("59\n" +
                    "فَإِنَّ لِلَّذينَ ظَلَموا ذَنوبًا مِثلَ ذَنوبِ أَصحابِهِم فَلا يَستَعجِلونِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾinna li-lladhīna ẓalamū dhanūban mithla dhanūbi ʾaṣḥābihim fa-lā yastaʿjilūni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed the lot of those who do wrong [now]\n" +
                    "will be like the lot of their [earlier] counterparts.\n" +
                    "So let them not ask Me to hasten on [that fate].");
            ayat.add("60\n" +
                    "فَوَيلٌ لِلَّذينَ كَفَروا مِن يَومِهِمُ الَّذي يوعَدونَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-waylun li-lladhīna kafarū min yawmihimu lladhī yūʿadūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Woe to the faithless\n" +
                    "for the day they are promised!");
        }
        else if (surahName.equals("52. At-Tur"))
        {
            setTitle("At-Tur(الطور) : The Mount");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("\n" +
                    "وَالطّورِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ṭ-ṭūri\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "By the Mount [Sinai],");
            ayat.add("2\n" +
                    "وَكِتابٍ مَسطورٍ\n" +
                    "TRANSLITERATION\n" +
                    "wa-kitābin masṭūrin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "by the Book inscribed");
            ayat.add("3\n" +
                    "في رَقٍّ مَنشورٍ\n" +
                    "TRANSLITERATION\n" +
                    "fī raqqin manshūrin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "on an unrolled parchment;");
            ayat.add("4\n" +
                    "وَالبَيتِ المَعمورِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-l-bayti l-maʿmūri\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "by the House greatly frequented;");
            ayat.add("5\n" +
                    "وَالسَّقفِ المَرفوعِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-s-saqfi l-marfūʿi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "by the vault raised high,");
            ayat.add("6\n" +
                    "وَالبَحرِ المَسجورِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-l-baḥri l-masjūri\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "by the surging sea:");
            ayat.add("7\n" +
                    "إِنَّ عَذابَ رَبِّكَ لَواقِعٌ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna ʿadhāba rabbika la-wāqiʿun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "indeed your Lord’s punishment will surely befall.");
            ayat.add("8\n" +
                    "ما لَهُ مِن دافِعٍ\n" +
                    "TRANSLITERATION\n" +
                    "mā lahū min dāfiʿin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "There is none who can avert it.");
            ayat.add("9\n" +
                    "يَومَ تَمورُ السَّماءُ مَورًا\n" +
                    "TRANSLITERATION\n" +
                    "yawma tamūru s-samāʾu mawran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "On the day when the sky whirls violently,");
            ayat.add("10\n" +
                    "وَتَسيرُ الجِبالُ سَيرًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-tasīru l-jibālu sayran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and the mountains move with an awful motion:");
            ayat.add("11\n" +
                    "فَوَيلٌ يَومَئِذٍ لِلمُكَذِّبينَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-waylun yawmaʾidhin li-l-mukadhdhibīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "woe to the deniers on that day");
            ayat.add("12\n" +
                    "الَّذينَ هُم في خَوضٍ يَلعَبونَ\n" +
                    "TRANSLITERATION\n" +
                    "alladhīna hum fī khawḍin yalʿabūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "those who play around in vain talk,");
            ayat.add("13\n" +
                    "يَومَ يُدَعّونَ إِلىٰ نارِ جَهَنَّمَ دَعًّا\n" +
                    "TRANSLITERATION\n" +
                    "yawma yudaʿʿūna ʾilā n-nāri jahannama daʿʿan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "the day when they will be shoved\n" +
                    "toward the fire of hell\n" +
                    "forcibly,");
            ayat.add("14\n" +
                    "هٰذِهِ النّارُ الَّتي كُنتُم بِها تُكَذِّبونَ\n" +
                    "TRANSLITERATION\n" +
                    "hādhihi n-nāru llatī kuntum bihā tukadhdhibūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "[and told:] ‘This is the Fire which\n" +
                    "you used to deny!’");
            ayat.add("15\n" +
                    "أَفَسِحرٌ هٰذا أَم أَنتُم لا تُبصِرونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-fa-siḥrun hādhā ʾam ʾantum lā tubṣirūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Is this then magic,\n" +
                    "or is it you who do not perceive?");
            ayat.add("16\n" +
                    "اصلَوها فَاصبِروا أَو لا تَصبِروا سَواءٌ عَلَيكُم ۖ إِنَّما تُجزَونَ ما كُنتُم تَعمَلونَ\n" +
                    "TRANSLITERATION\n" +
                    "iṣlawhā fa-ṣbirū ʾaw lā taṣbirū sawāʾun ʿalaykum ʾinnamā tujzawna mā kuntum taʿmalūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "‘Enter it,\n" +
                    "and whether you are patient or impatient\n" +
                    "it will be the same for you.\n" +
                    "You are only being requited\n" +
                    "for what you used to do.’");
            ayat.add("17\n" +
                    "إِنَّ المُتَّقينَ في جَنّاتٍ وَنَعيمٍ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna l-muttaqīna fī jannātin wa-naʿīmin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed the Godwary will be amid gardens\n" +
                    "and bliss,");
            ayat.add("18\n" +
                    "فاكِهينَ بِما آتاهُم رَبُّهُم وَوَقاهُم رَبُّهُم عَذابَ الجَحيمِ\n" +
                    "TRANSLITERATION\n" +
                    "fākihīna bi-mā ʾātāhum rabbuhum wa-waqāhum rabbuhum ʿadhāba l-jaḥīmi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "rejoicing because of what their Lord has given them,\n" +
                    "and that their Lord has saved them\n" +
                    "from the punishment of hell.");
            ayat.add("19\n" +
                    "كُلوا وَاشرَبوا هَنيئًا بِما كُنتُم تَعمَلونَ\n" +
                    "TRANSLITERATION\n" +
                    "kulū wa-shrabū hanīʾan bi-mā kuntum taʿmalūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "[They will be told:] ‘Enjoy your food and drink,\n" +
                    "[as a reward] for what you used to do.’");
            ayat.add("20\n" +
                    "مُتَّكِئينَ عَلىٰ سُرُرٍ مَصفوفَةٍ ۖ وَزَوَّجناهُم بِحورٍ عينٍ\n" +
                    "TRANSLITERATION\n" +
                    "muttakiʾīna ʿalā sururin maṣfūfatin wa-zawwajnāhum bi-ḥūrin ʿīnin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They will be reclining on arrayed couches,\n" +
                    "and We will wed them to big-eyed houris.");
            ayat.add("21\n" +
                    "وَالَّذينَ آمَنوا وَاتَّبَعَتهُم ذُرِّيَّتُهُم بِإيمانٍ أَلحَقنا بِهِم ذُرِّيَّتَهُم وَما أَلَتناهُم مِن عَمَلِهِم مِن شَيءٍ ۚ كُلُّ امرِئٍ بِما كَسَبَ رَهينٌ\n" +
                    "TRANSLITERATION\n" +
                    "wa-lladhīna ʾāmanū wa-ttabaʿathum dhurriyyatuhum bi-ʾīmānin ʾalḥaqnā bihim dhurriyyatahum wa-mā ʾalatnāhum min ʿamalihim min shayʾin kullu mriʾin bi-mā kasaba rahīnun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The faithful\n" +
                    "and their descendants who followed them in faith\n" +
                    "—We will make their descendants join them,\n" +
                    "and We will not stint\n" +
                    "anything from [the reward of] their deeds.\n" +
                    "Every man is a hostage to what he has earned.");
            ayat.add("22\n" +
                    "وَأَمدَدناهُم بِفاكِهَةٍ وَلَحمٍ مِمّا يَشتَهونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾamdadnāhum bi-fākihatin wa-laḥmin mimmā yashtahūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "We will provide them with fruits and meat,\n" +
                    "such as they desire.");
            ayat.add("23\n" +
                    "يَتَنازَعونَ فيها كَأسًا لا لَغوٌ فيها وَلا تَأثيمٌ\n" +
                    "TRANSLITERATION\n" +
                    "yatanāzaʿūna fīhā kaʾsan lā laghwun fīhā wa-lā taʾthīmun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "There they will pass from hand to hand a cup\n" +
                    "wherein there will be neither any vain talk\n" +
                    "nor sinful speech.");
            ayat.add("24\n" +
                    "۞ وَيَطوفُ عَلَيهِم غِلمانٌ لَهُم كَأَنَّهُم لُؤلُؤٌ مَكنونٌ\n" +
                    "TRANSLITERATION\n" +
                    "wa-yaṭūfu ʿalayhim ghilmānun lahum ka-ʾannahum luʾluʾun maknūnun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They will be waited upon by youths, their own,\n" +
                    "as if they were guarded pearls.");
            ayat.add("25\n" +
                    "وَأَقبَلَ بَعضُهُم عَلىٰ بَعضٍ يَتَساءَلونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾaqbala baʿḍuhum ʿalā baʿḍin yatasāʾalūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They will turn to one another,\n" +
                    "questioning each other.");
            ayat.add("26\n" +
                    "قالوا إِنّا كُنّا قَبلُ في أَهلِنا مُشفِقينَ\n" +
                    "TRANSLITERATION\n" +
                    "qālū ʾinnā kunnā qablu fī ʾahlinā mushfiqīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They will say, ‘Indeed, aforetime, we used to be\n" +
                    "apprehensive about our families.");
            ayat.add("27\n" +
                    "فَمَنَّ اللَّهُ عَلَينا وَوَقانا عَذابَ السَّمومِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-manna llāhu ʿalaynā wa-waqānā ʿadhāba s-samūmi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "But Allah showed us favour\n" +
                    "and He saved us\n" +
                    "from the punishment of the [infernal] miasma;");
            ayat.add("28\n" +
                    "إِنّا كُنّا مِن قَبلُ نَدعوهُ ۖ إِنَّهُ هُوَ البَرُّ الرَّحيمُ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnā kunnā min qablu nadʿūhu ʾinnahū huwa l-barru r-raḥīmu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "indeed we used to supplicate Him aforetime.\n" +
                    "Indeed He is the All-benign, the All-merciful.’");
            ayat.add("29\n" +
                    "فَذَكِّر فَما أَنتَ بِنِعمَتِ رَبِّكَ بِكاهِنٍ وَلا مَجنونٍ\n" +
                    "TRANSLITERATION\n" +
                    "fa-dhakkir fa-mā ʾanta bi-niʿmati rabbika bi-kāhinin wa-lā majnūnin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So admonish.\n" +
                    "By your Lord’s blessing, you are not a soothsayer,\n" +
                    "nor mad.");
            ayat.add("30\n" +
                    "أَم يَقولونَ شاعِرٌ نَتَرَبَّصُ بِهِ رَيبَ المَنونِ\n" +
                    "TRANSLITERATION\n" +
                    "ʾam yaqūlūna shāʿirun natarabbaṣu bihī rayba l-manūni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Do they say, ‘[He is] a poet,\n" +
                    "for whom we await a fatal accident’?");
            ayat.add("31\n" +
                    "قُل تَرَبَّصوا فَإِنّي مَعَكُم مِنَ المُتَرَبِّصينَ\n" +
                    "TRANSLITERATION\n" +
                    "qul tarabbaṣū fa-ʾinnī maʿakum mina l-mutarabbiṣīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Say, ‘Wait!\n" +
                    "I too am waiting along with you.’\n");
            ayat.add("32\n" +
                    "أَم تَأمُرُهُم أَحلامُهُم بِهٰذا ۚ أَم هُم قَومٌ طاغونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾam taʿmuruhum ʾaḥlāmuhum bi-hādhā ʾam hum qawmun ṭāghūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Is it their intellect which prompts them\n" +
                    "to [say] this,\n" +
                    "or are they a rebellious lot?");
            ayat.add("33\n" +
                    "أَم يَقولونَ تَقَوَّلَهُ ۚ بَل لا يُؤمِنونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾam yaqūlūna taqawwalahū bal lā yuʾminūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Do they say, ‘He has improvised it [himself]?’\n" +
                    "Rather they have no faith!");
            ayat.add("34\n" +
                    "فَليَأتوا بِحَديثٍ مِثلِهِ إِن كانوا صادِقينَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-l-yaʾtū bi-ḥadīthin mithlihī ʾin kānū ṣādiqīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Let them bring a discourse like it,\n" +
                    "if they are truthful.");
            ayat.add("35\n" +
                    "أَم خُلِقوا مِن غَيرِ شَيءٍ أَم هُمُ الخالِقونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾam khuliqū min ghayri shayʾin ʾam humu l-khāliqūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Were they created from nothing?\n" +
                    "Or are they [their own] creators?");
            ayat.add("36\n" +
                    "أَم خَلَقُوا السَّماواتِ وَالأَرضَ ۚ بَل لا يوقِنونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾam khalaqū s-samāwāti wa-l-ʾarḍa bal lā yūqinūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Did they create the heavens and the earth?\n" +
                    "Rather they have no certainty!");
            ayat.add("37\n" +
                    "أَم عِندَهُم خَزائِنُ رَبِّكَ أَم هُمُ المُصَيطِرونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾam ʿindahum khazāʾinu rabbika ʾam humu l-muṣayṭirūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Do they possess the treasuries of your Lord?\n" +
                    "Or are they the controllers [of their dispensation]?");
            ayat.add("38\n" +
                    "أَم لَهُم سُلَّمٌ يَستَمِعونَ فيهِ ۖ فَليَأتِ مُستَمِعُهُم بِسُلطانٍ مُبينٍ\n" +
                    "TRANSLITERATION\n" +
                    "ʾam lahum sullamun yastamiʿūna fīhi fa-l-yaʾti mustamiʿuhum bi-sulṭānin mubīnin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Do they have a ladder [leading up to heaven]\n" +
                    "whereby they eavesdrop?1\n" +
                    "If so let their eavesdropper produce\n" +
                    "a manifest authority.");
            ayat.add("39\n" +
                    "أَم لَهُ البَناتُ وَلَكُمُ البَنونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾam lahu l-banātu wa-lakumu l-banūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Does He have daughters while you have sons?");
            ayat.add("40\n" +
                    "أَم تَسأَلُهُم أَجرًا فَهُم مِن مَغرَمٍ مُثقَلونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾam tasʾaluhum ʾajran fa-hum min maghramin muthqalūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Do you ask them for a reward,\n" +
                    "so that they are weighed down with debt?");
            ayat.add("41\n" +
                    "أَم عِندَهُمُ الغَيبُ فَهُم يَكتُبونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾam ʿindahumu l-ghaybu fa-hum yaktubūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Do they have [access to] the Unseen,\n" +
                    "which they write down?");
            ayat.add("42\n" +
                    "أَم يُريدونَ كَيدًا ۖ فَالَّذينَ كَفَروا هُمُ المَكيدونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾam yurīdūna kaydan fa-lladhīna kafarū humu l-makīdūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Do they seek to outmaneuver [Allah]?\n" +
                    "But it is the faithless\n" +
                    "who are the outmaneuvered ones!");
            ayat.add("43\n" +
                    "أَم لَهُم إِلٰهٌ غَيرُ اللَّهِ ۚ سُبحانَ اللَّهِ عَمّا يُشرِكونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾam lahum ʾilāhun ghayru llāhi subḥāna llāhi ʿammā yushrikūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Do they have any god other than Allah?\n" +
                    "Clear is Allah\n" +
                    "of any partners that they may ascribe [to Him]!");
            ayat.add("44\n" +
                    "وَإِن يَرَوا كِسفًا مِنَ السَّماءِ ساقِطًا يَقولوا سَحابٌ مَركومٌ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾin yaraw kisfan mina s-samāʾi sāqiṭan yaqūlū saḥābun markūmun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Were they to see\n" +
                    "a fragment falling from the sky,\n" +
                    "they would say, ‘A cumulous cloud.’");
            ayat.add("45\n" +
                    "فَذَرهُم حَتّىٰ يُلاقوا يَومَهُمُ الَّذي فيهِ يُصعَقونَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-dharhum ḥattā yulāqū yawmahumu lladhī fīhi yuṣʿaqūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So leave them until they encounter their day\n" +
                    "on which they will be thunderstruck;");
            ayat.add("46\n" +
                    "يَومَ لا يُغني عَنهُم كَيدُهُم شَيئًا وَلا هُم يُنصَرونَ\n" +
                    "TRANSLITERATION\n" +
                    "yawma lā yughnī ʿanhum kayduhum shayʾan wa-lā hum yunṣarūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "the day when their guile will not avail them\n" +
                    "in any way,\n" +
                    "nor will they be helped.");
            ayat.add("47\n" +
                    "وَإِنَّ لِلَّذينَ ظَلَموا عَذابًا دونَ ذٰلِكَ وَلٰكِنَّ أَكثَرَهُم لا يَعلَمونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾinna li-lladhīna ẓalamū ʿadhāban dūna dhālika wa-lākinna ʾaktharahum lā yaʿlamūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed for those who do wrong,\n" +
                    "there is a punishment besides that,\n" +
                    "but most of them do not know.");
            ayat.add("48\n" +
                    "وَاصبِر لِحُكمِ رَبِّكَ فَإِنَّكَ بِأَعيُنِنا ۖ وَسَبِّح بِحَمدِ رَبِّكَ حينَ تَقومُ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ṣbir li-ḥukmi rabbika fa-ʾinnaka bi-ʾaʿyuninā wa-sabbiḥ bi-ḥamdi rabbika ḥīna taqūmu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So submit patiently to the judgement of your Lord,\n" +
                    "for indeed you fare before Our eyes.\n" +
                    "And celebrate the praise of your Lord\n" +
                    "when you rise [at dawn],");
            ayat.add("49\n" +
                    "وَمِنَ اللَّيلِ فَسَبِّحهُ وَإِدبارَ النُّجومِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-mina l-layli fa-sabbiḥhu wa-ʾidbāra n-nujūmi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and also glorify Him during the night\n" +
                    "and at the receding of the stars.");
        }
        else if (surahName.equals("53. An-Najm"))
        {
            setTitle("An-Najm(النجم) : The Star");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "وَالنَّجمِ إِذا هَوىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-n-najmi ʾidhā hawā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "By the star when it sets:");
            ayat.add("2\n" +
                    "ما ضَلَّ صاحِبُكُم وَما غَوىٰ\n" +
                    "TRANSLITERATION\n" +
                    "mā ḍalla ṣāḥibukum wa-mā ghawā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "your companion1 has neither gone astray,\n" +
                    "nor gone amiss");
            ayat.add("3\n" +
                    "وَما يَنطِقُ عَنِ الهَوىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-mā yanṭiqu ʿani l-hawā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Nor does he speak out of [his own] desire:");
            ayat.add("4\n" +
                    "إِن هُوَ إِلّا وَحيٌ يوحىٰ\n" +
                    "TRANSLITERATION\n" +
                    "ʾin huwa ʾillā waḥyun yūḥā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "it is just a revelation that is revealed [to him],");
            ayat.add("5\n" +
                    "عَلَّمَهُ شَديدُ القُوىٰ\n" +
                    "TRANSLITERATION\n" +
                    "ʿallamahū shadīdu l-quwā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "taught him by One of great powers,");
            ayat.add("6\n" +
                    "ذو مِرَّةٍ فَاستَوىٰ\n" +
                    "TRANSLITERATION\n" +
                    "dhū mirratin fa-stawā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "possessed of sound judgement.\n" +
                    "He settled,");
            ayat.add("7\n" +
                    "وَهُوَ بِالأُفُقِ الأَعلىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-huwa bi-l-ʾufuqi l-ʾaʿlā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "while he was on the highest horizon.");
            ayat.add("8\n" +
                    "ثُمَّ دَنا فَتَدَلّىٰ\n" +
                    "TRANSLITERATION\n" +
                    "thumma danā fa-tadallā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Then he drew nearer and nearer");
            ayat.add("9\n" +
                    "فَكانَ قابَ قَوسَينِ أَو أَدنىٰ\n" +
                    "TRANSLITERATION\n" +
                    "fa-kāna qāba qawsayni ʾaw ʾadnā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "until he was within two bows’ length or even nearer,");
            ayat.add("10\n" +
                    "فَأَوحىٰ إِلىٰ عَبدِهِ ما أَوحىٰ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾawḥā ʾilā ʿabdihī mā ʾawḥā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "whereat He revealed to His servant\n" +
                    "whatever He revealed.");
            ayat.add("11\n" +
                    "ما كَذَبَ الفُؤادُ ما رَأىٰ\n" +
                    "TRANSLITERATION\n" +
                    "mā kadhaba l-fuʾādu mā raʾā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The heart did not deny what it saw");
            ayat.add("12\n" +
                    "أَفَتُمارونَهُ عَلىٰ ما يَرىٰ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-fa-tumārūnahū ʿalā mā yarā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Will you then dispute with him about what he saw?!");
            ayat.add("13\n" +
                    "وَلَقَد رَآهُ نَزلَةً أُخرىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-la-qad raʾāhu nazlatan ʾukhrā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Certainly he saw it1 yet another time,");
            ayat.add("14\n" +
                    "عِندَ سِدرَةِ المُنتَهىٰ\n" +
                    "TRANSLITERATION\n" +
                    "ʿinda sidrati l-muntahā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "by the Lote Tree of the Ultimate Boundary,");
            ayat.add("15\n" +
                    "عِندَها جَنَّةُ المَأوىٰ\n" +
                    "TRANSLITERATION\n" +
                    "ʿindahā jannatu l-maʾwā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "near which is the Garden of the Abode,");
            ayat.add("16\n" +
                    "إِذ يَغشَى السِّدرَةَ ما يَغشىٰ\n" +
                    "TRANSLITERATION\n" +
                    "ʾidh yaghshā s-sidrata mā yaghshā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "when there covered the Lote Tree what covered it.");
            ayat.add("17\n" +
                    "ما زاغَ البَصَرُ وَما طَغىٰ\n" +
                    "TRANSLITERATION\n" +
                    "mā zāgha l-baṣaru wa-mā ṭaghā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The gaze did not swerve,\n" +
                    "nor did it overstep the bounds.");
            ayat.add("18\n" +
                    "لَقَد رَأىٰ مِن آياتِ رَبِّهِ الكُبرىٰ\n" +
                    "TRANSLITERATION\n" +
                    "la-qad raʾā min ʾāyāti rabbihi l-kubrā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Certainly he saw\n" +
                    "some of the greatest signs of his Lord.");
            ayat.add("19\n" +
                    "أَفَرَأَيتُمُ اللّاتَ وَالعُزّىٰ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-fa-raʾaytumu l-lāta wa-l-ʿuzzā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Have you considered Lāt and ʿUzzā?");
            ayat.add("20\n" +
                    "وَمَناةَ الثّالِثَةَ الأُخرىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-manāta th-thālithata l-ʾukhrā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and Manāt, the third one?");
            ayat.add("21\n" +
                    "أَلَكُمُ الذَّكَرُ وَلَهُ الأُنثىٰ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-lakumu dh-dhakaru wa-lahu l-ʾunthā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Are you to have males and He females?");
            ayat.add("22\n" +
                    "تِلكَ إِذًا قِسمَةٌ ضيزىٰ\n" +
                    "TRANSLITERATION\n" +
                    "tilka ʾidhan qismatun ḍīzā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "That, then, will be an unfair division!");
            ayat.add("23\n" +
                    "إِن هِيَ إِلّا أَسماءٌ سَمَّيتُموها أَنتُم وَآباؤُكُم ما أَنزَلَ اللَّهُ بِها مِن سُلطانٍ ۚ إِن يَتَّبِعونَ إِلَّا الظَّنَّ وَما تَهوَى الأَنفُسُ ۖ وَلَقَد جاءَهُم مِن رَبِّهِمُ الهُدىٰ\n" +
                    "TRANSLITERATION\n" +
                    "ʾin hiya ʾillā ʾasmāʾun sammaytumūhā ʾantum wa-ʾābāʾukum mā ʾanzala llāhu bihā min sulṭānin ʾin yattabiʿūna ʾillā ẓ-ẓanna wa-mā tahwā l-ʾanfusu wa-la-qad jāʾahum min rabbihimu l-hudā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "These are but names which you have coined\n" +
                    "—you and your fathers—\n" +
                    "for which Allah has not sent down any authority.\n" +
                    "They follow nothing but conjectures\n" +
                    "and the desires of the [lower] soul,\n" +
                    "while there has already come to them\n" +
                    "the guidance from their Lord.");
            ayat.add("24\n" +
                    "أَم لِلإِنسانِ ما تَمَنّىٰ\n" +
                    "TRANSLITERATION\n" +
                    "ʾam li-l-ʾinsāni mā tamannā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Shall man have whatever he yearns for?");
            ayat.add("25\n" +
                    "فَلِلَّهِ الآخِرَةُ وَالأولىٰ\n" +
                    "TRANSLITERATION\n" +
                    "fa-li-llāhi l-ʾākhiratu wa-l-ʾūlā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Yet to Allah belong this world and the Hereafter.");
            ayat.add("26\n" +
                    "۞ وَكَم مِن مَلَكٍ فِي السَّماواتِ لا تُغني شَفاعَتُهُم شَيئًا إِلّا مِن بَعدِ أَن يَأذَنَ اللَّهُ لِمَن يَشاءُ وَيَرضىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-kam min malakin fī s-samāwāti lā tughnī shafāʿatuhum shayʾan ʾillā min baʿdi ʾan yaʾdhana llāhu li-man yashāʾu wa-yarḍā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "How many an angel there is in the heavens\n" +
                    "whose intercession is of no avail in any way\n" +
                    "except after Allah grants permission\n" +
                    "to whomever He wishes and approves of!");
            ayat.add("27\n" +
                    "إِنَّ الَّذينَ لا يُؤمِنونَ بِالآخِرَةِ لَيُسَمّونَ المَلائِكَةَ تَسمِيَةَ الأُنثىٰ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna lladhīna lā yuʾminūna bi-l-ʾākhirati la-yusammūna l-malāʾikata tasmiyata l-ʾunthā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed those who do not believe in the Hereafter\n" +
                    "give female names to the angels.");
            ayat.add("28\n" +
                    "وَما لَهُم بِهِ مِن عِلمٍ ۖ إِن يَتَّبِعونَ إِلَّا الظَّنَّ ۖ وَإِنَّ الظَّنَّ لا يُغني مِنَ الحَقِّ شَيئًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-mā lahum bihī min ʿilmin ʾin yattabiʿūna ʾillā ẓ-ẓanna wa-ʾinna ẓ-ẓanna lā yughnī mina l-ḥaqqi shayʾan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They do not have any knowledge of that.\n" +
                    "They follow nothing but conjectures,\n" +
                    "and indeed conjecture is no substitute for the truth.");
            ayat.add("29\n" +
                    "فَأَعرِض عَن مَن تَوَلّىٰ عَن ذِكرِنا وَلَم يُرِد إِلَّا الحَياةَ الدُّنيا\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾaʿriḍ ʿan man tawallā ʿan dhikrinā wa-lam yurid ʾillā l-ḥayāta d-dunyā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So avoid those who turn away from Our remembrance\n" +
                    "and desire nothing but the life of the world.");
            ayat.add("30\n" +
                    "ذٰلِكَ مَبلَغُهُم مِنَ العِلمِ ۚ إِنَّ رَبَّكَ هُوَ أَعلَمُ بِمَن ضَلَّ عَن سَبيلِهِ وَهُوَ أَعلَمُ بِمَنِ اهتَدىٰ\n" +
                    "TRANSLITERATION\n" +
                    "dhālika mablaghuhum mina l-ʿilmi ʾinna rabbaka huwa ʾaʿlamu bi-man ḍalla ʿan sabīlihī wa-huwa ʾaʿlamu bi-mani htadā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "That is the ultimate reach of their knowledge.\n" +
                    "Indeed your Lord knows best\n" +
                    "those who stray from His way,\n" +
                    "and He knows best those who are [rightly] guided.");
            ayat.add("31\n" +
                    "وَلِلَّهِ ما فِي السَّماواتِ وَما فِي الأَرضِ لِيَجزِيَ الَّذينَ أَساءوا بِما عَمِلوا وَيَجزِيَ الَّذينَ أَحسَنوا بِالحُسنَى\n" +
                    "TRANSLITERATION\n" +
                    "wa-li-llāhi mā fī s-samāwāti wa-mā fī l-ʾarḍi li-yajziya lladhīna ʾasāʾū bi-mā ʿamilū wa-yajziya lladhīna ʾaḥsanū bi-l-ḥusnā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "To Allah belongs whatever is in the heavens\n" +
                    "and whatever is in the earth,\n" +
                    "that He may requite those who do evil\n" +
                    "for what they have done,\n" +
                    "and reward those who do good\n" +
                    "with the best [of rewards].");
            ayat.add("32\n" +
                    "الَّذينَ يَجتَنِبونَ كَبائِرَ الإِثمِ وَالفَواحِشَ إِلَّا اللَّمَمَ ۚ إِنَّ رَبَّكَ واسِعُ المَغفِرَةِ ۚ هُوَ أَعلَمُ بِكُم إِذ أَنشَأَكُم مِنَ الأَرضِ وَإِذ أَنتُم أَجِنَّةٌ في بُطونِ أُمَّهاتِكُم ۖ فَلا تُزَكّوا أَنفُسَكُم ۖ هُوَ أَعلَمُ بِمَنِ اتَّقىٰ\n" +
                    "TRANSLITERATION\n" +
                    "alladhīna yajtanibūna kabāʾira l-ʾithmi wa-l-fawāḥisha ʾillā l-lamama ʾinna rabbaka wāsiʿu l-maghfirati huwa ʾaʿlamu bikum ʾidh ʾanshaʾakum mina l-ʾarḍi wa-ʾidh ʾantum ʾajinnatun fī buṭūni ʾummahātikum fa-lā tuzakkū ʾanfusakum huwa ʾaʿlamu bi-mani ttaqā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Those who avoid major sins\n" +
                    "and indecencies,\n" +
                    "excepting [minor and occasional] lapses.\n" +
                    "Indeed your Lord is expansive in [His] forgiveness.\n" +
                    "He knows you best\n" +
                    "since [the time] He produced you from the earth,\n" +
                    "and since you were fetuses\n" +
                    "in the bellies of your mothers.\n" +
                    "So do not flaunt your piety:\n" +
                    "He knows best those who are Godwary.");
            ayat.add("33\n" +
                    "أَفَرَأَيتَ الَّذي تَوَلّىٰ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-fa-raʾayta lladhī tawallā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Did you see him who turned away,");
            ayat.add("34\n" +
                    "وَأَعطىٰ قَليلًا وَأَكدىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾaʿṭā qalīlan wa-ʾakdā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "gave a little and held off?");
            ayat.add("35\n" +
                    "أَعِندَهُ عِلمُ الغَيبِ فَهُوَ يَرىٰ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-ʿindahū ʿilmu l-ghaybi fa-huwa yarā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Does he have the knowledge of the Unseen\n" +
                    "so that he sees?");
            ayat.add("36\n" +
                    "أَم لَم يُنَبَّأ بِما في صُحُفِ موسىٰ\n" +
                    "TRANSLITERATION\n" +
                    "ʾam lam yunabbaʾ bi-mā fī ṣuḥufi mūsā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Has he not been informed of what is\n" +
                    "in the scriptures of Moses,");
            ayat.add("37\n" +
                    "وَإِبراهيمَ الَّذي وَفّىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾibrāhīma lladhī waffā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and of Abraham, who fulfilled [his summons]:");
            ayat.add("38\n" +
                    "أَلّا تَزِرُ وازِرَةٌ وِزرَ أُخرىٰ\n" +
                    "TRANSLITERATION\n" +
                    "ʾallā taziru wāziratun wizra ʾukhrā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "that no bearer shall bear another’s burden,");
            ayat.add("39\n" +
                    "وَأَن لَيسَ لِلإِنسانِ إِلّا ما سَعىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾan laysa li-l-ʾinsāni ʾillā mā saʿā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and that nothing belongs to man\n" +
                    "except what he strives for,");
            ayat.add("40\n" +
                    "وَأَنَّ سَعيَهُ سَوفَ يُرىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾanna saʿyahū sawfa yurā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and that he will soon be shown his endeavour,");
            ayat.add("41\n" +
                    "ثُمَّ يُجزاهُ الجَزاءَ الأَوفىٰ\n" +
                    "TRANSLITERATION\n" +
                    "thumma yujzāhu l-jazāʾa l-ʾawfā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "then he will be rewarded for it\n" +
                    "with the fullest reward;");
            ayat.add("42\n" +
                    "وَأَنَّ إِلىٰ رَبِّكَ المُنتَهىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾanna ʾilā rabbika l-muntahā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and that the terminus is toward your Lord,");
            ayat.add("43\n" +
                    "وَأَنَّهُ هُوَ أَضحَكَ وَأَبكىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾannahū huwa ʾaḍḥaka wa-ʾabkā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and that it is He who makes [men] laugh,\n" +
                    "and makes [them] weep,");
            ayat.add("44\n" +
                    "وَأَنَّهُ هُوَ أَماتَ وَأَحيا\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾannahū huwa ʾamāta wa-ʾaḥyā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and that it is He who brings death and gives life,");
            ayat.add("45\n" +
                    "وَأَنَّهُ خَلَقَ الزَّوجَينِ الذَّكَرَ وَالأُنثىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾannahū khalaqa z-zawjayni dh-dhakara wa-l-ʾunthā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and that it is He who created the mates,\n" +
                    "the male and the female,");
            ayat.add("46\n" +
                    "مِن نُطفَةٍ إِذا تُمنىٰ\n" +
                    "TRANSLITERATION\n" +
                    "min nuṭfatin ʾidhā tumnā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "from a drop of [seminal] fluid when emitted;");
            ayat.add("47\n" +
                    "وَأَنَّ عَلَيهِ النَّشأَةَ الأُخرىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾanna ʿalayhi n-nashʾata l-ʾukhrā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and that with Him lies the second genesis,");
            ayat.add("48\n" +
                    "وَأَنَّهُ هُوَ أَغنىٰ وَأَقنىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾannahū huwa ʾaghnā wa-ʾaqnā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and that it is He who enriches and grants possessions,");
            ayat.add("49\n" +
                    "وَأَنَّهُ هُوَ رَبُّ الشِّعرىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾannahū huwa rabbu sh-shiʿrā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and that it is He who is the Lord of Sirius;");
            ayat.add("50\n" +
                    "وَأَنَّهُ أَهلَكَ عادًا الأولىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾannahū ʾahlaka ʿādan-i l-ʾūlā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and that it is He who destroyed the former ʿĀd,");
            ayat.add("51\n" +
                    "وَثَمودَ فَما أَبقىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-thamūda fa-mā ʾabqā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and Thamud,\n" +
                    "sparing none [of them];");
            ayat.add("52\n" +
                    "وَقَومَ نوحٍ مِن قَبلُ ۖ إِنَّهُم كانوا هُم أَظلَمَ وَأَطغىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-qawma nūḥin min qablu ʾinnahum kānū hum ʾaẓlama wa-ʾaṭghā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and the people of Noah before that;\n" +
                    "indeed they were more unjust and rebellious;");
            ayat.add("53\n" +
                    "وَالمُؤتَفِكَةَ أَهوىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-l-muʾtafikata ʾahwā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and He overthrew the town that was overturned");
            ayat.add("54\n" +
                    "فَغَشّاها ما غَشّىٰ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ghashshāhā mā ghashshā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "covering it with what covered it.");
            ayat.add("55\n" +
                    "فَبِأَيِّ آلاءِ رَبِّكَ تَتَمارىٰ\n" +
                    "TRANSLITERATION\n" +
                    "fa-bi-ʾayyi ʾālāʾi rabbika tatamārā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Then which of the bounties of your Lord\n" +
                    "will you dispute?");
            ayat.add("56\n" +
                    "هٰذا نَذيرٌ مِنَ النُّذُرِ الأولىٰ\n" +
                    "TRANSLITERATION\n" +
                    "hādhā nadhīrun mina n-nudhuri l-ʾūlā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "This is a warner,\n" +
                    "[in the tradition] of the warners of old.");
            ayat.add("57\n" +
                    "أَزِفَتِ الآزِفَةُ\n" +
                    "TRANSLITERATION\n" +
                    "ʾazifati l-ʾāzifatu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The Imminent [Hour] is near at hand.");
            ayat.add("58\n" +
                    "لَيسَ لَها مِن دونِ اللَّهِ كاشِفَةٌ\n" +
                    "TRANSLITERATION\n" +
                    "laysa lahā min dūni llāhi kāshifatun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "There is none that may unveil it besides Allah.");
            ayat.add("59\n" +
                    "أَفَمِن هٰذَا الحَديثِ تَعجَبونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-fa-min hādhā l-ḥadīthi taʿjabūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Do you then wonder at this discourse,");
            ayat.add("60\n" +
                    "وَتَضحَكونَ وَلا تَبكونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-taḍḥakūna wa-lā tabkūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and laugh and not weep,");
            ayat.add("61\n" +
                    "وَأَنتُم سامِدونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾantum sāmidūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "while you remain heedless?!");
            ayat.add("62\n" +
                    "فَاسجُدوا لِلَّهِ وَاعبُدوا ۩\n" +
                    "TRANSLITERATION\n" +
                    "fa-sjudū li-llāhi wa-ʿbudū\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So prostrate yourselves to Allah and worship Him!");
        }
        else if (surahName.equals("54. Al-Qamar"))
        {
            setTitle("Al-Qamar(القمر) : The Moon");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "اقتَرَبَتِ السّاعَةُ وَانشَقَّ القَمَرُ\n" +
                    "TRANSLITERATION\n" +
                    "iqtarabati s-sāʿatu wa-nshaqqa l-qamaru\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The Hour has drawn near\n" +
                    "and the moon is split.");
            ayat.add("2\n" +
                    "وَإِن يَرَوا آيَةً يُعرِضوا وَيَقولوا سِحرٌ مُستَمِرٌّ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾin yaraw ʾāyatan yuʿriḍū wa-yaqūlū siḥrun mustamirrun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "If they see a sign, they turn away,\n" +
                    "and say, ‘An incessant1 magic!’");
            ayat.add("3\n" +
                    "وَكَذَّبوا وَاتَّبَعوا أَهواءَهُم ۚ وَكُلُّ أَمرٍ مُستَقِرٌّ\n" +
                    "TRANSLITERATION\n" +
                    "wa-kadhdhabū wa-ttabaʿū ʾahwāʾahum wa-kullu ʾamrin mustaqirrun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They denied, and followed their own desires,\n" +
                    "and every matter has a setting [appropriate to it].");
            ayat.add("4\n" +
                    "وَلَقَد جاءَهُم مِنَ الأَنباءِ ما فيهِ مُزدَجَرٌ\n" +
                    "TRANSLITERATION\n" +
                    "wa-la-qad jāʾahum mina l-ʾanbāʾi mā fīhi muzdajarun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "There have already come to them reports\n" +
                    "containing admonishment,");
            ayat.add("5\n" +
                    "حِكمَةٌ بالِغَةٌ ۖ فَما تُغنِ النُّذُرُ\n" +
                    "TRANSLITERATION\n" +
                    "ḥikmatun bālighatun fa-mā tughni n-nudhuru\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "[and representing] far-reaching wisdom;\n" +
                    "but warnings are of no avail!");
            ayat.add("6\n" +
                    "فَتَوَلَّ عَنهُم ۘ يَومَ يَدعُ الدّاعِ إِلىٰ شَيءٍ نُكُرٍ\n" +
                    "TRANSLITERATION\n" +
                    "fa-tawalla ʿanhum yawma yadʿu d-dāʿi ʾilā shayʾin nukurin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So turn away from them!\n" +
                    "The day when the Caller calls to a dire thing,");
            ayat.add("7\n" +
                    "خُشَّعًا أَبصارُهُم يَخرُجونَ مِنَ الأَجداثِ كَأَنَّهُم جَرادٌ مُنتَشِرٌ\n" +
                    "TRANSLITERATION\n" +
                    "khushshaʿan ʾabṣāruhum yakhrujūna mina l-ʾajdāthi ka-ʾannahum jarādun muntashirun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "with a humbled look [in their eyes],\n" +
                    "they will emerge from the graves\n" +
                    "as if they were scattered locusts,");
            ayat.add("8\n" +
                    "مُهطِعينَ إِلَى الدّاعِ ۖ يَقولُ الكافِرونَ هٰذا يَومٌ عَسِرٌ\n" +
                    "TRANSLITERATION\n" +
                    "muhṭiʿīna ʾilā d-dāʿi yaqūlu l-kāfirūna hādhā yawmun ʿasirun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "scrambling toward the summoner.\n" +
                    "The faithless will say, ‘This is a hard day!’");
            ayat.add("9\n" +
                    "۞ كَذَّبَت قَبلَهُم قَومُ نوحٍ فَكَذَّبوا عَبدَنا وَقالوا مَجنونٌ وَازدُجِرَ\n" +
                    "TRANSLITERATION\n" +
                    "kadhdhabat qablahum qawmu nūḥin fa-kadhdhabū ʿabdanā wa-qālū majnūnun wa-zdujira\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The people of Noah impugned before them.\n" +
                    "So they impugned Our servant and said,\n" +
                    "‘A crazy man,’ and he was reviled.");
            ayat.add("10\n" +
                    "فَدَعا رَبَّهُ أَنّي مَغلوبٌ فَانتَصِر\n" +
                    "TRANSLITERATION\n" +
                    "fa-daʿā rabbahū ʾannī maghlūbun fa-ntaṣir\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Thereat he invoked his Lord,\n" +
                    "[saying,] ‘I have been overcome, so help [me].’");
            ayat.add("11\n" +
                    "فَفَتَحنا أَبوابَ السَّماءِ بِماءٍ مُنهَمِرٍ\n" +
                    "TRANSLITERATION\n" +
                    "fa-fataḥnā ʾabwāba s-samāʾi bi-māʾin munhamirin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Then We opened the gates of the sky\n" +
                    "with pouring waters,");
            ayat.add("12\n" +
                    "وَفَجَّرنَا الأَرضَ عُيونًا فَالتَقَى الماءُ عَلىٰ أَمرٍ قَد قُدِرَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-fajjarnā l-ʾarḍa ʿuyūnan fa-ltaqā l-māʾu ʿalā ʾamrin qad qudira\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and We made the earth burst forth with springs,\n" +
                    "and the waters met for a preordained purpose.");
            ayat.add("13\n" +
                    "وَحَمَلناهُ عَلىٰ ذاتِ أَلواحٍ وَدُسُرٍ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ḥamalnāhu ʿalā dhāti ʾalwāḥin wa-dusurin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "We bore him\n" +
                    "on a vessel made of planks and nails,");
            ayat.add("14\n" +
                    "تَجري بِأَعيُنِنا جَزاءً لِمَن كانَ كُفِرَ\n" +
                    "TRANSLITERATION\n" +
                    "tajrī bi-ʾaʿyuninā jazāʾan li-man kāna kufira\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "which sailed [over the flood waters] in Our sight,\n" +
                    "as a retribution for him who was repudiated.");
            ayat.add("15\n" +
                    "وَلَقَد تَرَكناها آيَةً فَهَل مِن مُدَّكِرٍ\n" +
                    "TRANSLITERATION\n" +
                    "wa-la-qad taraknāhā ʾāyatan fa-hal min muddakirin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Certainly We have left it as a sign;\n" +
                    "so is there anyone who will be admonished?");
            ayat.add("16\n" +
                    "فَكَيفَ كانَ عَذابي وَنُذُرِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-kayfa kāna ʿadhābī wa-nudhuri\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So how were My punishment and My warnings?");
            ayat.add("17\n" +
                    "وَلَقَد يَسَّرنَا القُرآنَ لِلذِّكرِ فَهَل مِن مُدَّكِرٍ\n" +
                    "TRANSLITERATION\n" +
                    "wa-la-qad yassarnā l-qurʾāna li-dh-dhikri fa-hal min muddakirin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Certainly We have made the Qurʾān simple\n" +
                    "for the sake of admonishment.\n" +
                    "So is there anyone who will be admonished?");
            ayat.add("18\n" +
                    "كَذَّبَت عادٌ فَكَيفَ كانَ عَذابي وَنُذُرِ\n" +
                    "TRANSLITERATION\n" +
                    "kadhdhabat ʿādun fa-kayfa kāna ʿadhābī wa-nudhuri\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "[The people of] ʿĀd impugned [their apostle].\n" +
                    "So how were My punishment and My warnings?");
            ayat.add("19\n" +
                    "إِنّا أَرسَلنا عَلَيهِم ريحًا صَرصَرًا في يَومِ نَحسٍ مُستَمِرٍّ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnā ʾarsalnā ʿalayhim rīḥan ṣarṣaran fī yawmi naḥsin mustamirrin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed We unleashed upon them an icy gale\n" +
                    "on an incessantly ill-fated day,\n");
            ayat.add("20\n" +
                    "تَنزِعُ النّاسَ كَأَنَّهُم أَعجازُ نَخلٍ مُنقَعِرٍ\n" +
                    "TRANSLITERATION\n" +
                    "tanziʿu n-nāsa ka-ʾannahum ʾaʿjāzu nakhlin munqaʿirin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "knocking down people\n" +
                    "as if they were trunks of uprooted palm trees.");
            ayat.add("21\n" +
                    "فَكَيفَ كانَ عَذابي وَنُذُرِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-kayfa kāna ʿadhābī wa-nudhuri\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So how were My punishment and My warnings?!");
            ayat.add("22\n" +
                    "وَلَقَد يَسَّرنَا القُرآنَ لِلذِّكرِ فَهَل مِن مُدَّكِرٍ\n" +
                    "TRANSLITERATION\n" +
                    "wa-la-qad yassarnā l-qurʾāna li-dh-dhikri fa-hal min muddakirin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Certainly We have made the Qurʾān simple\n" +
                    "for the sake of admonishment.\n" +
                    "So is there anyone who will be admonished?");
            ayat.add("23\n" +
                    "كَذَّبَت ثَمودُ بِالنُّذُرِ\n" +
                    "TRANSLITERATION\n" +
                    "kadhdhabat thamūdu bi-n-nudhuri\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "[The people of] Thamūd denied the warnings");
            ayat.add("24\n" +
                    "فَقالوا أَبَشَرًا مِنّا واحِدًا نَتَّبِعُهُ إِنّا إِذًا لَفي ضَلالٍ وَسُعُرٍ\n" +
                    "TRANSLITERATION\n" +
                    "fa-qālū ʾa-basharan minnā wāḥidan nattabiʿuhū ʾinnā ʾidhan la-fī ḍalālin wa-suʿurin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and they said,\n" +
                    "‘Are we to follow a lone human from ourselves?!\n" +
                    "Indeed then we would be in error and madness.’");
            ayat.add("25\n" +
                    "أَأُلقِيَ الذِّكرُ عَلَيهِ مِن بَينِنا بَل هُوَ كَذّابٌ أَشِرٌ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-ʾulqiya dh-dhikru ʿalayhi min bayninā bal huwa kadhdhābun ʾashirun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "‘Has the Reminder been cast upon him\n" +
                    "from among us?\n" +
                    "Rather he is a self-conceited1 liar.’");
            ayat.add("26\n" +
                    "سَيَعلَمونَ غَدًا مَنِ الكَذّابُ الأَشِرُ\n" +
                    "TRANSLITERATION\n" +
                    "sa-yaʿlamūna ghadan mani l-kadhdhābu l-ʾashiru\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "‘Tomorrow they will know\n" +
                    "who is a self-conceited liar.");
            ayat.add("27\n" +
                    "إِنّا مُرسِلُو النّاقَةِ فِتنَةً لَهُم فَارتَقِبهُم وَاصطَبِر\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnā mursilū n-nāqati fitnatan lahum fa-rtaqibhum wa-ṣṭabir\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "We are sending the She-camel\n" +
                    "as a trial for them;\n" +
                    "so watch them and be steadfast.");
            ayat.add("28\n" +
                    "وَنَبِّئهُم أَنَّ الماءَ قِسمَةٌ بَينَهُم ۖ كُلُّ شِربٍ مُحتَضَرٌ\n" +
                    "TRANSLITERATION\n" +
                    "wa-nabbiʾhum ʾanna l-māʾa qismatun baynahum kullu shirbin muḥtaḍarun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Inform them\n" +
                    "that the water is to be dispensed between them;\n" +
                    "every drinking will be attended.’");
            ayat.add("29\n" +
                    "فَنادَوا صاحِبَهُم فَتَعاطىٰ فَعَقَرَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-nādaw ṣāḥibahum fa-taʿāṭā fa-ʿaqara\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "But they called their companion,\n" +
                    "and he took [a knife] and hamstrung [her].");
            ayat.add("30\n" +
                    "فَكَيفَ كانَ عَذابي وَنُذُرِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-kayfa kāna ʿadhābī wa-nudhuri\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So how were My punishment and My warnings?!");
            ayat.add("31\n" +
                    "إِنّا أَرسَلنا عَلَيهِم صَيحَةً واحِدَةً فَكانوا كَهَشيمِ المُحتَظِرِ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnā ʾarsalnā ʿalayhim ṣayḥatan wāḥidatan fa-kānū ka-hashīmi l-muḥtaẓiri\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "We sent against them a single Cry,\n" +
                    "and they became like the dry sticks of a corral builder.");
            ayat.add("32\n" +
                    "وَلَقَد يَسَّرنَا القُرآنَ لِلذِّكرِ فَهَل مِن مُدَّكِرٍ\n" +
                    "TRANSLITERATION\n" +
                    "wa-la-qad yassarnā l-qurʾāna li-dh-dhikri fa-hal min muddakirin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Certainly We have made the Qurʾān simple\n" +
                    "for the sake of admonishment.\n" +
                    "So is there anyone who will be admonished?");
            ayat.add("33\n" +
                    "كَذَّبَت قَومُ لوطٍ بِالنُّذُرِ\n" +
                    "TRANSLITERATION\n" +
                    "kadhdhabat qawmu lūṭin bi-n-nudhuri\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And the people of Lot denied the warnings.");
            ayat.add("34\n" +
                    "إِنّا أَرسَلنا عَلَيهِم حاصِبًا إِلّا آلَ لوطٍ ۖ نَجَّيناهُم بِسَحَرٍ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnā ʾarsalnā ʿalayhim ḥāṣiban ʾillā ʾāla lūṭin najjaynāhum bi-saḥarin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "We unleashed a rain of stones upon them,\n" +
                    "excepting the family of Lot,\n" +
                    "whom We delivered at dawn,");
            ayat.add("35\n" +
                    "نِعمَةً مِن عِندِنا ۚ كَذٰلِكَ نَجزي مَن شَكَرَ\n" +
                    "TRANSLITERATION\n" +
                    "niʿmatan min ʿindinā ka-dhālika najzī man shakara\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "as a blessing from Us.\n" +
                    "Thus do We reward those who give thanks.");
            ayat.add("36\n" +
                    "وَلَقَد أَنذَرَهُم بَطشَتَنا فَتَمارَوا بِالنُّذُرِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-la-qad ʾandharahum baṭshatanā fa-tamāraw bi-n-nudhuri\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "He had certainly warned them of Our punishment,\n" +
                    "but they disputed the warnings.");
            ayat.add("37\n" +
                    "وَلَقَد راوَدوهُ عَن ضَيفِهِ فَطَمَسنا أَعيُنَهُم فَذوقوا عَذابي وَنُذُرِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-la-qad rāwadūhu ʿan ḍayfihī fa-ṭamasnā ʾaʿyunahum fa-dhūqū ʿadhābī wa-nudhuri\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Certainly they even solicited of him his guests,\n" +
                    "whereat We blotted out their eyes, [saying,]\n" +
                    "‘Taste My punishment and My warnings!’");
            ayat.add("38\n" +
                    "وَلَقَد صَبَّحَهُم بُكرَةً عَذابٌ مُستَقِرٌّ\n" +
                    "TRANSLITERATION\n" +
                    "wa-la-qad ṣabbaḥahum bukratan ʿadhābun mustaqirrun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Certainly early at dawn there visited them\n" +
                    "an abiding punishment:");
            ayat.add("39\n" +
                    "فَذوقوا عَذابي وَنُذُرِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-dhūqū ʿadhābī wa-nudhuri\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "‘Taste My punishment and My warnings!’");
            ayat.add("40\n" +
                    "وَلَقَد يَسَّرنَا القُرآنَ لِلذِّكرِ فَهَل مِن مُدَّكِرٍ\n" +
                    "TRANSLITERATION\n" +
                    "wa-la-qad yassarnā l-qurʾāna li-dh-dhikri fa-hal min muddakirin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Certainly We have made the Qurʾān simple\n" +
                    "for the sake of admonishment.\n" +
                    "So is there anyone who will be admonished?");
            ayat.add("41\n" +
                    "وَلَقَد جاءَ آلَ فِرعَونَ النُّذُرُ\n" +
                    "TRANSLITERATION\n" +
                    "wa-la-qad jāʾa ʾāla firʿawna n-nudhuru\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Certainly the warnings came to Pharaoh’s clan40\n" +
                    "وَلَقَد يَسَّرنَا القُرآنَ لِلذِّكرِ فَهَل مِن مُدَّكِرٍ\n" +
                    "TRANSLITERATION\n" +
                    "wa-la-qad yassarnā l-qurʾāna li-dh-dhikri fa-hal min muddakirin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Certainly We have made the Qurʾān simple\n" +
                    "for the sake of admonishment.\n" +
                    "So is there anyone who will be admonished?");
            ayat.add("42\n" +
                    "كَذَّبوا بِآياتِنا كُلِّها فَأَخَذناهُم أَخذَ عَزيزٍ مُقتَدِرٍ\n" +
                    "TRANSLITERATION\n" +
                    "kadhdhabū bi-ʾāyātinā kullihā fa-ʾakhadhnāhum ʾakhdha ʿazīzin muqtadirin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "who denied all of Our signs.\n" +
                    "So We seized them with the seizing\n" +
                    "of One [who is] all-mighty, Omnipotent.");
            ayat.add("43\n" +
                    "أَكُفّارُكُم خَيرٌ مِن أُولٰئِكُم أَم لَكُم بَراءَةٌ فِي الزُّبُرِ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-kuffārukum khayrun min ʾulāʾikum ʾam lakum barāʾatun fī z-zuburi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Are your faithless better than those,\n" +
                    "or have you [been granted] some immunity\n" +
                    "in the scriptures?");
            ayat.add("44\n" +
                    "أَم يَقولونَ نَحنُ جَميعٌ مُنتَصِرٌ\n" +
                    "TRANSLITERATION\n" +
                    "ʾam yaqūlūna naḥnu jamīʿun muntaṣirun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Do they say, ‘We are a confederate league’?");
            ayat.add("45\n" +
                    "سَيُهزَمُ الجَمعُ وَيُوَلّونَ الدُّبُرَ\n" +
                    "TRANSLITERATION\n" +
                    "sa-yuhzamu l-jamʿu wa-yuwallūna d-dubura\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The league will be routed\n" +
                    "and turn its back [to flee].");
            ayat.add("46\n" +
                    "بَلِ السّاعَةُ مَوعِدُهُم وَالسّاعَةُ أَدهىٰ وَأَمَرُّ\n" +
                    "TRANSLITERATION\n" +
                    "bali s-sāʿatu mawʿiduhum wa-s-sāʿatu ʾadhā wa-ʾamarru\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Rather the Hour is their tryst;\n" +
                    "and the Hour will be most calamitous and bitter.");
            ayat.add("47\n" +
                    "إِنَّ المُجرِمينَ في ضَلالٍ وَسُعُرٍ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna l-mujrimīna fī ḍalālin wa-suʿurin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed the guilty are in error and madness.");
            ayat.add("48\n" +
                    "يَومَ يُسحَبونَ فِي النّارِ عَلىٰ وُجوهِهِم ذوقوا مَسَّ سَقَرَ\n" +
                    "TRANSLITERATION\n" +
                    "yawma yusḥabūna fī n-nāri ʿalā wujūhihim dhūqū massa saqara\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The day when they are dragged into the Fire\n" +
                    "on their faces,\n" +
                    "[it will be said to them,] ‘Taste the touch of hell!’");
            ayat.add("49\n" +
                    "إِنّا كُلَّ شَيءٍ خَلَقناهُ بِقَدَرٍ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnā kulla shayʾin khalaqnāhu bi-qadarin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed We have created everything in a measure,");
            ayat.add("50\n" +
                    "وَما أَمرُنا إِلّا واحِدَةٌ كَلَمحٍ بِالبَصَرِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-mā ʾamrunā ʾillā wāḥidatun ka-lamḥin bi-l-baṣari\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and Our command is but a single [word],\n" +
                    "like the twinkling of an eye.");
            ayat.add("51\n" +
                    "وَلَقَد أَهلَكنا أَشياعَكُم فَهَل مِن مُدَّكِرٍ\n" +
                    "TRANSLITERATION\n" +
                    "wa-la-qad ʾahlaknā ʾashyāʿakum fa-hal min muddakirin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Certainly We have destroyed your likes.\n" +
                    "So is there anyone who will be admonished?");
            ayat.add("52\n" +
                    "وَكُلُّ شَيءٍ فَعَلوهُ فِي الزُّبُرِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-kullu shayʾin faʿalūhu fī z-zuburi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Everything they have done is in the books,");
            ayat.add("53\n" +
                    "وَكُلُّ صَغيرٍ وَكَبيرٍ مُستَطَرٌ\n" +
                    "TRANSLITERATION\n" +
                    "wa-kullu ṣaghīrin wa-kabīrin mustaṭarun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and everything big and small,\n" +
                    "is committed to writing.");
            ayat.add("54\n" +
                    "إِنَّ المُتَّقينَ في جَنّاتٍ وَنَهَرٍ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna l-muttaqīna fī jannātin wa-naharin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed the Godwary\n" +
                    "will be amid gardens and streams,");
            ayat.add("55\n" +
                    "في مَقعَدِ صِدقٍ عِندَ مَليكٍ مُقتَدِرٍ\n" +
                    "TRANSLITERATION\n" +
                    "fī maqʿadi ṣidqin ʿinda malīkin muqtadirin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "in the abode of truthfulness\n" +
                    "with an omnipotent King.");
        }
        else if (surahName.equals("55. Ar-Rahman"))
        {
            setTitle("Ar-Rahman(الرحمن) : The All-Beneficent");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "الرَّحمٰنُ\n" +
                    "TRANSLITERATION\n" +
                    "ar-raḥmānu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The All-beneficent");
            ayat.add("2\n" +
                    "عَلَّمَ القُرآنَ\n" +
                    "TRANSLITERATION\n" +
                    "ʿallama l-qurʾāna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "has taught the Qurʾān.");
            ayat.add("3\n" +
                    "خَلَقَ الإِنسانَ\n" +
                    "TRANSLITERATION\n" +
                    "khalaqa l-ʾinsāna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "He created man,");
            ayat.add("4\n" +
                    "عَلَّمَهُ البَيانَ\n" +
                    "TRANSLITERATION\n" +
                    "ʿallamahu l-bayāna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "[and] taught him articulate speech.");
            ayat.add("5\n" +
                    "الشَّمسُ وَالقَمَرُ بِحُسبانٍ\n" +
                    "TRANSLITERATION\n" +
                    "ash-shamsu wa-l-qamaru bi-ḥusbānin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The sun and the moon are [disposed] calculatedly,");
            ayat.add("6\n" +
                    "وَالنَّجمُ وَالشَّجَرُ يَسجُدانِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-n-najmu wa-sh-shajaru yasjudāni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and the herb and the tree prostrate [to Allah].");
            ayat.add("7\n" +
                    "وَالسَّماءَ رَفَعَها وَوَضَعَ الميزانَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-s-samāʾa rafaʿahā wa-waḍaʿa l-mīzāna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "He raised the sky and set up the balance,");
            ayat.add("8\n" +
                    "أَلّا تَطغَوا فِي الميزانِ\n" +
                    "TRANSLITERATION\n" +
                    "ʾallā taṭghaw fī l-mīzāni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "declaring, ‘Do not infringe the balance!");
            ayat.add("9\n" +
                    "وَأَقيمُوا الوَزنَ بِالقِسطِ وَلا تُخسِرُوا الميزانَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾaqīmū l-wazna bi-l-qisṭi wa-lā tukhsirū l-mīzāna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Maintain the weights with justice,\n" +
                    "and do not shorten the balance!’");
            ayat.add("10\n" +
                    "وَالأَرضَ وَضَعَها لِلأَنامِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-l-ʾarḍa waḍaʿahā li-l-ʾanāmi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And the earth, He laid it out for mankind.");
            ayat.add("11\n" +
                    "فيها فاكِهَةٌ وَالنَّخلُ ذاتُ الأَكمامِ\n" +
                    "TRANSLITERATION\n" +
                    "fīhā fākihatun wa-n-nakhlu dhātu l-ʾakmāmi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "In it are fruits and date-palms with sheaths,");
            ayat.add("12\n" +
                    "وَالحَبُّ ذُو العَصفِ وَالرَّيحانُ\n" +
                    "TRANSLITERATION\n" +
                    "wa-l-ḥabbu dhū l-ʿaṣfi wa-r-rayḥānu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "grain with husk, and fragrant herbs.");
            ayat.add("13\n" +
                    "فَبِأَيِّ آلاءِ رَبِّكُما تُكَذِّبانِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-bi-ʾayyi ʾālāʾi rabbikumā tukadhdhibāni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So which of your Lord’s bounties\n" +
                    "will you both1 deny?");
            ayat.add("14\n" +
                    "خَلَقَ الإِنسانَ مِن صَلصالٍ كَالفَخّارِ\n" +
                    "TRANSLITERATION\n" +
                    "khalaqa l-ʾinsāna min ṣalṣālin ka-l-fakhkhāri\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "He created man\n" +
                    "out of dry clay,1 like the potter’s,");
            ayat.add("15\n" +
                    "وَخَلَقَ الجانَّ مِن مارِجٍ مِن نارٍ\n" +
                    "TRANSLITERATION\n" +
                    "wa-khalaqa l-jānna min mārijin min nārin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and created the jinn out of a flame of a fire.");
            ayat.add("16\n" +
                    "فَبِأَيِّ آلاءِ رَبِّكُما تُكَذِّبانِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-bi-ʾayyi ʾālāʾi rabbikumā tukadhdhibāni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So which of your Lord’s bounties\n" +
                    "will you both deny?");
            ayat.add("17\n" +
                    "رَبُّ المَشرِقَينِ وَرَبُّ المَغرِبَينِ\n" +
                    "TRANSLITERATION\n" +
                    "rabbu l-mashriqayni wa-rabbu l-maghribayni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Lord of the two easts,\n" +
                    "and Lord of the two wests!");
            ayat.add("18\n" +
                    "فَبِأَيِّ آلاءِ رَبِّكُما تُكَذِّبانِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-bi-ʾayyi ʾālāʾi rabbikumā tukadhdhibāni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So which of your Lord’s bounties\n" +
                    "will you both deny?");
            ayat.add("19\n" +
                    "مَرَجَ البَحرَينِ يَلتَقِيانِ\n" +
                    "TRANSLITERATION\n" +
                    "maraja l-baḥrayni yaltaqiyāni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "He merged the two seas, meeting each other.");
            ayat.add("20\n" +
                    "بَينَهُما بَرزَخٌ لا يَبغِيانِ\n" +
                    "TRANSLITERATION\n" +
                    "baynahumā barzakhun lā yabghiyāni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "There is a barrier between them\n" +
                    "which they do not overstep.");
            ayat.add("21\n" +
                    "فَبِأَيِّ آلاءِ رَبِّكُما تُكَذِّبانِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-bi-ʾayyi ʾālāʾi rabbikumā tukadhdhibāni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So which of your Lord’s bounties\n" +
                    "will you both deny?");
            ayat.add("22\n" +
                    "يَخرُجُ مِنهُمَا اللُّؤلُؤُ وَالمَرجانُ\n" +
                    "TRANSLITERATION\n" +
                    "yakhruju minhumā l-luʾluʾu wa-l-marjānu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "From them emerge the pearl and the coral.");
            ayat.add("23\n" +
                    "فَبِأَيِّ آلاءِ رَبِّكُما تُكَذِّبانِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-bi-ʾayyi ʾālāʾi rabbikumā tukadhdhibāni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So which of your Lord’s bounties\n" +
                    "will you both deny?");
            ayat.add("24\n" +
                    "وَلَهُ الجَوارِ المُنشَآتُ فِي البَحرِ كَالأَعلامِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-lahu l-jawāri l-munshaʾātu fī l-baḥri ka-l-ʾaʿlāmi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "His are the sailing ships1 on the sea\n" +
                    "[appearing] like landmarks.");
            ayat.add("25\n" +
                    "فَبِأَيِّ آلاءِ رَبِّكُما تُكَذِّبانِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-bi-ʾayyi ʾālāʾi rabbikumā tukadhdhibāni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So which of your Lord’s bounties\n" +
                    "will you both deny?");
            ayat.add("26\n" +
                    "كُلُّ مَن عَلَيها فانٍ\n" +
                    "TRANSLITERATION\n" +
                    "kullu man ʿalayhā fānin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Everyone on it1 is ephemeral,");
            ayat.add("27\n" +
                    "وَيَبقىٰ وَجهُ رَبِّكَ ذُو الجَلالِ وَالإِكرامِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-yabqā wajhu rabbika dhū l-jalāli wa-l-ʾikrāmi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "yet lasting is the Face of your Lord,\n" +
                    "majestic and munificent.");
            ayat.add("28\n" +
                    "فَبِأَيِّ آلاءِ رَبِّكُما تُكَذِّبانِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-bi-ʾayyi ʾālāʾi rabbikumā tukadhdhibāni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So which of your Lord’s bounties\n" +
                    "will you both deny?");
            ayat.add("29\n" +
                    "يَسأَلُهُ مَن فِي السَّماواتِ وَالأَرضِ ۚ كُلَّ يَومٍ هُوَ في شَأنٍ\n" +
                    "TRANSLITERATION\n" +
                    "yasʾaluhū man fī s-samāwāti wa-l-ʾarḍi kulla yawmin huwa fī shaʾnin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Everyone in the heavens and the earth asks Him.\n" +
                    "Every day He is engaged in some work.");
            ayat.add("30\n" +
                    "فَبِأَيِّ آلاءِ رَبِّكُما تُكَذِّبانِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-bi-ʾayyi ʾālāʾi rabbikumā tukadhdhibāni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So which of your Lord’s bounties\n" +
                    "will you both deny?");
            ayat.add("31\n" +
                    "سَنَفرُغُ لَكُم أَيُّهَ الثَّقَلانِ\n" +
                    "TRANSLITERATION\n" +
                    "sa-nafrughu lakum ʾayyuha th-thaqalāni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "We shall soon make Ourselves unoccupied for you,\n" +
                    "O you notable two!");
            ayat.add("32\n" +
                    "فَبِأَيِّ آلاءِ رَبِّكُما تُكَذِّبانِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-bi-ʾayyi ʾālāʾi rabbikumā tukadhdhibāni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So which of your Lord’s bounties\n" +
                    "will you both deny?");
            ayat.add("33\n" +
                    "يا مَعشَرَ الجِنِّ وَالإِنسِ إِنِ استَطَعتُم أَن تَنفُذوا مِن أَقطارِ السَّماواتِ وَالأَرضِ فَانفُذوا ۚ لا تَنفُذونَ إِلّا بِسُلطانٍ\n" +
                    "TRANSLITERATION\n" +
                    "yā-maʿshara l-jinni wa-l-ʾinsi ʾini staṭaʿtum ʾan tanfudhū min ʾaqṭāri s-samāwāti wa-l-ʾarḍi fa-nfudhū lā tanfudhūna ʾillā bi-sulṭānin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "O company of jinn and humans!\n" +
                    "If you can pass through\n" +
                    "the confines of the heavens and the earth,\n" +
                    "then do pass through.\n" +
                    "But you will not pass through\n" +
                    "except by an authority [from Allah].");
            ayat.add("34\n" +
                    "فَبِأَيِّ آلاءِ رَبِّكُما تُكَذِّبانِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-bi-ʾayyi ʾālāʾi rabbikumā tukadhdhibāni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So which of your Lord’s bounties\n" +
                    "will you both deny?");
            ayat.add("35\n" +
                    "يُرسَلُ عَلَيكُما شُواظٌ مِن نارٍ وَنُحاسٌ فَلا تَنتَصِرانِ\n" +
                    "TRANSLITERATION\n" +
                    "yursalu ʿalaykumā shuwāẓun min nārin wa-nuḥāsun fa-lā tantaṣirāni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "There will be unleashed upon you\n" +
                    "a flash of fire and a smoke;\n" +
                    "then you will not be able to help one another.");
            ayat.add("36\n" +
                    "فَبِأَيِّ آلاءِ رَبِّكُما تُكَذِّبانِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-bi-ʾayyi ʾālāʾi rabbikumā tukadhdhibāni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So which of your Lord’s bounties\n" +
                    "will you both deny?");
            ayat.add("37\n" +
                    "فَإِذَا انشَقَّتِ السَّماءُ فَكانَت وَردَةً كَالدِّهانِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾidhā nshaqqati s-samāʾu fa-kānat wardatan ka-d-dihāni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "When the sky is split open,\n" +
                    "and turns crimson like tanned leather.");
            ayat.add("38\n" +
                    "فَبِأَيِّ آلاءِ رَبِّكُما تُكَذِّبانِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-bi-ʾayyi ʾālāʾi rabbikumā tukadhdhibāni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So which of your Lord’s bounties\n" +
                    "will you both deny?");
            ayat.add("39\n" +
                    "فَيَومَئِذٍ لا يُسأَلُ عَن ذَنبِهِ إِنسٌ وَلا جانٌّ\n" +
                    "TRANSLITERATION\n" +
                    "fa-yawmaʾidhin lā yusʾalu ʿan dhanbihī ʾinsun wa-lā jānnun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "On that day\n" +
                    "neither humans will be questioned about their sins\n" +
                    "nor jinn.");
            ayat.add("40\n" +
                    "فَبِأَيِّ آلاءِ رَبِّكُما تُكَذِّبانِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-bi-ʾayyi ʾālāʾi rabbikumā tukadhdhibāni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So which of your Lord’s bounties\n" +
                    "will you both deny?");
            ayat.add("41\n" +
                    "يُعرَفُ المُجرِمونَ بِسيماهُم فَيُؤخَذُ بِالنَّواصي وَالأَقدامِ\n" +
                    "TRANSLITERATION\n" +
                    "yuʿrafu l-mujrimūna bi-sīmāhum fa-yuʾkhadhu bi-n-nawāṣī wa-l-ʾaqdāmi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The guilty will be recognized by their mark;\n" +
                    "so they will be seized by the forelocks and the feet.");
            ayat.add("42\n" +
                    "فَبِأَيِّ آلاءِ رَبِّكُما تُكَذِّبانِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-bi-ʾayyi ʾālāʾi rabbikumā tukadhdhibāni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So which of your Lord’s bounties\n" +
                    "will you both deny?");
            ayat.add("43\n" +
                    "هٰذِهِ جَهَنَّمُ الَّتي يُكَذِّبُ بِهَا المُجرِمونَ\n" +
                    "TRANSLITERATION\n" +
                    "hādhihī jahannamu llatī yukadhdhibu bihā l-mujrimūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "‘This is the hell\n" +
                    "which the guilty would deny!’");
            ayat.add("44\n" +
                    "يَطوفونَ بَينَها وَبَينَ حَميمٍ آنٍ\n" +
                    "TRANSLITERATION\n" +
                    "yaṭūfūna baynahā wa-bayna ḥamīmin ʾānin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They shall circuit between it\n" +
                    "and boiling hot water.");
            ayat.add("45\n" +
                    "فَبِأَيِّ آلاءِ رَبِّكُما تُكَذِّبانِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-bi-ʾayyi ʾālāʾi rabbikumā tukadhdhibāni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So which of your Lord’s bounties\n" +
                    "will you both deny?");
            ayat.add("46\n" +
                    "وَلِمَن خافَ مَقامَ رَبِّهِ جَنَّتانِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-li-man khāfa maqāma rabbihī jannatāni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "For him who stands in awe of his Lord\n" +
                    "will be two gardens.");
            ayat.add("47\n" +
                    "فَبِأَيِّ آلاءِ رَبِّكُما تُكَذِّبانِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-bi-ʾayyi ʾālāʾi rabbikumā tukadhdhibāni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So which of your Lord’s bounties\n" +
                    "will you both deny?");
            ayat.add("48\n" +
                    "ذَواتا أَفنانٍ\n" +
                    "TRANSLITERATION\n" +
                    "dhawātā ʾafnānin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Both abounding in branches.");
            ayat.add("49\n" +
                    "فَبِأَيِّ آلاءِ رَبِّكُما تُكَذِّبانِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-bi-ʾayyi ʾālāʾi rabbikumā tukadhdhibāni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So which of your Lord’s bounties\n" +
                    "will you both deny?");
            ayat.add("50\n" +
                    "فيهِما عَينانِ تَجرِيانِ\n" +
                    "TRANSLITERATION\n" +
                    "fīhimā ʿaynāni tajriyāni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "In both of them will be two flowing springs.");
            ayat.add("51\n" +
                    "فَبِأَيِّ آلاءِ رَبِّكُما تُكَذِّبانِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-bi-ʾayyi ʾālāʾi rabbikumā tukadhdhibāni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So which of your Lord’s bounties\n" +
                    "will you both deny?");
            ayat.add("52\n" +
                    "فيهِما مِن كُلِّ فاكِهَةٍ زَوجانِ\n" +
                    "TRANSLITERATION\n" +
                    "fīhimā min kulli fākihatin zawjāni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "In both of them will be two kinds of every fruit.");
            ayat.add("53\n" +
                    "فَبِأَيِّ آلاءِ رَبِّكُما تُكَذِّبانِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-bi-ʾayyi ʾālāʾi rabbikumā tukadhdhibāni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So which of your Lord’s bounties\n" +
                    "will you both deny?");
            ayat.add("54\n" +
                    "مُتَّكِئينَ عَلىٰ فُرُشٍ بَطائِنُها مِن إِستَبرَقٍ ۚ وَجَنَى الجَنَّتَينِ دانٍ\n" +
                    "TRANSLITERATION\n" +
                    "muttakiʾīna ʿalā furushin baṭāʾinuhā min ʾistabraqin wa-janā l-jannatayni dānin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "[They will be] reclining on beds\n" +
                    "lined with green silk.\n" +
                    "And the fruit of the two gardens will be\n" +
                    "near at hand.");
            ayat.add("55\n" +
                    "فَبِأَيِّ آلاءِ رَبِّكُما تُكَذِّبانِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-bi-ʾayyi ʾālāʾi rabbikumā tukadhdhibāni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So which of your Lord’s bounties\n" +
                    "will you both deny?");
            ayat.add("56\n" +
                    "فيهِنَّ قاصِراتُ الطَّرفِ لَم يَطمِثهُنَّ إِنسٌ قَبلَهُم وَلا جانٌّ\n" +
                    "TRANSLITERATION\n" +
                    "fīhinna qāṣirātu ṭ-ṭarfi lam yaṭmithhunna ʾinsun qablahum wa-lā jānnun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "In them are maidens of restrained glances,\n" +
                    "whom no human has touched before,\n" +
                    "nor jinn.");
            ayat.add("57\n" +
                    "فَبِأَيِّ آلاءِ رَبِّكُما تُكَذِّبانِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-bi-ʾayyi ʾālāʾi rabbikumā tukadhdhibāni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So which of your Lord’s bounties\n" +
                    "will you both deny?");
            ayat.add("58\n" +
                    "كَأَنَّهُنَّ الياقوتُ وَالمَرجانُ\n" +
                    "TRANSLITERATION\n" +
                    "ka-ʾannahunna l-yāqūtu wa-l-marjānu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "As though they were rubies and corals.");
            ayat.add("59\n" +
                    "فَبِأَيِّ آلاءِ رَبِّكُما تُكَذِّبانِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-bi-ʾayyi ʾālāʾi rabbikumā tukadhdhibāni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So which of your Lord’s bounties\n" +
                    "will you both deny?");
            ayat.add("60\n" +
                    "هَل جَزاءُ الإِحسانِ إِلَّا الإِحسانُ\n" +
                    "TRANSLITERATION\n" +
                    "hal jazāʾu l-ʾiḥsāni ʾillā l-ʾiḥsānu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Is the requital of goodness anything\n" +
                    "but goodness?");
            ayat.add("61\n" +
                    "فَبِأَيِّ آلاءِ رَبِّكُما تُكَذِّبانِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-bi-ʾayyi ʾālāʾi rabbikumā tukadhdhibāni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So which of your Lord’s bounties\n" +
                    "will you both deny?");
            ayat.add("62\n" +
                    "وَمِن دونِهِما جَنَّتانِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-min dūnihimā jannatāni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Beside these two, there will be two [other] gardens.");
            ayat.add("63\n" +
                    "فَبِأَيِّ آلاءِ رَبِّكُما تُكَذِّبانِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-bi-ʾayyi ʾālāʾi rabbikumā tukadhdhibāni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So which of your Lord’s bounties\n" +
                    "will you both deny?");
            ayat.add("64\n" +
                    "مُدهامَّتانِ\n" +
                    "TRANSLITERATION\n" +
                    "mudhāmmatāni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Dark green.");
            ayat.add("65\n" +
                    "فَبِأَيِّ آلاءِ رَبِّكُما تُكَذِّبانِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-bi-ʾayyi ʾālāʾi rabbikumā tukadhdhibāni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So which of your Lord’s bounties\n" +
                    "will you both deny?");
            ayat.add("66\n" +
                    "فيهِما عَينانِ نَضّاخَتانِ\n" +
                    "TRANSLITERATION\n" +
                    "fīhimā ʿaynāni naḍḍākhatāni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "In both of them will be two gushing springs.");
            ayat.add("67\n" +
                    "فَبِأَيِّ آلاءِ رَبِّكُما تُكَذِّبانِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-bi-ʾayyi ʾālāʾi rabbikumā tukadhdhibāni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So which of your Lord’s bounties\n" +
                    "will you both deny?");
            ayat.add("68\n" +
                    "فيهِما فاكِهَةٌ وَنَخلٌ وَرُمّانٌ\n" +
                    "TRANSLITERATION\n" +
                    "fīhimā fākihatun wa-nakhlun wa-rummānun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "In both of them will be fruits,\n" +
                    "date-palms and pomegranates.");
            ayat.add("69\n" +
                    "فَبِأَيِّ آلاءِ رَبِّكُما تُكَذِّبانِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-bi-ʾayyi ʾālāʾi rabbikumā tukadhdhibāni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So which of your Lord’s bounties\n" +
                    "will you both deny?");
            ayat.add("70\n" +
                    "فيهِنَّ خَيراتٌ حِسانٌ\n" +
                    "TRANSLITERATION\n" +
                    "fīhinna khayrātun ḥisānun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "In them are maidens good and lovely.");
            ayat.add("71\n" +
                    "فَبِأَيِّ آلاءِ رَبِّكُما تُكَذِّبانِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-bi-ʾayyi ʾālāʾi rabbikumā tukadhdhibāni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So which of your Lord’s bounties\n" +
                    "will you both deny?");
            ayat.add("72\n" +
                    "حورٌ مَقصوراتٌ فِي الخِيامِ\n" +
                    "TRANSLITERATION\n" +
                    "ḥūrun maqṣūrātun fī l-khiyāmi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Houris secluded in pavilions.");
            ayat.add("73\n" +
                    "فَبِأَيِّ آلاءِ رَبِّكُما تُكَذِّبانِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-bi-ʾayyi ʾālāʾi rabbikumā tukadhdhibāni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So which of your Lord’s bounties\n" +
                    "will you both deny?");
            ayat.add("74\n" +
                    "لَم يَطمِثهُنَّ إِنسٌ قَبلَهُم وَلا جانٌّ\n" +
                    "TRANSLITERATION\n" +
                    "lam yaṭmithhunna ʾinsun qablahum wa-lā jānnun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Whom no human has touched before,\n" +
                    "nor jinn.");
            ayat.add("75\n" +
                    "فَبِأَيِّ آلاءِ رَبِّكُما تُكَذِّبانِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-bi-ʾayyi ʾālāʾi rabbikumā tukadhdhibāni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So which of your Lord’s bounties\n" +
                    "will you both deny?");
            ayat.add("76\n" +
                    "مُتَّكِئينَ عَلىٰ رَفرَفٍ خُضرٍ وَعَبقَرِيٍّ حِسانٍ\n" +
                    "TRANSLITERATION\n" +
                    "muttakiʾīna ʿalā rafrafin khuḍrin wa-ʿabqariyyin ḥisānin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Reclining on green cushions\n" +
                    "and lovely carpets.");
            ayat.add("77\n" +
                    "فَبِأَيِّ آلاءِ رَبِّكُما تُكَذِّبانِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-bi-ʾayyi ʾālāʾi rabbikumā tukadhdhibāni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So which of your Lord’s bounties\n" +
                    "will you both deny?");
            ayat.add("78\n" +
                    "تَبارَكَ اسمُ رَبِّكَ ذِي الجَلالِ وَالإِكرامِ\n" +
                    "TRANSLITERATION\n" +
                    "tabāraka smu rabbika dhī l-jalāli wa-l-ʾikrāmi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Blessed is the Name of your Lord,\n" +
                    "the Majestic and the Munificent!");
        }
        else if (surahName.equals("56. Al-Waqi`ah"))
        {
            setTitle("Al-Waqi`ah(الواقعة) : The Imminent");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "إِذا وَقَعَتِ الواقِعَةُ\n" +
                    "TRANSLITERATION\n" +
                    "ʾidhā waqaʿati l-wāqiʿatu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "When the Imminent1 [Hour] befalls");
            ayat.add("2\n" +
                    "لَيسَ لِوَقعَتِها كاذِبَةٌ\n" +
                    "TRANSLITERATION\n" +
                    "laysa li-waqʿatihā kādhibatun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "there is no denying that it will befall");
            ayat.add("3\n" +
                    "خافِضَةٌ رافِعَةٌ\n" +
                    "TRANSLITERATION\n" +
                    "khāfiḍatun rāfiʿatun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "[it will be] lowering, exalting.");
            ayat.add("4\n" +
                    "إِذا رُجَّتِ الأَرضُ رَجًّا\n" +
                    "TRANSLITERATION\n" +
                    "ʾidhā rujjati l-ʾarḍu rajjan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "When the earth is shaken violently,");
            ayat.add("5\n" +
                    "وَبُسَّتِ الجِبالُ بَسًّا\n" +
                    "TRANSLITERATION\n" +
                    "wa-bussati l-jibālu bassan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and the mountains are shattered into bits");
            ayat.add("6\n" +
                    "فَكانَت هَباءً مُنبَثًّا\n" +
                    "TRANSLITERATION\n" +
                    "fa-kānat habāʾan munbathan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and become scattered dust,");
            ayat.add("7\n" +
                    "وَكُنتُم أَزواجًا ثَلاثَةً\n" +
                    "TRANSLITERATION\n" +
                    "wa-kuntum ʾazwājan thalāthatan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "you will be three groups:");
            ayat.add("8\n" +
                    "فَأَصحابُ المَيمَنَةِ ما أَصحابُ المَيمَنَةِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾaṣḥābu l-maymanati mā ʾaṣḥābu l-maymanati\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The People of the Right Hand\n" +
                    "and what are the People of the Right Hand?");
            ayat.add("9\n" +
                    "وَأَصحابُ المَشأَمَةِ ما أَصحابُ المَشأَمَةِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾaṣḥābu l-mashʾamati mā ʾaṣḥābu l-mashʾamati\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And the People of the Left Hand\n" +
                    "and what are the People of the Left Hand?");
            ayat.add("10\n" +
                    "وَالسّابِقونَ السّابِقونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-s-sābiqūna s-sābiqūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And the Foremost Ones are the foremost ones:");
            ayat.add("11\n" +
                    "أُولٰئِكَ المُقَرَّبونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾulāʾika l-muqarrabūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "they are the ones brought near [to Allah],");
            ayat.add("12\n" +
                    "في جَنّاتِ النَّعيمِ\n" +
                    "TRANSLITERATION\n" +
                    "fī jannāti n-naʿīmi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "[who will reside] in the gardens of bliss.");
            ayat.add("13\n" +
                    "ثُلَّةٌ مِنَ الأَوَّلينَ\n" +
                    "TRANSLITERATION\n" +
                    "thullatun mina l-ʾawwalīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "A multitude from the former [generations]");
            ayat.add("14\n" +
                    "وَقَليلٌ مِنَ الآخِرينَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-qalīlun mina l-ʾākhirīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and a few from the latter ones.");
            ayat.add("15\n" +
                    "عَلىٰ سُرُرٍ مَوضونَةٍ\n" +
                    "TRANSLITERATION\n" +
                    "ʿalā sururin mawḍūnatin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "On brocaded couches");
            ayat.add("16\n" +
                    "مُتَّكِئينَ عَلَيها مُتَقابِلينَ\n" +
                    "TRANSLITERATION\n" +
                    "muttakiʾīna ʿalayhā mutaqābilīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "reclining on them, face to face.");
            ayat.add("17\n" +
                    "يَطوفُ عَلَيهِم وِلدانٌ مُخَلَّدونَ\n" +
                    "TRANSLITERATION\n" +
                    "yaṭūfu ʿalayhim wildānun mukhalladūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They will be waited upon by immortal youths,");
            ayat.add("18\n" +
                    "بِأَكوابٍ وَأَباريقَ وَكَأسٍ مِن مَعينٍ\n" +
                    "TRANSLITERATION\n" +
                    "bi-ʾakwābin wa-ʾabārīqa wa-kaʾsin min maʿīnin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "with goblets and ewers\n" +
                    "and a cup of a clear wine,");
            ayat.add("19\n" +
                    "لا يُصَدَّعونَ عَنها وَلا يُنزِفونَ\n" +
                    "TRANSLITERATION\n" +
                    "lā yuṣaddaʿūna ʿanhā wa-lā yunzifūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "which neither causes them headache\n" +
                    "nor stupefaction,");
            ayat.add("20\n" +
                    "وَفاكِهَةٍ مِمّا يَتَخَيَّرونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-fākihatin mimmā yatakhayyarūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and such fruits as they prefer");
            ayat.add("21\n" +
                    "وَلَحمِ طَيرٍ مِمّا يَشتَهونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-laḥmi ṭayrin mimmā yashtahūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and such flesh of fowls as they desire,");
            ayat.add("22\n" +
                    "وَحورٌ عينٌ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ḥūrun ʿīnun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and big-eyed houris");
            ayat.add("23\n" +
                    "كَأَمثالِ اللُّؤلُؤِ المَكنونِ\n" +
                    "TRANSLITERATION\n" +
                    "ka-ʾamthāli l-luʾluʾi l-maknūni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "like guarded pearls,");
            ayat.add("24\n" +
                    "جَزاءً بِما كانوا يَعمَلونَ\n" +
                    "TRANSLITERATION\n" +
                    "jazāʾan bi-mā kānū yaʿmalūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "a reward for what they used to do.");
            ayat.add("25\n" +
                    "لا يَسمَعونَ فيها لَغوًا وَلا تَأثيمًا\n" +
                    "TRANSLITERATION\n" +
                    "lā yasmaʿūna fīhā laghwan wa-lā taʾthīman\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They will not hear therein\n" +
                    "any vain talk or sinful speech,");
            ayat.add("26\n" +
                    "إِلّا قيلًا سَلامًا سَلامًا\n" +
                    "TRANSLITERATION\n" +
                    "ʾillā qīlan salāman salāman\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "but only the watchword, ‘Peace!’ ‘Peace!’");
            ayat.add("27\n" +
                    "وَأَصحابُ اليَمينِ ما أَصحابُ اليَمينِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾaṣhābu l-yamīni mā ʾaṣhābu l-yamīni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And the People of the Right Hand\n" +
                    "what are the People of the Right Hand?");
            ayat.add("28\n" +
                    "في سِدرٍ مَخضودٍ\n" +
                    "TRANSLITERATION\n" +
                    "fī sidrin makhḍūdin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Amid thornless lote trees");
            ayat.add("29\n" +
                    "وَطَلحٍ مَنضودٍ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ṭalḥin manḍūdin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and clustered spathes");
            ayat.add("30\n" +
                    "وَظِلٍّ مَمدودٍ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ẓillin mamdūdin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and extended shade,");
            ayat.add("31\n" +
                    "وَماءٍ مَسكوبٍ\n" +
                    "TRANSLITERATION\n" +
                    "wa-māʾin maskūbin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and ever-flowing water");
            ayat.add("32\n" +
                    "وَفاكِهَةٍ كَثيرَةٍ\n" +
                    "TRANSLITERATION\n" +
                    "wa-fākihatin kathīratin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and abundant fruits,");
            ayat.add("33\n" +
                    "لا مَقطوعَةٍ وَلا مَمنوعَةٍ\n" +
                    "TRANSLITERATION\n" +
                    "lā maqṭūʿatin wa-lā mamnūʿatin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "neither inaccessible, nor forbidden,");
            ayat.add("34\n" +
                    "وَفُرُشٍ مَرفوعَةٍ\n" +
                    "TRANSLITERATION\n" +
                    "wa-furushin marfūʿatin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and noble spouses.");
            ayat.add("35\n" +
                    "إِنّا أَنشَأناهُنَّ إِنشاءً\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnā ʾanshaʾnāhunna ʾinshāʾan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "We have created them with a special creation,");
            ayat.add("36\n" +
                    "فَجَعَلناهُنَّ أَبكارًا\n" +
                    "TRANSLITERATION\n" +
                    "fa-jaʿalnāhunna ʾabkāran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and made them virgins,");
            ayat.add("37\n" +
                    "عُرُبًا أَترابًا\n" +
                    "TRANSLITERATION\n" +
                    "ʿuruban ʾatrāban\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "loving, of a like age,");
            ayat.add("38\n" +
                    "لِأَصحابِ اليَمينِ\n" +
                    "TRANSLITERATION\n" +
                    "li-ʾaṣḥābi l-yamīni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "for the People of the Right Hand.");
            ayat.add("39\n" +
                    "ثُلَّةٌ مِنَ الأَوَّلينَ\n" +
                    "TRANSLITERATION\n" +
                    "thullatun mina l-ʾawwalīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "A multitude from the former [generations]");
            ayat.add("40\n" +
                    "وَثُلَّةٌ مِنَ الآخِرينَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-thullatun mina l-ʾākhirīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and a multitude from the latter [ones].");
            ayat.add("41\n" +
                    "وَأَصحابُ الشِّمالِ ما أَصحابُ الشِّمالِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾaṣḥābu sh-shimāli mā ʾaṣḥābu sh-shimāli\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And the People of the Left Hand\n" +
                    "what are the People of the Left Hand?");
            ayat.add("42\n" +
                    "في سَمومٍ وَحَميمٍ\n" +
                    "TRANSLITERATION\n" +
                    "fī samūmin wa-ḥamīmin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Amid infernal miasma and boiling water");
            ayat.add("43\n" +
                    "وَظِلٍّ مِن يَحمومٍ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ẓillin min yaḥmūmin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and the shadow of a dense black smoke,");
            ayat.add("44\n" +
                    "لا بارِدٍ وَلا كَريمٍ\n" +
                    "TRANSLITERATION\n" +
                    "lā bāridin wa-lā karīmin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "neither cool nor beneficial.");
            ayat.add("45\n" +
                    "إِنَّهُم كانوا قَبلَ ذٰلِكَ مُترَفينَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnahum kānū qabla dhālika mutrafīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed they had been affluent before this,");
            ayat.add("46\n" +
                    "وَكانوا يُصِرّونَ عَلَى الحِنثِ العَظيمِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-kānū yuṣirrūna ʿalā l-ḥinthi l-ʿaẓīmi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and they used to persist in the great sin.");
            ayat.add("47\n" +
                    "وَكانوا يَقولونَ أَئِذا مِتنا وَكُنّا تُرابًا وَعِظامًا أَإِنّا لَمَبعوثونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-kānū yaqūlūna ʾa-ʾidhā mitnā wa-kunnā turāban wa-ʿiẓāman ʾa-ʾinnā la-mabʿūthūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And they used to say,\n" +
                    "‘What! When we are dead and become dust\n" +
                    "and bones,\n" +
                    "shall we be resurrected?");
            ayat.add("48\n" +
                    "أَوَآباؤُنَا الأَوَّلونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-wa-ʾābāʾunā l-ʾawwalūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And our forefathers too?'");
            ayat.add("49\n" +
                    "قُل إِنَّ الأَوَّلينَ وَالآخِرينَ\n" +
                    "TRANSLITERATION\n" +
                    "qul ʾinna l-ʾawwalīna wa-l-ʾākhirīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Say, ‘Indeed the former and latter generations");
            ayat.add("50\n" +
                    "لَمَجموعونَ إِلىٰ ميقاتِ يَومٍ مَعلومٍ\n" +
                    "TRANSLITERATION\n" +
                    "la-majmūʿūna ʾilā mīqāti yawmin maʿlūmin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "will all be gathered\n" +
                    "for the tryst of a known day.");
            ayat.add("51\n" +
                    "ثُمَّ إِنَّكُم أَيُّهَا الضّالّونَ المُكَذِّبونَ\n" +
                    "TRANSLITERATION\n" +
                    "thumma ʾinnakum ʾayyuhā ḍ-ḍāllūna l-mukadhdhibūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Then indeed,\n" +
                    "you, astray deniers,");
            ayat.add("52\n" +
                    "لَآكِلونَ مِن شَجَرٍ مِن زَقّومٍ\n" +
                    "TRANSLITERATION\n" +
                    "la-ʾākilūna min shajarin min zaqqūmin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "will surely eat from the Zaqqūm tree");
            ayat.add("53\n" +
                    "فَمالِئونَ مِنهَا البُطونَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-māliʾūna minhā l-buṭūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and stuff your bellies with it,");
            ayat.add("54\n" +
                    "فَشارِبونَ عَلَيهِ مِنَ الحَميمِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-shāribūna ʿalayhi mina l-ḥamīmi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and drink boiling water on top of it,");
            ayat.add("55\n" +
                    "فَشارِبونَ شُربَ الهيمِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-shāribūna shurba l-hīmi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "drinking like thirsty camels.’");
            ayat.add("56\n" +
                    "هٰذا نُزُلُهُم يَومَ الدّينِ\n" +
                    "TRANSLITERATION\n" +
                    "hādhā nuzuluhum yawma d-dīni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Such will be the hospitality they receive\n" +
                    "on the Day of Retribution.");
            ayat.add("57\n" +
                    "نَحنُ خَلَقناكُم فَلَولا تُصَدِّقونَ\n" +
                    "TRANSLITERATION\n" +
                    "naḥnu khalaqnākum fa-law-lā tuṣaddiqūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "We created you.\n" +
                    "Then why do you not acknowledge it?");
            ayat.add("58\n" +
                    "أَفَرَأَيتُم ما تُمنونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-fa-raʾaytum mā tumnūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Have you considered the sperm that you emit?");
            ayat.add("59\n" +
                    "أَأَنتُم تَخلُقونَهُ أَم نَحنُ الخالِقونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-ʾantum takhluqūnahū ʾam naḥnu l-khāliqūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Is it you who create it,\n" +
                    "or are We the creator?");
            ayat.add("60\n" +
                    "نَحنُ قَدَّرنا بَينَكُمُ المَوتَ وَما نَحنُ بِمَسبوقينَ\n" +
                    "TRANSLITERATION\n" +
                    "naḥnu qaddarnā baynakumu l-mawta wa-mā naḥnu bi-masbūqīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "We have ordained death among you,\n" +
                    "and We are not to be outmaneuvered");
            ayat.add("61\n" +
                    "عَلىٰ أَن نُبَدِّلَ أَمثالَكُم وَنُنشِئَكُم في ما لا تَعلَمونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʿalā ʾan nubaddila ʾamthālakum wa-nunshiʾakum fī mā lā taʿlamūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "from replacing you with your likes\n" +
                    "and recreating you\n" +
                    "in [a realm] you do not know.");
            ayat.add("62\n" +
                    "وَلَقَد عَلِمتُمُ النَّشأَةَ الأولىٰ فَلَولا تَذَكَّرونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-la-qad ʿalimtumu n-nashʾata l-ʾūlā fa-law-lā tadhakkarūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Certainly you have known the first genesis,\n" +
                    "then why do you not take admonition?");
            ayat.add("63\n" +
                    "أَفَرَأَيتُم ما تَحرُثونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-fa-raʾaytum mā taḥruthūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Have you considered what you sow?");
            ayat.add("64\n" +
                    "أَأَنتُم تَزرَعونَهُ أَم نَحنُ الزّارِعونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-ʾantum tazraʿūnahū ʾam naḥnu z-zāriʿūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Is it you who make it grow,\n" +
                    "or are We the grower?");
            ayat.add("65\n" +
                    "لَو نَشاءُ لَجَعَلناهُ حُطامًا فَظَلتُم تَفَكَّهونَ\n" +
                    "TRANSLITERATION\n" +
                    "law nashāʾu la-jaʿalnāhu ḥuṭāman fa-ẓaltum tafakkahūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "If We wish, We surely turn it into chaff,\n" +
                    "whereat you are left stunned1 [saying to yourselves,]");
            ayat.add("66\n" +
                    "إِنّا لَمُغرَمونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnā la-mughramūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "‘Indeed we have suffered loss!");
            ayat.add("67\n" +
                    "بَل نَحنُ مَحرومونَ\n" +
                    "TRANSLITERATION\n" +
                    "bal naḥnu maḥrūmūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Rather we are deprived!’");
            ayat.add("68\n" +
                    "أَفَرَأَيتُمُ الماءَ الَّذي تَشرَبونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-fa-raʾaytumu l-māʾa lladhī tashrabūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Have you considered the water that you drink?");
            ayat.add("69\n" +
                    "أَأَنتُم أَنزَلتُموهُ مِنَ المُزنِ أَم نَحنُ المُنزِلونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-ʾantum ʾanzaltumūhu mina l-muzni ʾam naḥnu l-munzilūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Is it you who bring it down from the rain cloud,\n" +
                    "or is it We who bring [it] down?");
            ayat.add("70\n" +
                    "لَو نَشاءُ جَعَلناهُ أُجاجًا فَلَولا تَشكُرونَ\n" +
                    "TRANSLITERATION\n" +
                    "law nashāʾu jaʿalnāhu ʾujājan fa-law-lā tashkurūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "If We wish We can make it bitter.\n" +
                    "Then why do you not give thanks?");
            ayat.add("71\n" +
                    "أَفَرَأَيتُمُ النّارَ الَّتي تورونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-fa-raʾaytumu n-nāra llatī tūrūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Have you considered the fire that you kindle?");
            ayat.add("72\n" +
                    "أَأَنتُم أَنشَأتُم شَجَرَتَها أَم نَحنُ المُنشِئونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-ʾantum ʾanshaʾtum shajaratahā ʾam naḥnu l-munshiʾūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Was it you who caused its tree to grow,\n" +
                    "or were We the grower?");
            ayat.add("73\n" +
                    "نَحنُ جَعَلناها تَذكِرَةً وَمَتاعًا لِلمُقوينَ\n" +
                    "TRANSLITERATION\n" +
                    "naḥnu jaʿalnāhā tadhkiratan wa-matāʿan li-l-muqwīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "It was We who made it a reminder\n" +
                    "and a boon for the desert-dwellers.");
            ayat.add("74\n" +
                    "فَسَبِّح بِاسمِ رَبِّكَ العَظيمِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-sabbiḥ bi-smi rabbika l-ʿaẓīmi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So celebrate the Name of your Lord, the All-supreme.");
            ayat.add("75\n" +
                    "۞ فَلا أُقسِمُ بِمَواقِعِ النُّجومِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-lā ʾuqsimu bi-mawāqiʿi n-nujūmi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So I swear\n" +
                    "by the places where the stars set!");
            ayat.add("76\n" +
                    "وَإِنَّهُ لَقَسَمٌ لَو تَعلَمونَ عَظيمٌ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾinnahū la-qasamun law taʿlamūna ʿaẓīmun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And indeed it is a great oath, should you know.");
            ayat.add("77\n" +
                    "إِنَّهُ لَقُرآنٌ كَريمٌ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnahū la-qurʾānun karīmun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "This is indeed a noble Qurʾān,");
            ayat.add("78\n" +
                    "في كِتابٍ مَكنونٍ\n" +
                    "TRANSLITERATION\n" +
                    "fī kitābin maknūnin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "in a guarded Book,");
            ayat.add("79\n" +
                    "لا يَمَسُّهُ إِلَّا المُطَهَّرونَ\n" +
                    "TRANSLITERATION\n" +
                    "lā yamassuhū ʾillā l-muṭahharūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "no one touches it except the pure ones");
            ayat.add("80\n" +
                    "تَنزيلٌ مِن رَبِّ العالَمينَ\n" +
                    "TRANSLITERATION\n" +
                    "tanzīlun min rabbi l-ʿālamīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "gradually sent down from the Lord of all the worlds.");
            ayat.add("81\n" +
                    "أَفَبِهٰذَا الحَديثِ أَنتُم مُدهِنونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-fa-bi-hādhā l-ḥadīthi ʾantum mudhinūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "What! Do you take lightly this discourse?");
            ayat.add("82\n" +
                    "وَتَجعَلونَ رِزقَكُم أَنَّكُم تُكَذِّبونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-tajʿalūna rizqakum ʾannakum tukadhdhibūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And make your denial of it your vocation?");
            ayat.add("83\n" +
                    "فَلَولا إِذا بَلَغَتِ الحُلقومَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-law-lā ʾidhā balaghati l-ḥulqūma\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So when it1 reaches the throat [of the dying person]");
            ayat.add("84\n" +
                    "وَأَنتُم حينَئِذٍ تَنظُرونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾantum ḥīnaʾidhin tanẓurūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and at that moment you are looking on");
            ayat.add("85\n" +
                    "وَنَحنُ أَقرَبُ إِلَيهِ مِنكُم وَلٰكِن لا تُبصِرونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-naḥnu ʾaqrabu ʾilayhi minkum wa-lākin lā tubṣirūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and We are nearer to him1 than you are,\n" +
                    "though you do not perceive");
            ayat.add("86\n" +
                    "فَلَولا إِن كُنتُم غَيرَ مَدينينَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-law-lā ʾin kuntum ghayra madīnīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "then why do you not, if you are not subject");
            ayat.add("87\n" +
                    "تَرجِعونَها إِن كُنتُم صادِقينَ\n" +
                    "TRANSLITERATION\n" +
                    "tarjiʿūnahā ʾin kuntum ṣādiqīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "[to the Divine dispensation], restore it,\n" +
                    "should you be truthful?");
            ayat.add("88\n" +
                    "فَأَمّا إِن كانَ مِنَ المُقَرَّبينَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾammā ʾin kāna mina l-muqarrabīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Then, if he be of those brought near,");
            ayat.add("89\n" +
                    "فَرَوحٌ وَرَيحانٌ وَجَنَّتُ نَعيمٍ\n" +
                    "TRANSLITERATION\n" +
                    "fa-rawḥun wa-rayḥānun wa-jannatu naʿīmin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "then ease, abundance, and a garden of bliss.");
            ayat.add("90\n" +
                    "وَأَمّا إِن كانَ مِن أَصحابِ اليَمينِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾammā ʾin kāna min ʾaṣḥābi l-yamīni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And if he be of the People of the Right Hand,");
            ayat.add("91\n" +
                    "فَسَلامٌ لَكَ مِن أَصحابِ اليَمينِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-salāmun laka min ʾaṣḥābi l-yamīni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "then ‘Peace be on you,’\n" +
                    "[a greeting] from the People of the Right Hand!");
            ayat.add("92\n" +
                    "وَأَمّا إِن كانَ مِنَ المُكَذِّبينَ الضّالّينَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾammā ʾin kāna mina l-mukadhdhibīna ḍ-ḍāllīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "But if he be of the impugners,\n" +
                    "the astray ones,");
            ayat.add("93\n" +
                    "فَنُزُلٌ مِن حَميمٍ\n" +
                    "TRANSLITERATION\n" +
                    "fa-nuzulun min ḥamīmin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "then a treat of boiling water");
            ayat.add("94\n" +
                    "وَتَصلِيَةُ جَحيمٍ\n" +
                    "TRANSLITERATION\n" +
                    "wa-taṣliyatu jaḥīmin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and entry into hell.");
            ayat.add("95\n" +
                    "إِنَّ هٰذا لَهُوَ حَقُّ اليَقينِ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna hādhā la-huwa ḥaqqu l-yaqīni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed this is certain truth.");
            ayat.add("96\n" +
                    "فَسَبِّح بِاسمِ رَبِّكَ العَظيمِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-sabbiḥ bi-smi rabbika l-ʿaẓīmi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So celebrate the Name of your Lord, the All-supreme!");
        }
        else if (surahName.equals("57. Al-Hadeed"))
        {
            setTitle("Al-Hadeed(الحديد) : Iron");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "سَبَّحَ لِلَّهِ ما فِي السَّماواتِ وَالأَرضِ ۖ وَهُوَ العَزيزُ الحَكيمُ\n" +
                    "TRANSLITERATION\n" +
                    "sabbaḥa li-llāhi mā fī s-samāwāti wa-l-ʾarḍi wa-huwa l-ʿazīzu l-ḥakīmu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Whatever there is in the heavens glorifies Allah\n" +
                    "and [whatever there is on] the earth\n" +
                    "and He is the All-mighty, the All-wise.");
            ayat.add("2\n" +
                    "لَهُ مُلكُ السَّماواتِ وَالأَرضِ ۖ يُحيي وَيُميتُ ۖ وَهُوَ عَلىٰ كُلِّ شَيءٍ قَديرٌ\n" +
                    "TRANSLITERATION\n" +
                    "lahū mulku s-samāwāti wa-l-ʾarḍi yuḥyī wa-yumītu wa-huwa ʿalā kulli shayʾin qadīrun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "To Him belongs the kingdom of the heavens\n" +
                    "and the earth:\n" +
                    "He gives life and brings death,\n" +
                    "and He has power over all things.");
            ayat.add("3\n" +
                    "هُوَ الأَوَّلُ وَالآخِرُ وَالظّاهِرُ وَالباطِنُ ۖ وَهُوَ بِكُلِّ شَيءٍ عَليمٌ\n" +
                    "TRANSLITERATION\n" +
                    "huwa l-ʾawwalu wa-l-ʾākhiru wa-ẓ-ẓāhiru wa-l-bāṭinu wa-huwa bi-kulli shayʾin ʿalīmun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "He is the First and the Last,\n" +
                    "the Manifest and the Hidden,\n" +
                    "and He has knowledge of all things.");
            ayat.add("4\n" +
                    "هُوَ الَّذي خَلَقَ السَّماواتِ وَالأَرضَ في سِتَّةِ أَيّامٍ ثُمَّ استَوىٰ عَلَى العَرشِ ۚ يَعلَمُ ما يَلِجُ فِي الأَرضِ وَما يَخرُجُ مِنها وَما يَنزِلُ مِنَ السَّماءِ وَما يَعرُجُ فيها ۖ وَهُوَ مَعَكُم أَينَ ما كُنتُم ۚ وَاللَّهُ بِما تَعمَلونَ بَصيرٌ\n" +
                    "TRANSLITERATION\n" +
                    "huwa lladhī khalaqa s-samāwāti wa-l-ʾarḍa fī sittati ʾayyāmin thumma stawā ʿalā l-ʿarshi yaʿlamu mā yaliju fī l-ʾarḍi wa-mā yakhruju minhā wa-mā yanzilu mina s-samāʾi wa-mā yaʿruju fīhā wa-huwa maʿakum ʾayna mā kuntum wa-llāhu bi-mā taʿmalūna baṣīrun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "It is He who created the heavens and the earth\n" +
                    "in six days;\n" +
                    "then settled on the Throne.\n" +
                    "He knows whatever enters the earth\n" +
                    "and whatever emerges from it\n" +
                    "and whatever descends from the sky\n" +
                    "and whatever ascends to it,\n" +
                    "and He is with you wherever you may be,\n" +
                    "and Allah sees best what you do.");
            ayat.add("5\n" +
                    "لَهُ مُلكُ السَّماواتِ وَالأَرضِ ۚ وَإِلَى اللَّهِ تُرجَعُ الأُمورُ\n" +
                    "TRANSLITERATION\n" +
                    "lahū mulku s-samāwāti wa-l-ʾarḍi wa-ʾilā llāhi turjaʿu l-ʾumūru\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "To Him belongs the kingdom of the heavens\n" +
                    "and the earth,\n" +
                    "and to Allah all matters are returned.");
            ayat.add("6\n" +
                    "يولِجُ اللَّيلَ فِي النَّهارِ وَيولِجُ النَّهارَ فِي اللَّيلِ ۚ وَهُوَ عَليمٌ بِذاتِ الصُّدورِ\n" +
                    "TRANSLITERATION\n" +
                    "yūliju l-layla fī n-nahāri wa-yūliju n-nahāra fī l-layli wa-huwa ʿalīmun bi-dhāti ṣ-ṣudūri\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "He makes the night pass into the day\n" +
                    "and makes the day pass into the night,\n" +
                    "and He knows best what is in the breasts.");
            ayat.add("7\n" +
                    "آمِنوا بِاللَّهِ وَرَسولِهِ وَأَنفِقوا مِمّا جَعَلَكُم مُستَخلَفينَ فيهِ ۖ فَالَّذينَ آمَنوا مِنكُم وَأَنفَقوا لَهُم أَجرٌ كَبيرٌ\n" +
                    "TRANSLITERATION\n" +
                    "ʾāminū bi-llāhi wa-rasūlihī wa-ʾanfiqū mimmā jaʿalakum mustakhlafīna fīhi fa-lladhīna ʾāmanū minkum wa-ʾanfaqū lahum ʾajrun kabīrun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Have faith in Allah and His Apostle,\n" +
                    "and spend out of that\n" +
                    "wherein He has made you successors.1\n" +
                    "Those of you who have faith\n" +
                    "and spend [in Allah’s way]\n" +
                    "there is a great reward for them.");
            ayat.add("8\n" +
                    "وَما لَكُم لا تُؤمِنونَ بِاللَّهِ ۙ وَالرَّسولُ يَدعوكُم لِتُؤمِنوا بِرَبِّكُم وَقَد أَخَذَ ميثاقَكُم إِن كُنتُم مُؤمِنينَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-mā lakum lā tuʾminūna bi-llāhi wa-r-rasūlu yadʿūkum li-tuʾminū bi-rabbikum wa-qad ʾakhadha mīthāqakum ʾin kuntum muʾminīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Why should you not have faith in Allah\n" +
                    "while the Apostle invites you\n" +
                    "to have faith in your Lord,\n" +
                    "and He has certainly made a covenant with you,\n" +
                    "should you be faithful?");
            ayat.add("9\n" +
                    "هُوَ الَّذي يُنَزِّلُ عَلىٰ عَبدِهِ آياتٍ بَيِّناتٍ لِيُخرِجَكُم مِنَ الظُّلُماتِ إِلَى النّورِ ۚ وَإِنَّ اللَّهَ بِكُم لَرَءوفٌ رَحيمٌ\n" +
                    "TRANSLITERATION\n" +
                    "huwa lladhī yunazzilu ʿalā ʿabdihī ʾāyātin bayyinātin li-yukhrijakum mina ẓ-ẓulumāti ʾilā n-nūri wa-ʾinna llāha bikum la-raʾūfun raḥīmun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "It is He who sends down\n" +
                    "manifest signs to His servant\n" +
                    "that He may bring you out of darkness into light,\n" +
                    "and indeed Allah is most kind and merciful to you.");
            ayat.add("10\n" +
                    "وَما لَكُم أَلّا تُنفِقوا في سَبيلِ اللَّهِ وَلِلَّهِ ميراثُ السَّماواتِ وَالأَرضِ ۚ لا يَستَوي مِنكُم مَن أَنفَقَ مِن قَبلِ الفَتحِ وَقاتَلَ ۚ أُولٰئِكَ أَعظَمُ دَرَجَةً مِنَ الَّذينَ أَنفَقوا مِن بَعدُ وَقاتَلوا ۚ وَكُلًّا وَعَدَ اللَّهُ الحُسنىٰ ۚ وَاللَّهُ بِما تَعمَلونَ خَبيرٌ\n" +
                    "TRANSLITERATION\n" +
                    "wa-mā lakum ʾallā tunfiqū fī sabīli llāhi wa-li-llāhi mīrāthu s-samāwāti wa-l-ʾarḍi lā yastawī minkum man ʾanfaqa min qabli l-fatḥi wa-qātala ʾulāʾika ʾaʿẓamu darajatan mina lladhīna ʾanfaqū min baʿdu wa-qātalū wa-kullan waʿada llāhu l-ḥusnā wa-llāhu bi-mā taʿmalūna khabīrun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Why should you not spend in the way of Allah,\n" +
                    "while to Allah belongs the heritage of the heavens\n" +
                    "and the earth?\n" +
                    "Not equal [to others] are those of you\n" +
                    "who spent and fought before the victory.1\n" +
                    "They are greater in rank\n" +
                    "than those who have spent and fought afterwards.\n" +
                    "Yet Allah has promised the best reward to each\n" +
                    "and Allah is well aware of what you do.");
            ayat.add("11\n" +
                    "مَن ذَا الَّذي يُقرِضُ اللَّهَ قَرضًا حَسَنًا فَيُضاعِفَهُ لَهُ وَلَهُ أَجرٌ كَريمٌ\n" +
                    "TRANSLITERATION\n" +
                    "man dhā lladhī yuqriḍu llāha qarḍan ḥasanan fa-yuḍāʿifahū lahū wa-lahū ʾajrun karīmun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Who is it that will lend Allah a good loan,\n" +
                    "that He may multiply it for him\n" +
                    "and [that] there may be a noble reward for him?");
            ayat.add("12\n" +
                    "يَومَ تَرَى المُؤمِنينَ وَالمُؤمِناتِ يَسعىٰ نورُهُم بَينَ أَيديهِم وَبِأَيمانِهِم بُشراكُمُ اليَومَ جَنّاتٌ تَجري مِن تَحتِهَا الأَنهارُ خالِدينَ فيها ۚ ذٰلِكَ هُوَ الفَوزُ العَظيمُ\n" +
                    "TRANSLITERATION\n" +
                    "yawma tarā l-muʾminīna wa-l-muʾmināti yasʿā nūruhum bayna ʾaydīhim wa-bi-ʾaymānihim bushrākumu l-yawma jannātun tajrī min taḥtihā l-ʾanhāru khālidīna fīhā dhālika huwa l-fawzu l-ʿaẓīmu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The day you will see the faithful, men and women,\n" +
                    "with their light moving swiftly before them\n" +
                    "and on their right, [and greeted with the words:]\n" +
                    "‘There is good news for you today!\n" +
                    "Gardens with streams running in them,\n" +
                    "to remain in them [forever].\n" +
                    "That is the great success.’");
            ayat.add("13\n" +
                    "يَومَ يَقولُ المُنافِقونَ وَالمُنافِقاتُ لِلَّذينَ آمَنُوا انظُرونا نَقتَبِس مِن نورِكُم قيلَ ارجِعوا وَراءَكُم فَالتَمِسوا نورًا فَضُرِبَ بَينَهُم بِسورٍ لَهُ بابٌ باطِنُهُ فيهِ الرَّحمَةُ وَظاهِرُهُ مِن قِبَلِهِ العَذابُ\n" +
                    "TRANSLITERATION\n" +
                    "yawma yaqūlu l-munāfiqūna wa-l-munāfiqātu li-lladhīna ʾāmanū nẓurūnā naqtabis min nūrikum qīla rjiʿū warāʾakum fa-ltamisū nūran fa-ḍuriba baynahum bi-sūrin lahū bābun bāṭinuhū fīhi r-raḥmatu wa-ẓāhiruhū min qibalihi l-ʿadhābu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The day the hypocrites, men and women, will say\n" +
                    "to the faithful,\n" +
                    "‘Please let up on us,\n" +
                    "that we may glean something from your light!’\n" +
                    "They will be told: ‘Go back and grope for light!’1\n" +
                    "Then there will be set up between them a wall\n" +
                    "with a gate,\n" +
                    "with mercy on its interior\n" +
                    "and punishment toward its exterior.");
            ayat.add("14\n" +
                    "يُنادونَهُم أَلَم نَكُن مَعَكُم ۖ قالوا بَلىٰ وَلٰكِنَّكُم فَتَنتُم أَنفُسَكُم وَتَرَبَّصتُم وَارتَبتُم وَغَرَّتكُمُ الأَمانِيُّ حَتّىٰ جاءَ أَمرُ اللَّهِ وَغَرَّكُم بِاللَّهِ الغَرورُ\n" +
                    "TRANSLITERATION\n" +
                    "yunādūnahum ʾa-lam nakun maʿakum qālū balā wa-lākinnakum fatantum ʾanfusakum wa-tarabbaṣtum wa-rtabtum wa-gharratkumu l-ʾamāniyyu ḥattā jāʾa ʾamru llāhi wa-gharrakum bi-llāhi l-gharūru\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They will call out to them,\n" +
                    "‘Did we not use to be with you?’\n" +
                    "They will say, ‘Yes!\n" +
                    "But you cast yourselves into temptation,\n" +
                    "and you awaited1 and were doubtful,\n" +
                    "and [false] hopes deceived you\n" +
                    "until the edict of Allah2 arrived,\n" +
                    "and the Deceiver deceived you concerning Allah.");
            ayat.add("15\n" +
                    "فَاليَومَ لا يُؤخَذُ مِنكُم فِديَةٌ وَلا مِنَ الَّذينَ كَفَروا ۚ مَأواكُمُ النّارُ ۖ هِيَ مَولاكُم ۖ وَبِئسَ المَصيرُ\n" +
                    "TRANSLITERATION\n" +
                    "fa-l-yawma lā yuʾkhadhu minkum fidyatun wa-lā mina lladhīna kafarū maʾwākumu n-nāru hiya mawlākum wa-biʾsa l-maṣīru\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So today no ransom shall be taken from you,\n" +
                    "nor from the faithless.\n" +
                    "The Fire will be your abode:\n" +
                    "it is your [ultimate] refuge\n" +
                    "and an evil destination.’");
            ayat.add("16\n" +
                    "۞ أَلَم يَأنِ لِلَّذينَ آمَنوا أَن تَخشَعَ قُلوبُهُم لِذِكرِ اللَّهِ وَما نَزَلَ مِنَ الحَقِّ وَلا يَكونوا كَالَّذينَ أوتُوا الكِتابَ مِن قَبلُ فَطالَ عَلَيهِمُ الأَمَدُ فَقَسَت قُلوبُهُم ۖ وَكَثيرٌ مِنهُم فاسِقونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-lam yaʾni li-lladhīna ʾāmanū ʾan takhshaʿa qulūbuhum li-dhikri llāhi wa-mā nazala mina l-ḥaqqi wa-lā yakūnū ka-lladhīna ʾūtū l-kitāba min qablu fa-ṭāla ʿalayhimu l-ʾamadu fa-qasat qulūbuhum wa-kathīrun minhum fāsiqūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Is it not time yet for those who have faith\n" +
                    "that their hearts should be humbled\n" +
                    "for Allah’s remembrance\n" +
                    "and to the truth which has come down [to them],\n" +
                    "and to be not like those who were given the Book\n" +
                    "before?1\n" +
                    "Time took its toll on them\n" +
                    "and so their hearts were hardened,\n" +
                    "and many of them are transgressors.");
            ayat.add("17\n" +
                    "اعلَموا أَنَّ اللَّهَ يُحيِي الأَرضَ بَعدَ مَوتِها ۚ قَد بَيَّنّا لَكُمُ الآياتِ لَعَلَّكُم تَعقِلونَ\n" +
                    "TRANSLITERATION\n" +
                    "iʿlamū ʾanna llāha yuḥyi l-ʾarḍa baʿda mawtihā qad bayyannā lakumu l-ʾāyāti laʿallakum taʿqilūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Know that Allah revives the earth\n" +
                    "after its death.\n" +
                    "We have certainly made the signs clear for you\n" +
                    "so that you may apply reason.");
            ayat.add("18\n" +
                    "إِنَّ المُصَّدِّقينَ وَالمُصَّدِّقاتِ وَأَقرَضُوا اللَّهَ قَرضًا حَسَنًا يُضاعَفُ لَهُم وَلَهُم أَجرٌ كَريمٌ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna l-muṣṣaddiqīna wa-l-muṣṣaddiqāti wa-ʾaqraḍū llāha qarḍan ḥasanan yuḍāʿafu lahum wa-lahum ʾajrun karīmun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed the charitable men and charitable women,\n" +
                    "and those who lend Allah a good loan\n" +
                    "it shall be multiplied for them,\n" +
                    "and there is a noble reward for them.");
            ayat.add("19\n" +
                    "وَالَّذينَ آمَنوا بِاللَّهِ وَرُسُلِهِ أُولٰئِكَ هُمُ الصِّدّيقونَ ۖ وَالشُّهَداءُ عِندَ رَبِّهِم لَهُم أَجرُهُم وَنورُهُم ۖ وَالَّذينَ كَفَروا وَكَذَّبوا بِآياتِنا أُولٰئِكَ أَصحابُ الجَحيمِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-lladhīna ʾāmanū bi-llāhi wa-rusulihī ʾulāʾika humu ṣ-ṣiddīqūna wa-sh-shuhadāʾu ʿinda rabbihim lahum ʾajruhum wa-nūruhum wa-lladhīna kafarū wa-kadhdhabū bi-ʾāyātinā ʾulāʾika ʾaṣḥābu l-jaḥīmi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Those who have faith in Allah and His apostles\n" +
                    "—it is they who are the truthful\n" +
                    "and the witnesses1 with their Lord;\n" +
                    "they shall have their reward and their light.\n" +
                    "But as for those who are faithless and deny Our signs,\n" +
                    "they shall be the inmates of hell.");
            ayat.add("20\n" +
                    "اعلَموا أَنَّمَا الحَياةُ الدُّنيا لَعِبٌ وَلَهوٌ وَزينَةٌ وَتَفاخُرٌ بَينَكُم وَتَكاثُرٌ فِي الأَموالِ وَالأَولادِ ۖ كَمَثَلِ غَيثٍ أَعجَبَ الكُفّارَ نَباتُهُ ثُمَّ يَهيجُ فَتَراهُ مُصفَرًّا ثُمَّ يَكونُ حُطامًا ۖ وَفِي الآخِرَةِ عَذابٌ شَديدٌ وَمَغفِرَةٌ مِنَ اللَّهِ وَرِضوانٌ ۚ وَمَا الحَياةُ الدُّنيا إِلّا مَتاعُ الغُرورِ\n" +
                    "TRANSLITERATION\n" +
                    "iʿlamū ʾannamā l-ḥayātu d-dunyā laʿibun wa-lahwun wa-zīnatun wa-tafākhurun baynakum wa-takāthurun fī l-ʾamwāli wa-l-ʾawlādi ka-mathali ghaythin ʾaʿjaba l-kuffāra nabātuhū thumma yahīju fa-tarāhu muṣfarran thumma yakūnu ḥuṭāman wa-fī l-ʾākhirati ʿadhābun shadīdun wa-maghfiratun mina llāhi wa-riḍwānun wa-mā l-ḥayātu d-dunyā ʾillā matāʿu l-ghurūri\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Know that the life of this world is just\n" +
                    "play and diversion, and glitter,\n" +
                    "and mutual vainglory among you\n" +
                    "and covetousness1 for wealth and children\n" +
                    "—like the rain\n" +
                    "whose vegetation impresses the farmer;\n" +
                    "then it withers and you see it turn yellow,\n" +
                    "then it becomes chaff,\n" +
                    "while in the Hereafter there is a severe punishment\n" +
                    "and forgiveness from Allah and His pleasure;\n" +
                    "and the life of this world is nothing\n" +
                    "but the wares of delusion.");
            ayat.add("21\n" +
                    "سابِقوا إِلىٰ مَغفِرَةٍ مِن رَبِّكُم وَجَنَّةٍ عَرضُها كَعَرضِ السَّماءِ وَالأَرضِ أُعِدَّت لِلَّذينَ آمَنوا بِاللَّهِ وَرُسُلِهِ ۚ ذٰلِكَ فَضلُ اللَّهِ يُؤتيهِ مَن يَشاءُ ۚ وَاللَّهُ ذُو الفَضلِ العَظيمِ\n" +
                    "TRANSLITERATION\n" +
                    "sābiqū ʾilā maghfiratin min rabbikum wa-jannatin ʿarḍuhā ka-ʿarḍi s-samāʾi wa-l-ʾarḍi ʾuʿiddat li-lladhīna ʾāmanū bi-llāhi wa-rusulihī dhālika faḍlu llāhi yuʾtīhi man yashāʾu wa-llāhu dhū l-faḍli l-ʿaẓīmi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Take the lead towards forgiveness from your Lord\n" +
                    "and a paradise as vast as the heavens\n" +
                    "and the earth,\n" +
                    "prepared for those who have faith in Allah\n" +
                    "and His apostles.\n" +
                    "That is Allah’s grace,\n" +
                    "which He grants to whomever He wishes,\n" +
                    "and Allah is dispenser of a great grace.");
            ayat.add("22\n" +
                    "ما أَصابَ مِن مُصيبَةٍ فِي الأَرضِ وَلا في أَنفُسِكُم إِلّا في كِتابٍ مِن قَبلِ أَن نَبرَأَها ۚ إِنَّ ذٰلِكَ عَلَى اللَّهِ يَسيرٌ\n" +
                    "TRANSLITERATION\n" +
                    "mā ʾaṣāba min muṣībatin fī l-ʾarḍi wa-lā fī ʾanfusikum ʾillā fī kitābin min qabli ʾan nabraʾahā ʾinna dhālika ʿalā llāhi yasīr\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "No affliction visits the earth\n" +
                    "or yourselves\n" +
                    "but it is in a Book before We bring it about\n" +
                    "that is indeed easy for Allah");
            ayat.add("23\n" +
                    "لِكَيلا تَأسَوا عَلىٰ ما فاتَكُم وَلا تَفرَحوا بِما آتاكُم ۗ وَاللَّهُ لا يُحِبُّ كُلَّ مُختالٍ فَخورٍ\n" +
                    "TRANSLITERATION\n" +
                    "li-kay-lā taʾsaw ʿalā mā fātakum wa-lā tafraḥū bi-mā ʾātākum wa-llāhu lā yuḥibbu kulla mukhtālin fakhūrin-i\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "so that you may not grieve for what escapes you,\n" +
                    "nor exult for what comes your way,\n" +
                    "and Allah does not like any swaggering braggart.");
            ayat.add("24\n" +
                    "الَّذينَ يَبخَلونَ وَيَأمُرونَ النّاسَ بِالبُخلِ ۗ وَمَن يَتَوَلَّ فَإِنَّ اللَّهَ هُوَ الغَنِيُّ الحَميدُ\n" +
                    "TRANSLITERATION\n" +
                    "alladhīna yabkhalūna wa-yaʾmurūna n-nāsa bi-l-bukhli wa-man yatawalla fa-ʾinna llāha huwa l-ghaniyyu l-ḥamīdu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Such as are [themselves] stingy\n" +
                    "and bid [other] people to be stingy.\n" +
                    "And whoever refuses to comply [should know that]\n" +
                    "indeed Allah is the All-sufficient, the All-laudable.");
            ayat.add("25\n" +
                    "لَقَد أَرسَلنا رُسُلَنا بِالبَيِّناتِ وَأَنزَلنا مَعَهُمُ الكِتابَ وَالميزانَ لِيَقومَ النّاسُ بِالقِسطِ ۖ وَأَنزَلنَا الحَديدَ فيهِ بَأسٌ شَديدٌ وَمَنافِعُ لِلنّاسِ وَلِيَعلَمَ اللَّهُ مَن يَنصُرُهُ وَرُسُلَهُ بِالغَيبِ ۚ إِنَّ اللَّهَ قَوِيٌّ عَزيزٌ\n" +
                    "TRANSLITERATION\n" +
                    "la-qad ʾarsalnā rusulanā bi-l-bayyināti wa-ʾanzalnā maʿahumu l-kitāba wa-l-mīzāna li-yaqūma n-nāsu bi-l-qisṭi wa-ʾanzalnā l-ḥadīda fīhi baʾsun shadīdun wa-manāfiʿu li-n-nāsi wa-li-yaʿlama llāhu man yanṣuruhū wa-rusulahū bi-l-ghaybi ʾinna llāha qawiyyun ʿazīzun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Certainly We sent Our apostles with manifest proofs,\n" +
                    "and We sent down with them the Book\n" +
                    "and the Balance,\n" +
                    "so that mankind may maintain justice;\n" +
                    "and We sent down1 iron,\n" +
                    "in which there is great might\n" +
                    "and uses for mankind,\n" +
                    "and so that Allah may know those who help Him\n" +
                    "and His apostles in [their] absence.\n" +
                    "Indeed Allah is all-strong, all-mighty.");
            ayat.add("26\n" +
                    "وَلَقَد أَرسَلنا نوحًا وَإِبراهيمَ وَجَعَلنا في ذُرِّيَّتِهِمَا النُّبُوَّةَ وَالكِتابَ ۖ فَمِنهُم مُهتَدٍ ۖ وَكَثيرٌ مِنهُم فاسِقونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-la-qad ʾarsalnā nūḥan wa-ʾibrāhīma wa-jaʿalnā fī dhurriyyatihimā n-nubuwwata wa-l-kitāba fa-minhum muhtadin wa-kathīrun minhum fāsiqūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Certainly We sent Noah and Abraham\n" +
                    "and We ordained among their descendants\n" +
                    "prophethood and the Book.\n" +
                    "Some of them are [rightly] guided,\n" +
                    "and many of them are transgressors.");
            ayat.add("27\n" +
                    "ثُمَّ قَفَّينا عَلىٰ آثارِهِم بِرُسُلِنا وَقَفَّينا بِعيسَى ابنِ مَريَمَ وَآتَيناهُ الإِنجيلَ وَجَعَلنا في قُلوبِ الَّذينَ اتَّبَعوهُ رَأفَةً وَرَحمَةً وَرَهبانِيَّةً ابتَدَعوها ما كَتَبناها عَلَيهِم إِلَّا ابتِغاءَ رِضوانِ اللَّهِ فَما رَعَوها حَقَّ رِعايَتِها ۖ فَآتَينَا الَّذينَ آمَنوا مِنهُم أَجرَهُم ۖ وَكَثيرٌ مِنهُم فاسِقونَ\n" +
                    "TRANSLITERATION\n" +
                    "thumma qaffaynā ʿalā ʾāthārihim bi-rusulinā wa-qaffaynā bi-ʿīsā bni maryama wa-ʾātaynāhu l-ʾinjīla wa-jaʿalnā fī qulūbi lladhīna ttabaʿūhu raʾfatan wa-raḥmatan wa-rahbāniyyatan-i btadaʿūhā mā katabnāhā ʿalayhim ʾillā btighāʾa riḍwāni llāhi fa-mā raʿawhā ḥaqqa riʿāyatihā fa-ʾātaynā lladhīna ʾāmanū minhum ʾajrahum wa-kathīrun minhum fāsiqūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Then We followed them up with Our apostles\n" +
                    "and We followed [them] with Jesus son of Mary,\n" +
                    "and We gave him the Evangel,\n" +
                    "and We put in the hearts of those who followed him\n" +
                    "kindness and mercy.\n" +
                    "But as for monasticism, they innovated it\n" +
                    "—We had not prescribed it for them—\n" +
                    "only seeking Allah’s pleasure.\n" +
                    "Yet they did not observe it with due observance.\n" +
                    "So We gave to the faithful among them\n" +
                    "their [due] reward,\n" +
                    "but many of them are transgressors.");
            ayat.add("28\n" +
                    "يا أَيُّهَا الَّذينَ آمَنُوا اتَّقُوا اللَّهَ وَآمِنوا بِرَسولِهِ يُؤتِكُم كِفلَينِ مِن رَحمَتِهِ وَيَجعَل لَكُم نورًا تَمشونَ بِهِ وَيَغفِر لَكُم ۚ وَاللَّهُ غَفورٌ رَحيمٌ\n" +
                    "TRANSLITERATION\n" +
                    "yā-ʾayyuhā lladhīna ʾāmanū ttaqū llāha wa-ʾāminū bi-rasūlihī yuʾtikum kiflayni min raḥmatihī wa-yajʿal lakum nūran tamshūna bihī wa-yaghfir lakum wa-llāhu ghafūrun raḥīmun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "O you who have faith!\n" +
                    "Be wary of Allah\n" +
                    "and have faith in His Apostle.\n" +
                    "He will grant you a double share of His mercy\n" +
                    "and give you a light to walk by,\n" +
                    "and forgive you,\n" +
                    "and Allah is all-forgiving, all-merciful;");
            ayat.add("29\n" +
                    "لِئَلّا يَعلَمَ أَهلُ الكِتابِ أَلّا يَقدِرونَ عَلىٰ شَيءٍ مِن فَضلِ اللَّهِ ۙ وَأَنَّ الفَضلَ بِيَدِ اللَّهِ يُؤتيهِ مَن يَشاءُ ۚ وَاللَّهُ ذُو الفَضلِ العَظيمِ\n" +
                    "TRANSLITERATION\n" +
                    "li-ʾallā yaʿlama ʾahlu l-kitābi ʾallā yaqdirūna ʿalā shayʾin min faḍli llāhi wa-ʾanna l-faḍla bi-yadi llāhi yuʾtīhi man yashāʾu wa-llāhu dhū l-faḍli l-ʿaẓīmi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "so that the People of the Book may know\n" +
                    "that they have no power over anything\n" +
                    "of Allah’s grace,\n" +
                    "and that all grace is in Allah’s hand\n" +
                    "which He grants to whomever He wishes\n" +
                    "and Allah is dispenser of a great grace");
        }
        else if (surahName.equals("58. Al-Mujadilah"))
        {
            setTitle("Al-Mujadilah(المجادلة) : The Pleader");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "قَد سَمِعَ اللَّهُ قَولَ الَّتي تُجادِلُكَ في زَوجِها وَتَشتَكي إِلَى اللَّهِ وَاللَّهُ يَسمَعُ تَحاوُرَكُما ۚ إِنَّ اللَّهَ سَميعٌ بَصيرٌ\n" +
                    "TRANSLITERATION\n" +
                    "qad samiʿa llāhu qawla llatī tujādiluka fī zawjihā wa-tashtakī ʾilā llāhi wa-llāhu yasmaʿu taḥāwurakumā ʾinna llāha samīʿun baṣīrun-i\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Allah has certainly heard the speech of her\n" +
                    "who pleads with you about her husband\n" +
                    "and complains to Allah.\n" +
                    "Allah hears the conversation between the two of you.\n" +
                    "Indeed Allah is all-hearing, all-seeing.");
            ayat.add("2\n" +
                    "الَّذينَ يُظاهِرونَ مِنكُم مِن نِسائِهِم ما هُنَّ أُمَّهاتِهِم ۖ إِن أُمَّهاتُهُم إِلَّا اللّائي وَلَدنَهُم ۚ وَإِنَّهُم لَيَقولونَ مُنكَرًا مِنَ القَولِ وَزورًا ۚ وَإِنَّ اللَّهَ لَعَفُوٌّ غَفورٌ\n" +
                    "TRANSLITERATION\n" +
                    "alladhīna yuẓāhirūna minkum min nisāʾihim mā hunna ʾummahātihim ʾin ʾummahātuhum ʾillā llāʾī waladnahum wa-ʾinnahum la-yaqūlūna munkaran mina l-qawli wa-zūran wa-ʾinna llāha la-ʿafuwwun ghafūrun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "As for those of you who repudiate their wives by ẓihār,1\n" +
                    "they are not their mothers;\n" +
                    "their mothers are only those who bore them,\n" +
                    "and indeed they utter an outrageous utterance\n" +
                    "and a lie.\n" +
                    "Indeed Allah is all-excusing, all-forgiving.");
            ayat.add("3\n" +
                    "وَالَّذينَ يُظاهِرونَ مِن نِسائِهِم ثُمَّ يَعودونَ لِما قالوا فَتَحريرُ رَقَبَةٍ مِن قَبلِ أَن يَتَماسّا ۚ ذٰلِكُم توعَظونَ بِهِ ۚ وَاللَّهُ بِما تَعمَلونَ خَبيرٌ\n" +
                    "TRANSLITERATION\n" +
                    "wa-lladhīna yuẓāhirūna min nisāʾihim thumma yaʿūdūna li-mā qālū fa-taḥrīru raqabatin min qabli ʾan yatamāssā dhālikum tūʿaẓūna bihī wa-llāhu bi-mā taʿmalūna khabīrun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Those who repudiate their wives by ẓihār\n" +
                    "and then retract what they have said,\n" +
                    "shall set free a slave before they may touch each other.\n" +
                    "This you are advised [to carry out],\n" +
                    "and Allah is well aware of what you do.");
            ayat.add("4\n" +
                    "فَمَن لَم يَجِد فَصِيامُ شَهرَينِ مُتَتابِعَينِ مِن قَبلِ أَن يَتَماسّا ۖ فَمَن لَم يَستَطِع فَإِطعامُ سِتّينَ مِسكينًا ۚ ذٰلِكَ لِتُؤمِنوا بِاللَّهِ وَرَسولِهِ ۚ وَتِلكَ حُدودُ اللَّهِ ۗ وَلِلكافِرينَ عَذابٌ أَليمٌ\n" +
                    "TRANSLITERATION\n" +
                    "fa-man lam yajid fa-ṣiyāmu shahrayni mutatābiʿayni min qabli ʾan yatamāssā fa-man lam yastaṭiʿ fa-ʾiṭʿāmu sittīna miskīnan dhālika li-tuʾminū bi-llāhi wa-rasūlihī wa-tilka ḥudūdu llāhi wa-li-l-kāfirīna ʿadhābun ʾalīmun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "He who can not afford [to free a slave]\n" +
                    "shall fast for two successive months\n" +
                    "before they may touch each other.\n" +
                    "If he cannot [do so],\n" +
                    "he shall feed sixty needy persons.\n" +
                    "This, that you may have faith in Allah and His Apostle.\n" +
                    "These are Allah’s bounds,\n" +
                    "and there is a painful punishment for the faithless.");
            ayat.add("5\n" +
                    "إِنَّ الَّذينَ يُحادّونَ اللَّهَ وَرَسولَهُ كُبِتوا كَما كُبِتَ الَّذينَ مِن قَبلِهِم ۚ وَقَد أَنزَلنا آياتٍ بَيِّناتٍ ۚ وَلِلكافِرينَ عَذابٌ مُهينٌ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna lladhīna yuḥāddūna llāha wa-rasūlahū kubitū ka-mā kubita lladhīna min qablihim wa-qad ʾanzalnā ʾāyātin bayyinātin wa-li-l-kāfirīna ʿadhābun muhīnun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed those who oppose Allah and His Apostle\n" +
                    "will be subdued\n" +
                    "just as were subdued those before them.\n" +
                    "We have certainly sent down manifest signs,\n" +
                    "and there is a humiliating punishment for the faithless.");
            ayat.add("6\n" +
                    "يَومَ يَبعَثُهُمُ اللَّهُ جَميعًا فَيُنَبِّئُهُم بِما عَمِلوا ۚ أَحصاهُ اللَّهُ وَنَسوهُ ۚ وَاللَّهُ عَلىٰ كُلِّ شَيءٍ شَهيدٌ\n" +
                    "TRANSLITERATION\n" +
                    "yawma yabʿathuhumu llāhu jamīʿan fa-yunabbiʾuhum bi-mā ʿamilū ʾaḥṣāhu llāhu wa-nasūhu wa-llāhu ʿalā kulli shayʾin shahīdun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The day when Allah will raise them all together,\n" +
                    "He will inform them about what they have done.\n" +
                    "Allah has kept account of it, while they forgot it,\n" +
                    "and Allah is witness to all things.");
            ayat.add("7\n" +
                    "أَلَم تَرَ أَنَّ اللَّهَ يَعلَمُ ما فِي السَّماواتِ وَما فِي الأَرضِ ۖ ما يَكونُ مِن نَجوىٰ ثَلاثَةٍ إِلّا هُوَ رابِعُهُم وَلا خَمسَةٍ إِلّا هُوَ سادِسُهُم وَلا أَدنىٰ مِن ذٰلِكَ وَلا أَكثَرَ إِلّا هُوَ مَعَهُم أَينَ ما كانوا ۖ ثُمَّ يُنَبِّئُهُم بِما عَمِلوا يَومَ القِيامَةِ ۚ إِنَّ اللَّهَ بِكُلِّ شَيءٍ عَليمٌ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-lam tara ʾanna llāha yaʿlamu mā fī s-samāwāti wa-mā fī l-ʾarḍi mā yakūnu min najwā thalāthatin ʾillā huwa rābiʿuhum wa-lā khamsatin ʾillā huwa sādisuhum wa-lā ʾadnā min dhālika wa-lā ʾakthara ʾillā huwa maʿahum ʾayna mā kānū thumma yunabbiʾuhum bi-mā ʿamilū yawma l-qiyāmati ʾinna llāha bi-kulli shayʾin ʿalīmun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Have you not regarded that Allah knows\n" +
                    "whatever there is in the heavens\n" +
                    "and whatever there is in the earth?\n" +
                    "There is no secret talk among three,\n" +
                    "but He is their fourth [companion],\n" +
                    "nor among five but He is their sixth,\n" +
                    "nor less than that, nor more,\n" +
                    "but He is with them wherever they may be.\n" +
                    "Then He will inform them about what they have done\n" +
                    "on the Day of Resurrection.\n" +
                    "Indeed Allah has knowledge of all things.");
            ayat.add("8\n" +
                    "أَلَم تَرَ إِلَى الَّذينَ نُهوا عَنِ النَّجوىٰ ثُمَّ يَعودونَ لِما نُهوا عَنهُ وَيَتَناجَونَ بِالإِثمِ وَالعُدوانِ وَمَعصِيَتِ الرَّسولِ وَإِذا جاءوكَ حَيَّوكَ بِما لَم يُحَيِّكَ بِهِ اللَّهُ وَيَقولونَ في أَنفُسِهِم لَولا يُعَذِّبُنَا اللَّهُ بِما نَقولُ ۚ حَسبُهُم جَهَنَّمُ يَصلَونَها ۖ فَبِئسَ المَصيرُ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-lam tara ʾilā lladhīna nuhū ʿani n-najwā thumma yaʿūdūna li-mā nuhū ʿanhu wa-yatanājawna bi-l-ʾithmi wa-l-ʿudwāni wa-maʿṣiyati r-rasūli wa-ʾidhā jāʾūka ḥayyawka bi-mā lam yuḥayyika bihi llāhu wa-yaqūlūna fī ʾanfusihim law-lā yuʿadhdhibunā llāhu bi-mā naqūlu ḥasbuhum jahannamu yaṣlawnahā fa-biʾsa l-maṣīru\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Have you not regarded those\n" +
                    "who were forbidden from secret talks1\n" +
                    "but again resumed\n" +
                    "what they had been forbidden from,\n" +
                    "and hold secret talks\n" +
                    "[imbued] with sin and transgression\n" +
                    "and disobedience to the Apostle?\n" +
                    "And when they2 come to you\n" +
                    "they greet you with that\n" +
                    "with which Allah never greeted you,\n" +
                    "and they say to themselves,3\n" +
                    "‘Why does not Allah punish us for what we say?!’\n" +
                    "Let hell suffice them: they shall enter it;\n" +
                    "and it is an evil destination!");
            ayat.add("9\n" +
                    "يا أَيُّهَا الَّذينَ آمَنوا إِذا تَناجَيتُم فَلا تَتَناجَوا بِالإِثمِ وَالعُدوانِ وَمَعصِيَتِ الرَّسولِ وَتَناجَوا بِالبِرِّ وَالتَّقوىٰ ۖ وَاتَّقُوا اللَّهَ الَّذي إِلَيهِ تُحشَرونَ\n" +
                    "TRANSLITERATION\n" +
                    "yā-ʾayyuhā lladhīna ʾāmanū ʾidhā tanājaytum fa-lā tatanājaw bi-l-ʾithmi wa-l-ʿudwāni wa-maʿṣiyati r-rasūli wa-tanājaw bi-l-birri wa-t-taqwā wa-ttaqū llāha lladhī ʾilayhi tuḥsharūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "O you who have faith!\n" +
                    "When you talk secretly,\n" +
                    "do not hold secret talks\n" +
                    "[imbued] with sin and aggression\n" +
                    "and disobedience to the Apostle,\n" +
                    "but talk secretly in [a spirit of] piety\n" +
                    "and Godfearing,\n" +
                    "and be wary of Allah\n" +
                    "toward whom you will be mustered.");
            ayat.add("10\n" +
                    "إِنَّمَا النَّجوىٰ مِنَ الشَّيطانِ لِيَحزُنَ الَّذينَ آمَنوا وَلَيسَ بِضارِّهِم شَيئًا إِلّا بِإِذنِ اللَّهِ ۚ وَعَلَى اللَّهِ فَليَتَوَكَّلِ المُؤمِنونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnamā n-najwā mina sh-shayṭāni li-yaḥzuna lladhīna ʾāmanū wa-laysa bi-ḍārrihim shayʾan ʾillā bi-ʾidhni llāhi wa-ʿalā llāhi fa-l-yatawakkali l-muʾminūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed [malicious] secret talks are from Satan,\n" +
                    "that he may upset the faithful,\n" +
                    "but he cannot harm them in any way\n" +
                    "except by Allah’s leave,\n" +
                    "and in Allah let all the faithful put their trust.");
            ayat.add("11\n" +
                    "يا أَيُّهَا الَّذينَ آمَنوا إِذا قيلَ لَكُم تَفَسَّحوا فِي المَجالِسِ فَافسَحوا يَفسَحِ اللَّهُ لَكُم ۖ وَإِذا قيلَ انشُزوا فَانشُزوا يَرفَعِ اللَّهُ الَّذينَ آمَنوا مِنكُم وَالَّذينَ أوتُوا العِلمَ دَرَجاتٍ ۚ وَاللَّهُ بِما تَعمَلونَ خَبيرٌ\n" +
                    "TRANSLITERATION\n" +
                    "yā-ʾayyuhā lladhīna ʾāmanū ʾidhā qīla lakum tafassaḥū fī l-majālisi fa-fsaḥū yafsaḥi llāhu lakum wa-ʾidhā qīla nshuzū fa-nshuzū yarfaʿi llāhu lladhīna ʾāmanū minkum wa-lladhīna ʾūtū l-ʿilma darajātin wa-llāhu bi-mā taʿmalūna khabīrun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "O you who have faith!\n" +
                    "When you are told, ‘Make room,’ in sittings,\n" +
                    "then do make room;\n" +
                    "Allah will make room for you.\n" +
                    "And when you are told, ‘Rise up!’\n" +
                    "Do rise up.\n" +
                    "Allah will raise those of you who have faith\n" +
                    "and those who have been given knowledge\n" +
                    "in rank,\n" +
                    "and Allah is well aware of what you do.");
            ayat.add("12\n" +
                    "يا أَيُّهَا الَّذينَ آمَنوا إِذا ناجَيتُمُ الرَّسولَ فَقَدِّموا بَينَ يَدَي نَجواكُم صَدَقَةً ۚ ذٰلِكَ خَيرٌ لَكُم وَأَطهَرُ ۚ فَإِن لَم تَجِدوا فَإِنَّ اللَّهَ غَفورٌ رَحيمٌ\n" +
                    "TRANSLITERATION\n" +
                    "yā-ʾayyuhā lladhīna ʾāmanū ʾidhā nājaytumu r-rasūla fa-qaddimū bayna yaday najwākum ṣadaqatan dhālika khayrun lakum wa-ʾaṭharu fa-ʾin lam tajidū fa-ʾinna llāha ghafūrun raḥīmun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "O you who have faith!\n" +
                    "When you talk secretly to the Apostle,\n" +
                    "offer a charity before your secret talk.\n" +
                    "That is better for you and purer.\n" +
                    "But if you cannot afford [to make the offering],\n" +
                    "then Allah is indeed all-forgiving, all-merciful.");
            ayat.add("13\n" +
                    "أَأَشفَقتُم أَن تُقَدِّموا بَينَ يَدَي نَجواكُم صَدَقاتٍ ۚ فَإِذ لَم تَفعَلوا وَتابَ اللَّهُ عَلَيكُم فَأَقيمُوا الصَّلاةَ وَآتُوا الزَّكاةَ وَأَطيعُوا اللَّهَ وَرَسولَهُ ۚ وَاللَّهُ خَبيرٌ بِما تَعمَلونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-ʾashfaqtum ʾan tuqaddimū bayna yaday najwākum ṣadaqātin fa-ʾidh lam tafʿalū wa-tāba llāhu ʿalaykum fa-ʾaqīmū ṣ-ṣalāta wa-ʾātū z-zakāta wa-ʾaṭīʿū llāha wa-rasūlahū wa-llāhu khabīrun bi-mā taʿmalūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Were you apprehensive of offering\n" +
                    "charities before your secret talks?\n" +
                    "So, as you did not do it,\n" +
                    "and Allah was clement to you,\n" +
                    "maintain the prayer and pay the zakāt,\n" +
                    "and obey Allah and His Apostle.\n" +
                    "And Allah is well aware of what you do.");
            ayat.add("14\n" +
                    "۞ أَلَم تَرَ إِلَى الَّذينَ تَوَلَّوا قَومًا غَضِبَ اللَّهُ عَلَيهِم ما هُم مِنكُم وَلا مِنهُم وَيَحلِفونَ عَلَى الكَذِبِ وَهُم يَعلَمونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-lam tara ʾilā lladhīna tawallaw qawman ghaḍiba llāhu ʿalayhim mā hum minkum wa-lā minhum wa-yaḥlifūna ʿalā l-kadhibi wa-hum yaʿlamūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Have you not regarded\n" +
                    "those who befriend a people1\n" +
                    "at whom Allah is wrathful?\n" +
                    "They neither belong to you, nor to them,\n" +
                    "and they swear false oaths [that they are with you]\n" +
                    "and they know.");
            ayat.add("15\n" +
                    "أَعَدَّ اللَّهُ لَهُم عَذابًا شَديدًا ۖ إِنَّهُم ساءَ ما كانوا يَعمَلونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾaʿadda llāhu lahum ʿadhāban shadīdan ʾinnahum sāʾa mā kānū yaʿmalūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Allah has prepared a severe punishment for them.\n" +
                    "Evil indeed is what they used to do.");
            ayat.add("16\n" +
                    "اتَّخَذوا أَيمانَهُم جُنَّةً فَصَدّوا عَن سَبيلِ اللَّهِ فَلَهُم عَذابٌ مُهينٌ\n" +
                    "TRANSLITERATION\n" +
                    "ittakhadhū ʾaymānahum junnatan fa-ṣaddū ʿan sabīli llāhi fa-lahum ʿadhābun muhīnun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They make a shield of their oaths\n" +
                    "and bar [people] from the way of Allah;\n" +
                    "so there is a humiliating punishment for them.");
            ayat.add("17\n" +
                    "لَن تُغنِيَ عَنهُم أَموالُهُم وَلا أَولادُهُم مِنَ اللَّهِ شَيئًا ۚ أُولٰئِكَ أَصحابُ النّارِ ۖ هُم فيها خالِدونَ\n" +
                    "TRANSLITERATION\n" +
                    "lan tughniya ʿanhum ʾamwāluhum wa-lā ʾawlāduhum mina llāhi shayʾan ʾulāʾika ʾaṣḥābu n-nāri hum fīhā khālidūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Their possessions and children will not avail them\n" +
                    "in any way against Allah.\n" +
                    "They shall be the inmates of the Fire\n" +
                    "and they shall remain in it [forever].");
            ayat.add("18\n" +
                    "يَومَ يَبعَثُهُمُ اللَّهُ جَميعًا فَيَحلِفونَ لَهُ كَما يَحلِفونَ لَكُم ۖ وَيَحسَبونَ أَنَّهُم عَلىٰ شَيءٍ ۚ أَلا إِنَّهُم هُمُ الكاذِبونَ\n" +
                    "TRANSLITERATION\n" +
                    "yawma yabʿathuhumu llāhu jamīʿan fa-yaḥlifūna lahū ka-mā yaḥlifūna lakum wa-yaḥsabūna ʾannahum ʿalā shayʾin ʾa-lā ʾinnahum humu l-kādhibūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The day when Allah will raise them all together,\n" +
                    "they will swear to Him,\n" +
                    "just like they swear to you [now],\n" +
                    "supposing that they stand on something.\n" +
                    "Look! They are indeed liars!");
            ayat.add("19\n" +
                    "استَحوَذَ عَلَيهِمُ الشَّيطانُ فَأَنساهُم ذِكرَ اللَّهِ ۚ أُولٰئِكَ حِزبُ الشَّيطانِ ۚ أَلا إِنَّ حِزبَ الشَّيطانِ هُمُ الخاسِرونَ\n" +
                    "TRANSLITERATION\n" +
                    "istaḥwadha ʿalayhimu sh-shayṭānu fa-ʾansāhum dhikra llāhi ʾulāʾika ḥizbu sh-shayṭāni ʾa-lā ʾinna ḥizba sh-shayṭāni humu l-khāsirūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Satan has prevailed upon them,\n" +
                    "so he has caused them to forget\n" +
                    "the remembrance of Allah.\n" +
                    "They are Satan’s confederates.\n" +
                    "Look!\n" +
                    "Indeed it is Satan’s confederates who are the losers!");
            ayat.add("20\n" +
                    "إِنَّ الَّذينَ يُحادّونَ اللَّهَ وَرَسولَهُ أُولٰئِكَ فِي الأَذَلّينَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna lladhīna yuḥāddūna llāha wa-rasūlahū ʾulāʾika fī l-ʾadhallīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed those who oppose Allah and His Apostle\n" +
                    "they will be among the most abased.");
            ayat.add("21\n" +
                    "كَتَبَ اللَّهُ لَأَغلِبَنَّ أَنا وَرُسُلي ۚ إِنَّ اللَّهَ قَوِيٌّ عَزيزٌ\n" +
                    "TRANSLITERATION\n" +
                    "kataba llāhu la-ʾaghlibanna ʾana wa-rusulī ʾinna llāha qawiyyun ʿazīzun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Allah has ordained: ‘I shall surely prevail,\n" +
                    "I and My apostles.’\n" +
                    "Indeed Allah is all-strong, all-mighty.");
            ayat.add("22\n" +
                    "لا تَجِدُ قَومًا يُؤمِنونَ بِاللَّهِ وَاليَومِ الآخِرِ يُوادّونَ مَن حادَّ اللَّهَ وَرَسولَهُ وَلَو كانوا آباءَهُم أَو أَبناءَهُم أَو إِخوانَهُم أَو عَشيرَتَهُم ۚ أُولٰئِكَ كَتَبَ في قُلوبِهِمُ الإيمانَ وَأَيَّدَهُم بِروحٍ مِنهُ ۖ وَيُدخِلُهُم جَنّاتٍ تَجري مِن تَحتِهَا الأَنهارُ خالِدينَ فيها ۚ رَضِيَ اللَّهُ عَنهُم وَرَضوا عَنهُ ۚ أُولٰئِكَ حِزبُ اللَّهِ ۚ أَلا إِنَّ حِزبَ اللَّهِ هُمُ المُفلِحونَ\n" +
                    "TRANSLITERATION\n" +
                    "lā tajidu qawman yuʾminūna bi-llāhi wa-l-yawmi l-ʾākhiri yuwāddūna man ḥādda llāha wa-rasūlahū wa-law kānū ʾābāʾahum ʾaw ʾabnāʾahum ʾaw ʾikhwānahum ʾaw ʿashīratahum ʾulāʾika kataba fī qulūbihimu l-ʾīmāna wa-ʾayyadahum bi-rūḥin minhu wa-yudkhiluhum jannātin tajrī min taḥtihā l-ʾanhāru khālidīna fīhā raḍiya llāhu ʿanhum wa-raḍū ʿanhu ʾulāʾika ḥizbu llāhi ʾa-lā ʾinna ḥizba llāhi humu l-mufliḥūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "You will not find a people believing in Allah\n" +
                    "and the Last Day\n" +
                    "endearing those who oppose Allah and His Apostle\n" +
                    "even though they were their own parents,\n" +
                    "or children,\n" +
                    "or brothers, or kinsfolk.\n" +
                    "[For] such, He has written faith into their hearts\n" +
                    "and strengthened them with a spirit from Him.\n" +
                    "He will admit them into gardens\n" +
                    "with streams running in them,\n" +
                    "to remain in them [forever],\n" +
                    "Allah is pleased with them,\n" +
                    "and they are pleased with Him.\n" +
                    "They are Allah’s confederates.\n" +
                    "Look!\n" +
                    "The confederates of Allah are indeed felicitous!");
        }
        else if (surahName.equals("59. Al-Hashr"))
        {
            setTitle("Al-Hashr(الحشر) : The Banishment");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "سَبَّحَ لِلَّهِ ما فِي السَّماواتِ وَما فِي الأَرضِ ۖ وَهُوَ العَزيزُ الحَكيمُ\n" +
                    "TRANSLITERATION\n" +
                    "sabbaḥa li-llāhi mā fī s-samāwāti wa-mā fī l-ʾarḍi wa-huwa l-ʿazīzu l-ḥakīmu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Whatever there is in the heavens glorifies Allah\n" +
                    "and whatever there is in the earth,\n" +
                    "and He is the All-mighty, the All-wise.");
            ayat.add("2\n" +
                    "هُوَ الَّذي أَخرَجَ الَّذينَ كَفَروا مِن أَهلِ الكِتابِ مِن دِيارِهِم لِأَوَّلِ الحَشرِ ۚ ما ظَنَنتُم أَن يَخرُجوا ۖ وَظَنّوا أَنَّهُم مانِعَتُهُم حُصونُهُم مِنَ اللَّهِ فَأَتاهُمُ اللَّهُ مِن حَيثُ لَم يَحتَسِبوا ۖ وَقَذَفَ في قُلوبِهِمُ الرُّعبَ ۚ يُخرِبونَ بُيوتَهُم بِأَيديهِم وَأَيدِي المُؤمِنينَ فَاعتَبِروا يا أُولِي الأَبصارِ\n" +
                    "TRANSLITERATION\n" +
                    "huwa lladhī ʾakhraja lladhīna kafarū min ʾahli l-kitābi min diyārihim li-ʾawwali l-ḥashri mā ẓanantum ʾan yakhrujū wa-ẓannū ʾannahum māniʿatuhum ḥuṣūnuhum mina llāhi fa-ʾatāhumu llāhu min ḥaythu lam yaḥtasibū wa-qadhafa fī qulūbihimu r-ruʿba yukhribūna buyūtahum bi-ʾaydīhim wa-ʾaydī l-muʾminīna fa-ʿtabirū yā-ʾulī l-ʾabṣāri\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "It is He who expelled the faithless\n" +
                    "belonging to the People of the Book\n" +
                    "from their homes\n" +
                    "at the outset of [their] en masse banishment.\n" +
                    "You did not think that they would go out,\n" +
                    "and they thought their fortresses would protect them\n" +
                    "from Allah.\n" +
                    "But Allah came at them\n" +
                    "from whence they did not reckon\n" +
                    "and He cast terror into their hearts.\n" +
                    "They demolish their houses with their own hands\n" +
                    "and the hands of the faithful.\n" +
                    "So take lesson, O you who have insight!");
            ayat.add("3\n" +
                    "وَلَولا أَن كَتَبَ اللَّهُ عَلَيهِمُ الجَلاءَ لَعَذَّبَهُم فِي الدُّنيا ۖ وَلَهُم فِي الآخِرَةِ عَذابُ النّارِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-law-lā ʾan kataba llāhu ʿalayhimu l-jalāʾa la-ʿadhdhabahum fī d-dunyā wa-lahum fī l-ʾākhirati ʿadhābu n-nāri\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "If Allah had not ordained banishment for them,\n" +
                    "He would have surely punished them in this world,\n" +
                    "and in the Hereafter there is for them\n" +
                    "the punishment of the Fire.");
            ayat.add("4\n" +
                    "ذٰلِكَ بِأَنَّهُم شاقُّوا اللَّهَ وَرَسولَهُ ۖ وَمَن يُشاقِّ اللَّهَ فَإِنَّ اللَّهَ شَديدُ العِقابِ\n" +
                    "TRANSLITERATION\n" +
                    "dhālika bi-ʾannahum shāqqū llāha wa-rasūlahū wa-man yushāqqi llāha fa-ʾinna llāha shadīdu l-ʿiqābi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "That is because they defied Allah and His Apostle;\n" +
                    "and whoever defies Allah,\n" +
                    "indeed Allah is severe in retribution.");
            ayat.add("5\n" +
                    "ما قَطَعتُم مِن لينَةٍ أَو تَرَكتُموها قائِمَةً عَلىٰ أُصولِها فَبِإِذنِ اللَّهِ وَلِيُخزِيَ الفاسِقينَ\n" +
                    "TRANSLITERATION\n" +
                    "mā qaṭaʿtum min līnatin ʾaw taraktumūhā qāʾimatan ʿalā ʾuṣūlihā fa-bi-ʾidhni llāhi wa-li-yukhziya l-fāsiqīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Whatever palm trees you cut down\n" +
                    "or left standing on their roots,\n" +
                    "it was by Allah’s will,\n" +
                    "and in order that He may disgrace the transgressors.");
            ayat.add("6\n" +
                    "وَما أَفاءَ اللَّهُ عَلىٰ رَسولِهِ مِنهُم فَما أَوجَفتُم عَلَيهِ مِن خَيلٍ وَلا رِكابٍ وَلٰكِنَّ اللَّهَ يُسَلِّطُ رُسُلَهُ عَلىٰ مَن يَشاءُ ۚ وَاللَّهُ عَلىٰ كُلِّ شَيءٍ قَديرٌ\n" +
                    "TRANSLITERATION\n" +
                    "wa-mā ʾafāʾa llāhu ʿalā rasūlihī minhum fa-mā ʾawjaftum ʿalayhi min khaylin wa-lā rikābin wa-lākinna llāha yusalliṭu rusulahū ʿalā man yashāʾu wa-llāhu ʿalā kulli shayʾin qadīrun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The spoils that Allah gave to His Apostle from them,\n" +
                    "you did not spur any horse for its sake,\n" +
                    "nor any riding camel,\n" +
                    "but Allah makes His apostles prevail\n" +
                    "over whomever He wishes,\n" +
                    "and Allah has power over all things.");
            ayat.add("7\n" +
                    "ما أَفاءَ اللَّهُ عَلىٰ رَسولِهِ مِن أَهلِ القُرىٰ فَلِلَّهِ وَلِلرَّسولِ وَلِذِي القُربىٰ وَاليَتامىٰ وَالمَساكينِ وَابنِ السَّبيلِ كَي لا يَكونَ دولَةً بَينَ الأَغنِياءِ مِنكُم ۚ وَما آتاكُمُ الرَّسولُ فَخُذوهُ وَما نَهاكُم عَنهُ فَانتَهوا ۚ وَاتَّقُوا اللَّهَ ۖ إِنَّ اللَّهَ شَديدُ العِقابِ\n" +
                    "TRANSLITERATION\n" +
                    "mā ʾafāʾa llāhu ʿalā rasūlihī min ʾahli l-qurā fa-li-llāhi wa-li-r-rasūli wa-li-dhī l-qurbā wa-l-yatāmā wa-l-masākīni wa-bni s-sabīli kay lā yakūna dūlatan bayna l-ʾaghniyāʾi minkum wa-mā ʾātākumu r-rasūlu fa-khudhūhu wa-mā nahākum ʿanhu fa-ntahū wa-ttaqū llāha ʾinna llāha shadīdu l-ʿiqābi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The spoils that Allah gave to His Apostle\n" +
                    "from the people of the townships,\n" +
                    "are for Allah and the Apostle,\n" +
                    "the relatives and the orphans,\n" +
                    "the needy and the traveller,\n" +
                    "so that\n" +
                    "they do not circulate among the rich among you.\n" +
                    "Take whatever the Apostle gives you,\n" +
                    "and relinquish whatever he forbids you,\n" +
                    "and be wary of Allah.\n" +
                    "Indeed Allah is severe in retribution.\n");
            ayat.add("8\n" +
                    "لِلفُقَراءِ المُهاجِرينَ الَّذينَ أُخرِجوا مِن دِيارِهِم وَأَموالِهِم يَبتَغونَ فَضلًا مِنَ اللَّهِ وَرِضوانًا وَيَنصُرونَ اللَّهَ وَرَسولَهُ ۚ أُولٰئِكَ هُمُ الصّادِقونَ\n" +
                    "TRANSLITERATION\n" +
                    "li-l-fuqarāʾi l-muhājirīna lladhīna ʾukhrijū min diyārihim wa-ʾamwālihim yabtaghūna faḍlan mina llāhi wa-riḍwānan wa-yanṣurūna llāha wa-rasūlahū ʾulāʾika humu ṣ-ṣādiqūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "[They are also] for the poor Emigrants\n" +
                    "who have been expelled from their homes\n" +
                    "and [wrested of] their possessions,\n" +
                    "who seek grace from Allah and [His] pleasure\n" +
                    "and help Allah and His Apostle.\n" +
                    "It is they who are the truthful.");
            ayat.add("9\n" +
                    "وَالَّذينَ تَبَوَّءُوا الدّارَ وَالإيمانَ مِن قَبلِهِم يُحِبّونَ مَن هاجَرَ إِلَيهِم وَلا يَجِدونَ في صُدورِهِم حاجَةً مِمّا أوتوا وَيُؤثِرونَ عَلىٰ أَنفُسِهِم وَلَو كانَ بِهِم خَصاصَةٌ ۚ وَمَن يوقَ شُحَّ نَفسِهِ فَأُولٰئِكَ هُمُ المُفلِحونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-lladhīna tabawwaʾū d-dāra wa-l-ʾīmāna min qablihim yuḥibbūna man hājara ʾilayhim wa-lā yajidūna fī ṣudūrihim ḥājatan mimmā ʾūtū wa-yuʾthirūna ʿalā ʾanfusihim wa-law kāna bihim khaṣāṣatun wa-man yūqa shuḥḥa nafsihī fa-ʾulāʾika humu l-mufliḥūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "[They are as well] for those who were settled in the land1\n" +
                    "and [abided] in faith before them,\n" +
                    "who love those who migrate toward them,\n" +
                    "and do not find in their breasts any need\n" +
                    "for that which is given to them,2\n" +
                    "but prefer [the Immigrants] to themselves,\n" +
                    "though poverty be their own lot.\n" +
                    "And those who are saved from their own greed\n" +
                    "it is they who are the felicitous.");
            ayat.add("10\n" +
                    "وَالَّذينَ جاءوا مِن بَعدِهِم يَقولونَ رَبَّنَا اغفِر لَنا وَلِإِخوانِنَا الَّذينَ سَبَقونا بِالإيمانِ وَلا تَجعَل في قُلوبِنا غِلًّا لِلَّذينَ آمَنوا رَبَّنا إِنَّكَ رَءوفٌ رَحيمٌ\n" +
                    "TRANSLITERATION\n" +
                    "wa-lladhīna jāʾū min baʿdihim yaqūlūna rabbanā ghfir lanā wa-li-ʾikhwāninā lladhīna sabaqūnā bi-l-ʾīmāni wa-lā tajʿal fī qulūbinā ghillan li-lladhīna ʾāmanū rabbanā ʾinnaka raʾūfun raḥīmun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And [also for] those who came in after them,\n" +
                    "who say, ‘Our Lord,\n" +
                    "forgive us and our brethren\n" +
                    "who were our forerunners in the faith,\n" +
                    "and do not put any rancour in our hearts\n" +
                    "toward the faithful.\n" +
                    "Our Lord, You are indeed most kind and merciful.’");
            ayat.add("11\n" +
                    "۞ أَلَم تَرَ إِلَى الَّذينَ نافَقوا يَقولونَ لِإِخوانِهِمُ الَّذينَ كَفَروا مِن أَهلِ الكِتابِ لَئِن أُخرِجتُم لَنَخرُجَنَّ مَعَكُم وَلا نُطيعُ فيكُم أَحَدًا أَبَدًا وَإِن قوتِلتُم لَنَنصُرَنَّكُم وَاللَّهُ يَشهَدُ إِنَّهُم لَكاذِبونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-lam tara ʾilā lladhīna nāfaqū yaqūlūna li-ʾikhwānihimu lladhīna kafarū min ʾahli l-kitābi la-ʾin ʾukhrijtum la-nakhrujanna maʿakum wa-lā nuṭīʿu fīkum ʾaḥadan ʾabadan wa-ʾin qūtiltum la-nanṣurannakum wa-llāhu yashhadu ʾinnahum la-kādhibūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Have you not regarded the hypocrites\n" +
                    "who say to their brethren,\n" +
                    "the faithless from among the People of the Book:\n" +
                    "‘If you are expelled,\n" +
                    "we will surely go out with you,\n" +
                    "and we will never obey anyone against you,\n" +
                    "and if you are fought against\n" +
                    "we will surely help you,’\n" +
                    "and Allah bears witness that they are indeed liars.");
            ayat.add("12\n" +
                    "لَئِن أُخرِجوا لا يَخرُجونَ مَعَهُم وَلَئِن قوتِلوا لا يَنصُرونَهُم وَلَئِن نَصَروهُم لَيُوَلُّنَّ الأَدبارَ ثُمَّ لا يُنصَرونَ\n" +
                    "TRANSLITERATION\n" +
                    "la-ʾin ʾukhrijū lā yakhrujūna maʿahum wa-la-ʾin qūtilū lā yanṣurūnahum wa-la-ʾin naṣarūhum la-yuwallunna l-ʾadbāra thumma lā yunṣarūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Surely, if they were expelled\n" +
                    "they would not go out with them,\n" +
                    "and if they were fought against\n" +
                    "they would not help them,\n" +
                    "and were they to help them\n" +
                    "they would surely turn their backs [to flee]\n" +
                    "and then1 they would not be helped.");
            ayat.add("13\n" +
                    "لَأَنتُم أَشَدُّ رَهبَةً في صُدورِهِم مِنَ اللَّهِ ۚ ذٰلِكَ بِأَنَّهُم قَومٌ لا يَفقَهونَ\n" +
                    "TRANSLITERATION\n" +
                    "la-ʾantum ʾashaddu rahbatan fī ṣudūrihim mina llāhi dhālika bi-ʾannahum qawmun lā yafqahūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed they have a greater awe of you in their hearts\n" +
                    "than of Allah.\n" +
                    "That is because they are a lot who do not understand.");
            ayat.add("14\n" +
                    "لا يُقاتِلونَكُم جَميعًا إِلّا في قُرًى مُحَصَّنَةٍ أَو مِن وَراءِ جُدُرٍ ۚ بَأسُهُم بَينَهُم شَديدٌ ۚ تَحسَبُهُم جَميعًا وَقُلوبُهُم شَتّىٰ ۚ ذٰلِكَ بِأَنَّهُم قَومٌ لا يَعقِلونَ\n" +
                    "TRANSLITERATION\n" +
                    "lā yuqātilūnakum jamīʿan ʾillā fī quran muḥaṣṣanatin ʾaw min warāʾi judurin baʾsuhum baynahum shadīdun taḥsabuhum jamīʿan wa-qulūbuhum shattā dhālika bi-ʾannahum qawmun lā yaʿqilūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They will not fight against you in a body\n" +
                    "except in fortified townships\n" +
                    "or from behind walls.\n" +
                    "Their might is great among themselves.\n" +
                    "You suppose them to be a body,\n" +
                    "but their hearts are disunited.\n" +
                    "That is because\n" +
                    "they are a lot who do not apply reason,");
            ayat.add("15\n" +
                    "كَمَثَلِ الَّذينَ مِن قَبلِهِم قَريبًا ۖ ذاقوا وَبالَ أَمرِهِم وَلَهُم عَذابٌ أَليمٌ\n" +
                    "TRANSLITERATION\n" +
                    "ka-mathali lladhīna min qablihim qarīban dhāqū wabāla ʾamrihim wa-lahum ʿadhābun ʾalīmun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "like those who, recently before them,\n" +
                    "tasted the evil consequences of their conduct,\n" +
                    "and there is a painful punishment for them.");
            ayat.add("16\n" +
                    "كَمَثَلِ الشَّيطانِ إِذ قالَ لِلإِنسانِ اكفُر فَلَمّا كَفَرَ قالَ إِنّي بَريءٌ مِنكَ إِنّي أَخافُ اللَّهَ رَبَّ العالَمينَ\n" +
                    "TRANSLITERATION\n" +
                    "ka-mathali sh-shayṭāni ʾidh qāla li-l-ʾinsāni kfur fa-lammā kafara qāla ʾinnī barīʾun minka ʾinnī ʾakhāfu llāha rabba l-ʿālamīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "[Or] like Satan,\n" +
                    "when he prompts man to renounce faith,\n" +
                    "then, when he renounces faith,\n" +
                    "he says, ‘Indeed I am absolved of you.\n" +
                    "Indeed I fear Allah,\n" +
                    "the Lord of all the worlds.’");
            ayat.add("17\n" +
                    "فَكانَ عاقِبَتَهُما أَنَّهُما فِي النّارِ خالِدَينِ فيها ۚ وَذٰلِكَ جَزاءُ الظّالِمينَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-kāna ʿāqibatahumā ʾannahumā fī n-nāri khālidayni fīhā wa-dhālika jazāʾu ẓ-ẓālimīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So the fate of both is that they will be in the Fire,\n" +
                    "to remain in it [forever].\n" +
                    "Such is the requital of the wrongdoers.");
            ayat.add("18\n" +
                    "يا أَيُّهَا الَّذينَ آمَنُوا اتَّقُوا اللَّهَ وَلتَنظُر نَفسٌ ما قَدَّمَت لِغَدٍ ۖ وَاتَّقُوا اللَّهَ ۚ إِنَّ اللَّهَ خَبيرٌ بِما تَعمَلونَ\n" +
                    "TRANSLITERATION\n" +
                    "yā-ʾayyuhā lladhīna ʾāmanū ttaqū llāha wa-l-tanẓur nafsun mā qaddamat li-ghadin wa-ttaqū llāha ʾinna llāha khabīrun bi-mā taʿmalūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "O you who have faith!\n" +
                    "Be wary of Allah,\n" +
                    "and let every soul consider what it sends ahead1\n" +
                    "for tomorrow,\n" +
                    "and be wary of Allah.\n" +
                    "Allah is indeed well aware of what you do.\n");
            ayat.add("19\n" +
                    "وَلا تَكونوا كَالَّذينَ نَسُوا اللَّهَ فَأَنساهُم أَنفُسَهُم ۚ أُولٰئِكَ هُمُ الفاسِقونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-lā takūnū ka-lladhīna nasū llāha fa-ʾansāhum ʾanfusahum ʾulāʾika humu l-fāsiqūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And do not be like those who forget Allah,\n" +
                    "so He makes them forget their own souls.\n" +
                    "It is they who are the transgressors.");
            ayat.add("20\n" +
                    "لا يَستَوي أَصحابُ النّارِ وَأَصحابُ الجَنَّةِ ۚ أَصحابُ الجَنَّةِ هُمُ الفائِزونَ\n" +
                    "TRANSLITERATION\n" +
                    "lā yastawī ʾaṣḥābu n-nāri wa-ʾaṣḥābu l-jannati ʾaṣḥābu l-jannati humu l-fāʾizūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Not equal are the inmates of the Fire\n" +
                    "and the inhabitants of paradise.\n" +
                    "It is the inhabitants of paradise\n" +
                    "who are the successful ones.");
            ayat.add("21\n" +
                    "لَو أَنزَلنا هٰذَا القُرآنَ عَلىٰ جَبَلٍ لَرَأَيتَهُ خاشِعًا مُتَصَدِّعًا مِن خَشيَةِ اللَّهِ ۚ وَتِلكَ الأَمثالُ نَضرِبُها لِلنّاسِ لَعَلَّهُم يَتَفَكَّرونَ\n" +
                    "TRANSLITERATION\n" +
                    "law ʾanzalnā hādhā l-qurʾāna ʿalā l-jabalin la-raʾaytahū khāshiʿan mutaṣaddiʿan min khashyati llāhi wa-tilka l-ʾamthālu naḍribuhā li-n-nāsi laʿallahum yatafakkarūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Had We sent down this Qurʾān\n" +
                    "upon a mountain,\n" +
                    "you would have surely seen it humbled\n" +
                    "[and] go to pieces with the fear of Allah.\n" +
                    "We draw such comparisons for mankind,\n" +
                    "so that they may reflect.");
            ayat.add("22\n" +
                    "هُوَ اللَّهُ الَّذي لا إِلٰهَ إِلّا هُوَ ۖ عالِمُ الغَيبِ وَالشَّهادَةِ ۖ هُوَ الرَّحمٰنُ الرَّحيمُ\n" +
                    "TRANSLITERATION\n" +
                    "huwa llāhu lladhī lā ʾilāha ʾillā huwa ʿālimu l-ghaybi wa-sh-shahādati huwa r-raḥmānu r-raḥīmu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "He is Allah—there is no god except Him\n" +
                    "Knower of the sensible and the Unseen,\n" +
                    "He is the All-beneficent, the All-merciful.");
            ayat.add("23\n" +
                    "هُوَ اللَّهُ الَّذي لا إِلٰهَ إِلّا هُوَ المَلِكُ القُدّوسُ السَّلامُ المُؤمِنُ المُهَيمِنُ العَزيزُ الجَبّارُ المُتَكَبِّرُ ۚ سُبحانَ اللَّهِ عَمّا يُشرِكونَ\n" +
                    "TRANSLITERATION\n" +
                    "huwa llāhu lladhī lā ʾilāha ʾillā huwa l-maliku l-quddūsu s-salāmu l-muʾminu l-muhayminu l-ʿazīzu l-jabbāru l-mutakabbiru subḥāna llāhi ʿammā yushrikūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "He is Allah—there is no god except Him—\n" +
                    "the Sovereign, the All-holy,\n" +
                    "the All-benign,1 the Securer, the All-conserver,\n" +
                    "the All-mighty, the All-compeller,\n" +
                    "the All-magnanimous.\n" +
                    "Clear is Allah\n" +
                    "of any partners that they may ascribe [to Him]!");
            ayat.add("24\n" +
                    "هُوَ اللَّهُ الخالِقُ البارِئُ المُصَوِّرُ ۖ لَهُ الأَسماءُ الحُسنىٰ ۚ يُسَبِّحُ لَهُ ما فِي السَّماواتِ وَالأَرضِ ۖ وَهُوَ العَزيزُ الحَكيمُ\n" +
                    "TRANSLITERATION\n" +
                    "huwa llāhu l-khāliqu l-bāriʾu l-muṣawwiru lahu l-ʾasmāʾu l-ḥusnā yusabbiḥu lahū mā fī s-samāwāti wa-l-ʾarḍi wa-huwa l-ʿazīzu l-ḥakīmu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "He is Allah, the Creator,\n" +
                    "the Maker, the Former.\n" +
                    "To Him belong the Best Names.\n" +
                    "Whatever there is in the heavens glorifies Him\n" +
                    "and [whatever there is in] the earth,\n" +
                    "and He is the All-mighty, the All-wise.");
        }
        else if (surahName.equals("60. Al-Mumtahina"))
        {
            setTitle("Al-Mumtahina(الممتحنة): The Women Tested");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "يا أَيُّهَا الَّذينَ آمَنوا لا تَتَّخِذوا عَدُوّي وَعَدُوَّكُم أَولِياءَ تُلقونَ إِلَيهِم بِالمَوَدَّةِ وَقَد كَفَروا بِما جاءَكُم مِنَ الحَقِّ يُخرِجونَ الرَّسولَ وَإِيّاكُم ۙ أَن تُؤمِنوا بِاللَّهِ رَبِّكُم إِن كُنتُم خَرَجتُم جِهادًا في سَبيلي وَابتِغاءَ مَرضاتي ۚ تُسِرّونَ إِلَيهِم بِالمَوَدَّةِ وَأَنا أَعلَمُ بِما أَخفَيتُم وَما أَعلَنتُم ۚ وَمَن يَفعَلهُ مِنكُم فَقَد ضَلَّ سَواءَ السَّبيلِ\n" +
                    "TRANSLITERATION\n" +
                    "yā-ʾayyuhā lladhīna ʾāmanū lā tattakhidhū ʿaduwwī wa-ʿaduwwakum ʾawliyyāʾa tulqūna ʾilayhim bi-l-mawaddati wa-qad kafarū bi-mā jāʾakum mina l-ḥaqqi yukhrijūna r-rasūla wa-ʾiyyākum ʾan tuʾminū bi-llāhi rabbikum ʾin kuntum kharajtum jihādan fī sabīlī wa-btighāʾa marḍātī tusirrūna ʾilayhim bi-l-mawaddati wa-ʾana ʾaʿlamu bi-mā ʾakhfaytum wa-mā ʾaʿlantum wa-man yafʿalhu minkum fa-qad ḍalla sawāʾa s-sabīli\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "O you who have faith!\n" +
                    "Do not take My enemy and your enemy for friends,\n" +
                    "[secretly] offering them affection\n" +
                    "(for they have certainly defied\n" +
                    "whatever has come to you of the truth,\n" +
                    "expelling the Apostle and you,\n" +
                    "because you have faith in Allah, your Lord)\n" +
                    "if you have set out for jihād in My way\n" +
                    "and to seek My pleasure.\n" +
                    "You secretly nourish affection for them,\n" +
                    "while I know well whatever you hide\n" +
                    "and whatever you disclose,\n" +
                    "and whoever among you does that\n" +
                    "has certainly strayed from the right way.");
            ayat.add("2\n" +
                    "إِن يَثقَفوكُم يَكونوا لَكُم أَعداءً وَيَبسُطوا إِلَيكُم أَيدِيَهُم وَأَلسِنَتَهُم بِالسّوءِ وَوَدّوا لَو تَكفُرونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾin yathqafūkum yakūnū lakum ʾaʿdāʾan wa-yabsuṭū ʾilaykum ʾaydiyahum wa-ʾalsinatahum bi-s-sūʾi wa-waddū law takfurūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "If they were to confront you\n" +
                    "they would be your enemies,\n" +
                    "and would stretch out against you their hands\n" +
                    "and their tongues\n" +
                    "with evil [intentions],\n" +
                    "and they are eager that you should be faithless.");
            ayat.add("3\n" +
                    "لَن تَنفَعَكُم أَرحامُكُم وَلا أَولادُكُم ۚ يَومَ القِيامَةِ يَفصِلُ بَينَكُم ۚ وَاللَّهُ بِما تَعمَلونَ بَصيرٌ\n" +
                    "TRANSLITERATION\n" +
                    "lan tanfaʿakum ʾarḥāmukum wa-lā ʾawlādukum yawma l-qiyāmati yafṣilu baynakum wa-llāhu bi-mā taʿmalūna baṣīrun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Your relatives and your children will not avail you\n" +
                    "on the Day of Resurrection:\n" +
                    "He will separate you [from one another],\n" +
                    "and Allah sees best what you do.");
            ayat.add("4\n" +
                    "قَد كانَت لَكُم أُسوَةٌ حَسَنَةٌ في إِبراهيمَ وَالَّذينَ مَعَهُ إِذ قالوا لِقَومِهِم إِنّا بُرَآءُ مِنكُم وَمِمّا تَعبُدونَ مِن دونِ اللَّهِ كَفَرنا بِكُم وَبَدا بَينَنا وَبَينَكُمُ العَداوَةُ وَالبَغضاءُ أَبَدًا حَتّىٰ تُؤمِنوا بِاللَّهِ وَحدَهُ إِلّا قَولَ إِبراهيمَ لِأَبيهِ لَأَستَغفِرَنَّ لَكَ وَما أَملِكُ لَكَ مِنَ اللَّهِ مِن شَيءٍ ۖ رَبَّنا عَلَيكَ تَوَكَّلنا وَإِلَيكَ أَنَبنا وَإِلَيكَ المَصيرُ\n" +
                    "TRANSLITERATION\n" +
                    "qad kānat lakum ʾuswatun ḥasanatun fī ʾibrāhīma wa-lladhīna maʿahū ʾidh qālū li-qawmihim ʾinnā buraʾāʾu minkum wa-mimmā taʿbudūna min dūni llāhi kafarnā bikum wa-badā baynanā wa-baynakumu l-ʿadāwatu wa-l-baghḍāʾu ʾabadan ḥattā tuʾminū bi-llāhi waḥdahū ʾillā qawla ʾibrāhīma li-ʾabīhi la-ʾastaghfiranna laka wa-mā ʾamliku laka mina llāhi min shayʾin rabbanā ʿalayka tawakkalnā wa-ʾilayka ʾanabnā wa-ʾilayka l-maṣīru\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "There is certainly a good exemplar for you\n" +
                    "in Abraham\n" +
                    "and those who were with him,\n" +
                    "when they said to their own people,\n" +
                    "‘Indeed we repudiate you\n" +
                    "and whatever you worship besides Allah.\n" +
                    "We disavow you,\n" +
                    "and between you and us there has appeared\n" +
                    "enmity and hate for ever,\n" +
                    "unless you come to have faith in Allah alone,’\n" +
                    "except for Abraham’s saying to his father,\n" +
                    "‘I will surely plead forgiveness for you,\n" +
                    "though I cannot avail you anything against Allah.’\n" +
                    "\n" +
                    "‘Our Lord! In You do we put our trust,\n" +
                    "and to You do we turn penitently,\n" +
                    "and toward You is the destination.");
            ayat.add("5\n" +
                    "رَبَّنا لا تَجعَلنا فِتنَةً لِلَّذينَ كَفَروا وَاغفِر لَنا رَبَّنا ۖ إِنَّكَ أَنتَ العَزيزُ الحَكيمُ\n" +
                    "TRANSLITERATION\n" +
                    "rabbanā lā tajʿalnā fitnatan li-lladhīna kafarū wa-ghfir lanā rabbanā ʾinnaka ʾanta l-ʿazīzu l-ḥakīmu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Our Lord!\n" +
                    "Do not make us a trial for the faithless,\n" +
                    "and forgive us.\n" +
                    "Our Lord!\n" +
                    "Indeed You are the All-mighty, the All-wise.’");
            ayat.add("6\n" +
                    "لَقَد كانَ لَكُم فيهِم أُسوَةٌ حَسَنَةٌ لِمَن كانَ يَرجُو اللَّهَ وَاليَومَ الآخِرَ ۚ وَمَن يَتَوَلَّ فَإِنَّ اللَّهَ هُوَ الغَنِيُّ الحَميدُ\n" +
                    "TRANSLITERATION\n" +
                    "la-qad kāna lakum fīhim ʾuswatun ḥasanatun li-man kāna yarjū llāha wa-l-yawma l-ʾākhira wa-man yatawalla fa-ʾinna llāha huwa l-ghaniyyu l-ḥamīdu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "There is certainly a good exemplar for you in them\n" +
                    "—for those who look forward to Allah\n" +
                    "and the Last Day—\n" +
                    "and anyone who refuses to comply [should know that]\n" +
                    "indeed Allah is the All-sufficient, the All-laudable.");
            ayat.add("7\n" +
                    "۞ عَسَى اللَّهُ أَن يَجعَلَ بَينَكُم وَبَينَ الَّذينَ عادَيتُم مِنهُم مَوَدَّةً ۚ وَاللَّهُ قَديرٌ ۚ وَاللَّهُ غَفورٌ رَحيمٌ\n" +
                    "TRANSLITERATION\n" +
                    "ʿasā llāhu ʿan yajʿala baynakum wa-bayna lladhīna ʿādaytum minhum mawaddatan wa-llāhu qadīrun wa-llāhu ghafūrun raḥīmun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "It may be that Allah will bring about\n" +
                    "between you and those with whom you are at enmity\n" +
                    "affection,\n" +
                    "and Allah is all-powerful,\n" +
                    "and Allah is all-forgiving, all-merciful.");
            ayat.add("8\n" +
                    "لا يَنهاكُمُ اللَّهُ عَنِ الَّذينَ لَم يُقاتِلوكُم فِي الدّينِ وَلَم يُخرِجوكُم مِن دِيارِكُم أَن تَبَرّوهُم وَتُقسِطوا إِلَيهِم ۚ إِنَّ اللَّهَ يُحِبُّ المُقسِطينَ\n" +
                    "TRANSLITERATION\n" +
                    "lā yanhākumu llāhu ʿani lladhīna lam yuqātilūkum fī d-dīni wa-lam yukhrijūkum min diyārikum ʾan tabarrūhum wa-tuqsiṭū ʾilayhim ʾinna llāha yuḥibbu l-muqsiṭīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Allah does not forbid you in regard to those\n" +
                    "who did not make war against you\n" +
                    "on account of religion\n" +
                    "and did not expel you from your homes,\n" +
                    "that you deal with them with kindness and justice.\n" +
                    "Indeed Allah loves the just.");
            ayat.add("9\n" +
                    "إِنَّما يَنهاكُمُ اللَّهُ عَنِ الَّذينَ قاتَلوكُم فِي الدّينِ وَأَخرَجوكُم مِن دِيارِكُم وَظاهَروا عَلىٰ إِخراجِكُم أَن تَوَلَّوهُم ۚ وَمَن يَتَوَلَّهُم فَأُولٰئِكَ هُمُ الظّالِمونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnamā yanhākumu llāhu ʿani lladhīna qātalūkum fī d-dīni wa-ʾakhrajūkum min diyārikum wa-ẓāharū ʿalā ʾikhrājikum ʾan tawallawhum wa-man yatawallahum fa-ʾulāʾika humu ẓ-ẓālimūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Allah forbids you only in regard to those\n" +
                    "who made war against you on account of religion\n" +
                    "and expelled you from your homes\n" +
                    "and supported [others] in your expulsion,\n" +
                    "that you make friends with them,\n" +
                    "and whoever makes friends with them\n" +
                    "—it is they who are the wrongdoers.");
            ayat.add("10\n" +
                    "يا أَيُّهَا الَّذينَ آمَنوا إِذا جاءَكُمُ المُؤمِناتُ مُهاجِراتٍ فَامتَحِنوهُنَّ ۖ اللَّهُ أَعلَمُ بِإيمانِهِنَّ ۖ فَإِن عَلِمتُموهُنَّ مُؤمِناتٍ فَلا تَرجِعوهُنَّ إِلَى الكُفّارِ ۖ لا هُنَّ حِلٌّ لَهُم وَلا هُم يَحِلّونَ لَهُنَّ ۖ وَآتوهُم ما أَنفَقوا ۚ وَلا جُناحَ عَلَيكُم أَن تَنكِحوهُنَّ إِذا آتَيتُموهُنَّ أُجورَهُنَّ ۚ وَلا تُمسِكوا بِعِصَمِ الكَوافِرِ وَاسأَلوا ما أَنفَقتُم وَليَسأَلوا ما أَنفَقوا ۚ ذٰلِكُم حُكمُ اللَّهِ ۖ يَحكُمُ بَينَكُم ۚ وَاللَّهُ عَليمٌ حَكيمٌ\n" +
                    "TRANSLITERATION\n" +
                    "yā-ʾayyuhā lladhīna ʾāmanū ʾidhā jāʾakumu l-muʾminātu muhājirātin fa-mtaḥinūhunna llāhu ʾaʿlamu bi-ʾīmānihinna fa-ʾin ʿalimtumūhunna muʾminātin fa-lā tarjiʿūhunna ʾilā l-kuffāri lā hunna ḥillun lahum wa-lā hum yaḥillūna lahunna wa-ʾātūhum mā ʾanfaqū wa-lā junāḥa ʿalaykum ʾan tankiḥūhunna ʾidhā ʾātaytumūhunna ʾujūrahunna wa-lā tumsikū bi-ʿiṣami l-kawāfiri wa-sʾalū mā ʾanfaqtum wa-l-yasʾalū mā ʾanfaqū dhālikum ḥukmu llāhi yaḥkumu baynakum wa-llāhu ʿalīmun ḥakīmun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "O you who have faith!\n" +
                    "When faithful women come to you as immigrants,1\n" +
                    "test them.\n" +
                    "Allah knows best [the state of] their faith.\n" +
                    "Then, if you ascertain them to be faithful women,\n" +
                    "do not send them back to the faithless.\n" +
                    "They2 are not lawful for them,3\n" +
                    "nor are they4 lawful for them.5\n" +
                    "And give them6 what they have spent [for them].7\n" +
                    "There is no sin upon you in marrying them\n" +
                    "when you have given them their dowries.\n" +
                    "Do not hold on\n" +
                    "to [conjugal] ties with faithless women.\n" +
                    "Ask [the infidels] for what you have spent,\n" +
                    "and let the faithless ask for what they have spent.8\n" +
                    "That is the judgment of Allah;\n" +
                    "He judges between you;\n" +
                    "and Allah is all-knowing, all-wise.");
            ayat.add("11\n" +
                    "وَإِن فاتَكُم شَيءٌ مِن أَزواجِكُم إِلَى الكُفّارِ فَعاقَبتُم فَآتُوا الَّذينَ ذَهَبَت أَزواجُهُم مِثلَ ما أَنفَقوا ۚ وَاتَّقُوا اللَّهَ الَّذي أَنتُم بِهِ مُؤمِنونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾin fātakum shayʾun min ʾazwājikum ʾilā l-kuffāri fa-ʿāqabtum fa-ʾātū lladhīna dhahabat ʾazwājuhum mithla mā ʾanfaqū wa-ttaqū llāha lladhī ʾantum bihī muʾminūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "If anything pertaining to your wives is not reclaimed\n" +
                    "from the faithless1\n" +
                    "and then you have your turn,\n" +
                    "then give to those whose wives have left\n" +
                    "the like of what they have spent,\n" +
                    "and be wary of Allah\n" +
                    "in whom you have faith.");
            ayat.add("12\n" +
                    "يا أَيُّهَا النَّبِيُّ إِذا جاءَكَ المُؤمِناتُ يُبايِعنَكَ عَلىٰ أَن لا يُشرِكنَ بِاللَّهِ شَيئًا وَلا يَسرِقنَ وَلا يَزنينَ وَلا يَقتُلنَ أَولادَهُنَّ وَلا يَأتينَ بِبُهتانٍ يَفتَرينَهُ بَينَ أَيديهِنَّ وَأَرجُلِهِنَّ وَلا يَعصينَكَ في مَعروفٍ ۙ فَبايِعهُنَّ وَاستَغفِر لَهُنَّ اللَّهَ ۖ إِنَّ اللَّهَ غَفورٌ رَحيمٌ\n" +
                    "TRANSLITERATION\n" +
                    "yā-ʾayyuhā n-nabiyyu ʾidhā jāʾaka l-muʾminātu yubāyiʿnaka ʿalā ʾan lā yushrikna bi-llāhi shayʾan wa-lā yasriqna wa-lā yaznīna wa-lā yaqtulna ʾawlādahunna wa-lā yaʾtīna bi-buhtānin yaftarīnahū bayna ʾaydīhinna wa-ʾarjulihinna wa-lā yaʿṣīnaka fī maʿrūfin fa-bāyiʿhunna wa-staghfir lahunna llāha ʾinna llāha ghafūrun raḥīmun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "O Prophet!\n" +
                    "If faithful women come to you,\n" +
                    "to take the oath of allegiance to you, [pledging]\n" +
                    "that they shall not ascribe any partners to Allah,\n" +
                    "that they shall not steal, nor commit adultery,\n" +
                    "nor kill their children,\n" +
                    "nor utter any slander\n" +
                    "that they may have intentionally fabricated,\n" +
                    "nor disobey you in what is right,\n" +
                    "then accept their allegiance,\n" +
                    "and plead for them to Allah for forgiveness.\n" +
                    "Indeed Allah is all-forgiving, all-merciful.");
            ayat.add("13\n" +
                    "يا أَيُّهَا الَّذينَ آمَنوا لا تَتَوَلَّوا قَومًا غَضِبَ اللَّهُ عَلَيهِم قَد يَئِسوا مِنَ الآخِرَةِ كَما يَئِسَ الكُفّارُ مِن أَصحابِ القُبورِ\n" +
                    "TRANSLITERATION\n" +
                    "yā-ʾayyuhā lladhīna ʾāmanū lā tatawallaw qawman ghaḍiba llāhu ʿalayhim qad yaʾisū mina l-ʾākhirati ka-mā yaʾisa l-kuffāru min ʾaṣḥābi l-qubūri\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "O you who have faith!\n" +
                    "Do not befriend a people\n" +
                    "at whom Allah is wrathful:\n" +
                    "they have despaired of the Hereafter,\n" +
                    "just as the faithless have despaired\n" +
                    "of the occupants of the graves.");
        }
        else if (surahName.equals("61. As-Saff"))
        {
            setTitle("As-Saff(الصف) : Ranks");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "سَبَّحَ لِلَّهِ ما فِي السَّماواتِ وَما فِي الأَرضِ ۖ وَهُوَ العَزيزُ الحَكيمُ\n" +
                    "TRANSLITERATION\n" +
                    "sabbaḥa li-llāhi mā fī s-samāwāti wa-mā fī l-ʾarḍi wa-huwa l-ʿazīzu l-ḥakīmu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Whatever there is in the heavens glorifies Allah\n" +
                    "and whatever there is in the earth,\n" +
                    "and He is the All-mighty, the All-wise.");
            ayat.add("2\n" +
                    "يا أَيُّهَا الَّذينَ آمَنوا لِمَ تَقولونَ ما لا تَفعَلونَ\n" +
                    "TRANSLITERATION\n" +
                    "yā-ʾayyuhā lladhīna ʾāmanū li-ma taqūlūna mā lā tafʿalūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "O you who have faith!\n" +
                    "Why do you say what you do not do?");
            ayat.add("3\n" +
                    "كَبُرَ مَقتًا عِندَ اللَّهِ أَن تَقولوا ما لا تَفعَلونَ\n" +
                    "TRANSLITERATION\n" +
                    "kabura maqtan ʿinda llāhi ʾan taqūlū mā lā tafʿalūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "It is greatly outrageous to Allah\n" +
                    "that you should say what you do not do.");
            ayat.add("4\n" +
                    "إِنَّ اللَّهَ يُحِبُّ الَّذينَ يُقاتِلونَ في سَبيلِهِ صَفًّا كَأَنَّهُم بُنيانٌ مَرصوصٌ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna llāha yuḥibbu lladhīna yuqātilūna fī sabīlihī ṣaffan ka-ʾannahum bunyānun marṣūṣun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed Allah loves those\n" +
                    "who fight in His way in ranks,\n" +
                    "as if they were a compact structure.");
            ayat.add("5\n" +
                    "وَإِذ قالَ موسىٰ لِقَومِهِ يا قَومِ لِمَ تُؤذونَني وَقَد تَعلَمونَ أَنّي رَسولُ اللَّهِ إِلَيكُم ۖ فَلَمّا زاغوا أَزاغَ اللَّهُ قُلوبَهُم ۚ وَاللَّهُ لا يَهدِي القَومَ الفاسِقينَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾidh qāla mūsā li-qawmihī yā-qawmi li-ma tuʾdhūnanī wa-qad taʿlamūna ʾannī rasūlu llāhi ʾilaykum fa-lammā zāghū ʾazāgha llāhu qulūbahum wa-llāhu lā yahdī l-qawma l-fāsiqīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "When Moses said to his people,\n" +
                    "‘O my people! Why do you torment me,\n" +
                    "when you certainly know\n" +
                    "that I am Allah’s apostle to you?’\n" +
                    "So when they swerved [from the right path]\n" +
                    "Allah made their hearts swerve,\n" +
                    "and Allah does not guide the transgressing lot.");
            ayat.add("6\n" +
                    "وَإِذ قالَ عيسَى ابنُ مَريَمَ يا بَني إِسرائيلَ إِنّي رَسولُ اللَّهِ إِلَيكُم مُصَدِّقًا لِما بَينَ يَدَيَّ مِنَ التَّوراةِ وَمُبَشِّرًا بِرَسولٍ يَأتي مِن بَعدِي اسمُهُ أَحمَدُ ۖ فَلَمّا جاءَهُم بِالبَيِّناتِ قالوا هٰذا سِحرٌ مُبينٌ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾidh qāla ʿīsā bnu maryama yā-banī ʾisrāʾīla ʾinnī rasūlu llāhi ʾilaykum muṣaddiqan li-mā bayna yadayya mina t-tawrāti wa-mubashshiran bi-rasūlin yaʾtī min baʿdī smuhū ʾaḥmadu fa-lammā jāʾahum bi-l-bayyināti qālū hādhā siḥrun mubīnun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And when Jesus son of Mary said,\n" +
                    "‘O Children of Israel!\n" +
                    "Indeed I am the apostle of Allah to you,\n" +
                    "to confirm what is before me of the Torah,\n" +
                    "and to give the good news of an apostle\n" +
                    "who will come after me,\n" +
                    "whose name is Aḥmad.’\n" +
                    "Yet when he brought them manifest proofs,\n" +
                    "they said, ‘This is plain magic.’");
            ayat.add("7\n" +
                    "وَمَن أَظلَمُ مِمَّنِ افتَرىٰ عَلَى اللَّهِ الكَذِبَ وَهُوَ يُدعىٰ إِلَى الإِسلامِ ۚ وَاللَّهُ لا يَهدِي القَومَ الظّالِمينَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-man ʾaẓlamu mimmani ftarā ʿalā llāhi l-kadhiba wa-huwa yudʿā ʾilā l-ʾislāmi wa-llāhu lā yahdī l-qawma ẓ-ẓālimīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And who is a greater wrongdoer than him\n" +
                    "who fabricates falsehoods against Allah,\n" +
                    "while he is being summoned to Islam?\n" +
                    "And Allah does not guide the wrongdoing lot.");
            ayat.add("8\n" +
                    "يُريدونَ لِيُطفِئوا نورَ اللَّهِ بِأَفواهِهِم وَاللَّهُ مُتِمُّ نورِهِ وَلَو كَرِهَ الكافِرونَ\n" +
                    "TRANSLITERATION\n" +
                    "yurīdūna li-yuṭfiʾū nūra llāhi bi-ʾafwāhihim wa-llāhu mutimmu nūrihī wa-law kariha l-kāfirūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They desire to put out the light of Allah\n" +
                    "with their mouths,\n" +
                    "but Allah shall perfect His light\n" +
                    "though the faithless should be averse.");
            ayat.add("9\n" +
                    "هُوَ الَّذي أَرسَلَ رَسولَهُ بِالهُدىٰ وَدينِ الحَقِّ لِيُظهِرَهُ عَلَى الدّينِ كُلِّهِ وَلَو كَرِهَ المُشرِكونَ\n" +
                    "TRANSLITERATION\n" +
                    "huwa lladhī ʾarsala rasūlahū bi-l-hudā wa-dīni l-ḥaqqi li-yuẓhirahū ʿalā d-dīni kullihī wa-law kariha l-mushrikūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "It is He who has sent His Apostle\n" +
                    "with the guidance\n" +
                    "and the religion of truth\n" +
                    "that He may make it prevail over all religions\n" +
                    "though the polytheists should be averse.");
            ayat.add("10\n" +
                    "يا أَيُّهَا الَّذينَ آمَنوا هَل أَدُلُّكُم عَلىٰ تِجارَةٍ تُنجيكُم مِن عَذابٍ أَليمٍ\n" +
                    "TRANSLITERATION\n" +
                    "yā-ʾayyuhā lladhīna ʾāmanū hal ʾadullukum ʿalā tijāratin tunjīkum min ʿadhābin ʾalīmin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "O you who have faith!\n" +
                    "Shall I show you a deal\n" +
                    "that will deliver you from a painful punishment?");
            ayat.add("11\n" +
                    "تُؤمِنونَ بِاللَّهِ وَرَسولِهِ وَتُجاهِدونَ في سَبيلِ اللَّهِ بِأَموالِكُم وَأَنفُسِكُم ۚ ذٰلِكُم خَيرٌ لَكُم إِن كُنتُم تَعلَمونَ\n" +
                    "TRANSLITERATION\n" +
                    "tuʾminūna bi-llāhi wa-rasūlihī wa-tujāhidūna fī sabīli llāhi bi-ʾamwālikum wa-ʾanfusikum dhālikum khayrun lakum ʾin kuntum taʿlamūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Have faith in Allah and His Apostle,\n" +
                    "and wage jihād in the way of Allah\n" +
                    "with your possessions and your persons.\n" +
                    "That is better for you,\n" +
                    "should you know.");
            ayat.add("12\n" +
                    "يَغفِر لَكُم ذُنوبَكُم وَيُدخِلكُم جَنّاتٍ تَجري مِن تَحتِهَا الأَنهارُ وَمَساكِنَ طَيِّبَةً في جَنّاتِ عَدنٍ ۚ ذٰلِكَ الفَوزُ العَظيمُ\n" +
                    "TRANSLITERATION\n" +
                    "yaghfir lakum dhunūbakum wa-yudkhilkum jannātin tajrī min taḥtihā l-ʾanhāru wa-masākina ṭayyibatan fī jannāti ʿadnin dhālika l-fawzu l-ʿaẓīmu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "He shall forgive you your sins\n" +
                    "and admit you into gardens\n" +
                    "with streams running in them,\n" +
                    "and into good dwellings\n" +
                    "in the Gardens of Eden.\n" +
                    "That is the great success.");
            ayat.add("13\n" +
                    "وَأُخرىٰ تُحِبّونَها ۖ نَصرٌ مِنَ اللَّهِ وَفَتحٌ قَريبٌ ۗ وَبَشِّرِ المُؤمِنينَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾukhrā tuḥibbūnahā naṣrun mina llāhi wa-fatḥun qarībun wa-bashshiri l-muʾminīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And other [blessings] you love:\n" +
                    "help from Allah and a victory near at hand.\n" +
                    "And give good news to the faithful.");
            ayat.add("14\n" +
                    "يا أَيُّهَا الَّذينَ آمَنوا كونوا أَنصارَ اللَّهِ كَما قالَ عيسَى ابنُ مَريَمَ لِلحَوارِيّينَ مَن أَنصاري إِلَى اللَّهِ ۖ قالَ الحَوارِيّونَ نَحنُ أَنصارُ اللَّهِ ۖ فَآمَنَت طائِفَةٌ مِن بَني إِسرائيلَ وَكَفَرَت طائِفَةٌ ۖ فَأَيَّدنَا الَّذينَ آمَنوا عَلىٰ عَدُوِّهِم فَأَصبَحوا ظاهِرينَ\n" +
                    "TRANSLITERATION\n" +
                    "yā-ʾayyuhā lladhīna ʾāmanū kūnū ʾanṣāra llāhi ka-mā qāla ʿīsā bnu maryama li-l-ḥawāriyyīna man ʾanṣārī ʾilā llāhi qāla l-ḥawāriyyūna naḥnu ʾanṣāru llāhi fa-ʾāmanat ṭāʾifatun min banī ʾisrāʾīla wa-kafarat ṭāʾifatun fa-ʾayyadnā lladhīna ʾāmanū ʿalā ʿaduwwihim fa-ʾaṣbaḥū ẓāhirīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "O you who have faith!\n" +
                    "Be Allah’s helpers,\n" +
                    "just as Jesus son of Mary said\n" +
                    "to the disciples,\n" +
                    "‘Who will be my helpers for Allah’s sake?’\n" +
                    "The Disciples said,\n" +
                    "‘We will be Allah’s helpers!’\n" +
                    "So a group of the Children of Israel believed,\n" +
                    "and a group disbelieved.\n" +
                    "Then We strengthened the faithful\n" +
                    "against their enemies,\n" +
                    "and they became the dominant ones.");
        }
        else if (surahName.equals("62. Al-Jumu`ah"))
        {
            setTitle("Al-Jumu`ah(الجمعة) : Friday");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "يُسَبِّحُ لِلَّهِ ما فِي السَّماواتِ وَما فِي الأَرضِ المَلِكِ القُدّوسِ العَزيزِ الحَكيمِ\n" +
                    "TRANSLITERATION\n" +
                    "yusabbiḥu li-llāhi mā fī s-samāwāti wa-mā fī l-ʾarḍi l-maliki l-quddūsi l-ʿazīzi l-ḥakīmi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Whatever there is in the heavens glorifies Allah\n" +
                    "and whatever there is in the earth,\n" +
                    "the Sovereign, the All-holy,\n" +
                    "the All-mighty, the All-wise.");
            ayat.add("2\n" +
                    "هُوَ الَّذي بَعَثَ فِي الأُمِّيّينَ رَسولًا مِنهُم يَتلو عَلَيهِم آياتِهِ وَيُزَكّيهِم وَيُعَلِّمُهُمُ الكِتابَ وَالحِكمَةَ وَإِن كانوا مِن قَبلُ لَفي ضَلالٍ مُبينٍ\n" +
                    "TRANSLITERATION\n" +
                    "huwa lladhī baʿatha fī l-ʾummiyyīna rasūlan minhum yatlū ʿalayhim ʾāyātihī wa-yuzakkīhim wa-yuʿallimuhumu l-kitāba wa-l-ḥikmata wa-ʾin kānū min qablu la-fī ḍalālin mubīnin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "It is He who sent to the unlettered [people]\n" +
                    "an apostle from among themselves,\n" +
                    "to recite to them His signs, to purify them,\n" +
                    "and to teach them the Book and wisdom,\n" +
                    "and earlier they had indeed been\n" +
                    "in manifest error.");
            ayat.add("3\n" +
                    "وَآخَرينَ مِنهُم لَمّا يَلحَقوا بِهِم ۚ وَهُوَ العَزيزُ الحَكيمُ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾākharīna minhum lammā yalḥaqū bihim wa-huwa l-ʿazīzu l-ḥakīmu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And to others from among them [as well]\n" +
                    "who have not yet joined them.\n" +
                    "And He is the All-mighty, the All-wise.");
            ayat.add("4\n" +
                    "ذٰلِكَ فَضلُ اللَّهِ يُؤتيهِ مَن يَشاءُ ۚ وَاللَّهُ ذُو الفَضلِ العَظيمِ\n" +
                    "TRANSLITERATION\n" +
                    "dhālika faḍlu llāhi yuʾtīhi man yashāʾu wa-llāhu dhū l-faḍli l-ʿaẓīmi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "That is Allah’s grace\n" +
                    "which He grants to whomever He wishes,\n" +
                    "and Allah is dispenser of a great grace.");
            ayat.add("5\n" +
                    "مَثَلُ الَّذينَ حُمِّلُوا التَّوراةَ ثُمَّ لَم يَحمِلوها كَمَثَلِ الحِمارِ يَحمِلُ أَسفارًا ۚ بِئسَ مَثَلُ القَومِ الَّذينَ كَذَّبوا بِآياتِ اللَّهِ ۚ وَاللَّهُ لا يَهدِي القَومَ الظّالِمينَ\n" +
                    "TRANSLITERATION\n" +
                    "mathalu lladhīna ḥummilū t-tawrāta thumma lam yaḥmilūhā ka-mathali l-ḥimāri yaḥmilu ʾasfāran biʾsa mathalu l-qawmi lladhīna kadhdhabū bi-ʾāyāti llāhi wa-llāhu lā yahdī l-qawma ẓ-ẓālimīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The example of those who were charged with the Torah,\n" +
                    "then failed to carry it,\n" +
                    "is that of an ass carrying books.\n" +
                    "Evil is the example of the people who\n" +
                    "deny Allah’s signs,\n" +
                    "and Allah does not guide the wrongdoing lot.");
            ayat.add("6\n" +
                    "قُل يا أَيُّهَا الَّذينَ هادوا إِن زَعَمتُم أَنَّكُم أَولِياءُ لِلَّهِ مِن دونِ النّاسِ فَتَمَنَّوُا المَوتَ إِن كُنتُم صادِقينَ\n" +
                    "TRANSLITERATION\n" +
                    "qul yā-ʾayyuhā lladhīna hādū ʾin zaʿamtum ʾannakum ʾawliyāʾu li-llāhi min dūni n-nāsi fa-tamannawu l-mawta ʾin kuntum ṣādiqīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Say, ‘O Jews!\n" +
                    "If you claim that you are Allah’s favourites,\n" +
                    "to the exclusion of other people,\n" +
                    "then long for death,\n" +
                    "should you be truthful.’");
            ayat.add("7\n" +
                    "وَلا يَتَمَنَّونَهُ أَبَدًا بِما قَدَّمَت أَيديهِم ۚ وَاللَّهُ عَليمٌ بِالظّالِمينَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-lā yatamannawnahū ʾabadan bi-mā qaddamat ʾaydīhim wa-llāhu ʿalīmun bi-ẓ-ẓālimīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Yet they will never long for it,\n" +
                    "because of what their hands have sent ahead,\n" +
                    "and Allah knows best the wrongdoers.");
            ayat.add("8\n" +
                    "قُل إِنَّ المَوتَ الَّذي تَفِرّونَ مِنهُ فَإِنَّهُ مُلاقيكُم ۖ ثُمَّ تُرَدّونَ إِلىٰ عالِمِ الغَيبِ وَالشَّهادَةِ فَيُنَبِّئُكُم بِما كُنتُم تَعمَلونَ\n" +
                    "TRANSLITERATION\n" +
                    "qul ʾinna l-mawta lladhī tafirrūna minhu fa-ʾinnahū mulāqīkum thumma turaddūna ʾilā ʿālimi l-ghaybi wa-sh-shahādati fa-yunabbiʾukum bi-mā kuntum taʿmalūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Say, ‘Indeed the death that you flee\n" +
                    "will indeed encounter you.\n" +
                    "Then you will be returned\n" +
                    "to the Knower of the sensible and the Unseen,\n" +
                    "and He will inform you\n" +
                    "about what you used to do.’");
            ayat.add("9\n" +
                    "يا أَيُّهَا الَّذينَ آمَنوا إِذا نودِيَ لِلصَّلاةِ مِن يَومِ الجُمُعَةِ فَاسعَوا إِلىٰ ذِكرِ اللَّهِ وَذَرُوا البَيعَ ۚ ذٰلِكُم خَيرٌ لَكُم إِن كُنتُم تَعلَمونَ\n" +
                    "TRANSLITERATION\n" +
                    "yā-ʾayyuhā lladhīna ʾāmanū ʾidhā nūdiya li-ṣ-ṣalāti min yawmi l-jumuʿati fa-sʿaw ʾilā dhikri llāhi wa-dharū l-bayʿa dhālikum khayrun lakum ʾin kuntum taʿlamūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "O you who have faith!\n" +
                    "When the call is made for prayer on Friday,\n" +
                    "hurry toward the remembrance of Allah,\n" +
                    "and leave all business.\n" +
                    "That is better for you,\n" +
                    "should you know.");
            ayat.add("10\n" +
                    "فَإِذا قُضِيَتِ الصَّلاةُ فَانتَشِروا فِي الأَرضِ وَابتَغوا مِن فَضلِ اللَّهِ وَاذكُرُوا اللَّهَ كَثيرًا لَعَلَّكُم تُفلِحونَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾidhā quḍiyati ṣ-ṣalātu fa-ntashirū fī l-ʾarḍi wa-btaghū min faḍli llāhi wa-dhkurū llāha kathīran laʿallakum tufliḥūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And when the prayer is finished\n" +
                    "disperse through the land\n" +
                    "and seek Allah’s grace,\n" +
                    "and remember Allah greatly\n" +
                    "so that you may be felicitous.");
            ayat.add("11\n" +
                    "وَإِذا رَأَوا تِجارَةً أَو لَهوًا انفَضّوا إِلَيها وَتَرَكوكَ قائِمًا ۚ قُل ما عِندَ اللَّهِ خَيرٌ مِنَ اللَّهوِ وَمِنَ التِّجارَةِ ۚ وَاللَّهُ خَيرُ الرّازِقينَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾidhā raʾaw tijāratan ʾaw lahwan-i nfaḍḍū ʾilayhā wa-tarakūka qāʾiman qul mā ʿinda llāhi khayrun mina l-lahwi wa-mina t-tijārati wa-llāhu khayru r-rāziqīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "When they sight a deal or a diversion,\n" +
                    "they scatter off towards it\n" +
                    "and leave you standing!\n" +
                    "Say, ‘What is with Allah\n" +
                    "is better than diversion and dealing,\n" +
                    "and Allah is the best of providers.’");
        }
        else if (surahName.equals("63. Al-Munafiqun"))
        {
            setTitle("Al-Munafiqun(المنافقون) : The Hypocrites");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "إِذا جاءَكَ المُنافِقونَ قالوا نَشهَدُ إِنَّكَ لَرَسولُ اللَّهِ ۗ وَاللَّهُ يَعلَمُ إِنَّكَ لَرَسولُهُ وَاللَّهُ يَشهَدُ إِنَّ المُنافِقينَ لَكاذِبونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾidhā jāʾaka l-munāfiqūna qālū nashhadu ʾinnaka la-rasūlu llāhi wa-llāhu yaʿlamu ʾinnaka la-rasūluhū wa-llāhu yashhadu ʾinna l-munāfiqīna la-kādhibūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "When the hypocrites come to you\n" +
                    "they say, ‘We bear witness\n" +
                    "that you are indeed the apostle of Allah.’\n" +
                    "Allah knows that you are indeed His Apostle,\n" +
                    "and Allah bears witness that\n" +
                    "the hypocrites are indeed liars.");
            ayat.add("2\n" +
                    "اتَّخَذوا أَيمانَهُم جُنَّةً فَصَدّوا عَن سَبيلِ اللَّهِ ۚ إِنَّهُم ساءَ ما كانوا يَعمَلونَ\n" +
                    "TRANSLITERATION\n" +
                    "ittakhadhū ʾaymānahum junnatan fa-ṣaddū ʿan sabīli llāhi ʾinnahum sāʾa mā kānū yaʿmalūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They make a shield of their oaths,\n" +
                    "and bar from the way of Allah.\n" +
                    "Evil indeed is what they used to do.");
            ayat.add("3\n" +
                    "ذٰلِكَ بِأَنَّهُم آمَنوا ثُمَّ كَفَروا فَطُبِعَ عَلىٰ قُلوبِهِم فَهُم لا يَفقَهونَ\n" +
                    "TRANSLITERATION\n" +
                    "dhālika bi-ʾannahum ʾāmanū thumma kafarū fa-ṭubiʿa ʿalā qulūbihim fa-hum lā yafqahūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "That is because they believed and then disbelieved,\n" +
                    "so their hearts were sealed.\n" +
                    "Hence they do not understand.");
            ayat.add("4\n" +
                    "۞ وَإِذا رَأَيتَهُم تُعجِبُكَ أَجسامُهُم ۖ وَإِن يَقولوا تَسمَع لِقَولِهِم ۖ كَأَنَّهُم خُشُبٌ مُسَنَّدَةٌ ۖ يَحسَبونَ كُلَّ صَيحَةٍ عَلَيهِم ۚ هُمُ العَدُوُّ فَاحذَرهُم ۚ قاتَلَهُمُ اللَّهُ ۖ أَنّىٰ يُؤفَكونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾidhā raʾaytahum tuʿjibuka ʾajsāmuhum wa-ʾin yaqūlū tasmaʿ li-qawlihim ka-ʾannahum khushubun musannadatun yaḥsabūna kulla ṣayḥatin ʿalayhim humu l-ʿaduwwu fa-ḥdharhum qātalahumu llāhu ʾannā yuʾfakūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "When you see them, their bodies impress you,\n" +
                    "and if they speak, you listen to their speech.\n" +
                    "Yet they are like dry logs set reclining [against a wall].\n" +
                    "They suppose every cry is directed against them.\n" +
                    "They are the enemy, so beware of them.\n" +
                    "May Allah assail them, where do they stray?!");
            ayat.add("5\n" +
                    "وَإِذا قيلَ لَهُم تَعالَوا يَستَغفِر لَكُم رَسولُ اللَّهِ لَوَّوا رُءوسَهُم وَرَأَيتَهُم يَصُدّونَ وَهُم مُستَكبِرونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾidhā qīla lahum taʿālaw yastaghfir lakum rasūlu llāhi lawwaw ruʾūsahum wa-raʾaytahum yaṣuddūna wa-hum mustakbirūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "When they are told, ‘Come,\n" +
                    "that Allah’s Apostle may plead for forgiveness for you,’\n" +
                    "they twist their heads,\n" +
                    "and you see them turn away while they are disdainful.");
            ayat.add("6\n" +
                    "سَواءٌ عَلَيهِم أَستَغفَرتَ لَهُم أَم لَم تَستَغفِر لَهُم لَن يَغفِرَ اللَّهُ لَهُم ۚ إِنَّ اللَّهَ لا يَهدِي القَومَ الفاسِقينَ\n" +
                    "TRANSLITERATION\n" +
                    "sawāʾun ʿalayhim ʾa-staghfarta lahum ʾam lam tastaghfir lahum lan yaghfira llāhu lahum ʾinna llāha lā yahdī l-qawma l-fāsiqīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "It is the same for them\n" +
                    "whether you plead for forgiveness for them,\n" +
                    "or do not plead for forgiveness for them:\n" +
                    "Allah will never forgive them.\n" +
                    "Indeed Allah does not guide the transgressing lot.");
            ayat.add("7\n" +
                    "هُمُ الَّذينَ يَقولونَ لا تُنفِقوا عَلىٰ مَن عِندَ رَسولِ اللَّهِ حَتّىٰ يَنفَضّوا ۗ وَلِلَّهِ خَزائِنُ السَّماواتِ وَالأَرضِ وَلٰكِنَّ المُنافِقينَ لا يَفقَهونَ\n" +
                    "TRANSLITERATION\n" +
                    "humu lladhīna yaqūlūna lā tunfiqū ʿalā man ʿinda rasūli llāhi ḥattā yanfaḍḍū wa-li-llāhi khazāʾinu s-samāwāti wa-l-ʾarḍi wa-lākinna l-munāfiqīna lā yafqahūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They are the ones who say, ‘Do not spend\n" +
                    "on those who are with the Apostle of Allah\n" +
                    "until they scatter off.’\n" +
                    "Yet to Allah belong the treasuries of the heavens\n" +
                    "and the earth,\n" +
                    "but the hypocrites do not understand.");
            ayat.add("8\n" +
                    "يَقولونَ لَئِن رَجَعنا إِلَى المَدينَةِ لَيُخرِجَنَّ الأَعَزُّ مِنهَا الأَذَلَّ ۚ وَلِلَّهِ العِزَّةُ وَلِرَسولِهِ وَلِلمُؤمِنينَ وَلٰكِنَّ المُنافِقينَ لا يَعلَمونَ\n" +
                    "TRANSLITERATION\n" +
                    "yaqūlūna la-ʾin rajaʿnā ʾilā l-madīnati la-yukhrijanna l-ʾaʿazzu minhā l-ʾadhalla wa-li-llāhi l-ʿizzatu wa-li-rasūlihī wa-li-l-muʾminīna wa-lākinna l-munāfiqīna lā yaʿlamūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They say, ‘When we return to the city,\n" +
                    "the mighty will surely expel the abased from it.’1\n" +
                    "Yet all might belongs to Allah and His Apostle,\n" +
                    "and the faithful,\n" +
                    "but the hypocrites do not know.");
            ayat.add("9\n" +
                    "يا أَيُّهَا الَّذينَ آمَنوا لا تُلهِكُم أَموالُكُم وَلا أَولادُكُم عَن ذِكرِ اللَّهِ ۚ وَمَن يَفعَل ذٰلِكَ فَأُولٰئِكَ هُمُ الخاسِرونَ\n" +
                    "TRANSLITERATION\n" +
                    "yā-ʾayyuhā lladhīna ʾāmanū lā tulhikum ʾamwālukum wa-lā ʾawlādukum ʿan dhikri llāhi wa-man yafʿal dhālika fa-ʾulāʾika humu l-khāsirūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "O you who have faith!\n" +
                    "Do not let your possessions and children distract you\n" +
                    "from the remembrance of Allah,\n" +
                    "and whoever does that\n" +
                    "—it is they who are the losers.");
            ayat.add("10\n" +
                    "وَأَنفِقوا مِن ما رَزَقناكُم مِن قَبلِ أَن يَأتِيَ أَحَدَكُمُ المَوتُ فَيَقولَ رَبِّ لَولا أَخَّرتَني إِلىٰ أَجَلٍ قَريبٍ فَأَصَّدَّقَ وَأَكُن مِنَ الصّالِحينَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾanfiqū min mā razaqnākum min qabli ʾan yaʾtiya ʾaḥadakumu l-mawtu fa-yaqūla rabbi law-lā ʾakhkhartanī ʾilā ʾajalin qarībin fa-ʾaṣṣaddaqa wa-ʾakun mina ṣ-ṣāliḥīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Spend from what We have provided you\n" +
                    "before death comes to any of you,\n" +
                    "whereat he will say, ‘My Lord,\n" +
                    "why did You not respite me for a short time\n" +
                    "so that I might have given charity\n" +
                    "and become one of the righteous!’");
            ayat.add("11\n" +
                    "وَلَن يُؤَخِّرَ اللَّهُ نَفسًا إِذا جاءَ أَجَلُها ۚ وَاللَّهُ خَبيرٌ بِما تَعمَلونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-lan yuʾakhkhira llāhu nafsan ʾidhā jāʾa ʾajaluhā wa-llāhu khabīrun bi-mā taʿmalūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "But Allah shall never respite a soul\n" +
                    "when its time has come,\n" +
                    "and Allah is well aware of what you do.");
        }
        else if (surahName.equals("64. At-Taghabun"))
        {
            setTitle("At-Taghabun(التغابن) : Dispossession");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "يُسَبِّحُ لِلَّهِ ما فِي السَّماواتِ وَما فِي الأَرضِ ۖ لَهُ المُلكُ وَلَهُ الحَمدُ ۖ وَهُوَ عَلىٰ كُلِّ شَيءٍ قَديرٌ\n" +
                    "TRANSLITERATION\n" +
                    "yusabbiḥu li-llāhi mā fī s-samāwāti wa-mā fī l-ʾarḍi lahu l-mulku wa-lahu l-ḥamdu wa-huwa ʿalā kulli shayʾin qadīrun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Whatever there is in the heavens glorifies Allah\n" +
                    "and whatever there is in the earth.\n" +
                    "To Him belongs all sovereignty\n" +
                    "and to Him belongs all praise,\n" +
                    "and He has power over all things.");
            ayat.add("2\n" +
                    "هُوَ الَّذي خَلَقَكُم فَمِنكُم كافِرٌ وَمِنكُم مُؤمِنٌ ۚ وَاللَّهُ بِما تَعمَلونَ بَصيرٌ\n" +
                    "TRANSLITERATION\n" +
                    "huwa lladhī khalaqakum fa-minkum kāfirun wa-minkum muʾminun wa-llāhu bi-mā taʿmalūna baṣīrun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "It is He who created you.\n" +
                    "Then some of you are faithless\n" +
                    "and some of you are faithful,\n" +
                    "and Allah sees best what you do.");
            ayat.add("3\n" +
                    "خَلَقَ السَّماواتِ وَالأَرضَ بِالحَقِّ وَصَوَّرَكُم فَأَحسَنَ صُوَرَكُم ۖ وَإِلَيهِ المَصيرُ\n" +
                    "TRANSLITERATION\n" +
                    "khalaqa s-samāwāti wa-l-ʾarḍa bi-l-ḥaqqi wa-ṣawwarakum fa-ʾaḥsana ṣuwarakum wa-ʾilayhi l-maṣīru\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "He created the heavens and the earth\n" +
                    "with reason,\n" +
                    "and He formed you and perfected your forms,\n" +
                    "and toward Him is the destination.");
            ayat.add("4\n" +
                    "يَعلَمُ ما فِي السَّماواتِ وَالأَرضِ وَيَعلَمُ ما تُسِرّونَ وَما تُعلِنونَ ۚ وَاللَّهُ عَليمٌ بِذاتِ الصُّدورِ\n" +
                    "TRANSLITERATION\n" +
                    "yaʿlamu mā fī s-samāwāti wa-l-ʾarḍi wa-yaʿlamu mā tusirrūna wa-mā tuʿlinūna wa-llāhu ʿalīmun bi-dhāti ṣ-ṣudūri\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "He knows whatever there is in the heavens and the earth,\n" +
                    "and He knows whatever you hide\n" +
                    "and whatever you disclose,\n" +
                    "and Allah knows best what is in the breasts.");
            ayat.add("5\n" +
                    "أَلَم يَأتِكُم نَبَأُ الَّذينَ كَفَروا مِن قَبلُ فَذاقوا وَبالَ أَمرِهِم وَلَهُم عَذابٌ أَليمٌ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-lam yaʾtikum nabaʾu lladhīna kafarū min qablu fa-dhāqū wabāla ʾamrihim wa-lahum ʿadhābun ʾalīmun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Has there not come to you the account\n" +
                    "of those who were faithless before?\n" +
                    "They tasted the evil consequences of their conduct,\n" +
                    "and there is a painful punishment for them.");
            ayat.add("6\n" +
                    "ذٰلِكَ بِأَنَّهُ كانَت تَأتيهِم رُسُلُهُم بِالبَيِّناتِ فَقالوا أَبَشَرٌ يَهدونَنا فَكَفَروا وَتَوَلَّوا ۚ وَاستَغنَى اللَّهُ ۚ وَاللَّهُ غَنِيٌّ حَميدٌ\n" +
                    "TRANSLITERATION\n" +
                    "dhālika bi-ʾannahū kānat taʾtīhim rusuluhum bi-l-bayyināti fa-qālū ʾa-basharun yahdūnanā fa-kafarū wa-tawallaw wa-staghnā llāhu wa-llāhu ghaniyyun ḥamīdun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "That was because their apostles used to bring them\n" +
                    "manifest proofs,\n" +
                    "but they said, ‘Shall humans be our guides?!’\n" +
                    "So they disbelieved and turned away,\n" +
                    "and Allah was in no need [of their faith]\n" +
                    "and Allah is all-sufficient, all-laudable.");
            ayat.add("7\n" +
                    "زَعَمَ الَّذينَ كَفَروا أَن لَن يُبعَثوا ۚ قُل بَلىٰ وَرَبّي لَتُبعَثُنَّ ثُمَّ لَتُنَبَّؤُنَّ بِما عَمِلتُم ۚ وَذٰلِكَ عَلَى اللَّهِ يَسيرٌ\n" +
                    "TRANSLITERATION\n" +
                    "zaʿama lladhīna kafarū ʾan lan yubʿathū qul balā wa-rabbī la-tubʿathunna thumma la-tunabbaʾunna bi-mā ʿamiltum wa-dhālika ʿalā llāhi yasīrun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The faithless claim that they will not be resurrected.\n" +
                    "Say, ‘Yes, by my Lord,\n" +
                    "you will surely be resurrected;\n" +
                    "then you will surely be informed of what you did,\n" +
                    "and that is easy for Allah.’");
            ayat.add("8\n" +
                    "فَآمِنوا بِاللَّهِ وَرَسولِهِ وَالنّورِ الَّذي أَنزَلنا ۚ وَاللَّهُ بِما تَعمَلونَ خَبيرٌ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾāminū bi-llāhi wa-rasūlihī wa-n-nūri lladhī ʾanzalnā wa-llāhu bi-mā taʿmalūna khabīrun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So have faith in Allah and His Apostle\n" +
                    "and the light which We have sent down,\n" +
                    "and Allah is well aware of what you do.");
            ayat.add("9\n" +
                    "يَومَ يَجمَعُكُم لِيَومِ الجَمعِ ۖ ذٰلِكَ يَومُ التَّغابُنِ ۗ وَمَن يُؤمِن بِاللَّهِ وَيَعمَل صالِحًا يُكَفِّر عَنهُ سَيِّئَاتِهِ وَيُدخِلهُ جَنّاتٍ تَجري مِن تَحتِهَا الأَنهارُ خالِدينَ فيها أَبَدًا ۚ ذٰلِكَ الفَوزُ العَظيمُ\n" +
                    "TRANSLITERATION\n" +
                    "yawma yajmaʿukum li-yawmi l-jamʿi dhālika yawmu t-taghābuni wa-man yuʾmin bi-llāhi wa-yaʿmal ṣāliḥan yukaffir ʿanhu sayyiʾātihī wa-yudkhilhu jannātin tajrī min taḥtihā l-ʾanhāru khālidīna fīhā ʾabadan dhālika l-fawzu l-ʿaẓīmu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The day when He will gather you\n" +
                    "for the Day of Gathering,\n" +
                    "that will be a day of dispossession.1\n" +
                    "And whoever has faith in Allah and acts righteously,\n" +
                    "He shall absolve him of his misdeeds\n" +
                    "and admit him into gardens\n" +
                    "with streams running in them,\n" +
                    "to remain in them forever.\n" +
                    "That is the great success.");
            ayat.add("10\n" +
                    "وَالَّذينَ كَفَروا وَكَذَّبوا بِآياتِنا أُولٰئِكَ أَصحابُ النّارِ خالِدينَ فيها ۖ وَبِئسَ المَصيرُ\n" +
                    "TRANSLITERATION\n" +
                    "wa-lladhīna kafarū wa-kadhdhabū bi-ʾāyātinā ʾulāʾika ʾaṣḥābu n-nāri khālidīna fīhā wa-biʾsa l-maṣīru\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "But as for those who are faithless and deny Our signs,\n" +
                    "—they shall be the inmates of the Fire,\n" +
                    "to remain in it [forever],\n" +
                    "and it is an evil destination.");
            ayat.add("11\n" +
                    "ما أَصابَ مِن مُصيبَةٍ إِلّا بِإِذنِ اللَّهِ ۗ وَمَن يُؤمِن بِاللَّهِ يَهدِ قَلبَهُ ۚ وَاللَّهُ بِكُلِّ شَيءٍ عَليمٌ\n" +
                    "TRANSLITERATION\n" +
                    "mā ʾaṣāba min muṣībatin ʾillā bi-ʾidhni llāhi wa-man yuʾmin bi-llāhi yahdi qalbahū wa-llāhu bi-kulli shayʾin ʿalīmun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "No affliction visits [anyone] except by Allah’s leave.\n" +
                    "Whoever has faith in Allah,\n" +
                    "He guides his heart,\n" +
                    "and Allah has knowledge of all things.");
            ayat.add("12\n" +
                    "وَأَطيعُوا اللَّهَ وَأَطيعُوا الرَّسولَ ۚ فَإِن تَوَلَّيتُم فَإِنَّما عَلىٰ رَسولِنَا البَلاغُ المُبينُ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾaṭīʿū llāha wa-ʾaṭīʿū r-rasūla fa-ʾin tawallaytum fa-ʾinnamā ʿalā rasūlinā l-balāghu l-mubīnu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Obey Allah and obey the Apostle;\n" +
                    "but if you turn away,\n" +
                    "then Our Apostle’s duty is only\n" +
                    "to communicate in clear terms.");
            ayat.add("13\n" +
                    "اللَّهُ لا إِلٰهَ إِلّا هُوَ ۚ وَعَلَى اللَّهِ فَليَتَوَكَّلِ المُؤمِنونَ\n" +
                    "TRANSLITERATION\n" +
                    "allāhu lā ʾilāha ʾillā huwa wa-ʿalā llāhi fa-l-yatawakkali l-muʾminūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Allah—there is no god except Him—\n" +
                    "in Allah let all the faithful put their trust.");
            ayat.add("14\n" +
                    "يا أَيُّهَا الَّذينَ آمَنوا إِنَّ مِن أَزواجِكُم وَأَولادِكُم عَدُوًّا لَكُم فَاحذَروهُم ۚ وَإِن تَعفوا وَتَصفَحوا وَتَغفِروا فَإِنَّ اللَّهَ غَفورٌ رَحيمٌ\n" +
                    "TRANSLITERATION\n" +
                    "yā-ʾayyuhā lladhīna ʾāmanū ʾinna min ʾazwājikum wa-ʾawlādikum ʿaduwwan lakum fa-ḥdharūhum wa-ʾin taʿfū wa-taṣfaḥū wa-taghfirū fa-ʾinna llāha ghafūrun raḥīmun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "O you who have faith!\n" +
                    "Indeed among your spouses and children\n" +
                    "you have enemies;\n" +
                    "so beware of them.\n" +
                    "And if you excuse, forbear and forgive,\n" +
                    "then Allah is indeed all-forgiving, all-merciful.");
            ayat.add("15\n" +
                    "إِنَّما أَموالُكُم وَأَولادُكُم فِتنَةٌ ۚ وَاللَّهُ عِندَهُ أَجرٌ عَظيمٌ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnamā ʾamwālukum wa-ʾawlādukum fitnatun wa-llāhu ʿindahū ʾajrun ʿaẓīmun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Rather your possessions and children are a trial,\n" +
                    "and Allah—with Him is a great reward!");
            ayat.add("16\n" +
                    "فَاتَّقُوا اللَّهَ مَا استَطَعتُم وَاسمَعوا وَأَطيعوا وَأَنفِقوا خَيرًا لِأَنفُسِكُم ۗ وَمَن يوقَ شُحَّ نَفسِهِ فَأُولٰئِكَ هُمُ المُفلِحونَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ttaqū llāha mā staṭaʿtum wa-smaʿū wa-ʾaṭīʿū wa-ʾanfiqū khayran li-ʾanfusikum wa-man yūqa shuḥḥa nafsihī fa-ʾulāʾika humu l-mufliḥūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So be wary of Allah, as far as you can,\n" +
                    "and listen and obey,\n" +
                    "and spend [in the way of Allah];\n" +
                    "that is better for yourselves.\n" +
                    "Those who are saved from their own greed\n" +
                    "—it is they who are the felicitous.");
            ayat.add("17\n" +
                    "إِن تُقرِضُوا اللَّهَ قَرضًا حَسَنًا يُضاعِفهُ لَكُم وَيَغفِر لَكُم ۚ وَاللَّهُ شَكورٌ حَليمٌ\n" +
                    "TRANSLITERATION\n" +
                    "ʾin tuqriḍū llāha qarḍan ḥasanan yuḍāʿifhu lakum wa-yaghfir lakum wa-llāhu shakūrun ḥalīmun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "If you lend Allah a good loan,\n" +
                    "He shall multiply it for you and forgive you,\n" +
                    "and Allah is all-appreciative, all-forbearing,");
            ayat.add("18\n" +
                    "عالِمُ الغَيبِ وَالشَّهادَةِ العَزيزُ الحَكيمُ\n" +
                    "TRANSLITERATION\n" +
                    "ʿālimu l-ghaybi wa-ṣ-ṣahādati l-ʿazīzu l-ḥakīmu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Knower of the sensible and the Unseen,\n" +
                    "the All-mighty, the All-wise.");
        }
        else if (surahName.equals("65. At-Talaq"))
        {
            setTitle("At-Talaq(الطلاق) : Divorce");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "يا أَيُّهَا النَّبِيُّ إِذا طَلَّقتُمُ النِّساءَ فَطَلِّقوهُنَّ لِعِدَّتِهِنَّ وَأَحصُوا العِدَّةَ ۖ وَاتَّقُوا اللَّهَ رَبَّكُم ۖ لا تُخرِجوهُنَّ مِن بُيوتِهِنَّ وَلا يَخرُجنَ إِلّا أَن يَأتينَ بِفاحِشَةٍ مُبَيِّنَةٍ ۚ وَتِلكَ حُدودُ اللَّهِ ۚ وَمَن يَتَعَدَّ حُدودَ اللَّهِ فَقَد ظَلَمَ نَفسَهُ ۚ لا تَدري لَعَلَّ اللَّهَ يُحدِثُ بَعدَ ذٰلِكَ أَمرًا\n" +
                    "TRANSLITERATION\n" +
                    "yā-ʾayyuhā n-nabiyyu ʾidhā ṭallaqtumu n-nisāʾa fa-ṭalliqūhunna li-ʿiddatihinna wa-ʾaḥṣū l-ʿiddata wa-ttaqū llāha rabbakum lā tukhrijūhunna min buyūtihinna wa-lā yakhrujna ʾillā ʾan yaʾtīna bi-fāḥishatin mubayyinatin wa-tilka ḥudūdu llāhi wa-man yataʿadda ḥudūda llāhi fa-qad ẓalama nafsahū lā tadrī laʿalla llāha yuḥdithu baʿda dhālika ʾamran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "O Prophet!\n" +
                    "When you1 divorce women,\n" +
                    "divorce them at [the conclusion of] their term2\n" +
                    "and calculate the term,\n" +
                    "and be wary of Allah, your Lord.\n" +
                    "Do not turn them out from their houses,\n" +
                    "nor shall they go out,\n" +
                    "unless they commit a gross3 indecency.4\n" +
                    "These are Allah’s bounds,\n" +
                    "and whoever transgresses the bounds of Allah\n" +
                    "certainly wrongs himself.\n" +
                    "You never know\n" +
                    "maybe Allah will bring off something new later on.");
            ayat.add("2\n" +
                    "فَإِذا بَلَغنَ أَجَلَهُنَّ فَأَمسِكوهُنَّ بِمَعروفٍ أَو فارِقوهُنَّ بِمَعروفٍ وَأَشهِدوا ذَوَي عَدلٍ مِنكُم وَأَقيمُوا الشَّهادَةَ لِلَّهِ ۚ ذٰلِكُم يوعَظُ بِهِ مَن كانَ يُؤمِنُ بِاللَّهِ وَاليَومِ الآخِرِ ۚ وَمَن يَتَّقِ اللَّهَ يَجعَل لَهُ مَخرَجًا\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾidhā balaghna ʾajalahunna fa-ʾamsikūhunna bi-maʿrūfin ʾaw fāriqūhunna bi-maʿrūfin wa-ʾashhidū dhaway ʿadlin minkum wa-ʾaqīmū sh-shahādata li-llāhi dhālikum yūʿaẓu bihī man kāna yuʾminu bi-llāhi wa-l-yawmi l-ʾākhiri wa-man yattaqi llāha yajʿal lahū makhrajan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Then, when they have completed their term,\n" +
                    "either retain them honourably\n" +
                    "or separate from them honourably,\n" +
                    "and take the witness of two fair men\n" +
                    "from among yourselves,\n" +
                    "and bear witness for the sake of Allah.\n" +
                    "To [comply with] this is advised\n" +
                    "whoever believes in Allah\n" +
                    "and the Last Day.\n" +
                    "And whoever is wary of Allah,\n" +
                    "He shall make a way out for him,");
            ayat.add("3\n" +
                    "وَيَرزُقهُ مِن حَيثُ لا يَحتَسِبُ ۚ وَمَن يَتَوَكَّل عَلَى اللَّهِ فَهُوَ حَسبُهُ ۚ إِنَّ اللَّهَ بالِغُ أَمرِهِ ۚ قَد جَعَلَ اللَّهُ لِكُلِّ شَيءٍ قَدرًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-yarzuqhu min ḥaythu lā yaḥtasibu wa-man yatawakkal ʿalā llāhi fa-huwa ḥasbuhū ʾinna llāha bālighu ʾamrihī qad jaʿala llāhu li-kulli shayʾin qadran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and provide for him\n" +
                    "from whence he does not reckon.\n" +
                    "And whoever puts his trust in Allah,\n" +
                    "He will suffice him.\n" +
                    "Indeed Allah carries through His command.\n" +
                    "Certainly Allah has set a measure for everything.");
            ayat.add("4\n" +
                    "وَاللّائي يَئِسنَ مِنَ المَحيضِ مِن نِسائِكُم إِنِ ارتَبتُم فَعِدَّتُهُنَّ ثَلاثَةُ أَشهُرٍ وَاللّائي لَم يَحِضنَ ۚ وَأُولاتُ الأَحمالِ أَجَلُهُنَّ أَن يَضَعنَ حَملَهُنَّ ۚ وَمَن يَتَّقِ اللَّهَ يَجعَل لَهُ مِن أَمرِهِ يُسرًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-llāʾī yaʾisna mina l-maḥīḍi min nisāʾikum ʾini rtabtum fa-ʿiddatuhunna thalāthatu ʾashhurin wa-llāʾī lam yaḥiḍna wa-ʾulātu l-ʾaḥmāli ʾajaluhunna ʾan yaḍaʿna ḥamlahunna wa-man yattaqi llāha yajʿal lahū min ʾamrihī yusran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "As for those\n" +
                    "of your wives who do not hope to have menses,\n" +
                    "should you have any doubts,\n" +
                    "their term shall be three months,\n" +
                    "and for those [as well] who have not yet had menses.\n" +
                    "As for those who are pregnant,\n" +
                    "their term shall be until they deliver.\n" +
                    "And whoever is wary of Allah,\n" +
                    "He shall grant him ease in his affairs.");
            ayat.add("5\n" +
                    "ذٰلِكَ أَمرُ اللَّهِ أَنزَلَهُ إِلَيكُم ۚ وَمَن يَتَّقِ اللَّهَ يُكَفِّر عَنهُ سَيِّئَاتِهِ وَيُعظِم لَهُ أَجرًا\n" +
                    "TRANSLITERATION\n" +
                    "dhālika ʾamru llāhi ʾanzalahū ʾilaykum wa-man yattaqi llāha yukaffir ʿanhu sayyiʾātihī wa-yuʿẓim lahū ʾajran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "That is the ordinance of Allah\n" +
                    "which He has sent down to you,\n" +
                    "and whoever is wary of Allah,\n" +
                    "He shall absolve him of his misdeeds\n" +
                    "and give him a great reward.");
            ayat.add("6\n" +
                    "أَسكِنوهُنَّ مِن حَيثُ سَكَنتُم مِن وُجدِكُم وَلا تُضارّوهُنَّ لِتُضَيِّقوا عَلَيهِنَّ ۚ وَإِن كُنَّ أُولاتِ حَملٍ فَأَنفِقوا عَلَيهِنَّ حَتّىٰ يَضَعنَ حَملَهُنَّ ۚ فَإِن أَرضَعنَ لَكُم فَآتوهُنَّ أُجورَهُنَّ ۖ وَأتَمِروا بَينَكُم بِمَعروفٍ ۖ وَإِن تَعاسَرتُم فَسَتُرضِعُ لَهُ أُخرىٰ\n" +
                    "TRANSLITERATION\n" +
                    "ʾaskinūhunna min ḥaythu sakantum min wujdikum wa-lā tuḍārrūhunna li-tuḍayyiqū ʿalayhinna wa-ʾin kunna ʾulāti ḥamlin fa-ʾanfiqū ʿalayhinna ḥattā yaḍaʿna ḥamlahunna fa-ʾin ʾarḍaʿna lakum fa-ʾātūhunna ʾujūrahunna wa-ʾtamirū baynakum bi-maʿrūfin wa-ʾin taʿāsartum fa-sa-turḍiʿu lahū ʾukhrā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "House them where you live,1\n" +
                    "in accordance with your means,\n" +
                    "and do not harass them to put them in straits,\n" +
                    "and should they be pregnant,\n" +
                    "maintain them until they deliver.\n" +
                    "Then, if they suckle [the baby] for you,\n" +
                    "give them their wages\n" +
                    "and consult together honourably;\n" +
                    "but if you make things difficult for each other,\n" +
                    "then another woman will suckle [the baby] for him.2");
            ayat.add("7\n" +
                    "لِيُنفِق ذو سَعَةٍ مِن سَعَتِهِ ۖ وَمَن قُدِرَ عَلَيهِ رِزقُهُ فَليُنفِق مِمّا آتاهُ اللَّهُ ۚ لا يُكَلِّفُ اللَّهُ نَفسًا إِلّا ما آتاها ۚ سَيَجعَلُ اللَّهُ بَعدَ عُسرٍ يُسرًا\n" +
                    "TRANSLITERATION\n" +
                    "li-yunfiq dhū saʿatin min saʿatihī wa-man qudira ʿalayhi rizquhū fa-l-yunfiq mimmā ʾātāhu llāhu lā yukallifu llāhu nafsan ʾillā mā ʾātāhā sa-yajʿalu llāhu baʿda ʿusrin yusran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Let the affluent man spend out of his affluence,\n" +
                    "and let he whose provision has been tightened\n" +
                    "spend out of what Allah has given him.\n" +
                    "Allah does not task any soul\n" +
                    "except [according to] what He has given it.\n" +
                    "Allah will bring about ease after hardship.");
            ayat.add("8\n" +
                    "وَكَأَيِّن مِن قَريَةٍ عَتَت عَن أَمرِ رَبِّها وَرُسُلِهِ فَحاسَبناها حِسابًا شَديدًا وَعَذَّبناها عَذابًا نُكرًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-ka-ʾayyin min qaryatin ʿatat ʿan ʾamri rabbihā wa-rusulihī fa-ḥāsabnāhā ḥisāban shadīdan wa-ʿadhdhabnāhā ʿadhāban nukran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "How many a town defied the command of its Lord\n" +
                    "and His apostles,\n" +
                    "then We called it to a severe account\n" +
                    "and punished it with a dire punishment.");
            ayat.add("9\n" +
                    "فَذاقَت وَبالَ أَمرِها وَكانَ عاقِبَةُ أَمرِها خُسرًا\n" +
                    "TRANSLITERATION\n" +
                    "fa-dhāqat wabāla ʾamrihā wa-kāna ʿāqibatu ʾamrihā khusran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So it tasted the evil consequences of its conduct,\n" +
                    "and the outcome of its conduct was ruin.");
            ayat.add("10\n" +
                    "أَعَدَّ اللَّهُ لَهُم عَذابًا شَديدًا ۖ فَاتَّقُوا اللَّهَ يا أُولِي الأَلبابِ الَّذينَ آمَنوا ۚ قَد أَنزَلَ اللَّهُ إِلَيكُم ذِكرًا\n" +
                    "TRANSLITERATION\n" +
                    "ʾaʿadda llāhu lahum ʿadhāban shadīdan fa-ttaqū llāha yā-ʾulī l-ʾalbābi lladhīna ʾāmanū qad ʾanzala llāhu ʾilaykum dhikran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Allah has prepared for them a severe punishment.\n" +
                    "So be wary of Allah,\n" +
                    "O you who possess intellect and have faith!\n" +
                    "Allah has already sent down to you a reminder,");
            ayat.add("11\n" +
                    "رَسولًا يَتلو عَلَيكُم آياتِ اللَّهِ مُبَيِّناتٍ لِيُخرِجَ الَّذينَ آمَنوا وَعَمِلُوا الصّالِحاتِ مِنَ الظُّلُماتِ إِلَى النّورِ ۚ وَمَن يُؤمِن بِاللَّهِ وَيَعمَل صالِحًا يُدخِلهُ جَنّاتٍ تَجري مِن تَحتِهَا الأَنهارُ خالِدينَ فيها أَبَدًا ۖ قَد أَحسَنَ اللَّهُ لَهُ رِزقًا\n" +
                    "TRANSLITERATION\n" +
                    "rasūlan yatlū ʿalaykum ʾāyāti llāhi mubayyinātin li-yukhrija lladhīna ʾāmanū wa-ʿamilū ṣ-ṣāliḥāti mina ẓ-ẓulumāti ʾilā n-nūri wa-man yuʾmin bi-llāhi wa-yaʿmal ṣāliḥan yudkhilhu jannātin tajrī min taḥtihā l-ʾanhāru khālidīna fīhā ʾabadan qad ʾaḥsana llāhu lahū rizqan-i\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "an apostle\n" +
                    "reciting to you the manifest signs of Allah\n" +
                    "that He may bring out those who have faith\n" +
                    "and do righteous deeds\n" +
                    "from darkness into light.\n" +
                    "And whoever has faith in Allah\n" +
                    "and does righteous deeds,\n" +
                    "He shall admit him into gardens\n" +
                    "with streams running in them,\n" +
                    "to remain in them forever.\n" +
                    "Allah has certainly granted him an excellent provision.");
            ayat.add("12\n" +
                    "اللَّهُ الَّذي خَلَقَ سَبعَ سَماواتٍ وَمِنَ الأَرضِ مِثلَهُنَّ يَتَنَزَّلُ الأَمرُ بَينَهُنَّ لِتَعلَموا أَنَّ اللَّهَ عَلىٰ كُلِّ شَيءٍ قَديرٌ وَأَنَّ اللَّهَ قَد أَحاطَ بِكُلِّ شَيءٍ عِلمًا\n" +
                    "TRANSLITERATION\n" +
                    "allāhu lladhī khalaqa sabʿa samāwātin wa-mina l-ʾarḍi mithlahunna yatanazzalu l-ʾamru baynahunna li-taʿlamū ʾanna llāha ʿalā kulli shayʾin qadīrun wa-ʾanna llāha qad ʾaḥāṭa bi-kulli shayʾin ʿilman\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "It is Allah who has created seven heavens,\n" +
                    "and of the earth [a number] similar to them.\n" +
                    "The command gradually descends through them,\n" +
                    "that you may know\n" +
                    "that Allah has power over all things,\n" +
                    "and that Allah comprehends all things in knowledge.");
        }
        else if (surahName.equals("66. At-Tahreem"))
        {
            setTitle("At-Tahreem(التحريم) : The Forbidding");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "يا أَيُّهَا النَّبِيُّ لِمَ تُحَرِّمُ ما أَحَلَّ اللَّهُ لَكَ ۖ تَبتَغي مَرضاتَ أَزواجِكَ ۚ وَاللَّهُ غَفورٌ رَحيمٌ\n" +
                    "TRANSLITERATION\n" +
                    "yā-ʾayyuhā n-nabiyyu li-ma tuḥarrimu mā ʾaḥalla llāhu laka tabtaghī marḍāta ʾazwājika wa-llāhu ghafūrun raḥīmun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "O Prophet! Why do you prohibit [yourself]\n" +
                    "what Allah has made lawful for you,\n" +
                    "seeking to please your wives?\n" +
                    "And Allah is all-forgiving, all-merciful.");
            ayat.add("2\n" +
                    "قَد فَرَضَ اللَّهُ لَكُم تَحِلَّةَ أَيمانِكُم ۚ وَاللَّهُ مَولاكُم ۖ وَهُوَ العَليمُ الحَكيمُ\n" +
                    "TRANSLITERATION\n" +
                    "qad faraḍa llāhu lakum taḥillata ʾaymānikum wa-llāhu mawlākum wa-huwa l-ʿalīmu l-ḥakīmu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Allah has certainly made lawful for you\n" +
                    "the dissolution of your oaths,1\n" +
                    "and Allah is your master\n" +
                    "and He is the All-knowing, the All-wise.");
            ayat.add("3\n" +
                    "وَإِذ أَسَرَّ النَّبِيُّ إِلىٰ بَعضِ أَزواجِهِ حَديثًا فَلَمّا نَبَّأَت بِهِ وَأَظهَرَهُ اللَّهُ عَلَيهِ عَرَّفَ بَعضَهُ وَأَعرَضَ عَن بَعضٍ ۖ فَلَمّا نَبَّأَها بِهِ قالَت مَن أَنبَأَكَ هٰذا ۖ قالَ نَبَّأَنِيَ العَليمُ الخَبيرُ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾidh ʾasarra n-nabiyyu ʾilā baʿḍi ʾazwājihī ḥadīthan fa-lammā nabbaʾat bihī wa-ʾaẓharahu llāhu ʿalayhi ʿarrafa baʿḍahū wa-ʾaʿraḍa ʿan baʿḍin fa-lammā nabbaʾahā bihī qālat man ʾanbaʾaka hādhā qāla nabbaʾaniya l-ʿalīmu l-khabīru\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "When the Prophet confided to one of his wives\n" +
                    "a matter,\n" +
                    "but when she divulged it,\n" +
                    "and Allah apprised him about it,\n" +
                    "he announced [to her] part of it\n" +
                    "and disregarded part of it.\n" +
                    "So when he told her about it,\n" +
                    "she said, ‘Who informed you about it?’\n" +
                    "He said,\n" +
                    "‘The All-knowing and the All-aware informed me.’");
            ayat.add("4\n" +
                    "إِن تَتوبا إِلَى اللَّهِ فَقَد صَغَت قُلوبُكُما ۖ وَإِن تَظاهَرا عَلَيهِ فَإِنَّ اللَّهَ هُوَ مَولاهُ وَجِبريلُ وَصالِحُ المُؤمِنينَ ۖ وَالمَلائِكَةُ بَعدَ ذٰلِكَ ظَهيرٌ\n" +
                    "TRANSLITERATION\n" +
                    "ʾin tatūbā ʾilā llāhi fa-qad ṣaghat qulūbukumā wa-ʾin taẓāharā ʿalayhi fa-ʾinna llāha huwa mawlāhu wa-jibrīlu wa-ṣāliḥu l-muʾminīna wa-l-malāʾikatu baʿda dhālika ẓahīrun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "If the two of you1 repent to Allah …2\n" +
                    "for your hearts have certainly swerved,\n" +
                    "and if you back each other against him,\n" +
                    "then [know that] Allah is indeed his guardian,\n" +
                    "and Gabriel, the righteous among the faithful,\n" +
                    "and, thereafter, the angels are his supporters.");
            ayat.add("5\n" +
                    "عَسىٰ رَبُّهُ إِن طَلَّقَكُنَّ أَن يُبدِلَهُ أَزواجًا خَيرًا مِنكُنَّ مُسلِماتٍ مُؤمِناتٍ قانِتاتٍ تائِباتٍ عابِداتٍ سائِحاتٍ ثَيِّباتٍ وَأَبكارًا\n" +
                    "TRANSLITERATION\n" +
                    "ʿasā rabbuhū ʾin ṭallaqakunna ʾan yubdilahū ʾazwājan khayran minkunna muslimātin muʾminātin qānitātin tāʾibātin ʿābidātin sāʾiḥātin thayyibātin wa-ʾabkāran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "It may be that if he divorces you\n" +
                    "his Lord will give him, in [your] stead, wives\n" +
                    "better than you:\n" +
                    "[such as are] muslim, faithful, obedient,\n" +
                    "penitent, devout and given to fasting,\n" +
                    "virgins and non-virgins.");
            ayat.add("6\n" +
                    "يا أَيُّهَا الَّذينَ آمَنوا قوا أَنفُسَكُم وَأَهليكُم نارًا وَقودُهَا النّاسُ وَالحِجارَةُ عَلَيها مَلائِكَةٌ غِلاظٌ شِدادٌ لا يَعصونَ اللَّهَ ما أَمَرَهُم وَيَفعَلونَ ما يُؤمَرونَ\n" +
                    "TRANSLITERATION\n" +
                    "yā-ʾayyuhā lladhīna ʾāmanū qū ʾanfusakum wa-ʾahlīkum nāran waqūduhā n-nāsu wa-l-ḥijāratu ʿalayhā malāʾikatun ghilāẓun shidādun lā yaʿṣūna llāha mā ʾamarahum wa-yafʿalūna mā yuʾmarūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "O you who have faith!\n" +
                    "Save yourselves and your families from a Fire\n" +
                    "whose fuel is people and stones,\n" +
                    "over which are [assigned] angels, severe and mighty,\n" +
                    "who do not disobey\n" +
                    "whatever Allah has commanded them,\n" +
                    "and carry out what they are commanded.");
            ayat.add("7\n" +
                    "يا أَيُّهَا الَّذينَ كَفَروا لا تَعتَذِرُوا اليَومَ ۖ إِنَّما تُجزَونَ ما كُنتُم تَعمَلونَ\n" +
                    "TRANSLITERATION\n" +
                    "yā-ʾayyuhā lladhīna kafarū lā taʿtadhirū l-yawma ʾinnamā tujzawna mā kuntum taʿmalūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "[They will call out to the faithless:] ‘O faithless ones!\n" +
                    "Do not make any excuses today.\n" +
                    "You are only being requited\n" +
                    "for what you used to do.’");
            ayat.add("8\n" +
                    "يا أَيُّهَا الَّذينَ آمَنوا توبوا إِلَى اللَّهِ تَوبَةً نَصوحًا عَسىٰ رَبُّكُم أَن يُكَفِّرَ عَنكُم سَيِّئَاتِكُم وَيُدخِلَكُم جَنّاتٍ تَجري مِن تَحتِهَا الأَنهارُ يَومَ لا يُخزِي اللَّهُ النَّبِيَّ وَالَّذينَ آمَنوا مَعَهُ ۖ نورُهُم يَسعىٰ بَينَ أَيديهِم وَبِأَيمانِهِم يَقولونَ رَبَّنا أَتمِم لَنا نورَنا وَاغفِر لَنا ۖ إِنَّكَ عَلىٰ كُلِّ شَيءٍ قَديرٌ\n" +
                    "TRANSLITERATION\n" +
                    "yā-ʾayyuhā lladhīna ʾāmanū tūbū ʾilā llāhi tawbatan naṣūḥan ʿasā rabbukum ʾan yukaffira ʿankum sayyiʾātikum wa-yudkhilakum jannātin tajrī min taḥtihā l-ʾanhāru yawma lā yukhzī llāhu n-nabiyya wa-lladhīna ʾāmanū maʿahū nūruhum yasʿā bayna ʾaydīhim wa-bi-ʾaymānihim yaqūlūna rabbanā ʾatmim lanā nūranā wa-ghfir lanā ʾinnaka ʿalā kulli shayʾin qadīrun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "O you who have faith!\n" +
                    "Repent to Allah with sincere repentance!\n" +
                    "Maybe your Lord\n" +
                    "will absolve you of your misdeeds\n" +
                    "and admit you into gardens\n" +
                    "with streams running in them,\n" +
                    "on the day\n" +
                    "when Allah will not let the Prophet down\n" +
                    "and the faithful who are with him.\n" +
                    "Their light will move swiftly before them\n" +
                    "and on their right.\n" +
                    "They will say, ‘Our Lord!\n" +
                    "Perfect our light for us, and forgive us!\n" +
                    "Indeed You have power over all things.’");
            ayat.add("9\n" +
                    "يا أَيُّهَا النَّبِيُّ جاهِدِ الكُفّارَ وَالمُنافِقينَ وَاغلُظ عَلَيهِم ۚ وَمَأواهُم جَهَنَّمُ ۖ وَبِئسَ المَصيرُ\n" +
                    "TRANSLITERATION\n" +
                    "yā-ʾayyuhā n-nabiyyu jāhidi l-kuffāra wa-l-munāfiqīna wa-ghluẓ ʿalayhim wa-maʾwāhum jahannamu wa-biʾsa l-maṣīru\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "O Prophet!\n" +
                    "Wage jihād against the faithless and the hypocrites,\n" +
                    "and be severe with them.\n" +
                    "Their refuge shall be hell,\n" +
                    "and it is an evil destination.");
            ayat.add("10\n" +
                    "ضَرَبَ اللَّهُ مَثَلًا لِلَّذينَ كَفَرُوا امرَأَتَ نوحٍ وَامرَأَتَ لوطٍ ۖ كانَتا تَحتَ عَبدَينِ مِن عِبادِنا صالِحَينِ فَخانَتاهُما فَلَم يُغنِيا عَنهُما مِنَ اللَّهِ شَيئًا وَقيلَ ادخُلَا النّارَ مَعَ الدّاخِلينَ\n" +
                    "TRANSLITERATION\n" +
                    "ḍaraba llāhu mathalan li-lladhīna kafarū mraʾata nūḥin wa-mraʾata lūṭin kānatā taḥta ʿabdayni min ʿibādinā ṣāliḥayni fa-khānatāhumā fa-lam yughniyā ʿanhumā mina llāhi shayʾan wa-qīla dkhulā n-nāra maʿa d-dākhilīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Allah draws an example for the faithless:\n" +
                    "the wife of Noah and the wife of Lot.\n" +
                    "They were\n" +
                    "under two of our righteous servants,\n" +
                    "yet they betrayed them.\n" +
                    "So they1 did not avail them2 in any way against Allah,\n" +
                    "and it was said [to them],\n" +
                    "‘Enter the Fire, along with those who enter [it].’");
            ayat.add("11\n" +
                    "وَضَرَبَ اللَّهُ مَثَلًا لِلَّذينَ آمَنُوا امرَأَتَ فِرعَونَ إِذ قالَت رَبِّ ابنِ لي عِندَكَ بَيتًا فِي الجَنَّةِ وَنَجِّني مِن فِرعَونَ وَعَمَلِهِ وَنَجِّني مِنَ القَومِ الظّالِمينَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ḍaraba llāhu mathalan li-lladhīna ʾāmanū mraʾata firʿawna ʾidh qālat rabbi bni lī ʿindaka baytan fī l-jannati wa-najjinī min firʿawna wa-ʿamalihī wa-najjinī mina l-qawmi ẓ-ẓālimīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Allah draws an[other] example\n" +
                    "for those who have faith:\n" +
                    "the wife of Pharaoh, when she said,\n" +
                    "‘My Lord! Build me a home near You in paradise,\n" +
                    "and deliver me from Pharaoh and his conduct,\n" +
                    "and deliver me from the wrongdoing lot.’");
            ayat.add("12\n" +
                    "وَمَريَمَ ابنَتَ عِمرانَ الَّتي أَحصَنَت فَرجَها فَنَفَخنا فيهِ مِن روحِنا وَصَدَّقَت بِكَلِماتِ رَبِّها وَكُتُبِهِ وَكانَت مِنَ القانِتينَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-maryama bnata ʿimrāna llatī ʾaḥṣanat farjahā fa-nafakhnā fīhi min rūḥinā wa-ṣaddaqat bi-kalimāti rabbihā wa-kutubihī wa-kānat mina l-qānitīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And Mary, daughter of Imran,\n" +
                    "who guarded the chastity of her womb,\n" +
                    "so We breathed into it of Our spirit.\n" +
                    "She confirmed the words of her Lord\n" +
                    "and His Books,\n" +
                    "and she was one of the obedient.");
        }
        else if (surahName.equals("67. Al-Mulk"))
        {
            setTitle("Al-Mulk(الملك) : Sovereignty");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "تَبارَكَ الَّذي بِيَدِهِ المُلكُ وَهُوَ عَلىٰ كُلِّ شَيءٍ قَديرٌ\n" +
                    "TRANSLITERATION\n" +
                    "tabāraka lladhī bi-yadihi l-mulku wa-huwa ʿalā kulli shayʾin qadīrun-i\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Blessed is He in whose hands is all sovereignty,\n" +
                    "and He has power over all things.");
            ayat.add("2\n" +
                    "الَّذي خَلَقَ المَوتَ وَالحَياةَ لِيَبلُوَكُم أَيُّكُم أَحسَنُ عَمَلًا ۚ وَهُوَ العَزيزُ الغَفورُ\n" +
                    "TRANSLITERATION\n" +
                    "alladhī khalaqa l-mawta wa-l-ḥayāta li-yabluwakum ʾayyukum ʾaḥsanu ʿamalan wa-huwa l-ʿazīzu l-ghafūru\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "He, who created death and life\n" +
                    "that He may test you [to see]\n" +
                    "which of you is best in conduct.\n" +
                    "And He is the All-mighty, the All-forgiving.");
            ayat.add("3\n" +
                    "الَّذي خَلَقَ سَبعَ سَماواتٍ طِباقًا ۖ ما تَرىٰ في خَلقِ الرَّحمٰنِ مِن تَفاوُتٍ ۖ فَارجِعِ البَصَرَ هَل تَرىٰ مِن فُطورٍ\n" +
                    "TRANSLITERATION\n" +
                    "alladhī khalaqa sabʿa samāwātin ṭibāqan mā tarā fī khalqi r-raḥmāni min tafāwutin fa-rjiʿi l-baṣara hal tarā min fuṭūrin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "He created seven heavens in layers.\n" +
                    "You do not see\n" +
                    "any discordance in the creation of the All-beneficent.\n" +
                    "Look again!\n" +
                    "Do you see any flaw?");
            ayat.add("4\n" +
                    "ثُمَّ ارجِعِ البَصَرَ كَرَّتَينِ يَنقَلِب إِلَيكَ البَصَرُ خاسِئًا وَهُوَ حَسيرٌ\n" +
                    "TRANSLITERATION\n" +
                    "thumma rjiʿi l-baṣara karratayni yanqalib ʾilayka l-baṣaru khāsiʾan wa-huwa ḥasīrun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Look again, once more.\n" +
                    "Your look will return to you\n" +
                    "humbled and weary.");
            ayat.add("5\n" +
                    "وَلَقَد زَيَّنَّا السَّماءَ الدُّنيا بِمَصابيحَ وَجَعَلناها رُجومًا لِلشَّياطينِ ۖ وَأَعتَدنا لَهُم عَذابَ السَّعيرِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-la-qad zayyannā s-samāʾa d-dunyā bi-maṣābīḥa wa-jaʿalnāhā rujūman li-sh-shayāṭīni wa-ʾaʿtadnā lahum ʿadhāba s-saʿīri\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "We have certainly adorned the lowest heaven\n" +
                    "with lamps,\n" +
                    "and made them missiles against the devils,\n" +
                    "and We have prepared for them\n" +
                    "punishment of the Blaze.");
            ayat.add("6\n" +
                    "وَلِلَّذينَ كَفَروا بِرَبِّهِم عَذابُ جَهَنَّمَ ۖ وَبِئسَ المَصيرُ\n" +
                    "TRANSLITERATION\n" +
                    "wa-li-lladhīna kafarū bi-rabbihim ʿadhābu jahannama wa-biʾsa l-maṣīru\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "For those who defy their Lord\n" +
                    "is the punishment of hell,\n" +
                    "and it is an evil destination.");
            ayat.add("7\n" +
                    "إِذا أُلقوا فيها سَمِعوا لَها شَهيقًا وَهِيَ تَفورُ\n" +
                    "TRANSLITERATION\n" +
                    "ʾidhā ʾulqū fīhā samiʿū lahā shahīqan wa-hiya tafūru\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "When they are thrown in it,\n" +
                    "they hear it blaring, as it seethes,");
            ayat.add("8\n" +
                    "تَكادُ تَمَيَّزُ مِنَ الغَيظِ ۖ كُلَّما أُلقِيَ فيها فَوجٌ سَأَلَهُم خَزَنَتُها أَلَم يَأتِكُم نَذيرٌ\n" +
                    "TRANSLITERATION\n" +
                    "takādu tamayyazu mina l-ghayẓi kullamā ʾulqiya fīhā fawjun saʾalahum khazanatuhā ʾa-lam yaʾtikum nadhīrun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "almost exploding with rage.\n" +
                    "Whenever a group is thrown in it,\n" +
                    "its keepers will ask them,\n" +
                    "‘Did there not come to you any warner?’");
            ayat.add("9\n" +
                    "قالوا بَلىٰ قَد جاءَنا نَذيرٌ فَكَذَّبنا وَقُلنا ما نَزَّلَ اللَّهُ مِن شَيءٍ إِن أَنتُم إِلّا في ضَلالٍ كَبيرٍ\n" +
                    "TRANSLITERATION\n" +
                    "qālū balā qad jāʾanā nadhīrun fa-kadhdhabnā wa-qulnā mā nazzala llāhu min shayʾin ʾin ʾantum ʾillā fī ḍalālin kabīrin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They will say, ‘Yes, a warner did come to us,\n" +
                    "but we impugned [him] and said,\n" +
                    "‘Allah did not send down anything;\n" +
                    "you are only in great error.’");
            ayat.add("10\n" +
                    "وَقالوا لَو كُنّا نَسمَعُ أَو نَعقِلُ ما كُنّا في أَصحابِ السَّعيرِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-qālū law kunnā nasmaʿu ʾaw naʿqilu mā kunnā fī ʾaṣḥābi s-saʿīri\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And they will say,\n" +
                    "‘Had we listened or applied reason,\n" +
                    "we would not have been among inmates of the Blaze.’");
            ayat.add("11\n" +
                    "فَاعتَرَفوا بِذَنبِهِم فَسُحقًا لِأَصحابِ السَّعيرِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʿtarafū bi-dhanbihim fa-suḥqan li-ʾaṣḥābi s-saʿīri\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Thus they will admit their sin.\n" +
                    "So away with the inmates of the Blaze!");
            ayat.add("12\n" +
                    "إِنَّ الَّذينَ يَخشَونَ رَبَّهُم بِالغَيبِ لَهُم مَغفِرَةٌ وَأَجرٌ كَبيرٌ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna lladhīna yakhshawna rabbahum bi-l-ghaybi lahum maghfiratun wa-ʾajrun kabīrun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed for those who fear their Lord in secret\n" +
                    "there will be forgiveness and a great reward.");
            ayat.add("13\n" +
                    "وَأَسِرّوا قَولَكُم أَوِ اجهَروا بِهِ ۖ إِنَّهُ عَليمٌ بِذاتِ الصُّدورِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾasirrū qawlakum ʾawi jharū bihī ʾinnahū ʿalīmun bi-dhāti ṣ-ṣudūri\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Speak secretly, or do so loudly,\n" +
                    "indeed He knows well what is in the breasts.");
            ayat.add("14\n" +
                    "أَلا يَعلَمُ مَن خَلَقَ وَهُوَ اللَّطيفُ الخَبيرُ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-lā yaʿlamu man khalaqa wa-huwa l-laṭīfu l-khabīru\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Would He who has created not know?\n" +
                    "And He is the All-attentive, the All-aware.");
            ayat.add("15\n" +
                    "هُوَ الَّذي جَعَلَ لَكُمُ الأَرضَ ذَلولًا فَامشوا في مَناكِبِها وَكُلوا مِن رِزقِهِ ۖ وَإِلَيهِ النُّشورُ\n" +
                    "TRANSLITERATION\n" +
                    "huwa lladhī jaʿala lakumu l-ʾarḍa dhalūlan fa-mshū fī manākibihā wa-kulū min rizqihī wa-ʾilayhi n-nushūru\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "It is He who made the earth tractable for you;\n" +
                    "so walk on its flanks\n" +
                    "and eat of His provision,\n" +
                    "and towards Him is the resurrection.");
            ayat.add("16\n" +
                    "أَأَمِنتُم مَن فِي السَّماءِ أَن يَخسِفَ بِكُمُ الأَرضَ فَإِذا هِيَ تَمورُ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-ʾamintum man fī s-samāʾi ʾan yakhsifa bikumu l-ʾarḍa fa-ʾidhā hiya tamūru\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Are you secure that He who is in the sky\n" +
                    "will not make the earth swallow you\n" +
                    "while it quakes?");
            ayat.add("17\n" +
                    "أَم أَمِنتُم مَن فِي السَّماءِ أَن يُرسِلَ عَلَيكُم حاصِبًا ۖ فَسَتَعلَمونَ كَيفَ نَذيرِ\n" +
                    "TRANSLITERATION\n" +
                    "ʾam-ʾamintum man fī s-samāʾi ʾan yursila ʿalaykum ḥāṣiban fa-sa-taʿlamūna kayfa nadhīri\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Are you secure that He who is in the sky\n" +
                    "will not unleash upon you a rain of stones?\n" +
                    "Soon you will know how My warning has been!");
            ayat.add("18\n" +
                    "وَلَقَد كَذَّبَ الَّذينَ مِن قَبلِهِم فَكَيفَ كانَ نَكيرِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-la-qad kadhdhaba lladhīna min qablihim fa-kayfa kāna nakīri\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Certainly those who were before them had denied;\n" +
                    "but then how was My rebuttal!1\n" +
                    "Or, ‘how was My requital.’");
            ayat.add("19\n" +
                    "أَوَلَم يَرَوا إِلَى الطَّيرِ فَوقَهُم صافّاتٍ وَيَقبِضنَ ۚ ما يُمسِكُهُنَّ إِلَّا الرَّحمٰنُ ۚ إِنَّهُ بِكُلِّ شَيءٍ بَصيرٌ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-wa-lam yaraw ʾilā ṭ-ṭayri fawqahum ṣāffātin wa-yaqbiḍna mā yumsikuhunna ʾillā r-raḥmānu ʾinnahū bi-kulli shayʾin baṣīrun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Have they not regarded the birds above them\n" +
                    "spreading and closing their wings?\n" +
                    "No one sustains them except the All-beneficent.\n" +
                    "Indeed He sees best all things.");
            ayat.add("20\n" +
                    "أَمَّن هٰذَا الَّذي هُوَ جُندٌ لَكُم يَنصُرُكُم مِن دونِ الرَّحمٰنِ ۚ إِنِ الكافِرونَ إِلّا في غُرورٍ\n" +
                    "TRANSLITERATION\n" +
                    "ʾam-man hādhā lladhī huwa jundun lakum yanṣurukum min dūni r-raḥmāni ʾini l-kāfirūna ʾillā fī ghurūrin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Who is it that is your host\n" +
                    "who may help you, besides the All-beneficent?\n" +
                    "The faithless only dwell in delusion.");
            ayat.add("21\n" +
                    "أَمَّن هٰذَا الَّذي يَرزُقُكُم إِن أَمسَكَ رِزقَهُ ۚ بَل لَجّوا في عُتُوٍّ وَنُفورٍ\n" +
                    "TRANSLITERATION\n" +
                    "ʾam-man hādhā lladhī yarzuqukum ʾin ʾamsaka rizqahū bal lajjū fī ʿutuwwin wa-nufūrin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Who is it that may provide for you\n" +
                    "if He withholds His provision?\n" +
                    "Rather they persist in defiance and aversion.");
            ayat.add("22\n" +
                    "أَفَمَن يَمشي مُكِبًّا عَلىٰ وَجهِهِ أَهدىٰ أَمَّن يَمشي سَوِيًّا عَلىٰ صِراطٍ مُستَقيمٍ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-fa-man yamshī mukibban ʿalā wajhihī ʾahdā ʾam-man yamshī sawiyyan ʿalā ṣirāṭin mustaqīmin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Is he who walks prone on his face better guided,\n" +
                    "or he who walks upright\n" +
                    "on a straight path?");
            ayat.add("23\n" +
                    "قُل هُوَ الَّذي أَنشَأَكُم وَجَعَلَ لَكُمُ السَّمعَ وَالأَبصارَ وَالأَفئِدَةَ ۖ قَليلًا ما تَشكُرونَ\n" +
                    "TRANSLITERATION\n" +
                    "qul huwa lladhī ʾanshaʾakum wa-jaʿala lakumu s-samʿa wa-l-ʾabṣāra wa-l-ʾafʾidata qalīlan mā tashkurūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Say, ‘It is He who created you,\n" +
                    "and made for you hearing, eyesight, and hearts.\n" +
                    "Little do you thank.’");
            ayat.add("24\n" +
                    "قُل هُوَ الَّذي ذَرَأَكُم فِي الأَرضِ وَإِلَيهِ تُحشَرونَ\n" +
                    "TRANSLITERATION\n" +
                    "qul huwa lladhī dharaʾakum fī l-ʾarḍi wa-ʾilayhi tuḥsharūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Say, ‘It is He who created you on the earth,\n" +
                    "and toward Him you will be mustered.’");
            ayat.add("25\n" +
                    "وَيَقولونَ مَتىٰ هٰذَا الوَعدُ إِن كُنتُم صادِقينَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-yaqūlūna matā hādhā l-waʿdu ʾin kuntum ṣādiqīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They say, ‘When will this promise be fulfilled,\n" +
                    "should you be truthful?’");
            ayat.add("26\n" +
                    "قُل إِنَّمَا العِلمُ عِندَ اللَّهِ وَإِنَّما أَنا نَذيرٌ مُبينٌ\n" +
                    "TRANSLITERATION\n" +
                    "qul ʾinnamā l-ʿilmu ʿinda llāhi wa-ʾinnamā ʾana nadhīrun mubīnun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Say, ‘Its knowledge is only with Allah;\n" +
                    "I am only a manifest warner.’");
            ayat.add("27\n" +
                    "فَلَمّا رَأَوهُ زُلفَةً سيئَت وُجوهُ الَّذينَ كَفَروا وَقيلَ هٰذَا الَّذي كُنتُم بِهِ تَدَّعونَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-lammā raʾawhu zulfatan sīʾat wujūhu lladhīna kafarū wa-qīla hādhā lladhī kuntum bihī taddaʿūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "When they see it brought near,\n" +
                    "the countenances of the faithless will be distorted,\n" +
                    "and [they will be] told, ‘This is what you asked for!’");
            ayat.add("28\n" +
                    "قُل أَرَأَيتُم إِن أَهلَكَنِيَ اللَّهُ وَمَن مَعِيَ أَو رَحِمَنا فَمَن يُجيرُ الكافِرينَ مِن عَذابٍ أَليمٍ\n" +
                    "TRANSLITERATION\n" +
                    "qul ʾa-raʾaytum ʾin ʾahlakaniya llāhu wa-man maʿiya ʾaw raḥimanā fa-man yujīru l-kāfirīna min ʿadhābin ʾalīmin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Say, ‘Tell me,\n" +
                    "whether Allah destroys me and those with me,\n" +
                    "or He has mercy on us,\n" +
                    "who will shelter the faithless\n" +
                    "from a painful punishment?’");
            ayat.add("29\n" +
                    "قُل هُوَ الرَّحمٰنُ آمَنّا بِهِ وَعَلَيهِ تَوَكَّلنا ۖ فَسَتَعلَمونَ مَن هُوَ في ضَلالٍ مُبينٍ\n" +
                    "TRANSLITERATION\n" +
                    "qul huwa r-raḥmānu ʾāmannā bihī wa-ʿalayhi tawakkalnā fa-sa-taʿlamūna man huwa fī ḍalālin mubīnin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Say, ‘He is the All-beneficent;\n" +
                    "we have faith in Him, and in Him do we trust.\n" +
                    "Soon you will know\n" +
                    "who is in manifest error.’");
            ayat.add("30\n" +
                    "قُل أَرَأَيتُم إِن أَصبَحَ ماؤُكُم غَورًا فَمَن يَأتيكُم بِماءٍ مَعينٍ\n" +
                    "TRANSLITERATION\n" +
                    "qul ʾa-raʾaytum ʾin ʾaṣbaḥa māʾukum ghawran fa-man yaʾtīkum bi-māʾin maʿīnin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Say, ‘Tell me,\n" +
                    "should your water sink down [into the ground],\n" +
                    "who will bring you running water?’");
        }
        else if (surahName.equals("68. Al-Qalam"))
        {
            setTitle("Al-Qalam(القلم) : The Pen");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "ن ۚ وَالقَلَمِ وَما يَسطُرونَ\n" +
                    "TRANSLITERATION\n" +
                    "n (nūn) wa-l-qalami wa-mā yasṭurūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Nūn.\n" +
                    "By the Pen and what they write:");
            ayat.add("2\n" +
                    "ما أَنتَ بِنِعمَةِ رَبِّكَ بِمَجنونٍ\n" +
                    "TRANSLITERATION\n" +
                    "mā ʾanta bi-niʿmati rabbika bi-majnūnin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "you are not, by your Lord’s blessing, crazy,");
            ayat.add("3\n" +
                    "وَإِنَّ لَكَ لَأَجرًا غَيرَ مَمنونٍ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾinna laka la-ʾajran ghayra mamnūnin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and yours indeed will be an everlasting reward,");
            ayat.add("4\n" +
                    "وَإِنَّكَ لَعَلىٰ خُلُقٍ عَظيمٍ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾinnaka la-ʿalā khuluqin ʿaẓīmin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and indeed you possess a great character.");
            ayat.add("5\n" +
                    "فَسَتُبصِرُ وَيُبصِرونَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-sa-tubṣiru wa-yubṣirūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "You will see and they will see,");
            ayat.add("6\n" +
                    "بِأَييِكُمُ المَفتونُ\n" +
                    "TRANSLITERATION\n" +
                    "bi-ʾayyikumu l-maftūnu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "which one of you is crazy.");
            ayat.add("7\n" +
                    "إِنَّ رَبَّكَ هُوَ أَعلَمُ بِمَن ضَلَّ عَن سَبيلِهِ وَهُوَ أَعلَمُ بِالمُهتَدينَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna rabbaka huwa ʾaʿlamu bi-man ḍalla ʿan sabīlihī wa-huwa ʾaʿlamu bi-l-muhtadīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed your Lord knows best\n" +
                    "those who stray from His way,\n" +
                    "and He knows best those who are guided.");
            ayat.add("8\n" +
                    "فَلا تُطِعِ المُكَذِّبينَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-lā tuṭiʿi l-mukadhdhibīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So do not obey the deniers,");
            ayat.add("9\n" +
                    "وَدّوا لَو تُدهِنُ فَيُدهِنونَ\n" +
                    "TRANSLITERATION\n" +
                    "waddū law tudhinu fa-yudhinūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "who are eager that you should be pliable,\n" +
                    "so that they may be pliable [towards you].");
            ayat.add("10\n" +
                    "وَلا تُطِع كُلَّ حَلّافٍ مَهينٍ\n" +
                    "TRANSLITERATION\n" +
                    "wa-lā tuṭiʿ kulla ḥallāfin mahīnin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And do not obey any vile swearer,");
            ayat.add("11\n" +
                    "هَمّازٍ مَشّاءٍ بِنَميمٍ\n" +
                    "TRANSLITERATION\n" +
                    "hammāzin mashshāʾin bi-namīmin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "scandal-monger, talebearer,");
            ayat.add("12\n" +
                    "مَنّاعٍ لِلخَيرِ مُعتَدٍ أَثيمٍ\n" +
                    "TRANSLITERATION\n" +
                    "mannāʿin li-l-khayri muʿtadin ʾathīmin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "hinderer of all good, sinful transgressor,");
            ayat.add("13\n" +
                    "عُتُلٍّ بَعدَ ذٰلِكَ زَنيمٍ\n" +
                    "TRANSLITERATION\n" +
                    "ʿutullin baʿda dhālika zanīmin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "callous and, on top of that, baseborn,");
            ayat.add("14\n" +
                    "أَن كانَ ذا مالٍ وَبَنينَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾan kāna dhā mālin wa-banīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "—[only] because he has wealth and children.");
            ayat.add("15\n" +
                    "إِذا تُتلىٰ عَلَيهِ آياتُنا قالَ أَساطيرُ الأَوَّلينَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾidhā tutlā ʿalayhi ʾāyātunā qāla ʾasāṭīru l-ʾawwalīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "When Our signs are recited to him,");
            ayat.add("16\n" +
                    "سَنَسِمُهُ عَلَى الخُرطومِ\n" +
                    "TRANSLITERATION\n" +
                    "sa-nasimuhū ʿalā l-khurṭūmi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Soon We shall brand him on the snout.");
            ayat.add("17\n" +
                    "إِنّا بَلَوناهُم كَما بَلَونا أَصحابَ الجَنَّةِ إِذ أَقسَموا لَيَصرِمُنَّها مُصبِحينَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnā balawnāhum ka-mā balawnā ʾaṣḥāba l-jannati ʾidh ʾaqsamū la-yaṣrimunnahā muṣbiḥīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed we have tested them1\n" +
                    "just as We tested the People of the Garden\n" +
                    "when they vowed they would gather its fruit\n" +
                    "at dawn,");
            ayat.add("18\n" +
                    "وَلا يَستَثنونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-lā yastathnūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and they did not make any exception.");
            ayat.add("19\n" +
                    "فَطافَ عَلَيها طائِفٌ مِن رَبِّكَ وَهُم نائِمونَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ṭāfa ʿalayhā ṭāʾifun min rabbika wa-hum nāʾimūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Then a visitation from your Lord visited it1\n" +
                    "while they were asleep.");
            ayat.add("20\n" +
                    "فَأَصبَحَت كَالصَّريمِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾaṣbaḥat ka-ṣ-ṣarīmi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So by the dawn it was like a harvested field.1");
            ayat.add("21\n" +
                    "فَتَنادَوا مُصبِحينَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-tanādaw muṣbiḥīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "At dawn they called out to one another,");
            ayat.add("22\n" +
                    "أَنِ اغدوا عَلىٰ حَرثِكُم إِن كُنتُم صارِمينَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾani ghdū ʿalā ḥarthikum ʾin kuntum ṣārimīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "‘Get off early to your field\n" +
                    "if you have to gather [the fruits].’");
            ayat.add("23\n" +
                    "فَانطَلَقوا وَهُم يَتَخافَتونَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-nṭalaqū wa-hum yatakhāfatūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So off they went, murmuring to one another:");
            ayat.add("24\n" +
                    "أَن لا يَدخُلَنَّهَا اليَومَ عَلَيكُم مِسكينٌ\n" +
                    "TRANSLITERATION\n" +
                    "ʾan lā yadkhulannahā l-yawma ʿalaykum miskīnun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "‘Today no needy man shall come to you in it.’");
            ayat.add("25\n" +
                    "وَغَدَوا عَلىٰ حَردٍ قادِرينَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ghadaw ʿalā ḥardin qādirīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They set out early morning,\n" +
                    "[considering themselves] able to grudge.");
            ayat.add("26\n" +
                    "فَلَمّا رَأَوها قالوا إِنّا لَضالّونَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-lammā raʾawhā qālū ʾinnā la-ḍāllūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "But when they saw it, they said,\n" +
                    "‘We have indeed lost our way!’");
            ayat.add("27\n" +
                    "بَل نَحنُ مَحرومونَ\n" +
                    "TRANSLITERATION\n" +
                    "bal naḥnu maḥrūmūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "‘No, we are deprived!’");
            ayat.add("28\n" +
                    "قالَ أَوسَطُهُم أَلَم أَقُل لَكُم لَولا تُسَبِّحونَ\n" +
                    "TRANSLITERATION\n" +
                    "qāla ʾawsaṭuhum ʾa-lam ʾaqul lakum law-lā tusabbiḥūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The most moderate among them said,\n" +
                    "‘Did I not tell you,\n" +
                    "“Why do you not glorify [Allah]?” ’");
            ayat.add("29\n" +
                    "قالوا سُبحانَ رَبِّنا إِنّا كُنّا ظالِمينَ\n" +
                    "TRANSLITERATION\n" +
                    "qālū subḥāna rabbinā ʾinnā kunnā ẓālimīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They said, ‘Immaculate is our Lord!\n" +
                    "We have indeed been wrongdoers!’");
            ayat.add("30\n" +
                    "فَأَقبَلَ بَعضُهُم عَلىٰ بَعضٍ يَتَلاوَمونَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾaqbala baʿḍuhum ʿalā baʿḍin yatalāwamūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Then they turned to one another,\n" +
                    "blaming each other.");
            ayat.add("31\n" +
                    "قالوا يا وَيلَنا إِنّا كُنّا طاغينَ\n" +
                    "TRANSLITERATION\n" +
                    "qālū yā-waylanā ʾinnā kunnā ṭāghīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They said, ‘Woe to us!\n" +
                    "Indeed we have been rebellious.");
            ayat.add("32\n" +
                    "عَسىٰ رَبُّنا أَن يُبدِلَنا خَيرًا مِنها إِنّا إِلىٰ رَبِّنا راغِبونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʿasā rabbunā ʾan yubdilanā khayran minhā ʾinnā ʾilā rabbinā rāghibūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Maybe our Lord will give us a better one in its place.\n" +
                    "Indeed we turn earnestly to our Lord.’");
            ayat.add("33\n" +
                    "كَذٰلِكَ العَذابُ ۖ وَلَعَذابُ الآخِرَةِ أَكبَرُ ۚ لَو كانوا يَعلَمونَ\n" +
                    "TRANSLITERATION\n" +
                    "ka-dhālika l-ʿadhābu wa-la-ʿadhābu l-ʾākhirati ʾakbaru law kānū yaʿlamūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Such was the punishment;\n" +
                    "and the punishment of the Hereafter is surely greater,\n" +
                    "had they known.");
            ayat.add("34\n" +
                    "إِنَّ لِلمُتَّقينَ عِندَ رَبِّهِم جَنّاتِ النَّعيمِ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna li-l-muttaqīna ʿinda rabbihim jannāti n-naʿīmi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed for the Godwary\n" +
                    "there will be gardens of bliss near their Lord.");
            ayat.add("35\n" +
                    "أَفَنَجعَلُ المُسلِمينَ كَالمُجرِمينَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-fa-najʿalu l-muslimīna ka-l-mujrimīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Shall We, then, treat those who submit [to Us]\n" +
                    "as [We treat] the guilty?");
            ayat.add("36\n" +
                    "ما لَكُم كَيفَ تَحكُمونَ\n" +
                    "TRANSLITERATION\n" +
                    "mā lakum kayfa taḥkumūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "What is the matter with you? How do you judge!");
            ayat.add("37\n" +
                    "أَم لَكُم كِتابٌ فيهِ تَدرُسونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾam lakum kitābun fīhi tadrusūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Do you possess a scripture in which you read");
            ayat.add("38\n" +
                    "إِنَّ لَكُم فيهِ لَما تَخَيَّرونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna lakum fīhi la-mā takhayyarūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "that you shall indeed have in it1\n" +
                    "whatever you would like?");
            ayat.add("39\n" +
                    "أَم لَكُم أَيمانٌ عَلَينا بالِغَةٌ إِلىٰ يَومِ القِيامَةِ ۙ إِنَّ لَكُم لَما تَحكُمونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾam lakum ʾaymānun ʿalaynā bālighatun ʾilā yawmi l-qiyāmati ʾinna lakum la-mā taḥkumūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Do you have a pledge binding on Us\n" +
                    "until the Day of Resurrection,\n" +
                    "that you shall indeed have whatever you decide?");
            ayat.add("40\n" +
                    "سَلهُم أَيُّهُم بِذٰلِكَ زَعيمٌ\n" +
                    "TRANSLITERATION\n" +
                    "salhum ʾayyuhum bi-dhālika zaʿīmun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Ask them, which of them will aver [any of] that!");
            ayat.add("41\n" +
                    "أَم لَهُم شُرَكاءُ فَليَأتوا بِشُرَكائِهِم إِن كانوا صادِقينَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾam lahum shurakāʾu fa-l-yaʾtū bi-shurakāʾihim ʾin kānū ṣādiqīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Do they have any partners [they ascribe to Allah]?\n" +
                    "Then let them produce their partners,\n" +
                    "if they are truthful.");
            ayat.add("42\n" +
                    "يَومَ يُكشَفُ عَن ساقٍ وَيُدعَونَ إِلَى السُّجودِ فَلا يَستَطيعونَ\n" +
                    "TRANSLITERATION\n" +
                    "yawma yukshafu ʿan sāqin wa-yudʿawna ʾilā s-sujūdi fa-lā yastaṭīʿūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The day when the catastrophe occurs,1\n" +
                    "and they are summoned to prostrate themselves,\n" +
                    "they will not be able [to do it].");
            ayat.add("43\n" +
                    "خاشِعَةً أَبصارُهُم تَرهَقُهُم ذِلَّةٌ ۖ وَقَد كانوا يُدعَونَ إِلَى السُّجودِ وَهُم سالِمونَ\n" +
                    "TRANSLITERATION\n" +
                    "khāshiʿatan ʾabṣāruhum tarhaquhum dhillatun wa-qad kānū yudʿawna ʾilā s-sujūdi wa-hum sālimūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "With a humbled look [in their eyes],\n" +
                    "they will be overcast by abasement.\n" +
                    "Certainly they were summoned to prostrate themselves\n" +
                    "while they were yet sound.");
            ayat.add("44\n" +
                    "فَذَرني وَمَن يُكَذِّبُ بِهٰذَا الحَديثِ ۖ سَنَستَدرِجُهُم مِن حَيثُ لا يَعلَمونَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-dharnī wa-man yukadhdhibu bi-hādhā l-ḥadīthi sa-nastadrijuhum min haythu lā yaʿlamūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So leave Me with those who deny this discourse.\n" +
                    "We will draw them imperceptibly [into ruin],\n" +
                    "whence they do not know.");
            ayat.add("45\n" +
                    "وَأُملي لَهُم ۚ إِنَّ كَيدي مَتينٌ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾumlī lahum ʾinna kaydī matīnun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "I will grant them respite,\n" +
                    "for My devising is indeed sure.");
            ayat.add("46\n" +
                    "أَم تَسأَلُهُم أَجرًا فَهُم مِن مَغرَمٍ مُثقَلونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾam tasʾaluhum ʾajran fa-hum min maghramin muthqalūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Do you ask them for a reward,\n" +
                    "so that they are weighed down with debt?");
            ayat.add("47\n" +
                    "أَم عِندَهُمُ الغَيبُ فَهُم يَكتُبونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾam ʿindahumu l-ghaybu fa-hum yaktubūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Do they possess [access to] the Unseen\n" +
                    "so that they write it down?");
            ayat.add("48\n" +
                    "فَاصبِر لِحُكمِ رَبِّكَ وَلا تَكُن كَصاحِبِ الحوتِ إِذ نادىٰ وَهُوَ مَكظومٌ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ṣbir li-ḥukmi rabbika wa-lā takun ka-ṣāḥibi l-ḥūti ʾidh nādā wa-huwa makẓūmun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So submit patiently to the judgement of your Lord,\n" +
                    "and do not be like the Man of the Fish1\n" +
                    "who called out as he choked with grief.");
            ayat.add("49\n" +
                    "لَولا أَن تَدارَكَهُ نِعمَةٌ مِن رَبِّهِ لَنُبِذَ بِالعَراءِ وَهُوَ مَذمومٌ\n" +
                    "TRANSLITERATION\n" +
                    "law-lā ʾan tadārakahū niʿmatun min rabbihī la-nubidha bi-l-ʿarāʾi wa-huwa madhmūmun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Had it not been for a blessing that came to his rescue\n" +
                    "from his Lord,\n" +
                    "he would surely have been cast on a bare shore\n" +
                    "while he were blameworthy.");
            ayat.add("50\n" +
                    "فَاجتَباهُ رَبُّهُ فَجَعَلَهُ مِنَ الصّالِحينَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-jtabāhu rabbuhū fa-jaʿalahū mina ṣ-ṣāliḥīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So his Lord chose him\n" +
                    "and made him one of the righteous.");
            ayat.add("51\n" +
                    "وَإِن يَكادُ الَّذينَ كَفَروا لَيُزلِقونَكَ بِأَبصارِهِم لَمّا سَمِعُوا الذِّكرَ وَيَقولونَ إِنَّهُ لَمَجنونٌ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾin yakādu lladhīna kafarū la-yuzliqūnaka bi-ʾabṣārihim lammā samiʿū dh-dhikra wa-yaqūlūna ʾinnahū la-majnūnun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed the faithless almost devour you\n" +
                    "with their eyes\n" +
                    "when they hear the Reminder,\n" +
                    "and they say, ‘He is indeed crazy.’");
            ayat.add("52\n" +
                    "وَما هُوَ إِلّا ذِكرٌ لِلعالَمينَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-mā huwa ʾillā dhikrun li-l-ʿālamīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Yet it is just a reminder for all the nations.");
        }
        else if (surahName.equals("69. Al-Haqqah"))
        {
            setTitle("Al-Haqqah(الحاقة) : The Inevitable");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "الحاقَّةُ\n" +
                    "TRANSLITERATION\n" +
                    "al-ḥāqqatu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The Besieger!");
            ayat.add("2\n" +
                    "مَا الحاقَّةُ\n" +
                    "TRANSLITERATION\n" +
                    "mā l-ḥāqqatu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "What is the Besieger?!");
            ayat.add("3\n" +
                    "وَما أَدراكَ مَا الحاقَّةُ\n" +
                    "TRANSLITERATION\n" +
                    "wa-mā ʾadrāka mā l-ḥāqqatu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "What will show you what is the Besieger?!");
            ayat.add("4\n" +
                    "كَذَّبَت ثَمودُ وَعادٌ بِالقارِعَةِ\n" +
                    "TRANSLITERATION\n" +
                    "kadhdhabat thamūdu wa-ʿādun bi-l-qāriʿati\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Thamūd and ʿĀd denied the Catastrophe.");
            ayat.add("5\n" +
                    "فَأَمّا ثَمودُ فَأُهلِكوا بِالطّاغِيَةِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾammā thamūdu fa-ʾuhlikū bi-ṭ-ṭāghiyati\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "As for Thamūd, they were destroyed by the Cry.");
            ayat.add("6\n" +
                    "وَأَمّا عادٌ فَأُهلِكوا بِريحٍ صَرصَرٍ عاتِيَةٍ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾammā ʿādun fa-ʾuhlikū bi-rīḥin ṣarṣarin ʿātiyatin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And as for ʿĀd,\n" +
                    "they were destroyed by a fierce icy gale,");
            ayat.add("7\n" +
                    "سَخَّرَها عَلَيهِم سَبعَ لَيالٍ وَثَمانِيَةَ أَيّامٍ حُسومًا فَتَرَى القَومَ فيها صَرعىٰ كَأَنَّهُم أَعجازُ نَخلٍ خاوِيَةٍ\n" +
                    "TRANSLITERATION\n" +
                    "sakhkharahā ʿalayhim sabʿa layālin wa-thamāniyata ʾayyāmin ḥusūman fa-tarā l-qawma fīhā ṣarʿā ka-ʾannahum ʾaʿjāzu nakhlin khāwiyatin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "which He disposed against them\n" +
                    "for seven grueling1 nights and eight days,\n" +
                    "so that you could have seen the people\n" +
                    "lying about therein prostrate\n" +
                    "as if they were hollow trunks of palm trees.");
            ayat.add("8\n" +
                    "فَهَل تَرىٰ لَهُم مِن باقِيَةٍ\n" +
                    "TRANSLITERATION\n" +
                    "fa-hal tarā lahum min bāqiyatin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So do you see any trace of them?");
            ayat.add("9\n" +
                    "وَجاءَ فِرعَونُ وَمَن قَبلَهُ وَالمُؤتَفِكاتُ بِالخاطِئَةِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-jāʾa firʾawnu wa-man qablahū wa-l-muʾtafikātu bi-l-khāṭiʾati\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Then brought Pharaoh and those who were before him,\n" +
                    "and the towns that were overturned,\n" +
                    "iniquity.");
            ayat.add("10\n" +
                    "فَعَصَوا رَسولَ رَبِّهِم فَأَخَذَهُم أَخذَةً رابِيَةً\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʿaṣaw rasūla rabbihim fa-ʾakhadhahum ʾakhdhatan rābiyatan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Then they disobeyed the apostle of their Lord,\n" +
                    "so He seized them with a terrible seizing.");
            ayat.add("11\n" +
                    "إِنّا لَمّا طَغَى الماءُ حَمَلناكُم فِي الجارِيَةِ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnā lammā ṭaghā l-māʾu ḥamalnākum fī l-jāriyati\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed when the Flood rose high,\n" +
                    "We carried you in a floating ark,");
            ayat.add("12\n" +
                    "لِنَجعَلَها لَكُم تَذكِرَةً وَتَعِيَها أُذُنٌ واعِيَةٌ\n" +
                    "TRANSLITERATION\n" +
                    "li-najʿalahā lakum tadhkiratan wa-taʿiyahā ʾudhunun wāʿiyatun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "that We might make it a reminder for you,\n" +
                    "and that receptive ears might remember it");
            ayat.add("13\n" +
                    "فَإِذا نُفِخَ فِي الصّورِ نَفخَةٌ واحِدَةٌ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾidhā nufikha fī ṣ-ṣūri nafkhatun wāḥidatun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "When the Trumpet is blown with a single blast");
            ayat.add("14\n" +
                    "وَحُمِلَتِ الأَرضُ وَالجِبالُ فَدُكَّتا دَكَّةً واحِدَةً\n" +
                    "TRANSLITERATION\n" +
                    "wa-ḥumilati l-ʾarḍu wa-l-jibālu fa-dukkatā dakkatan wāḥidatan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and the earth and the mountains are lifted\n" +
                    "and levelled with a single leveling,");
            ayat.add("15\n" +
                    "فَيَومَئِذٍ وَقَعَتِ الواقِعَةُ\n" +
                    "TRANSLITERATION\n" +
                    "fa-yawmaʾidhin waqaʿati l-wāqiʿatu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "then, on that day, will the Imminent [Hour] befall");
            ayat.add("16\n" +
                    "وَانشَقَّتِ السَّماءُ فَهِيَ يَومَئِذٍ واهِيَةٌ\n" +
                    "TRANSLITERATION\n" +
                    "wa-nshaqqati s-samāʾu fa-hiya yawmaʾidhin wāhiyatun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and the sky will be split open\n" +
                    "for it will be frail that day");
            ayat.add("17\n" +
                    "وَالمَلَكُ عَلىٰ أَرجائِها ۚ وَيَحمِلُ عَرشَ رَبِّكَ فَوقَهُم يَومَئِذٍ ثَمانِيَةٌ\n" +
                    "TRANSLITERATION\n" +
                    "wa-l-malaku ʿalā ʾarjāʾihā wa-yaḥmilu ʿarsha rabbika fawqahum yawmaʾidhin thamāniyatun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and the angels will be all over it,\n" +
                    "and the Throne of your Lord will be borne\n" +
                    "that day by eight [angels].");
            ayat.add("18\n" +
                    "يَومَئِذٍ تُعرَضونَ لا تَخفىٰ مِنكُم خافِيَةٌ\n" +
                    "TRANSLITERATION\n" +
                    "yawmaʾidhin tuʿraḍūna lā takhfā minkum khāfiyatun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "That day you will be exposed:\n" +
                    "none of your secrets will remain hidden.");
            ayat.add("19\n" +
                    "فَأَمّا مَن أوتِيَ كِتابَهُ بِيَمينِهِ فَيَقولُ هاؤُمُ اقرَءوا كِتابِيَه\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾammā man ʾūtiya kitābahū bi-yamīnihī fa-yaqūlu hāʾumu qraʾū kitābiyah\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "As for him who is given his book in his right hand,\n" +
                    "he will say, ‘Here, take and read my book!");
            ayat.add("20\n" +
                    "إِنّي ظَنَنتُ أَنّي مُلاقٍ حِسابِيَه\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnī ẓanantu ʾannī mulāqin ḥisābiyah\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed I knew that I shall encounter my account.’");
            ayat.add("21\n" +
                    "فَهُوَ في عيشَةٍ راضِيَةٍ\n" +
                    "TRANSLITERATION\n" +
                    "fa-huwa fī ʿīshatin rāḍiyatin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So he will have a pleasant life,");
            ayat.add("22\n" +
                    "في جَنَّةٍ عالِيَةٍ\n" +
                    "TRANSLITERATION\n" +
                    "fī jannatin ʿāliyatin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "in an elevated garden,");
            ayat.add("23\n" +
                    "قُطوفُها دانِيَةٌ\n" +
                    "TRANSLITERATION\n" +
                    "quṭūfuhā dāniyatun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "whose clusters [of fruits] will be within easy reach.");
            ayat.add("24\n" +
                    "كُلوا وَاشرَبوا هَنيئًا بِما أَسلَفتُم فِي الأَيّامِ الخالِيَةِ\n" +
                    "TRANSLITERATION\n" +
                    "kulū wa-shrabū hanīʾan bi-mā ʾaslaftum fī l-ʾayyāmi l-khāliyati\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "[He will be told]: ‘Enjoy your food and drink,\n" +
                    "for what you had sent in advance in past days.’");
            ayat.add("25\n" +
                    "وَأَمّا مَن أوتِيَ كِتابَهُ بِشِمالِهِ فَيَقولُ يا لَيتَني لَم أوتَ كِتابِيَه\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾammā man ʾūtiya kitābahū bi-shimālihī fa-yaqūlu yā-laytanī lam ʾūta kitābiyah\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "But as for him who is given his book in his left hand,\n" +
                    "he will say, ‘I wish I had not been given my book,");
            ayat.add("26\n" +
                    "وَلَم أَدرِ ما حِسابِيَه\n" +
                    "TRANSLITERATION\n" +
                    "wa-lam ʾadri mā ḥisābiyah\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "nor had I ever known what my account is!");
            ayat.add("27\n" +
                    "يا لَيتَها كانَتِ القاضِيَةَ\n" +
                    "TRANSLITERATION\n" +
                    "yā-laytahā kānati l-qāḍiyata\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "I wish death had been the end of it all!");
            ayat.add("28\n" +
                    "ما أَغنىٰ عَنّي مالِيَه ۜ\n" +
                    "TRANSLITERATION\n" +
                    "mā ʾaghnā ʿannī māliyah\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "My wealth did not avail me.");
            ayat.add("29\n" +
                    "هَلَكَ عَنّي سُلطانِيَه\n" +
                    "TRANSLITERATION\n" +
                    "halaka ʿannī sulṭāniyah\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "My authority has departed from me.’");
            ayat.add("30\n" +
                    "خُذوهُ فَغُلّوهُ\n" +
                    "TRANSLITERATION\n" +
                    "khudhūhu fa-ghullūhu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "[The angels will be told:] ‘Seize him, and fetter him!");
            ayat.add("31\n" +
                    "ثُمَّ الجَحيمَ صَلّوهُ\n" +
                    "TRANSLITERATION\n" +
                    "thumma l-jaḥīma ṣallūhu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Then put him into hell.");
            ayat.add("32\n" +
                    "ثُمَّ في سِلسِلَةٍ ذَرعُها سَبعونَ ذِراعًا فَاسلُكوهُ\n" +
                    "TRANSLITERATION\n" +
                    "thumma fī silsilatin dharʿuhā sabʿūna dhirāʿan fa-slukūhu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Then, in a chain whose length is seventy cubits,\n" +
                    "bind him.");
            ayat.add("33\n" +
                    "إِنَّهُ كانَ لا يُؤمِنُ بِاللَّهِ العَظيمِ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnahū kāna lā yuʾminu bi-llāhi l-ʿaẓīmi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed he had no faith in Allah, the All-supreme,");
            ayat.add("34\n" +
                    "وَلا يَحُضُّ عَلىٰ طَعامِ المِسكينِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-lā yaḥuḍḍu ʿalā ṭaʿāmi l-miskīni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and he did not urge the feeding of the needy,");
            ayat.add("35\n" +
                    "فَلَيسَ لَهُ اليَومَ هاهُنا حَميمٌ\n" +
                    "TRANSLITERATION\n" +
                    "fa-laysa lahu l-yawma hāhunā ḥamīmun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "so he has no friend here today,");
            ayat.add("36\n" +
                    "وَلا طَعامٌ إِلّا مِن غِسلينٍ\n" +
                    "TRANSLITERATION\n" +
                    "wa-lā ṭaʿāmun ʾillā min ghislīnin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "nor any food except pus,");
            ayat.add("37\n" +
                    "لا يَأكُلُهُ إِلَّا الخاطِئونَ\n" +
                    "TRANSLITERATION\n" +
                    "lā yaʾkuluhū ʾillā l-khāṭiʾūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "which no one shall eat except the iniquitous.’");
            ayat.add("38\n" +
                    "فَلا أُقسِمُ بِما تُبصِرونَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-lā ʾuqsimu bi-mā tubṣirūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "I swear by what you see");
            ayat.add("39\n" +
                    "وَما لا تُبصِرونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-mā lā tubṣirūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and what you do not see:");
            ayat.add("40\n" +
                    "إِنَّهُ لَقَولُ رَسولٍ كَريمٍ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnahū la-qawlu rasūlin karīmin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "it is indeed the speech of a noble apostle,");
            ayat.add("41\n" +
                    "وَما هُوَ بِقَولِ شاعِرٍ ۚ قَليلًا ما تُؤمِنونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-mā huwa bi-qawli shāʿirin qalīlan mā tuʾminūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and it is not the speech of a poet.\n" +
                    "Little is the faith that you have!");
            ayat.add("42\n" +
                    "وَلا بِقَولِ كاهِنٍ ۚ قَليلًا ما تَذَكَّرونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-lā bi-qawli kāhinin qalīlan mā tadhakkarūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Nor is it the speech of a soothsayer.\n" +
                    "Little is the admonition that you take!");
            ayat.add("43\n" +
                    "تَنزيلٌ مِن رَبِّ العالَمينَ\n" +
                    "TRANSLITERATION\n" +
                    "tanzīlun min rabbi l-ʿālamīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Gradually sent down from the Lord of all the worlds.");
            ayat.add("44\n" +
                    "وَلَو تَقَوَّلَ عَلَينا بَعضَ الأَقاويلِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-law taqawwala ʿalaynā baʿḍa l-ʾaqāwīli\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Had he faked any sayings in Our name,");
            ayat.add("45\n" +
                    "لَأَخَذنا مِنهُ بِاليَمينِ\n" +
                    "TRANSLITERATION\n" +
                    "la-ʾakhadhnā minhu bi-l-yamīni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "We would have surely seized him by the right hand");
            ayat.add("46\n" +
                    "ثُمَّ لَقَطَعنا مِنهُ الوَتينَ\n" +
                    "TRANSLITERATION\n" +
                    "thumma la-qaṭaʿnā minhu l-watīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and then cut off his aorta,");
            ayat.add("47\n" +
                    "فَما مِنكُم مِن أَحَدٍ عَنهُ حاجِزينَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-mā minkum min ʾaḥadin ʿanhu ḥājizīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and none of you could have held Us off from him.");
            ayat.add("48\n" +
                    "وَإِنَّهُ لَتَذكِرَةٌ لِلمُتَّقينَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾinnahū la-tadhkiratun li-l-muttaqīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed it is a reminder for the Godwary.");
            ayat.add("49\n" +
                    "وَإِنّا لَنَعلَمُ أَنَّ مِنكُم مُكَذِّبينَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾinnā la-naʿlamu ʾanna minkum mukadhdhibīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed We know\n" +
                    "that there are some among you who deny [it].");
            ayat.add("50\n" +
                    "وَإِنَّهُ لَحَسرَةٌ عَلَى الكافِرينَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾinnahū la-ḥasratun ʿalā l-kāfirīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And indeed it will be a [matter of] regret\n" +
                    "for the faithless.");
            ayat.add("51\n" +
                    "وَإِنَّهُ لَحَقُّ اليَقينِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾinnahū la-ḥaqqu l-yaqīni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "It is indeed certain truth.");
            ayat.add("52\n" +
                    "فَسَبِّح بِاسمِ رَبِّكَ العَظيمِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-sabbiḥ bi-smi rabbika l-ʿaẓīmi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So celebrate the Name of your Lord, the All-supreme.");
        }
        else if (surahName.equals("70. Al-Ma`aarij"))
        {
            setTitle("Al-Ma`aarij(المعارج) : Lofty Stations");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "سَأَلَ سائِلٌ بِعَذابٍ واقِعٍ\n" +
                    "TRANSLITERATION\n" +
                    "saʾala sāʾilun bi-ʿadhābin wāqiʿin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "An asker asked for a punishment bound to befall");
            ayat.add("2\n" +
                    "لِلكافِرينَ لَيسَ لَهُ دافِعٌ\n" +
                    "TRANSLITERATION\n" +
                    "li-l-kāfirīna laysa lahū dāfiʿun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "—which none can avert from the faithless—");
            ayat.add("3\n" +
                    "مِنَ اللَّهِ ذِي المَعارِجِ\n" +
                    "TRANSLITERATION\n" +
                    "mina llāhi dhī l-maʿāriji\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "from Allah, Lord of the lofty stations.");
            ayat.add("4\n" +
                    "تَعرُجُ المَلائِكَةُ وَالرّوحُ إِلَيهِ في يَومٍ كانَ مِقدارُهُ خَمسينَ أَلفَ سَنَةٍ\n" +
                    "TRANSLITERATION\n" +
                    "taʿruju l-malāʾikatu wa-r-rūḥu ʾilayhi fī yawmin kāna miqdāruhū khamsīna ʾalfa sanatin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The angels and the Spirit ascend to Him\n" +
                    "in a day whose span is\n" +
                    "fifty thousand years.");
            ayat.add("5\n" +
                    "فَاصبِر صَبرًا جَميلًا\n" +
                    "TRANSLITERATION\n" +
                    "fa-ṣbir ṣabran jamīlan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So be patient, with a patience that is graceful.");
            ayat.add("6\n" +
                    "إِنَّهُم يَرَونَهُ بَعيدًا\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnahum yarawnahū baʿīdan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed they see it to be far off,");
            ayat.add("7\n" +
                    "وَنَراهُ قَريبًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-narāhu qarīban\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and We see it to be near.");
            ayat.add("8\n" +
                    "يَومَ تَكونُ السَّماءُ كَالمُهلِ\n" +
                    "TRANSLITERATION\n" +
                    "yawma takūnu s-samāʾu ka-l-muhli\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The day when the sky will be like molten copper,");
            ayat.add("9\n" +
                    "وَتَكونُ الجِبالُ كَالعِهنِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-takūnu l-jibālu ka-l-ʿihni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and the mountains like [tufts of] dyed wool,");
            ayat.add("10\n" +
                    "وَلا يَسأَلُ حَميمٌ حَميمًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-lā yasʾalu ḥamīmun ḥamīman\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and no friend will inquire\n" +
                    "about [the welfare of his] friend,");
            ayat.add("11\n" +
                    "يُبَصَّرونَهُم ۚ يَوَدُّ المُجرِمُ لَو يَفتَدي مِن عَذابِ يَومِئِذٍ بِبَنيهِ\n" +
                    "TRANSLITERATION\n" +
                    "yubaṣṣarūnahum yawaddu l-mujrimu law yaftadī min ʿadhābi yawmiʾidhin bi-banīhi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "[though] they will be placed within each other’s sight.\n" +
                    "The guilty one will wish he could ransom himself\n" +
                    "from the punishment of that day\n" +
                    "at the price of his children,");
            ayat.add("12\n" +
                    "وَصاحِبَتِهِ وَأَخيهِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ṣāḥibatihī wa-ʾakhīhi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "his spouse and his brother,");
            ayat.add("13\n" +
                    "وَفَصيلَتِهِ الَّتي تُؤويهِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-faṣīlatihi llatī tuʾwīhi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "his kin which had sheltered him");
            ayat.add("14\n" +
                    "وَمَن فِي الأَرضِ جَميعًا ثُمَّ يُنجيهِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-man fī l-ʾarḍi jamīʿan thumma yunjīhi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and all those who are upon the earth,\n" +
                    "if that might deliver him.");
            ayat.add("15\n" +
                    "كَلّا ۖ إِنَّها لَظىٰ\n" +
                    "TRANSLITERATION\n" +
                    "kallā ʾinnahā laẓā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Never! Indeed it is a blazing fire,");
            ayat.add("16\n" +
                    "نَزّاعَةً لِلشَّوىٰ\n" +
                    "TRANSLITERATION\n" +
                    "nazzāʿatan li-sh-shawā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "which strips away the scalp.");
            ayat.add("17\n" +
                    "تَدعو مَن أَدبَرَ وَتَوَلّىٰ\n" +
                    "TRANSLITERATION\n" +
                    "tadʿū man ʾadbara wa-tawallā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "It invites him who has turned back [from the truth]\n" +
                    "and forsaken [it],");
            ayat.add("18\n" +
                    "وَجَمَعَ فَأَوعىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-jamaʿa fa-ʾawʿā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "amassing [wealth] and hoarding [it].");
            ayat.add("19\n" +
                    "۞ إِنَّ الإِنسانَ خُلِقَ هَلوعًا\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna l-ʾinsāna khuliqa halūʿan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed man has been created covetous:");
            ayat.add("20\n" +
                    "إِذا مَسَّهُ الشَّرُّ جَزوعًا\n" +
                    "TRANSLITERATION\n" +
                    "ʾidhā massahu sh-sharru jazūʿan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "anxious when an ill befalls him");
            ayat.add("21\n" +
                    "وَإِذا مَسَّهُ الخَيرُ مَنوعًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾidhā massahu l-khayru manūʿan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and grudging when good comes his way");
            ayat.add("22\n" +
                    "إِلَّا المُصَلّينَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾillā l-muṣallīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "—[all are such] except the prayerful,");
            ayat.add("23\n" +
                    "الَّذينَ هُم عَلىٰ صَلاتِهِم دائِمونَ\n" +
                    "TRANSLITERATION\n" +
                    "alladhīna hum ʿalā ṣalātihim dāʾimūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "those who are persevering in their prayers");
            ayat.add("24\n" +
                    "وَالَّذينَ في أَموالِهِم حَقٌّ مَعلومٌ\n" +
                    "TRANSLITERATION\n" +
                    "wa-lladhīna fī ʾamwālihim ḥaqqun maʿlūmun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and in whose wealth there is a known right");
            ayat.add("25\n" +
                    "لِلسّائِلِ وَالمَحرومِ\n" +
                    "TRANSLITERATION\n" +
                    "li-s-sāʾili wa-l-maḥrūmi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "for the beggar and the deprived,");
            ayat.add("26\n" +
                    "وَالَّذينَ يُصَدِّقونَ بِيَومِ الدّينِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-lladhīna yuṣaddiqūna bi-yawmi d-dīni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and who affirm the Day of Retribution,");
            ayat.add("27\n" +
                    "وَالَّذينَ هُم مِن عَذابِ رَبِّهِم مُشفِقونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-lladhīna hum min ʿadhābi rabbihim mushfiqūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and those who are\n" +
                    "apprehensive of the punishment of their Lord");
            ayat.add("28\n" +
                    "إِنَّ عَذابَ رَبِّهِم غَيرُ مَأمونٍ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna ʿadhāba rabbihim ghayru maʾmūnin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "(there is indeed\n" +
                    "no security from the punishment of their Lord)");
            ayat.add("29\n" +
                    "وَالَّذينَ هُم لِفُروجِهِم حافِظونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-lladhīna hum li-furūjihim ḥāfiẓūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and those who guard their private parts");
            ayat.add("30\n" +
                    "إِلّا عَلىٰ أَزواجِهِم أَو ما مَلَكَت أَيمانُهُم فَإِنَّهُم غَيرُ مَلومينَ\n" +
                    "TRANSLITERATION\n" +
                    "illā ʿalā ʾazwājihim ʾaw mā malakat ʾaymānuhum fa-ʾinnahum ghayru malūmīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "(except from their spouses and their slave women,\n" +
                    "for then they are not blameworthy;");
            ayat.add("31\n" +
                    "فَمَنِ ابتَغىٰ وَراءَ ذٰلِكَ فَأُولٰئِكَ هُمُ العادونَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-mani btaghā warāʾa dhālika fa-ʾulāʾika humu l-ʿādūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "but whoever seeks beyond that\n" +
                    "—it is they who are the transgressors)");
            ayat.add("32\n" +
                    "وَالَّذينَ هُم لِأَماناتِهِم وَعَهدِهِم راعونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-lladhīna hum li-ʾamānātihim wa-ʿahdihim rāʿūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and those who keep their trusts and covenants,");
            ayat.add("33\n" +
                    "وَالَّذينَ هُم بِشَهاداتِهِم قائِمونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-lladhīna hum bi-shahādātihim qāʾimūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and those who are observant of their testimonies,");
            ayat.add("34\n" +
                    "وَالَّذينَ هُم عَلىٰ صَلاتِهِم يُحافِظونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-lladhīna hum ʿalā ṣalātihim yuḥāfiẓūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and those who are watchful of their prayers.");
            ayat.add("35\n" +
                    "أُولٰئِكَ في جَنّاتٍ مُكرَمونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾulāʾika fī jannātin mukramūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They will be in gardens, held in honour.");
            ayat.add("36\n" +
                    "فَمالِ الَّذينَ كَفَروا قِبَلَكَ مُهطِعينَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-mā-li lladhīna kafarū qibalaka muhṭiʿīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "What is the matter with the faithless\n" +
                    "that they scramble toward you");
            ayat.add("37\n" +
                    "عَنِ اليَمينِ وَعَنِ الشِّمالِ عِزينَ\n" +
                    "TRANSLITERATION\n" +
                    "ʿani l-yamīni wa-ʿani sh-shimāli ʿizīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "from the left and the right in batches?");
            ayat.add("38\n" +
                    "أَيَطمَعُ كُلُّ امرِئٍ مِنهُم أَن يُدخَلَ جَنَّةَ نَعيمٍ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-yaṭmaʿu kullu mriʾin minhum ʾan yudkhala jannata naʿīmin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Does each man among them hope\n" +
                    "to enter the garden of bliss?");
            ayat.add("39\n" +
                    "كَلّا ۖ إِنّا خَلَقناهُم مِمّا يَعلَمونَ\n" +
                    "TRANSLITERATION\n" +
                    "kallā ʾinnā khalaqnāhum mimmā yaʿlamūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Never!\n" +
                    "Indeed We created them from what they know.");
            ayat.add("40\n" +
                    "فَلا أُقسِمُ بِرَبِّ المَشارِقِ وَالمَغارِبِ إِنّا لَقادِرونَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-lā ʾuqsimu bi-rabbi l-mashāriqi wa-l-maghāribi ʾinnā la-qādirūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So I swear by the Lord of the easts and the wests\n" +
                    "that We are able");
            ayat.add("41\n" +
                    "عَلىٰ أَن نُبَدِّلَ خَيرًا مِنهُم وَما نَحنُ بِمَسبوقينَ\n" +
                    "TRANSLITERATION\n" +
                    "ʿalā ʾan nubaddila khayran minhum wa-mā naḥnu bi-masbūqīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "to replace them by [others] better than them\n" +
                    "and We are not to be outmaneuvered.");
            ayat.add("42\n" +
                    "فَذَرهُم يَخوضوا وَيَلعَبوا حَتّىٰ يُلاقوا يَومَهُمُ الَّذي يوعَدونَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-dharhum yakhūḍū wa-yalʿabū ḥattā yulāqū yawmahumu lladhī yūʿadūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So leave them to gossip and play\n" +
                    "until they encounter their day,\n" +
                    "which they are promised:");
            ayat.add("43\n" +
                    "يَومَ يَخرُجونَ مِنَ الأَجداثِ سِراعًا كَأَنَّهُم إِلىٰ نُصُبٍ يوفِضونَ\n" +
                    "TRANSLITERATION\n" +
                    "yawma yakhrujūna mina l-ʾajdāthi sirāʿan ka-ʾannahum ʾilā nuṣubin yūfiḍūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "the day when they emerge from the graves,\n" +
                    "hastening,\n" +
                    "as if racing toward a target,");
            ayat.add("44\n" +
                    "خاشِعَةً أَبصارُهُم تَرهَقُهُم ذِلَّةٌ ۚ ذٰلِكَ اليَومُ الَّذي كانوا يوعَدونَ\n" +
                    "TRANSLITERATION\n" +
                    "khāshiʿatan ʾabṣāruhum tarhaquhum dhillatun dhālika l-yawmu lladhī kānū yūʿadūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "with a humbled look [in their eyes],\n" +
                    "overcast by abasement.\n" +
                    "That is the day they had been promised.");
        }
        else if (surahName.equals("71. Nuh"))
        {
            setTitle("Nuh(نوح) : Noah");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "إِنّا أَرسَلنا نوحًا إِلىٰ قَومِهِ أَن أَنذِر قَومَكَ مِن قَبلِ أَن يَأتِيَهُم عَذابٌ أَليمٌ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnā ʾarsalnā nūḥan ʾilā qawmihī ʾan ʾandhir qawmaka min qabli ʾan yaʾtiyahum ʿadhābun ʾalīmun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed We sent Noah to his people,\n" +
                    "[saying,] ‘Warn your people\n" +
                    "before a painful punishment overtakes them.’");
            ayat.add("2\n" +
                    "قالَ يا قَومِ إِنّي لَكُم نَذيرٌ مُبينٌ\n" +
                    "TRANSLITERATION\n" +
                    "qāla yā-qawmi ʾinnī lakum nadhīrun mubīnun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "He said, ‘O my people!\n" +
                    "Indeed I am a manifest warner to you.");
            ayat.add("3\n" +
                    "أَنِ اعبُدُوا اللَّهَ وَاتَّقوهُ وَأَطيعونِ\n" +
                    "TRANSLITERATION\n" +
                    "ʾani ʿbudū llāha wa-ttaqūhu wa-ʾaṭīʿūni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Worship Allah and be wary of Him,\n" +
                    "and obey me,");
            ayat.add("4\n" +
                    "يَغفِر لَكُم مِن ذُنوبِكُم وَيُؤَخِّركُم إِلىٰ أَجَلٍ مُسَمًّى ۚ إِنَّ أَجَلَ اللَّهِ إِذا جاءَ لا يُؤَخَّرُ ۖ لَو كُنتُم تَعلَمونَ\n" +
                    "TRANSLITERATION\n" +
                    "yaghfir lakum min dhunūbikum wa-yuʾakhkhirkum ʾilā ʾajalin musamman ʾinna ʾajala llāhi ʾidhā jāʾa lā yuʾakhkharu law kuntum taʿlamūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "that He may forgive you some of your sins\n" +
                    "and respite you until a specified time.\n" +
                    "Indeed when Allah’s [appointed] time comes,\n" +
                    "it cannot be deferred,\n" +
                    "should you know.’");
            ayat.add("5\n" +
                    "قالَ رَبِّ إِنّي دَعَوتُ قَومي لَيلًا وَنَهارًا\n" +
                    "TRANSLITERATION\n" +
                    "qāla rabbi ʾinnī daʿawtu qawmī laylan wa-nahāran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "He said, ‘My Lord!\n" +
                    "Indeed I have summoned my people night and day");
            ayat.add("6\n" +
                    "فَلَم يَزِدهُم دُعائي إِلّا فِرارًا\n" +
                    "TRANSLITERATION\n" +
                    "fa-lam yazidhum duʿāʾī ʾillā firāran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "but my summons only increases their evasion.");
            ayat.add("7\n" +
                    "وَإِنّي كُلَّما دَعَوتُهُم لِتَغفِرَ لَهُم جَعَلوا أَصابِعَهُم في آذانِهِم وَاستَغشَوا ثِيابَهُم وَأَصَرّوا وَاستَكبَرُوا استِكبارًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾinnī kullamā daʿawtuhum li-taghfira lahum jaʿalū ʾaṣābiʿahum fī ʾādhānihim wa-staghshaw thiyābahum wa-ʾaṣarrū wa-stakbarū stikbāran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed whenever I have summoned them,\n" +
                    "so that You might forgive them,\n" +
                    "they would put their fingers into their ears\n" +
                    "and draw their cloaks over their heads,\n" +
                    "and they were persistent [in their unfaith],\n" +
                    "and disdainful in [their] arrogance.");
            ayat.add("8\n" +
                    "ثُمَّ إِنّي دَعَوتُهُم جِهارًا\n" +
                    "TRANSLITERATION\n" +
                    "thumma ʾinnī daʿawtuhum jihāran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Again I summoned them aloud,");
            ayat.add("9\n" +
                    "ثُمَّ إِنّي أَعلَنتُ لَهُم وَأَسرَرتُ لَهُم إِسرارًا\n" +
                    "TRANSLITERATION\n" +
                    "thumma ʾinnī ʾaʿlantu lahum wa-ʾasrartu lahum ʾisrāran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and again appealed to them publicly\n" +
                    "and confided with them privately,");
            ayat.add("10\n" +
                    "فَقُلتُ استَغفِروا رَبَّكُم إِنَّهُ كانَ غَفّارًا\n" +
                    "TRANSLITERATION\n" +
                    "fa-qultu staghfirū rabbakum ʾinnahū kāna ghaffāran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "telling [them]: “Plead to your Lord for forgiveness.\n" +
                    "Indeed He is all-forgiver.");
            ayat.add("11\n" +
                    "يُرسِلِ السَّماءَ عَلَيكُم مِدرارًا\n" +
                    "TRANSLITERATION\n" +
                    "yursili s-samāʾa ʿalaykum midrāran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "He will send for you abundant rains from the sky,");
            ayat.add("12\n" +
                    "وَيُمدِدكُم بِأَموالٍ وَبَنينَ وَيَجعَل لَكُم جَنّاتٍ وَيَجعَل لَكُم أَنهارًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-yumdidkum bi-ʾamwālin wa-banīna wa-yajʿal lakum jannātin wa-yajʿal lakum ʾanhāran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and aid you with wealth and sons,\n" +
                    "and provide you with gardens\n" +
                    "and provide you with streams.");
            ayat.add("13\n" +
                    "ما لَكُم لا تَرجونَ لِلَّهِ وَقارًا\n" +
                    "TRANSLITERATION\n" +
                    "mā lakum lā tarjūna li-llāhi waqāran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "What is the matter with you\n" +
                    "that you do not look upon Allah with veneration,");
            ayat.add("14\n" +
                    "وَقَد خَلَقَكُم أَطوارًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-qad khalaqakum ʾaṭwāran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "though He has created you in [various] stages?");
            ayat.add("15\n" +
                    "أَلَم تَرَوا كَيفَ خَلَقَ اللَّهُ سَبعَ سَماواتٍ طِباقًا\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-lam taraw kayfa khalaqa llāhu sabʿa samāwātin ṭibāqan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Have you not seen how Allah has created\n" +
                    "seven heavens in layers,");
            ayat.add("16\n" +
                    "وَجَعَلَ القَمَرَ فيهِنَّ نورًا وَجَعَلَ الشَّمسَ سِراجًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-jaʿala l-qamara fīhinna nūran wa-jaʿala sh-shamsa sirājan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and has made therein the moon for a light,\n" +
                    "and the sun for a lamp?");
            ayat.add("17\n" +
                    "وَاللَّهُ أَنبَتَكُم مِنَ الأَرضِ نَباتًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-llāhu ʾanbatakum mina l-ʾarḍi nabātan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Allah made you grow from the earth,\n" +
                    "with a [vegetable] growth.");
            ayat.add("18\n" +
                    "ثُمَّ يُعيدُكُم فيها وَيُخرِجُكُم إِخراجًا\n" +
                    "TRANSLITERATION\n" +
                    "thumma yuʿīdukum fīhā wa-yukhrijukum ʾikhrājan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Then He makes you return to it,\n" +
                    "and He will bring you forth [without fail].");
            ayat.add("19\n" +
                    "وَاللَّهُ جَعَلَ لَكُمُ الأَرضَ بِساطًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-llāhu jaʿala lakumu l-ʾarḍa bisāṭan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Allah has made the earth a vast expanse for you");
            ayat.add("20\n" +
                    "لِتَسلُكوا مِنها سُبُلًا فِجاجًا\n" +
                    "TRANSLITERATION\n" +
                    "li-taslukū minhā subulan fijājan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "so that you may travel over its spacious ways.” ’");
            ayat.add("21\n" +
                    "قالَ نوحٌ رَبِّ إِنَّهُم عَصَوني وَاتَّبَعوا مَن لَم يَزِدهُ مالُهُ وَوَلَدُهُ إِلّا خَسارًا\n" +
                    "TRANSLITERATION\n" +
                    "qāla nūḥun rabbi ʾinnahum ʿaṣawnī wa-ttabaʿū man lam yazidhu māluhū wa-waladuhū ʾillā khasāran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Noah said, ‘My Lord!\n" +
                    "They have disobeyed me,\n" +
                    "following someone\n" +
                    "whose wealth and children only add to his loss,");
            ayat.add("22\n" +
                    "وَمَكَروا مَكرًا كُبّارًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-makarū makran kubbāran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and they have devised an outrageous plot.");
            ayat.add("23\n" +
                    "وَقالوا لا تَذَرُنَّ آلِهَتَكُم وَلا تَذَرُنَّ وَدًّا وَلا سُواعًا وَلا يَغوثَ وَيَعوقَ وَنَسرًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-qālū lā tadharunna ʾālihatakum wa-lā tadharunna waddan wa-lā suwāʿan wa-lā yaghūtha wa-yaʿūqa wa-nasran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They say, “Do not abandon your gods.\n" +
                    "Do not abandon Wadd, nor Suwā,\n" +
                    "nor Yaghūth, Yaʿūq and Nasr,”1");
            ayat.add("24\n" +
                    "وَقَد أَضَلّوا كَثيرًا ۖ وَلا تَزِدِ الظّالِمينَ إِلّا ضَلالًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-qad ʾaḍallū kathīran wa-lā tazidi ẓ-ẓālimīna ʾillā ḍalālan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and already they have led many astray.\n" +
                    "Do not increase the wrongdoers in anything but error.’");
            ayat.add("25\n" +
                    "مِمّا خَطيئَاتِهِم أُغرِقوا فَأُدخِلوا نارًا فَلَم يَجِدوا لَهُم مِن دونِ اللَّهِ أَنصارًا\n" +
                    "TRANSLITERATION\n" +
                    "mimmā khaṭīʾātihim ʾughriqū fa-ʾudkhilū nāran fa-lam yajidū lahum min dūni llāhi ʾanṣāran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They were drowned because of their iniquities,\n" +
                    "then made to enter a Fire,\n" +
                    "and they did not find for themselves\n" +
                    "any helpers besides Allah.");
            ayat.add("26\n" +
                    "وَقالَ نوحٌ رَبِّ لا تَذَر عَلَى الأَرضِ مِنَ الكافِرينَ دَيّارًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-qāla nūḥun rabbi lā tadhar ʿalā l-ʾarḍi mina l-kāfirīna dayyāran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And Noah said, ‘My Lord!\n" +
                    "‘Do not leave on the earth\n" +
                    "any inhabitant from among the faithless.");
            ayat.add("27\n" +
                    "إِنَّكَ إِن تَذَرهُم يُضِلّوا عِبادَكَ وَلا يَلِدوا إِلّا فاجِرًا كَفّارًا\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnaka ʾin tadharhum yuḍillū ʿibādaka wa-lā yalidū ʾillā fājiran kaffāran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "If You leave them, they will lead astray Your servants\n" +
                    "and will not beget except vicious ingrates.");
            ayat.add("28\n" +
                    "رَبِّ اغفِر لي وَلِوالِدَيَّ وَلِمَن دَخَلَ بَيتِيَ مُؤمِنًا وَلِلمُؤمِنينَ وَالمُؤمِناتِ وَلا تَزِدِ الظّالِمينَ إِلّا تَبارًا\n" +
                    "TRANSLITERATION\n" +
                    "rabbi ghfir lī wa-li-wālidayya wa-li-man dakhala baytiya muʾminan wa-li-l-muʾminīna wa-l-muʾmināti wa-lā tazidi ẓ-ẓālimīna ʾillā tabāran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "My Lord! Forgive me and my parents,\n" +
                    "and whoever enters my house in faith,\n" +
                    "and the faithful men and women,\n" +
                    "and do not increase the wrongdoers in anything\n" +
                    "except ruin.’");
        }
        else if (surahName.equals("72. Al-Jinn"))
        {
            setTitle("Al-Jinn(الجن) : The Jinn");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "قُل أوحِيَ إِلَيَّ أَنَّهُ استَمَعَ نَفَرٌ مِنَ الجِنِّ فَقالوا إِنّا سَمِعنا قُرآنًا عَجَبًا\n" +
                    "TRANSLITERATION\n" +
                    "qul ʾūḥiya ʾilayya ʾannahu stamaʿa nafarun mina l-jinni fa-qālū ʾinnā samiʿnā qurʾānan ʿajaban\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Say, ‘It has been revealed to me\n" +
                    "that a team of the jinn listened [to the Qurʾān].’\n" +
                    "and they said, “Indeed we heard a wounderful qurʾān,1\n" +
                    "Or ‘recital.’");
            ayat.add("2\n" +
                    "يَهدي إِلَى الرُّشدِ فَآمَنّا بِهِ ۖ وَلَن نُشرِكَ بِرَبِّنا أَحَدًا\n" +
                    "TRANSLITERATION\n" +
                    "yahdī ʾilā r-rushdi fa-ʾāmannā bihī wa-lan nushrika bi-rabbinā ʾaḥadan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "which guides to rectitude.\n" +
                    "Hence we have believed in it\n" +
                    "and we will never ascribe any partner to our Lord.");
            ayat.add("3\n" +
                    "وَأَنَّهُ تَعالىٰ جَدُّ رَبِّنا مَا اتَّخَذَ صاحِبَةً وَلا وَلَدًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾannahū taʿālā jaddu rabbinā mā ttakhadha ṣāḥibatan wa-lā waladan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Exalted be the majesty of our Lord,\n" +
                    "He has taken neither any spouse nor son.");
            ayat.add("4\n" +
                    "وَأَنَّهُ كانَ يَقولُ سَفيهُنا عَلَى اللَّهِ شَطَطًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾannahū kāna yaqūlu safīhunā ʿalā llāhi shaṭaṭan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed the foolish ones among us used to utter\n" +
                    "atrocious lies concerning Allah.");
            ayat.add("5\n" +
                    "وَأَنّا ظَنَنّا أَن لَن تَقولَ الإِنسُ وَالجِنُّ عَلَى اللَّهِ كَذِبًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾannā ẓanannā ʾan lan taqūla l-ʾinsu wa-l-jinnu ʿalā llāhi kadhiban\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed we thought\n" +
                    "that humans and jinn would never utter\n" +
                    "any falsehood concerning Allah.");
            ayat.add("6\n" +
                    "وَأَنَّهُ كانَ رِجالٌ مِنَ الإِنسِ يَعوذونَ بِرِجالٍ مِنَ الجِنِّ فَزادوهُم رَهَقًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾannahū kāna rijālun mina l-ʾinsi yaʿūdhūna bi-rijālin mina l-jinni fa-zādūhum rahaqan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed some persons from the humans\n" +
                    "would seek the protection of some persons from the jinn,\n" +
                    "thus only adding to their rebellion.");
            ayat.add("7\n" +
                    "وَأَنَّهُم ظَنّوا كَما ظَنَنتُم أَن لَن يَبعَثَ اللَّهُ أَحَدًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾannahum ẓannū ka-mā ẓanantum ʾan lan yabʿatha llāhu ʾaḥadan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They1 thought, just as you think,\n" +
                    "that Allah will not raise anyone from the dead.");
            ayat.add("8\n" +
                    "وَأَنّا لَمَسنَا السَّماءَ فَوَجَدناها مُلِئَت حَرَسًا شَديدًا وَشُهُبًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾannā lamasnā s-samāʾa fa-wajadnāhā muliʾat ḥarasan shadīdan wa-shuhuban\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed We made for the heaven\n" +
                    "and found it\n" +
                    "full of mighty sentries and flames.");
            ayat.add("9\n" +
                    "وَأَنّا كُنّا نَقعُدُ مِنها مَقاعِدَ لِلسَّمعِ ۖ فَمَن يَستَمِعِ الآنَ يَجِد لَهُ شِهابًا رَصَدًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾannā kunnā naqʿudu minhā maqāʿida li-s-samʿi fa-man yastamiʿi l-ʾāna yajid lahū shihāban raṣadan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "We used to sit in its positions to eavesdrop,\n" +
                    "but anyone listening now\n" +
                    "finds a flame waiting for him.");
            ayat.add("10\n" +
                    "وَأَنّا لا نَدري أَشَرٌّ أُريدَ بِمَن فِي الأَرضِ أَم أَرادَ بِهِم رَبُّهُم رَشَدًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾannā lā nadrī ʾa-sharrun ʾurīda bi-man fī l-ʾarḍi ʾam ʾarāda bihim rabbuhum rashadan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "We do not know whether ill is intended\n" +
                    "for those who are in the earth,\n" +
                    "or whether their Lord intends good for them.");
            ayat.add("11\n" +
                    "وَأَنّا مِنَّا الصّالِحونَ وَمِنّا دونَ ذٰلِكَ ۖ كُنّا طَرائِقَ قِدَدًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾannā minnā ṣ-ṣāliḥūna wa-minnā dūna dhālika kunnā ṭarāʾiqa qidadan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Among us some are righteous\n" +
                    "and some of us are otherwise:\n" +
                    "we are multifarious sects.");
            ayat.add("12\n" +
                    "وَأَنّا ظَنَنّا أَن لَن نُعجِزَ اللَّهَ فِي الأَرضِ وَلَن نُعجِزَهُ هَرَبًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾannā ẓanannā ʾan lan nuʿjiza llāha fī l-ʾarḍi wa-lan nuʿjizahū haraban\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "We know that we cannot thwart Allah\n" +
                    "on the earth,\n" +
                    "nor can we thwart Him by fleeing.");
            ayat.add("13\n" +
                    "وَأَنّا لَمّا سَمِعنَا الهُدىٰ آمَنّا بِهِ ۖ فَمَن يُؤمِن بِرَبِّهِ فَلا يَخافُ بَخسًا وَلا رَهَقًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾannā lammā samiʿnā l-hudā ʾāmannā bihī fa-man yuʾmin bi-rabbihī fa-lā yakhāfu bakhsan wa-lā rahaqan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "When we heard the [message of] guidance,\n" +
                    "we believed in it.\n" +
                    "Whoever that has faith in his Lord\n" +
                    "shall neither fear any detraction nor oppression.");
            ayat.add("14\n" +
                    "وَأَنّا مِنَّا المُسلِمونَ وَمِنَّا القاسِطونَ ۖ فَمَن أَسلَمَ فَأُولٰئِكَ تَحَرَّوا رَشَدًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾannā minnā l-muslimūna wa-minnā l-qāsiṭūna fa-man ʾaslama fa-ʾulāʾika taḥarraw rashadan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Among us some are muslims\n" +
                    "and some of us are perverse.1\n" +
                    "Yet those who submit [to Allah]\n" +
                    "—it is they who pursue rectitude.");
            ayat.add("15\n" +
                    "وَأَمَّا القاسِطونَ فَكانوا لِجَهَنَّمَ حَطَبًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾammā l-qāsiṭūna fa-kānū li-jahannama ḥaṭaban\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "As for the perverse,\n" +
                    "they will be firewood for hell.” ’");
            ayat.add("16\n" +
                    "وَأَن لَوِ استَقاموا عَلَى الطَّريقَةِ لَأَسقَيناهُم ماءً غَدَقًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾallawi staqāmū ʿalā ṭ-ṭarīqati la-ʾasqaynāhum māʾan ghadaqan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "If they are steadfast on the path [of Allah],\n" +
                    "We shall provide them with abundant water,");
            ayat.add("17\n" +
                    "لِنَفتِنَهُم فيهِ ۚ وَمَن يُعرِض عَن ذِكرِ رَبِّهِ يَسلُكهُ عَذابًا صَعَدًا\n" +
                    "TRANSLITERATION\n" +
                    "li-naftinahum fīhi wa-man yuʿriḍ ʿan dhikri rabbihī yaslukhu ʿadhāban ṣaʿadan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "so that We may test them therein,\n" +
                    "and whoever turns away\n" +
                    "from the remembrance of his Lord,\n" +
                    "He will let him into an escalating punishment.");
            ayat.add("18\n" +
                    "وَأَنَّ المَساجِدَ لِلَّهِ فَلا تَدعوا مَعَ اللَّهِ أَحَدًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾanna l-masājida li-llāhi fa-lā tadʿū maʿa llāhi ʾaḥadan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The places of worship belong to Allah,\n" +
                    "so do not invoke anyone along with Allah.");
            ayat.add("19\n" +
                    "وَأَنَّهُ لَمّا قامَ عَبدُ اللَّهِ يَدعوهُ كادوا يَكونونَ عَلَيهِ لِبَدًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾannahū lammā qāma ʿabdu llāhi yadʿūhu kādū yakūnūna ʿalayhi libadan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "When the servant of Allah1 rose to pray to Him,\n" +
                    "they almost crowded around him.");
            ayat.add("20\n" +
                    "قُل إِنَّما أَدعو رَبّي وَلا أُشرِكُ بِهِ أَحَدًا\n" +
                    "TRANSLITERATION\n" +
                    "qul ʾinnamā ʾadʿū rabbī wa-lā ʾushriku bihī ʾaḥadan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Say, ‘I pray only to my Lord,\n" +
                    "and I do not ascribe any partner to Him.’");
            ayat.add("21\n" +
                    "قُل إِنّي لا أَملِكُ لَكُم ضَرًّا وَلا رَشَدًا\n" +
                    "TRANSLITERATION\n" +
                    "qul ʾinnī lā ʾamliku lakum ḍarran wa-lā rashadan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Say, ‘I have no power to bring you any harm\n" +
                    "or good [of my own accord].’");
            ayat.add("22\n" +
                    "قُل إِنّي لَن يُجيرَني مِنَ اللَّهِ أَحَدٌ وَلَن أَجِدَ مِن دونِهِ مُلتَحَدًا\n" +
                    "TRANSLITERATION\n" +
                    "qul ʾinnī lan yujīranī mina llāhi ʾaḥadun wa-lan ʾajida min dūnihī multaḥadan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Say, ‘Neither can anyone shelter me from Allah,\n" +
                    "nor can I find any refuge besides Him.");
            ayat.add("23\n" +
                    "إِلّا بَلاغًا مِنَ اللَّهِ وَرِسالاتِهِ ۚ وَمَن يَعصِ اللَّهَ وَرَسولَهُ فَإِنَّ لَهُ نارَ جَهَنَّمَ خالِدينَ فيها أَبَدًا\n" +
                    "TRANSLITERATION\n" +
                    "ʾillā balāghan mina llāhi wa-risālātihī wa-man yaʿṣi llāha wa-rasūlahū fa-ʾinna lahū nāra jahannama khālidīna fīhā ʾabadan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "[I have no duty] except to transmit from Allah,\n" +
                    "and [to communicate] His messages;\n" +
                    "and whoever disobeys Allah and His apostle,\n" +
                    "indeed there will be for him the fire of hell,\n" +
                    "to remain in it forever.’");
            ayat.add("24\n" +
                    "حَتّىٰ إِذا رَأَوا ما يوعَدونَ فَسَيَعلَمونَ مَن أَضعَفُ ناصِرًا وَأَقَلُّ عَدَدًا\n" +
                    "TRANSLITERATION\n" +
                    "ḥattā ʾidhā raʾaw mā yūʿadūna fa-sa-yaʿlamūna man ʾaḍʿafu nāṣiran wa-ʾaqallu ʿadadan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "When they see what they are promised,\n" +
                    "they will then know who is weaker in supporters\n" +
                    "and fewer in numbers.");
            ayat.add("25\n" +
                    "قُل إِن أَدري أَقَريبٌ ما توعَدونَ أَم يَجعَلُ لَهُ رَبّي أَمَدًا\n" +
                    "TRANSLITERATION\n" +
                    "qul ʾin ʾadrī ʾa-qarībun mā tūʿadūna ʾam yajʿalu lahū rabbī ʾamadan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Say, ‘I do not know if what you are promised is near,\n" +
                    "or if my Lord has set a term for it.’");
            ayat.add("26\n" +
                    "عالِمُ الغَيبِ فَلا يُظهِرُ عَلىٰ غَيبِهِ أَحَدًا\n" +
                    "TRANSLITERATION\n" +
                    "ʿālimu l-ghaybi fa-lā yuẓhiru ʿalā ghaybihī ʾaḥadan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Knower of the Unseen,\n" +
                    "He does not disclose His Unseen to anyone,");
            ayat.add("27\n" +
                    "إِلّا مَنِ ارتَضىٰ مِن رَسولٍ فَإِنَّهُ يَسلُكُ مِن بَينِ يَدَيهِ وَمِن خَلفِهِ رَصَدًا\n" +
                    "TRANSLITERATION\n" +
                    "ʾillā mani rtaḍā min rasūlin fa-ʾinnahū yasluku min bayni yadayhi wa-min khalfihī raṣadan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "except to an apostle He approves of.\n" +
                    "Then He dispatches\n" +
                    "a sentinel before and behind him");
            ayat.add("28\n" +
                    "لِيَعلَمَ أَن قَد أَبلَغوا رِسالاتِ رَبِّهِم وَأَحاطَ بِما لَدَيهِم وَأَحصىٰ كُلَّ شَيءٍ عَدَدًا\n" +
                    "TRANSLITERATION\n" +
                    "li-yaʿlama ʾan qad ʾablaghū risālāti rabbihim wa-ʾaḥāṭa bi-mā ladayhim wa-ʾaḥṣā kulla shayʾin ʿadadan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "so that He may ascertain\n" +
                    "that they have communicated\n" +
                    "the messages of their Lord,\n" +
                    "and He comprehends all that is with them,\n" +
                    "and He keeps count of all things.");
        }
        else if (surahName.equals("73. Al-Muzzammil"))
        {
            setTitle("Al-Muzzammil(المزمل) : Enwrapped");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "يا أَيُّهَا المُزَّمِّلُ\n" +
                    "TRANSLITERATION\n" +
                    "yā-ʾayyuhā l-muzzammilu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "O you wrapped up in your mantle!");
            ayat.add("2\n" +
                    "قُمِ اللَّيلَ إِلّا قَليلًا\n" +
                    "TRANSLITERATION\n" +
                    "qumi l-layla ʾillā qalīlan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Stand vigil through the night, except a little,");
            ayat.add("3\n" +
                    "نِصفَهُ أَوِ انقُص مِنهُ قَليلًا\n" +
                    "TRANSLITERATION\n" +
                    "niṣfahū ʾawi nquṣ minhu qalīlan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "a half, or reduce a little from that");
            ayat.add("4\n" +
                    "أَو زِد عَلَيهِ وَرَتِّلِ القُرآنَ تَرتيلًا\n" +
                    "TRANSLITERATION\n" +
                    "ʾaw zid ʿalayhi wa-rattili l-qurʾāna tartīlan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "or add to it,\n" +
                    "and recite the Qurʾān in a measured tone.");
            ayat.add("5\n" +
                    "إِنّا سَنُلقي عَلَيكَ قَولًا ثَقيلًا\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnā sa-nulqī ʿalayka qawlan thaqīlan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed soon We shall cast on you a weighty word.");
            ayat.add("6\n" +
                    "إِنَّ ناشِئَةَ اللَّيلِ هِيَ أَشَدُّ وَطئًا وَأَقوَمُ قيلًا\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna nāshiʾata l-layli hiya ʾashaddu waṭʾan wa-ʾaqwamu qīlan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed the watch of the night is firmer in tread\n" +
                    "and more upright in respect to speech,");
            ayat.add("7\n" +
                    "إِنَّ لَكَ فِي النَّهارِ سَبحًا طَويلًا\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna laka fī n-nahāri sabḥan ṭawīlan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "for indeed during the day you have\n" +
                    "drawn-out engagements.");
            ayat.add("8\n" +
                    "وَاذكُرِ اسمَ رَبِّكَ وَتَبَتَّل إِلَيهِ تَبتيلًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-dhkuri sma rabbika wa-tabattal ʾilayhi tabtīlan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So celebrate the Name of your Lord\n" +
                    "and dedicate yourself to Him with total dedication.");
            ayat.add("9\n" +
                    "رَبُّ المَشرِقِ وَالمَغرِبِ لا إِلٰهَ إِلّا هُوَ فَاتَّخِذهُ وَكيلًا\n" +
                    "TRANSLITERATION\n" +
                    "rabbu l-mashriqi wa-l-maghribi lā ʾilāha ʾillā huwa fa-ttakhidhhu wakīlan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Lord of the east and the west,\n" +
                    "there is no god except Him,\n" +
                    "so take Him for your trustee,");
            ayat.add("10\n" +
                    "وَاصبِر عَلىٰ ما يَقولونَ وَاهجُرهُم هَجرًا جَميلًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-sbir ʿalā mā yaqūlūna wa-hjurhum hajran jamīlan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and be patient over what they say,\n" +
                    "and keep away from them in a graceful manner.");
            ayat.add("11\n" +
                    "وَذَرني وَالمُكَذِّبينَ أُولِي النَّعمَةِ وَمَهِّلهُم قَليلًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-dharnī wa-l-mukadhdhibīna ʾulī n-naʿmati wa-mahhilhum qalīlan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Leave Me [to deal] with the deniers, the opulent,\n" +
                    "and give them a little respite.");
            ayat.add("12\n" +
                    "إِنَّ لَدَينا أَنكالًا وَجَحيمًا\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna ladaynā ʾankālan wa-jaḥīman\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed with Us are heavy fetters and a fierce fire,");
            ayat.add("13\n" +
                    "وَطَعامًا ذا غُصَّةٍ وَعَذابًا أَليمًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-ṭaʿāman dhā ghuṣṣatin wa-ʿadhāban ʾalīman\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and a food that chokes [those who gulp it],\n" +
                    "and a painful punishment [prepared for]");
            ayat.add("14\n" +
                    "يَومَ تَرجُفُ الأَرضُ وَالجِبالُ وَكانَتِ الجِبالُ كَثيبًا مَهيلًا\n" +
                    "TRANSLITERATION\n" +
                    "yawma tarjufu l-ʾarḍu wa-l-jibālu wa-kānati l-jibālu kathīban mahīlan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "the day when the earth and the mountains will quake,\n" +
                    "and the mountains will be like dunes of shifting sand.");
            ayat.add("15\n" +
                    "إِنّا أَرسَلنا إِلَيكُم رَسولًا شاهِدًا عَلَيكُم كَما أَرسَلنا إِلىٰ فِرعَونَ رَسولًا\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnā ʾarsalnā ʾilaykum rasūlan shāhidan ʿalaykum ka-mā ʾarsalnā ʾilā firʿawna rasūlan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed We have sent to you an apostle,\n" +
                    "to be a witness to you,\n" +
                    "just as We sent an apostle to Pharaoh.");
            ayat.add("16\n" +
                    "فَعَصىٰ فِرعَونُ الرَّسولَ فَأَخَذناهُ أَخذًا وَبيلًا\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʿaṣā firʿawnu r-rasūla fa-ʾakhadhnāhu ʾakhdhan wabīlan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "But Pharaoh disobeyed the apostle;\n" +
                    "so We seized him with a terrible seizing.");
            ayat.add("17\n" +
                    "فَكَيفَ تَتَّقونَ إِن كَفَرتُم يَومًا يَجعَلُ الوِلدانَ شيبًا\n" +
                    "TRANSLITERATION\n" +
                    "fa-kayfa tattaqūna ʾin kafartum yawman yajʿalu l-wildāna shīban-i\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So, if you disbelieve, how will you avoid the day\n" +
                    "which will make children white-headed,");
            ayat.add("18\n" +
                    "السَّماءُ مُنفَطِرٌ بِهِ ۚ كانَ وَعدُهُ مَفعولًا\n" +
                    "TRANSLITERATION\n" +
                    "as-samāʾu munfaṭirun bihī kāna waʿduhū mafʿūlan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and wherein the sky will be rent apart?\n" +
                    "His promise is bound to be fulfilled.");
            ayat.add("19\n" +
                    "إِنَّ هٰذِهِ تَذكِرَةٌ ۖ فَمَن شاءَ اتَّخَذَ إِلىٰ رَبِّهِ سَبيلًا\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna hādhihī tadhkiratun fa-man shāʾa ttakhadha ʾilā rabbihī sabīlan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "This is indeed a reminder.\n" +
                    "So let anyone who wishes take the way toward his Lord.");
            ayat.add("20\n" +
                    "۞ إِنَّ رَبَّكَ يَعلَمُ أَنَّكَ تَقومُ أَدنىٰ مِن ثُلُثَيِ اللَّيلِ وَنِصفَهُ وَثُلُثَهُ وَطائِفَةٌ مِنَ الَّذينَ مَعَكَ ۚ وَاللَّهُ يُقَدِّرُ اللَّيلَ وَالنَّهارَ ۚ عَلِمَ أَن لَن تُحصوهُ فَتابَ عَلَيكُم ۖ فَاقرَءوا ما تَيَسَّرَ مِنَ القُرآنِ ۚ عَلِمَ أَن سَيَكونُ مِنكُم مَرضىٰ ۙ وَآخَرونَ يَضرِبونَ فِي الأَرضِ يَبتَغونَ مِن فَضلِ اللَّهِ ۙ وَآخَرونَ يُقاتِلونَ في سَبيلِ اللَّهِ ۖ فَاقرَءوا ما تَيَسَّرَ مِنهُ ۚ وَأَقيمُوا الصَّلاةَ وَآتُوا الزَّكاةَ وَأَقرِضُوا اللَّهَ قَرضًا حَسَنًا ۚ وَما تُقَدِّموا لِأَنفُسِكُم مِن خَيرٍ تَجِدوهُ عِندَ اللَّهِ هُوَ خَيرًا وَأَعظَمَ أَجرًا ۚ وَاستَغفِرُوا اللَّهَ ۖ إِنَّ اللَّهَ غَفورٌ رَحيمٌ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna rabbaka yaʿlamu ʾannaka taqūmu ʾadnā min thuluthayi l-layli wa-niṣfahū wa-thuluthahū wa-ṭāʾifatun mina lladhīna maʿaka wa-llāhu yuqaddiru l-layla wa-n-nahāra ʿalima ʾan lan tuḥṣūhu fa-tāba ʿalaykum fa-qraʾū mā tayassara mina l-qurʾāni ʿalima ʾan sa-yakūnu minkum marḍā wa-ʾākharūna yaḍribūna fī l-ʾarḍi yabtaghūna min faḍli llāhi wa-ʾākharūna yuqātilūna fī sabīli llāhi fa-qraʾū mā tayassara minhu wa-ʾaqīmū ṣ-ṣalāta wa-ʾātū z-zakāta wa-ʾaqriḍū llāha qarḍan ḥasanan wa-mā tuqaddimū li-ʾanfusikum min khayrin tajidūhu ʿinda llāhi huwa khayran wa-ʾaʿẓama ʾajran wa-staghfirū llāha ʾinna llāha ghafūrun raḥīmun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed your Lord knows\n" +
                    "that you stand vigil nearly two thirds of the night\n" +
                    "—or [at times] a half or a third of it—\n" +
                    "along with a group of those who are with you.\n" +
                    "Allah measures the night and the day.\n" +
                    "He knows that you cannot calculate it [exactly],\n" +
                    "and so He was lenient toward you.\n" +
                    "So recite as much of the Qurʾān as is feasible.\n" +
                    "He knows that some of you will be sick,\n" +
                    "while others will travel in the land\n" +
                    "seeking Allah’s grace,\n" +
                    "and yet others will fight in the way of Allah.\n" +
                    "So recite as much of it as is feasible,\n" +
                    "and maintain the prayer and pay the zakāt\n" +
                    "and lend Allah a good loan.\n" +
                    "Whatever good you send ahead for your souls\n" +
                    "you will find it with Allah [in a form]\n" +
                    "that is better and greater with respect to reward.\n" +
                    "And plead to Allah for forgiveness;\n" +
                    "indeed Allah is all-forgiving, all-merciful.\n");
        }
        else if (surahName.equals("74. Al-Muddathir"))
        {
            setTitle("Al-Muddathir(المدثر) : Shrouded ");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "يا أَيُّهَا المُدَّثِّرُ\n" +
                    "TRANSLITERATION\n" +
                    "yā-ʾayyuhā l-muddaththiru\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "O you wrapped up in your mantle!");
            ayat.add("2\n" +
                    "قُم فَأَنذِر\n" +
                    "TRANSLITERATION\n" +
                    "qum fa-ʾandhir\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Rise up and warn!");
            ayat.add("3\n" +
                    "وَرَبَّكَ فَكَبِّر\n" +
                    "TRANSLITERATION\n" +
                    "wa-rabbaka fa-kabbir\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Magnify your Lord,");
            ayat.add("4\n" +
                    "وَثِيابَكَ فَطَهِّر\n" +
                    "TRANSLITERATION\n" +
                    "wa-thiyābaka fa-ṭahhir\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and purify your cloak,");
            ayat.add("5\n" +
                    "وَالرُّجزَ فَاهجُر\n" +
                    "TRANSLITERATION\n" +
                    "wa-r-rujza fa-hjur\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and keep away from all impurity!");
            ayat.add("6\n" +
                    "وَلا تَمنُن تَستَكثِرُ\n" +
                    "TRANSLITERATION\n" +
                    "wa-lā tamnun tastakthiru\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Do not grant a favour seeking a greater gain,");
            ayat.add("7\n" +
                    "وَلِرَبِّكَ فَاصبِر\n" +
                    "TRANSLITERATION\n" +
                    "wa-li-rabbika fa-ṣbir\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and be patient for the sake of your Lord.");
            ayat.add("8\n" +
                    "فَإِذا نُقِرَ فِي النّاقورِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾidhā nuqira fī n-nāqūri\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "When the Trumpet will be sounded,");
            ayat.add("9\n" +
                    "فَذٰلِكَ يَومَئِذٍ يَومٌ عَسيرٌ\n" +
                    "TRANSLITERATION\n" +
                    "fa-dhālika yawmaʾidhin yawmun ʿasīrun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "that day will be a day of hardship,");
            ayat.add("10\n" +
                    "عَلَى الكافِرينَ غَيرُ يَسيرٍ\n" +
                    "TRANSLITERATION\n" +
                    "ʿalā l-kāfirīna ghayru yasīrin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "not at all easy for the faithless.");
            ayat.add("11\n" +
                    "ذَرني وَمَن خَلَقتُ وَحيدًا\n" +
                    "TRANSLITERATION\n" +
                    "dharnī wa-man khalaqtu waḥīdan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Leave Me [to deal] with him whom I created alone,");
            ayat.add("12\n" +
                    "وَجَعَلتُ لَهُ مالًا مَمدودًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-jaʿaltu lahū mālan mamdūdan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and then furnished him with extensive means,");
            ayat.add("13\n" +
                    "وَبَنينَ شُهودًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-banīna shuhūdan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and [gave him] sons to be at his side,");
            ayat.add("14\n" +
                    "وَمَهَّدتُ لَهُ تَمهيدًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-mahhadtu lahū tamhīdan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and facilitated [all matters] for him.");
            ayat.add("15\n" +
                    "ثُمَّ يَطمَعُ أَن أَزيدَ\n" +
                    "TRANSLITERATION\n" +
                    "thumma yaṭmaʿu ʾan ʾazīda\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Still he is eager that I should give him more.");
            ayat.add("16\n" +
                    "كَلّا ۖ إِنَّهُ كانَ لِآياتِنا عَنيدًا\n" +
                    "TRANSLITERATION\n" +
                    "kallā ʾinnahū kāna li-ʾāyātinā ʿanīdan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "No indeed! He is an obstinate opponent of Our signs.");
            ayat.add("17\n" +
                    "سَأُرهِقُهُ صَعودًا\n" +
                    "TRANSLITERATION\n" +
                    "sa-ʾurhiquhū ṣaʿūdan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Soon I will overwhelm him with hardship.");
            ayat.add("18\n" +
                    "إِنَّهُ فَكَّرَ وَقَدَّرَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnahū fakkara wa-qaddara\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed he reflected and decided.");
            ayat.add("19\n" +
                    "فَقُتِلَ كَيفَ قَدَّرَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-qutila kayfa qaddara\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Perish he, how he decided!");
            ayat.add("20\n" +
                    "ثُمَّ قُتِلَ كَيفَ قَدَّرَ\n" +
                    "TRANSLITERATION\n" +
                    "thumma qutila kayfa qaddara\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Again, perish he, how he decided!");
            ayat.add("21\n" +
                    "ثُمَّ نَظَرَ\n" +
                    "TRANSLITERATION\n" +
                    "thumma naẓara\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Then he looked;");
            ayat.add("22\n" +
                    "ثُمَّ عَبَسَ وَبَسَرَ\n" +
                    "TRANSLITERATION\n" +
                    "thumma ʿabasa wa-basara\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "then he frowned and scowled.");
            ayat.add("23\n" +
                    "ثُمَّ أَدبَرَ وَاستَكبَرَ\n" +
                    "TRANSLITERATION\n" +
                    "thumma ʾadbara wa-stakbara\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Then he went away disdainfully,");
            ayat.add("24\n" +
                    "فَقالَ إِن هٰذا إِلّا سِحرٌ يُؤثَرُ\n" +
                    "TRANSLITERATION\n" +
                    "fa-qāla ʾin hādhā ʾillā siḥrun yuʾtharu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "saying, ‘It1 is nothing but magic handed down.2\n" +
                    "That is, the Qurʾān.\n" +
                    "That is, from the magicians of old. Or ‘traditional magic.’");
            ayat.add("25\n" +
                    "إِن هٰذا إِلّا قَولُ البَشَرِ\n" +
                    "TRANSLITERATION\n" +
                    "ʾin hādhā ʾillā qawlu l-bashari\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "It is nothing but the speech of a human being.’");
            ayat.add("26\n" +
                    "سَأُصليهِ سَقَرَ\n" +
                    "TRANSLITERATION\n" +
                    "sa-ʾuṣlīhi saqara\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Soon I shall cast him into Saqar.1\n" +
                    "Saqar is another name for hell or a part of it.");
            ayat.add("27\n" +
                    "وَما أَدراكَ ما سَقَرُ\n" +
                    "TRANSLITERATION\n" +
                    "wa-mā ʾadrāka mā saqaru\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And what will show you what is Saqar?");
            ayat.add("28\n" +
                    "لا تُبقي وَلا تَذَرُ\n" +
                    "TRANSLITERATION\n" +
                    "lā tubqī wa-lā tadharu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "It neither spares nor leaves [anything].");
            ayat.add("29\n" +
                    "لَوّاحَةٌ لِلبَشَرِ\n" +
                    "TRANSLITERATION\n" +
                    "lawwāḥatun li-l-bashari\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "It burns the skin.");
            ayat.add("30\n" +
                    "عَلَيها تِسعَةَ عَشَرَ\n" +
                    "TRANSLITERATION\n" +
                    "ʿalayhā tisʿata ʿashara\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "There are nineteen [keepers] over it.");
            ayat.add("31\n" +
                    "وَما جَعَلنا أَصحابَ النّارِ إِلّا مَلائِكَةً ۙ وَما جَعَلنا عِدَّتَهُم إِلّا فِتنَةً لِلَّذينَ كَفَروا لِيَستَيقِنَ الَّذينَ أوتُوا الكِتابَ وَيَزدادَ الَّذينَ آمَنوا إيمانًا ۙ وَلا يَرتابَ الَّذينَ أوتُوا الكِتابَ وَالمُؤمِنونَ ۙ وَلِيَقولَ الَّذينَ في قُلوبِهِم مَرَضٌ وَالكافِرونَ ماذا أَرادَ اللَّهُ بِهٰذا مَثَلًا ۚ كَذٰلِكَ يُضِلُّ اللَّهُ مَن يَشاءُ وَيَهدي مَن يَشاءُ ۚ وَما يَعلَمُ جُنودَ رَبِّكَ إِلّا هُوَ ۚ وَما هِيَ إِلّا ذِكرىٰ لِلبَشَرِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-mā jaʿalnā ʾaṣḥāba n-nāri ʾillā malāʾikatan wa-mā jaʿalnā ʿiddatahum ʾillā fitnatan li-lladhīna kafarū li-yastayqina lladhīna ʾūtū l-kitāba wa-yazdāda lladhīna ʾāmanū ʾīmānan wa-lā yartāba lladhīna ʾūtū l-kitāba wa-l-muʾminūna wa-li-yaqūla lladhīna fī qulūbihim maraḍun wa-l-kāfirūna mādhā ʾarāda llāhu bi-hādhā mathalan ka-dhālika yuḍillu llāhu man yashāʾu wa-yahdī man yashāʾu wa-mā yaʿlamu junūda rabbika ʾillā huwa wa-mā hiya ʾillā dhikrā li-l-bashari\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "We have assigned only angels as keepers of the Fire,\n" +
                    "and We have made their number\n" +
                    "merely a stumbling block for the faithless,\n" +
                    "and that those given the Book may be reassured,\n" +
                    "and the faithful may increase in [their] faith,\n" +
                    "and that those given the Book may not doubt\n" +
                    "and the faithful [as well],\n" +
                    "and that those in whose hearts is a sickness may say,\n" +
                    "and the faithless [along with them],\n" +
                    "‘What did Allah mean by this description?’\n" +
                    "Thus does Allah lead astray whomever He wishes,\n" +
                    "and guides whomever He wishes.\n" +
                    "No one knows the hosts of your Lord except Him,\n" +
                    "and it1 is just an admonition for all humans.");
            ayat.add("32\n" +
                    "كَلّا وَالقَمَرِ\n" +
                    "TRANSLITERATION\n" +
                    "kallā wa-l-qamari\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "No indeed!\n" +
                    "By the Moon!");
            ayat.add("33\n" +
                    "وَاللَّيلِ إِذ أَدبَرَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-l-layli ʾidh ʾadbara\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "By the night when it recedes!");
            ayat.add("34\n" +
                    "وَالصُّبحِ إِذا أَسفَرَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ṣ-ṣubḥi ʾidhā ʾasfara\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "By the dawn when it brightens!");
            ayat.add("35\n" +
                    "إِنَّها لَإِحدَى الكُبَرِ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnahā la-ʾiḥdā l-kubari\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed it is one of the greatest [signs]");
            ayat.add("36\n" +
                    "نَذيرًا لِلبَشَرِ\n" +
                    "TRANSLITERATION\n" +
                    "nadhīran li-l-bashari\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "—a warner to all humans,");
            ayat.add("37\n" +
                    "لِمَن شاءَ مِنكُم أَن يَتَقَدَّمَ أَو يَتَأَخَّرَ\n" +
                    "TRANSLITERATION\n" +
                    "li-man shāʾa minkum ʾan yataqaddama ʾaw yataʾakhkhara\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "[alike] for those of you who like to advance ahead\n" +
                    "and those who would linger behind.");
            ayat.add("38\n" +
                    "كُلُّ نَفسٍ بِما كَسَبَت رَهينَةٌ\n" +
                    "TRANSLITERATION\n" +
                    "kullu nafsin bi-mā kasabat rahīnatun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Every soul is hostage to what it has earned,");
            ayat.add("39\n" +
                    "إِلّا أَصحابَ اليَمينِ\n" +
                    "TRANSLITERATION\n" +
                    "ʾillā ʾaṣḥāba l-yamīni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "except the People of the Right Hand.");
            ayat.add("40\n" +
                    "في جَنّاتٍ يَتَساءَلونَ\n" +
                    "TRANSLITERATION\n" +
                    "fī jannātin yatasāʾalūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "[They will be] in gardens, questioning");
            ayat.add("41\n" +
                    "عَنِ المُجرِمينَ\n" +
                    "TRANSLITERATION\n" +
                    "ʿani l-mujrimīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "concerning the guilty:");
            ayat.add("42\n" +
                    "ما سَلَكَكُم في سَقَرَ\n" +
                    "TRANSLITERATION\n" +
                    "mā salakakum fī saqara\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "‘What drew you into Hell?’");
            ayat.add("43\n" +
                    "قالوا لَم نَكُ مِنَ المُصَلّينَ\n" +
                    "TRANSLITERATION\n" +
                    "qālū lam naku mina l-muṣallīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They will answer,\n" +
                    "‘We were not among those who prayed.1");
            ayat.add("44\n" +
                    "وَلَم نَكُ نُطعِمُ المِسكينَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-lam naku nuṭʿimu l-miskīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Nor did we feed the poor.");
            ayat.add("45\n" +
                    "وَكُنّا نَخوضُ مَعَ الخائِضينَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-kunnā nakhūḍu maʿa l-khāʾiḍīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "We used to gossip along with the gossipers,");
            ayat.add("46\n" +
                    "وَكُنّا نُكَذِّبُ بِيَومِ الدّينِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-kunnā nukadhdhibu bi-yawmi d-dīni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and we used to deny the Day of Retribution,");
            ayat.add("47\n" +
                    "حَتّىٰ أَتانَا اليَقينُ\n" +
                    "TRANSLITERATION\n" +
                    "ḥattā ʾatānā l-yaqīnu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "until death came to us.’");
            ayat.add("48\n" +
                    "فَما تَنفَعُهُم شَفاعَةُ الشّافِعينَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-mā tanfaʿuhum shafāʿatu sh-shāfiʿīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So the intercession of the intercessors will not avail them.");
            ayat.add("49\n" +
                    "فَما لَهُم عَنِ التَّذكِرَةِ مُعرِضينَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-mā lahum ʿani t-tadhkirati muʿriḍīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "What is the matter with them\n" +
                    "that they evade the Reminder");
            ayat.add("50\n" +
                    "كَأَنَّهُم حُمُرٌ مُستَنفِرَةٌ\n" +
                    "TRANSLITERATION\n" +
                    "ka-ʾannahum ḥumurun mustanfiratun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "as if they were terrified asses");
            ayat.add("51\n" +
                    "فَرَّت مِن قَسوَرَةٍ\n" +
                    "TRANSLITERATION\n" +
                    "farrat min qaswaratin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "fleeing from a lion?");
            ayat.add("52\n" +
                    "بَل يُريدُ كُلُّ امرِئٍ مِنهُم أَن يُؤتىٰ صُحُفًا مُنَشَّرَةً\n" +
                    "TRANSLITERATION\n" +
                    "bal yurīdu kullu mriʾin minhum ʾan yuʾtā ṣuḥufan munashsharatan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Rather everyone of them desires\n" +
                    "to be given unrolled scriptures [from Allah].");
            ayat.add("53\n" +
                    "كَلّا ۖ بَل لا يَخافونَ الآخِرَةَ\n" +
                    "TRANSLITERATION\n" +
                    "kallā bal lā yakhāfūna l-ʾākhirata\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "No indeed!\n" +
                    "Rather they do not fear the Hereafter.");
            ayat.add("54\n" +
                    "كَلّا إِنَّهُ تَذكِرَةٌ\n" +
                    "TRANSLITERATION\n" +
                    "kallā ʾinnahū tadhkiratun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "No indeed!\n" +
                    "It is indeed a reminder.");
            ayat.add("55\n" +
                    "فَمَن شاءَ ذَكَرَهُ\n" +
                    "TRANSLITERATION\n" +
                    "fa-man shāʾa dhakarahū\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So let anyone who wishes remember it.");
            ayat.add("56\n" +
                    "وَما يَذكُرونَ إِلّا أَن يَشاءَ اللَّهُ ۚ هُوَ أَهلُ التَّقوىٰ وَأَهلُ المَغفِرَةِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-mā yadhkurūna ʾillā ʾan yashāʾa llāhu huwa ʾahlu t-taqwā wa-ʾahlu l-maghfirati\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And they will not remember unless Allah wishes.\n" +
                    "He is worthy of [your] being wary [of Him]\n" +
                    "and He is worthy to forgive.");
        }
        else if (surahName.equals("75. Al-Qiyamah"))
        {
            setTitle("Al-Qiyamah(القيامة) : Resurrection");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "لا أُقسِمُ بِيَومِ القِيامَةِ\n" +
                    "TRANSLITERATION\n" +
                    "lā ʾuqsimu bi-yawmi l-qiyāmati\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "I swear by the Day of Resurrection!");
            ayat.add("2\n" +
                    "وَلا أُقسِمُ بِالنَّفسِ اللَّوّامَةِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-lā ʾuqsimu bi-n-nafsi l-lawwāmati\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And I swear by the self-blaming soul!");
            ayat.add("3\n" +
                    "أَيَحسَبُ الإِنسانُ أَلَّن نَجمَعَ عِظامَهُ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-yaḥsabu l-ʾinsānu ʾal-lan najmaʿa ʿiẓāmahū\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Does man suppose\n" +
                    "that We shall not put together his bones?");
            ayat.add("4\n" +
                    "بَلىٰ قادِرينَ عَلىٰ أَن نُسَوِّيَ بَنانَهُ\n" +
                    "TRANSLITERATION\n" +
                    "balā qādirīna ʿalā ʾan nusawwiya banānahū\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Yes indeed,\n" +
                    "We are able to proportion [even] his fingertips!");
            ayat.add("5\n" +
                    "بَل يُريدُ الإِنسانُ لِيَفجُرَ أَمامَهُ\n" +
                    "TRANSLITERATION\n" +
                    "bal yurīdu l-ʾinsānu li-yafjura ʾamāmahū\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Rather man desires to go on living viciously.");
            ayat.add("6\n" +
                    "يَسأَلُ أَيّانَ يَومُ القِيامَةِ\n" +
                    "TRANSLITERATION\n" +
                    "yasʾalu ʾayyāna yawmu l-qiyāmati\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "He asks, ‘When is this day of resurrection?!’");
            ayat.add("7\n" +
                    "فَإِذا بَرِقَ البَصَرُ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾidhā bariqa l-baṣaru\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "But when the eyes are dazzled,");
            ayat.add("8\n" +
                    "وَخَسَفَ القَمَرُ\n" +
                    "TRANSLITERATION\n" +
                    "wa-khasafa l-qamaru\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and the moon is eclipsed,");
            ayat.add("9\n" +
                    "وَجُمِعَ الشَّمسُ وَالقَمَرُ\n" +
                    "TRANSLITERATION\n" +
                    "wa-jumiʿa sh-shamsu wa-l-qamaru\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and the sun and the moon are brought together,");
            ayat.add("10\n" +
                    "يَقولُ الإِنسانُ يَومَئِذٍ أَينَ المَفَرُّ\n" +
                    "TRANSLITERATION\n" +
                    "yaqūlu l-ʾinsānu yawmaʾidhin ʾayna l-mafarru\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "that day man will say,\n" +
                    "‘Where is the escape?’");
            ayat.add("11\n" +
                    "كَلّا لا وَزَرَ\n" +
                    "TRANSLITERATION\n" +
                    "kallā lā wazara\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "No indeed! There is no refuge!");
            ayat.add("12\n" +
                    "إِلىٰ رَبِّكَ يَومَئِذٍ المُستَقَرُّ\n" +
                    "TRANSLITERATION\n" +
                    "ʾilā rabbika yawmaʾidhin-i l-mustaqarru\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "That day the abode will be toward your Lord.");
            ayat.add("13\n" +
                    "يُنَبَّأُ الإِنسانُ يَومَئِذٍ بِما قَدَّمَ وَأَخَّرَ\n" +
                    "TRANSLITERATION\n" +
                    "yunabbaʾu l-ʾinsānu yawmaʾidhin bi-mā qaddama wa-ʾakhkhara\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "That day man will be informed\n" +
                    "about what he has sent ahead and left behind.");
            ayat.add("14\n" +
                    "بَلِ الإِنسانُ عَلىٰ نَفسِهِ بَصيرَةٌ\n" +
                    "TRANSLITERATION\n" +
                    "bali l-ʾinsānu ʿalā nafsihī baṣīratun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Rather man is a witness to himself,");
            ayat.add("15\n" +
                    "وَلَو أَلقىٰ مَعاذيرَهُ\n" +
                    "TRANSLITERATION\n" +
                    "wa-law ʾalqā maʿādhīrahū\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "though he should offer his excuses.");
            ayat.add("16\n" +
                    "لا تُحَرِّك بِهِ لِسانَكَ لِتَعجَلَ بِهِ\n" +
                    "TRANSLITERATION\n" +
                    "lā tuḥarrik bihī lisānaka li-taʿjala bihī\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Do not move your tongue with it to hasten it.");
            ayat.add("17\n" +
                    "إِنَّ عَلَينا جَمعَهُ وَقُرآنَهُ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna ʿalaynā jamʿahū wa-qurʾānahū\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed it is up to Us to put it together\n" +
                    "and to recite it.");
            ayat.add("18\n" +
                    "فَإِذا قَرَأناهُ فَاتَّبِع قُرآنَهُ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾidhā qaraʾnāhu fa-ttabiʿ qurʾānahū\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And when We have recited it, follow its recitation.");
            ayat.add("19\n" +
                    "ثُمَّ إِنَّ عَلَينا بَيانَهُ\n" +
                    "TRANSLITERATION\n" +
                    "thumma ʾinna ʿalaynā bayānahū\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Then, its exposition indeed [also] lies with Us.");
            ayat.add("20\n" +
                    "كَلّا بَل تُحِبّونَ العاجِلَةَ\n" +
                    "TRANSLITERATION\n" +
                    "kallā bal tuḥibbūna l-ʿājilata\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "No Indeed! Rather you love this transitory life");
            ayat.add("21\n" +
                    "وَتَذَرونَ الآخِرَةَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-tadharūna l-ʾākhirata\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and forsake the Hereafter.");
            ayat.add("22\n" +
                    "وُجوهٌ يَومَئِذٍ ناضِرَةٌ\n" +
                    "TRANSLITERATION\n" +
                    "wujūhun yawmaʾidhin nāḍiratun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Some faces will be fresh on that day,");
            ayat.add("23\n" +
                    "إِلىٰ رَبِّها ناظِرَةٌ\n" +
                    "TRANSLITERATION\n" +
                    "ʾilā rabbihā nāẓiratun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "looking at their Lord,");
            ayat.add("24\n" +
                    "وَوُجوهٌ يَومَئِذٍ باسِرَةٌ\n" +
                    "TRANSLITERATION\n" +
                    "wa-wujūhun yawmaʾidhin bāsiratun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and some faces will be scowling on that day,");
            ayat.add("25\n" +
                    "تَظُنُّ أَن يُفعَلَ بِها فاقِرَةٌ\n" +
                    "TRANSLITERATION\n" +
                    "taẓunnu ʾan yufʿala bihā fāqiratun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "knowing that they will be dealt out\n" +
                    "a punishment breaking the spine.");
            ayat.add("26\n" +
                    "كَلّا إِذا بَلَغَتِ التَّراقِيَ\n" +
                    "TRANSLITERATION\n" +
                    "kallā ʾidhā balaghati t-tarāqiya\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "No indeed!\n" +
                    "When the soul reaches up to the collar bones,");
            ayat.add("27\n" +
                    "وَقيلَ مَن ۜ راقٍ\n" +
                    "TRANSLITERATION\n" +
                    "wa-qīla man rāqin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and it is said, ‘Who will take him up?’");
            ayat.add("28\n" +
                    "وَظَنَّ أَنَّهُ الفِراقُ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ẓanna ʾannahu l-firāqu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and he knows that it is the [time of] parting,");
            ayat.add("29\n" +
                    "وَالتَفَّتِ السّاقُ بِالسّاقِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ltaffati s-sāqu bi-s-sāqi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and each shank clasps the other shank,");
            ayat.add("30\n" +
                    "إِلىٰ رَبِّكَ يَومَئِذٍ المَساقُ\n" +
                    "TRANSLITERATION\n" +
                    "ʾilā rabbika yawmaʾidhin-i l-masāqu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "that day he shall be driven toward your Lord.");
            ayat.add("31\n" +
                    "فَلا صَدَّقَ وَلا صَلّىٰ\n" +
                    "TRANSLITERATION\n" +
                    "fa-lā ṣaddaqa wa-lā ṣallā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "He neither confirmed [the truth], nor prayed,");
            ayat.add("32\n" +
                    "وَلٰكِن كَذَّبَ وَتَوَلّىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-lākin kadhdhaba wa-tawallā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "but denied [it] and turned away,");
            ayat.add("33\n" +
                    "ثُمَّ ذَهَبَ إِلىٰ أَهلِهِ يَتَمَطّىٰ\n" +
                    "TRANSLITERATION\n" +
                    "thumma dhahaba ʾilā ʾahlihī yatamaṭṭā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and went swaggering to his family.");
            ayat.add("34\n" +
                    "أَولىٰ لَكَ فَأَولىٰ\n" +
                    "TRANSLITERATION\n" +
                    "ʾawlā laka fa-ʾawlā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So woe to you! Woe to you!");
            ayat.add("35\n" +
                    "ثُمَّ أَولىٰ لَكَ فَأَولىٰ\n" +
                    "TRANSLITERATION\n" +
                    "thumma ʾawlā laka fa-ʾawlā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Again, woe to you! Woe to you!");
            ayat.add("36\n" +
                    "أَيَحسَبُ الإِنسانُ أَن يُترَكَ سُدًى\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-yaḥsabu l-ʾinsānu ʾan yutraka sudan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Does man suppose\n" +
                    "that he would be abandoned to futility?");
            ayat.add("37\n" +
                    "أَلَم يَكُ نُطفَةً مِن مَنِيٍّ يُمنىٰ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-lam yaku nuṭfatan min maniyyin yumnā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Was he not a drop of emitted semen?");
            ayat.add("38\n" +
                    "ثُمَّ كانَ عَلَقَةً فَخَلَقَ فَسَوّىٰ\n" +
                    "TRANSLITERATION\n" +
                    "thumma kāna ʿalaqatan fa-khalaqa fa-sawwā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Then he became a clinging mass;\n" +
                    "then He created [him] and proportioned [him],");
            ayat.add("39\n" +
                    "فَجَعَلَ مِنهُ الزَّوجَينِ الذَّكَرَ وَالأُنثىٰ\n" +
                    "TRANSLITERATION\n" +
                    "fa-jaʿala minhu z-zawjayni dh-dhakara wa-l-ʾunthā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and made of him the two sexes,\n" +
                    "the male and the female.");
            ayat.add("40\n" +
                    "أَلَيسَ ذٰلِكَ بِقادِرٍ عَلىٰ أَن يُحيِيَ المَوتىٰ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-laysa dhālika bi-qādirin ʿalā ʾan yuḥyiya l-mawtā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Is not such a one able\n" +
                    "to revive the dead?");
        }
        else if (surahName.equals("76. Al-Insan"))
        {
            setTitle("Al-Insan(الانسان) : Man");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "هَل أَتىٰ عَلَى الإِنسانِ حينٌ مِنَ الدَّهرِ لَم يَكُن شَيئًا مَذكورًا\n" +
                    "TRANSLITERATION\n" +
                    "hal ʾatā ʿalā l-ʾinsāni ḥīnun mina d-dahri lam yakun shayʾan madhkūran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Has there been for man a period of time\n" +
                    "when he was not anything worthy of mention?");
            ayat.add("2\n" +
                    "إِنّا خَلَقنَا الإِنسانَ مِن نُطفَةٍ أَمشاجٍ نَبتَليهِ فَجَعَلناهُ سَميعًا بَصيرًا\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnā khalaqnā l-ʾinsāna min nuṭfatin ʾamshājin nabtalīhi fa-jaʿalnāhu samīʿan baṣīran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed We created man\n" +
                    "from the drop of a mixed fluid1\n" +
                    "so that We may test him.\n" +
                    "So We made him endowed with hearing and sight.");
            ayat.add("3\n" +
                    "إِنّا هَدَيناهُ السَّبيلَ إِمّا شاكِرًا وَإِمّا كَفورًا\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnā hadaynāhu s-sabīla ʾimmā shākiran wa-ʾimmā kafūran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed We have guided him to the way,\n" +
                    "be he grateful or ungrateful.");
            ayat.add("4\n" +
                    "إِنّا أَعتَدنا لِلكافِرينَ سَلاسِلَ وَأَغلالًا وَسَعيرًا\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnā ʾaʿtadnā li-l-kāfirīna salāsila wa-ʾaghlālan wa-saʿīran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed We have prepared for the faithless\n" +
                    "chains, iron collars, and a blaze.");
            ayat.add("5\n" +
                    "إِنَّ الأَبرارَ يَشرَبونَ مِن كَأسٍ كانَ مِزاجُها كافورًا\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna l-ʾabrāra yashrabūna min kaʾsin kāna mizājuhā kāfūran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed the pious will drink from a cup\n" +
                    "seasoned with Kāfūr,");
            ayat.add("6\n" +
                    "عَينًا يَشرَبُ بِها عِبادُ اللَّهِ يُفَجِّرونَها تَفجيرًا\n" +
                    "TRANSLITERATION\n" +
                    "ʿaynan yashrabu bihā ʿibādu llāhi yufajjirūnahā tafjīran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "a spring where the servants of Allah drink,\n" +
                    "which they make to gush forth as they please.");
            ayat.add("7\n" +
                    "يوفونَ بِالنَّذرِ وَيَخافونَ يَومًا كانَ شَرُّهُ مُستَطيرًا\n" +
                    "TRANSLITERATION\n" +
                    "yūfūna bi-n-nadhri wa-yakhāfūna yawman kāna sharruhū mustaṭīran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They fulfill their vows\n" +
                    "and fear a day\n" +
                    "whose ill will be widespread.");
            ayat.add("8\n" +
                    "وَيُطعِمونَ الطَّعامَ عَلىٰ حُبِّهِ مِسكينًا وَيَتيمًا وَأَسيرًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-yuṭʿimūna ṭ-ṭaʿāma ʿalā ḥubbihī miskīnan wa-yatīman wa-ʾasīran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They give food, for the love of Him,\n" +
                    "to the needy, the orphan and the prisoner,");
            ayat.add("9\n" +
                    "إِنَّما نُطعِمُكُم لِوَجهِ اللَّهِ لا نُريدُ مِنكُم جَزاءً وَلا شُكورًا\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnamā nuṭʿimukum li-wajhi llāhi lā nurīdu minkum jazāʾan wa-lā shukūran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "[saying,] ‘We feed you only for the sake of Allah.\n" +
                    "We do not want any reward from you\n" +
                    "nor any thanks.");
            ayat.add("10\n" +
                    "إِنّا نَخافُ مِن رَبِّنا يَومًا عَبوسًا قَمطَريرًا\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnā nakhāfu min rabbinā yawman ʿabūsan qamṭarīran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed we fear from our Lord a day,\n" +
                    "frowning and fateful.’");
            ayat.add("11\n" +
                    "فَوَقاهُمُ اللَّهُ شَرَّ ذٰلِكَ اليَومِ وَلَقّاهُم نَضرَةً وَسُرورًا\n" +
                    "TRANSLITERATION\n" +
                    "fa-waqāhumu llāhu sharra dhālika l-yawmi wa-laqqāhum naḍratan wa-surūran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So Allah saved them from the ills of that day,\n" +
                    "and granted them freshness and joy.");
            ayat.add("12\n" +
                    "وَجَزاهُم بِما صَبَروا جَنَّةً وَحَريرًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-jazāhum bi-mā ṣabarū jannatan wa-ḥarīran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And He rewarded them for their patience\n" +
                    "with a garden and [garments of] silk,");
            ayat.add("13\n" +
                    "مُتَّكِئينَ فيها عَلَى الأَرائِكِ ۖ لا يَرَونَ فيها شَمسًا وَلا زَمهَريرًا\n" +
                    "TRANSLITERATION\n" +
                    "muttakiʾīna fīhā ʿalā l-ʾarāʾiki lā yarawna fīhā shamsan wa-lā zamharīran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "reclining therein on couches.\n" +
                    "They will find in it neither any [scorching] sun,\n" +
                    "nor any [biting] cold.");
            ayat.add("14\n" +
                    "وَدانِيَةً عَلَيهِم ظِلالُها وَذُلِّلَت قُطوفُها تَذليلًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-dāniyatan ʿalayhim ẓilāluhā wa-dhullilat quṭūfuhā tadhlīlan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Its shades will be close over them\n" +
                    "and its clusters [of fruits] will be hanging low.");
            ayat.add("15\n" +
                    "وَيُطافُ عَلَيهِم بِآنِيَةٍ مِن فِضَّةٍ وَأَكوابٍ كانَت قَواريرا\n" +
                    "TRANSLITERATION\n" +
                    "wa-yuṭāfu ʿalayhim bi-ʾāniyatin min fiḍḍatin wa-ʾakwābin kānat qawārīra\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They will be served around with vessels of silver\n" +
                    "and goblets of crystal");
            ayat.add("16\n" +
                    "قَواريرَ مِن فِضَّةٍ قَدَّروها تَقديرًا\n" +
                    "TRANSLITERATION\n" +
                    "qawārīra min fiḍḍatin qaddarūhā taqdīran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "—crystal of silver—1\n" +
                    "[from] which they dispense in a precise measure.");
            ayat.add("17\n" +
                    "وَيُسقَونَ فيها كَأسًا كانَ مِزاجُها زَنجَبيلًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-yusqawna fīhā kaʾsan kāna mizājuhā zanjabīlan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They will be served therein with a cup of a drink\n" +
                    "seasoned with Zanjabīl,");
            ayat.add("18\n" +
                    "عَينًا فيها تُسَمّىٰ سَلسَبيلًا\n" +
                    "TRANSLITERATION\n" +
                    "ʿaynan fīhā tusammā salsabīlan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "a spring in it, named Salsabīl.");
            ayat.add("19\n" +
                    "۞ وَيَطوفُ عَلَيهِم وِلدانٌ مُخَلَّدونَ إِذا رَأَيتَهُم حَسِبتَهُم لُؤلُؤًا مَنثورًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-yaṭūfu ʿalayhim wildānun mukhalladūna ʾidhā raʾaytahum ḥasibtahum luʾluʾan manthūran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They will be waited upon by immortal youths,\n" +
                    "whom, when you see them,\n" +
                    "you will suppose them to be scattered pearls.");
            ayat.add("20\n" +
                    "وَإِذا رَأَيتَ ثَمَّ رَأَيتَ نَعيمًا وَمُلكًا كَبيرًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾidhā raʾayta thamma raʾayta naʿīman wa-mulkan kabīran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "As you look,\n" +
                    "you will see there bliss and a great kingdom.");
            ayat.add("21\n" +
                    "عالِيَهُم ثِيابُ سُندُسٍ خُضرٌ وَإِستَبرَقٌ ۖ وَحُلّوا أَساوِرَ مِن فِضَّةٍ وَسَقاهُم رَبُّهُم شَرابًا طَهورًا\n" +
                    "TRANSLITERATION\n" +
                    "ʿāliyahum thiyābu sundusin khuḍrun wa-ʾistabraqun wa-ḥullū ʾasāwira min fiḍḍatin wa-saqāhum rabbuhum sharāban ṭahūran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Upon them will be cloaks of green silk\n" +
                    "and brocade\n" +
                    "and they will be adorned with bracelets of silver.\n" +
                    "Their Lord will give them to drink a pure drink.");
            ayat.add("22\n" +
                    "إِنَّ هٰذا كانَ لَكُم جَزاءً وَكانَ سَعيُكُم مَشكورًا\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna hādhā kāna lakum jazāʾan wa-kāna saʿyukum mashkūran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "[They will be told]: ‘This is indeed your reward,\n" +
                    "and your endeavour has been well-appreciated.’");
            ayat.add("23\n" +
                    "إِنّا نَحنُ نَزَّلنا عَلَيكَ القُرآنَ تَنزيلًا\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnā naḥnu nazzalnā ʿalayka l-qurʾāna tanzīlan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed We have sent down to you the Qurʾān\n" +
                    "in a gradual descent.");
            ayat.add("24\n" +
                    "فَاصبِر لِحُكمِ رَبِّكَ وَلا تُطِع مِنهُم آثِمًا أَو كَفورًا\n" +
                    "TRANSLITERATION\n" +
                    "fa-ṣbir li-ḥukmi rabbika wa-lā tuṭiʿ minhum ʾāthiman ʾaw kafūran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So submit patiently to the judgement of your Lord,\n" +
                    "and do not obey any sinner or ingrate among them,");
            ayat.add("25\n" +
                    "وَاذكُرِ اسمَ رَبِّكَ بُكرَةً وَأَصيلًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-dhkuri sma rabbika bukratan wa-ʾaṣīlan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and celebrate the Name of your Lord\n" +
                    "morning and evening,");
            ayat.add("26\n" +
                    "وَمِنَ اللَّيلِ فَاسجُد لَهُ وَسَبِّحهُ لَيلًا طَويلًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-mina l-layli fa-sjud lahū wa-sabbiḥhu laylan ṭawīlan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and worship Him for a watch of the night\n" +
                    "and glorify Him the night long.");
            ayat.add("27\n" +
                    "إِنَّ هٰؤُلاءِ يُحِبّونَ العاجِلَةَ وَيَذَرونَ وَراءَهُم يَومًا ثَقيلًا\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna hāʾulāʾi yuḥibbūna l-ʿājilata wa-yadharūna warāʾahum yawman thaqīlan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed they love this transitory life,\n" +
                    "and disregard a weighty day ahead of them.");
            ayat.add("28\n" +
                    "نَحنُ خَلَقناهُم وَشَدَدنا أَسرَهُم ۖ وَإِذا شِئنا بَدَّلنا أَمثالَهُم تَبديلًا\n" +
                    "TRANSLITERATION\n" +
                    "naḥnu khalaqnāhum wa-shadadnā ʾasrahum wa-ʾidhā shiʾnā baddalnā ʾamthālahum tabdīlan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "We created them and made their joints firm,\n" +
                    "and whenever We like\n" +
                    "We will replace them with others like them.");
            ayat.add("29\n" +
                    "إِنَّ هٰذِهِ تَذكِرَةٌ ۖ فَمَن شاءَ اتَّخَذَ إِلىٰ رَبِّهِ سَبيلًا\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna hādhihī tadhkiratun fa-man shāʾa ttakhadha ʾilā rabbihī sabīlan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "This is indeed a reminder.\n" +
                    "So let anyone who wishes take the way toward his Lord.");
            ayat.add("30\n" +
                    "وَما تَشاءونَ إِلّا أَن يَشاءَ اللَّهُ ۚ إِنَّ اللَّهَ كانَ عَليمًا حَكيمًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-mā tashāʾūna ʾillā ʾan yashāʾa llāhu ʾinna llāha kāna ʿalīman ḥakīman\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "But you do not wish\n" +
                    "unless it is wished by Allah.\n" +
                    "Indeed Allah is all-knowing, all-wise.");
            ayat.add("31\n" +
                    "يُدخِلُ مَن يَشاءُ في رَحمَتِهِ ۚ وَالظّالِمينَ أَعَدَّ لَهُم عَذابًا أَليمًا\n" +
                    "TRANSLITERATION\n" +
                    "yudkhilu man yashāʾu fī raḥmatihī wa-ẓ-ẓālimīna ʾaʿadda lahum ʿadhāban ʾalīman\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "He admits whomever He wishes into His mercy,\n" +
                    "and as for the wrongdoers,\n" +
                    "He has prepared for them a painful punishment.");
        }
        else if (surahName.equals("77. Al-Mursalat"))
        {
            setTitle("Al-Mursalat(المرسلات) : The Emissaries");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "وَالمُرسَلاتِ عُرفًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-l-mursalāti ʿurfan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "By the successive emissaries,");
            ayat.add("2\n" +
                    "فَالعاصِفاتِ عَصفًا\n" +
                    "TRANSLITERATION\n" +
                    "fa-l-ʿāṣifāti ʿaṣfan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "by the raging hurricanes,");
            ayat.add("3\n" +
                    "وَالنّاشِراتِ نَشرًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-n-nāshirāti nashran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "by the sweeping spreaders,");
            ayat.add("4\n" +
                    "فَالفارِقاتِ فَرقًا\n" +
                    "TRANSLITERATION\n" +
                    "fa-l-fāriqāti farqan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "by the decisive separators,");
            ayat.add("5\n" +
                    "فَالمُلقِياتِ ذِكرًا\n" +
                    "TRANSLITERATION\n" +
                    "fa-l-mulqiyāti dhikran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "by the inspirers of remembrance,");
            ayat.add("6\n" +
                    "عُذرًا أَو نُذرًا\n" +
                    "TRANSLITERATION\n" +
                    "ʿudhran ʾaw nudhran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "to excuse or to warn");
            ayat.add("7\n" +
                    "إِنَّما توعَدونَ لَواقِعٌ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnamā tūʿadūna la-wāqiʿun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "indeed what you are promised will surely befall.");
            ayat.add("8\n" +
                    "فَإِذَا النُّجومُ طُمِسَت\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾidhā n-nujūmu ṭumisat\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So when the stars are blotted out,");
            ayat.add("9\n" +
                    "وَإِذَا السَّماءُ فُرِجَت\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾidhā s-samāʾu furijat\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and when the sky is split,");
            ayat.add("10\n" +
                    "وَإِذَا الجِبالُ نُسِفَت\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾidhā l-jibālu nusifat\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and when the mountains are scattered1 [like dust],");
            ayat.add("11\n" +
                    "وَإِذَا الرُّسُلُ أُقِّتَت\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾidhā r-rusulu ʾuqqitat\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and when the time is set for the apostles [to witness]");
            ayat.add("12\n" +
                    "لِأَيِّ يَومٍ أُجِّلَت\n" +
                    "TRANSLITERATION\n" +
                    "li-ʾayyi yawmin ʾujjilat\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "for what day has [all] that been set [to occur]?");
            ayat.add("13\n" +
                    "لِيَومِ الفَصلِ\n" +
                    "TRANSLITERATION\n" +
                    "li-yawmi l-faṣli\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "For the Day of Judgement!");
            ayat.add("14\n" +
                    "وَما أَدراكَ ما يَومُ الفَصلِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-mā ʾadrāka mā yawmu l-faṣli\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And what will show you what is the Day of Judgement!");
            ayat.add("15\n" +
                    "وَيلٌ يَومَئِذٍ لِلمُكَذِّبينَ\n" +
                    "TRANSLITERATION\n" +
                    "waylun yawmaʾidhin li-l-mukadhdhibīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Woe to the deniers on that day!");
            ayat.add("16\n" +
                    "أَلَم نُهلِكِ الأَوَّلينَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-lam nuhliki l-ʾawwalīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Did We not destroy the ancients,");
            ayat.add("17\n" +
                    "ثُمَّ نُتبِعُهُمُ الآخِرينَ\n" +
                    "TRANSLITERATION\n" +
                    "thumma nutbiʿuhumu l-ʾākhirīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "[and] then made the latter ones follow them?");
            ayat.add("18\n" +
                    "كَذٰلِكَ نَفعَلُ بِالمُجرِمينَ\n" +
                    "TRANSLITERATION\n" +
                    "ka-dhālika nafʿalu bi-l-mujrimīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "That is how We deal with the guilty.");
            ayat.add("19\n" +
                    "وَيلٌ يَومَئِذٍ لِلمُكَذِّبينَ\n" +
                    "TRANSLITERATION\n" +
                    "waylun yawmaʾidhin li-l-mukadhdhibīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Woe to the deniers on that day!");
            ayat.add("20\n" +
                    "أَلَم نَخلُقكُم مِن ماءٍ مَهينٍ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-lam nakhluqkum min māʾin mahīnin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Have We not created you from a base fluid,");
            ayat.add("21\n" +
                    "فَجَعَلناهُ في قَرارٍ مَكينٍ\n" +
                    "TRANSLITERATION\n" +
                    "fa-jaʿalnāhu fī qarārin makīnin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "[and] then lodged it in a secure abode");
            ayat.add("22\n" +
                    "إِلىٰ قَدَرٍ مَعلومٍ\n" +
                    "TRANSLITERATION\n" +
                    "ʾilā qadarin maʿlūmin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "until a known span [of time]?");
            ayat.add("23\n" +
                    "فَقَدَرنا فَنِعمَ القادِرونَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-qadarnā fa-niʿma l-qādirūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Then We designed;\n" +
                    "so how excellent designers We are!");
            ayat.add("24\n" +
                    "وَيلٌ يَومَئِذٍ لِلمُكَذِّبينَ\n" +
                    "TRANSLITERATION\n" +
                    "waylun yawmaʾidhin li-l-mukadhdhibīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Woe to the deniers on that day!");
            ayat.add("25\n" +
                    "أَلَم نَجعَلِ الأَرضَ كِفاتًا\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-lam najʿali l-ʾarḍa kifātan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Have We not made the earth a receptacle");
            ayat.add("26\n" +
                    "أَحياءً وَأَمواتًا\n" +
                    "TRANSLITERATION\n" +
                    "ʾaḥyāʾan wa-ʾamwātan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "for the living and the dead,");
            ayat.add("27\n" +
                    "وَجَعَلنا فيها رَواسِيَ شامِخاتٍ وَأَسقَيناكُم ماءً فُراتًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-jaʿalnā fīhā rawāsiya shāmikhātin wa-ʾasqaynākum māʾan furātan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and set in it lofty [and] firm mountains,\n" +
                    "and given you agreeable water to drink?");
            ayat.add("28\n" +
                    "وَيلٌ يَومَئِذٍ لِلمُكَذِّبينَ\n" +
                    "TRANSLITERATION\n" +
                    "waylun yawmaʾidhin li-l-mukadhdhibīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Woe to the deniers on that day!");
            ayat.add("29\n" +
                    "انطَلِقوا إِلىٰ ما كُنتُم بِهِ تُكَذِّبونَ\n" +
                    "TRANSLITERATION\n" +
                    "inṭaliqū ʾilā mā kuntum bihī tukadhdhibūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "[They will be told]:\n" +
                    "‘Get off toward what you used to deny!");
            ayat.add("30\n" +
                    "انطَلِقوا إِلىٰ ظِلٍّ ذي ثَلاثِ شُعَبٍ\n" +
                    "TRANSLITERATION\n" +
                    "inṭaliqū ʾilā ẓillin dhī thalāthi shuʿabin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Get off toward the triple-forked shadow,");
            ayat.add("31\n" +
                    "لا ظَليلٍ وَلا يُغني مِنَ اللَّهَبِ\n" +
                    "TRANSLITERATION\n" +
                    "lā ẓalīlin wa-lā yughnī mina l-lahabi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "which is neither shady\n" +
                    "nor is of any avail against the flame.");
            ayat.add("32\n" +
                    "إِنَّها تَرمي بِشَرَرٍ كَالقَصرِ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnahā tarmī bi-shararin ka-l-qaṣri\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed it throws up sparks [huge] like palaces,");
            ayat.add("33\n" +
                    "كَأَنَّهُ جِمالَتٌ صُفرٌ\n" +
                    "TRANSLITERATION\n" +
                    "ka-ʾannahū jimālatun ṣufrun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "[bright] as if they were yellow camels.");
            ayat.add("34\n" +
                    "وَيلٌ يَومَئِذٍ لِلمُكَذِّبينَ\n" +
                    "TRANSLITERATION\n" +
                    "waylun yawmaʾidhin li-l-mukadhdhibīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Woe to the deniers on that day!");
            ayat.add("35\n" +
                    "هٰذا يَومُ لا يَنطِقونَ\n" +
                    "TRANSLITERATION\n" +
                    "hādhā yawmu lā yanṭiqūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "This is a day wherein they will not speak,");
            ayat.add("36\n" +
                    "وَلا يُؤذَنُ لَهُم فَيَعتَذِرونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-lā yuʾdhanu lahum fa-yaʿtadhirūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "nor will they be permitted to offer excuses.");
            ayat.add("37\n" +
                    "وَيلٌ يَومَئِذٍ لِلمُكَذِّبينَ\n" +
                    "TRANSLITERATION\n" +
                    "waylun yawmaʾidhin li-l-mukadhdhibīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Woe to the deniers on that day!");
            ayat.add("38\n" +
                    "هٰذا يَومُ الفَصلِ ۖ جَمَعناكُم وَالأَوَّلينَ\n" +
                    "TRANSLITERATION\n" +
                    "hādhā yawmu l-faṣli jamaʿnākum wa-l-ʾawwalīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "‘This is the Day of Judgement.\n" +
                    "We have brought together you and the ancients.");
            ayat.add("39\n" +
                    "فَإِن كانَ لَكُم كَيدٌ فَكيدونِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾin kāna lakum kaydun fa-kīdūni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "If you have any stratagems [left],\n" +
                    "try out your stratagems against Me!’");
            ayat.add("40\n" +
                    "وَيلٌ يَومَئِذٍ لِلمُكَذِّبينَ\n" +
                    "TRANSLITERATION\n" +
                    "waylun yawmaʾidhin li-l-mukadhdhibīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Woe to the deniers on that day!");
            ayat.add("41\n" +
                    "إِنَّ المُتَّقينَ في ظِلالٍ وَعُيونٍ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna l-muttaqīna fī ẓilālin wa-ʿuyūnin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed the Godwary will be amid shades and springs,");
            ayat.add("42\n" +
                    "وَفَواكِهَ مِمّا يَشتَهونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-fawākiha mimmā yashtahūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and fruits, such as they desire.");
            ayat.add("43\n" +
                    "كُلوا وَاشرَبوا هَنيئًا بِما كُنتُم تَعمَلونَ\n" +
                    "TRANSLITERATION\n" +
                    "kulū wa-shrabū hanīʾan bi-mā kuntum taʿmalūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "[They will be told:] ‘Enjoy your food and drink,\n" +
                    "[as a reward] for what you used to do.’");
            ayat.add("44\n" +
                    "إِنّا كَذٰلِكَ نَجزِي المُحسِنينَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnā ka-dhālika najzī l-muḥsinīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Thus indeed do We reward the virtuous.");
            ayat.add("45\n" +
                    "وَيلٌ يَومَئِذٍ لِلمُكَذِّبينَ\n" +
                    "TRANSLITERATION\n" +
                    "waylun yawmaʾidhin li-l-mukadhdhibīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Woe to the deniers on that day!");
            ayat.add("46\n" +
                    "كُلوا وَتَمَتَّعوا قَليلًا إِنَّكُم مُجرِمونَ\n" +
                    "TRANSLITERATION\n" +
                    "kulū wa-tamattaʿū qalīlan ʾinnakum mujrimūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "‘Eat and enjoy a little!\n" +
                    "You are indeed guilty.’");
            ayat.add("47\n" +
                    "وَيلٌ يَومَئِذٍ لِلمُكَذِّبينَ\n" +
                    "TRANSLITERATION\n" +
                    "waylun yawmaʾidhin li-l-mukadhdhibīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Woe to the deniers on that day!");
            ayat.add("48\n" +
                    "وَإِذا قيلَ لَهُمُ اركَعوا لا يَركَعونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾidhā qīla lahumu rkaʿū lā yarkaʿūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "When they are told, ‘Bow down,’\n" +
                    "they do not bow down!");
            ayat.add("49\n" +
                    "وَيلٌ يَومَئِذٍ لِلمُكَذِّبينَ\n" +
                    "TRANSLITERATION\n" +
                    "waylun yawmaʾidhin li-l-mukadhdhibīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Woe to the deniers on that day!");
            ayat.add("50\n" +
                    "فَبِأَيِّ حَديثٍ بَعدَهُ يُؤمِنونَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-bi-ʾayyi ḥadīthin baʿdahū yuʾminūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So what discourse will they believe after this?");
        }
        else if (surahName.equals("78. An-Naba"))
        {
            setTitle("An-Naba(النبإ) : The Tiding");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "عَمَّ يَتَساءَلونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʿamma yatasāʾalūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "What is it about which they question each other?!");
            ayat.add("2\n" +
                    "عَنِ النَّبَإِ العَظيمِ\n" +
                    "TRANSLITERATION\n" +
                    "ʿani n-nabaʾi l-ʿaẓīmi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "[Is it] about the great tiding,");
            ayat.add("3\n" +
                    "الَّذي هُم فيهِ مُختَلِفونَ\n" +
                    "TRANSLITERATION\n" +
                    "alladhī hum fīhi mukhtalifūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "the one about which they differ?");
            ayat.add("4\n" +
                    "كَلّا سَيَعلَمونَ\n" +
                    "TRANSLITERATION\n" +
                    "kallā sa-yaʿlamūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "No indeed! They will soon know!");
            ayat.add("5\n" +
                    "ثُمَّ كَلّا سَيَعلَمونَ\n" +
                    "TRANSLITERATION\n" +
                    "thumma kallā sa-yaʿlamūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Again, no indeed! They will soon know!");
            ayat.add("6\n" +
                    "أَلَم نَجعَلِ الأَرضَ مِهادًا\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-lam najʿali l-ʾarḍa mihādan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Did We not make the earth a resting place?");
            ayat.add("7\n" +
                    "وَالجِبالَ أَوتادًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-l-jibāla ʾawtādan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and the mountains stakes?");
            ayat.add("8\n" +
                    "وَخَلَقناكُم أَزواجًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-khalaqnākum ʾazwājan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and create you in pairs?");
            ayat.add("9\n" +
                    "وَجَعَلنا نَومَكُم سُباتًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-jaʿalnā nawmakum subātan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and make your sleep for rest?");
            ayat.add("10\n" +
                    "وَجَعَلنَا اللَّيلَ لِباسًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-jaʿalnā l-layla libāsan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and make the night a covering?");
            ayat.add("11\n" +
                    "وَجَعَلنَا النَّهارَ مَعاشًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-jaʿalnā n-nahāra maʿāshan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and make the day for livelihood?");
            ayat.add("12\n" +
                    "وَبَنَينا فَوقَكُم سَبعًا شِدادًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-banaynā fawqakum sabʿan shidādan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and build above you the seven mighty heavens?");
            ayat.add("13\n" +
                    "وَجَعَلنا سِراجًا وَهّاجًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-jaʿalnā sirājan wahhājan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and make [the sun for] a radiant lamp?");
            ayat.add("14\n" +
                    "وَأَنزَلنا مِنَ المُعصِراتِ ماءً ثَجّاجًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾanzalnā mina l-muʿṣirāti māʾan thajjājan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and send down water pouring from the rain-clouds,");
            ayat.add("15\n" +
                    "لِنُخرِجَ بِهِ حَبًّا وَنَباتًا\n" +
                    "TRANSLITERATION\n" +
                    "li-nukhrija bihī ḥabban wa-nabātan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "that with it We may bring forth grains and plants,");
            ayat.add("16\n" +
                    "وَجَنّاتٍ أَلفافًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-jannātin ʾalfāfan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and luxuriant gardens?");
            ayat.add("17\n" +
                    "إِنَّ يَومَ الفَصلِ كانَ ميقاتًا\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna yawma l-faṣli kāna mīqātan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed the Day of Judgement is the tryst,");
            ayat.add("18\n" +
                    "يَومَ يُنفَخُ فِي الصّورِ فَتَأتونَ أَفواجًا\n" +
                    "TRANSLITERATION\n" +
                    "yawma yunfakhu fī ṣ-ṣūri fa-taʾtūna ʾafwājan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "the day the Trumpet will be blown,\n" +
                    "and you will come in groups,");
            ayat.add("19\n" +
                    "وَفُتِحَتِ السَّماءُ فَكانَت أَبوابًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-futiḥati s-samāʾu fa-kānat ʾabwāban\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and the sky will be opened\n" +
                    "and become gates,");
            ayat.add("20\n" +
                    "وَسُيِّرَتِ الجِبالُ فَكانَت سَرابًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-suyyirati l-jibālu fa-kānat sarāban\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and the mountains will be set moving\n" +
                    "and become a mirage.");
            ayat.add("21\n" +
                    "إِنَّ جَهَنَّمَ كانَت مِرصادًا\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna jahannama kānat mirṣādan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed hell is an ambush,");
            ayat.add("22\n" +
                    "لِلطّاغينَ مَآبًا\n" +
                    "TRANSLITERATION\n" +
                    "li-ṭ-ṭāghīna maʾāban\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "a resort for the rebels,");
            ayat.add("23\n" +
                    "لابِثينَ فيها أَحقابًا\n" +
                    "TRANSLITERATION\n" +
                    "lābithīna fīhā ʾaḥqāban\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "to reside therein for ages,");
            ayat.add("24\n" +
                    "لا يَذوقونَ فيها بَردًا وَلا شَرابًا\n" +
                    "TRANSLITERATION\n" +
                    "lā yadhūqūna fīhā bardan wa-lā sharāban\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "tasting in it neither any coolness nor drink,");
            ayat.add("25\n" +
                    "إِلّا حَميمًا وَغَسّاقًا\n" +
                    "TRANSLITERATION\n" +
                    "ʾillā hamīman wa-ghassāqan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "except boiling water and pus");
            ayat.add("26\n" +
                    "جَزاءً وِفاقًا\n" +
                    "TRANSLITERATION\n" +
                    "jazāʾan wifāqan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "a fitting requital.");
            ayat.add("27\n" +
                    "إِنَّهُم كانوا لا يَرجونَ حِسابًا\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnahum kānū lā yarjūna ḥisāban\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed they did not expect any reckoning,");
            ayat.add("28\n" +
                    "وَكَذَّبوا بِآياتِنا كِذّابًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-kadhdhabū bi-ʾāyātinā kidhdhāban\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and they denied Our signs mendaciously,");
            ayat.add("29\n" +
                    "وَكُلَّ شَيءٍ أَحصَيناهُ كِتابًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-kulla shayʾin ʾaḥṣaynāhu kitāban\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and We have figured everything in a Book.");
            ayat.add("30\n" +
                    "فَذوقوا فَلَن نَزيدَكُم إِلّا عَذابًا\n" +
                    "TRANSLITERATION\n" +
                    "fa-dhūqū fa-lan nazīdakum ʾillā ʿadhāban\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So [now] taste!\n" +
                    "We shall increase you in nothing but punishment!");
            ayat.add("31\n" +
                    "إِنَّ لِلمُتَّقينَ مَفازًا\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna li-l-muttaqīna mafāzan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed a triumph awaits the Godwary");
            ayat.add("32\n" +
                    "حَدائِقَ وَأَعنابًا\n" +
                    "TRANSLITERATION\n" +
                    "ḥadāʾiqa wa-ʾaʿnāban\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "gardens and vineyards,");
            ayat.add("33\n" +
                    "وَكَواعِبَ أَترابًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-kawāʿiba ʾatrāban\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and buxom maidens of a like age,");
            ayat.add("34\n" +
                    "وَكَأسًا دِهاقًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-kaʾsan dihāqan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and brimming cups.");
            ayat.add("35\n" +
                    "لا يَسمَعونَ فيها لَغوًا وَلا كِذّابًا\n" +
                    "TRANSLITERATION\n" +
                    "lā yasmaʿūna fīhā laghwan wa-lā kidhdhāban\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Therein they shall hear neither vain talk nor lies");
            ayat.add("36\n" +
                    "جَزاءً مِن رَبِّكَ عَطاءً حِسابًا\n" +
                    "TRANSLITERATION\n" +
                    "jazāʾan min rabbika ʿaṭāʾan ḥisāban\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "—a reward from your Lord,\n" +
                    "a bounty sufficing,");
            ayat.add("37\n" +
                    "رَبِّ السَّماواتِ وَالأَرضِ وَما بَينَهُمَا الرَّحمٰنِ ۖ لا يَملِكونَ مِنهُ خِطابًا\n" +
                    "TRANSLITERATION\n" +
                    "rabbi s-samāwāti wa-l-ʾarḍi wa-mā baynahumā r-raḥmāni lā yamlikūna minhu khiṭāban\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "the Lord of the heavens and the earth\n" +
                    "and whatever is between them,\n" +
                    "the All-beneficent,\n" +
                    "whom they will not be able to address");
            ayat.add("38\n" +
                    "يَومَ يَقومُ الرّوحُ وَالمَلائِكَةُ صَفًّا ۖ لا يَتَكَلَّمونَ إِلّا مَن أَذِنَ لَهُ الرَّحمٰنُ وَقالَ صَوابًا\n" +
                    "TRANSLITERATION\n" +
                    "yawma yaqūmu r-rūḥu wa-l-malāʾikatu ṣaffan lā yatakallamūna ʾillā man ʾadhina lahu r-raḥmānu wa-qāla ṣawāban\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "on the day\n" +
                    "when the Spirit and the angels stand\n" +
                    "in an array.\n" +
                    "None shall speak\n" +
                    "except whom the All-beneficent permits\n" +
                    "and who says what is right.");
            ayat.add("39\n" +
                    "ذٰلِكَ اليَومُ الحَقُّ ۖ فَمَن شاءَ اتَّخَذَ إِلىٰ رَبِّهِ مَآبًا\n" +
                    "TRANSLITERATION\n" +
                    "dhālika l-yawmu l-ḥaqqu fa-man shāʾa ttakhadha ʾilā rabbihī maʾāban\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "That is the day of truth.\n" +
                    "So let anyone who wishes take resort with his Lord.");
            ayat.add("40\n" +
                    "إِنّا أَنذَرناكُم عَذابًا قَريبًا يَومَ يَنظُرُ المَرءُ ما قَدَّمَت يَداهُ وَيَقولُ الكافِرُ يا لَيتَني كُنتُ تُرابًا\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnā ʾandharnākum ʿadhāban qarīban yawma yanẓuru l-marʾu mā qaddamat yadāhu wa-yaqūlu l-kāfiru yā-laytanī kuntu turāban\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed We have warned you\n" +
                    "of a punishment near at hand\n" +
                    "—the day when a person will observe1\n" +
                    "what his hands have sent ahead\n" +
                    "and the faithless one will say,\n" +
                    "‘I wish I were dust!’");
        }
        else if (surahName.equals("79. An-Nazi`at"))
        {
            setTitle("An-Nazi`at(النازعات) : The Wresters");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "وَالنّازِعاتِ غَرقًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-n-nāziʿāti gharqan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "By those [angels] who wrest [the soul] violently,");
            ayat.add("2\n" +
                    "وَالنّاشِطاتِ نَشطًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-n-nāshiṭāti nashṭan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "by those who draw [it] out gently,");
            ayat.add("3\n" +
                    "وَالسّابِحاتِ سَبحًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-s-sābiḥāti sabḥan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "by those who swim smoothly,");
            ayat.add("4\n" +
                    "فَالسّابِقاتِ سَبقًا\n" +
                    "TRANSLITERATION\n" +
                    "fa-s-sābiqāti sabqan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "by those who take the lead, racing,");
            ayat.add("5\n" +
                    "فَالمُدَبِّراتِ أَمرًا\n" +
                    "TRANSLITERATION\n" +
                    "fa-l-mudabbirāti ʾamran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "by those who direct the affairs [of creatures]");
            ayat.add("6\n" +
                    "يَومَ تَرجُفُ الرّاجِفَةُ\n" +
                    "TRANSLITERATION\n" +
                    "yawma tarjufu r-rājifatu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "the day when the Quaker quakes");
            ayat.add("7\n" +
                    "تَتبَعُهَا الرّادِفَةُ\n" +
                    "TRANSLITERATION\n" +
                    "tatbaʿuhā r-rādifatu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and is followed by the Successor,");
            ayat.add("8\n" +
                    "قُلوبٌ يَومَئِذٍ واجِفَةٌ\n" +
                    "TRANSLITERATION\n" +
                    "qulūbun yawmaʾidhin wājifatun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "hearts will be trembling on that day,");
            ayat.add("9\n" +
                    "أَبصارُها خاشِعَةٌ\n" +
                    "TRANSLITERATION\n" +
                    "ʾabṣāruhā khāshiʿatun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "bearing a humbled look.");
            ayat.add("10\n" +
                    "يَقولونَ أَإِنّا لَمَردودونَ فِي الحافِرَةِ\n" +
                    "TRANSLITERATION\n" +
                    "yaqūlūna ʾa-ʾinnā la-mardūdūna fī l-ḥāfirati\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They will say,\n" +
                    "‘Are we being returned to our earlier state?");
            ayat.add("11\n" +
                    "أَإِذا كُنّا عِظامًا نَخِرَةً\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-ʾidhā kunnā ʿiẓāman nakhiratan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "What, when we have been decayed bones?!’");
            ayat.add("12\n" +
                    "قالوا تِلكَ إِذًا كَرَّةٌ خاسِرَةٌ\n" +
                    "TRANSLITERATION\n" +
                    "qālū tilka ʾidhan karratun khāsiratun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They will say, ‘This, then, is a ruinous return!’");
            ayat.add("13\n" +
                    "فَإِنَّما هِيَ زَجرَةٌ واحِدَةٌ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾinnamā hiya zajratun wāḥidatun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Yet it will be only a single shout,");
            ayat.add("14\n" +
                    "فَإِذا هُم بِالسّاهِرَةِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾidhā hum bi-s-sāhirati\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and behold, they will be awake.");
            ayat.add("15\n" +
                    "هَل أَتاكَ حَديثُ موسىٰ\n" +
                    "TRANSLITERATION\n" +
                    "hal ʾatāka ḥadīthu mūsā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Did you receive the story of Moses,");
            ayat.add("16\n" +
                    "إِذ ناداهُ رَبُّهُ بِالوادِ المُقَدَّسِ طُوًى\n" +
                    "TRANSLITERATION\n" +
                    "ʾidh nādāhu rabbuhū bi-l-wādi l-muqaddasi ṭuwan-i\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "when his Lord called out to him\n" +
                    "in the holy valley of Ṭuwā?");
            ayat.add("17\n" +
                    "اذهَب إِلىٰ فِرعَونَ إِنَّهُ طَغىٰ\n" +
                    "TRANSLITERATION\n" +
                    "idhhab ʾilā firʿawna ʾinnahū ṭaghā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "[And said,] ‘Go to Pharaoh,\n" +
                    "for indeed he has rebelled,");
            ayat.add("18\n" +
                    "فَقُل هَل لَكَ إِلىٰ أَن تَزَكّىٰ\n" +
                    "TRANSLITERATION\n" +
                    "fa-qul hal laka ʾilā ʾan tazakkā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and say, “Would you purify yourself?");
            ayat.add("19\n" +
                    "وَأَهدِيَكَ إِلىٰ رَبِّكَ فَتَخشىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾahdiyaka ʾilā rabbika fa-takhshā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "I will guide you to your Lord,\n" +
                    "that you may fear [Him]?” ’");
            ayat.add("20\n" +
                    "فَأَراهُ الآيَةَ الكُبرىٰ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾarāhu l-ʾāyata l-kubrā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Then he showed him the greatest sign.");
            ayat.add("21\n" +
                    "فَكَذَّبَ وَعَصىٰ\n" +
                    "TRANSLITERATION\n" +
                    "fa-kadhdhaba wa-ʿaṣā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "But he denied, and disobeyed.");
            ayat.add("22\n" +
                    "ثُمَّ أَدبَرَ يَسعىٰ\n" +
                    "TRANSLITERATION\n" +
                    "thumma ʾadbara yasʿā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Then he turned back, walking swiftly,");
            ayat.add("23\n" +
                    "فَحَشَرَ فَنادىٰ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ḥashara fa-nādā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and mustered [the people] and proclaimed,");
            ayat.add("24\n" +
                    "فَقالَ أَنا رَبُّكُمُ الأَعلىٰ\n" +
                    "TRANSLITERATION\n" +
                    "fa-qāla ʾana rabbukumu l-ʾaʿlā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "saying, ‘I am your exalted lord!’");
            ayat.add("25\n" +
                    "فَأَخَذَهُ اللَّهُ نَكالَ الآخِرَةِ وَالأولىٰ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾakhadhahu llāhu nakāla l-ʾākhirati wa-l-ʾūlā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So Allah seized him\n" +
                    "with the punishment of this life and the Hereafter.");
            ayat.add("26\n" +
                    "إِنَّ في ذٰلِكَ لَعِبرَةً لِمَن يَخشىٰ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna fī dhālika la-ʿibratan li-man yakhshā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "There is indeed a moral in that for someone who fears!");
            ayat.add("27\n" +
                    "أَأَنتُم أَشَدُّ خَلقًا أَمِ السَّماءُ ۚ بَناها\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-ʾantum ʾashaddu khalqan ʾami s-samāʾu banāhā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Is it you whose creation is more prodigious\n" +
                    "or the sky which He has built?");
            ayat.add("28\n" +
                    "رَفَعَ سَمكَها فَسَوّاها\n" +
                    "TRANSLITERATION\n" +
                    "rafaʿa samkahā fa-sawwāhā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "He raised its vault, and fashioned it,");
            ayat.add("29\n" +
                    "وَأَغطَشَ لَيلَها وَأَخرَجَ ضُحاها\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾaghṭasha laylahā wa-ʾakhraja ḍuḥāhā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and darkened its night,\n" +
                    "and brought forth its day");
            ayat.add("30\n" +
                    "وَالأَرضَ بَعدَ ذٰلِكَ دَحاها\n" +
                    "TRANSLITERATION\n" +
                    "wa-l-ʾarḍa baʿda dhālika daḥāhā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and after that He spread out the earth,");
            ayat.add("31\n" +
                    "أَخرَجَ مِنها ماءَها وَمَرعاها\n" +
                    "TRANSLITERATION\n" +
                    "ʾakhraja minhā māʾahā wa-marʿāhā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and brought forth from it its water and pastures,");
            ayat.add("32\n" +
                    "وَالجِبالَ أَرساها\n" +
                    "TRANSLITERATION\n" +
                    "wa-l-jibāla ʾarsāhā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and set firm the mountains,");
            ayat.add("33\n" +
                    "مَتاعًا لَكُم وَلِأَنعامِكُم\n" +
                    "TRANSLITERATION\n" +
                    "matāʿan lakum wa-li-ʾanʿāmikum\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "as a [place of] sustenance for you\n" +
                    "and your livestock.");
            ayat.add("34\n" +
                    "فَإِذا جاءَتِ الطّامَّةُ الكُبرىٰ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾidhā jāʾati ṭ-ṭāmmatu l-kubrā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "When the Greatest Catastrophe befalls,");
            ayat.add("35\n" +
                    "يَومَ يَتَذَكَّرُ الإِنسانُ ما سَعىٰ\n" +
                    "TRANSLITERATION\n" +
                    "yawma yatadhakkaru l-ʾinsānu mā saʿā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "the day when man will remember his endeavours,");
            ayat.add("36\n" +
                    "وَبُرِّزَتِ الجَحيمُ لِمَن يَرىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-burrizati l-jaḥīmu li-man yarā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and hell is brought into view for one who sees,");
            ayat.add("37\n" +
                    "فَأَمّا مَن طَغىٰ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾammā man ṭaghā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "as for him who was rebellious");
            ayat.add("38\n" +
                    "وَآثَرَ الحَياةَ الدُّنيا\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾāthara l-ḥayāta d-dunyā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and preferred the life of this world,");
            ayat.add("39\n" +
                    "فَإِنَّ الجَحيمَ هِيَ المَأوىٰ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾinna l-jaḥīma hiya l-maʾwā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "his refuge will indeed be hell.");
            ayat.add("40\n" +
                    "وَأَمّا مَن خافَ مَقامَ رَبِّهِ وَنَهَى النَّفسَ عَنِ الهَوىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾammā man khāfa maqāma rabbihī wa-nahā n-nafsa ʿani l-hawā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "But as for him who is awed to stand before his Lord\n" +
                    "and forbids the soul from [following] desire,");
            ayat.add("41\n" +
                    "فَإِنَّ الجَنَّةَ هِيَ المَأوىٰ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾinna l-jannata hiya l-maʾwā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "his refuge will indeed be paradise.");
            ayat.add("42\n" +
                    "يَسأَلونَكَ عَنِ السّاعَةِ أَيّانَ مُرساها\n" +
                    "TRANSLITERATION\n" +
                    "yasʾalūnaka ʿani s-sāʿati ʾayyāna mursāhā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They ask you concerning the Hour,\n" +
                    "“When will it set in,");
            ayat.add("43\n" +
                    "فيمَ أَنتَ مِن ذِكراها\n" +
                    "TRANSLITERATION\n" +
                    "fī-ma ʾanta min dhikrāhā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "considering your frequent mention of it?”");
            ayat.add("44\n" +
                    "إِلىٰ رَبِّكَ مُنتَهاها\n" +
                    "TRANSLITERATION\n" +
                    "ʾilā rabbika muntahāhā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Its outcome is with your Lord.");
            ayat.add("45\n" +
                    "إِنَّما أَنتَ مُنذِرُ مَن يَخشاها\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnamā ʾanta mundhiru man yakhshāhā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "You are only a warner for those who fear it.");
            ayat.add("46\n" +
                    "كَأَنَّهُم يَومَ يَرَونَها لَم يَلبَثوا إِلّا عَشِيَّةً أَو ضُحاها\n" +
                    "TRANSLITERATION\n" +
                    "ka-ʾannahum yawma yarawnahā lam yalbathū ʾillā ʿashiyyatan ʾaw ḍuḥāhā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The day they see it, it shall be as if\n" +
                    "they had not stayed [in the world]\n" +
                    "except for an evening or forenoon.");
        }
        else if (surahName.equals("80. `Abasa"))
        {
            setTitle("`Abasa(عبس) : The Frowned");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "عَبَسَ وَتَوَلّىٰ\n" +
                    "TRANSLITERATION\n" +
                    "ʿabasa wa-tawallā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "He frowned and turned away");
            ayat.add("2\n" +
                    "أَن جاءَهُ الأَعمىٰ\n" +
                    "TRANSLITERATION\n" +
                    "ʾan jāʾahu l-ʾaʿmā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "when the blind man approached him.");
            ayat.add("3\n" +
                    "وَما يُدريكَ لَعَلَّهُ يَزَّكّىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-mā yudrīka laʿallahū yazzakkā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And how do you know,\n" +
                    "maybe he would purify himself,");
            ayat.add("4\n" +
                    "أَو يَذَّكَّرُ فَتَنفَعَهُ الذِّكرىٰ\n" +
                    "TRANSLITERATION\n" +
                    "ʾaw yadhdhakkaru fa-tanfaʿahu dh-dhikrā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "or take admonition,\n" +
                    "and the admonition would benefit him!");
            ayat.add("5\n" +
                    "أَمّا مَنِ استَغنىٰ\n" +
                    "TRANSLITERATION\n" +
                    "ʾammā mani staghnā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "But as for someone who is self-complacent,");
            ayat.add("6\n" +
                    "فَأَنتَ لَهُ تَصَدّىٰ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾanta lahū taṣaddā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "you attend to him,");
            ayat.add("7\n" +
                    "وَما عَلَيكَ أَلّا يَزَّكّىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-mā ʿalayka ʾallā yazzakkā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "though you are not liable\n" +
                    "if he does not purify himself.");
            ayat.add("8\n" +
                    "وَأَمّا مَن جاءَكَ يَسعىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾammā man jāʾaka yasʿā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "But he who comes hurrying to you,");
            ayat.add("9\n" +
                    "وَهُوَ يَخشىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-huwa yakhshā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "while he fears [Allah],");
            ayat.add("10\n" +
                    "فَأَنتَ عَنهُ تَلَهّىٰ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾanta ʿanhu talahhā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "you are neglectful of him.");
            ayat.add("11\n" +
                    "كَلّا إِنَّها تَذكِرَةٌ\n" +
                    "TRANSLITERATION\n" +
                    "kallā ʾinnahā tadhkiratun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "No indeed! These [verses of the Qurʾān] are a reminder");
            ayat.add("12\n" +
                    "فَمَن شاءَ ذَكَرَهُ\n" +
                    "TRANSLITERATION\n" +
                    "fa-man shāʾa dhakarahū\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "—so let anyone who wishes remember it");
            ayat.add("13\n" +
                    "في صُحُفٍ مُكَرَّمَةٍ\n" +
                    "TRANSLITERATION\n" +
                    "fī ṣuḥufin mukarramatin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "in honoured scriptures,");
            ayat.add("14\n" +
                    "مَرفوعَةٍ مُطَهَّرَةٍ\n" +
                    "TRANSLITERATION\n" +
                    "marfūʿatin muṭahharatin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "exalted and purified,");
            ayat.add("15\n" +
                    "بِأَيدي سَفَرَةٍ\n" +
                    "TRANSLITERATION\n" +
                    "bi-ʾaydī safaratin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "in the hands of envoys,");
            ayat.add("16\n" +
                    "كِرامٍ بَرَرَةٍ\n" +
                    "TRANSLITERATION\n" +
                    "kirāmin bararatin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "noble and pious.");
            ayat.add("17\n" +
                    "قُتِلَ الإِنسانُ ما أَكفَرَهُ\n" +
                    "TRANSLITERATION\n" +
                    "qutila l-ʾinsānu mā ʾakfarahū\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Perish man! How ungrateful is he!");
            ayat.add("18\n" +
                    "مِن أَيِّ شَيءٍ خَلَقَهُ\n" +
                    "TRANSLITERATION\n" +
                    "min ʾayyi shayʾin khalaqahū\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "From what has He created him?");
            ayat.add("19\n" +
                    "مِن نُطفَةٍ خَلَقَهُ فَقَدَّرَهُ\n" +
                    "TRANSLITERATION\n" +
                    "min nuṭfatin khalaqahū fa-qaddarahū\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "He has created him from a drop of [seminal] fluid,\n" +
                    "and then proportioned him.");
            ayat.add("20\n" +
                    "ثُمَّ السَّبيلَ يَسَّرَهُ\n" +
                    "TRANSLITERATION\n" +
                    "thumma s-sabīla yassarahū\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Then He made the way easy for him;");
            ayat.add("21\n" +
                    "ثُمَّ أَماتَهُ فَأَقبَرَهُ\n" +
                    "TRANSLITERATION\n" +
                    "thumma ʾamātahū fa-ʾaqbarahū\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "then He made him die and buried him;");
            ayat.add("22\n" +
                    "ثُمَّ إِذا شاءَ أَنشَرَهُ\n" +
                    "TRANSLITERATION\n" +
                    "thumma ʾidhā shāʾa ʾansharahū\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and then, when He wished, resurrected him.");
            ayat.add("23\n" +
                    "كَلّا لَمّا يَقضِ ما أَمَرَهُ\n" +
                    "TRANSLITERATION\n" +
                    "kallā lammā yaqḍi mā ʾamarahū\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "No indeed! He has not yet carried out\n" +
                    "what He had commanded him.");
            ayat.add("24\n" +
                    "فَليَنظُرِ الإِنسانُ إِلىٰ طَعامِهِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-l-yanẓuri l-ʾinsānu ʾilā ṭaʿāmihī\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So let man observe his food:");
            ayat.add("25\n" +
                    "أَنّا صَبَبنَا الماءَ صَبًّا\n" +
                    "TRANSLITERATION\n" +
                    "ʾannā ṣababnā l-māʾa ṣabban\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "We poured down water plenteously,");
            ayat.add("26\n" +
                    "ثُمَّ شَقَقنَا الأَرضَ شَقًّا\n" +
                    "TRANSLITERATION\n" +
                    "thumma shaqqaqnā l-ʾarḍa shaqqan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "then We split the earth into fissures");
            ayat.add("27\n" +
                    "فَأَنبَتنا فيها حَبًّا\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾanbatnā fīhā ḥabban\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and made the grain grow in it,");
            ayat.add("28\n" +
                    "وَعِنَبًا وَقَضبًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʿinaban wa-qaḍban\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and vines and vegetables,");
            ayat.add("29\n" +
                    "وَزَيتونًا وَنَخلًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-zaytūnan wa-nakhlan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "olives and date palms,");
            ayat.add("30\n" +
                    "وَحَدائِقَ غُلبًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-ḥadāʾiqa ghulban\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and densely-planted gardens,");
            ayat.add("31\n" +
                    "وَفاكِهَةً وَأَبًّا\n" +
                    "TRANSLITERATION\n" +
                    "wa-fākihatan wa-ʾabban\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "fruits and pastures,");
            ayat.add("32\n" +
                    "مَتاعًا لَكُم وَلِأَنعامِكُم\n" +
                    "TRANSLITERATION\n" +
                    "matāʿan lakum wa-li-ʾanʿāmikum\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "as a sustenance for you and your livestock.");
            ayat.add("33\n" +
                    "فَإِذا جاءَتِ الصّاخَّةُ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾidhā jāʾati ṣ-ṣākhkhatu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So when the deafening Cry comes");
            ayat.add("34\n" +
                    "يَومَ يَفِرُّ المَرءُ مِن أَخيهِ\n" +
                    "TRANSLITERATION\n" +
                    "yawma yafirru l-marʾu min ʾakhīhi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "the day when a man will evade his brother,");
            ayat.add("35\n" +
                    "وَأُمِّهِ وَأَبيهِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾummihī wa-ʾabīhi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "his mother and his father,");
            ayat.add("36\n" +
                    "وَصاحِبَتِهِ وَبَنيهِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ṣāḥibatihī wa-banīhi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "his spouse and his sons");
            ayat.add("37\n" +
                    "لِكُلِّ امرِئٍ مِنهُم يَومَئِذٍ شَأنٌ يُغنيهِ\n" +
                    "TRANSLITERATION\n" +
                    "li-kulli mriʾin minhum yawmaʾidhin shaʾnun yughnīhi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "that day each of them will have\n" +
                    "a task to keep him preoccupied.");
            ayat.add("38\n" +
                    "وُجوهٌ يَومَئِذٍ مُسفِرَةٌ\n" +
                    "TRANSLITERATION\n" +
                    "wujūhun yawmaʾidhin musfiratun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "That day some faces will be bright,");
            ayat.add("39\n" +
                    "ضاحِكَةٌ مُستَبشِرَةٌ\n" +
                    "TRANSLITERATION\n" +
                    "ḍāḥikatun mustabshiratun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "laughing and joyous.");
            ayat.add("40\n" +
                    "وَوُجوهٌ يَومَئِذٍ عَلَيها غَبَرَةٌ\n" +
                    "TRANSLITERATION\n" +
                    "wa-wujūhun yawmaʾidhin ʿalayhā ghabaratun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And some faces on that day\n" +
                    "will be covered with dust,");
            ayat.add("41\n" +
                    "تَرهَقُها قَتَرَةٌ\n" +
                    "TRANSLITERATION\n" +
                    "tarhaquhā qataratun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "overcast with gloom.");
            ayat.add("42\n" +
                    "أُولٰئِكَ هُمُ الكَفَرَةُ الفَجَرَةُ\n" +
                    "TRANSLITERATION\n" +
                    "ʾulāʾika humu l-kafaratu l-fajaratu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "It is they who are the faithless, the vicious.");
        }
        else if (surahName.equals("81. At-Takweer"))
        {
            setTitle("At-Takweer(التكوير) : The Winding Up");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "إِذَا الشَّمسُ كُوِّرَت\n" +
                    "TRANSLITERATION\n" +
                    "ʾidhā sh-shamsu kuwwirat\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "When the sun is wound up,");
            ayat.add("2\n" +
                    "وَإِذَا النُّجومُ انكَدَرَت\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾidhā n-nujūmu nkadarat\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "when the stars scatter,");
            ayat.add("3\n" +
                    "وَإِذَا الجِبالُ سُيِّرَت\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾidhā l-jibālu suyyirat\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "when the mountains are set moving,");
            ayat.add("4\n" +
                    "وَإِذَا العِشارُ عُطِّلَت\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾidhā l-ʿishāru ʿuṭṭilat\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "when the pregnant camels are neglected,");
            ayat.add("5\n" +
                    "وَإِذَا الوُحوشُ حُشِرَت\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾidhā l-wuḥūshu ḥushirat\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "when the wild beasts are mustered,");
            ayat.add("6\n" +
                    "وَإِذَا البِحارُ سُجِّرَت\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾidhā l-biḥāru sujjirat\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "when the seas are set afire,");
            ayat.add("7\n" +
                    "وَإِذَا النُّفوسُ زُوِّجَت\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾidhā n-nufūsu zuwwijat\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "when the souls are assorted,");
            ayat.add("8\n" +
                    "وَإِذَا المَوءودَةُ سُئِلَت\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾidhā l-mawʾūdatu suʾilat\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "when the girl buried-alive will be asked");
            ayat.add("9\n" +
                    "بِأَيِّ ذَنبٍ قُتِلَت\n" +
                    "TRANSLITERATION\n" +
                    "bi-ʾayyi dhanbin qutilat\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "for what sin she was killed.");
            ayat.add("10\n" +
                    "وَإِذَا الصُّحُفُ نُشِرَت\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾidhā ṣ-ṣuḥufu nushirat\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "When the records [of deeds] are unfolded,");
            ayat.add("11\n" +
                    "وَإِذَا السَّماءُ كُشِطَت\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾidhā s-samāʾu kushiṭat\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "when the sky is stripped off,");
            ayat.add("12\n" +
                    "وَإِذَا الجَحيمُ سُعِّرَت\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾidhā l-jaḥīmu suʿʿirat\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "when hell is set ablaze,");
            ayat.add("13\n" +
                    "وَإِذَا الجَنَّةُ أُزلِفَت\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾidhā l-jannatu ʾuzlifat\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "when paradise is brought near,");
            ayat.add("14\n" +
                    "عَلِمَت نَفسٌ ما أَحضَرَت\n" +
                    "TRANSLITERATION\n" +
                    "ʿalimat nafsun mā ʾaḥḍarat\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "then a soul shall know what it has readied [for itself].");
            ayat.add("15\n" +
                    "فَلا أُقسِمُ بِالخُنَّسِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-lā ʾuqsimu bi-l-khunnasi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So I swear by the stars that return,");
            ayat.add("16\n" +
                    "الجَوارِ الكُنَّسِ\n" +
                    "TRANSLITERATION\n" +
                    "al-jawāri l-kunnasi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "the planets that hide,");
            ayat.add("17\n" +
                    "وَاللَّيلِ إِذا عَسعَسَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-l-layli ʾidhā ʿasʿasa\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "by the night as it approaches,");
            ayat.add("18\n" +
                    "وَالصُّبحِ إِذا تَنَفَّسَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ṣ-ṣubḥi ʾidhā tanaffasa\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "by the dawn as it breathes,");
            ayat.add("19\n" +
                    "إِنَّهُ لَقَولُ رَسولٍ كَريمٍ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnahū la-qawlu rasūlin karīmin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "it is indeed the speech of a noble apostle,");
            ayat.add("20\n" +
                    "ذي قُوَّةٍ عِندَ ذِي العَرشِ مَكينٍ\n" +
                    "TRANSLITERATION\n" +
                    "dhī quwwatin ʿinda dhī l-ʿarshi makīnin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "powerful and eminent with the Lord of the Throne,");
            ayat.add("21\n" +
                    "مُطاعٍ ثَمَّ أَمينٍ\n" +
                    "TRANSLITERATION\n" +
                    "muṭāʿin thamma ʾamīnin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "one who is heard and trustworthy as well.");
            ayat.add("22\n" +
                    "وَما صاحِبُكُم بِمَجنونٍ\n" +
                    "TRANSLITERATION\n" +
                    "wa-mā ṣāḥibukum bi-majnūnin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Your companion is not crazy");
            ayat.add("23\n" +
                    "وَلَقَد رَآهُ بِالأُفُقِ المُبينِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-la-qad raʾāhu bi-l-ʾufuqi l-mubīni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "certainly he saw him on the manifest horizon,");
            ayat.add("24\n" +
                    "وَما هُوَ عَلَى الغَيبِ بِضَنينٍ\n" +
                    "TRANSLITERATION\n" +
                    "wa-mā huwa ʿalā l-ghaybi bi-ḍanīnin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and he is not miserly concerning the Unseen.");
            ayat.add("25\n" +
                    "وَما هُوَ بِقَولِ شَيطانٍ رَجيمٍ\n" +
                    "TRANSLITERATION\n" +
                    "wa-mā huwa bi-qawli shayṭānin rajīmin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And it is not the speech of an outcast Satan.");
            ayat.add("26\n" +
                    "فَأَينَ تَذهَبونَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾayna tadhhabūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So where are you going?");
            ayat.add("27\n" +
                    "إِن هُوَ إِلّا ذِكرٌ لِلعالَمينَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾin huwa ʾillā dhikrun li-l-ʿālamīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "It is just a reminder for all the nations,");
            ayat.add("28\n" +
                    "لِمَن شاءَ مِنكُم أَن يَستَقيمَ\n" +
                    "TRANSLITERATION\n" +
                    "li-man shāʾa minkum ʾan yastaqīma\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "for those of you who wish to be steadfast;");
            ayat.add("29\n" +
                    "وَما تَشاءونَ إِلّا أَن يَشاءَ اللَّهُ رَبُّ العالَمينَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-mā tashāʾūna ʾillā ʾan yashāʾa llāhu rabbu l-ʿālamīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "but you do not wish\n" +
                    "unless it is wished by Allah,\n" +
                    "the Lord of all the worlds.");
        }
        else if (surahName.equals("82. Al-Infitar"))
        {
            setTitle("Al-Infitar(الإنفطار) : The Rending");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "إِذَا السَّماءُ انفَطَرَت\n" +
                    "TRANSLITERATION\n" +
                    "ʾidhā s-samāʾu nfaṭarat\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "When the sky is rent apart,");
            ayat.add("2\n" +
                    "وَإِذَا الكَواكِبُ انتَثَرَت\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾidhā l-kawākibu ntatharat\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "when the stars are scattered,");
            ayat.add("3\n" +
                    "وَإِذَا البِحارُ فُجِّرَت\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾidhā l-biḥāru fujjirat\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "when the seas are merged,");
            ayat.add("4\n" +
                    "وَإِذَا القُبورُ بُعثِرَت\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾidhā l-qubūru buʿthirat\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "when the graves are overturned,");
            ayat.add("5\n" +
                    "عَلِمَت نَفسٌ ما قَدَّمَت وَأَخَّرَت\n" +
                    "TRANSLITERATION\n" +
                    "ʿalimat nafsun mā qaddamat wa-ʾakhkharat\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "then a soul shall know what it has sent\n" +
                    "ahead and left behind.");
            ayat.add("6\n" +
                    "يا أَيُّهَا الإِنسانُ ما غَرَّكَ بِرَبِّكَ الكَريمِ\n" +
                    "TRANSLITERATION\n" +
                    "yā-ʾayyuhā l-ʾinsānu mā gharraka bi-rabbika l-karīmi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "O man!\n" +
                    "What has deceived you about your generous Lord,");
            ayat.add("7\n" +
                    "الَّذي خَلَقَكَ فَسَوّاكَ فَعَدَلَكَ\n" +
                    "TRANSLITERATION\n" +
                    "alladhī khalaqaka fa-sawwāka fa-ʿadalaka\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "who created you and proportioned you,\n" +
                    "and gave you an upright nature,");
            ayat.add("8\n" +
                    "في أَيِّ صورَةٍ ما شاءَ رَكَّبَكَ\n" +
                    "TRANSLITERATION\n" +
                    "fī ʾayyi ṣūratin mā shāʾa rakkabaka\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and composed you in any form that He wished?");
            ayat.add("9\n" +
                    "كَلّا بَل تُكَذِّبونَ بِالدّينِ\n" +
                    "TRANSLITERATION\n" +
                    "kallā bal tukadhdhibūna bi-d-dīni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "No indeed! Rather you deny the Retribution.");
            ayat.add("10\n" +
                    "وَإِنَّ عَلَيكُم لَحافِظينَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾinna ʿalaykum la-ḥāfiẓīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed, there are over you watchers,");
            ayat.add("11\n" +
                    "كِرامًا كاتِبينَ\n" +
                    "TRANSLITERATION\n" +
                    "kirāman kātibīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "noble writers");
            ayat.add("12\n" +
                    "يَعلَمونَ ما تَفعَلونَ\n" +
                    "TRANSLITERATION\n" +
                    "yaʿlamūna mā tafʿalūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "who know whatever you do.");
            ayat.add("13\n" +
                    "إِنَّ الأَبرارَ لَفي نَعيمٍ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna l-ʾabrāra la-fī naʿīmin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed the pious shall be amid bliss,");
            ayat.add("14\n" +
                    "وَإِنَّ الفُجّارَ لَفي جَحيمٍ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾinna l-fujjāra la-fī jaḥīmin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and indeed the vicious shall be in hell");
            ayat.add("15\n" +
                    "يَصلَونَها يَومَ الدّينِ\n" +
                    "TRANSLITERATION\n" +
                    "yaṣlawnahā yawma d-dīni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "entering it on the Day of Retribution,");
            ayat.add("16\n" +
                    "وَما هُم عَنها بِغائِبينَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-mā hum ʿanhā bi-ghāʾibīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and they shall not be absent from it.");
            ayat.add("17\n" +
                    "وَما أَدراكَ ما يَومُ الدّينِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-mā ʾadrāka mā yawmu d-dīni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And what will show you\n" +
                    "what is the Day of Retribution?");
            ayat.add("18\n" +
                    "ثُمَّ ما أَدراكَ ما يَومُ الدّينِ\n" +
                    "TRANSLITERATION\n" +
                    "thumma mā ʾadrāka mā yawmu d-dīni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Again, what will show\n" +
                    "you what is the Day of Retribution?");
            ayat.add("19\n" +
                    "يَومَ لا تَملِكُ نَفسٌ لِنَفسٍ شَيئًا ۖ وَالأَمرُ يَومَئِذٍ لِلَّهِ\n" +
                    "TRANSLITERATION\n" +
                    "yawma lā tamliku nafsun li-nafsin shayʾan wa-l-ʾamru yawmaʾidhin li-llāhi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "It is a day\n" +
                    "when no soul will be of any avail to another soul\n" +
                    "and all command that day will belong to Allah.");
        }
        else if (surahName.equals("83. Al-Mutaffifeen"))
        {
            setTitle("Al-Mutaffifeen(المطففين) : The Defrauders");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "وَيلٌ لِلمُطَفِّفينَ\n" +
                    "TRANSLITERATION\n" +
                    "waylun li-l-muṭaffifīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Woe to the defrauders who use short measures,");
            ayat.add("2\n" +
                    "الَّذينَ إِذَا اكتالوا عَلَى النّاسِ يَستَوفونَ\n" +
                    "TRANSLITERATION\n" +
                    "alladhīna ʾidhā ktālū ʿalā n-nāsi yastawfūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "who, when they measure [a commodity bought]\n" +
                    "from the people,\n" +
                    "take the full measure,");
            ayat.add("3\n" +
                    "وَإِذا كالوهُم أَو وَزَنوهُم يُخسِرونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾidhā kālūhum ʾaw wazanūhum yukhsirūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "but diminish when they measure or weigh for them.\n");
            ayat.add("4\n" +
                    "أَلا يَظُنُّ أُولٰئِكَ أَنَّهُم مَبعوثونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-lā yaẓunnu ʾulāʾika ʾannahum mabʿūthūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Do they not know that they will be resurrected");
            ayat.add("5\n" +
                    "لِيَومٍ عَظيمٍ\n" +
                    "TRANSLITERATION\n" +
                    "li-yawmin ʿaẓīmin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "on a tremendous day,");
            ayat.add("6\n" +
                    "يَومَ يَقومُ النّاسُ لِرَبِّ العالَمينَ\n" +
                    "TRANSLITERATION\n" +
                    "yawma yaqūmu n-nāsu li-rabbi l-ʿālamīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "a day when mankind will stand\n" +
                    "before the Lord of all the worlds?");
            ayat.add("7\n" +
                    "كَلّا إِنَّ كِتابَ الفُجّارِ لَفي سِجّينٍ\n" +
                    "TRANSLITERATION\n" +
                    "kallā ʾinna kitāba l-fujjāri la-fī sijjīnin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "No indeed! The record of the vicious is indeed in Sijjīn.");
            ayat.add("8\n" +
                    "وَما أَدراكَ ما سِجّينٌ\n" +
                    "TRANSLITERATION\n" +
                    "wa-mā ʾadrāka mā sijjīnun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And what will show you what is Sijjīn?");
            ayat.add("9\n" +
                    "كِتابٌ مَرقومٌ\n" +
                    "TRANSLITERATION\n" +
                    "kitābun marqūmun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "It is a written record.");
            ayat.add("10\n" +
                    "وَيلٌ يَومَئِذٍ لِلمُكَذِّبينَ\n" +
                    "TRANSLITERATION\n" +
                    "waylun yawmaʾidhin li-l-mukadhdhibīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Woe to the deniers on that day,");
            ayat.add("11\n" +
                    "الَّذينَ يُكَذِّبونَ بِيَومِ الدّينِ\n" +
                    "TRANSLITERATION\n" +
                    "alladhīna yukadhdhibūna bi-yawmi d-dīni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "who deny the Day of Retribution");
            ayat.add("12\n" +
                    "وَما يُكَذِّبُ بِهِ إِلّا كُلُّ مُعتَدٍ أَثيمٍ\n" +
                    "TRANSLITERATION\n" +
                    "wa-mā yukadhdhibu bihī ʾillā kullu muʿtadin ʾathīmin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and none denies it except every sinful transgressor.");
            ayat.add("13\n" +
                    "إِذا تُتلىٰ عَلَيهِ آياتُنا قالَ أَساطيرُ الأَوَّلينَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾidhā tutlā ʿalayhi ʾāyātunā qāla ʾasāṭīru l-ʾawwalīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "When Our signs are recited to him,\n" +
                    "he says, ‘Myths of the ancients!’");
            ayat.add("14\n" +
                    "كَلّا ۖ بَل ۜ رانَ عَلىٰ قُلوبِهِم ما كانوا يَكسِبونَ\n" +
                    "TRANSLITERATION\n" +
                    "kallā bal rāna ʿalā qulūbihim mā kānū yaksibūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "No indeed! Rather their hearts have been sullied1\n" +
                    "by what they have been earning.");
            ayat.add("15\n" +
                    "كَلّا إِنَّهُم عَن رَبِّهِم يَومَئِذٍ لَمَحجوبونَ\n" +
                    "TRANSLITERATION\n" +
                    "kallā ʾinnahum ʿan rabbihim yawmaʾidhin la-maḥjūbūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "No indeed!\n" +
                    "They will be alienated from their Lord on that day.");
            ayat.add("16\n" +
                    "ثُمَّ إِنَّهُم لَصالُو الجَحيمِ\n" +
                    "TRANSLITERATION\n" +
                    "thumma ʾinnahum la-ṣālū l-jaḥīmi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Then they will indeed enter hell,");
            ayat.add("17\n" +
                    "ثُمَّ يُقالُ هٰذَا الَّذي كُنتُم بِهِ تُكَذِّبونَ\n" +
                    "TRANSLITERATION\n" +
                    "thumma yuqālu hādhā lladhī kuntum bihī tukadhdhibūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "then told,\n" +
                    "‘This is what you used to deny!’");
            ayat.add("18\n" +
                    "كَلّا إِنَّ كِتابَ الأَبرارِ لَفي عِلِّيّينَ\n" +
                    "TRANSLITERATION\n" +
                    "kallā ʾinna kitāba l-ʾabrāri la-fī ʿilliyyīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "No indeed!\n" +
                    "The record of the pious is indeed in Illīyūn.");
            ayat.add("19\n" +
                    "وَما أَدراكَ ما عِلِّيّونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-mā ʾadrāka mā ʿilliyyūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And what will show you what is Illīyūn?");
            ayat.add("20\n" +
                    "كِتابٌ مَرقومٌ\n" +
                    "TRANSLITERATION\n" +
                    "kitābun marqūmun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "It is a written record,");
            ayat.add("21\n" +
                    "يَشهَدُهُ المُقَرَّبونَ\n" +
                    "TRANSLITERATION\n" +
                    "yashhaduhu l-muqarrabūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "witnessed by those brought near [to Allah].");
            ayat.add("22\n" +
                    "إِنَّ الأَبرارَ لَفي نَعيمٍ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna l-ʾabrāra la-fī naʿīmin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed the pious shall be amid bliss,");
            ayat.add("23\n" +
                    "عَلَى الأَرائِكِ يَنظُرونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʿalā l-ʾarāʾiki yanẓurūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "observing, [as they recline] on couches.");
            ayat.add("24\n" +
                    "تَعرِفُ في وُجوهِهِم نَضرَةَ النَّعيمِ\n" +
                    "TRANSLITERATION\n" +
                    "taʿrifu fī wujūhihim naḍrata n-naʿīmi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "You will perceive in their faces the freshness of bliss");
            ayat.add("25\n" +
                    "يُسقَونَ مِن رَحيقٍ مَختومٍ\n" +
                    "TRANSLITERATION\n" +
                    "yusqawna min raḥīqin makhtūmin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "as they are served with a sealed wine,");
            ayat.add("26\n" +
                    "خِتامُهُ مِسكٌ ۚ وَفي ذٰلِكَ فَليَتَنافَسِ المُتَنافِسونَ\n" +
                    "TRANSLITERATION\n" +
                    "khitāmuhū miskun wa-fī dhālika fa-l-yatanāfasi l-mutanāfisūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "whose seal is musk\n" +
                    "for such let the viers vie");
            ayat.add("27\n" +
                    "وَمِزاجُهُ مِن تَسنيمٍ\n" +
                    "TRANSLITERATION\n" +
                    "wa-mizājuhū min tasnīmin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and whose seasoning is from Tasnīm,");
            ayat.add("28\n" +
                    "عَينًا يَشرَبُ بِهَا المُقَرَّبونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʿaynan yashrabu bihā l-muqarrabūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "a spring where those brought near [to Allah] drink.");
            ayat.add("29\n" +
                    "إِنَّ الَّذينَ أَجرَموا كانوا مِنَ الَّذينَ آمَنوا يَضحَكونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna lladhīna ʾajramū kānū mina lladhīna ʾāmanū yaḍḥakūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed the guilty\n" +
                    "used to laugh at the faithful,");
            ayat.add("30\n" +
                    "وَإِذا مَرّوا بِهِم يَتَغامَزونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾidhā marrū bihim yataghāmazūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and when they passed them\n" +
                    "by they would wink at each other,");
            ayat.add("31\n" +
                    "وَإِذَا انقَلَبوا إِلىٰ أَهلِهِمُ انقَلَبوا فَكِهينَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾidhā nqalabū ʾilā ʾahlihimu nqalabū fakihīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and when they returned to their folks\n" +
                    "they would return rejoicing,");
            ayat.add("32\n" +
                    "وَإِذا رَأَوهُم قالوا إِنَّ هٰؤُلاءِ لَضالّونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾidhā raʾawhum qālū ʾinna hāʾulāʾi la-ḍāllūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and when they saw them\n" +
                    "they would say,\n" +
                    "‘Indeed those are the astray!’");
            ayat.add("33\n" +
                    "وَما أُرسِلوا عَلَيهِم حافِظينَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-mā ʾursilū ʿalayhim ḥāfizīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Though they were not sent to watch over them.");
            ayat.add("34\n" +
                    "فَاليَومَ الَّذينَ آمَنوا مِنَ الكُفّارِ يَضحَكونَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-l-yawma lladhīna ʾāmanū mina l-kuffāri yaḍḥakūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So today the faithful\n" +
                    "will laugh at the faithless,");
            ayat.add("35\n" +
                    "عَلَى الأَرائِكِ يَنظُرونَ\n" +
                    "TRANSLITERATION\n" +
                    "ʿalā l-ʾarāʾiki yanẓurūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "observing from couches");
            ayat.add("36\n" +
                    "هَل ثُوِّبَ الكُفّارُ ما كانوا يَفعَلونَ\n" +
                    "TRANSLITERATION\n" +
                    "hal thuwwiba l-kuffāru mā kānū yafʿalūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Have the faithless been requited\n" +
                    "for what they used to do?");
        }
        else if (surahName.equals("84. Al-Inshiqaq"))
        {
            setTitle("Al-Inshiqaq(الإنشقاق) : The Splitting");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "إِذَا السَّماءُ انشَقَّت\n" +
                    "TRANSLITERATION\n" +
                    "ʾidhā s-samāʾu nshaqqat\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "When the sky is split open");
            ayat.add("2\n" +
                    "وَأَذِنَت لِرَبِّها وَحُقَّت\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾadhinat li-rabbihā wa-ḥuqqat\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and gives ear to its Lord as it should.");
            ayat.add("3\n" +
                    "وَإِذَا الأَرضُ مُدَّت\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾidhā l-ʾarḍu muddat\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "When the earth is spread out");
            ayat.add("4\n" +
                    "وَأَلقَت ما فيها وَتَخَلَّت\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾalqat mā fīhā wa-takhallat\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and throws out what is in it, emptying itself,");
            ayat.add("5\n" +
                    "وَأَذِنَت لِرَبِّها وَحُقَّت\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾadhinat li-rabbihā wa-ḥuqqat\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and gives ear to its Lord as it should.");
            ayat.add("6\n" +
                    "يا أَيُّهَا الإِنسانُ إِنَّكَ كادِحٌ إِلىٰ رَبِّكَ كَدحًا فَمُلاقيهِ\n" +
                    "TRANSLITERATION\n" +
                    "yā-ʾayyuhā l-ʾinsānu ʾinnaka kādiḥun ʾilā rabbika kadḥan fa-mulāqīhi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "O man!\n" +
                    "You are labouring toward your Lord laboriously,\n" +
                    "and you will encounter Him.");
            ayat.add("7\n" +
                    "فَأَمّا مَن أوتِيَ كِتابَهُ بِيَمينِهِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾammā man ʾūtiya kitābahū bi-yamīnihī\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Then as for him who is given his record\n" +
                    "in his right hand,");
            ayat.add("8\n" +
                    "فَسَوفَ يُحاسَبُ حِسابًا يَسيرًا\n" +
                    "TRANSLITERATION\n" +
                    "fa-sawfa yuḥāsabu ḥisāban yasīran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "he shall soon receive an easy reckoning");
            ayat.add("9\n" +
                    "وَيَنقَلِبُ إِلىٰ أَهلِهِ مَسرورًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-yanqalibu ʾilā ʾahlihī masrūran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and he will return to his folks joyfully.");
            ayat.add("10\n" +
                    "وَأَمّا مَن أوتِيَ كِتابَهُ وَراءَ ظَهرِهِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾammā man ʾūtiya kitābahū warāʾa ẓahrihī\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "But as for him who is given his record\n" +
                    "from behind his back,");
            ayat.add("11\n" +
                    "فَسَوفَ يَدعو ثُبورًا\n" +
                    "TRANSLITERATION\n" +
                    "fa-sawfa yadʿū thubūran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "he will pray for annihilation,");
            ayat.add("12\n" +
                    "وَيَصلىٰ سَعيرًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-yaṣlā saʿīran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and he will enter the Blaze.");
            ayat.add("13\n" +
                    "إِنَّهُ كانَ في أَهلِهِ مَسرورًا\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnahū kāna fī ʾahlihī masrūran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed he used to be joyful among his folk,");
            ayat.add("14\n" +
                    "إِنَّهُ ظَنَّ أَن لَن يَحورَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnahū ẓanna ʾan lan yaḥūra\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and indeed he thought he would never return.");
            ayat.add("15\n" +
                    "بَلىٰ إِنَّ رَبَّهُ كانَ بِهِ بَصيرًا\n" +
                    "TRANSLITERATION\n" +
                    "balā ʾinna rabbahū kāna bihī baṣīran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Yes indeed, his Lord sees him best.");
            ayat.add("16\n" +
                    "فَلا أُقسِمُ بِالشَّفَقِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-lā ʾuqsimu bi-sh-shafaqi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So I swear by the evening glow,");
            ayat.add("17\n" +
                    "وَاللَّيلِ وَما وَسَقَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-l-layli wa-mā wasaqa\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "by the night and what it is fraught with,");
            ayat.add("18\n" +
                    "وَالقَمَرِ إِذَا اتَّسَقَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-l-qamari ʾidhā ttasaqa\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "by the moon when it blooms full");
            ayat.add("19\n" +
                    "لَتَركَبُنَّ طَبَقًا عَن طَبَقٍ\n" +
                    "TRANSLITERATION\n" +
                    "la-tarkabunna ṭabaqan ʿan ṭabaqin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "you will surely fare from stage to stage.");
            ayat.add("20\n" +
                    "فَما لَهُم لا يُؤمِنونَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-mā lahum lā yuʾminūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So what is the matter with them\n" +
                    "that they will not believe?");
            ayat.add("21\n" +
                    "وَإِذا قُرِئَ عَلَيهِمُ القُرآنُ لا يَسجُدونَ ۩\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾidhā quriʾa ʿalayhimu l-qurʾānu lā yasjudūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And when the Qurʾān is recited to them\n" +
                    "they will not prostrate?");
            ayat.add("22\n" +
                    "بَلِ الَّذينَ كَفَروا يُكَذِّبونَ\n" +
                    "TRANSLITERATION\n" +
                    "bali lladhīna kafarū yukadhdhibūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Rather the faithless deny,");
            ayat.add("23\n" +
                    "وَاللَّهُ أَعلَمُ بِما يوعونَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-llāhu ʾaʿlamu bi-mā yūʿūna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and Allah knows best what they keep to themselves.");
            ayat.add("24\n" +
                    "فَبَشِّرهُم بِعَذابٍ أَليمٍ\n" +
                    "TRANSLITERATION\n" +
                    "fa-bashshirhum bi-ʿadhābin ʾalīmin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So warn them of a painful punishment,");
            ayat.add("25\n" +
                    "إِلَّا الَّذينَ آمَنوا وَعَمِلُوا الصّالِحاتِ لَهُم أَجرٌ غَيرُ مَمنونٍ\n" +
                    "TRANSLITERATION\n" +
                    "ʾillā lladhīna ʾāmanū wa-ʿamilū ṣ-ṣāliḥāti lahum ʾajrun ghayru mamnūnin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "except such as are faithful\n" +
                    "and do righteous deeds:\n" +
                    "there will be an everlasting reward for them.");
        }
        else if (surahName.equals("85. Al-Burooj"))
        {
            setTitle("Al-Burooj(البروج) : The Houses");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "وَالسَّماءِ ذاتِ البُروجِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-s-samāʾi dhāti l-burūji\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "By the sky with its houses,");
            ayat.add("2\n" +
                    "وَاليَومِ المَوعودِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-l-yawmi l-mawʿūdi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "by the Promised Day,");
            ayat.add("3\n" +
                    "وَشاهِدٍ وَمَشهودٍ\n" +
                    "TRANSLITERATION\n" +
                    "wa-shāhidin wa-mashhūdin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "by the Witness1 and the Witnessed:");
            ayat.add("4\n" +
                    "قُتِلَ أَصحابُ الأُخدودِ\n" +
                    "TRANSLITERATION\n" +
                    "qutila ʾaṣḥābu l-ʾukhdūdi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "perish the Men of the Ditch!");
            ayat.add("5\n" +
                    "النّارِ ذاتِ الوَقودِ\n" +
                    "TRANSLITERATION\n" +
                    "an-nāri dhāti l-waqūdi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The fire, abounding in fuel,");
            ayat.add("6\n" +
                    "إِذ هُم عَلَيها قُعودٌ\n" +
                    "TRANSLITERATION\n" +
                    "ʾidh hum ʿalayhā quʿūdun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "above which they sat");
            ayat.add("7\n" +
                    "وَهُم عَلىٰ ما يَفعَلونَ بِالمُؤمِنينَ شُهودٌ\n" +
                    "TRANSLITERATION\n" +
                    "wa-hum ʿalā mā yafʿalūna bi-l-muʾminīna shuhūdun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "as they were themselves\n" +
                    "witnesses to what they did to the faithful.");
            ayat.add("8\n" +
                    "وَما نَقَموا مِنهُم إِلّا أَن يُؤمِنوا بِاللَّهِ العَزيزِ الحَميدِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-mā naqamū minhum ʾillā ʾan yuʾminū bi-llāhi l-ʿazīzi l-ḥamīdi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They were vindictive towards them only\n" +
                    "because they had faith in Allah,\n" +
                    "the All-mighty, the All-laudable,");
            ayat.add("9\n" +
                    "الَّذي لَهُ مُلكُ السَّماواتِ وَالأَرضِ ۚ وَاللَّهُ عَلىٰ كُلِّ شَيءٍ شَهيدٌ\n" +
                    "TRANSLITERATION\n" +
                    "alladhī lahū mulku s-samāwāti wa-l-ʾarḍi wa-llāhu ʿalā kulli shayʾin shahīdun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "to whom belongs the kingdom of the heavens\n" +
                    "and the earth,\n" +
                    "and Allah is witness to all things.");
            ayat.add("10\n" +
                    "إِنَّ الَّذينَ فَتَنُوا المُؤمِنينَ وَالمُؤمِناتِ ثُمَّ لَم يَتوبوا فَلَهُم عَذابُ جَهَنَّمَ وَلَهُم عَذابُ الحَريقِ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna lladhīna fatanū l-muʾminīna wa-l-muʾmināti thumma lam yatūbū fa-lahum ʿadhābu jahannama wa-lahum ʿadhābu l-ḥarīqi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed those who persecute\n" +
                    "the faithful men and women,\n" +
                    "and then do not repent,\n" +
                    "for them there is the punishment of hell,\n" +
                    "and for them there is the punishment of burning.");
            ayat.add("11\n" +
                    "إِنَّ الَّذينَ آمَنوا وَعَمِلُوا الصّالِحاتِ لَهُم جَنّاتٌ تَجري مِن تَحتِهَا الأَنهارُ ۚ ذٰلِكَ الفَوزُ الكَبيرُ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna lladhīna ʾāmanū wa-ʿamilū ṣ-ṣāliḥāti lahum jannātun tajrī min taḥtihā l-ʾanhāru dhālika l-fawzu l-kabīru\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed those who have faith and do righteous deeds,\n" +
                    "—for them will be gardens\n" +
                    "with streams running in them.\n" +
                    "That is the supreme success.\n");
            ayat.add("12\n" +
                    "إِنَّ بَطشَ رَبِّكَ لَشَديدٌ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna baṭsha rabbika la-shadīdun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed your Lord’s striking is severe.");
            ayat.add("13\n" +
                    "إِنَّهُ هُوَ يُبدِئُ وَيُعيدُ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnahū huwa yubdiʾu wa-yuʿīdu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "It is indeed He who originates and brings back again,\n" +
                    "\n");
            ayat.add("14\n" +
                    "وَهُوَ الغَفورُ الوَدودُ\n" +
                    "TRANSLITERATION\n" +
                    "wa-huwa l-ghafūru l-wadūdu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and He is the All-forgiving, the All-affectionate,\n");
            ayat.add("15\n" +
                    "ذُو العَرشِ المَجيدُ\n" +
                    "TRANSLITERATION\n" +
                    "dhū-l-ʿarshi l-majīdu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Lord of the Throne, the All-glorious,");
            ayat.add("16\n" +
                    "فَعّالٌ لِما يُريدُ\n" +
                    "TRANSLITERATION\n" +
                    "faʿʿālun li-mā yurīdu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "doer of what He desires.");
            ayat.add("17\n" +
                    "هَل أَتاكَ حَديثُ الجُنودِ\n" +
                    "TRANSLITERATION\n" +
                    "hal ʾatāka ḥadīthu l-junūdi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Did you receive the story of the hosts");
            ayat.add("18\n" +
                    "فِرعَونَ وَثَمودَ\n" +
                    "TRANSLITERATION\n" +
                    "firʿawna wa-thamūda\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "of Pharaoh and Thamūd?");
            ayat.add("19\n" +
                    "بَلِ الَّذينَ كَفَروا في تَكذيبٍ\n" +
                    "TRANSLITERATION\n" +
                    "bali lladhīna kafarū fī takdhībin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Rather the faithless dwell in denial,");
            ayat.add("20\n" +
                    "وَاللَّهُ مِن وَرائِهِم مُحيطٌ\n" +
                    "TRANSLITERATION\n" +
                    "wa-llāhu min warāʾihim muḥīṭun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and Allah besieges them from all around.");
            ayat.add("21\n" +
                    "بَل هُوَ قُرآنٌ مَجيدٌ\n" +
                    "TRANSLITERATION\n" +
                    "bal huwa qurʾānun majīdun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Rather it is a glorious Qurʾān,");
            ayat.add("22\n" +
                    "في لَوحٍ مَحفوظٍ\n" +
                    "TRANSLITERATION\n" +
                    "fī lawḥin maḥfūẓin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "in a preserved tablet.");
        }
        else if (surahName.equals("86. At-Tariq"))
        {
            setTitle("At-Tariq(الطارق) : The Nightly Visitor");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "وَالسَّماءِ وَالطّارِقِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-s-samāʾi wa-ṭ-ṭāriqi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "By the sky,\n" +
                    "by the nightly visitor,");
            ayat.add("2\n" +
                    "وَما أَدراكَ مَا الطّارِقُ\n" +
                    "TRANSLITERATION\n" +
                    "wa-mā ʾadrāka mā ṭ-ṭāriqu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "(and what will show you what is the nightly visitor?");
            ayat.add("3\n" +
                    "النَّجمُ الثّاقِبُ\n" +
                    "TRANSLITERATION\n" +
                    "an-najmu th-thāqibu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "It is the brilliant star)");
            ayat.add("4\n" +
                    "إِن كُلُّ نَفسٍ لَمّا عَلَيها حافِظٌ\n" +
                    "TRANSLITERATION\n" +
                    "ʾin kullu nafsin lammā ʿalayhā ḥāfiẓun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "there is a guard1 over every soul.");
            ayat.add("5\n" +
                    "فَليَنظُرِ الإِنسانُ مِمَّ خُلِقَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-l-yanẓuri l-ʾinsānu mimma khuliqa\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So let man consider from what he was created.");
            ayat.add("6\n" +
                    "خُلِقَ مِن ماءٍ دافِقٍ\n" +
                    "TRANSLITERATION\n" +
                    "khuliqa min māʾin dāfiqin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "He was created from an effusing fluid");
            ayat.add("7\n" +
                    "يَخرُجُ مِن بَينِ الصُّلبِ وَالتَّرائِبِ\n" +
                    "TRANSLITERATION\n" +
                    "yakhruju min bayni ṣ-ṣulbi wa-t-tarāʾibi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "which issues from between the loins\n" +
                    "and the breast-bones.");
            ayat.add("8\n" +
                    "إِنَّهُ عَلىٰ رَجعِهِ لَقادِرٌ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnahū ʿalā rajʿihī la-qādirun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed He is able to bring him back [after death],");
            ayat.add("9\n" +
                    "يَومَ تُبلَى السَّرائِرُ\n" +
                    "TRANSLITERATION\n" +
                    "yawma tublā s-sarāʾiru\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "on the day when the secrets are examined,");
            ayat.add("10\n" +
                    "فَما لَهُ مِن قُوَّةٍ وَلا ناصِرٍ\n" +
                    "TRANSLITERATION\n" +
                    "fa-mā lahū min quwwatin wa-lā nāṣirin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and he shall have neither power nor helper.");
            ayat.add("11\n" +
                    "وَالسَّماءِ ذاتِ الرَّجعِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-s-samāʾi dhāti r-rajʿ\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "By the resurgent sky");
            ayat.add("12\n" +
                    "وَالأَرضِ ذاتِ الصَّدعِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-l-ʾarḍi dhāti ṣ-ṣadʿi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "by the furrowed earth");
            ayat.add("13\n" +
                    "إِنَّهُ لَقَولٌ فَصلٌ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnahū la-qawlun faṣlun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "it is indeed a decisive word,");
            ayat.add("14\n" +
                    "وَما هُوَ بِالهَزلِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-mā huwa bi-l-hazli\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and it is not a jest.");
            ayat.add("15\n" +
                    "إِنَّهُم يَكيدونَ كَيدًا\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnahum yakīdūna kaydan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed they are devising a stratagem,");
            ayat.add("16\n" +
                    "وَأَكيدُ كَيدًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾakīdu kaydan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and I [too] am devising a plan.");
            ayat.add("17\n" +
                    "فَمَهِّلِ الكافِرينَ أَمهِلهُم رُوَيدًا\n" +
                    "TRANSLITERATION\n" +
                    "fa-mahhili l-kāfirīna ʾamhilhum ruwaydan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So respite the faithless;\n" +
                    "give them a gentle respite.");
        }
        else if (surahName.equals("87. Al-A`la"))
        {
            setTitle("Al-A`la(الأعلى) : The Most Exalted");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "سَبِّحِ اسمَ رَبِّكَ الأَعلَى\n" +
                    "TRANSLITERATION\n" +
                    "sabbiḥi sma rabbika l-ʾaʿlā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Celebrate the Name of your Lord, the Most Exalted,");
            ayat.add("2\n" +
                    "الَّذي خَلَقَ فَسَوّىٰ\n" +
                    "TRANSLITERATION\n" +
                    "alladhī khalaqa fa-sawwā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "who created and proportioned,");
            ayat.add("3\n" +
                    "وَالَّذي قَدَّرَ فَهَدىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-lladhī qaddara fa-hadā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "who determined and guided,");
            ayat.add("4\n" +
                    "وَالَّذي أَخرَجَ المَرعىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-lladhī ʾakhraja l-marʿā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "who brought forth the pasture,");
            ayat.add("5\n" +
                    "فَجَعَلَهُ غُثاءً أَحوىٰ\n" +
                    "TRANSLITERATION\n" +
                    "fa-jaʿalahū ghuthāʾan ʾaḥwā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "then turned it into a black scum.\n");
            ayat.add("6\n" +
                    "سَنُقرِئُكَ فَلا تَنسىٰ\n" +
                    "TRANSLITERATION\n" +
                    "sa-nuqriʾuka fa-lā tansā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "We shall have you recite [the Qurʾān],\n" +
                    "then you will not forget [any of it]");
            ayat.add("7\n" +
                    "إِلّا ما شاءَ اللَّهُ ۚ إِنَّهُ يَعلَمُ الجَهرَ وَما يَخفىٰ\n" +
                    "TRANSLITERATION\n" +
                    "ʾillā mā shāʾa llāhu ʾinnahū yaʿlamu l-jahra wa-mā yakhfā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "except what Allah may wish.\n" +
                    "Indeed He knows the overt and what is hidden.");
            ayat.add("8\n" +
                    "وَنُيَسِّرُكَ لِليُسرىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-nuyassiruka li-l-yusrā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "We shall smooth your way to [preach] the easiest [canon].");
            ayat.add("9\n" +
                    "فَذَكِّر إِن نَفَعَتِ الذِّكرىٰ\n" +
                    "TRANSLITERATION\n" +
                    "fa-dhakkir ʾin nafaʿati dh-dhikrā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So admonish, for admonition is indeed beneficial");
            ayat.add("10\n" +
                    "سَيَذَّكَّرُ مَن يَخشىٰ\n" +
                    "TRANSLITERATION\n" +
                    "sa-yadhdhakkaru man yakhshā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "he who fears will take admonition,");
            ayat.add("11\n" +
                    "وَيَتَجَنَّبُهَا الأَشقَى\n" +
                    "TRANSLITERATION\n" +
                    "wa-yatajannabuhā l-ʾashqā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and the most wretched will shun it");
            ayat.add("12\n" +
                    "الَّذي يَصلَى النّارَ الكُبرىٰ\n" +
                    "TRANSLITERATION\n" +
                    "alladhī yaṣlā n-nāra l-kubrā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "he who will enter the Great Fire,");
            ayat.add("13\n" +
                    "ثُمَّ لا يَموتُ فيها وَلا يَحيىٰ\n" +
                    "TRANSLITERATION\n" +
                    "thumma lā yamūtu fīhā wa-lā yaḥyā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "then neither live in it, nor die.\n");
            ayat.add("14\n" +
                    "قَد أَفلَحَ مَن تَزَكّىٰ\n" +
                    "TRANSLITERATION\n" +
                    "qad ʾaflaḥa man tazakkā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Felicitous is he who purifies himself,");
            ayat.add("15\n" +
                    "وَذَكَرَ اسمَ رَبِّهِ فَصَلّىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-dhakara sma rabbihī fa-ṣallā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "celebrates the Name of his Lord, and prays.");
            ayat.add("16\n" +
                    "بَل تُؤثِرونَ الحَياةَ الدُّنيا\n" +
                    "TRANSLITERATION\n" +
                    "bal tuʾthirūna l-ḥayāta d-dunyā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Rather you prefer the life of this world,");
            ayat.add("17\n" +
                    "وَالآخِرَةُ خَيرٌ وَأَبقىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-l-ʾākhiratu khayrun wa-ʾabqā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "while the Hereafter is better and more lasting.");
            ayat.add("18\n" +
                    "إِنَّ هٰذا لَفِي الصُّحُفِ الأولىٰ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna hādhā la-fī ṣ-ṣuḥufi l-ʾūlā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "This is indeed in the former scriptures,");
            ayat.add("19\n" +
                    "صُحُفِ إِبراهيمَ وَموسىٰ\n" +
                    "TRANSLITERATION\n" +
                    "ṣuḥufi ʾibrāhīma wa-mūsā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "the scriptures of Abraham and Moses.");
        }
        else if (surahName.equals("88. Al-Ghashiyah")) {
            setTitle("Al-Ghashiyah(الغاشية ) : The Enveloper");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "هَل أَتاكَ حَديثُ الغاشِيَةِ\n" +
                    "TRANSLITERATION\n" +
                    "hal ʾatāka ḥadīthu l-ghāshiyati\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Did you receive the account of the Enveloper?");
            ayat.add("2\n" +
                    "وُجوهٌ يَومَئِذٍ خاشِعَةٌ\n" +
                    "TRANSLITERATION\n" +
                    "wujūhun yawmaʾidhin khāshiʿatun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Some faces on that day will be humbled,");
            ayat.add("3\n" +
                    "عامِلَةٌ ناصِبَةٌ\n" +
                    "TRANSLITERATION\n" +
                    "ʿāmilatun nāṣibatun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "wrought-up and weary");
            ayat.add("4\n" +
                    "تَصلىٰ نارًا حامِيَةً\n" +
                    "TRANSLITERATION\n" +
                    "taṣlā nāran ḥāmiyatan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "they will enter a scorching fire,");
            ayat.add("5\n" +
                    "تُسقىٰ مِن عَينٍ آنِيَةٍ\n" +
                    "TRANSLITERATION\n" +
                    "tusqā min ʿaynin ʾāniyatin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and made to drink from a boiling spring.");
            ayat.add("6\n" +
                    "لَيسَ لَهُم طَعامٌ إِلّا مِن ضَريعٍ\n" +
                    "TRANSLITERATION\n" +
                    "laysa lahum ṭaʿāmun ʾillā min ḍarīʿin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They will have no food except cactus,");
            ayat.add("7\n" +
                    "لا يُسمِنُ وَلا يُغني مِن جوعٍ\n" +
                    "TRANSLITERATION\n" +
                    "lā yusminu wa-lā yughnī min jūʿin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "neither nourishing,\n" +
                    "nor availing against hunger.");
            ayat.add("8\n" +
                    "وُجوهٌ يَومَئِذٍ ناعِمَةٌ\n" +
                    "TRANSLITERATION\n" +
                    "wujūhun yawmaʾidhin nāʿimatun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Some faces on that day will be joyous,");
            ayat.add("9\n" +
                    "لِسَعيِها راضِيَةٌ\n" +
                    "TRANSLITERATION\n" +
                    "li-saʿyihā rāḍiyatun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "pleased with their endeavour;");
            ayat.add("10\n" +
                    "في جَنَّةٍ عالِيَةٍ\n" +
                    "TRANSLITERATION\n" +
                    "fī jannatin ʿāliyatin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "in a lofty paradise");
            ayat.add("11\n" +
                    "لا تَسمَعُ فيها لاغِيَةً\n" +
                    "TRANSLITERATION\n" +
                    "lā tasmaʿu fīhā lāghiyatan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "wherein they will not hear any vain talk.");
            ayat.add("12\n" +
                    "فيها عَينٌ جارِيَةٌ\n" +
                    "TRANSLITERATION\n" +
                    "fīhā ʿaynun jāriyatun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "In it there is a flowing spring");
            ayat.add("13\n" +
                    "فيها سُرُرٌ مَرفوعَةٌ\n" +
                    "TRANSLITERATION\n" +
                    "fīhā sururun marfūʿatun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and in it there are raised couches,");
            ayat.add("14\n" +
                    "وَأَكوابٌ مَوضوعَةٌ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾakwābun mawḍūʿatun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and goblets set,");
            ayat.add("15\n" +
                    "وَنَمارِقُ مَصفوفَةٌ\n" +
                    "TRANSLITERATION\n" +
                    "wa-namāriqu maṣfūfatun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and cushions laid out in an array,");
            ayat.add("16\n" +
                    "وَزَرابِيُّ مَبثوثَةٌ\n" +
                    "TRANSLITERATION\n" +
                    "wa-zarābiyyu mabthūthatun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and carpets spread out.");
            ayat.add("17\n" +
                    "أَفَلا يَنظُرونَ إِلَى الإِبِلِ كَيفَ خُلِقَت\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-fa-lā yanẓurūna ʾilā l-ʾibili kayfa khuliqat\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Do they not observe1 the camel,\n" +
                    "[to see] how she has been created?");
            ayat.add("18\n" +
                    "وَإِلَى السَّماءِ كَيفَ رُفِعَت\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾilā s-samāʾi kayfa rufiʿat\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and the sky, how it has been raised?");
            ayat.add("19\n" +
                    "وَإِلَى الجِبالِ كَيفَ نُصِبَت\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾilā l-jibāli kayfa nuṣibat\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and the mountains, how they have been set?");
            ayat.add("20\n" +
                    "وَإِلَى الأَرضِ كَيفَ سُطِحَت\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾilā l-ʾarḍi kayfa suṭiḥat\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and the earth, how it has been surfaced?");
            ayat.add("21\n" +
                    "فَذَكِّر إِنَّما أَنتَ مُذَكِّرٌ\n" +
                    "TRANSLITERATION\n" +
                    "fa-dhakkir ʾinnamā ʾanta mudhakkirun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So admonish—for you are only an admonisher,");
            ayat.add("22\n" +
                    "لَستَ عَلَيهِم بِمُصَيطِرٍ\n" +
                    "TRANSLITERATION\n" +
                    "lasta ʿalayhim bi-muṣayṭirin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and not a taskmaster over them");
            ayat.add("23\n" +
                    "إِلّا مَن تَوَلّىٰ وَكَفَرَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾillā man tawallā wa-kafara\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "except him who turns back and disbelieves.");
            ayat.add("24\n" +
                    "فَيُعَذِّبُهُ اللَّهُ العَذابَ الأَكبَرَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-yuʿadhdhibuhu llāhu l-ʿadhāba l-ʾakbara\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Him Allah will punish with the greatest punishment.");
            ayat.add("25\n" +
                    "إِنَّ إِلَينا إِيابَهُم\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna ʾilaynā ʾiyābahum\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed to Us will be their return.");
            ayat.add("26\n" +
                    "ثُمَّ إِنَّ عَلَينا حِسابَهُم\n" +
                    "TRANSLITERATION\n" +
                    "thumma ʾinna ʿalaynā ḥisābahum\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Then, indeed, their reckoning will lie with Us.");
        }
        else if (surahName.equals("89. Al-Fajr"))
        {
            setTitle("Al-Fajr(الفجر ) : The Dawn");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "وَالفَجرِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-l-fajri\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "By the Dawn,");
            ayat.add("2\n" +
                    "وَلَيالٍ عَشرٍ\n" +
                    "TRANSLITERATION\n" +
                    "wa-layālin ʿashrin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "by the ten nights,");
            ayat.add("3\n" +
                    "وَالشَّفعِ وَالوَترِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-sh-shafʿi wa-l-watri\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "by the Even and the Odd,");
            ayat.add("4\n" +
                    "وَاللَّيلِ إِذا يَسرِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-l-layli ʾidhā yasri\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "by the night when it departs!");
            ayat.add("5\n" +
                    "هَل في ذٰلِكَ قَسَمٌ لِذي حِجرٍ\n" +
                    "TRANSLITERATION\n" +
                    "hal fī dhālika qasamun li-dhī ḥijrin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Is there an oath in that for one possessing intellect?");
            ayat.add("6\n" +
                    "أَلَم تَرَ كَيفَ فَعَلَ رَبُّكَ بِعادٍ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-lam tara kayfa faʿala rabbuka bi-ʿādin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Have you not regarded\n" +
                    "how your Lord dealt with [the people of] ʿĀd,");
            ayat.add("7\n" +
                    "إِرَمَ ذاتِ العِمادِ\n" +
                    "TRANSLITERATION\n" +
                    "ʾirama dhāti l-ʿimādi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "[and] Iram, [the city] of the pillars,");
            ayat.add("8\n" +
                    "الَّتي لَم يُخلَق مِثلُها فِي البِلادِ\n" +
                    "TRANSLITERATION\n" +
                    "allatī lam yukhlaq mithluhā fī l-bilādi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "the like of which was not created among cities,");
            ayat.add("9\n" +
                    "وَثَمودَ الَّذينَ جابُوا الصَّخرَ بِالوادِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-thamūda lladhīna jābū ṣ-ṣakhra bi-l-wādi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and [the people of] Thamūd,\n" +
                    "who hollowed out the rocks in the valley,");
            ayat.add("10\n" +
                    "وَفِرعَونَ ذِي الأَوتادِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-firʿawna dhī l-ʾawtādi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and Pharaoh, the impaler,");
            ayat.add("11\n" +
                    "الَّذينَ طَغَوا فِي البِلادِ\n" +
                    "TRANSLITERATION\n" +
                    "alladhīna ṭaghaw fī l-bilādi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "—those who rebelled [against Allah] in their cities");
            ayat.add("12\n" +
                    "فَأَكثَروا فيهَا الفَسادَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾaktharū fīhā l-fasāda\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and caused much corruption in them,");
            ayat.add("13\n" +
                    "فَصَبَّ عَلَيهِم رَبُّكَ سَوطَ عَذابٍ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ṣabba ʿalayhim rabbuka sawṭa ʿadhābin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "so your Lord poured on them\n" +
                    "lashes of punishment.");
            ayat.add("14\n" +
                    "إِنَّ رَبَّكَ لَبِالمِرصادِ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna rabbaka la-bi-l-mirṣādi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed your Lord is in ambush.");
            ayat.add("15\n" +
                    "فَأَمَّا الإِنسانُ إِذا مَا ابتَلاهُ رَبُّهُ فَأَكرَمَهُ وَنَعَّمَهُ فَيَقولُ رَبّي أَكرَمَنِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾammā l-ʾinsānu ʾidhā mā btalāhu rabbuhū fa-ʾakramahū wa-naʿʿamahū fa-yaqūlu rabbī ʾakramani\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "As for man, whenever his Lord tests him\n" +
                    "and grants him honour and blesses him,\n" +
                    "he says, ‘My Lord has honoured me.");
            ayat.add("16\n" +
                    "وَأَمّا إِذا مَا ابتَلاهُ فَقَدَرَ عَلَيهِ رِزقَهُ فَيَقولُ رَبّي أَهانَنِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾammā ʾidhā mā btalāhu fa-qadara ʿalayhi rizqahū fa-yaqūlu rabbī ʾahānani\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "But when He tests him\n" +
                    "and tightens for him his provision,\n" +
                    "he says, ‘My Lord has humiliated me");
            ayat.add("17\n" +
                    "كَلّا ۖ بَل لا تُكرِمونَ اليَتيمَ\n" +
                    "TRANSLITERATION\n" +
                    "kallā bal lā tukrimūna l-yatīma\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "No indeed!\n" +
                    "Rather you do not honour the orphan,");
            ayat.add("18\n" +
                    "وَلا تَحاضّونَ عَلىٰ طَعامِ المِسكينِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-lā taḥāḍḍūna ʿalā ṭaʿāmi l-miskīni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and do not urge the feeding of the needy,");
            ayat.add("19\n" +
                    "وَتَأكُلونَ التُّراثَ أَكلًا لَمًّا\n" +
                    "TRANSLITERATION\n" +
                    "wa-taʾkulūna t-turātha ʾaklan lamman\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and you eat the inheritance rapaciously,");
            ayat.add("20\n" +
                    "وَتُحِبّونَ المالَ حُبًّا جَمًّا\n" +
                    "TRANSLITERATION\n" +
                    "wa-tuḥibbūna l-māla ḥubban jamman\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and you love wealth with much fondness.");
            ayat.add("21\n" +
                    "كَلّا إِذا دُكَّتِ الأَرضُ دَكًّا دَكًّا\n" +
                    "TRANSLITERATION\n" +
                    "kallā ʾidhā dukkati l-ʾarḍu dakkan dakkan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "No indeed!\n" +
                    "When the earth is levelled to a plain,");
            ayat.add("22\n" +
                    "وَجاءَ رَبُّكَ وَالمَلَكُ صَفًّا صَفًّا\n" +
                    "TRANSLITERATION\n" +
                    "wa-jāʾa rabbuka wa-l-malaku ṣaffan ṣaffan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and your Lord and the angels arrive in ranks,");
            ayat.add("23\n" +
                    "وَجِيءَ يَومَئِذٍ بِجَهَنَّمَ ۚ يَومَئِذٍ يَتَذَكَّرُ الإِنسانُ وَأَنّىٰ لَهُ الذِّكرىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-jīʾa yawmaʾidhin bi-jahannama yawmaʾidhin yatadhakkaru l-ʾinsānu wa-ʾannā lahu dh-dhikrā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "the day when hell is brought [near],\n" +
                    "on that day man will take admonition\n" +
                    "but what will the admonition avail him?");
            ayat.add("24\n" +
                    "يَقولُ يا لَيتَني قَدَّمتُ لِحَياتي\n" +
                    "TRANSLITERATION\n" +
                    "yaqūlu yā-laytanī qaddamtu li-ḥayātī\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "He will say, ‘Alas, had I sent ahead for my life!’");
            ayat.add("25\n" +
                    "فَيَومَئِذٍ لا يُعَذِّبُ عَذابَهُ أَحَدٌ\n" +
                    "TRANSLITERATION\n" +
                    "fa-yawmaʾidhin lā yuʿadhdhibu ʿadhābahū ʾaḥadun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "On that day none shall punish as He punishes,");
            ayat.add("26\n" +
                    "وَلا يوثِقُ وَثاقَهُ أَحَدٌ\n" +
                    "TRANSLITERATION\n" +
                    "wa-lā yūthiqu wathāqahū ʾaḥadun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and none shall bind as He binds.");
            ayat.add("27\n" +
                    "يا أَيَّتُهَا النَّفسُ المُطمَئِنَّةُ\n" +
                    "TRANSLITERATION\n" +
                    "yā-ʾayyatuhā n-nafsu l-muṭmaʾinnatu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "‘O soul at peace!");
            ayat.add("28\n" +
                    "ارجِعي إِلىٰ رَبِّكِ راضِيَةً مَرضِيَّةً\n" +
                    "TRANSLITERATION\n" +
                    "irjiʿī ʾilā rabbiki rāḍiyatan marḍiyyatan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Return to your Lord, pleased, pleasing!");
            ayat.add("29\n" +
                    "فَادخُلي في عِبادي\n" +
                    "TRANSLITERATION\n" +
                    "fa-dkhulī fī ʿibādī\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Then enter among My servants!");
            ayat.add("30\n" +
                    "وَادخُلي جَنَّتي\n" +
                    "TRANSLITERATION\n" +
                    "wa-dkhulī jannatī\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And enter My paradise!’");
        }
        else if (surahName.equals("90. Al-Balad"))
        {
            setTitle("Al-Balad(البلد) : The City");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "لا أُقسِمُ بِهٰذَا البَلَدِ\n" +
                    "TRANSLITERATION\n" +
                    "lā ʾuqsimu bi-hādhā l-baladi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "I swear by this town,");
            ayat.add("2\n" +
                    "وَأَنتَ حِلٌّ بِهٰذَا البَلَدِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾanta ḥillun bi-hādhā l-baladi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "as you reside in this town");
            ayat.add("3\n" +
                    "وَوالِدٍ وَما وَلَدَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-wālidin wa-mā walada\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "by the father and him whom he begot");
            ayat.add("4\n" +
                    "لَقَد خَلَقنَا الإِنسانَ في كَبَدٍ\n" +
                    "TRANSLITERATION\n" +
                    "la-qad khalaqnā l-ʾinsāna fī kabadin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "certainly We created man in travail.");
            ayat.add("5\n" +
                    "أَيَحسَبُ أَن لَن يَقدِرَ عَلَيهِ أَحَدٌ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-yaḥsabu ʾan lan yaqdira ʿalayhi ʾaḥadun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Does he suppose\n" +
                    "that no one will ever have power over him?");
            ayat.add("6\n" +
                    "يَقولُ أَهلَكتُ مالًا لُبَدًا\n" +
                    "TRANSLITERATION\n" +
                    "yaqūlu ʾahlaktu mālan lubadan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "He says, ‘I have squandered immense wealth.");
            ayat.add("7\n" +
                    "أَيَحسَبُ أَن لَم يَرَهُ أَحَدٌ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-yaḥsabu ʾan lam yarahū ʾaḥadun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Does he suppose that no one sees him?");
            ayat.add("8\n" +
                    "أَلَم نَجعَل لَهُ عَينَينِ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-lam najʿal lahū ʿaynayni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Have We not made for him two eyes,");
            ayat.add("9\n" +
                    "وَلِسانًا وَشَفَتَينِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-lisānan wa-shafatayni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "a tongue, and two lips,");
            ayat.add("10\n" +
                    "وَهَدَيناهُ النَّجدَينِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-hadaynāhu n-najdayni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and shown him the two paths [of good and evil]?");
            ayat.add("11\n" +
                    "فَلَا اقتَحَمَ العَقَبَةَ\n" +
                    "TRANSLITERATION\n" +
                    "fa-lā qtaḥama l-ʿaqabata\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Yet he has not embarked upon the uphill task.");
            ayat.add("12\n" +
                    "وَما أَدراكَ مَا العَقَبَةُ\n" +
                    "TRANSLITERATION\n" +
                    "wa-mā ʾadrāka mā l-ʿaqabatu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And what will show you what is the uphill task?");
            ayat.add("13\n" +
                    "فَكُّ رَقَبَةٍ\n" +
                    "TRANSLITERATION\n" +
                    "fakku raqabatin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "[It is] the freeing of a slave,");
            ayat.add("14\n" +
                    "أَو إِطعامٌ في يَومٍ ذي مَسغَبَةٍ\n" +
                    "TRANSLITERATION\n" +
                    "ʾaw ʾiṭʿāmun fī yawmin dhī masghabatin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "or feeding [the needy] on a day of starvation,");
            ayat.add("15\n" +
                    "يَتيمًا ذا مَقرَبَةٍ\n" +
                    "TRANSLITERATION\n" +
                    "yatīman dhā maqrabatin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "or an orphan among relatives,");
            ayat.add("16\n" +
                    "أَو مِسكينًا ذا مَترَبَةٍ\n" +
                    "TRANSLITERATION\n" +
                    "ʾaw miskīnan dhā matrabatin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "or a needy man in desolation,");
            ayat.add("17\n" +
                    "ثُمَّ كانَ مِنَ الَّذينَ آمَنوا وَتَواصَوا بِالصَّبرِ وَتَواصَوا بِالمَرحَمَةِ\n" +
                    "TRANSLITERATION\n" +
                    "thumma kāna mina lladhīna ʾāmanū wa-tawāṣaw bi-ṣ-ṣabri wa-tawāṣaw bi-l-marḥamati\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "while being one of those who have faith\n" +
                    "and who enjoin one another to patience,\n" +
                    "and enjoin one another to compassion.");
            ayat.add("18\n" +
                    "أُولٰئِكَ أَصحابُ المَيمَنَةِ\n" +
                    "TRANSLITERATION\n" +
                    "ʾulāʾika ʾaṣḥābu l-maymanati\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "They are the People of the Right Hand.");
            ayat.add("19\n" +
                    "وَالَّذينَ كَفَروا بِآياتِنا هُم أَصحابُ المَشأَمَةِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-lladhīna kafarū bi-ʾāyātinā hum ʾaṣḥābu l-mashʾamati\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "But those who defy Our signs,\n" +
                    "they are the People of the Left Hand.");
            ayat.add("20\n" +
                    "عَلَيهِم نارٌ مُؤصَدَةٌ\n" +
                    "TRANSLITERATION\n" +
                    "ʿalayhim nārun muʾṣadatun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "[Imposed] upon them will be a closed Fire.");
        }
        else if (surahName.equals("91. Ash-Shams"))
        {
            setTitle("Ash-Shams(الشمس) : The Sun");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "وَالشَّمسِ وَضُحاها\n" +
                    "TRANSLITERATION\n" +
                    "wa-sh-shamsi wa-ḍuḥāhā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "By the sun and her forenoon splendour,");
            ayat.add("2\n" +
                    "وَالقَمَرِ إِذا تَلاها\n" +
                    "TRANSLITERATION\n" +
                    "wa-l-qamari ʾidhā talāhā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "by the moon when he follows her,");
            ayat.add("3\n" +
                    "وَالنَّهارِ إِذا جَلّاها\n" +
                    "TRANSLITERATION\n" +
                    "wa-n-nahāri ʾidhā jallāhā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "by the day when it reveals her,");
            ayat.add("4\n" +
                    "وَاللَّيلِ إِذا يَغشاها\n" +
                    "TRANSLITERATION\n" +
                    "wa-l-layli ʾidhā yaghshāhā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "by the night when it covers her,");
            ayat.add("5\n" +
                    "وَالسَّماءِ وَما بَناها\n" +
                    "TRANSLITERATION\n" +
                    "wa-s-samāʾi wa-mā banāhā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "by the sky and Him who built it,");
            ayat.add("6\n" +
                    "وَالأَرضِ وَما طَحاها\n" +
                    "TRANSLITERATION\n" +
                    "wa-l-ʾarḍi wa-mā ṭaḥāhā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "by the earth and Him who spread it,");
            ayat.add("7\n" +
                    "وَنَفسٍ وَما سَوّاها\n" +
                    "TRANSLITERATION\n" +
                    "wa-nafsin wa-mā sawwāhā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "by the soul and Him who fashioned it,");
            ayat.add("8\n" +
                    "فَأَلهَمَها فُجورَها وَتَقواها\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾalhamahā fujūrahā wa-taqwāhā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and inspired it with\n" +
                    "[discernment between] its virtues and vices");
            ayat.add("9\n" +
                    "قَد أَفلَحَ مَن زَكّاها\n" +
                    "TRANSLITERATION\n" +
                    "qad ʾaflaḥa man zakkāhā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "one who purifies it is felicitous");
            ayat.add("10\n" +
                    "وَقَد خابَ مَن دَسّاها\n" +
                    "TRANSLITERATION\n" +
                    "wa-qad khāba man dassāhā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and one who betrays it fails.");
            ayat.add("11\n" +
                    "كَذَّبَت ثَمودُ بِطَغواها\n" +
                    "TRANSLITERATION\n" +
                    "kadhdhabat thamūdu bi-ṭaghwāhā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The [people of] Thamūd denied [Allah’s signs]\n" +
                    "out of their rebellion,");
            ayat.add("12\n" +
                    "إِذِ انبَعَثَ أَشقاها\n" +
                    "TRANSLITERATION\n" +
                    "ʾidhi nbaʿatha ʾashqāhā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "when the most wretched of them rose up.");
            ayat.add("13\n" +
                    "فَقالَ لَهُم رَسولُ اللَّهِ ناقَةَ اللَّهِ وَسُقياها\n" +
                    "TRANSLITERATION\n" +
                    "fa-qāla lahum rasūlu llāhi nāqata llāhi wa-suqyāhā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "But then the apostle of Allah said to them,\n" +
                    "‘Let Allah’s she-camel drink!’");
            ayat.add("14\n" +
                    "فَكَذَّبوهُ فَعَقَروها فَدَمدَمَ عَلَيهِم رَبُّهُم بِذَنبِهِم فَسَوّاها\n" +
                    "TRANSLITERATION\n" +
                    "fa-kadhdhabūhu fa-ʿaqarūhā fa-damdama ʿalayhim rabbuhum bi-dhanbihim fa-sawwāhā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "But they impugned him and then hamstrung her,\n" +
                    "so their Lord took them unawares by night1\n" +
                    "because of their sin,\n" +
                    "and levelled it.");
            ayat.add("15\n" +
                    "وَلا يَخافُ عُقباها\n" +
                    "TRANSLITERATION\n" +
                    "wa-lā yakhāfu ʿuqbāhā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And He does not fear its outcome.");
        }
        else if (surahName.equals("92. Al-Lail"))
        {
            setTitle("Al-Lail(الليل) : The Night");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "وَاللَّيلِ إِذا يَغشىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-l-layli ʾidhā yaghshā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "By the night when it envelops,");
            ayat.add("2\n" +
                    "وَالنَّهارِ إِذا تَجَلّىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-n-nahāri ʾidhā tajallā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "by the day when it brightens,");
            ayat.add("3\n" +
                    "وَما خَلَقَ الذَّكَرَ وَالأُنثىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-mā khalaqa dh-dhakara wa-l-ʾunthā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "by Him who created the male and the female:");
            ayat.add("4\n" +
                    "إِنَّ سَعيَكُم لَشَتّىٰ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna saʿyakum la-shattā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "your endeavours are indeed unlike.");
            ayat.add("5\n" +
                    "فَأَمّا مَن أَعطىٰ وَاتَّقىٰ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾammā man ʾaʿṭā wa-ttaqā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "As for him who gives and is Godwary");
            ayat.add("6\n" +
                    "وَصَدَّقَ بِالحُسنىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ṣaddaqa bi-l-ḥusnā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and confirms the best promise,");
            ayat.add("7\n" +
                    "فَسَنُيَسِّرُهُ لِليُسرىٰ\n" +
                    "TRANSLITERATION\n" +
                    "fa-sa-nuyassiruhū li-l-yusrā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "We shall surely ease him into facility.");
            ayat.add("8\n" +
                    "وَأَمّا مَن بَخِلَ وَاستَغنىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾammā man bakhila wa-staghnā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "But as for him who is stingy\n" +
                    "and self-complacent,");
            ayat.add("9\n" +
                    "وَكَذَّبَ بِالحُسنىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-kadhdhaba bi-l-ḥusnā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and denies the best promise,");
            ayat.add("10\n" +
                    "فَسَنُيَسِّرُهُ لِلعُسرىٰ\n" +
                    "TRANSLITERATION\n" +
                    "fa-sa-nuyassiruhū li-l-ʿusrā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "We shall surely ease him into hardship.");
            ayat.add("11\n" +
                    "وَما يُغني عَنهُ مالُهُ إِذا تَرَدّىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-mā yughnī ʿanhu māluhū ʾidhā taraddā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "His wealth shall not avail him when he perishes.");
            ayat.add("12\n" +
                    "إِنَّ عَلَينا لَلهُدىٰ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna ʿalaynā la-l-hudā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed with Us rests guidance,");
            ayat.add("13\n" +
                    "وَإِنَّ لَنا لَلآخِرَةَ وَالأولىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾinnā lanā la-l-ʾākhirata wa-l-ʾūlā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and indeed to Us belong the world and the Hereafter.");
            ayat.add("14\n" +
                    "فَأَنذَرتُكُم نارًا تَلَظّىٰ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾandhartukum nāran talaẓẓā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So I warn you of a blazing fire,");
            ayat.add("15\n" +
                    "لا يَصلاها إِلَّا الأَشقَى\n" +
                    "TRANSLITERATION\n" +
                    "lā yaṣlāhā ʾillā l-ʾashqā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "which none shall enter except the most wretched");
            ayat.add("16\n" +
                    "الَّذي كَذَّبَ وَتَوَلّىٰ\n" +
                    "TRANSLITERATION\n" +
                    "alladhī kadhdhaba wa-tawallā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "he who denies and turns back.");
            ayat.add("17\n" +
                    "وَسَيُجَنَّبُهَا الأَتقَى\n" +
                    "TRANSLITERATION\n" +
                    "wa-sa-yujannabuhā l-ʾatqā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The Godwary shall be spared it");
            ayat.add("18\n" +
                    "الَّذي يُؤتي مالَهُ يَتَزَكّىٰ\n" +
                    "TRANSLITERATION\n" +
                    "alladhī yuʾtī mālahū yatazakkā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "he who gives his wealth to purify himself");
            ayat.add("19\n" +
                    "وَما لِأَحَدٍ عِندَهُ مِن نِعمَةٍ تُجزىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-mā li-ʾaḥadin ʿindahū min niʿmatin tujzā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and does not expect any reward from anyone,");
            ayat.add("20\n" +
                    "إِلَّا ابتِغاءَ وَجهِ رَبِّهِ الأَعلىٰ\n" +
                    "TRANSLITERATION\n" +
                    "ʾillā btighāʾa wajhi rabbihi l-ʾaʿlā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "but seeks only the pleasure of his Lord,\n" +
                    "the Most Exalted,");
            ayat.add("21\n" +
                    "وَلَسَوفَ يَرضىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-la-sawfa yarḍā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and, surely, soon he will be well-pleased.");
        }
        else if (surahName.equals("93. Ad-Dhuha"))
        {
            setTitle("Ad-Dhuha(الضحى) : The Morning Brightness");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "وَالضُّحىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ḍ-ḍuḥā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "By the morning brightness,");
            ayat.add("2\n" +
                    "وَاللَّيلِ إِذا سَجىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-l-layli ʾidhā sajā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "by the night when it is calm!");
            ayat.add("3\n" +
                    "ما وَدَّعَكَ رَبُّكَ وَما قَلىٰ\n" +
                    "TRANSLITERATION\n" +
                    "mā waddaʿaka rabbuka wa-mā qalā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Your Lord has neither forsaken you\n" +
                    "nor is He displeased with you");
            ayat.add("4\n" +
                    "وَلَلآخِرَةُ خَيرٌ لَكَ مِنَ الأولىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-la-l-ʾākhiratu khayrun laka mina l-ʾūlā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and the Hereafter shall be better for you than the world");
            ayat.add("5\n" +
                    "وَلَسَوفَ يُعطيكَ رَبُّكَ فَتَرضىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-la-sawfa yuʿṭīka rabbuka fa-tarḍā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Soon your Lord will give you [that with which]\n" +
                    "you will be pleased.");
            ayat.add("6\n" +
                    "أَلَم يَجِدكَ يَتيمًا فَآوىٰ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-lam yajidka yatīman fa-ʾāwā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Did He not find you an orphan, and shelter you?");
            ayat.add("7\n" +
                    "وَوَجَدَكَ ضالًّا فَهَدىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-wajadaka ḍāllan fa-hadā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Did He not find you astray, and guide you?");
            ayat.add("8\n" +
                    "وَوَجَدَكَ عائِلًا فَأَغنىٰ\n" +
                    "TRANSLITERATION\n" +
                    "wa-wajadaka ʿāʾilan fa-ʾaghnā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Did He not find you needy, and enrich you?");
            ayat.add("9\n" +
                    "فَأَمَّا اليَتيمَ فَلا تَقهَر\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾammā l-yatīma fa-lā taqhar\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So, as for the orphan, do not oppress him;");
            ayat.add("10\n" +
                    "وَأَمَّا السّائِلَ فَلا تَنهَر\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾammā s-sāʾila fa-lā tanhar\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and as for the beggar, do not chide him;");
            ayat.add("11\n" +
                    "وَأَمّا بِنِعمَةِ رَبِّكَ فَحَدِّث\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾammā bi-niʿmati rabbika fa-ḥaddith\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and as for your Lord’s blessing,\n" +
                    "proclaim it!");
        }
        else if (surahName.equals("94. Al-Inshirah"))
        {
            setTitle("Al-Inshirah(الإنشراح) : The Solace");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "أَلَم نَشرَح لَكَ صَدرَكَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-lam nashraḥ laka ṣadraka\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Did We not open your breast for you");
            ayat.add("2\n" +
                    "وَوَضَعنا عَنكَ وِزرَكَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-waḍaʿnā ʿanka wizraka\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and relieve you of your burden");
            ayat.add("3\n" +
                    "الَّذي أَنقَضَ ظَهرَكَ\n" +
                    "TRANSLITERATION\n" +
                    "alladhī ʾanqaḍa ẓahraka\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "which [almost] broke your back?");
            ayat.add("4\n" +
                    "وَرَفَعنا لَكَ ذِكرَكَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-rafaʿnā laka dhikraka\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Did We not exalt your name?");
            ayat.add("5\n" +
                    "فَإِنَّ مَعَ العُسرِ يُسرًا\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾinna maʿa l-ʿusri yusran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed ease accompanies hardship.");
            ayat.add("6\n" +
                    "إِنَّ مَعَ العُسرِ يُسرًا\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna maʿa l-ʿusri yusran\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed ease accompanies hardship.");
            ayat.add("7\n" +
                    "فَإِذا فَرَغتَ فَانصَب\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾidhā faraghta fa-nṣab\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So when you are done, appoint,");
            ayat.add("8\n" +
                    "وَإِلىٰ رَبِّكَ فَارغَب\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾilā rabbika fa-rghab\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and turn eagerly to your Lord.");
        }
        else if (surahName.equals("95. At-Teen"))
        {
            setTitle("At-Teen(التين) : The Fig");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "وَالتّينِ وَالزَّيتونِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-t-tīni wa-z-zaytūni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "By the fig and the olive,");
            ayat.add("2\n" +
                    "وَطورِ سينينَ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ṭūri sīnīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "by Mount Sinai,");
            ayat.add("3\n" +
                    "وَهٰذَا البَلَدِ الأَمينِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-hādhā l-baladi l-ʾamīni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "by this secure town");
            ayat.add("4\n" +
                    "لَقَد خَلَقنَا الإِنسانَ في أَحسَنِ تَقويمٍ\n" +
                    "TRANSLITERATION\n" +
                    "la-qad khalaqnā l-ʾinsāna fī ʾaḥsani taqwīmin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "We certainly created man\n" +
                    "in the best of forms");
            ayat.add("5\n" +
                    "ثُمَّ رَدَدناهُ أَسفَلَ سافِلينَ\n" +
                    "TRANSLITERATION\n" +
                    "thumma radadnāhu ʾasfala sāfilīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "then We relegated him to the lowest of the low,");
            ayat.add("6\n" +
                    "إِلَّا الَّذينَ آمَنوا وَعَمِلُوا الصّالِحاتِ فَلَهُم أَجرٌ غَيرُ مَمنونٍ\n" +
                    "TRANSLITERATION\n" +
                    "ʾillā lladhīna ʾāmanū wa-ʿamilū ṣ-ṣāliḥāti fa-lahum ʾajrun ghayru mamnūnin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "except those who have faith and do righteous deeds.\n" +
                    "There will be an everlasting reward for them.");
            ayat.add("7\n" +
                    "فَما يُكَذِّبُكَ بَعدُ بِالدّينِ\n" +
                    "TRANSLITERATION\n" +
                    "fa-mā yukadhdhibuka baʿdu bi-d-dīni\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So what makes you deny the Retribution?");
            ayat.add("8\n" +
                    "أَلَيسَ اللَّهُ بِأَحكَمِ الحاكِمينَ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-laysa llāhu bi-ʾaḥkamil-ḥākimīna\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Is not Allah the fairest of all judges?");
        }
        else if (surahName.equals("96. Al-`Alaq"))
        {
            setTitle("Al-`Alaq(العلق) : The Clinging Mass");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "اقرَأ بِاسمِ رَبِّكَ الَّذي خَلَقَ\n" +
                    "TRANSLITERATION\n" +
                    "iqraʾ bi-smi rabbika lladhī khalaqa\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Read in the Name of your Lord who created;");
            ayat.add("2\n" +
                    "خَلَقَ الإِنسانَ مِن عَلَقٍ\n" +
                    "TRANSLITERATION\n" +
                    "khalaqa l-ʾinsāna min ʿalaqin-i\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "created man from a clinging mass.");
            ayat.add("3\n" +
                    "اقرَأ وَرَبُّكَ الأَكرَمُ\n" +
                    "TRANSLITERATION\n" +
                    "iqraʾ wa-rabbuka l-ʾakramu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Read, and your Lord is the most generous,");
            ayat.add("4\n" +
                    "الَّذي عَلَّمَ بِالقَلَمِ\n" +
                    "TRANSLITERATION\n" +
                    "alladhī ʿallama bi-l-qalami\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "who taught by the pen,");
            ayat.add("5\n" +
                    "عَلَّمَ الإِنسانَ ما لَم يَعلَم\n" +
                    "TRANSLITERATION\n" +
                    "ʿallama l-ʾinsāna mā lam yaʿlam\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "taught man what he did not know.");
            ayat.add("6\n" +
                    "كَلّا إِنَّ الإِنسانَ لَيَطغىٰ\n" +
                    "TRANSLITERATION\n" +
                    "kallā ʾinna l-ʾinsāna la-yaṭghā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed man becomes rebellious");
            ayat.add("7\n" +
                    "أَن رَآهُ استَغنىٰ\n" +
                    "TRANSLITERATION\n" +
                    "ʾan raʾāhu staghnā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "when he considers himself without need.");
            ayat.add("8\n" +
                    "إِنَّ إِلىٰ رَبِّكَ الرُّجعىٰ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna ʾilā rabbika r-rujʿā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed to your Lord is the return.");
            ayat.add("9\n" +
                    "أَرَأَيتَ الَّذي يَنهىٰ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-raʾayta lladhī yanhā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Tell me, he who forbids");
            ayat.add("10\n" +
                    "عَبدًا إِذا صَلّىٰ\n" +
                    "TRANSLITERATION\n" +
                    "ʿabdan ʾidhā ṣallā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "a servant when he prays,");
            ayat.add("11\n" +
                    "أَرَأَيتَ إِن كانَ عَلَى الهُدىٰ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-raʾayta ʾin kāna ʿalā l-hudā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "tell me, should he be on [true] guidance");
            ayat.add("12\n" +
                    "أَو أَمَرَ بِالتَّقوىٰ\n" +
                    "TRANSLITERATION\n" +
                    "ʾaw ʾamara bi-t-taqwā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "or bid [others] to Godwariness,");
            ayat.add("13\n" +
                    "أَرَأَيتَ إِن كَذَّبَ وَتَوَلّىٰ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-raʾayta ʾin kadhdhaba wa-tawallā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "tell me, should he call him a liar and turn away");
            ayat.add("14\n" +
                    "أَلَم يَعلَم بِأَنَّ اللَّهَ يَرىٰ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-lam yaʿlam bi-ʾanna llāha yarā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "—does he not know that Allah sees?");
            ayat.add("15\n" +
                    "كَلّا لَئِن لَم يَنتَهِ لَنَسفَعًا بِالنّاصِيَةِ\n" +
                    "TRANSLITERATION\n" +
                    "kallā la-ʾin lam yantahi la-nasfaʿan bi-n-nāṣiyati\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "No indeed! If he does not stop,\n" +
                    "We shall seize him by the forelock,");
            ayat.add("16\n" +
                    "ناصِيَةٍ كاذِبَةٍ خاطِئَةٍ\n" +
                    "TRANSLITERATION\n" +
                    "nāṣiyatin kādhibatin khāṭiʾatin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "a lying, sinful forelock!");
            ayat.add("17\n" +
                    "فَليَدعُ نادِيَهُ\n" +
                    "TRANSLITERATION\n" +
                    "fa-l-yadʿu nādiyahū\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Then let him call out his gang!");
            ayat.add("18\n" +
                    "سَنَدعُ الزَّبانِيَةَ\n" +
                    "TRANSLITERATION\n" +
                    "sa-nadʿu z-zabāniyata\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "We [too] shall call the keepers of hell.");
            ayat.add("19\n" +
                    "كَلّا لا تُطِعهُ وَاسجُد وَاقتَرِب ۩\n" +
                    "TRANSLITERATION\n" +
                    "kallā lā tuṭiʿhu wa-sjud wa-qtarib\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "No indeed! Do not obey him,\n" +
                    "but prostrate and draw near [to Allah]!");
        }
        else if (surahName.equals("97. Al-Qadr"))
        {
            setTitle("Al-Qadr(القدر) : The Ordainment");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "إِنّا أَنزَلناهُ في لَيلَةِ القَدرِ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnā ʾanzalnāhu fī laylati l-qadri\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed We sent it1 down\n" +
                    "on the Night of Ordainment.");
            ayat.add("2\n" +
                    "وَما أَدراكَ ما لَيلَةُ القَدرِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-mā ʾadrāka mā laylatu l-qadri\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "What will show you\n" +
                    "what is the Night of Ordainment?");
            ayat.add("3\n" +
                    "لَيلَةُ القَدرِ خَيرٌ مِن أَلفِ شَهرٍ\n" +
                    "TRANSLITERATION\n" +
                    "laylatu l-qadri khayrun min ʾalfi shahrin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The Night of Ordainment\n" +
                    "is better than a thousand months.");
            ayat.add("4\n" +
                    "تَنَزَّلُ المَلائِكَةُ وَالرّوحُ فيها بِإِذنِ رَبِّهِم مِن كُلِّ أَمرٍ\n" +
                    "TRANSLITERATION\n" +
                    "tanazzalu l-malāʾikatu wa-r-rūḥu fīhā bi-ʾidhni rabbihim min kulli ʾamrin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "In it the angels and the Spirit descend,\n" +
                    "by the leave of their Lord,\n" +
                    "with every command.");
            ayat.add("5\n" +
                    "سَلامٌ هِيَ حَتّىٰ مَطلَعِ الفَجرِ\n" +
                    "TRANSLITERATION\n" +
                    "salāmun hiya ḥattā maṭlaʿi l-fajri\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "It is peaceful until the rising of the dawn.");
        }
        else if (surahName.equals("98. Al-Bayyinah"))
        {
            setTitle("Al-Bayyinah(البينة) : The Proof");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "لَم يَكُنِ الَّذينَ كَفَروا مِن أَهلِ الكِتابِ وَالمُشرِكينَ مُنفَكّينَ حَتّىٰ تَأتِيَهُمُ البَيِّنَةُ\n" +
                    "TRANSLITERATION\n" +
                    "lam yakuni lladhīna kafarū min ʾahli l-kitābi wa-l-mushrikīna munfakkīna ḥattā taʾtiyahumu l-bayyinatu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The faithless\n" +
                    "from among the People of the Book\n" +
                    "and the polytheists\n" +
                    "were not set apart\n" +
                    "until the proof had come to them");
            ayat.add("2\n" +
                    "رَسولٌ مِنَ اللَّهِ يَتلو صُحُفًا مُطَهَّرَةً\n" +
                    "TRANSLITERATION\n" +
                    "rasūlun mina llāhi yatlū ṣuḥufan muṭahharatan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "an apostle from Allah\n" +
                    "reciting impeccable scriptures,");
            ayat.add("3\n" +
                    "فيها كُتُبٌ قَيِّمَةٌ\n" +
                    "TRANSLITERATION\n" +
                    "fīhā kutubun qayyimatun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "wherein are upright writings.");
            ayat.add("4\n" +
                    "وَما تَفَرَّقَ الَّذينَ أوتُوا الكِتابَ إِلّا مِن بَعدِ ما جاءَتهُمُ البَيِّنَةُ\n" +
                    "TRANSLITERATION\n" +
                    "wa-mā tafarraqa lladhīna ʾūtū l-kitāba ʾillā min baʿdi mā jāʾathumu l-bayyinatu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And those who were given the Book did not divide,\n" +
                    "except after the proof had come to them.");
            ayat.add("5\n" +
                    "وَما أُمِروا إِلّا لِيَعبُدُوا اللَّهَ مُخلِصينَ لَهُ الدّينَ حُنَفاءَ وَيُقيمُوا الصَّلاةَ وَيُؤتُوا الزَّكاةَ ۚ وَذٰلِكَ دينُ القَيِّمَةِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-mā ʾumirū ʾillā li-yaʿbudū llāha mukhliṣīna lahu d-dīna ḥunafāʾa wa-yuqīmū ṣ-ṣalāta wa-yuʾtū z-zakāta wa-dhālika dīnu l-qayyimati\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Yet they were not commanded except to worship Allah,\n" +
                    "dedicating their faith to Him\n" +
                    "as men of pure faith,\n" +
                    "and to maintain the prayer and pay the zakāt.\n" +
                    "That is the upright religion.");
            ayat.add("6\n" +
                    "إِنَّ الَّذينَ كَفَروا مِن أَهلِ الكِتابِ وَالمُشرِكينَ في نارِ جَهَنَّمَ خالِدينَ فيها ۚ أُولٰئِكَ هُم شَرُّ البَرِيَّةِ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna lladhīna kafarū min ʾahli l-kitābi wa-l-mushrikīna fī nāri jahannama khālidīna fīhā ʾulāʾika hum sharru l-bariyyati\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed the faithless\n" +
                    "from among the People of the Book\n" +
                    "and the polytheists\n" +
                    "will be in the fire of hell,\n" +
                    "to remain in it [forever].\n" +
                    "It is they who are the worst of creatures.");
            ayat.add("7\n" +
                    "إِنَّ الَّذينَ آمَنوا وَعَمِلُوا الصّالِحاتِ أُولٰئِكَ هُم خَيرُ البَرِيَّةِ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna lladhīna ʾāmanū wa-ʿamilū ṣ-ṣāliḥāti ʾulāʾika hum khayru l-bariyyati\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed those who have faith and do righteous deeds\n" +
                    "it is they who are the best of creatures.");
            ayat.add("8\n" +
                    "جَزاؤُهُم عِندَ رَبِّهِم جَنّاتُ عَدنٍ تَجري مِن تَحتِهَا الأَنهارُ خالِدينَ فيها أَبَدًا ۖ رَضِيَ اللَّهُ عَنهُم وَرَضوا عَنهُ ۚ ذٰلِكَ لِمَن خَشِيَ رَبَّهُ\n" +
                    "TRANSLITERATION\n" +
                    "jazāʾuhum ʿinda rabbihim jannātu ʿadnin tajrī min taḥtihā l-ʾanhāru khālidīna fīhā ʾabadan raḍiya llāhu ʿanhum wa-raḍū ʿanhu dhālika li-man khashiya rabbahū\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Their reward, near their Lord,\n" +
                    "is the Gardens of Eden,\n" +
                    "with streams running in them,\n" +
                    "to remain in them forever.\n" +
                    "Allah is pleased with them,\n" +
                    "and they are pleased with Him.\n" +
                    "That is for those who fear their Lord.");
        }
        else if (surahName.equals("99. Az-Zalzala"))
        {
            setTitle("Az-Zalzala(الزلزلة) : The Quake");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "إِذا زُلزِلَتِ الأَرضُ زِلزالَها\n" +
                    "TRANSLITERATION\n" +
                    "ʾidhā zulzilati l-ʾarḍu zilzālahā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "When the earth is rocked with a terrible quake");
            ayat.add("2\n" +
                    "وَأَخرَجَتِ الأَرضُ أَثقالَها\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾakhrajati l-ʾarḍu ʾathqālahā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and the earth discharges her burdens,");
            ayat.add("3\n" +
                    "وَقالَ الإِنسانُ ما لَها\n" +
                    "TRANSLITERATION\n" +
                    "wa-qāla l-ʾinsānu mā lahā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and man says, ‘What is the matter with her?’");
            ayat.add("4\n" +
                    "يَومَئِذٍ تُحَدِّثُ أَخبارَها\n" +
                    "TRANSLITERATION\n" +
                    "yawmaʾidhin tuḥaddithu ʾakhbārahā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "On that day she will relate her chronicles");
            ayat.add("5\n" +
                    "بِأَنَّ رَبَّكَ أَوحىٰ لَها\n" +
                    "TRANSLITERATION\n" +
                    "bi-ʾanna rabbaka ʾawḥā lahā\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "for her Lord will have inspired her.");
            ayat.add("6\n" +
                    "يَومَئِذٍ يَصدُرُ النّاسُ أَشتاتًا لِيُرَوا أَعمالَهُم\n" +
                    "TRANSLITERATION\n" +
                    "yawmaʾidhin yaṣduru n-nāsu ʾashtātan li-yuraw ʾaʿmālahum\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "On that day, mankind will issue forth in various groups1\n" +
                    "to be shown their deeds.");
            ayat.add("7\n" +
                    "فَمَن يَعمَل مِثقالَ ذَرَّةٍ خَيرًا يَرَهُ\n" +
                    "TRANSLITERATION\n" +
                    "fa-man yaʿmal mithqāla dharratin khayran yarahū\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "So whoever does an atom’s weight of good\n" +
                    "will see it,");
            ayat.add("8\n" +
                    "وَمَن يَعمَل مِثقالَ ذَرَّةٍ شَرًّا يَرَهُ\n" +
                    "TRANSLITERATION\n" +
                    "wa-man yaʿmal mithqāla dharratin sharran yarahū\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and whoever does an atom’s weight of evil\n" +
                    "will see it.");
        }
        else if (surahName.equals("100. Al-Adiyat"))
        {
            setTitle("Al-Adiyat(العاديات) : The Chargers");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "وَالعادِياتِ ضَبحًا\n" +
                    "TRANSLITERATION\n" +
                    "wa-l-ʿādiyāti ḍabḥan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "By the snorting chargers,");
            ayat.add("2\n" +
                    "فَالمورِياتِ قَدحًا\n" +
                    "TRANSLITERATION\n" +
                    "fa-l-mūriyāti qadḥan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "by the strikers of sparks [with their hoofs],");
            ayat.add("3\n" +
                    "فَالمُغيراتِ صُبحًا\n" +
                    "TRANSLITERATION\n" +
                    "fa-l-mughīrāti ṣubḥan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "by the raiders at dawn,");
            ayat.add("4\n" +
                    "فَأَثَرنَ بِهِ نَقعًا\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾatharna bihī naqʿan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "raising therein a trail of dust,");
            ayat.add("5\n" +
                    "فَوَسَطنَ بِهِ جَمعًا\n" +
                    "TRANSLITERATION\n" +
                    "fa-wasaṭna bihī jamʿan\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and cleaving therein a host!");
            ayat.add("6\n" +
                    "إِنَّ الإِنسانَ لِرَبِّهِ لَكَنودٌ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna l-ʾinsāna li-rabbihī la-kanūdun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Indeed man is ungrateful to his Lord,");
            ayat.add("7\n" +
                    "وَإِنَّهُ عَلىٰ ذٰلِكَ لَشَهيدٌ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾinnahū ʿalā dhālika la-shahīdun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and indeed he is [himself] witness to that!");
            ayat.add("8\n" +
                    "وَإِنَّهُ لِحُبِّ الخَيرِ لَشَديدٌ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾinnahū li-ḥubbi l-khayri la-shadīdun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "He is indeed avid in the love of wealth.");
            ayat.add("9\n" +
                    "۞ أَفَلا يَعلَمُ إِذا بُعثِرَ ما فِي القُبورِ\n" +
                    "TRANSLITERATION\n" +
                    "ʾa-fa-lā yaʿlamu ʾidhā buʿthira mā fī l-qubūri\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "Does he not know,\n" +
                    "when what is in the graves is turned over,");
            ayat.add("10\n" +
                    "وَحُصِّلَ ما فِي الصُّدورِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ḥuṣṣila mā fī ṣ-ṣudūri\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and what is in the breasts is divulged,");
            ayat.add("11\n" +
                    "إِنَّ رَبَّهُم بِهِم يَومَئِذٍ لَخَبيرٌ\n" +
                    "TRANSLITERATION\n" +
                    "ʾinna rabbahum bihim yawmaʾidhin la-khabīrun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "indeed their Lord\n" +
                    "will be best aware of them on that day?");
        }
        else if (surahName.equals("101. Al-Qari`ah"))
        {
            setTitle("Al-Qari`ah(القارعة) : The Catastrophe");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n" +
                    "القارِعَةُ\n" +
                    "TRANSLITERATION\n" +
                    "al-qāriʿatu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The Catastrophe!");
            ayat.add("2\n" +
                    "مَا القارِعَةُ\n" +
                    "TRANSLITERATION\n" +
                    "mā l-qāriʿatu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "What is the Catastrophe?");
            ayat.add("3\n" +
                    "وَما أَدراكَ مَا القارِعَةُ\n" +
                    "TRANSLITERATION\n" +
                    "wa-mā ʾadrāka mā l-qāriʿatu\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "What will show you what is the Catastrophe?");
            ayat.add("4\n" +
                    "يَومَ يَكونُ النّاسُ كَالفَراشِ المَبثوثِ\n" +
                    "TRANSLITERATION\n" +
                    "yawma yakūnu n-nāsu ka-l-farāshi l-mabthūthi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "The day mankind will be\n" +
                    "like scattered moths,");
            ayat.add("5\n" +
                    "وَتَكونُ الجِبالُ كَالعِهنِ المَنفوشِ\n" +
                    "TRANSLITERATION\n" +
                    "wa-takūnu l-jibālu ka-l-ʿihni l-manfūshi\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "and the mountains will be\n" +
                    "like carded wool.");
            ayat.add("6\n" +
                    "فَأَمّا مَن ثَقُلَت مَوازينُهُ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾammā man thaqulat mawāzīnuhū\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "As for him whose deeds weigh heavy in the scales,");
            ayat.add("7\n" +
                    "فَهُوَ في عيشَةٍ راضِيَةٍ\n" +
                    "TRANSLITERATION\n" +
                    "fa-huwa fī ʿīshatin rāḍiyatin\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "he will have a pleasing life.");
            ayat.add("8\n" +
                    "وَأَمّا مَن خَفَّت مَوازينُهُ\n" +
                    "TRANSLITERATION\n" +
                    "wa-ʾammā man khaffat mawāzīnuhū\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "But as for him whose deeds weigh light in the scales,");
            ayat.add("9\n" +
                    "فَأُمُّهُ هاوِيَةٌ\n" +
                    "TRANSLITERATION\n" +
                    "fa-ʾummuhū hāwiyatun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "his home will be the Abyss.");
            ayat.add("10\n" +
                    "وَما أَدراكَ ما هِيَه\n" +
                    "TRANSLITERATION\n" +
                    "wa-mā ʾadrāka mā hiyah\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "And what will show you what it is?");
            ayat.add("11\n" +
                    "نارٌ حامِيَةٌ\n" +
                    "TRANSLITERATION\n" +
                    "nārun ḥāmiyatun\n" +
                    "\n" +
                    "TRANSLATION\n" +
                    "It is a scorching fire!");
        }
        else if (surahName.equals("102. At-Takathur"))
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.a );
            setTitle("At-Takathur(التكاثر) : Rivalry");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n\n" +
                    "أَلهاكُمُ التَّكاثُرُ\n\n" +
                    "TRANSLITERATION :\n" +
                    "ʾalhākumu t-takāthuru\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "Rivalry [and vainglory] distracted you");
            ayat.add("2\n\n" +
                    "حَتّىٰ زُرتُمُ المَقابِرَ\n\n" +
                    "TRANSLITERATION :\n" +
                    "ḥattā zurtumu l-maqābira\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "until you visited [even] the graves.");
            ayat.add("3\n\n" +
                    "كَلّا سَوفَ تَعلَمونَ\n\n" +
                    "TRANSLITERATION :\n" +
                    "kallā sawfa taʿlamūna\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "No indeed!\n" +
                    "Soon you will know!");
            ayat.add("4\n\n" +
                    "ثُمَّ كَلّا سَوفَ تَعلَمونَ\n\n" +
                    "TRANSLITERATION :\n" +
                    "thumma kallā sawfa taʿlamūna\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "Again, no indeed!\n" +
                    "Soon you will know!");
            ayat.add("5\n\n" +
                    "كَلّا لَو تَعلَمونَ عِلمَ اليَقينِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "kallā law taʿlamūna ʿilma l-yaqīni\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "No indeed!\n" +
                    "Were you to know with certain knowledge,");
            ayat.add("6\n\n" +
                    "لَتَرَوُنَّ الجَحيمَ\n\n" +
                    "TRANSLITERATION :\n" +
                    "la-tarawunna l-jaḥīma\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "you would surely see hell.");
            ayat.add("7\n\n" +
                    "ثُمَّ لَتَرَوُنَّها عَينَ اليَقينِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "thumma la-tarawunnahā ʿayna l-yaqīni\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "Again, you will surely see it with the eye of certainty.");
            ayat.add("8\n\n" +
                    "ثُمَّ لَتُسأَلُنَّ يَومَئِذٍ عَنِ النَّعيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "thumma la-tusʾalunna yawmaʾidhin ʿani n-naʿīmi\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "Then, that day, you will surely be questioned\n" +
                    "concerning the blessing.");
        }
        else if (surahName.equals("103. Al-Asr"))
        {
            setTitle("Al-Asr(العصر) : Time");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n\n" +
                    "وَالعَصرِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "wa-l-ʿaṣri\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "By Time!");
            ayat.add("2\n\n" +
                    "إِنَّ الإِنسانَ لَفي خُسرٍ\n\n" +
                    "TRANSLITERATION :\n" +
                    "ʾinna l-ʾinsāna la-fī khusrin\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "Indeed man is in loss,");
            ayat.add("3\n\n" +
                    "إِلَّا الَّذينَ آمَنوا وَعَمِلُوا الصّالِحاتِ وَتَواصَوا بِالحَقِّ وَتَواصَوا بِالصَّبرِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "ʾillā lladhīna ʾāmanū wa-ʿamilū ṣ-ṣāliḥāti wa-tawāṣaw bi-l-ḥaqqi wa-tawāṣaw bi-ṣ-ṣabri\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "except those who have faith\n" +
                    "and do righteous deeds,\n" +
                    "and enjoin one another to [follow] the truth,\n" +
                    "and enjoin one another to patience.");
        }
        else if (surahName.equals("104. Al-Humazah"))
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.a );
            setTitle("Al-Humazah(الهمزة) : The Scandal-Monger");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n\n" +
                    "وَيلٌ لِكُلِّ هُمَزَةٍ لُمَزَةٍ\n\n" +
                    "TRANSLITERATION :\n" +
                    "waylun li-kulli humazatin lumazatin-i\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "Woe to every scandal-monger and slanderer,");
            ayat.add("2\n\n" +
                    "الَّذي جَمَعَ مالًا وَعَدَّدَهُ\n\n" +
                    "TRANSLITERATION :\n" +
                    "alladhī jamaʿa mālan wa-ʿaddadahū\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "who amasses wealth and counts it over.");
            ayat.add("3\n\n" +
                    "يَحسَبُ أَنَّ مالَهُ أَخلَدَهُ\n\n" +
                    "TRANSLITERATION :\n" +
                    "yaḥsabu ʾanna mālahū ʾakhladahū\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "He supposes his wealth will make him immortal!");
            ayat.add("4\n\n" +
                    "كَلّا ۖ لَيُنبَذَنَّ فِي الحُطَمَةِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "kallā la-yunbadhanna fī l-ḥuṭamati\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "No indeed! He will surely be cast into the Crusher.");
            ayat.add("5\n\n" +
                    "وَما أَدراكَ مَا الحُطَمَةُ\n\n" +
                    "TRANSLITERATION :\n" +
                    "wa-mā ʾadrāka mā l-ḥuṭamatu\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "And what will show you what is the Crusher?");
            ayat.add("6\n\n" +
                    "نارُ اللَّهِ الموقَدَةُ\n\n" +
                    "TRANSLITERATION :\n" +
                    "nāru llāhi l-mūqadatu\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "[It is] the fire of Allah, set ablaze,");
            ayat.add("7\n\n" +
                    "الَّتي تَطَّلِعُ عَلَى الأَفئِدَةِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "allatī taṭṭaliʿu ʿalā l-ʾafʾidati\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "which will overspread the hearts.");
            ayat.add("8\n\n" +
                    "إِنَّها عَلَيهِم مُؤصَدَةٌ\n\n" +
                    "TRANSLITERATION :\n" +
                    "ʾinnahā ʿalayhim muʾṣadatun\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "Indeed it will close in upon them");
            ayat.add("9\n\n" +
                    "في عَمَدٍ مُمَدَّدَةٍ\n\n" +
                    "TRANSLITERATION :\n" +
                    "fī ʿamadin mumaddadatin\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "in outstretched columns.");
        }
        else if (surahName.equals("105. Al-Feel"))
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.a );
            setTitle("Al-Feel(الفيل) : The Elephant");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n\n" +
                    "أَلَم تَرَ كَيفَ فَعَلَ رَبُّكَ بِأَصحابِ الفيلِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "ʾa-lam tara kayfa faʿala rabbuka bi-ʾaṣḥābi l-fīli\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "Have you not regarded how your Lord\n" +
                    "dealt with the Men of the Elephant?");
            ayat.add("2\n\n" +
                    "أَلَم يَجعَل كَيدَهُم في تَضليلٍ\n\n" +
                    "TRANSLITERATION :\n" +
                    "ʾa-lam yajʿal kaydahum fī taḍlīlin\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "Did He not make their stratagems go awry,");
            ayat.add("3\n\n" +
                    "وَأَرسَلَ عَلَيهِم طَيرًا أَبابيلَ\n\n" +
                    "TRANSLITERATION :\n" +
                    "wa-ʾarsala ʿalayhim ṭayran ʾabābīla\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "and send against them flocks of birds");
            ayat.add("4\n\n" +
                    "تَرميهِم بِحِجارَةٍ مِن سِجّيلٍ\n\n" +
                    "TRANSLITERATION :\n" +
                    "tarmīhim bi-ḥijāratin min sijjīlin\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "pelting them with stones of shale,");
            ayat.add("5\n\n" +
                    "فَجَعَلَهُم كَعَصفٍ مَأكولٍ\n\n" +
                    "TRANSLITERATION :\n" +
                    "fa-jaʿalahum ka-ʿaṣfin maʾkūlin\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "thus making them like chewed-up straw?");
        }
        else if (surahName.equals("106. Al-Quraish"))
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.a );
            setTitle("Al-Quraish(قريش) : Quraish");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n\n" +
                    "لِإيلافِ قُرَيشٍ\n" +
                    "TRANSLITERATION :\n" +
                    "li-ʾīlāfi qurayshin\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "[In gratitude] for solidarity among the Quraysh,");
            ayat.add("2\n\n" +
                    "إيلافِهِم رِحلَةَ الشِّتاءِ وَالصَّيفِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "ʾīlāfihim riḥlata sh-shitāʾi wa-ṣ-ṣayfi\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "their solidarity during winter and summer journeys,");
            ayat.add("3\n\n" +
                    "فَليَعبُدوا رَبَّ هٰذَا البَيتِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "fa-l-yaʿbudū rabba hādhā l-bayti\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "let them worship the Lord of this House,");
            ayat.add("4\n\n" +
                    "الَّذي أَطعَمَهُم مِن جوعٍ وَآمَنَهُم مِن خَوفٍ\n\n" +
                    "TRANSLITERATION :\n" +
                    "alladhī ʾaṭʿamahum min jūʿin wa-ʾāmanahum min khawfin\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "who has fed them [and saved them] from hunger,\n" +
                    "and secured them from fear.");
        }
        else if (surahName.equals("107. Al-Maa`oun"))
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.a );
            setTitle("Al-Maa`oun(الماعون) : Aid");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n\n" +
                    "أَرَأَيتَ الَّذي يُكَذِّبُ بِالدّينِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "ʾa-raʾayta lladhī yukadhdhibu bi-d-dīni\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "Did you see him who denies the Retribution?");
            ayat.add("2\n\n" +
                    "فَذٰلِكَ الَّذي يَدُعُّ اليَتيمَ\n\n" +
                    "TRANSLITERATION :\n" +
                    "fa-dhālika lladhī yaduʿʿu l-yatīma\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "That is the one who drives away the orphan,");
            ayat.add("3\n\n" +
                    "وَلا يَحُضُّ عَلىٰ طَعامِ المِسكينِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "wa-lā yaḥuḍḍu ʿalā ṭaʿāmi l-miskīni\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "and does not urge the feeding of the needy.");
            ayat.add("4\n\n" +
                    "فَوَيلٌ لِلمُصَلّينَ\n\n" +
                    "TRANSLITERATION :\n" +
                    "fa-waylun li-l-muṣallīna\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "Woe to them who pray,");
            ayat.add("5\n\n" +
                    "الَّذينَ هُم عَن صَلاتِهِم ساهونَ\n\n" +
                    "TRANSLITERATION :\n" +
                    "alladhīna hum ʿan ṣalātihim sāhūna\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "—those who are heedless of their prayers,");
            ayat.add("6\n\n" +
                    "الَّذينَ هُم يُراءونَ\n\n" +
                    "TRANSLITERATION :\n" +
                    "alladhīna hum yurāʾūna\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "those who show off");
            ayat.add("7\n\n" +
                    "وَيَمنَعونَ الماعونَ\n\n" +
                    "TRANSLITERATION :\n" +
                    "wa-yamnaʿūna l-māʿūna\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "but deny aid.");
        }
        else if (surahName.equals("108. Al-Kawthar"))
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.a );
            setTitle("Al-Kawthar(الكوثر) : Abundance");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n\n" +
                    "إِنّا أَعطَيناكَ الكَوثَرَ\n\n" +
                    "TRANSLITERATION :\n" +
                    "innā aʿṭaynākal-kawthara\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "Indeed We have given you abundance.");
            ayat.add("2\n\n" +
                    "فَصَلِّ لِرَبِّكَ وَانحَر\n\n" +
                    "TRANSLITERATION :\n" +
                    "fa-ṣalli li-rabbika wa-nḥar\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "So pray to your Lord,\n" +
                    "and sacrifice [the sacrificial camel].");
            ayat.add("3\n\n" +
                    "إِنَّ شانِئَكَ هُوَ الأَبتَرُ\n\n" +
                    "TRANSLITERATION\n" +
                    "ʾinnā shāniʾaka huwal-abtaru :\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "Indeed it is your enemy who is without posterity.");
        }
        else if (surahName.equals("109. Al-Kafiroon"))
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.a );
            setTitle("Al-Kafiroon(الكافرون) : The Faithless");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n\n" +
                    "قُل يا أَيُّهَا الكافِرونَ\n\n" +
                    "TRANSLITERATION :\n" +
                    "qul yā-ʾayyuhā l-kāfirūna\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "Say, ‘O faithless ones!");
            ayat.add("2\n\n" +
                    "لا أَعبُدُ ما تَعبُدونَ\n\n" +
                    "TRANSLITERATION :\n" +
                    "lā ʾaʿbudu mā taʿbudūna\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "I do not worship what you worship,");
            ayat.add("3\n\n" +
                    "وَلا أَنتُم عابِدونَ ما أَعبُدُ\n\n" +
                    "TRANSLITERATION :\n" +
                    "wa-lā ʾantum ʿābidūna mā ʾaʿbudu\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "nor do you worship what I worship;");
            ayat.add("4\n\n" +
                    "وَلا أَنا عابِدٌ ما عَبَدتُم\n\n" +
                    "TRANSLITERATION :\n" +
                    "wa-lā ʾana ʿābidun mā ʿabadtum\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "nor will I worship what you have worshiped");
            ayat.add("5\n\n" +
                    "وَلا أَنتُم عابِدونَ ما أَعبُدُ\n\n" +
                    "TRANSLITERATION :\n" +
                    "wa-lā ʾantum ʿābidūna mā ʾaʿbudu\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "nor will you worship what I worship.");
            ayat.add("6\n\n" +
                    "لَكُم دينُكُم وَلِيَ دينِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "lakum dīnukum wa-liya dīni\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "To you your religion, and to me my religion.’");
        }
        else if (surahName.equals("110. An-Nasr"))
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.a );
            setTitle("An-Nasr(النصر) : The Help");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n\n" +
                    "إِذا جاءَ نَصرُ اللَّهِ وَالفَتحُ\n\n" +
                    "TRANSLITERATION :\n" +
                    "ʾidhā jāʾa naṣru llāhi wa-l-fatḥu\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "When Allah’s help comes with victory,");
            ayat.add("2\n\n" +
                    "وَرَأَيتَ النّاسَ يَدخُلونَ في دينِ اللَّهِ أَفواجًا\n\n" +
                    "TRANSLITERATION :\n" +
                    "wa-raʾayta n-nāsa yadkhulūna fī dīni llāhi ʾafwājan\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "and you see the people\n" +
                    "entering Allah’s religion in throngs,");
            ayat.add("3\n\n" +
                    "فَسَبِّح بِحَمدِ رَبِّكَ وَاستَغفِرهُ ۚ إِنَّهُ كانَ تَوّابًا\n\n" +
                    "TRANSLITERATION :\n" +
                    "fa-sabbiḥ bi-ḥamdi rabbika wa-staghfirhu ʾinnahū kāna tawwāban\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "then celebrate the praise of your Lord,\n" +
                    "and plead to Him for forgiveness.\n" +
                    "Indeed He is all-clement.");
        }
        else if (surahName.equals("111. Al-Masad"))
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.a );
            setTitle("Al-Masad(المسد) : Palm Fibre\n");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n\n" +
                    "تَبَّت يَدا أَبي لَهَبٍ وَتَبَّ\n\n" +
                    "TRANSLITERATION :\n" +
                    "tabbat yadā ʾabī lahabin wa-tabba\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "Perish the hands of Abu Lahab, and perish he!");
            ayat.add("2\n\n" +
                    "ما أَغنىٰ عَنهُ مالُهُ وَما كَسَبَ\n\n" +
                    "TRANSLITERATION :\n" +
                    "mā ʾaghnā ʿanhu māluhū wa-mā kasaba\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "Neither his wealth availed him,\n" +
                    "nor what he had earned.");
            ayat.add("3\n\n" +
                    "سَيَصلىٰ نارًا ذاتَ لَهَبٍ\n\n" +
                    "TRANSLITERATION :\n" +
                    "sa-yaṣlā nāran dhāta lahabin\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "Soon he will enter the blazing fire,");
            ayat.add("4\n\n" +
                    "وَامرَأَتُهُ حَمّالَةَ الحَطَبِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "wa-mraʾatuhū ḥammālata l-ḥaṭabi\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "and his wife [too], the firewood carrier,");
            ayat.add("5\n\n" +
                    "في جيدِها حَبلٌ مِن مَسَدٍ\n\n" +
                    "TRANSLITERATION :\n" +
                    "fī jīdihā ḥablun min masadin\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "with a rope of palm fibre around her neck.");
        }
        else if (surahName.equals("112. Al-Ikhlas"))
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.a );
            setTitle("Al-Ikhlas(الإخلاص) : Monotheism");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n\n" +
                    "قُل هُوَ اللَّهُ أَحَدٌ\n\n" +
                    "TRANSLITERATION :\n" +
                    "qul huwa llāhu ʾaḥadun-i\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "Say, ‘He is Allah, the One.");
            ayat.add("2\n\n" +
                    "اللَّهُ الصَّمَدُ\n\n" +
                    "TRANSLITERATION :\n" +
                    "allāhu ṣ-ṣamadu\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "Allah is the All-embracing.");
            ayat.add("3\n\n" +
                    "لَم يَلِد وَلَم يولَد\n\n" +
                    "TRANSLITERATION :\n" +
                    "lam yalid wa-lam yūlad\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "He neither begat, nor was begotten,");
            ayat.add("4\n\n" +
                    "وَلَم يَكُن لَهُ كُفُوًا أَحَدٌ\n\n" +
                    "TRANSLITERATION :\n" +
                    "wa-lam yakun lahū kufuwan ʾaḥadun\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "nor has He any equal.");
        }
        else if(surahName.equals("113. Al-Falaq"))
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.a );
            setTitle("Al-Falaq(الفلق) : The Daybreak");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n\n" +
                    "قُل أَعوذُ بِرَبِّ الفَلَقِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "qul ʾaʿūdhu bi-rabbi l-falaqi\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "Say, I seek the protection of the Lord of the daybreak");
            ayat.add("2\n\n" +
                    "مِن شَرِّ ما خَلَقَ\n\n" +
                    "TRANSLITERATION :\n" +
                    "min sharri mā khalaqa\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "from the evil of what He has created,");
            ayat.add("3\n\n" +
                    "وَمِن شَرِّ غاسِقٍ إِذا وَقَبَ\n\n" +
                    "TRANSLITERATION :\n" +
                    "wa-min sharri ghāsiqin ʾidhā waqaba\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "and from the evil of the dark night when it settles,");
            ayat.add("4\n\n" +
                    "وَمِن شَرِّ النَّفّاثاتِ فِي العُقَدِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "wa-min sharri n-naffāthāti fī l-ʿuqadi\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "and from the evil of the witches who blow on knots,");
            ayat.add("5\n\n" +
                    "وَمِن شَرِّ حاسِدٍ إِذا حَسَدَ\n\n" +
                    "TRANSLITERATION :\n" +
                    "wa-min sharri ḥāsidin ʾidhā ḥasada\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "and from the evil of the envious one when he envies.’");
        }
        else if(surahName.equals("114. An-Nas"))
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.a );
            setTitle("An-Nas(الناس) : Humans");
            ayat.add("بِسمِ اللَّهِ الرَّحمٰنِ الرَّحيمِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "bi-smillāhir-rahmānir-raheem\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "In the Name of Allah,\n" +
                    "the All-beneficent, the All-merciful.");
            ayat.add("1\n\n" +
                    "قُل أَعوذُ بِرَبِّ النّاسِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "qulʾaʿūdhu bi-rabbin-nāsi\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "Say, I seek the protection of the Lord of humans,");
            ayat.add("2\n\n" +
                    "مَلِكِ النّاسِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "maliki n-nāsi\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "Sovereign of humans,");
            ayat.add("3\n\n" +
                    "إِلٰهِ النّاسِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "ʾilāhi n-nāsi\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "God of humans,");
            ayat.add("4\n\n" +
                    "مِن شَرِّ الوَسواسِ الخَنّاسِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "min sharri l-waswāsi l-khannāsi\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "from the evil of the sneaky tempter");
            ayat.add("5\n\n" +
                    "الَّذي يُوَسوِسُ في صُدورِ النّاسِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "alladhī yuwaswisu fī ṣudūri n-nāsi\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "who puts temptations into the breasts of humans,");
            ayat.add("6\n\n" +
                    "مِنَ الجِنَّةِ وَالنّاسِ\n\n" +
                    "TRANSLITERATION :\n" +
                    "mina l-jinnati wa-n-nāsi\n" +
                    "\n" +
                    "TRANSLATION :\n" +
                    "from among the jinn and humans.");
        }











        ListViewAdapter adapter = new ListViewAdapter(this,ayat);
        listView.setAdapter(adapter);
        // for inserting back arrow
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                seekBar.setMax(mediaPlayer.getDuration());
                // mediaPlayer.start();
                changeSeekbar();
            }
        });
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if(fromUser)
                {
                    mediaPlayer.seekTo(progress);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    private void initialization() {
        listView = findViewById(R.id.listview2);
        ayat = new ArrayList<String>();
        play = findViewById(R.id.play);
        handler = new Handler();
        seekBar = findViewById(R.id.seekMusic);
        mediaPlayer = MediaPlayer.create(this, R.raw.a);

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

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.play:
                if(mediaPlayer.isPlaying())
                {
                    mediaPlayer.pause();
                    play.setBackgroundResource(R.drawable.play);
                }
                else {
                    mediaPlayer.start();
                    play.setBackgroundResource(R.drawable.pause);
                    changeSeekbar();
                }
                break;


        }
    }

    private void changeSeekbar() {
        seekBar.setProgress(mediaPlayer.getCurrentPosition());
        if(mediaPlayer.isPlaying())
        {
            runnable = new Runnable() {
                @Override
                public void run() {
                    changeSeekbar();

                }
            };
            handler.postDelayed(runnable,0);
        }
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        mediaPlayer.start();

    }

    @Override
    protected void onResume() {
        super.onResume();
        changeSeekbar();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mediaPlayer.pause();

    }

}
