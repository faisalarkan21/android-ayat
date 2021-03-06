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



public class MenuInnerBab2 extends Activity implements BackPressedListener {

    private ListView mainListView ;
    private ArrayAdapter<String> listAdapter ;

    List dataAyatWantedIndexAyat = new ArrayList();
    List dataAyatWantedIndexSurat = new ArrayList();
    List dataAyatWantedIndexNama = new ArrayList();
    List dataAyatWantedIndexKeterangan = new ArrayList();
    List titleSubBab = new ArrayList();
    EntityQuran entity = new EntityQuran();

    String[] ListSub1 = new String[] { "Allah SWT Maha Agung dan Maha Suci", "Allah Memiliki Nama-Nama Baik(Asmaul Husna)", "Nilai Asmaul Husna Tidak Terhingga Tingginya", "Allah SWT Pmilik Alam Semesta", "Semua Kerajaan Milik Allah SWT", "Allah SWT Maha Raja", "Allah SWT Pemilik 'Arsy yang Agung",
     "Allah Bersemayam di Atas 'Arsy","Allah Amat Sangat Dekat dengan Hambanya", "Allah Lebih Dekat dari Urat Leher Manusia", "Allah Tidak Membutuhkan Makhluknya", "Perintah Berserah Diri Kepada Allah", "Allah SWT Tuhan Semesta Alam", "Setanpun Mengakui Allah SWT Tuhan Semesta Alam", "Perintah Menyembah Allah SWT", "Kaum Yahudi dan Nasrani juga Diperintah Menyembah Allah", "Almasih Putra Maryam Menyuruh Kaumnya Untuk Menyembah Allah",
     "Menyembahlah Hanya Kepada Allah", "Menyembah Allah Wujud dari Rasa Syukur", "Sembahlah Allah dan Ikhlaskan Agama Bagimu", "Sembahlah Allah dan Murnikan Ketaatan Kepadanya", "Rugilah yang Menyembah Allah Tidak Sepenuh Hati", "Perintah Bersujud Kepada Allah SWT", "Tanda Iman pada Bekas Sujud", "Tetumbuhan dan Pepohonan Bersujud Kepada Allah", "Segala Sesuatu Hanya Sujud Pada Allah SWT", "Bayang Bayangpun Sujud Kepada Allah SWT", "Yang Enggan Sujud Kepada-Nya Kelak Di Hinakan", "Janganlah Menyembah Selain Allah", "Menyembah Selain Allah Adalah Zalim", "Yang Mereka Sembah Selain Allah adalah Setan", "Sesembah Selain Allah Adalah Batil",
     "Sia Sialah yang Menyembah Selain Allah", "Perintah Jauhi Berhala", "Mereka Menganggap Berhala-Berhala itu Anak-Anak Tuhan", "Musryik Sediakan Sajian Untuk Berhala", "Tamsil Orang Yang Berdo'a Kepada Berhala", "Perumpaan Sesembahan Selain Allah SWT", "Teguran Terhadap Penyembah Selain Allah", "Sesembahan Mereka Tidak Berdaya", "KelakMereka Mengikari Menyembahnya", "Kelak Sesembahan Mereka Tidak Bertanggung Jawab", "Orang Musryik dan Sesembahannya Tidak Mampu Sesatkan Orang Lain", "Larangan Memaki Sesembahan Orang Lain", "Dialog Allah dengan Sesembahan Orang Kafir"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_inner_sub);

        titleSubBab.add("Allah  SWT Tuhan Semesta Alam");
        titleSubBab.add("Menyembahlah Hanya Kepada Allah SWT");
        titleSubBab.add("Bersujudlah Hanya Kepada Allah SWT");
        titleSubBab.add("Janganlah Menuhankan Berhala");


        mainListView = (ListView) findViewById(R.id.list);
        listAdapter = new ArrayAdapter<String>(this, R.layout.list_inner_sub, ListSub1);

