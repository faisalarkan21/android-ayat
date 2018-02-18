package com.example.faisal.ayat_syafiq;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;



public class MenuInnerBab4 extends Activity implements BackPressedListener {

    private ListView mainListView ;
    private ArrayAdapter<String> listAdapter ;

    List dataAyatWantedIndexAyat = new ArrayList();
    List dataAyatWantedIndexSurat = new ArrayList();
    List dataAyatWantedIndexNama = new ArrayList();
    List dataAyatWantedIndexKeterangan = new ArrayList();
    List titleSubBab = new ArrayList();
    EntityQuran entity = new EntityQuran();

    String[] ListSub1 = new String[] {"Semua Nikmat Berasal dari Allah", "Nikmat dari Allah Amat Banyak", "Nikmat Allah Tidak Terhitung Jumlahnya","Hidayah Iman Adalah Nikmat", "Terhindar dari Kejahatan Adalah Nikmat", "Terbebas dari Penguasa yang Zalim Adalah Nikmat", "Mendapat Pertolongan Allah Adalah Nikmat", "Menduduki Jabatan Adalah Nikmat", "Mengaku Dapat Nikmat Karena Berilmu",
            "Perintah Memberitakan Nikmat Allah", "Ingkari Ajaran Islam Berarti Menolak Nikmat", "Perintah Mengingat Nikmat Allah", "Jika Peroleh Nikmat Lupakan Allah", "Yang Ingkari Nikmat Allah Kebanyakan Orang Kafir", "Kelak Tiap Nikmat Dipertanyakan", "Allah Melaknat Penentang-Nya dan Penentang Rosul-Nya", "Allah Melaknat Bani Israil", "Laknat Allah untuk Orang Munafik", "Allah Melaknat Orang yang Murtad", "Laknat Allah Bagi Orang Kafir",
            "Allah Melaknat Perusak Janji", "Allah Melaknat Orang yang Durhaka", "Allah Melaknat Penuduh Zina", "Allah Melaknat Pembunuh Orang Mu'min", "Allah Melaknat Orang yang Berbuat Kerusakan", "Allah Melaknat Orang-Orang Zalim", "Azab Allah Benar Adanya", "Sebelum Mengazab, Allah Utus Seorang Rusul", "Nabi Saw. Tak Mengetahui Waktu  Kedatangan Azab", "Waktu Kedatangan Azab Sudah Ditentukan", "Azab Menimpa Secara Tiba-tiba", "Allah Mengazab Orang Musyrik",
            "Pengingkar Nikmat Pasti Diazab", "Yang Menyesatkan Manusia Peroleh Azab Berlipat Ganda", "Yang Sesat Juga Diazab", "Orang Zalim Tertimpa Azab yang Pedih", "Azab Menimpa Negeri Orang-orang Zalim", "Gempa Bumi sebagai Azab", "Hujan Batu sebagai Azab", "Kabut Asap sebagai Azab", "Kaum Nabi Syu'aib yang Ingkar Diazab dengan Suara Keras", "Azab Dunia Juga Menimpa yang Tak Berdosa", "Ada yang Diazab Sewaktu Dalam Perjalanan", "Azab di Dunia sebagai Teguran", "Larangan Memohon Disegerakan Azab", "Penundaan Azab di Dunia sebagai Ujian", "Tiada Pelindung bagi Mereka dari Azab Allah", "Mereka Sadar Setelah Ditimpa Azab", "Usai Azab Diangkat Mereka Kembali Ingkar", "Terhadap Azab Allah Kita Patut Taut", "Janji Bertaubat Setelah Tertimpa Azab"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_inner_sub);

        titleSubBab.add("Nikmat Allah SWT");
        titleSubBab.add("Laknat (Kutukan) Allah SWT");
        titleSubBab.add("Azab(Siksa) Allah SWT");


        mainListView = (ListView) findViewById(R.id.list);
        listAdapter = new ArrayAdapter<String>(this, R.layout.list_inner_sub, ListSub1);

