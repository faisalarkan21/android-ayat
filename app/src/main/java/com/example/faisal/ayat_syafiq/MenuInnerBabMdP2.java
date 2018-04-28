package com.example.faisal.ayat_syafiq;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;



public class MenuInnerBabMdP2 extends AppCompatActivity implements BackPressedListener, NavigationView.OnNavigationItemSelectedListener  {

    private ListView mainListView ;
    private ArrayAdapter<String> listAdapter ;

    List dataAyatWantedIndexAyat = new ArrayList();
    List dataAyatWantedIndexSurat = new ArrayList();
    List dataAyatWantedIndexNama = new ArrayList();
    List dataAyatWantedIndexKeterangan = new ArrayList();
    List titleSubBab = new ArrayList();
    EntityQuran entity = new EntityQuran();

    String[] ListSub1 = new String[] {"Hidup Manusia Penuh Perjuangan", "Perintah Bekerja", "Keadaan Manusia Tergantung Usahanya", "Usaha Manusia Berbeda-beda", "Tak Seorangpun Tahu Apa Usahanya Esok", "Penghidupan Manusia Berbeda-beda", "Derajat Manusia Juga Berbeda-beda", "Setiap Manusia Berbuat Sesuai Keadaanya", "Nasib Manusia Selalu Berputar", "Larangan Mengundi Nasib", "Anjuran Memberi Kelonggaran", "Perintah Mencatat Utang-Piutang", "Boleh Utang Dengan Jaminan", "Islam Membolehkan Jual-Beli", "Larangan Jual Belikan Ayat Allah", "Balasan Bagi Pemberi Pinjaman", "Perintah Berbuat Baik", "Perbuatan Baik untuk Manusia itu Sendiri", "Yang Berbuat Baik Memperoleh Rahmat-Nya", "Yang Berbuat Baik Memperoleh Kebaikan", "Balasan bagi Setiap Kebaikan", "Kebaikan dan Keburukan sebagai Ujian", "Menolak Keburukan dengan Kebaikan", "Sesuatu yang Buruk yang Menarik", "Kejahatan Terjadi Karena Nafsu", "Kejahatan Terjadi Juga Karena Setan", "Kejahatan Dapat Ditolak dengan Kebaikan", "Orang Jahat Kelak Ketakutan", "Setiap Penjahat pasti Diazab",
                                      "Kebenaran Berasal dari Allah SWT", "Perintah Bersama Orang-Orang yang Benar", "Perintah Tegakkan Kebenaran", "Kebeneran Dikokohkan Allah SWT", "Jika Kebenaran Datang Lenyaplah Kebatilan", "Larangan Campur Adukkan yang Benar dan yang Salah", "Larangan Melemparkan Kesalahan ke Orang Lain", "Taat Kepada Allah SWT dan Rosulnya adalah Suatu Kemenangan", "Kemenangan Bangsa Romawi Diterangkan Dalam Al Qur'an", "Kemenangan Kaum Muslim atas orang Kafir adalah Sunnahtullah", "Kemenangan yang diberikan kepada Kaum Muslim", "Perintah Bertasbih jika Memperoleh Kemenangan", "Masuk Surga adalah Suatu Kemenenagan", "Setelah Kesulitan ada Kemudahan", "Dimudahkan Ke Jalan Kebahagiaan", "Kesusahan dan Kesenangan sebagai Ujian", "Kesenangan Hidup sebagai Cobaan", "Kesenangan Orang Kafir Bersifat Sementara", "Larangan Bersedih", "Larangan Bersedih atas Keingkaran Orang Kafir","Allah-lah yang Jadikan Tawa dan Tangis", "Ada yang Menertawakan Kiamat", "Kelak Orang Beriman Menertawakan Orang Kafir", "Beruntunglah Orang yang Bertaqwa", "Beruntunglah Orang yang Mendirikan Solat", "Beruntunglah Orang yang Khusyu' Sholatnya", "Beruntunglah yang Menyeru Pada Kebajikan", "Beruntunglah Orang yang Mensucikan Jiwanya", "Beruntunglah Orang yang Berjihad", "Beruntunglah yang Banyak Kebaikannya",
                                      "Penghuni Surga Adalah Orang yang Beruntung", "Larangan Rugikan Orang Lain", "Orang yang Tidak Akan Rugi", "Orang-orang yang Kelak Merugi", "Ada yang Menganggap Infak Merugikan", "Yang Merugi Dunia & Akhirat", "Allah Yang Memberi Kekayaan", "Orang Kaya Diuji dengan Orang Miskin", "Kaya Miskin sebagai Ujian", "Larangan Membunuh Anak karena Miskin", "Perintah Berikan Hak Orang Miskin", "Abaikan Orang Miskin Ciri Pendusta Agama", "Penuhilah Hak Orang Miskin", "Larangan Menghardik Peminta-minta", "Berilah Orang Fakir yang Memelihara Diri", "Perintah Tinggalkan Perbuatan Dosa", "Tiap Orang Memikul Dosanya Sendiri", "Dosa-dosa Orang yang Sesatkan Manusia", "Imbalan Bagi yang Tinggalkan Dosa Besar", "Dosa Rugikan Pelakunya", "Dosa Syirik Tak Terampuni", "Dosa Akibatkan Musibah", "Pahala Hanya Untuk yang Berbuat Baik", "Pahala Orang Beriman Tak Disia-siakan", "Tiap Orang Memperoleh Pahala Kebaikannya", "Pahala Hanya Untuk Orang Sabar", "Yang Takut kepada Allah Memperoleh Pahala Besar", "Pahala/Dosa Tak Dapat Dipindahkan ke Orang Lain", "Pahala/Siksa Sesuai Usaha Manusia" };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_inner_sub);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        titleSubBab.add("Dinamika Kehidupan Manusia");
        titleSubBab.add("Tahapan Kehidupan Manusia");
        titleSubBab.add("Kewajiban dan Hak Manusia");
        titleSubBab.add("Sifat Manusia");

        mainListView = (ListView) findViewById( R.id.list );
        listAdapter = new ArrayAdapter<String>(this, R.layout.list_inner_sub, ListSub1);

        mainListView.setAdapter(listAdapter);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        mainListView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position, long arg3)
            {

                Intent intent = new Intent(MenuInnerBabMdP2.this, MenuAyat.class);
                if (position == 0) {

                    dataAyatWantedIndexAyat.add(4);
                    dataAyatWantedIndexSurat.add(90);
                    dataAyatWantedIndexNama.add("Q.S Al Balad 90:4");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 1){

                    dataAyatWantedIndexAyat.add(105);
                    dataAyatWantedIndexSurat.add(9);
                    dataAyatWantedIndexNama.add("Q.S At Taubah 9:105");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 2){

                    dataAyatWantedIndexAyat.add(11);
                    dataAyatWantedIndexSurat.add(13);
                    dataAyatWantedIndexNama.add("Q.S Ar Ro'd 13:11");
                    dataAyatWantedIndexKeterangan.add("Tuhan tidak akan mengubah keadaan mereka, selama mereka tidak mengubah sebab sebab kemunduran mereka");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 3){

                    dataAyatWantedIndexAyat.add(4);
                    dataAyatWantedIndexSurat.add(92);
                    dataAyatWantedIndexNama.add("Q.S Al Lail 92:4");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 4){

                    dataAyatWantedIndexAyat.add(34);
                    dataAyatWantedIndexSurat.add(31);
                    dataAyatWantedIndexNama.add("Q.S Luqman 31:34");
                    dataAyatWantedIndexKeterangan.add("Maksudnya manusia tidak dapat memastikan apa yang akan diusahakannya besok atau apa yang akan diperolehnya,tetapi manusia wajib berusaha");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 5){

                    dataAyatWantedIndexAyat.add(32);
                    dataAyatWantedIndexSurat.add(43);
                    dataAyatWantedIndexNama.add("Q.S Az Zukhruf 43:32");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 6){

                    dataAyatWantedIndexAyat.add(165);
                    dataAyatWantedIndexSurat.add(6);
                    dataAyatWantedIndexNama.add("Q.S Al An'aam 6:165");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 7){

                    dataAyatWantedIndexAyat.add(84);
                    dataAyatWantedIndexSurat.add(17);
                    dataAyatWantedIndexNama.add("Q.S Al Isroo' 17:84");
                    dataAyatWantedIndexKeterangan.add("Yang termasuk dalam pengertian 'keadaan' di sini adalah tabiat dan pengaruh alam sekitarnya");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 8){

                    dataAyatWantedIndexAyat.add(140);
                    dataAyatWantedIndexSurat.add(3);
                    dataAyatWantedIndexNama.add("Q.S Ali Imron 3:140");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 9){

                    dataAyatWantedIndexAyat.add(90);
                    dataAyatWantedIndexSurat.add(5);
                    dataAyatWantedIndexNama.add("Q.S Al Maidah 5:90");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 10){

                    dataAyatWantedIndexAyat.add(280);
                    dataAyatWantedIndexSurat.add(2);
                    dataAyatWantedIndexNama.add("Q.S Al Baqorooh 2:280");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 11){

                    dataAyatWantedIndexAyat.add(282);
                    dataAyatWantedIndexSurat.add(2);
                    dataAyatWantedIndexNama.add("Q.S Al Baqoroh 2:282");
                    dataAyatWantedIndexKeterangan.add("Yang dimaksud bermu'amalah adalah berjual-beli, berhutang-piutang, sewa menyewa, dan lain sebagainya");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 12){

                    dataAyatWantedIndexAyat.add(283);
                    dataAyatWantedIndexSurat.add(2);
                    dataAyatWantedIndexNama.add("Q.S Al Baqoroh 2:283");
                    dataAyatWantedIndexKeterangan.add("Barang Tanggungan itu didadakan bila satu sama lain tidak saling percaya");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 13){

                    dataAyatWantedIndexAyat.add(275);
                    dataAyatWantedIndexSurat.add(2);
                    dataAyatWantedIndexNama.add("Q.S Al Baqorooh 2:275");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 14){

                    dataAyatWantedIndexAyat.add(44);
                    dataAyatWantedIndexSurat.add(5);
                    dataAyatWantedIndexNama.add("Q.S Al Maaidah 5:44");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 15){

                    dataAyatWantedIndexAyat.add(17);
                    dataAyatWantedIndexSurat.add(64);
                    dataAyatWantedIndexNama.add("Q.S At Taghoobun 64:17");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 16){

                    dataAyatWantedIndexAyat.add(195);
                    dataAyatWantedIndexSurat.add(2);
                    dataAyatWantedIndexNama.add("Q.S Al Baqorooh 2:195");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(77);
                    dataAyatWantedIndexSurat.add(28);
                    dataAyatWantedIndexNama.add("Q.S Al Qoshosh 28:77");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 17){

                    dataAyatWantedIndexAyat.add(7);
                    dataAyatWantedIndexSurat.add(17);
                    dataAyatWantedIndexNama.add("Q.S Al Isroo' 17:7");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 18){

                    dataAyatWantedIndexAyat.add(56);
                    dataAyatWantedIndexSurat.add(7);
                    dataAyatWantedIndexNama.add("Q.S Al A'roof 7:56");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 19){

                    dataAyatWantedIndexAyat.add(10);
                    dataAyatWantedIndexSurat.add(39);
                    dataAyatWantedIndexNama.add("Q.S Az Zumar 39:10");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 20){

                    dataAyatWantedIndexAyat.add(23);
                    dataAyatWantedIndexSurat.add(42);
                    dataAyatWantedIndexNama.add("Q.S Asy Syuuroo' 42:23");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(20);
                    dataAyatWantedIndexSurat.add(74);
                    dataAyatWantedIndexNama.add("Q.S Al Muzzamil 74:20");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 21){

                    dataAyatWantedIndexAyat.add(35);
                    dataAyatWantedIndexSurat.add(21);
                    dataAyatWantedIndexNama.add("Q.S Al Ambiyaa' 21:35");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 22){

                    dataAyatWantedIndexAyat.add(96);
                    dataAyatWantedIndexSurat.add(23);
                    dataAyatWantedIndexNama.add("Q.S Al Mu'minuun 23:96");
                    dataAyatWantedIndexKeterangan.add("Maksudnya perkataan dan perbuatan kaum musyrikin yang tidak baik hendaklah dihadapi oleh nabi dengan yang baik, umpamanya dengan memaafkannya, asal tidak membawa kepada kelemahan dan kemunduran dakwah");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 23){

                    dataAyatWantedIndexAyat.add(100);
                    dataAyatWantedIndexSurat.add(5);
                    dataAyatWantedIndexNama.add("Q.S Al Maaidah 5:100");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 24){

                    dataAyatWantedIndexAyat.add(53);
                    dataAyatWantedIndexSurat.add(12);
                    dataAyatWantedIndexNama.add("Q.S Yusuf 12:53");
                    dataAyatWantedIndexKeterangan.add("Yusuf as. menahan diri dari rayuan itu berkat perlindungan dan petunjuk Allah SWT, sebab nafsu yang tidak dikendalikan akan mendorongnya melakukan kejahatan");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 25){

                    dataAyatWantedIndexAyat.add(169);
                    dataAyatWantedIndexSurat.add(2);
                    dataAyatWantedIndexNama.add("Q.S Al Baqorooh 2:169");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 26){

                    dataAyatWantedIndexAyat.add(34);
                    dataAyatWantedIndexSurat.add(41);
                    dataAyatWantedIndexNama.add("Q.S Fushshilat 41:34");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 27){

                    dataAyatWantedIndexAyat.add(22);
                    dataAyatWantedIndexSurat.add(42);
                    dataAyatWantedIndexNama.add("Q.S Asy Syuroo' 42:22");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 28){

                    dataAyatWantedIndexAyat.add(5);
                    dataAyatWantedIndexSurat.add(29);
                    dataAyatWantedIndexNama.add("Q.S Al 'Ankabuut 29:5");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(21);
                    dataAyatWantedIndexSurat.add(45);
                    dataAyatWantedIndexNama.add("Q.S Al Jaatsiyah 45:21");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 29){

                    dataAyatWantedIndexAyat.add(147);
                    dataAyatWantedIndexSurat.add(2);
                    dataAyatWantedIndexNama.add("Q.S Al Baqorooh 2:147");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(94);
                    dataAyatWantedIndexSurat.add(10);
                    dataAyatWantedIndexNama.add("Q.S Al Yunus 10:94");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 30){

                    dataAyatWantedIndexAyat.add(119);
                    dataAyatWantedIndexSurat.add(9);
                    dataAyatWantedIndexNama.add("Q.S At Taubah 9:119");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 31){

                    dataAyatWantedIndexAyat.add(8);
                    dataAyatWantedIndexSurat.add(5);
                    dataAyatWantedIndexNama.add("Q.S Al Maaidah 5:8");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 32){

                    dataAyatWantedIndexAyat.add(82);
                    dataAyatWantedIndexSurat.add(10);
                    dataAyatWantedIndexNama.add("Q.S Yunus 10:82");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 33){

                    dataAyatWantedIndexAyat.add(81);
                    dataAyatWantedIndexSurat.add(17);
                    dataAyatWantedIndexNama.add("Q.S Al Isroo' 17:81");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(18);
                    dataAyatWantedIndexSurat.add(21);
                    dataAyatWantedIndexNama.add("Q.S Al Ambiyaa' 21:18");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 34){

                    dataAyatWantedIndexAyat.add(42);
                    dataAyatWantedIndexSurat.add(2);
                    dataAyatWantedIndexNama.add("Q.S Al Baqorooh 2:42");
                    dataAyatWantedIndexKeterangan.add("Yang mereka(orang-orang yahudi) sembunyikan antara lain: Tuhan akan mengutus seorang Nabi dari keturunan Ismail yang akan membimbing umat di belakang hari, ialah Nabi Muhammad Rosulullah Saw");


                    dataAyatWantedIndexAyat.add(71);
                    dataAyatWantedIndexSurat.add(3);
                    dataAyatWantedIndexNama.add("Q.S Ali Imron 3:71");
                    dataAyatWantedIndexKeterangan.add("1.Maksudnya menutupi firman-firman Allah yang ada dalam Taurat dan Injil dengan perkataan-perkataan yang mereka (ahli kitab) buat sendiri" +
                            "2.Maksudnya kebenaran tentang kenabian Muhammad Saw. yang tersebut dalam Taurat dan Injil");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 35){

                    dataAyatWantedIndexAyat.add(112);
                    dataAyatWantedIndexSurat.add(4);
                    dataAyatWantedIndexNama.add("Q.S An Nisaa' 4:112");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 36){

                    dataAyatWantedIndexAyat.add(52);
                    dataAyatWantedIndexSurat.add(24);
                    dataAyatWantedIndexNama.add("Q.S An Nuur 24:52");
                    dataAyatWantedIndexKeterangan.add("Yang dimaksud 'Takut kepada Allah' adalah takut yang disebabkan oleh dosa-dosa yang telah dikerjakannya. Yang dimaksud dengan takwa adalah memelihara dri dari segala dosa yang mungkin terjadi");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 37){

                    dataAyatWantedIndexAyat.add(2);
                    dataAyatWantedIndexSurat.add(30);
                    dataAyatWantedIndexNama.add("Q.S Ar Ruum 30:2");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(3);
                    dataAyatWantedIndexSurat.add(30);
                    dataAyatWantedIndexNama.add("Q.S Ar Ruum 30:3");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(4);
                    dataAyatWantedIndexSurat.add(30);
                    dataAyatWantedIndexNama.add("Q.S Ar Ruum 30:4");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(5);
                    dataAyatWantedIndexSurat.add(30);
                    dataAyatWantedIndexNama.add("Q.S Ar Ruum 30:5");
                    dataAyatWantedIndexKeterangan.add("1.Maksudnya adalah Romawi Timur yang berpusat di Konstantinopel" +
                            "2.Maksudnya terdekat ke negeri Arab yaitu Syiria dan Palestina sewaktu menjadi jajahan Kerajaan Romawi Timur" +
                            "3.Bangsa Romawi menganut agama Nasrani yang mempunyai Kitab Suci sedangkan Bangsa perisai penganut agama Majusi, menyembah api dan berhala. Sewaktu tersiar kabar kekalahan bangsa Romawi oleh Bangsa Persia. Sebaliknya kaum muslim berduka cita karenanya. Kemudian turunlah ayat ini dan ayat berikutnya bahwa bangsa Romawi sesudah kalah itu akan mendapat kemenangandalam beberapa tahun mendatang. Hal itu benar benar terjadi.Beberapa tahun kemudian bangsa Romawi dapat mengalahkan bangsa Persia. Dengan kejadian yang demikian, nyatalah kebenaran Nabi Muhammad Saw. sebagai Nabi dan Rosul serta kebenaran Al Qur'an sebagai firman Allah SWT ");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 38){

                    dataAyatWantedIndexAyat.add(22);
                    dataAyatWantedIndexSurat.add(48);
                    dataAyatWantedIndexNama.add("Q.S Al Fath 48:22");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(23);
                    dataAyatWantedIndexSurat.add(48);
                    dataAyatWantedIndexNama.add("Q.S Al Fath 48:23");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(24);
                    dataAyatWantedIndexSurat.add(48);
                    dataAyatWantedIndexNama.add("Q.S Al Fath 48:24");
                    dataAyatWantedIndexKeterangan.add("Sunnahtullah, yaitu hukum Allah yang teah ditetapkannya");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 39){

                    dataAyatWantedIndexAyat.add(1);
                    dataAyatWantedIndexSurat.add(48);
                    dataAyatWantedIndexNama.add("Q.S Al Fath 48:1");
                    dataAyatWantedIndexKeterangan.add("Sebagian ahli tafsir berpendapat bahwa kemenangan yang dimaksud dalam ayat tersebut adalah kemenangan penaklukan Mekkah. Ada pula yang berpendapat penaklukkan negeri Rum. Tetapi sebagian besar ahli tafsir menyatakan, bahwa yang dimaksud di sini adalah Perdamaian Hudaibiyah");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 40){

                    dataAyatWantedIndexAyat.add(1);
                    dataAyatWantedIndexSurat.add(110);
                    dataAyatWantedIndexNama.add("Q.S An Nasr 110:1");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(2);
                    dataAyatWantedIndexSurat.add(110);
                    dataAyatWantedIndexNama.add("Q.S An Nasr 110:2");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(3);
                    dataAyatWantedIndexSurat.add(110);
                    dataAyatWantedIndexNama.add("Q.S An Nasr 110:3");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 41){

                    dataAyatWantedIndexAyat.add(109);
                    dataAyatWantedIndexSurat.add(23);
                    dataAyatWantedIndexNama.add("Q.S Al Mu'minuun 23:109");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(110);
                    dataAyatWantedIndexSurat.add(23);
                    dataAyatWantedIndexNama.add("Q.S Al Mu'minuun 23:110");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(111);
                    dataAyatWantedIndexSurat.add(23);
                    dataAyatWantedIndexNama.add("Q.S Al Mu'minuun 23:111");
                    dataAyatWantedIndexKeterangan.add("Maksud Ketiga ayat ini adalah orang-orang kafir disuruh tetap tinggal di neraka dan tidak boleh berbicara dengan Allah, sebab mereka selalu mengejek orang-orang beriman yang berdo'a mohon ampun dan rahmat Allah SWT");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 42){

                    dataAyatWantedIndexAyat.add(7);
                    dataAyatWantedIndexSurat.add(65);
                    dataAyatWantedIndexNama.add("Q.S At Thoolaq 65:7");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 43){

                    dataAyatWantedIndexAyat.add(8);
                    dataAyatWantedIndexSurat.add(87);
                    dataAyatWantedIndexNama.add("Q.S Al A'laa 87:8");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(9);
                    dataAyatWantedIndexSurat.add(87);
                    dataAyatWantedIndexNama.add("Q.S Al A'laa 87:9");
                    dataAyatWantedIndexKeterangan.add("Maksudnya adalah jalan yang membawa kepada kebahagiaan dunia akhirat");

                    dataAyatWantedIndexAyat.add(5);
                    dataAyatWantedIndexSurat.add(92);
                    dataAyatWantedIndexNama.add("Q.S Al Lail 92:5");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(6);
                    dataAyatWantedIndexSurat.add(92);
                    dataAyatWantedIndexNama.add("Q.S Al Lail 92:6");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(7);
                    dataAyatWantedIndexSurat.add(92);
                    dataAyatWantedIndexNama.add("Q.S Al Lail 92:7");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 44){

                    dataAyatWantedIndexAyat.add(35);
                    dataAyatWantedIndexSurat.add(21);
                    dataAyatWantedIndexNama.add("Q.S Al Ambiyaa' 21:35");
                    dataAyatWantedIndexKeterangan.add("Jelaslah bahwa kesusahan dan kesenangan yang kita alami hanyalah sebagai cobaan dari Allah SWT untuk menguji sejauh mana iman kita");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 45){

                    dataAyatWantedIndexAyat.add(131);
                    dataAyatWantedIndexSurat.add(20);
                    dataAyatWantedIndexNama.add("Q.S Thooha 20:131");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 46){

                    dataAyatWantedIndexAyat.add(126);
                    dataAyatWantedIndexSurat.add(2);
                    dataAyatWantedIndexNama.add("Q.S Al Baqorooh 2:126");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(3);
                    dataAyatWantedIndexSurat.add(15);
                    dataAyatWantedIndexNama.add("Q.S Al Hijr 15:3");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 47){

                    dataAyatWantedIndexAyat.add(139);
                    dataAyatWantedIndexSurat.add(3);
                    dataAyatWantedIndexNama.add("Q.S Ali Imron 3:139");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 48){

                    dataAyatWantedIndexAyat.add(126);
                    dataAyatWantedIndexSurat.add(2);
                    dataAyatWantedIndexNama.add("Q.S Ali Imron 3:176");
                    dataAyatWantedIndexKeterangan.add("Maksudnya ialah orang-orang kafir Mekkah atau orang-orang munafik yang selalu merongrong agama islam");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 49){

                    dataAyatWantedIndexAyat.add(43);
                    dataAyatWantedIndexSurat.add(53);
                    dataAyatWantedIndexNama.add("Q.S An Najm 53:43");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 50){

                    dataAyatWantedIndexAyat.add(57);
                    dataAyatWantedIndexSurat.add(53);
                    dataAyatWantedIndexNama.add("Q.S An Najm 53:57");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(57);
                    dataAyatWantedIndexSurat.add(53);
                    dataAyatWantedIndexNama.add("Q.S An Najm 53:58");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(59);
                    dataAyatWantedIndexSurat.add(53);
                    dataAyatWantedIndexNama.add("Q.S An Najm 53:59");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(60);
                    dataAyatWantedIndexSurat.add(53);
                    dataAyatWantedIndexNama.add("Q.S An Najm 53:60");
                    dataAyatWantedIndexKeterangan.add("");


                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 51){

                    dataAyatWantedIndexAyat.add(34);
                    dataAyatWantedIndexSurat.add(83);
                    dataAyatWantedIndexNama.add("Q.S Muthoffifin 83:34");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(35);
                    dataAyatWantedIndexSurat.add(83);
                    dataAyatWantedIndexNama.add("Q.S Muthoffifin 83:35");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(36);
                    dataAyatWantedIndexSurat.add(83);
                    dataAyatWantedIndexNama.add("Q.S Muthoffifin 83:36");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 52){

                    dataAyatWantedIndexAyat.add(51);
                    dataAyatWantedIndexSurat.add(24);
                    dataAyatWantedIndexNama.add("Q.S An Nuur 24:51");
                    dataAyatWantedIndexKeterangan.add("Maksudny antara kaum muslimin dengan kaum muslimin, dan antara kaum muslimin dengan nos-muslim ");


                    dataAyatWantedIndexAyat.add(35);
                    dataAyatWantedIndexSurat.add(83);
                    dataAyatWantedIndexNama.add("Q.S Muthoffifin 83:35");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(36);
                    dataAyatWantedIndexSurat.add(83);
                    dataAyatWantedIndexNama.add("Q.S Muthoffifin 83:36");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 53){

                    dataAyatWantedIndexAyat.add(14);
                    dataAyatWantedIndexSurat.add(87);
                    dataAyatWantedIndexNama.add("Q.S Al A'laa 87:14");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(14);
                    dataAyatWantedIndexSurat.add(87);
                    dataAyatWantedIndexNama.add("Q.S Al A'laa 87:15");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 54){

                    dataAyatWantedIndexAyat.add(1);
                    dataAyatWantedIndexSurat.add(23);
                    dataAyatWantedIndexNama.add("Q.S Al Mu'minuun 23:1");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(2);
                    dataAyatWantedIndexSurat.add(23);
                    dataAyatWantedIndexNama.add("Q.S Al Mu'minuun 23:2");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 55){

                    dataAyatWantedIndexAyat.add(104);
                    dataAyatWantedIndexSurat.add(3);
                    dataAyatWantedIndexNama.add("Q.S Ali Imron 3:104");
                    dataAyatWantedIndexKeterangan.add("Ma'ruf adalah perbuatan yang mendekatkan kita kepada Allah SWT, sedangkan mungkar adalah segala perbuatan yang mendatangkan dosa");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 56){

                    dataAyatWantedIndexAyat.add(8);
                    dataAyatWantedIndexSurat.add(91);
                    dataAyatWantedIndexNama.add("Q.S Asy Syams 91:8");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(9);
                    dataAyatWantedIndexSurat.add(91);
                    dataAyatWantedIndexNama.add("Q.S Asy Syams 91:9");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 57){

                    dataAyatWantedIndexAyat.add(88);
                    dataAyatWantedIndexSurat.add(9);
                    dataAyatWantedIndexNama.add("Q.S At Taubah 9:88");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 58){

                    dataAyatWantedIndexAyat.add(8);
                    dataAyatWantedIndexSurat.add(7);
                    dataAyatWantedIndexNama.add("Q.S Al A'roof 7:8");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(102);
                    dataAyatWantedIndexSurat.add(23);
                    dataAyatWantedIndexNama.add("Q.S Al Mu'minuun 23:102");
                    dataAyatWantedIndexKeterangan.add("Maksudnya orang muslim yang banyak beramal baik");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 59){

                    dataAyatWantedIndexAyat.add(20);
                    dataAyatWantedIndexSurat.add(59);
                    dataAyatWantedIndexNama.add("Q.S Al Hasyr 59:20");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(185);
                    dataAyatWantedIndexSurat.add(3);
                    dataAyatWantedIndexNama.add("Q.S Ali Imron 3:185");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 60){

                    dataAyatWantedIndexAyat.add(183);
                    dataAyatWantedIndexSurat.add(26);
                    dataAyatWantedIndexNama.add("Q.S Asy Stu'aroo 26:183");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 61){


                    dataAyatWantedIndexAyat.add(1);
                    dataAyatWantedIndexSurat.add(103);
                    dataAyatWantedIndexNama.add("Q.S Al Ashr 103:1");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(2);
                    dataAyatWantedIndexSurat.add(103);
                    dataAyatWantedIndexNama.add("Q.S Al Ashr 103:2");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(3);
                    dataAyatWantedIndexSurat.add(103);
                    dataAyatWantedIndexNama.add("Q.S Al Ashr 103:3");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 62){


                    dataAyatWantedIndexAyat.add(103);
                    dataAyatWantedIndexSurat.add(18);
                    dataAyatWantedIndexNama.add("Q.S Al Kahfi 18:103");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(104);
                    dataAyatWantedIndexSurat.add(18);
                    dataAyatWantedIndexNama.add("Q.S Al Kahfi 18:104");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(105);
                    dataAyatWantedIndexSurat.add(18);
                    dataAyatWantedIndexNama.add("Q.S Al Kahfi 18:105");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 63){


                    dataAyatWantedIndexAyat.add(98);
                    dataAyatWantedIndexSurat.add(9);
                    dataAyatWantedIndexNama.add("Q.S At Taubah 9:98");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 64){


                    dataAyatWantedIndexAyat.add(11);
                    dataAyatWantedIndexSurat.add(22);
                    dataAyatWantedIndexNama.add("Q.S Al Hajj 22:11");
                    dataAyatWantedIndexKeterangan.add("1. Maksudnya tidak penuh keyakinan" +
                            "2.Maksudnya, kembali kafir lagi");


                    dataAyatWantedIndexAyat.add(52);
                    dataAyatWantedIndexSurat.add(29);
                    dataAyatWantedIndexNama.add("Q.S Al 'Ankabut 29:52");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(63);
                    dataAyatWantedIndexSurat.add(39);
                    dataAyatWantedIndexNama.add("Q.S Az Zumar 39:63");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 65){


                    dataAyatWantedIndexAyat.add(48);
                    dataAyatWantedIndexSurat.add(53);
                    dataAyatWantedIndexNama.add("Q.S An Najm 53:48");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 66){


                    dataAyatWantedIndexAyat.add(53);
                    dataAyatWantedIndexSurat.add(6);
                    dataAyatWantedIndexNama.add("Q.S Al An'aam 6:53");
                    dataAyatWantedIndexKeterangan.add("1.Pertanyaan ini dilontarkan orang-orang kafir untuk mengejek orang-orang lemah di antara pengikut nabi Muhammad Saw." +
                            "Pertanyaan ini untuk membantah mereka sebab, sebab para pengikut Nabi Muhammad Saw. Itulah yang pandai bersyukur, sebaliknya orang kafir tidak bersyukur(kufur)");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 67){


                    dataAyatWantedIndexAyat.add(15);
                    dataAyatWantedIndexSurat.add(89);
                    dataAyatWantedIndexNama.add("Q.S Al Fajr 89:15");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(16);
                    dataAyatWantedIndexSurat.add(89);
                    dataAyatWantedIndexNama.add("Q.S Al Fajr 89:16");
                    dataAyatWantedIndexKeterangan.add("Ayat ini adalah teguran dari Allah SWT, bahwa kekayaan itu bukanlah suatu kemuliaan, sebaliknya kemiskinan bukanlah suatu kehinaan. Yang benar kekayaan atau kemiskinan adalah suatu ujian keimanan");


                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 68){


                    dataAyatWantedIndexAyat.add(31);
                    dataAyatWantedIndexSurat.add(17);
                    dataAyatWantedIndexNama.add("Q.S Al Isroo' 17:31");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 69){


                    dataAyatWantedIndexAyat.add(26);
                    dataAyatWantedIndexSurat.add(17);
                    dataAyatWantedIndexNama.add("Q.S Al Isroo' 17:26");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(38);
                    dataAyatWantedIndexSurat.add(30);
                    dataAyatWantedIndexNama.add("Q.S Ar Ruum 30:38");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 70){


                    dataAyatWantedIndexAyat.add(1);
                    dataAyatWantedIndexSurat.add(107);
                    dataAyatWantedIndexNama.add("Q.S Al Maa'un 107:1");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(2);
                    dataAyatWantedIndexSurat.add(107);
                    dataAyatWantedIndexNama.add("Q.S Al Maa'un 107:2");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(3);
                    dataAyatWantedIndexSurat.add(107);
                    dataAyatWantedIndexNama.add("Q.S Al Maa'un 107:3");
                    dataAyatWantedIndexKeterangan.add("");



                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 71){


                    dataAyatWantedIndexAyat.add(19);
                    dataAyatWantedIndexSurat.add(51);
                    dataAyatWantedIndexNama.add("Q.S Adz Dzaariyaat 51:19");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(24);
                    dataAyatWantedIndexSurat.add(70);
                    dataAyatWantedIndexNama.add("Q.S Al Ma'aarij 70:24");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(25);
                    dataAyatWantedIndexSurat.add(70);
                    dataAyatWantedIndexNama.add("Q.S Al Ma'aarij 70:25");
                    dataAyatWantedIndexKeterangan.add("");


                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 72){


                    dataAyatWantedIndexAyat.add(10);
                    dataAyatWantedIndexSurat.add(93);
                    dataAyatWantedIndexNama.add("Q.S Adh Dhuhaa 93:10");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 73){


                    dataAyatWantedIndexAyat.add(273);
                    dataAyatWantedIndexSurat.add(2);
                    dataAyatWantedIndexNama.add("Q.S Al Baqorooh 2:273");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 74){


                    dataAyatWantedIndexAyat.add(120);
                    dataAyatWantedIndexSurat.add(6);
                    dataAyatWantedIndexNama.add("Q.S Al An'aam 6:120");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 75){


                    dataAyatWantedIndexAyat.add(15);
                    dataAyatWantedIndexSurat.add(17);
                    dataAyatWantedIndexNama.add("Q.S Al Isroo' 17:15");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(18);
                    dataAyatWantedIndexSurat.add(35);
                    dataAyatWantedIndexNama.add("Q.S Faathir 35:18");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(7);
                    dataAyatWantedIndexSurat.add(39);
                    dataAyatWantedIndexNama.add("Q.S Az  Zumar 39:7");
                    dataAyatWantedIndexKeterangan.add("Maksudnya setiap orang memikul dosanya masing-masing");

                    dataAyatWantedIndexAyat.add(36);
                    dataAyatWantedIndexSurat.add(53);
                    dataAyatWantedIndexNama.add("Q.S An Najm 53:36");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(37);
                    dataAyatWantedIndexSurat.add(53);
                    dataAyatWantedIndexNama.add("Q.S An Najm 53:37");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(38);
                    dataAyatWantedIndexSurat.add(53);
                    dataAyatWantedIndexNama.add("Q.S An Najm 53:38");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 76){


                    dataAyatWantedIndexAyat.add(12);
                    dataAyatWantedIndexSurat.add(29);
                    dataAyatWantedIndexNama.add("Q.S Al 'Ankabuut 29:12");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(13);
                    dataAyatWantedIndexSurat.add(29);
                    dataAyatWantedIndexNama.add("Q.S Al 'Ankabuut 29:13");
                    dataAyatWantedIndexKeterangan.add("Maksudnya adalah dosa-dosa dari orang-orang yang mengikuti ajakan mereka berbuat sesat");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 77){


                    dataAyatWantedIndexAyat.add(31);
                    dataAyatWantedIndexSurat.add(4);
                    dataAyatWantedIndexNama.add("Q.S An Nisaa' 4:31");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(36);
                    dataAyatWantedIndexSurat.add(42);
                    dataAyatWantedIndexNama.add("Q.S Asy Syuuroo 42:36");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(36);
                    dataAyatWantedIndexSurat.add(42);
                    dataAyatWantedIndexNama.add("Q.S Asy Syuuroo 42:37");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 78){


                    dataAyatWantedIndexAyat.add(111);
                    dataAyatWantedIndexSurat.add(4);
                    dataAyatWantedIndexNama.add("Q.S An Nisaa' 4:111");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(164);
                    dataAyatWantedIndexSurat.add(6);
                    dataAyatWantedIndexNama.add("Q.S Al An'aam 6:164");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 79){


                    dataAyatWantedIndexAyat.add(48);
                    dataAyatWantedIndexSurat.add(4);
                    dataAyatWantedIndexNama.add("Q.S An Nisaa' 4:48");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 80){


                    dataAyatWantedIndexAyat.add(49);
                    dataAyatWantedIndexSurat.add(5);
                    dataAyatWantedIndexNama.add("Q.S Al Maaidah 5:49");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 81){

                    dataAyatWantedIndexAyat.add(31);
                    dataAyatWantedIndexSurat.add(53);
                    dataAyatWantedIndexNama.add("Q.S An Najm 53:31");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 82){


                    dataAyatWantedIndexAyat.add(171);
                    dataAyatWantedIndexSurat.add(3);
                    dataAyatWantedIndexNama.add("Q.S Ali Imron 3:171");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(30);
                    dataAyatWantedIndexSurat.add(18);
                    dataAyatWantedIndexNama.add("Q.S Al Kahfi 18:30");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 83){


                    dataAyatWantedIndexAyat.add(110);
                    dataAyatWantedIndexSurat.add(2);
                    dataAyatWantedIndexNama.add("Q.S Al Baqorooh 2:110");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 84){

                    dataAyatWantedIndexAyat.add(80);
                    dataAyatWantedIndexSurat.add(28);
                    dataAyatWantedIndexNama.add("Q.S Al Qoshsosh 28:80");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 85){


                    dataAyatWantedIndexAyat.add(12);
                    dataAyatWantedIndexSurat.add(67);
                    dataAyatWantedIndexNama.add("Q.S Al Mulk 67:12");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 86){


                    dataAyatWantedIndexAyat.add(123);
                    dataAyatWantedIndexSurat.add(2);
                    dataAyatWantedIndexNama.add("Q.S Al Baqorooh 2:123");
                    dataAyatWantedIndexKeterangan.add("Maksudnya pahala dan dosa seorang tidak dapat dipindahkan kepada orang lain");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 87){


                    dataAyatWantedIndexAyat.add(286);
                    dataAyatWantedIndexSurat.add(2);
                    dataAyatWantedIndexNama.add("Q.S Al Baqorooh 2:286");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }



                dataAyatWantedIndexNama.clear();
                dataAyatWantedIndexSurat.clear();
                dataAyatWantedIndexAyat.clear();
                dataAyatWantedIndexKeterangan.clear();

            }
        });

    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            startActivity(new Intent(MenuInnerBabMdP2.this,  MenuSubBab3.class));
            // Handle the camera action
        } else if (id == R.id.nav_info) {

            startActivity(new Intent(MenuInnerBabMdP2.this,  AboutActivity.class));

        }else if (id == R.id.nav_exit){


            finishAffinity();
            System.exit(0);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}