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
          //Toast.makeText(this, "You pressed on Surah "+surahName, Toast.LENGTH_SHORT).show();
        }


        if(surahName.equals("1. Al-Fatihah"))
        {
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
