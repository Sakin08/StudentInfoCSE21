package com.sakin.datalist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private val countryNameList = ArrayList<String>()
    private val detailsList = ArrayList<String>()
    private val imageList = ArrayList<Int>()

    private lateinit var adapter: CountriesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Make sure this matches your layout file name

        // Initialize RecyclerView
        recyclerView = findViewById(R.id.recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Add sample data
        countryNameList.add("1. ALI ASHRAF TANVIR")
        countryNameList.add("2. ZUBAYER HOSSAIN UDAY")
        countryNameList.add("3. ARIF BEPARI")
        countryNameList.add("4. MD. DELWAR JAHAN")
        countryNameList.add("5. SAKIB AL HRIDOY")
        countryNameList.add("6. TANZIM HASAN PRAPPO")
        countryNameList.add("7. S.M. ASHIKUR RAHAMAN")
        countryNameList.add("8. MD. SOHANOOR RAHAMAN SAKIN")
        countryNameList.add("9. MD. ABU BAKAR SIDDIQUE")
        countryNameList.add("10. MOST. KHADIZA AKTHER")
        countryNameList.add("11. DIPU DEBNATH")
        countryNameList.add("12. ABDULLAH AL MAHMUD")
        countryNameList.add("13. ABID ABDULLAH")
        countryNameList.add("14. MD. SAMINUL AMIN")
        countryNameList.add("15. PARTHA PROTIM BISWAS")
        countryNameList.add("16. JANNATUL FERDOUSE ESHA")
        countryNameList.add("17. MAZHARUL ISLAM")
        countryNameList.add("18. ANKON KUMAR SINGH")
        countryNameList.add("19. MEHEDI HASAN MASUM")
        countryNameList.add("20. MD. HASIN ANJUM")
        countryNameList.add("21. FAIYAZ ISMAIL")
        countryNameList.add("22. AMINUL AHSAN ADIL")
        countryNameList.add("23. JAFIR MIA TASIN")
        countryNameList.add("24. SUKHENDRA NATH DHAR")
        countryNameList.add("25. MD. RAKIBUL ISLAM")
        countryNameList.add("26. SADIA JAMAN")
        countryNameList.add("27. RAFID BIN NASIM")
        countryNameList.add("28. MD. TAJMIL ANWAR TAMIM")
        countryNameList.add("29. SUSMITA RANI GOSH")
        countryNameList.add("30. MD. AZIZUL HAKIM")
        countryNameList.add("31. EBRATUL SHAHARIER")
        countryNameList.add("32. GIDNE HUDA")
        countryNameList.add("33. MD RAKIB AHMED AKASH")
        countryNameList.add("34. SHAFIUZZAMAN AKASH")
        countryNameList.add("35. MEHRAB HOSSAIN SIDDIQUE")
        countryNameList.add("36. JUYENA AKTER")
        countryNameList.add("37. MD. SHAHRIAR GALIB")
        countryNameList.add("38. JOY KUMAR MOHONTO")
        countryNameList.add("39. PRITOM DAS")
        countryNameList.add("40. KAMRUL HASAN")
        countryNameList.add("41. MD. THOWFIQUR BARI CHOWDHURY")
        countryNameList.add("42. UMME ZOAYRIA ABEDIN")
        countryNameList.add("43. PRANTA DAS")
        countryNameList.add("44. SAYEED HASSAN")
        countryNameList.add("45. SAIFUR RAHMAN KHAN")
        countryNameList.add("46. MD. SEYAM HOSSEN")
        countryNameList.add("47. SANJANA YESMIN")
        countryNameList.add("48. MOST. MAYISHA TAJNIM")
        countryNameList.add("49. FARDIN HASAN SAMY")
        countryNameList.add("50. ZIHAN LOBIB CHOWDHURY")
        countryNameList.add("51. NAYEM")
        countryNameList.add("52. MD. MASUM RABBY")
        countryNameList.add("53. HASAN MAHMUD")
        countryNameList.add("54. MST. FATEMA KHATUN")
        countryNameList.add("55. MD. HASHEM ALI SARDER")
        countryNameList.add("56. MALIHA NUSRAT")
        countryNameList.add("57. MAIDUL ISLAM")
        countryNameList.add("58. TASNIM HASAN SHIMANTO")
        countryNameList.add("59. MD. ABDUL SAMAD")
        countryNameList.add("60. MD. MASRUK RAHMAN")
        countryNameList.add("61. MD. MAHMUD HASAN OMI")
        countryNameList.add("62. SUMAIYA AKTER")
        countryNameList.add("63. NEHAL HASNAIN ALVE")
        countryNameList.add("64. UMMAY FARHANA MARIUM")
        countryNameList.add("65. MST. SHIMU KHATUN")
        countryNameList.add("66. MD. FORHAD HASAN JEWEL")


        countryNameList.add("69. MD. SHUVO KHAN")
        countryNameList.add("70. TABASSUM HUDA OYSHI")
        countryNameList.add("71. SHAMIM HOSSAIN")
        countryNameList.add("72. RAHAT AZMAIN RUPAK")
        countryNameList.add("73. MD. FAHIMOR RAHMAN")
        countryNameList.add("74. TAYABA KABIR RICHEE")
        countryNameList.add("75. HARUN OR RASHID RASEL")
        countryNameList.add("76. REJVI AHMED")
        countryNameList.add("77. MOHAMMAD AIAS RAHMAN")
        countryNameList.add("78. MST. NUZHAT-E-RAHMAN")
        countryNameList.add("79. FAHMID HASAN")
        countryNameList.add("80. SHARIF UDDIN")
        countryNameList.add("81. MD. SAYEM ISLAM")
        countryNameList.add("82. MD. KAMRUL HASAN")
        countryNameList.add("83. NILOY CHANDRA DEB")
        countryNameList.add("84. MST. FAHMIDA HAQUE MIM")
        countryNameList.add("85. SHOUROV ROY")
        countryNameList.add("86. ABDULLAH AL MAMUN")
        countryNameList.add("87. MD. ISHMAM IFTI NOOR")
        countryNameList.add("88. A. B. M. MOSTAKIM NILOY")
        countryNameList.add("89. TOWHEDUZZAMAN")
        countryNameList.add("90. MAHDI HASAN QURISHI")
        countryNameList.add("91. SANTOSH SAHA")
        countryNameList.add("92. MD IFTEKHER HAIDER RAKIB")
        countryNameList.add("93. MD. SHAMSHUDDOHA SOUROV")
        countryNameList.add("94. AJOY CHAKRABARTHY")
        countryNameList.add("95. MD. ATAUR RAHMAN")
        countryNameList.add("96. JAWAD AZIZ CHOWDHURY")
        countryNameList.add("97. HRIDOY KUMAR BISWAS")
        countryNameList.add("98. MD. MILON MIA")
        countryNameList.add("99. DHANONJOY KUMAR BARMAN")
        countryNameList.add("100. SAGOR CHANDRA PAUL")
        countryNameList.add("101. MAHIR MOHTASIM AKIF KHAN")

        countryNameList.add("103. SUMAIYA MAMUN")
        countryNameList.add("104. S.K TAWKIR AHMED")
        countryNameList.add("105. RANA SINGHO")






        detailsList.add("Phone: 8801706260318") // 1. ALI ASHRAF TANVIR
        detailsList.add("Phone: 8801876375141") // 2. ZUBAYER HOSSAIN UDAY
        detailsList.add("Phone: 8801832757649") // 3. ARIF BEPARI
        detailsList.add("Phone: 8801619838404") // 4. MD. DELWAR JAHAN
        detailsList.add("Phone: 8801767139718") // 5. SAKIB AL HRIDOY
        detailsList.add("Phone: 8801762489345") // 6. TANZIM HASAN PRAPPO
        detailsList.add("Phone: 8801616184870") // 7. S.M. ASHIKUR RAHAMAN
        detailsList.add("Phone: 8801823024067") // 8. MD. SOHANOOR RAHAMAN SAKIN
        detailsList.add("Phone: 8801886633907") // 9. MD. ABU BAKAR SIDDIQUE
        detailsList.add("Phone: 8801877663882") // 10. MOST. KHADIZA AKTHER
        detailsList.add("Phone: 8801767881443") // 11. DIPU DEBNATH
        detailsList.add("Phone: 8801789816940") // 12. ABDULLAH AL MAHMUD
        detailsList.add("Phone: 8801743332161") // 13. ABID ABDULLAH
        detailsList.add("Phone: 8801326874247") // 14. MD. SAMINUL AMIN
        detailsList.add("Phone: 8801959047750") // 15. PARTHA PROTIM BISWAS
        detailsList.add("Phone: 8801626205221") // 16. JANNATUL FERDOUSE ESHA
        detailsList.add("Phone: 8801996589892") // 17. MAZHARUL ISLAM
        detailsList.add("Phone: 8801912455672") // 18. ANKON KUMAR SINGH
        detailsList.add("Phone: 8801601496272") // 19. MEHEDI HASAN MASUM
        detailsList.add("Phone: 8801743345806") // 20. MD. HASIN ANJUM
        detailsList.add("Phone: 8801767665556") // 21. FAIYAZ ISMAIL
        detailsList.add("Phone: 8801404729993") // 22. AMINUL AHSAN ADIL
        detailsList.add("Phone: 8801754051960") // 23. JAFIR MIA TASIN
        detailsList.add("Phone: 8801714201966") // 24. SUKHENDRA NATH DHAR
        detailsList.add("Phone: 8801753952830") // 25. MD. RAKIBUL ISLAM
        detailsList.add("Phone: 8801773060784") // 26. SADIA JAMAN
        detailsList.add("Phone: 8801517120997") // 27. RAFID BIN NASIM
        detailsList.add("Phone: 8801558957372") // 28. MD. TAJMIL ANWAR TAMIM
        detailsList.add("Phone: 8801776977003") // 29. SUSMITA RANI GOSH
        detailsList.add("Phone: 8801305801465") // 30. MD. AZIZUL HAKIM
        detailsList.add("Phone: 8801703135897") // 31. EBRATUL SHAHARIER
        detailsList.add("Phone: 8801701713892") // 32. GIDNE HUDA
        detailsList.add("Phone: 8801759174736") // 33. MD RAKIB AHMED AKASH
        detailsList.add("Phone: 8801787028090") // 34. SHAFIUZZAMAN AKASH
        detailsList.add("Phone: 8801886541130") // 35. MEHRAB HOSSAIN SIDDIQUE
        detailsList.add("Phone: 8801890302904") // 36. JUYENA AKTER
        detailsList.add("Phone: 8801781539239") // 37. MD. SHAHRIAR GALIB
        detailsList.add("Phone: 01888888888") // 38. JOY KUMAR MOHONTO
        detailsList.add("Phone: 8801771856400") // 39. PRITOM DAS
        detailsList.add("Phone: 8801842781526") // 40. KAMRUL HASAN
        detailsList.add("Phone: 8801305065824") // 41. MD. THOWFIQUR BARI CHOWDHURY
        detailsList.add("Phone: 8801934347283") // 42. UMME ZOAYRIA ABEDIN


        detailsList.add("Phone: 8801995891166") // 43. PRANTA DAS
        detailsList.add("Phone: 8801943358887") // 44. SAYEED HASSAN
        detailsList.add("Phone: 8801632738025") // 45. SAIFUR RAHMAN KHAN
        detailsList.add("Phone: 8801709056950") // 46. MD. SEYAM HOSSEN
        detailsList.add("Phone: 8801797747489") // 47. SANJANA YESMIN
        detailsList.add("Phone: 8801912326574") // 48. MOST. MAYISHA TAJNIM
        detailsList.add("Phone: 8801843017401") // 49. FARDIN HASAN SAMY
        detailsList.add("Phone: 8801301976857") // 50. ZIHAN LOBIB CHOWDHURY
        detailsList.add("Phone: 8801617002978") // 51. NAYEM
        detailsList.add("Phone: 8801737025967") // 52. MD. MASUM RABBY
        detailsList.add("Phone: 8801603222859") // 53. HASAN MAHMUD
        detailsList.add("Phone: 8801796292100") // 54. MST.FATEMA KHATUN
        detailsList.add("Phone: 8801819998439") // 55. MD. HASHEM ALI SARDER
        detailsList.add("Phone: 8801935555421") // 56. MALIHA NUSRAT
        detailsList.add("Phone: 8801772959594") // 57. MAIDUL ISLAM
        detailsList.add("Phone: 8801701338559") // 58. TASNIM HASAN SHIMANTO
        detailsList.add("Phone: 8801701778222") // 59. MD. ABDUL SAMAD
        detailsList.add("Phone: 8801842803191") // 60. MD. MASRUK RAHMAN
        detailsList.add("Phone: 8801886600047") // 61. MD. MAHMUD HASAN OMI
        detailsList.add("Phone: 8801647140174") // 62. SUMAIYA AKTER
        detailsList.add("Phone: 8801947071158") // 63. NEHAL HASNAIN ALVE
        detailsList.add("Phone: 8801872152448") // 64. UMMAY FARHANA MARIUM
        detailsList.add("Phone: 8801310606195") // 65. MST. SHIMU KHATUN
        detailsList.add("Phone: 0177777777777") // 66. MD. FORHAD HASAN JEWEL
        detailsList.add("Phone: 8801603160577") // 1069. MD. SHUVO KHAN
        detailsList.add("Phone: 8801834093856") // 1070. TABASSUM HUDA OYSHI
        detailsList.add("Phone: 8801301924956") // 1071. SHAMIM HOSSAIN
        detailsList.add("Phone: 8801777020195") // 1072. RAHAT AZMAIN RUPAK
        detailsList.add("Phone: 8801773106879") // 1073. MD. FAHIMOR RAHMAN
        detailsList.add("Phone: 8801986098422") // 1074. TAYABA KABIR RICHEE
        detailsList.add("Phone: 8801871414831") // 1075. HARUN OR RASHID RASEL
        detailsList.add("Phone: 8801793183707") // 1076. REJVI AHMED
        detailsList.add("Phone: 8801714328693") // 1077. MOHAMMAD AIAS RAHMAN
        detailsList.add("Phone: 8801771248929") // 1078. MST. NUZHAT-E-RAHMAN
        detailsList.add("Phone: 8801586313185") // 1079. FAHMID HASAN
        detailsList.add("Phone: 8801932573172") // 1080. SHARIF UDDIN
        detailsList.add("Phone: 8801714677847") // 1081. MD. SAYEM ISLAM
        detailsList.add("Phone: 8801308447510") // 1082. MD. KAMRUL HASAN
        detailsList.add("Phone: 8801746978549") // 1083. NILOY CHANDRA DEB
        detailsList.add("Phone: 8801781642855") // 1084. MST. FAHMIDA HAQUE MIM
        detailsList.add("Phone: 8801792841660") // 1085. SHOUROV ROY
        detailsList.add("Phone: 8801622534500") // 1086. ABDULLAH AL MAMUN
        detailsList.add("Phone: 8801880053025") // 1087. MD. ISHMAM IFTI NOOR
        detailsList.add("Phone: 8801751907010") // 1088. A. B. M. MOSTAKIM NILOY
        detailsList.add("Phone: 8801936043645") // 1089. TOWHEDUZZAMAN
        detailsList.add("Phone: 8801964281241") // 1090. MAHDI HASAN QURISHI
        detailsList.add("Phone: 8801825216534") // 1091. SANTOSH SAHA
        detailsList.add("Phone: 8801610051532") // 1092. MD IFTEKHER HAIDER RAKIB
        detailsList.add("Phone: 8801786708462") // 1093. MD. SHAMSHUDDOHA SOUROV
        detailsList.add("Phone: 8801707515085") // 1094. AJOY CHAKRABARTHY
        detailsList.add("Phone: 8801319133660") // 1095. MD. ATAUR RAHMAN
        detailsList.add("Phone: 8801711968254") // 1096. JAWAD AZIZ CHOWDHURY
        detailsList.add("Phone: 8801968365618") // 1097. HRIDOY KUMAR BISWAS
        detailsList.add("Phone: 8801516509402") // 1098. MD. MILON MIA
        detailsList.add("Phone: 8801783062908") // 1099. DHANONJOY KUMAR BARMAN
        detailsList.add("Phone: 8801315839205") // 1100. SAGOR CHANDRA PAUL
        detailsList.add("Phone: 8801313922345") // 1101. MAHIR MOHTASIM AKIF KHAN
        detailsList.add("Phone: 8801408571069") // 1103. SUMAIYA MAMUN
        detailsList.add("Phone: 8801778520511") // 1104. S.K TAWKIR AHMED
        detailsList.add("Phone: 8801779952572") // 1105. RANA SINGHO









        imageList.add(R.drawable.tanvir01) // Ensure these drawable resources exist
        imageList.add(R.drawable.uday02)
        imageList.add(R.drawable.arif03)
        imageList.add(R.drawable.delwar04)
        imageList.add(R.drawable.sakib05)
        imageList.add(R.drawable.tanzim06)
        imageList.add(R.drawable.ashik07)
        imageList.add(R.drawable.sakin08)
        imageList.add(R.drawable.limon09)
        imageList.add(R.drawable.rumi10)
        imageList.add(R.drawable.ic_launcher_foreground) // 11
        imageList.add(R.drawable.abdulla12) // 12
        imageList.add(R.drawable.abidabdullah13) // 13
        imageList.add(R.drawable.samin14) // 14
        imageList.add(R.drawable.partho15) // 15
        imageList.add(R.drawable.ic_launcher_foreground) // 16
        imageList.add(R.drawable.mazharul17) // 17
        imageList.add(R.drawable.ic_launcher_foreground) // 18
        imageList.add(R.drawable.ic_launcher_foreground) // 19
        imageList.add(R.drawable.anzum20) // 20
        imageList.add(R.drawable.ic_launcher_foreground) // 21
        imageList.add(R.drawable.ic_launcher_foreground) // 22
        imageList.add(R.drawable.ic_launcher_foreground) // 23
        imageList.add(R.drawable.ic_launcher_foreground) // 24
        imageList.add(R.drawable.ic_launcher_foreground) // 25
        imageList.add(R.drawable.ic_launcher_foreground) // 26
        imageList.add(R.drawable.ic_launcher_foreground) // 27
        imageList.add(R.drawable.ic_launcher_foreground) // 28
        imageList.add(R.drawable.ic_launcher_foreground) // 29
        imageList.add(R.drawable.ic_launcher_foreground) // 30
        imageList.add(R.drawable.ic_launcher_foreground) // 31
        imageList.add(R.drawable.ic_launcher_foreground) // 32
        imageList.add(R.drawable.ic_launcher_foreground) // 33
        imageList.add(R.drawable.ic_launcher_foreground) // 34
        imageList.add(R.drawable.ic_launcher_foreground) // 35
        imageList.add(R.drawable.ic_launcher_foreground) // 36
        imageList.add(R.drawable.ic_launcher_foreground) // 37
        imageList.add(R.drawable.ic_launcher_foreground) // 38
        imageList.add(R.drawable.ic_launcher_foreground) // 39
        imageList.add(R.drawable.ic_launcher_foreground) // 40
        imageList.add(R.drawable.ic_launcher_foreground) // 41
        imageList.add(R.drawable.ic_launcher_foreground) // 42
        imageList.add(R.drawable.ic_launcher_foreground) // 43
        imageList.add(R.drawable.ic_launcher_foreground) // 44
        imageList.add(R.drawable.ic_launcher_foreground) // 45
        imageList.add(R.drawable.ic_launcher_foreground) // 46
        imageList.add(R.drawable.ic_launcher_foreground) // 47
        imageList.add(R.drawable.ic_launcher_foreground) // 48
        imageList.add(R.drawable.ic_launcher_foreground) // 49
        imageList.add(R.drawable.ic_launcher_foreground) // 50
        imageList.add(R.drawable.ic_launcher_foreground) // 51
        imageList.add(R.drawable.ic_launcher_foreground) // 52
        imageList.add(R.drawable.ic_launcher_foreground) // 53
        imageList.add(R.drawable.ic_launcher_foreground) // 54
        imageList.add(R.drawable.ic_launcher_foreground) // 55
        imageList.add(R.drawable.ic_launcher_foreground) // 56
        imageList.add(R.drawable.ic_launcher_foreground) // 57
        imageList.add(R.drawable.ic_launcher_foreground) // 58
        imageList.add(R.drawable.ic_launcher_foreground) // 59
        imageList.add(R.drawable.ic_launcher_foreground) // 60
        imageList.add(R.drawable.ic_launcher_foreground) // 61
        imageList.add(R.drawable.ic_launcher_foreground) // 62
        imageList.add(R.drawable.ic_launcher_foreground) // 63
        imageList.add(R.drawable.ic_launcher_foreground) // 64
        imageList.add(R.drawable.ic_launcher_foreground) // 65
        imageList.add(R.drawable.ic_launcher_foreground) // 66

        imageList.add(R.drawable.ic_launcher_foreground) // 69
        imageList.add(R.drawable.ic_launcher_foreground) // 70
        imageList.add(R.drawable.ic_launcher_foreground) // 71
        imageList.add(R.drawable.ic_launcher_foreground) // 72
        imageList.add(R.drawable.ic_launcher_foreground) // 73
        imageList.add(R.drawable.ic_launcher_foreground) // 74
        imageList.add(R.drawable.ic_launcher_foreground) // 75
        imageList.add(R.drawable.ic_launcher_foreground) // 76
        imageList.add(R.drawable.ic_launcher_foreground) // 77
        imageList.add(R.drawable.ic_launcher_foreground) // 78
        imageList.add(R.drawable.ic_launcher_foreground) // 79
        imageList.add(R.drawable.ic_launcher_foreground) // 80
        imageList.add(R.drawable.ic_launcher_foreground) // 81
        imageList.add(R.drawable.ic_launcher_foreground) // 82
        imageList.add(R.drawable.ic_launcher_foreground) // 83
        imageList.add(R.drawable.ic_launcher_foreground) // 84
        imageList.add(R.drawable.ic_launcher_foreground) // 85
        imageList.add(R.drawable.ic_launcher_foreground) // 86
        imageList.add(R.drawable.ic_launcher_foreground) // 87
        imageList.add(R.drawable.ic_launcher_foreground) // 88
        imageList.add(R.drawable.ic_launcher_foreground) // 89
        imageList.add(R.drawable.ic_launcher_foreground) // 90
        imageList.add(R.drawable.ic_launcher_foreground) // 91
        imageList.add(R.drawable.ic_launcher_foreground) // 92
        imageList.add(R.drawable.ic_launcher_foreground) // 93
        imageList.add(R.drawable.ic_launcher_foreground) // 94
        imageList.add(R.drawable.ic_launcher_foreground) // 95
        imageList.add(R.drawable.ic_launcher_foreground) // 96
        imageList.add(R.drawable.ic_launcher_foreground) // 97
        imageList.add(R.drawable.ic_launcher_foreground) // 98
        imageList.add(R.drawable.ic_launcher_foreground) // 99
        imageList.add(R.drawable.ic_launcher_foreground) // 100
        imageList.add(R.drawable.ic_launcher_foreground) // 101

        imageList.add(R.drawable.ic_launcher_foreground) // 103
        imageList.add(R.drawable.ic_launcher_foreground) // 104
        imageList.add(R.drawable.ic_launcher_foreground) // 105






        // Initialize and set the adapter
        adapter = CountriesAdapter(countryNameList, detailsList, imageList, this)
        recyclerView.adapter = adapter
    }
}
