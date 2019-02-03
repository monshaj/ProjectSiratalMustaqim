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
import java.util.Arrays;

public class    Surahs extends AppCompatActivity {
    ListView surahListView;
    ArrayList<String> surahs;
    SearchView searchView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surahs);

        searchView = findViewById(R.id.seachViewId);
        surahListView = findViewById(R.id.SurahListViewId);
        String[] test = getResources().getStringArray(R.array.surah_names);
        surahs = new ArrayList<String>(Arrays.asList(test));
      //  surahs.clear();

       // surahs = new ArrayList<String>();


        //Add all surah name here
//      surahs.add("1. Al-Fatihah");
//        surahs.add("2. Al-Baqarah");
//        surahs.add("3. Al-Imran");
//        surahs.add("4. An-Nisa");
//        surahs.add("5. Al-Ma`idah");
//        surahs.add("6. Al-An`am");
//        surahs.add("7. Al-A`raf");
//        surahs.add("8. Al-Anfal");
//        surahs.add("9. At-Tawbah");
//        surahs.add("10. Yunus");
//        surahs.add("11. Hud");
//        surahs.add("12. Yusuf");
//        surahs.add("13. Ar-Ra`d");
//        surahs.add("14. Ibraheem");
//        surahs.add("15. Al-Hijr");
//        surahs.add("16. An-Nahl");
//        surahs.add("17. Al-Isra");
//        surahs.add("18. Al-Kahf");
//        surahs.add("19. Maryam");
//        surahs.add("20. Ta-Ha");
//        surahs.add("21. Al-Anbiya");
//        surahs.add("22. Al-Hajj");
//        surahs.add("23. Al-Mu`minoon");
//        surahs.add("24. An-Noor");
//        surahs.add("25. Al-Furqan");
//        surahs.add("26. Ash-Shu`ara");
//        surahs.add("27. An-Naml");
//        surahs.add("28. Al-Qasas");
//        surahs.add("29. Al-`Ankabut");
//        surahs.add("30. Ar-Rum");
//        surahs.add("31. Luqman");
//        surahs.add("32. As-Sajdah");
//        surahs.add("33. Al-Ahzab");
//        surahs.add("34. Saba");
//        surahs.add("35. Fatir");
//        surahs.add("36. Ya-seen");
//        surahs.add("37. As-Saffat");
//        surahs.add("38. Saad");
//        surahs.add("39. Az-Zumar");
//        surahs.add("40. Ghafir");
//        surahs.add("41. Fussilat");
//        surahs.add("42. Ash-Shura");
//        surahs.add("43. Az-Zukhruf");
//        surahs.add("44. Ad-Dukhan");
//        surahs.add("45. Al-Jathiyah");
//        surahs.add("46. Al-Ahqaf");
//        surahs.add("47. Muhammad");
//        surahs.add("48. Al-Fath");
//        surahs.add("49. Al-Hujurat");
//        surahs.add("50. Qaf");
//        surahs.add("51. Ad-Dhariyat");
//        surahs.add("52. At-Tur");
//        surahs.add("53. An-Najm");
//        surahs.add("54. Al-Qamar");
//        surahs.add("55. Ar-Rahman");
//        surahs.add("56. Al-Waqi`ah");
//        surahs.add("57. Al-Hadeed");
//        surahs.add("58. Al-Mujadilah");
//        surahs.add("59. Al-Hashr");
//        surahs.add("60. Al-Mumtahina");
//        surahs.add("61. As-Saff");
//        surahs.add("62. Al-Jumu`ah");
//        surahs.add("63. Al-Munafiqun");
//        surahs.add("64. At-Taghabun");
//        surahs.add("65. At-Talaq");
//        surahs.add("66. At-Tahreem");
//        surahs.add("67. Al-Mulk");
//        surahs.add("68. Al-Qalam");
//        surahs.add("69. Al-Haqqah");
//        surahs.add("70. Al-Ma`aarij");
//        surahs.add("71. Nuh");
//        surahs.add("72. Al-Jinn");
//        surahs.add("73. Al-Muzzammil");
//        surahs.add("74. Al-Muddathir");
//        surahs.add("75. Al-Qiyamah");
//        surahs.add("76. Al-Insan");
//        surahs.add("77. Al-Mursalat");
//        surahs.add("78. An-Naba");
//        surahs.add("79. An-Nazi`at");
//        surahs.add("80. `Abasa");
//        surahs.add("81. At-Takweer");
//        surahs.add("82. Al-Infitar");
//        surahs.add("83. Al-Mutaffifeen");
//        surahs.add("84. Al-Inshiqaq");
//        surahs.add("85. Al-Burooj");
//        surahs.add("86. At-Tariq");
//        surahs.add("87. Al-A`la");
//        surahs.add("88. Al-Ghashiyah");
//        surahs.add("89. Al-Fajr");
//        surahs.add("90. Al-Balad");
//        surahs.add("91. Ash-Shams");
//        surahs.add("92. Al-Lail");
//        surahs.add("93. Ad-Dhuha");
//        surahs.add("94. Al-Inshirah");
//        surahs.add("95. At-Teen");
//        surahs.add("96. Al-`Alaq");
//        surahs.add("97. Al-Qadr");
//        surahs.add("98. Al-Bayyinah");
//        surahs.add("99. Az-Zalzala");
//        surahs.add("100. Al-Adiyat");
//        surahs.add("101. Al-Qari`ah");
//        surahs.add("102. At-Takathur");
//        surahs.add("103. Al-Asr");
//        surahs.add("104. Al-Humazah");
//        surahs.add("105. Al-Feel");
//        surahs.add("106. Al-Quraish");
//        surahs.add("107. Al-Maa`oun");
//        surahs.add("108. Al-Kawthar");
//        surahs.add("109. Al-Kafiroon");
//        surahs.add("110. An-Nasr");
//        surahs.add("111. Al-Masad");
//        surahs.add("112. Al-Ikhlas");
//        surahs.add("113. Al-Falaq");
//        surahs.add("114. An-Nas");


        final ArrayAdapter adapter = new ArrayAdapter(this,R.layout.list_item, R.id.text, surahs);
        //final ListViewAdapter adapter = new ListViewAdapter(this,surahs);
        surahListView.setAdapter(adapter);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                adapter.getFilter().filter(s);
                return false;
            }
        });


        surahListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String surahName = "";
                String retrieveSurah = surahs.get(i).toString();
