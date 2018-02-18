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



public class MenuInnerBab3 extends Activity implements BackPressedListener {

    private ListView mainListView ;
    private ArrayAdapter<String> listAdapter ;

    List dataAyatWantedIndexAyat = new ArrayList();
    List dataAyatWantedIndexSurat = new ArrayList();
    List dataAyatWantedIndexNama = new ArrayList();
    List dataAyatWantedIndexKeterangan = new ArrayList();
    List titleSubBab = new ArrayList();
    EntityQuran entity = new EntityQuran();

    String[] ListSub1 = new String[] {"Hidayah Datangnya Dari Allah", "Allah Wajibkan Diri-Nya Memberi Hidayah", "Hidayah Allah SWT yang Benar", "Tiap Kaum Ada Pembawa Hidayah", "Allah Memberi Hidayah dengan Kitab-Nya", "Tanda-tanda Orang Mendapat Hidayah", "Memberikan Hidayah Mutlak Hak Allah", "Memeluk Islam Berarti Mendapat Petunjuk", "Hati Orang Beriman dan Taat Mendapat Hidayah", "yang Beriman dan Yang Beramal Saleh Tetap Dapat Hidayah",
    "Yang Taat kepada Allah Peroleh Banyak Hidayah", "Yang Mendapat Hidayah Tidak Akan Tersesat", "Yang Tidak Beriman Tidak Akan Peroleh Hidayah", "Allah Tidak Memberi Hidayah kepada Kaum yang Zalim", "Allah Tidak Memberi Petunjuk kepada Kaum yang Murtad", "Pendusta Tidak Akan Peroleh Hidayah", "Orang yang Sesat Tidak Akan Peroleh Hidayah", "Buah Hidayah/Kesesatan untuk Manusia Itu Sendiri", "Tidak Ada Penolong Bagi yang Disesatkan-Nya", "Allah Biarkan Orang yang Disesatkan-Nya", "Rahmat Allah Luas", "Rahmat Tuhanmu Lebih Baik dari Harta Kekayaan",
    "Memberi/Menahan Rahmat hak Mutlak Allah", "Rahmat Allah untuk yang Dikehendakinya", "Rahmat Allah Dekat dengan yang Berbuat Baik", "Tidak Ada yang Halangi Bencana atau Rahmat Allah","Janganlah Putus Asa dari Rahmat Allah", "Orang Mu'min Peroleh Dua Rahmat","Jika Peroleh Rahmat Manusia Gembira", "Jika Rahmat Itu Dicabut Mereka Putus Asa", "Do'a Memohon Rahmat", "Segala Kebaikan Berkat Karunia Allah","Rahmat & Karunia Allah Selamatkan Manusia dari Kesesatan", "Allah Memiliki Karunia yang Besar", "Kehadiran Rosul adalah Karunia Allah", "Mendapat Ridho Allah SWT Adalah Keberuntungan yang Besar",
    "Carilah Ridho Allah SWT dengan Sabar dan Ibadah", "Ada yang Korbankan Diri Mencari Ridho Allah SWT", "Allah SWT Meridhoi Rasa Syukur Hambanya", "Ridho Allah SWT Hanya Dapat Dicapai dengan Takwa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_inner_sub);

        titleSubBab.add("Hidayah dan Rahmat Allah SWT");
        titleSubBab.add("Mereka yang Diberi Hidayah dan yang Tidak Mendapatkannya");
        titleSubBab.add("Rahmat dan Karunia Allah SWT");
        titleSubBab.add("Ridho Allah");


        mainListView = (ListView) findViewById(R.id.list);
        listAdapter = new ArrayAdapter<String>(this, R.layout.list_inner_sub, ListSub1);

        mainListView.setAdapter(listAdapter);


        mainListView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position, long arg3) {

                Intent intent = new Intent(MenuInnerBab3.this, MenuAyat.class);
                if (position == 0) {

                    dataAyatWantedIndexAyat.add(50);
                    dataAyatWantedIndexSurat.add(34);
                    dataAyatWantedIndexNama.add("Q.S Saba' 34:50");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 1) {

                    dataAyatWantedIndexAyat.add(12);
                    dataAyatWantedIndexSurat.add(92);
                    dataAyatWantedIndexNama.add("Q.S Al Lail 92:12");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 2) {

                    dataAyatWantedIndexAyat.add(120);
                    dataAyatWantedIndexSurat.add(2);
                    dataAyatWantedIndexNama.add("Q.S Al Baqorooh 2:120");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(73);
                    dataAyatWantedIndexSurat.add(3);
                    dataAyatWantedIndexNama.add("Q.S Ali Imran 3:73");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(71);
                    dataAyatWantedIndexSurat.add(6);
                    dataAyatWantedIndexNama.add("Q.S Al An'aam 6:71");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 3) {

                    dataAyatWantedIndexAyat.add(7);
                    dataAyatWantedIndexSurat.add(13);
                    dataAyatWantedIndexNama.add("Q.S Ar Ro'd 13:7");
                    dataAyatWantedIndexKeterangan.add("Dalam ayat ini Allah SWT membesarkan hati Nabi Muhammad Saw, berkaitan dengan adanya bermacam-macam permintaan mereka yang tiddak masuk akal");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 4) {

                    dataAyatWantedIndexAyat.add(16);
                    dataAyatWantedIndexSurat.add(5);
                    dataAyatWantedIndexNama.add("Q.S Al Maaidah 5:16");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(6);
                    dataAyatWantedIndexSurat.add(34);
                    dataAyatWantedIndexNama.add("Q.S Saba' 34:6");
                    dataAyatWantedIndexKeterangan.add("");


                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 5) {

                    dataAyatWantedIndexAyat.add(137);
                    dataAyatWantedIndexSurat.add(2);
                    dataAyatWantedIndexNama.add("Q.S Al Baqorooh 2:137");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(101);
                    dataAyatWantedIndexSurat.add(3);
                    dataAyatWantedIndexNama.add("Q.S Ali Imran 3:101");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 6) {

                    dataAyatWantedIndexAyat.add(88);
                    dataAyatWantedIndexSurat.add(6);
                    dataAyatWantedIndexNama.add("Q.S Al An'aam 6:88");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(56);
                    dataAyatWantedIndexSurat.add(28);
                    dataAyatWantedIndexNama.add("Q.S Qoshosh 28:56");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(8);
                    dataAyatWantedIndexSurat.add(35);
                    dataAyatWantedIndexNama.add("Q.S Faathir 35:8");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(1).toString());

                    startActivity(intent);


                } else if (position == 7) {

                    dataAyatWantedIndexAyat.add(125);
                    dataAyatWantedIndexSurat.add(6);
                    dataAyatWantedIndexNama.add("Q.S Al An'aam 6:125");
                    dataAyatWantedIndexKeterangan.add("Kesulitannya Menerima Islam dirasakannya sebagai sesuatu yang melelahkan");


                    dataAyatWantedIndexAyat.add(161);
                    dataAyatWantedIndexSurat.add(6);
                    dataAyatWantedIndexNama.add("Q.S Al An'aam 6:161");
                    dataAyatWantedIndexKeterangan.add("Ajaran yang dibawa oleh Nabi Muhammad Rosululloh Saw. Tidak berbeda dengan yang dibawa oleh Nabi Ibrahim as., yaitu ajaran Tauhid(Meng-Esakan Allah SWT)");


                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(1).toString());

