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
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
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
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
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
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
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
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
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
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
            ayat.add("");
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