//
//                if(i == 0)
//                {
//                    surahName = "1. Al_Fatihah";
//                }
//                else if(i == 1)
//                {
//                    surahName = "2. Al_Baqarah";
//                }
//
//
//                else if(i == 2) { surahName = "3. Al_Imran"; }
//
//                else if(i == 3) { surahName = "4. An_Nisa"; }
//
//                else if(i == 4) { surahName = "5. Al_Ma`idah"; }
//
//                else if(i == 5) { surahName = "6. Al_An`am"; }
//
//                else if(i == 6) { surahName = "7. Al_A`raf"; }
//
//                else if(i == 7) { surahName = "8. Al_Anfal"; }
//
//                else if(i == 8) { surahName = "9. At_Tawbah"; }
//
//                else if(i == 9) { surahName = "10. Yunus"; }
//
//                else if(i == 10) { surahName = "11. Hud"; }
//
//                else if(i == 11) { surahName = "12. Yusuf"; }
//
//                else if(i == 12) { surahName = "13. Ar_Ra`d"; }
//
//                else if(i == 13) { surahName = "14. Ibraheem"; }
//
//                else if(i == 14) { surahName = "15. Al_Hijr"; }
//
//                else if(i == 15) { surahName = "16. An_Nahl"; }
//
//                else if(i == 16) { surahName = "17. Al_Isra"; }
//
//                else if(i == 17) { surahName = "18. Al_Kahf"; }
//
//                else if(i == 18) { surahName = "19. Maryam"; }
//
//                else if(i == 19) { surahName = "20. Ta_Ha"; }
//
//                else if(i == 20) { surahName = "21. Al_Anbiya"; }
//
//                else if(i == 21) { surahName = "22. Al_Hajj"; }
//
//                else if(i == 22) { surahName = "23. Al_Mu`minoon"; }
//
//                else if(i == 23) { surahName = "24. An_Noor"; }
//
//                else if(i == 24) { surahName = "25. Al_Furqan"; }
//
//                else if(i == 25) { surahName = "26. Ash_Shu`ara"; }
//
//                else if(i == 26) { surahName = "27. An_Naml"; }
//
//                else if(i == 27) { surahName = "28. Al_Qasas"; }
//
//                else if(i == 28) { surahName = "29. Al_`Ankabut"; }
//
//                else if(i == 29) { surahName = "30. Ar_Rum"; }
//
//                else if(i == 30) { surahName = "31. Luqman"; }
//
//                else if(i == 31) { surahName = "32. As_Sajdah"; }
//
//                else if(i == 32) { surahName = "33. Al_Ahzab"; }
//
//                else if(i == 33) { surahName = "34. Saba"; }
//
//                else if(i == 34) { surahName = "35. Fatir"; }
//
//                else if(i == 35) { surahName = "36. Ya seen"; }
//
//                else if(i == 36) { surahName = "37. As_Saffat"; }
//
//                else if(i == 37) { surahName = "38. Saad"; }
//
//                else if(i == 38) { surahName = "39. Az_Zumar"; }
//
//                else if(i == 39) { surahName = "40. Ghafir"; }
//
//                else if(i == 40) { surahName = "41. Fussilat"; }
//
//                else if(i == 41) { surahName = "42. Ash_Shura"; }
//
//                else if(i == 42) { surahName = "43. Az_Zukhruf"; }
//
//                else if(i == 43) { surahName = "44. Ad_Dukhan"; }
//
//                else if(i == 44) { surahName = "45. Al_Jathiyah"; }
//
//                else if(i == 45) { surahName = "46. Al_Ahqaf"; }
//
//                else if(i == 46) { surahName = "47. Muhammad"; }
//
//                else if(i == 47) { surahName = "48. Al_Fath"; }
//
//                else if(i == 48) { surahName = "49. Al_Hujurat"; }
//
//                else if(i == 49) { surahName = "50. Qaf"; }
//
//                else if(i == 50) { surahName = "51. Ad_Dhariyat"; }
//
//                else if(i == 51) { surahName = "52. At_Tur"; }
//
//                else if(i == 52) { surahName = "53. An_Najm"; }
//
//                else if(i == 53) { surahName = "54. Al_Qamar"; }
//
//                else if(i == 54) { surahName = "55. Ar_Rahman"; }
//
//                else if(i == 55) { surahName = "56. Al_Waqi`ah"; }
//
//                else if(i == 56) { surahName = "57. Al_Hadeed"; }
//
//                else if(i == 57) { surahName = "58. Al_Mujadilah"; }
//
//                else if(i == 58) { surahName = "59. Al_Hashr"; }
//
//                else if(i == 59) { surahName = "60. Al_Mumtahina"; }
//
//                else if(i == 60) { surahName = "61. As_Saff"; }
//
//                else if(i == 61) { surahName = "62. Al_Jumu`ah"; }
//
//                else if(i == 62) { surahName = "63. Al_Munafiqun"; }
//
//                else if(i == 63) { surahName = "64. At_Taghabun"; }
//
//                else if(i == 64) { surahName = "65. At_Talaq"; }
//
//                else if(i == 65) { surahName = "66. At_Tahreem"; }
//
//                else if(i == 66) { surahName = "67. Al_Mulk"; }
//
//                else if(i == 67) { surahName = "68. Al_Qalam"; }
//
//                else if(i == 68) { surahName = "69. Al_Haqqah"; }
//
//                else if(i == 69) { surahName = "70. Al_Ma`aarij"; }
//
//                else if(i == 70) { surahName = "71. Nuh"; }
//
//                else if(i == 71) { surahName = "72. Al_Jinn"; }
//
//                else if(i == 72) { surahName = "73. Al_Muzzammil"; }
//
//                else if(i == 73) { surahName = "74. Al_Muddathir"; }
//
//                else if(i == 74) { surahName = "75. Al_Qiyamah"; }
//
//                else if(i == 75) { surahName = "76. Al_Insan"; }
//
//                else if(i == 76) { surahName = "77. Al_Mursalat"; }
//
//                else if(i == 77) { surahName = "78. An_Naba"; }
//
//                else if(i == 78) { surahName = "79. An_Nazi`at"; }
//
//                else if(i == 79) { surahName = "80. `Abasa"; }
//
//                else if(i == 80) { surahName = "81. At_Takweer"; }
//
//                else if(i == 81) { surahName = "82. Al_Infitar"; }
//
//                else if(i == 82) { surahName = "83. Al_Mutaffifeen"; }
//
//                else if(i == 83) { surahName = "84. Al_Inshiqaq"; }
//
//                else if(i == 84) { surahName = "85. Al_Burooj"; }
//
//                else if(i == 85) { surahName = "86. At_Tariq"; }
//
//                else if(i == 86) { surahName = "87. Al_A`la"; }
//
//                else if(i == 87) { surahName = "88. Al_Ghashiyah"; }
//
//                else if(i == 88) { surahName = "89. Al_Fajr"; }
//
//                else if(i == 89) { surahName = "90. Al_Balad"; }
//
//                else if(i == 90) { surahName = "91. Ash_Shams"; }
//
//                else if(i == 91) { surahName = "92. Al_Lail"; }
//
//                else if(i == 92) { surahName = "93. Ad_Dhuha"; }
//
//                else if(i == 93) { surahName = "94. Al_Inshirah"; }
//
//                else if(i == 94) { surahName = "95. At_Teen"; }
//
//                else if(i == 95) { surahName = "96. al_`Alaq"; }
//
//                else if(i == 96) { surahName = "97. Al_Qadr"; }
//
//                else if(i == 97) { surahName = "98. Al_Bayyinah"; }
//
//                else if(i == 98) { surahName = "99. Az_Zalzala"; }
//
//                else if(i == 99) { surahName = "100. Al_Adiyat"; }
//
//                else if(i == 100) { surahName = "101. al_Qari`ah"; }
//
//                else if(i == 101) { surahName = "102. At_Takathur"; }
//
//                else if(i == 102) { surahName = "103. Al_Asr"; }
//
//                else if(i == 103) { surahName = "104. Al_Humazah"; }
//
//                else if(i == 104) { surahName = "105. Al_Feel"; }
//
//                else if(i == 105) { surahName = "106. Al_Quraish"; }
//
//                else if(i == 106) { surahName = "107. Al_Maa`oun"; }
//
//                else if(i == 107) { surahName = "108. Al_Kawthar"; }
//
//                else if(i == 108) { surahName = "109. Al_Kafiroun"; }
//
//                else if(i == 109) { surahName = "110. An_Nasr"; }
//
//                else if(i == 110) { surahName = "111. Al_Masad"; }
//
//                else if(i == 111) { surahName = "112. Al_Ikhlas"; }
//
//                else if(i == 112) { surahName = "113. Al_Falaq"; }
//
//                else if(i == 113) { surahName = "114. An_Nas "; }

                if(retrieveSurah.equals("1. Al-Fatihah")) { surahName = "1. Al-Fatihah"; }

                else if(retrieveSurah.equals("2. Al-Baqarah")) { surahName = "2. Al-Baqarah"; }

                else if(retrieveSurah.equals("3. Al-Imran")) { surahName = "3. Al-Imran"; }

                else if(retrieveSurah.equals("4. An-Nisa")) { surahName = "4. An-Nisa"; }

                else if(retrieveSurah.equals("5. Al-Ma`idah")) { surahName = "5. Al-Ma`idah"; }

                else if(retrieveSurah.equals("6. Al-An`am")) { surahName = "6. Al-An`am"; }

                else if(retrieveSurah.equals("7. Al-A`raf")) { surahName = "7. Al-A`raf"; }

                else if(retrieveSurah.equals("8. Al-Anfal")) { surahName = "8. Al-Anfal"; }

                else if(retrieveSurah.equals("9. At-Tawbah")) { surahName = "9. At-Tawbah"; }

                else if(retrieveSurah.equals("10. Yunus")) { surahName = "10. Yunus"; }

                else if(retrieveSurah.equals("11. Hud")) { surahName = "11. Hud"; }

                else if(retrieveSurah.equals("12. Yusuf")) { surahName = "12. Yusuf"; }

                else if(retrieveSurah.equals("13. Ar-Ra`d")) { surahName = "13. Ar-Ra`d"; }

                else if(retrieveSurah.equals("14. Ibraheem")) { surahName = "14. Ibraheem"; }

                else if(retrieveSurah.equals("15. Al-Hijr")) { surahName = "15. Al-Hijr"; }

                else if(retrieveSurah.equals("16. An-Nahl")) { surahName = "16. An-Nahl"; }

                else if(retrieveSurah.equals("17. Al-Isra")) { surahName = "17. Al-Isra"; }

                else if(retrieveSurah.equals("18. Al-Kahf")) { surahName = "18. Al-Kahf"; }

                else if(retrieveSurah.equals("19. Maryam")) { surahName = "19. Maryam"; }

                else if(retrieveSurah.equals("20. Ta-Ha")) { surahName = "20. Ta-Ha"; }

                else if(retrieveSurah.equals("21. Al-Anbiya")) { surahName = "21. Al-Anbiya"; }

                else if(retrieveSurah.equals("22. Al-Hajj")) { surahName = "22. Al-Hajj"; }

                else if(retrieveSurah.equals("23. Al-Mu`minoon")) { surahName = "23. Al-Mu`minoon"; }

                else if(retrieveSurah.equals("24. An-Noor")) { surahName = "24. An-Noor"; }

                else if(retrieveSurah.equals("25. Al-Furqan")) { surahName = "25. Al-Furqan"; }

                else if(retrieveSurah.equals("26. Ash-Shu`ara")) { surahName = "26. Ash-Shu`ara"; }

                else if(retrieveSurah.equals("27. An-Naml")) { surahName = "27. An-Naml"; }

                else if(retrieveSurah.equals("28. Al-Qasas")) { surahName = "28. Al-Qasas"; }

                else if(retrieveSurah.equals("29. Al-`Ankabut")) { surahName = "29. Al-`Ankabut"; }

                else if(retrieveSurah.equals("30. Ar-Rum")) { surahName = "30. Ar-Rum"; }

                else if(retrieveSurah.equals("31. Luqman")) { surahName = "31. Luqman"; }

                else if(retrieveSurah.equals("32. As-Sajdah")) { surahName = "32. As-Sajdah"; }

                else if(retrieveSurah.equals("33. Al-Ahzab")) { surahName = "33. Al-Ahzab"; }

                else if(retrieveSurah.equals("34. Saba")) { surahName = "34. Saba"; }

                else if(retrieveSurah.equals("35. Fatir")) { surahName = "35. Fatir"; }

                else if(retrieveSurah.equals("36. Ya-seen")) { surahName = "36. Ya-seen"; }

                else if(retrieveSurah.equals("37. As-Saffat")) { surahName = "37. As-Saffat"; }

                else if(retrieveSurah.equals("38. Saad")) { surahName = "38. Saad"; }

                else if(retrieveSurah.equals("39. Az-Zumar")) { surahName = "39. Az-Zumar"; }

                else if(retrieveSurah.equals("40. Ghafir")) { surahName = "40. Ghafir"; }

                else if(retrieveSurah.equals("41. Fussilat")) { surahName = "41. Fussilat"; }

                else if(retrieveSurah.equals("42. Ash-Shura")) { surahName = "42. Ash-Shura"; }

                else if(retrieveSurah.equals("43. Az-Zukhruf")) { surahName = "43. Az-Zukhruf"; }

                else if(retrieveSurah.equals("44. Ad-Dukhan")) { surahName = "44. Ad-Dukhan"; }

                else if(retrieveSurah.equals("45. Al-Jathiyah")) { surahName = "45. Al-Jathiyah"; }

                else if(retrieveSurah.equals("46. Al-Ahqaf")) { surahName = "46. Al-Ahqaf"; }

                else if(retrieveSurah.equals("47. Muhammad")) { surahName = "47. Muhammad"; }

                else if(retrieveSurah.equals("48. Al-Fath")) { surahName = "48. Al-Fath"; }

                else if(retrieveSurah.equals("49. Al-Hujurat")) { surahName = "49. Al-Hujurat"; }

                else if(retrieveSurah.equals("50. Qaf")) { surahName = "50. Qaf"; }

                else if(retrieveSurah.equals("51. Ad-Dhariyat")) { surahName = "51. Ad-Dhariyat"; }

                else if(retrieveSurah.equals("52. At-Tur")) { surahName = "52. At-Tur"; }

                else if(retrieveSurah.equals("53. An-Najm")) { surahName = "53. An-Najm"; }

                else if(retrieveSurah.equals("54. Al-Qamar")) { surahName = "54. Al-Qamar"; }

                else if(retrieveSurah.equals("55. Ar-Rahman")) { surahName = "55. Ar-Rahman"; }

                else if(retrieveSurah.equals("56. Al-Waqi`ah")) { surahName = "56. Al-Waqi`ah"; }

                else if(retrieveSurah.equals("57. Al-Hadeed")) { surahName = "57. Al-Hadeed"; }

                else if(retrieveSurah.equals("58. Al-Mujadilah")) { surahName = "58. Al-Mujadilah"; }

                else if(retrieveSurah.equals("59. Al-Hashr")) { surahName = "59. Al-Hashr"; }

                else if(retrieveSurah.equals("60. Al-Mumtahina")) { surahName = "60. Al-Mumtahina"; }

                else if(retrieveSurah.equals("61. As-Saff")) { surahName = "61. As-Saff"; }

                else if(retrieveSurah.equals("62. Al-Jumu`ah")) { surahName = "62. Al-Jumu`ah"; }

                else if(retrieveSurah.equals("63. Al-Munafiqun")) { surahName = "63. Al-Munafiqun"; }

                else if(retrieveSurah.equals("64. At-Taghabun")) { surahName = "64. At-Taghabun"; }

                else if(retrieveSurah.equals("65. At-Talaq")) { surahName = "65. At-Talaq"; }

                else if(retrieveSurah.equals("66. At-Tahreem")) { surahName = "66. At-Tahreem"; }

                else if(retrieveSurah.equals("67. Al-Mulk")) { surahName = "67. Al-Mulk"; }

                else if(retrieveSurah.equals("68. Al-Qalam")) { surahName = "68. Al-Qalam"; }

                else if(retrieveSurah.equals("69. Al-Haqqah")) { surahName = "69. Al-Haqqah"; }

                else if(retrieveSurah.equals("70. Al-Ma`aarij")) { surahName = "70. Al-Ma`aarij"; }

                else if(retrieveSurah.equals("71. Nuh")) { surahName = "71. Nuh"; }

                else if(retrieveSurah.equals("72. Al-Jinn")) { surahName = "72. Al-Jinn"; }

                else if(retrieveSurah.equals("73. Al-Muzzammil")) { surahName = "73. Al-Muzzammil"; }

                else if(retrieveSurah.equals("74. Al-Muddathir")) { surahName = "74. Al-Muddathir"; }

                else if(retrieveSurah.equals("75. Al-Qiyamah")) { surahName = "75. Al-Qiyamah"; }

                else if(retrieveSurah.equals("76. Al-Insan")) { surahName = "76. Al-Insan"; }

                else if(retrieveSurah.equals("77. Al-Mursalat")) { surahName = "77. Al-Mursalat"; }

                else if(retrieveSurah.equals("78. An-Naba")) { surahName = "78. An-Naba"; }

                else if(retrieveSurah.equals("79. An-Nazi`at")) { surahName = "79. An-Nazi`at"; }

                else if(retrieveSurah.equals("80. `Abasa")) { surahName = "80. `Abasa"; }

                else if(retrieveSurah.equals("81. At-Takweer")) { surahName = "81. At-Takweer"; }

                else if(retrieveSurah.equals("82. Al-Infitar")) { surahName = "82. Al-Infitar"; }

                else if(retrieveSurah.equals("83. Al-Mutaffifeen")) { surahName = "83. Al-Mutaffifeen"; }

                else if(retrieveSurah.equals("84. Al-Inshiqaq")) { surahName = "84. Al-Inshiqaq"; }

                else if(retrieveSurah.equals("85. Al-Burooj")) { surahName = "85. Al-Burooj"; }

                else if(retrieveSurah.equals("86. At-Tariq")) { surahName = "86. At-Tariq"; }

                else if(retrieveSurah.equals("87. Al-A`la")) { surahName = "87. Al-A`la"; }

                else if(retrieveSurah.equals("88. Al-Ghashiyah")) { surahName = "88. Al-Ghashiyah"; }

                else if(retrieveSurah.equals("89. Al-Fajr")) { surahName = "89. Al-Fajr"; }

                else if(retrieveSurah.equals("90. Al-Balad")) { surahName = "90. Al-Balad"; }

                else if(retrieveSurah.equals("91. Ash-Shams")) { surahName = "91. Ash-Shams"; }

                else if(retrieveSurah.equals("92. Al-Lail")) { surahName = "92. Al-Lail"; }

                else if(retrieveSurah.equals("93. Ad-Dhuha")) { surahName = "93. Ad-Dhuha"; }

                else if(retrieveSurah.equals("94. Al-Inshirah")) { surahName = "94. Al-Inshirah"; }

                else if(retrieveSurah.equals("95. At-Teen")) { surahName = "95. At-Teen"; }

                else if(retrieveSurah.equals("96. al-`Alaq")) { surahName = "96. al-`Alaq"; }

                else if(retrieveSurah.equals("97. Al-Qadr")) { surahName = "97. Al-Qadr"; }

                else if(retrieveSurah.equals("98. Al-Bayyinah")) { surahName = "98. Al-Bayyinah"; }

                else if(retrieveSurah.equals("99. Az-Zalzala")) { surahName = "99. Az-Zalzala"; }

                else if(retrieveSurah.equals("100. Al-Adiyat")) { surahName = "100. Al-Adiyat"; }

                else if(retrieveSurah.equals("101. al-Qari`ah")) { surahName = "101. al-Qari`ah"; }

                else if(retrieveSurah.equals("102. At-Takathur")) { surahName = "102. At-Takathur"; }

                else if(retrieveSurah.equals("103. Al-Asr")) { surahName = "103. Al-Asr"; }

                else if(retrieveSurah.equals("104. Al-Humazah")) { surahName = "104. Al-Humazah"; }

                else if(retrieveSurah.equals("105. Al-Feel")) { surahName = "105. Al-Feel"; }

                else if(retrieveSurah.equals("106. Al-Quraish")) { surahName = "106. Al-Quraish"; }

                else if(retrieveSurah.equals("107. Al-Maa`oun")) { surahName = "107. Al-Maa`oun"; }

                else if(retrieveSurah.equals("108. Al-Kawthar")) { surahName = "108. Al-Kawthar"; }

                else if(retrieveSurah.equals("109. Al-Kafiroun")) { surahName = "109. Al-Kafiroun"; }

                else if(retrieveSurah.equals("110. An-Nasr")) { surahName = "110. An-Nasr"; }

                else if(retrieveSurah.equals("111. Al-Masad")) { surahName = "111. Al-Masad"; }

                else if(retrieveSurah.equals("112. Al-Ikhlas")) { surahName = "112. Al-Ikhlas"; }

                else if(retrieveSurah.equals("113. Al-Falaq")) { surahName = "113. Al-Falaq"; }

                else if(retrieveSurah.equals("114. An-Nas")) { surahName = "114. An-Nas"; }






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
