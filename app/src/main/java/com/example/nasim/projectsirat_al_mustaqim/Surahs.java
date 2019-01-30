package com.example.nasim.projectsirat_al_mustaqim;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class Surahs extends AppCompatActivity {
    ListView surahListView;
    ArrayList<String> surahs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surahs);

        surahListView = findViewById(R.id.SurahListViewId);
        surahs = new ArrayList<String>();
        //Add all surah name here
        surahs.add("1. Al_Fatihah");
        surahs.add("2. Al_Baqarah");
        surahs.add("3. Al_Imran");
        surahs.add("4. An_Nisa");
        surahs.add("5. Al_Ma`idah");
        surahs.add("6. Al_An`am");
        surahs.add("7. Al_A`raf");
        surahs.add("8. Al_Anfal");
        surahs.add("9. At_Tawbah");
        surahs.add("10. Yunus");
        surahs.add("11. Hud");
        surahs.add("12. Yusuf");
        surahs.add("13. Ar_Ra`d");
        surahs.add("14. Ibraheem");
        surahs.add("15. Al_Hijr");
        surahs.add("16. An_Nahl");
        surahs.add("17. Al_Isra");
        surahs.add("18. Al_Kahf");
        surahs.add("19. Maryam");
        surahs.add("20. Ta_Ha");
        surahs.add("21. Al_Anbiya");
        surahs.add("22. Al_Hajj");
        surahs.add("23. Al_Mu`minoon");
        surahs.add("24. An_Noor");
        surahs.add("25. Al_Furqan");
        surahs.add("26. Ash_Shu`ara");
        surahs.add("27. An_Naml");
        surahs.add("28. Al_Qasas");
        surahs.add("29. Al_`Ankabut");
        surahs.add("30. Ar_Rum");
        surahs.add("31. Luqman");
        surahs.add("32. As_Sajdah");
        surahs.add("33. Al_Ahzab");
        surahs.add("34. Saba");
        surahs.add("35. Fatir");
        surahs.add("36. Ya seen");
        surahs.add("37. As_Saffat");
        surahs.add("38. Saad");
        surahs.add("39. Az_Zumar");
        surahs.add("40. Ghafir");
        surahs.add("41. Fussilat");
        surahs.add("42. Ash_Shura");
        surahs.add("43. Az_Zukhruf");
        surahs.add("44. Ad_Dukhan");
        surahs.add("45. Al_Jathiyah");
        surahs.add("46. Al_Ahqaf");
        surahs.add("47. Muhammad");
        surahs.add("48. Al_Fath");
        surahs.add("49. Al_Hujurat");
        surahs.add("50. Qaf");
        surahs.add("51. Ad_Dhariyat");
        surahs.add("52. At_Tur");
        surahs.add("53. An_Najm");
        surahs.add("54. Al_Qamar");
        surahs.add("55. Ar_Rahman");
        surahs.add("56. Al_Waqi`ah");
        surahs.add("57. Al_Hadeed");
        surahs.add("58. Al_Mujadilah");
        surahs.add("59. Al_Hashr");
        surahs.add("60. Al_Mumtahina");
        surahs.add("61. As_Saff");
        surahs.add("62. Al_Jumu`ah");
        surahs.add("63. Al_Munafiqun");
        surahs.add("64. At_Taghabun");
        surahs.add("65. At_Talaq");
        surahs.add("66. At_Tahreem");
        surahs.add("67. Al_Mulk");
        surahs.add("68. Al_Qalam");
        surahs.add("69. Al_Haqqah");
        surahs.add("70. Al_Ma`aarij");
        surahs.add("71. Nuh");
        surahs.add("72. Al_Jinn");
        surahs.add("73. Al_Muzzammil");
        surahs.add("74. Al_Muddathir");
        surahs.add("75. Al_Qiyamah");
        surahs.add("76. Al_Insan");
        surahs.add("77. Al_Mursalat");
        surahs.add("78. An_Naba");
        surahs.add("79. An_Nazi`at");
        surahs.add("80. `Abasa");
        surahs.add("81. At_Takweer");
        surahs.add("82. Al_Infitar");
        surahs.add("83. Al_Mutaffifeen");
        surahs.add("84. Al_Inshiqaq");
        surahs.add("85. Al_Burooj");
        surahs.add("86. At_Tariq");
        surahs.add("87. Al_A`la");
        surahs.add("88. Al_Ghashiyah");
        surahs.add("89. Al_Fajr");
        surahs.add("90. Al_Balad");
        surahs.add("91. Ash_Shams");
        surahs.add("92. Al_Lail");
        surahs.add("93. Ad_Dhuha");
        surahs.add("94. Al_Inshirah");
        surahs.add("95. At_Teen");
        surahs.add("96. al_`Alaq");
        surahs.add("97. Al_Qadr");
        surahs.add("98. Al_Bayyinah");
        surahs.add("99. Az_Zalzala");
        surahs.add("100. Al_Adiyat");
        surahs.add("101. al_Qari`ah");
        surahs.add("102. At_Takathur");
        surahs.add("103. Al_Asr");
        surahs.add("104. Al_Humazah");
        surahs.add("105. Al_Feel");
        surahs.add("106. Al_Quraish");
        surahs.add("107. Al_Maa`oun");
        surahs.add("108. Al_Kawthar");
        surahs.add("109. Al_Kafiroun");
        surahs.add("110. An_Nasr");
        surahs.add("111. Al_Masad");
        surahs.add("112. Al_Ikhlas");
        surahs.add("113. Al_Falaq");
        surahs.add("114. An_Nas ");


        ListViewAdapter adapter = new ListViewAdapter(this,surahs);
        surahListView.setAdapter(adapter);

        surahListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String surahName = "";

                if(i == 0)
                {
                    surahName = "1. Al_Fatihah";
                }
                else if(i == 1)
                {
                    surahName = "2. Al_Baqarah";
                }


                else if(i == 2) { surahName = "3. Al_Imran"; }

                else if(i == 3) { surahName = "4. An_Nisa"; }

                else if(i == 4) { surahName = "5. Al_Ma`idah"; }

                else if(i == 5) { surahName = "6. Al_An`am"; }

                else if(i == 6) { surahName = "7. Al_A`raf"; }

                else if(i == 7) { surahName = "8. Al_Anfal"; }

                else if(i == 8) { surahName = "9. At_Tawbah"; }

                else if(i == 9) { surahName = "10. Yunus"; }

                else if(i == 10) { surahName = "11. Hud"; }

                else if(i == 11) { surahName = "12. Yusuf"; }

                else if(i == 12) { surahName = "13. Ar_Ra`d"; }

                else if(i == 13) { surahName = "14. Ibraheem"; }

                else if(i == 14) { surahName = "15. Al_Hijr"; }

                else if(i == 15) { surahName = "16. An_Nahl"; }

                else if(i == 16) { surahName = "17. Al_Isra"; }

                else if(i == 17) { surahName = "18. Al_Kahf"; }

                else if(i == 18) { surahName = "19. Maryam"; }

                else if(i == 19) { surahName = "20. Ta_Ha"; }

                else if(i == 20) { surahName = "21. Al_Anbiya"; }

                else if(i == 21) { surahName = "22. Al_Hajj"; }

                else if(i == 22) { surahName = "23. Al_Mu`minoon"; }

                else if(i == 23) { surahName = "24. An_Noor"; }

                else if(i == 24) { surahName = "25. Al_Furqan"; }

                else if(i == 25) { surahName = "26. Ash_Shu`ara"; }

                else if(i == 26) { surahName = "27. An_Naml"; }

                else if(i == 27) { surahName = "28. Al_Qasas"; }

                else if(i == 28) { surahName = "29. Al_`Ankabut"; }

                else if(i == 29) { surahName = "30. Ar_Rum"; }

                else if(i == 30) { surahName = "31. Luqman"; }

                else if(i == 31) { surahName = "32. As_Sajdah"; }

                else if(i == 32) { surahName = "33. Al_Ahzab"; }

                else if(i == 33) { surahName = "34. Saba"; }

                else if(i == 34) { surahName = "35. Fatir"; }

                else if(i == 35) { surahName = "36. Ya seen"; }

                else if(i == 36) { surahName = "37. As_Saffat"; }

                else if(i == 37) { surahName = "38. Saad"; }

                else if(i == 38) { surahName = "39. Az_Zumar"; }

                else if(i == 39) { surahName = "40. Ghafir"; }

                else if(i == 40) { surahName = "41. Fussilat"; }

                else if(i == 41) { surahName = "42. Ash_Shura"; }

                else if(i == 42) { surahName = "43. Az_Zukhruf"; }

                else if(i == 43) { surahName = "44. Ad_Dukhan"; }

                else if(i == 44) { surahName = "45. Al_Jathiyah"; }

                else if(i == 45) { surahName = "46. Al_Ahqaf"; }

                else if(i == 46) { surahName = "47. Muhammad"; }

                else if(i == 47) { surahName = "48. Al_Fath"; }

                else if(i == 48) { surahName = "49. Al_Hujurat"; }

                else if(i == 49) { surahName = "50. Qaf"; }

                else if(i == 50) { surahName = "51. Ad_Dhariyat"; }

                else if(i == 51) { surahName = "52. At_Tur"; }

                else if(i == 52) { surahName = "53. An_Najm"; }

                else if(i == 53) { surahName = "54. Al_Qamar"; }

                else if(i == 54) { surahName = "55. Ar_Rahman"; }

                else if(i == 55) { surahName = "56. Al_Waqi`ah"; }

                else if(i == 56) { surahName = "57. Al_Hadeed"; }

                else if(i == 57) { surahName = "58. Al_Mujadilah"; }

                else if(i == 58) { surahName = "59. Al_Hashr"; }

                else if(i == 59) { surahName = "60. Al_Mumtahina"; }

                else if(i == 60) { surahName = "61. As_Saff"; }

                else if(i == 61) { surahName = "62. Al_Jumu`ah"; }

                else if(i == 62) { surahName = "63. Al_Munafiqun"; }

                else if(i == 63) { surahName = "64. At_Taghabun"; }

                else if(i == 64) { surahName = "65. At_Talaq"; }

                else if(i == 65) { surahName = "66. At_Tahreem"; }

                else if(i == 66) { surahName = "67. Al_Mulk"; }

                else if(i == 67) { surahName = "68. Al_Qalam"; }

                else if(i == 68) { surahName = "69. Al_Haqqah"; }

                else if(i == 69) { surahName = "70. Al_Ma`aarij"; }

                else if(i == 70) { surahName = "71. Nuh"; }

                else if(i == 71) { surahName = "72. Al_Jinn"; }

                else if(i == 72) { surahName = "73. Al_Muzzammil"; }

                else if(i == 73) { surahName = "74. Al_Muddathir"; }

                else if(i == 74) { surahName = "75. Al_Qiyamah"; }

                else if(i == 75) { surahName = "76. Al_Insan"; }

                else if(i == 76) { surahName = "77. Al_Mursalat"; }

                else if(i == 77) { surahName = "78. An_Naba"; }

                else if(i == 78) { surahName = "79. An_Nazi`at"; }

                else if(i == 79) { surahName = "80. `Abasa"; }

                else if(i == 80) { surahName = "81. At_Takweer"; }

                else if(i == 81) { surahName = "82. Al_Infitar"; }

                else if(i == 82) { surahName = "83. Al_Mutaffifeen"; }

                else if(i == 83) { surahName = "84. Al_Inshiqaq"; }

                else if(i == 84) { surahName = "85. Al_Burooj"; }

                else if(i == 85) { surahName = "86. At_Tariq"; }

                else if(i == 86) { surahName = "87. Al_A`la"; }

                else if(i == 87) { surahName = "88. Al_Ghashiyah"; }

                else if(i == 88) { surahName = "89. Al_Fajr"; }

                else if(i == 89) { surahName = "90. Al_Balad"; }

                else if(i == 90) { surahName = "91. Ash_Shams"; }

                else if(i == 91) { surahName = "92. Al_Lail"; }

                else if(i == 92) { surahName = "93. Ad_Dhuha"; }

                else if(i == 93) { surahName = "94. Al_Inshirah"; }

                else if(i == 94) { surahName = "95. At_Teen"; }

                else if(i == 95) { surahName = "96. al_`Alaq"; }

                else if(i == 96) { surahName = "97. Al_Qadr"; }

                else if(i == 97) { surahName = "98. Al_Bayyinah"; }

                else if(i == 98) { surahName = "99. Az_Zalzala"; }

                else if(i == 99) { surahName = "100. Al_Adiyat"; }

                else if(i == 100) { surahName = "101. al_Qari`ah"; }

                else if(i == 101) { surahName = "102. At_Takathur"; }

                else if(i == 102) { surahName = "103. Al_Asr"; }

                else if(i == 103) { surahName = "104. Al_Humazah"; }

                else if(i == 104) { surahName = "105. Al_Feel"; }

                else if(i == 105) { surahName = "106. Al_Quraish"; }

                else if(i == 106) { surahName = "107. Al_Maa`oun"; }

                else if(i == 107) { surahName = "108. Al_Kawthar"; }

                else if(i == 108) { surahName = "109. Al_Kafiroun"; }

                else if(i == 109) { surahName = "110. An_Nasr"; }

                else if(i == 110) { surahName = "111. Al_Masad"; }

                else if(i == 111) { surahName = "112. Al_Ikhlas"; }

                else if(i == 112) { surahName = "113. Al_Falaq"; }

                else if(i == 113) { surahName = "114. An_Nas "; }




                Intent intent = new Intent(Surahs.this,Ayat.class);
                intent.putExtra("Surah",surahName);
                startActivity(intent);
            }
        });


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
        Intent intent= new Intent(Surahs.this,Main_Menu.class);
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