        mainListView.setAdapter(listAdapter);


        mainListView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position, long arg3) {

                Intent intent = new Intent(MenuInnerBab2.this, MenuAyat.class);
                if (position == 0) {

                    dataAyatWantedIndexAyat.add(23);
                    dataAyatWantedIndexSurat.add(59);
                    dataAyatWantedIndexNama.add("Q.S Al Hasyr 59:23");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 1) {

                    dataAyatWantedIndexAyat.add(8);
                    dataAyatWantedIndexSurat.add(20);
                    dataAyatWantedIndexNama.add("Q.S Thooha 20:8");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(110);
                    dataAyatWantedIndexSurat.add(17);
                    dataAyatWantedIndexNama.add("Q.S Isroo' 17:110");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 2) {

                    dataAyatWantedIndexAyat.add(180);
                    dataAyatWantedIndexSurat.add(7);
                    dataAyatWantedIndexNama.add("Q.S Al A'roof 7:180");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 3) {

                    dataAyatWantedIndexAyat.add(255);
                    dataAyatWantedIndexSurat.add(2);
                    dataAyatWantedIndexNama.add("Q.S Al Baqorooh 2:255");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(6);
                    dataAyatWantedIndexSurat.add(20);
                    dataAyatWantedIndexNama.add("Q.S At Thooha 20:6");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 4) {

                    dataAyatWantedIndexAyat.add(1);
                    dataAyatWantedIndexSurat.add(67);
                    dataAyatWantedIndexNama.add("Q.S Al Mulk 67:1");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 5) {

                    dataAyatWantedIndexAyat.add(114);
                    dataAyatWantedIndexSurat.add(20);
                    dataAyatWantedIndexNama.add("Q.S Thooha 20:114");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(116);
                    dataAyatWantedIndexSurat.add(23);
                    dataAyatWantedIndexNama.add("Q.S Al Mu'Minun 23:116");
                    dataAyatWantedIndexKeterangan.add("Arsy adalah Singgahsana Tuhan yang tidak dapat diketahui Hakekatnya oleh Akal Manusia, Namun Wajib Diyakini Kebenarannya");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 6) {

                    dataAyatWantedIndexAyat.add(129);
                    dataAyatWantedIndexSurat.add(9);
                    dataAyatWantedIndexNama.add("Q.S At Taubah 9:129");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(22);
                    dataAyatWantedIndexSurat.add(21);
                    dataAyatWantedIndexNama.add("Q.S Al AmBiyaa 21:22");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(116);
                    dataAyatWantedIndexSurat.add(23);
                    dataAyatWantedIndexNama.add("Q.S Al Mu'Minun 23:116");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(26);
                    dataAyatWantedIndexSurat.add(27);
                    dataAyatWantedIndexNama.add("Q.S Al Naml 27:26");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(14);
                    dataAyatWantedIndexSurat.add(85);
                    dataAyatWantedIndexNama.add("Q.S Al Buruuj 85:14");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(15);
                    dataAyatWantedIndexSurat.add(85);
                    dataAyatWantedIndexNama.add("Q.S Al AmBiyaa 85:15");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 7) {

                    dataAyatWantedIndexAyat.add(54);
                    dataAyatWantedIndexSurat.add(7);
                    dataAyatWantedIndexNama.add("Q.S Al A'roof 7:54");
                    dataAyatWantedIndexKeterangan.add("Bersemayam Diatas Arsy adalah Satu Sifat Allah yang Wajib kita imani sesuai dengan Kebesaran Allah dan Kesuciannya");

                    dataAyatWantedIndexAyat.add(3);
                    dataAyatWantedIndexSurat.add(10);
                    dataAyatWantedIndexNama.add("Q.S Al Yunus 10:3");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(2);
                    dataAyatWantedIndexSurat.add(13);
                    dataAyatWantedIndexNama.add("Q.S Ar Ro'd 13:2");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(5);
                    dataAyatWantedIndexSurat.add(20);
                    dataAyatWantedIndexNama.add("Q.S Thooha 20:5");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 8) {

                    dataAyatWantedIndexAyat.add(186);
                    dataAyatWantedIndexSurat.add(2);
                    dataAyatWantedIndexNama.add("Q.S Al Baqorooh 2:186");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 9) {

                    dataAyatWantedIndexAyat.add(16);
                    dataAyatWantedIndexSurat.add(50);
                    dataAyatWantedIndexNama.add("Q.S Qoof 50:16");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);


                } else if (position == 10) {

                    dataAyatWantedIndexAyat.add(15);
                    dataAyatWantedIndexSurat.add(35);
                    dataAyatWantedIndexNama.add("Q.S Faathir 35:15");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(57);
                    dataAyatWantedIndexSurat.add(51);
                    dataAyatWantedIndexNama.add("Q.S Adz dzaariyaat 51:57");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(58);
                    dataAyatWantedIndexSurat.add(51);
                    dataAyatWantedIndexNama.add("Q.S Adz dzaariyaat 51:58");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());
                    startActivity(intent);

                } else if (position == 11) {

                    dataAyatWantedIndexAyat.add(22);
                    dataAyatWantedIndexSurat.add(34);
                    dataAyatWantedIndexNama.add("Q.S An'aam 34:22");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(34);
                    dataAyatWantedIndexSurat.add(22);
                    dataAyatWantedIndexNama.add("Q.S Al Hajj 22:34");
                    dataAyatWantedIndexKeterangan.add("");


                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());
                    startActivity(intent);

                } else if (position == 12) {

                    dataAyatWantedIndexAyat.add(2);
                    dataAyatWantedIndexSurat.add(1);
                    dataAyatWantedIndexNama.add("Q.S Al Fatihah 1:2");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(131);
                    dataAyatWantedIndexSurat.add(2);
                    dataAyatWantedIndexNama.add("Q.S Al Baqorooh 2:131");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(36);
                    dataAyatWantedIndexSurat.add(45);
                    dataAyatWantedIndexNama.add("Q.S Al Jaatsyiah 45:36");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(1).toString());
                    startActivity(intent);

                } else if (position == 13) {

                    dataAyatWantedIndexAyat.add(16);
                    dataAyatWantedIndexSurat.add(59);
                    dataAyatWantedIndexNama.add("Q.S Hasyr 59:16");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(1).toString());
                    startActivity(intent);

                } else if (position == 14) {

                    dataAyatWantedIndexAyat.add(14);
                    dataAyatWantedIndexSurat.add(20);
                    dataAyatWantedIndexNama.add("Q.S Thooha 20:14");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(21);
                    dataAyatWantedIndexSurat.add(2);
                    dataAyatWantedIndexNama.add("Q.S Al Baqorooht 2:21");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(59);
                    dataAyatWantedIndexSurat.add(7);
                    dataAyatWantedIndexNama.add("Q.S Al A'roof 7:59");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(65);
                    dataAyatWantedIndexSurat.add(7);
                    dataAyatWantedIndexNama.add("Q.S Al A'roof 7:65");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(73);
                    dataAyatWantedIndexSurat.add(7);
                    dataAyatWantedIndexNama.add("Q.S Al A'roof 7:73");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(85);
                    dataAyatWantedIndexSurat.add(7);
                    dataAyatWantedIndexNama.add("Q.S Al A'roof 7:85");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(123);
                    dataAyatWantedIndexSurat.add(11);
                    dataAyatWantedIndexNama.add("Q.S Hud 11:123");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(99);
                    dataAyatWantedIndexSurat.add(15);
                    dataAyatWantedIndexNama.add("Q.S Al Hijr 15:99");
                    dataAyatWantedIndexKeterangan.add("");


                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(1).toString());
                    startActivity(intent);

                } else if (position == 15) {

                    dataAyatWantedIndexAyat.add(31);
                    dataAyatWantedIndexSurat.add(9);
                    dataAyatWantedIndexNama.add("Q.S At Taubah 9:31");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(1).toString());
                    startActivity(intent);

                } else if (position == 16) {

                    dataAyatWantedIndexAyat.add(51);
                    dataAyatWantedIndexSurat.add(3);
                    dataAyatWantedIndexNama.add("Q.S Ali Imron 3:51");
                    dataAyatWantedIndexKeterangan.add("Ini Menunjukkan bahwa risalah yang dibawa oleh Nabi Isa AS dan Nabi Muhammad SAW adalah Risalah Tauhid");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(1).toString());
                    startActivity(intent);

                } else if (position == 17) {

                    dataAyatWantedIndexAyat.add(5);
                    dataAyatWantedIndexSurat.add(1);
                    dataAyatWantedIndexNama.add("Q.S Al Fatihah 1:5");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(56);
                    dataAyatWantedIndexSurat.add(29);
                    dataAyatWantedIndexNama.add("Q.S Al Ankabuut 29:56");
                    dataAyatWantedIndexKeterangan.add("Maksudnya Allah SWT mengungatkan hati orang-orang beriman yang hidupanya sedang terdesak dan dalam kesempitan agar mereka mencari tempat yang nyaman untuk melaksanakan urusan Dunia dan Agamanya ");


                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(1).toString());
                    startActivity(intent);

                } else if (position == 18) {

                    dataAyatWantedIndexAyat.add(36);
                    dataAyatWantedIndexSurat.add(106);
                    dataAyatWantedIndexNama.add("Q.S Al Quraisy 106:3-4");
                    dataAyatWantedIndexKeterangan.add("");


                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(1).toString());
                    startActivity(intent);

                } else if (position == 19) {

                    dataAyatWantedIndexAyat.add(2);
                    dataAyatWantedIndexSurat.add(39);
                    dataAyatWantedIndexNama.add("Q.S Adz Zumar 39:2");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(11);
                    dataAyatWantedIndexSurat.add(39);
                    dataAyatWantedIndexNama.add("Q.S Adz Zumar 39:11");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(14);
                    dataAyatWantedIndexSurat.add(39);
                    dataAyatWantedIndexNama.add("Q.S Adz Zumar 39:14");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(1).toString());
                    startActivity(intent);

                } else if (position == 20) {

                    dataAyatWantedIndexAyat.add(5);
                    dataAyatWantedIndexSurat.add(8);
                    dataAyatWantedIndexNama.add("Q.S Al Bayyinah 8:5");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(1).toString());
                    startActivity(intent);

                } else if (position == 21) {

                    dataAyatWantedIndexAyat.add(11);
                    dataAyatWantedIndexSurat.add(22);
                    dataAyatWantedIndexNama.add("Q.S Al Hajj 22:11");
                    dataAyatWantedIndexKeterangan.add("Yang Dimaksud 'Menyambah Allah di pinggir-pinggir' adalah ibadah yang tidak di lakukan dengan sungguh sungguh dan tidak berdasarkan keimanan yang benar");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(1).toString());
                    startActivity(intent);

                } else if (position == 22) {

                    dataAyatWantedIndexAyat.add(43);
                    dataAyatWantedIndexSurat.add(3);
                    dataAyatWantedIndexNama.add("Q.S Ali Imran 3:43");
                    dataAyatWantedIndexKeterangan.add("Ayat ini menjelaskan, bahwa solat pada masa itu juga dilakukan dengan rukuk dan sujud");

                    dataAyatWantedIndexAyat.add(77);
                    dataAyatWantedIndexSurat.add(22);
                    dataAyatWantedIndexNama.add("Q.S Al Hajj 22:77");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(19);
                    dataAyatWantedIndexSurat.add(96);
                    dataAyatWantedIndexNama.add("Q.S Al Alaq 96:19");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(2).toString());
                    startActivity(intent);

                } else if (position == 23) {

                    dataAyatWantedIndexAyat.add(29);
                    dataAyatWantedIndexSurat.add(48);
                    dataAyatWantedIndexNama.add("Q.S Al Fath 48:29");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(2).toString());
                    startActivity(intent);

                } else if (position == 24) {

                    dataAyatWantedIndexAyat.add(6);
                    dataAyatWantedIndexSurat.add(55);
                    dataAyatWantedIndexNama.add("Q.S Ar Rachmaan 55:6");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(2).toString());
                    startActivity(intent);

                } else if (position == 25) {

                    dataAyatWantedIndexAyat.add(15);
                    dataAyatWantedIndexSurat.add(13);
                    dataAyatWantedIndexNama.add("Q.S Ar Rod 13:15");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(49);
                    dataAyatWantedIndexSurat.add(16);
                    dataAyatWantedIndexNama.add("Q.S Al Nahl 16:49");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(18);
                    dataAyatWantedIndexSurat.add(22);
                    dataAyatWantedIndexNama.add("Q.S Al Hajj 22:18");
                    dataAyatWantedIndexKeterangan.add("");


                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(2).toString());
                    startActivity(intent);

                } else if (position == 26) {

                    dataAyatWantedIndexAyat.add(48);
                    dataAyatWantedIndexSurat.add(16);
                    dataAyatWantedIndexNama.add("Q.S An Nahl 16:48");
                    dataAyatWantedIndexKeterangan.add("Ayat ini mengisyaratkan betapa seluruh makhluk termasuk bayangannya, patuh kepada Allah jadi manusia yang diberi akal, seharusnya lebih patiuh dan taat kepada Allah");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(2).toString());
                    startActivity(intent);

                } else if (position == 27) {

                    dataAyatWantedIndexAyat.add(43);
                    dataAyatWantedIndexSurat.add(42);
                    dataAyatWantedIndexNama.add("Q.S Al Qolam 68:42-43");
                    dataAyatWantedIndexKeterangan.add("1.Yang dimaksud betis disingkapkan adalah menggambarkan keadaan orang yang sedang ketakutan yang hendak lari karena dahsyatnya huru-hara hari kiamat" +
                            "2. Mereka diminta bersujud hanya untuk menguji keimanan mereka, padahal mereka tidak sanggup lari karna persendian tulang mereka telah lemah dan azab telah meliputi mereka" +
                            "3.Maksudnya Ketika hidup sejahtera di dunia mereka berkesempatan untuk melakukan sujud tapi mereka enggan");


                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(2).toString());
                    startActivity(intent);

                } else if (position == 28) {

                    dataAyatWantedIndexAyat.add(56);
                    dataAyatWantedIndexSurat.add(6);
                    dataAyatWantedIndexNama.add("Q.S Al An'aam 6:56");
                    dataAyatWantedIndexKeterangan.add("");


                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(3).toString());
                    startActivity(intent);

                } else if (position == 29) {

                    dataAyatWantedIndexAyat.add(106);
                    dataAyatWantedIndexSurat.add(10);
                    dataAyatWantedIndexNama.add("Q.S Yunus 10:106");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(3).toString());
                    startActivity(intent);

                } else if (position == 30) {

                    dataAyatWantedIndexAyat.add(117);
                    dataAyatWantedIndexSurat.add(4);
                    dataAyatWantedIndexNama.add("Q.S An Nisaa 4:117");
                    dataAyatWantedIndexKeterangan.add("Patung tempat berhala yang disembah orang orang arab jahiliah biasanya di beri nama dengan nama nama wanita seperti Al lata, Al uzza, Manah");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(3).toString());
                    startActivity(intent);

                } else if (position == 31) {

                    dataAyatWantedIndexAyat.add(30);
                    dataAyatWantedIndexSurat.add(31);
                    dataAyatWantedIndexNama.add("Q.S Luqman 31:30");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(3).toString());
                    startActivity(intent);

                } else if (position == 32) {

                    dataAyatWantedIndexAyat.add(40);
                    dataAyatWantedIndexSurat.add(12);
                    dataAyatWantedIndexNama.add("Q.S Yusuf 12:40");
                    dataAyatWantedIndexKeterangan.add("1.Nenek Moyang merek meberi nama kepada berhala berhala yang mereka sembah sebagai Tuhan" +
                            "2. Allah tidak menyuruh mereka menyembah berhala-berhala yang beri mereka nama itu" +
                            "3. Hukum yang dimaksud adalah ketetapan Allan tentang ibadah, sebab manusia tidak berhak membuat sesembahan menurut keinginannya sendiri");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(3).toString());
                    startActivity(intent);

                } else if (position == 33) {

                    dataAyatWantedIndexAyat.add(30);
                    dataAyatWantedIndexSurat.add(22);
                    dataAyatWantedIndexNama.add("Q.S Al Hajj 22:30");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(3).toString());
                    startActivity(intent);

                } else if (position == 34) {

                    dataAyatWantedIndexAyat.add(19);
                    dataAyatWantedIndexSurat.add(53);
                    dataAyatWantedIndexNama.add("Q.S An Najm 53:19");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(20);
                    dataAyatWantedIndexSurat.add(52);
                    dataAyatWantedIndexNama.add("Q.S An Najm 52:20");
                    dataAyatWantedIndexKeterangan.add("Al Lata Al Uzza dan Manah adalah nama nama berhala yang di sembah oleh orang arab zahilliyah dan mereka anggap anak perempuan Tuhan");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());
                    startActivity(intent);

                } else if (position == 35) {

                    dataAyatWantedIndexAyat.add(133);
                    dataAyatWantedIndexSurat.add(6);
                    dataAyatWantedIndexNama.add("Q.S Al An'aam 6:136");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(3).toString());
                    startActivity(intent);

                } else if (position == 36) {

                    dataAyatWantedIndexAyat.add(14);
                    dataAyatWantedIndexSurat.add(13);
                    dataAyatWantedIndexNama.add("Q.S Ar Rod 13:14");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(3).toString());
                    startActivity(intent);

                } else if (position == 37) {

                    dataAyatWantedIndexAyat.add(73);
                    dataAyatWantedIndexSurat.add(22);
                    dataAyatWantedIndexNama.add("Q.S Al Hajj 22:73");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(3).toString());
                    startActivity(intent);

                } else if (position == 38) {

                    dataAyatWantedIndexAyat.add(117);
                    dataAyatWantedIndexSurat.add(23);
                    dataAyatWantedIndexNama.add("Q.S Al Mu'Minun 23:117");
                    dataAyatWantedIndexKeterangan.add("Kelak pada hari Kiamat perbuatan orang-orang kafir mempersekutukan Allah dengan Tuhan yang lain akan di hisab dan di azab");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());
                    startActivity(intent);

                } else if (position == 39) {

                    dataAyatWantedIndexAyat.add(148);
                    dataAyatWantedIndexSurat.add(7);
                    dataAyatWantedIndexNama.add("Q.S Al A'roof 7:148");
                    dataAyatWantedIndexKeterangan.add("Pada waktu Musa AS. Pergi Ke Thursina untuk menerima wahyu dari Allah, sebagian kaumnya menempa anak sapi dari perhiasan emas dan perak, lalu menjadikannya berhala sesembahan");

                    dataAyatWantedIndexAyat.add(88);
                    dataAyatWantedIndexSurat.add(20);
                    dataAyatWantedIndexNama.add("Q.S Thooha 20:88");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(89);
                    dataAyatWantedIndexSurat.add(20);
                    dataAyatWantedIndexNama.add("Q.S Thooha 20:89");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(14);
                    dataAyatWantedIndexSurat.add(36);
                    dataAyatWantedIndexNama.add("Q.S Faathir 36:14");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(41);
                    dataAyatWantedIndexSurat.add(19);
                    dataAyatWantedIndexNama.add("Q.S Maryam 19:41");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(42);
                    dataAyatWantedIndexSurat.add(19);
                    dataAyatWantedIndexNama.add("Q.S Al A'roof 19:42");
                    dataAyatWantedIndexKeterangan.add("Ayah Ibrahim bernama Azar adalah seorang pembuat patung dan penyembah berhala");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());
                    startActivity(intent);

                } else if (position == 40) {

                    dataAyatWantedIndexAyat.add(82);
                    dataAyatWantedIndexSurat.add(19);
                    dataAyatWantedIndexNama.add("Q.S Maryam 19:82");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(3).toString());
                    startActivity(intent);

                } else if (position == 41) {

                    dataAyatWantedIndexAyat.add(62);
                    dataAyatWantedIndexSurat.add(28);
                    dataAyatWantedIndexNama.add("Q.S Al Qoshosh 28:62");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(63);
                    dataAyatWantedIndexSurat.add(28);
                    dataAyatWantedIndexNama.add("Q.S Al Qoshosh 28:63");
                    dataAyatWantedIndexKeterangan.add("Pada hari kiamat kelak para pemimpin oorang orang sesat mengajukan alasan di hadapan Allah guna melepaskan tanggung jawabnya. Para pemimpin itu mengatakan, bahwa kesesatan orang orang yang mengikutinya itu bukanlah karena kesalahan mereka, tetapi kesalahan para pengikut mereka itu sendiri karena mengikuti hawa nafsunya");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(3).toString());
                    startActivity(intent);

                } else if (position == 42) {

                    dataAyatWantedIndexAyat.add(161);
                    dataAyatWantedIndexSurat.add(37);
                    dataAyatWantedIndexNama.add("Q.S Ash Shoffat 37:161-163");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(162);
                    dataAyatWantedIndexSurat.add(37);
                    dataAyatWantedIndexNama.add("Q.S Ash Shoffat 37:162");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(163);
                    dataAyatWantedIndexSurat.add(37);
                    dataAyatWantedIndexNama.add("Q.S Ash Shoffat 37:163");
                    dataAyatWantedIndexKeterangan.add("");


                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(3).toString());
                    startActivity(intent);

                } else if (position == 43) {

                    dataAyatWantedIndexAyat.add(108);
                    dataAyatWantedIndexSurat.add(6);
                    dataAyatWantedIndexNama.add("Q.S Al An'aaam 6:108");
                    dataAyatWantedIndexKeterangan.add("Ayat ini mengingatkan kaum muslim agar tidak mencela kepercayaan dan sesembahan orang lain guna menghindari pembalasan celaan dari mereka");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(3).toString());
                    startActivity(intent);

                } else if (position == 44) {

                    dataAyatWantedIndexAyat.add(17);
                    dataAyatWantedIndexSurat.add(25);
                    dataAyatWantedIndexNama.add("Q.S Al Furqoon 25:17");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(118);
                    dataAyatWantedIndexSurat.add(25);
                    dataAyatWantedIndexNama.add("Q.S Al Furqoon 25:18");
                    dataAyatWantedIndexKeterangan.add("1. Pada hari hisab kelak, Allah mengajukan pertanyaan tersebut sebagai suatu kesaksian tentang siapa yang bersalah sewaktu hidup di dunia dulu" +
                            "2.Jawaban sesembahan manusia itu merupakan kesaksian yang jelas bahwa mereka tidak menjadikan diri mereka sebagai pelindung manusia yang menyembahnya. jadi orang yang menyembah mereka itu salah5");

                    dataAyatWantedIndexAyat.add(163);
                    dataAyatWantedIndexSurat.add(37);
                    dataAyatWantedIndexNama.add("Q.S Ash Shoffat 37:163");
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