        mainListView.setAdapter(listAdapter);


        mainListView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position, long arg3) {

                Intent intent = new Intent(MenuInnerBab4.this, MenuAyat.class);
                if (position == 0) {

                    dataAyatWantedIndexAyat.add(53);
                    dataAyatWantedIndexSurat.add(16);
                    dataAyatWantedIndexNama.add("Q.S An Nahl 16:53");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 1) {

                    dataAyatWantedIndexAyat.add(1);
                    dataAyatWantedIndexSurat.add(108);
                    dataAyatWantedIndexNama.add("Q.S Al Kautsar 108:1");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 2) {

                    dataAyatWantedIndexAyat.add(34);
                    dataAyatWantedIndexSurat.add(14);
                    dataAyatWantedIndexNama.add("Q.S Ibrohim 14:34");
                    dataAyatWantedIndexKeterangan.add("Maksudnya Allah telah menyediakan segala keperluan manusia");

                    dataAyatWantedIndexAyat.add(18);
                    dataAyatWantedIndexSurat.add(16);
                    dataAyatWantedIndexNama.add("Q.S An Nahl 16:18");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 3) {

                    dataAyatWantedIndexAyat.add(17);
                    dataAyatWantedIndexSurat.add(49);
                    dataAyatWantedIndexNama.add("Q.S Al Hujuroot 49:17");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 4) {

                    dataAyatWantedIndexAyat.add(11);
                    dataAyatWantedIndexSurat.add(5);
                    dataAyatWantedIndexNama.add("Q.S Al Maidah 5:11");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 5) {

                    dataAyatWantedIndexAyat.add(6);
                    dataAyatWantedIndexSurat.add(14);
                    dataAyatWantedIndexNama.add("Q.S Ibrohim 14:6");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 6) {

                    dataAyatWantedIndexAyat.add(9);
                    dataAyatWantedIndexSurat.add(33);
                    dataAyatWantedIndexNama.add("Q.S Al Ahzab 33:9");
                    dataAyatWantedIndexKeterangan.add("Yang dimaksud tentara-tentara dalam ayat ini adalah pasukan gabungan antara golongan Quraisy, Yahudi Quroizah dan Yahudi Nadhir di Madinah dalam peperangan Khondaq");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 7) {

                    dataAyatWantedIndexAyat.add(20);
                    dataAyatWantedIndexSurat.add(5);
                    dataAyatWantedIndexNama.add("Q.S Al Maidah 5:20");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 8) {

                    dataAyatWantedIndexAyat.add(49);
                    dataAyatWantedIndexSurat.add(39);
                    dataAyatWantedIndexNama.add("Q.S Az Zumar 39:49");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 9) {

                    dataAyatWantedIndexAyat.add(11);
                    dataAyatWantedIndexSurat.add(93);
                    dataAyatWantedIndexNama.add("Q.S Adh Dhuhaa 93:11");
                    dataAyatWantedIndexKeterangan.add("Di antara sekian banyak, nikmat dari Allah SWT, maka hidayah untuk memeluk Islam adalah nikmat yang tertinggi. Nikmat inilah yang hendaknya disebarluaskan");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 10) {

                    dataAyatWantedIndexAyat.add(211);
                    dataAyatWantedIndexSurat.add(2);
                    dataAyatWantedIndexNama.add("Q.S Al Baqorooh 2:211");
                    dataAyatWantedIndexKeterangan.add("nikmat Allah yang dimaksud dalam ayat ini adalah perintah-perintah dan ajaran Allah yang mereka tolak");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 11) {

                    dataAyatWantedIndexAyat.add(40);
                    dataAyatWantedIndexSurat.add(2);
                    dataAyatWantedIndexNama.add("Q.S Al Baqorooh 2:40");
                    dataAyatWantedIndexKeterangan.add("1.Israil adalah sebutan untuk Nabi Ya'qub as. Dengan demikian Bani Israil adalah keturunan beliau " +
                            "2.Janji Bani Israil kepada Tuhan adalah bahwa mereka akan menyembah-Nya, dan tidak akan mempersekutukan-Nya");

                    dataAyatWantedIndexAyat.add(47);
                    dataAyatWantedIndexSurat.add(2);
                    dataAyatWantedIndexNama.add("Q.S Al Baqoroh 2:47");
                    dataAyatWantedIndexKeterangan.add("Bani Israil pada masa itu punya kelebiham dari umat lainnya, sebab banyak nabi dan rosul berasal dari kalangan mereka");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 12) {

                    dataAyatWantedIndexAyat.add(83);
                    dataAyatWantedIndexSurat.add(17);
                    dataAyatWantedIndexNama.add("Q.S Al Isroo' 17:83");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 13) {

                    dataAyatWantedIndexAyat.add(83);
                    dataAyatWantedIndexSurat.add(17);
                    dataAyatWantedIndexNama.add("Q.S An Nahl 16:83");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 14) {

                    dataAyatWantedIndexAyat.add(102);
                    dataAyatWantedIndexSurat.add(8);
                    dataAyatWantedIndexNama.add("Q.S At Taakatsur 102:8");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 15) {

                    dataAyatWantedIndexAyat.add(57);
                    dataAyatWantedIndexSurat.add(33);
                    dataAyatWantedIndexNama.add("Q.S Al Ahzab 33:57");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 16) {

                    dataAyatWantedIndexAyat.add(78);
                    dataAyatWantedIndexSurat.add(5);
                    dataAyatWantedIndexNama.add("Q.S Al Maidah 5:78");
                    dataAyatWantedIndexKeterangan.add("Maksudnya Nabi Daud as. dan Nabi Isa as. mengutuk bani Israil yang kafir dan Allah SWT membenarkan");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 17) {

                    dataAyatWantedIndexAyat.add(68);
                    dataAyatWantedIndexSurat.add(9);
                    dataAyatWantedIndexNama.add("Q.S At Taubah 9:68");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 18) {

                    dataAyatWantedIndexAyat.add(86);
                    dataAyatWantedIndexSurat.add(3);
                    dataAyatWantedIndexNama.add("Q.S Ali Imron 3:86");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(87);
                    dataAyatWantedIndexSurat.add(3);
                    dataAyatWantedIndexNama.add("Q.S Ali Imron 3:87");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 19) {

                    dataAyatWantedIndexAyat.add(88);
                    dataAyatWantedIndexSurat.add(2);
                    dataAyatWantedIndexNama.add("Q.S Al Baqorooh 2:88");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(89);
                    dataAyatWantedIndexSurat.add(2);
                    dataAyatWantedIndexNama.add("Q.S Al Baqorooh 2:89");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(161);
                    dataAyatWantedIndexSurat.add(2);
                    dataAyatWantedIndexNama.add("Q.S Al Baqorooh 2:161");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(64);
                    dataAyatWantedIndexSurat.add(33);
                    dataAyatWantedIndexNama.add("Q.S Al Ahzab 33:64");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 20) {

                    dataAyatWantedIndexAyat.add(25);
                    dataAyatWantedIndexSurat.add(13);
                    dataAyatWantedIndexNama.add("Q.S Ar Ro'd 13:25");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 21) {

                    dataAyatWantedIndexAyat.add(47);
                    dataAyatWantedIndexSurat.add(4);
                    dataAyatWantedIndexNama.add("Q.S An Nisaa' 4:47");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 22) {

                    dataAyatWantedIndexAyat.add(23);
                    dataAyatWantedIndexSurat.add(24);
                    dataAyatWantedIndexNama.add("Q.S An Nuur 24:23");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 23) {

                    dataAyatWantedIndexAyat.add(93);
                    dataAyatWantedIndexSurat.add(4);
                    dataAyatWantedIndexNama.add("Q.S An Nisaa' 4:93");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 24) {

                    dataAyatWantedIndexAyat.add(22);
                    dataAyatWantedIndexSurat.add(47);
                    dataAyatWantedIndexNama.add("Q.S Muhammad 47:22");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(23);
                    dataAyatWantedIndexSurat.add(47);
                    dataAyatWantedIndexNama.add("Q.S Muhammad 47:23");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 25) {

                    dataAyatWantedIndexAyat.add(18);
                    dataAyatWantedIndexSurat.add(11);
                    dataAyatWantedIndexNama.add("Q.S Hud 11:18");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 26) {

                    dataAyatWantedIndexAyat.add(53);
                    dataAyatWantedIndexSurat.add(10);
                    dataAyatWantedIndexNama.add("Q.S Yunus 10:53");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 27) {

                    dataAyatWantedIndexAyat.add(131);
                    dataAyatWantedIndexSurat.add(6);
                    dataAyatWantedIndexNama.add("Q.S Yunus 6:131");
                    dataAyatWantedIndexKeterangan.add("Allah tidak menimpakan azab untuk membinasakan suatu negeri, melainkan setelah Allah memberikan peringatan");

                    dataAyatWantedIndexAyat.add(15);
                    dataAyatWantedIndexSurat.add(17);
                    dataAyatWantedIndexNama.add("Q.S Al Isroo' 17:15");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(134);
                    dataAyatWantedIndexSurat.add(20);
                    dataAyatWantedIndexNama.add("Q.S Thooha 20:134");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(108);
                    dataAyatWantedIndexSurat.add(26);
                    dataAyatWantedIndexNama.add("Q.S Asy Syu'aroo 26:108");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 28) {

                    dataAyatWantedIndexAyat.add(72);
                    dataAyatWantedIndexSurat.add(25);
                    dataAyatWantedIndexNama.add("Q.S Al Jin 25:72");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 29) {

                    dataAyatWantedIndexAyat.add(61);
                    dataAyatWantedIndexSurat.add(16);
                    dataAyatWantedIndexNama.add("Q.S An Nahl 16:61");
                    dataAyatWantedIndexKeterangan.add("Kedurhakaan manusia juga membawa bencana kepada makhluk lain sampai kepada hewan melata di bumi");

                    dataAyatWantedIndexAyat.add(84);
                    dataAyatWantedIndexSurat.add(19);
                    dataAyatWantedIndexNama.add("Q.S Al Maryam 19:84");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(53);
                    dataAyatWantedIndexSurat.add(29);
                    dataAyatWantedIndexNama.add("Q.S Al 'Ankabut 29:53");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 30) {

                    dataAyatWantedIndexAyat.add(4);
                    dataAyatWantedIndexSurat.add(7);
                    dataAyatWantedIndexNama.add("Q.S AlA'roof 7:4");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(40);
                    dataAyatWantedIndexSurat.add(21);
                    dataAyatWantedIndexNama.add("Q.S Al Ambiyaa' 21:40");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(55);
                    dataAyatWantedIndexSurat.add(39);
                    dataAyatWantedIndexNama.add("Q.S Az Zumar 39:55");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 31) {

                    dataAyatWantedIndexAyat.add(6);
                    dataAyatWantedIndexSurat.add(48);
                    dataAyatWantedIndexNama.add("Q.S Al Fath 48:6");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 32) {

                    dataAyatWantedIndexAyat.add(50);
                    dataAyatWantedIndexSurat.add(41);
                    dataAyatWantedIndexNama.add("Q.S Fushshilat 41:50");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 33) {

                    dataAyatWantedIndexAyat.add(38);
                    dataAyatWantedIndexSurat.add(7);
                    dataAyatWantedIndexNama.add("Q.S Al A'roof 7:38");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 34) {

                    dataAyatWantedIndexAyat.add(33);
                    dataAyatWantedIndexSurat.add(13);
                    dataAyatWantedIndexNama.add("Q.S Ar Ro'd 13:33");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(34);
                    dataAyatWantedIndexSurat.add(13);
                    dataAyatWantedIndexNama.add("Q.S Ar Ro'd 13:34");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 35) {

                    dataAyatWantedIndexAyat.add(21);
                    dataAyatWantedIndexSurat.add(42);
                    dataAyatWantedIndexNama.add("Q.S Asy Syuuroo 42:21");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(22);
                    dataAyatWantedIndexSurat.add(42);
                    dataAyatWantedIndexNama.add("Q.S Asy Syuuroo 42:22");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 36) {

                    dataAyatWantedIndexAyat.add(58);
                    dataAyatWantedIndexSurat.add(17);
                    dataAyatWantedIndexNama.add("Q.S Al Isroo' 17:58");
                    dataAyatWantedIndexKeterangan.add("Semua ketentuan Allah sudah tertulis di Lauhul Mahdfuzh");


                    dataAyatWantedIndexAyat.add(59);
                    dataAyatWantedIndexSurat.add(18);
                    dataAyatWantedIndexNama.add("Q.S Al Kahfi 18:59");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(11);
                    dataAyatWantedIndexSurat.add(21);
                    dataAyatWantedIndexNama.add("Q.S Al Ambiyaa' 21:11");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(45);
                    dataAyatWantedIndexSurat.add(22);
                    dataAyatWantedIndexNama.add("Q.S Al Hajj 22:45");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 37) {

                    dataAyatWantedIndexAyat.add(77);
                    dataAyatWantedIndexSurat.add(7);
                    dataAyatWantedIndexNama.add("Q.S Al A'roof 7:77");
                    dataAyatWantedIndexKeterangan.add("Semua ketentuan Allah sudah tertulis di Lauhul Mahdfuzh");


                    dataAyatWantedIndexAyat.add(78);
                    dataAyatWantedIndexSurat.add(7);
                    dataAyatWantedIndexNama.add("Q.S Al A'roof 7:78");
                    dataAyatWantedIndexKeterangan.add("Ayat ini menerangkan bahwa Allah SWT menurunkan azab berupa gempa bumi kepada kaum Nabi Sholeh yang mengingkari dan menentang kebenaran yang di bawa oleh beliau");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 38) {

                    dataAyatWantedIndexAyat.add(84);
                    dataAyatWantedIndexSurat.add(7);
                    dataAyatWantedIndexNama.add("Q.S Al A'roof' 7:84");
                    dataAyatWantedIndexKeterangan.add("Hujan batu ini diturunkan kepada kaum Nabi Luth yang kafir dan melampaui batas dalam berbuat dosa, yaitu 'hubungan' sesama jenis ");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 39) {

                    dataAyatWantedIndexAyat.add(10);
                    dataAyatWantedIndexSurat.add(44);
                    dataAyatWantedIndexNama.add("Q.S Al Ad Dukhoon 44:10");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(11);
                    dataAyatWantedIndexSurat.add(44);
                    dataAyatWantedIndexNama.add("Q.S Ad Dukhoon 44:11");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 40) {

                    dataAyatWantedIndexAyat.add(94);
                    dataAyatWantedIndexSurat.add(11);
                    dataAyatWantedIndexNama.add("Q.S Hud 11:94");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 41) {

                    dataAyatWantedIndexAyat.add(25);
                    dataAyatWantedIndexSurat.add(8);
                    dataAyatWantedIndexNama.add("Q.S Al Anfaal 8:25");
                    dataAyatWantedIndexKeterangan.add("Hendaklah kita berusaha menghilangkan fitnah yang akibatnya tidak akan mengenai kaum yang bersalah saja, melainkan juga menimpa orang orang yang tidak bersalah");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 42) {

                    dataAyatWantedIndexAyat.add(46);
                    dataAyatWantedIndexSurat.add(16);
                    dataAyatWantedIndexNama.add("Q.S An Nahl 16:46");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 43) {

                    dataAyatWantedIndexAyat.add(75);
                    dataAyatWantedIndexSurat.add(23);
                    dataAyatWantedIndexNama.add("Q.S Al Ad Mu'minuun 23:75");
                    dataAyatWantedIndexKeterangan.add("Andai permohonan perlindungan yang mereka sampaikan kepada Nabi Muhammad Rosullullah Saw. itu dikabulkan oleh Allah SWT, niscaya kekafiran mereka akan terus berlanjut");


                    dataAyatWantedIndexAyat.add(21);
                    dataAyatWantedIndexSurat.add(32);
                    dataAyatWantedIndexNama.add("Q.S As Sajdah 32:21");
                    dataAyatWantedIndexKeterangan.add("Yang dimaksud siksa yang dekat adalah azab yang ditimpakan kepada orang-orang yang durhaka selama di dunia sebelum disiksa dengan siksaan yang lebih besar di akhirat kelak");

                    dataAyatWantedIndexAyat.add(6);
                    dataAyatWantedIndexSurat.add(13);
                    dataAyatWantedIndexNama.add("Q.S Ar Ro'd 13:6");
                    dataAyatWantedIndexKeterangan.add("Orang-orang musyrik dengan cara mengejek meminta nabi Muhammad Rosululloh Saw. agar mensegerakan turunnya siksa, padahal seharusnya mereka meminta rahmat dan keselamatan lebih dahulu");

                    dataAyatWantedIndexAyat.add(71);
                    dataAyatWantedIndexSurat.add(27);
                    dataAyatWantedIndexNama.add("Q.S An Naml 27:71");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(72);
                    dataAyatWantedIndexSurat.add(27);
                    dataAyatWantedIndexNama.add("Q.S An Naml 27:72");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 44) {

                    dataAyatWantedIndexAyat.add(37);
                    dataAyatWantedIndexSurat.add(21);
                    dataAyatWantedIndexNama.add("Q.S Al Ambiyaa' 21:37");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 45) {

                    dataAyatWantedIndexAyat.add(111);
                    dataAyatWantedIndexSurat.add(21);
                    dataAyatWantedIndexNama.add("Q.S Al Ambiyaa' 21:111");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 46) {

                    dataAyatWantedIndexAyat.add(43);
                    dataAyatWantedIndexSurat.add(21);
                    dataAyatWantedIndexNama.add("Q.S Al Ambiyaa' 21:43");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 47) {

                    dataAyatWantedIndexAyat.add(12);
                    dataAyatWantedIndexSurat.add(21);
                    dataAyatWantedIndexNama.add("Q.S Al Ambiyaa' 21:12");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(13);
                    dataAyatWantedIndexSurat.add(21);
                    dataAyatWantedIndexNama.add("Q.S Al Ambiyaa' 21:13");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(14);
                    dataAyatWantedIndexSurat.add(21);
                    dataAyatWantedIndexNama.add("Q.S Al Ambiyaa' 21:14");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 48) {

                    dataAyatWantedIndexAyat.add(15);
                    dataAyatWantedIndexSurat.add(44);
                    dataAyatWantedIndexNama.add("Q.S Ad Dukhoon 44:15");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 49) {

                    dataAyatWantedIndexAyat.add(57);
                    dataAyatWantedIndexSurat.add(17);
                    dataAyatWantedIndexNama.add("Q.S Al Isroo' 17:57");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 50) {

                    dataAyatWantedIndexAyat.add(12);
                    dataAyatWantedIndexSurat.add(44);
                    dataAyatWantedIndexNama.add("Q.S Ad Dukhoon 44:12");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                }

                dataAyatWantedIndexNama.clear();
                dataAyatWantedIndexSurat.clear();
                dataAyatWantedIndexAyat.clear();
                dataAyatWantedIndexKeterangan.clear();

            }

        });
    }

}