                    startActivity(intent);


                } else if (position == 8) {

                    dataAyatWantedIndexAyat.add(11);
                    dataAyatWantedIndexSurat.add(64);
                    dataAyatWantedIndexNama.add("Q.S At Taghoobun 64:11");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(54);
                    dataAyatWantedIndexSurat.add(24);
                    dataAyatWantedIndexNama.add("Q.S An Nuur 24:54");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(1).toString());

                    startActivity(intent);


                } else if (position == 9) {

                    dataAyatWantedIndexAyat.add(9);
                    dataAyatWantedIndexSurat.add(10);
                    dataAyatWantedIndexNama.add("Q.S Yunus 10:9");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(82);
                    dataAyatWantedIndexSurat.add(20);
                    dataAyatWantedIndexNama.add("Q.S Thooha 20:82");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(54);
                    dataAyatWantedIndexSurat.add(22);
                    dataAyatWantedIndexNama.add("Q.S Al Hajj 22:54");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(1).toString());

                    startActivity(intent);


                } else if (position == 10) {

                    dataAyatWantedIndexAyat.add(69);
                    dataAyatWantedIndexSurat.add(29);
                    dataAyatWantedIndexNama.add("Q.S Al Ankabuut 29:69");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(1).toString());

                    startActivity(intent);


                } else if (position == 11) {

                    dataAyatWantedIndexAyat.add(105);
                    dataAyatWantedIndexSurat.add(5);
                    dataAyatWantedIndexNama.add("Q.S Al Maaidah 5:105");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(115);
                    dataAyatWantedIndexSurat.add(9);
                    dataAyatWantedIndexNama.add("Q.S At Taubah 9:115");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(37);
                    dataAyatWantedIndexSurat.add(39);
                    dataAyatWantedIndexNama.add("Q.S Al Az Zumar 39:37");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(1).toString());

                    startActivity(intent);


                } else if (position == 12) {

                    dataAyatWantedIndexAyat.add(104);
                    dataAyatWantedIndexSurat.add(16);
                    dataAyatWantedIndexNama.add("Q.S An Nahl 16:104");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 13) {

                    dataAyatWantedIndexAyat.add(258);
                    dataAyatWantedIndexSurat.add(2);
                    dataAyatWantedIndexNama.add("Q.S Al Baqorooh 2:258");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(1).toString());

                    startActivity(intent);


                } else if (position == 14) {

                    dataAyatWantedIndexAyat.add(86);
                    dataAyatWantedIndexSurat.add(3);
                    dataAyatWantedIndexNama.add("Q.S Ali Imran 3:86");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(1).toString());

                    startActivity(intent);


                } else if (position == 15) {

                    dataAyatWantedIndexAyat.add(3);
                    dataAyatWantedIndexSurat.add(39);
                    dataAyatWantedIndexNama.add("Q.S Az Zumar 39:3");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 16) {

                    dataAyatWantedIndexAyat.add(37);
                    dataAyatWantedIndexSurat.add(16);
                    dataAyatWantedIndexNama.add("Q.S An Nahl 16:37");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(1).toString());

                    startActivity(intent);


                } else if (position == 17) {

                    dataAyatWantedIndexAyat.add(108);
                    dataAyatWantedIndexSurat.add(10);
                    dataAyatWantedIndexNama.add("Q.S Yunus 10:108");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(92);
                    dataAyatWantedIndexSurat.add(27);
                    dataAyatWantedIndexNama.add("Q.S An Naml 27:92");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(71);
                    dataAyatWantedIndexSurat.add(6);
                    dataAyatWantedIndexNama.add("Q.S Az Zumar 39:41");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(1).toString());

                    startActivity(intent);


                } else if (position == 18) {

                    dataAyatWantedIndexAyat.add(33);
                    dataAyatWantedIndexSurat.add(13);
                    dataAyatWantedIndexNama.add("Q.S Ar Ro'd 13:33");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(97);
                    dataAyatWantedIndexSurat.add(17);
                    dataAyatWantedIndexNama.add("Q.S Ali Isro 17:97");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(97);
                    dataAyatWantedIndexSurat.add(18);
                    dataAyatWantedIndexNama.add("Q.S Al Kahfi 18:17");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(71);
                    dataAyatWantedIndexSurat.add(6);
                    dataAyatWantedIndexNama.add("Q.S Ar Rumm 30:29");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(33);
                    dataAyatWantedIndexSurat.add(40);
                    dataAyatWantedIndexNama.add("Q.S Al Mu'min 40:33");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(1).toString());

                    startActivity(intent);


                } else if (position == 19) {

                    dataAyatWantedIndexAyat.add(186);
                    dataAyatWantedIndexSurat.add(7);
                    dataAyatWantedIndexNama.add("Q.S Al A'roof  7:186");
                    dataAyatWantedIndexKeterangan.add("");


                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(1).toString());

                    startActivity(intent);


                } else if (position == 20) {

                    dataAyatWantedIndexAyat.add(33);
                    dataAyatWantedIndexSurat.add(13);
                    dataAyatWantedIndexNama.add("Q.S Al An'aam 6:147 ");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(2).toString());

                    startActivity(intent);


                } else if (position == 21) {

                    dataAyatWantedIndexAyat.add(32);
                    dataAyatWantedIndexSurat.add(43);
                    dataAyatWantedIndexNama.add("Q.S Az Zukhruf 43:32");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(2).toString());

                    startActivity(intent);


                } else if (position == 22) {

                    dataAyatWantedIndexAyat.add(2);
                    dataAyatWantedIndexSurat.add(35);
                    dataAyatWantedIndexNama.add("Q.S Faathir 35:2");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 23) {

                    dataAyatWantedIndexAyat.add(74);
                    dataAyatWantedIndexSurat.add(3);
                    dataAyatWantedIndexNama.add("Q.S Ali Imron 3:74");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(2).toString());

                    startActivity(intent);


                } else if (position == 24) {

                    dataAyatWantedIndexAyat.add(56);
                    dataAyatWantedIndexSurat.add(7);
                    dataAyatWantedIndexNama.add("Q.S Al A'roof 7:56");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(2).toString());

                    startActivity(intent);


                } else if (position == 25) {

                    dataAyatWantedIndexAyat.add(17);
                    dataAyatWantedIndexSurat.add(33);
                    dataAyatWantedIndexNama.add("Q.S Al Ahzab 33:17");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 26) {

                    dataAyatWantedIndexAyat.add(87);
                    dataAyatWantedIndexSurat.add(12);
                    dataAyatWantedIndexNama.add("Q.S yusuf 12:87");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(56);
                    dataAyatWantedIndexSurat.add(15);
                    dataAyatWantedIndexNama.add("Q.S Al Hijr 15:56");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(23);
                    dataAyatWantedIndexSurat.add(29);
                    dataAyatWantedIndexNama.add("Q.S Al Ankabuut 29:23");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(2).toString());

                    startActivity(intent);


                } else if (position == 27) {

                    dataAyatWantedIndexAyat.add(28);
                    dataAyatWantedIndexSurat.add(57);
                    dataAyatWantedIndexNama.add("Q.S Al Hadiid 57:28");
                    dataAyatWantedIndexKeterangan.add("");


                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(2).toString());

                    startActivity(intent);


                } else if (position == 28) {

                    dataAyatWantedIndexAyat.add(36);
                    dataAyatWantedIndexSurat.add(30);
                    dataAyatWantedIndexNama.add("Q.S Ar Ruum 30:36");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(48);
                    dataAyatWantedIndexSurat.add(42);
                    dataAyatWantedIndexNama.add("Q.S Asy Syuuroo 42:48");
                    dataAyatWantedIndexKeterangan.add("Kedua ayat ini menerangkan tentang kebiasaan manusia yang selalu bergembira jika mendapatkan nikmat dan berputus asa atau bahkan ingkar apabila memperoleh musibah");


                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(2).toString());

                    startActivity(intent);


                } else if (position == 29) {

                    dataAyatWantedIndexAyat.add(9);
                    dataAyatWantedIndexSurat.add(11);
                    dataAyatWantedIndexNama.add("Q.S Hud 11:9");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(2).toString());

                    startActivity(intent);


                } else if (position == 30) {

                    dataAyatWantedIndexAyat.add(8);
                    dataAyatWantedIndexSurat.add(3);
                    dataAyatWantedIndexNama.add("Q.S Ali Imron 3:8");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(109);
                    dataAyatWantedIndexSurat.add(23);
                    dataAyatWantedIndexNama.add("Q.S Al Mu'minuun 23:109");
                    dataAyatWantedIndexKeterangan.add("Kedua ayat ini menerangkan tentang kebiasaan manusia yang selalu bergembira jika mendapatkan nikmat dan berputus asa atau bahkan ingkar apabila memperoleh musibah");


                    dataAyatWantedIndexAyat.add(118);
                    dataAyatWantedIndexSurat.add(23);
                    dataAyatWantedIndexNama.add("Q.S Al Mu'minuun 23:118");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(2).toString());

                    startActivity(intent);


                } else if (position == 31) {

                    dataAyatWantedIndexAyat.add(83);
                    dataAyatWantedIndexSurat.add(4);
                    dataAyatWantedIndexNama.add("Q.S An Nisaa 4:83");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(21);
                    dataAyatWantedIndexSurat.add(24);
                    dataAyatWantedIndexNama.add("Q.S An Nuur 24:21");
                    dataAyatWantedIndexKeterangan.add("");


                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 32) {

                    dataAyatWantedIndexAyat.add(113);
                    dataAyatWantedIndexSurat.add(4);
                    dataAyatWantedIndexNama.add("Q.S An Nisaa 4:113");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(2).toString());

                    startActivity(intent);


                } else if (position == 33) {

                    dataAyatWantedIndexAyat.add(29);
                    dataAyatWantedIndexSurat.add(57);
                    dataAyatWantedIndexNama.add("Q.S Al Hadiid 57:29");
                    dataAyatWantedIndexKeterangan.add("");


                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(2).toString());

                    startActivity(intent);


                } else if (position == 34) {

                    dataAyatWantedIndexAyat.add(164);
                    dataAyatWantedIndexSurat.add(3);
                    dataAyatWantedIndexNama.add("Q.S Ali Imron 3:164");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(2).toString());

                    startActivity(intent);


                } else if (position == 35) {

                    dataAyatWantedIndexAyat.add(72);
                    dataAyatWantedIndexSurat.add(9);
                    dataAyatWantedIndexNama.add("Q.S At Taubah 9:72");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(3).toString());

                    startActivity(intent);


                } else if (position == 36) {

                    dataAyatWantedIndexAyat.add(22);
                    dataAyatWantedIndexSurat.add(13);
                    dataAyatWantedIndexNama.add("Q.S Ar Ro'd 13:22-24");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(23);
                    dataAyatWantedIndexSurat.add(13);
                    dataAyatWantedIndexNama.add("Q.S Ar Ro'd 13:22-24");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(24);
                    dataAyatWantedIndexSurat.add(13);
                    dataAyatWantedIndexNama.add("Q.S Ar Ro'd 13:22-24");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(2).toString());

                    startActivity(intent);


                } else if (position == 37) {

                    dataAyatWantedIndexAyat.add(207);
                    dataAyatWantedIndexSurat.add(2);
                    dataAyatWantedIndexNama.add("Q.S Al Baqorooh 2:207");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(3).toString());

                    startActivity(intent);


                } else if (position == 38) {

                    dataAyatWantedIndexAyat.add(7);
                    dataAyatWantedIndexSurat.add(39);
                    dataAyatWantedIndexNama.add("Q.S Az Zumar 39:7");
                    dataAyatWantedIndexKeterangan.add("Maksudnya manusia itu beriman atau tidak, tidak merugikan Allah sedikit pun");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(3).toString());

                    startActivity(intent);


                } else if (position == 39) {

                    dataAyatWantedIndexAyat.add(37);
                    dataAyatWantedIndexSurat.add(22);
                    dataAyatWantedIndexNama.add("Q.S Al Hajj 22:37");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(3).toString());

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
