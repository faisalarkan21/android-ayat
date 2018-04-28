package com.example.faisal.ayat_syafiq;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;



public class MenuInnerBabMdP3 extends AppCompatActivity implements BackPressedListener , NavigationView.OnNavigationItemSelectedListener  {

    private ListView mainListView ;
    private ArrayAdapter<String> listAdapter ;

    List dataAyatWantedIndexAyat = new ArrayList();
    List dataAyatWantedIndexSurat = new ArrayList();
    List dataAyatWantedIndexNama = new ArrayList();
    List dataAyatWantedIndexKeterangan = new ArrayList();
    List titleSubBab = new ArrayList();
    EntityQuran entity = new EntityQuran();

    String[] ListSub1 = new String[] {"Kesaksian Jiwa Terhadap Keesaan Tuhan", "Kelak Jiwa Juga Mengalami Penyesalan", "Jiwa yang Diridhoi Allah SWT", "Untung Rugi Seseorang Tergantung Jiwanya", "Gerak-gerik Hati Diketahui Allah SWT", "Kelak Hati Diminta Pertanggung Jawaban","Dusta Termasuk Penyakit Hati", "Menolak Kebenaran Termasuk Berpenyakit Hati", "Suka Menyakiti Temasuk Berpenyakit Hati", "Lalailah Orang yang Tidak Gunakan Hatinya", "Celakalah Orang yang Keras Hatnya", "Yang Tak Gunakan Akal Dimurkai Allah SWT", "Perintah Bertaqwa bagi yang Berakal","Yang Menggunakan Akalnya jauhi Thoghut dan Ikuti Al Qur'an",
                                      "Yang Gunakan Akalnya Takut kepada Allah", "Dorong-doronganagar Manusia Berpikir", "Ayat-ayat Allah SWT untuk yang berpikir", "Yang Berakal Pikirkan Kejadian Alam","Larangan Ikuti Hawa Nafsu", "Larangan Ikuti Hawa Nafsu Orang yang Tersesat", "Nafsu Menyuruh Berbuat Jahat", "Yang Ikuti Nafsu Tinggalkan Kebenaran", "Yang Ikuti Hawa Nafsu Tak Bakal Selamat", "Tersesatlah yang Ikuti Hawa Nafsu", "Pahala bagi yang Menahan Hawa Nafsu", "Binasalah Jika Tunduk pada Hawa Nafsu"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_inner_sub);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        titleSubBab.add("Jiwa, Akal, dan Nafsu");
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

                Intent intent = new Intent(MenuInnerBabMdP3.this, MenuAyat.class);
                if (position == 0) {

                    dataAyatWantedIndexAyat.add(4);
                    dataAyatWantedIndexSurat.add(90);
                    dataAyatWantedIndexNama.add("Q.S Al A'roof 7:172");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 1){

                    dataAyatWantedIndexAyat.add(2);
                    dataAyatWantedIndexSurat.add(75);
                    dataAyatWantedIndexNama.add("Q.S Al Qiyaamah 75:2");
                    dataAyatWantedIndexKeterangan.add("Maksudnya sekalipun telah berbuat kebaikan, jiwa tetap menyesal kenapa ia tidak berbuat kebaikan lebih banyak lagi, apalagi jika ia telah berbuat kejahatan");

                    dataAyatWantedIndexAyat.add(3);
                    dataAyatWantedIndexSurat.add(75);
                    dataAyatWantedIndexNama.add("Q.S Al Qiyaamah 75:2");
                    dataAyatWantedIndexKeterangan.add("Maksudnya sekalipun telah berbuat kebaikan, jiwa tetap menyesal kenapa ia tidak berbuat kebaikan lebih banyak lagi, apalagi jika ia telah berbuat kejahatan");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 2){

                    dataAyatWantedIndexAyat.add(27);
                    dataAyatWantedIndexSurat.add(89);
                    dataAyatWantedIndexNama.add("Q.S Al Qiyaamah 89:27");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(28);
                    dataAyatWantedIndexSurat.add(89);
                    dataAyatWantedIndexNama.add("Q.S Al Qiyaamah 89:28");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(29);
                    dataAyatWantedIndexSurat.add(89);
                    dataAyatWantedIndexNama.add("Q.S Al Qiyaamah 89:29");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(30);
                    dataAyatWantedIndexSurat.add(89);
                    dataAyatWantedIndexNama.add("Q.S Al Qiyaamah 89:30");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 3){

                    dataAyatWantedIndexAyat.add(8);
                    dataAyatWantedIndexSurat.add(91);
                    dataAyatWantedIndexNama.add("Q.S Asy Syams 91:8");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(9);
                    dataAyatWantedIndexSurat.add(91);
                    dataAyatWantedIndexNama.add("Q.S Asy Syams 91:9");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(10);
                    dataAyatWantedIndexSurat.add(91);
                    dataAyatWantedIndexNama.add("Q.S Asy Syams 91:10");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 4){

                    dataAyatWantedIndexAyat.add(284);
                    dataAyatWantedIndexSurat.add(2);
                    dataAyatWantedIndexNama.add("Q.S Al Baqorooh 2:284");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(29);
                    dataAyatWantedIndexSurat.add(3);
                    dataAyatWantedIndexNama.add("Q.S Ali Imron");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 5){

                    dataAyatWantedIndexAyat.add(36);
                    dataAyatWantedIndexSurat.add(17);
                    dataAyatWantedIndexNama.add("Q.S Al Isroo' 17:36");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 6){

                    dataAyatWantedIndexAyat.add(10);
                    dataAyatWantedIndexSurat.add(2);
                    dataAyatWantedIndexNama.add("Q.S Al Baqorooh 2:10");
                    dataAyatWantedIndexKeterangan.add("Maksudnya keyakinan mereka terhadap kebenaran Nabi Muhammad Rosulullah Saw. lemah. Kelemahan keyakinan itu menimbulkan kedengkian, iri hati, dan dendam terhadap Nabi Saw, agama dan orang-orang Islam");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 7){

                    dataAyatWantedIndexAyat.add(12);
                    dataAyatWantedIndexSurat.add(33);
                    dataAyatWantedIndexNama.add("Q.S Al Ahzab 33:12");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 8){

                    dataAyatWantedIndexAyat.add(60);
                    dataAyatWantedIndexSurat.add(33);
                    dataAyatWantedIndexNama.add("Q.S Al Ahzab 33:60");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 9){

                    dataAyatWantedIndexAyat.add(179);
                    dataAyatWantedIndexSurat.add(7);
                    dataAyatWantedIndexNama.add("Q.S Al A'roof 7:179");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 10){

                    dataAyatWantedIndexAyat.add(22);
                    dataAyatWantedIndexSurat.add(39);
                    dataAyatWantedIndexNama.add("Q.S Az Zumar 39:22");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 11){

                    dataAyatWantedIndexAyat.add(100);
                    dataAyatWantedIndexSurat.add(10);
                    dataAyatWantedIndexNama.add("Q.S Yunus 10:100");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 12){

                    dataAyatWantedIndexAyat.add(197);
                    dataAyatWantedIndexSurat.add(2);
                    dataAyatWantedIndexNama.add("Q.S Al Baqorooh 2:197");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 13){

                    dataAyatWantedIndexAyat.add(17);
                    dataAyatWantedIndexSurat.add(39);
                    dataAyatWantedIndexNama.add("Q.S Az Zumar 39:17");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 14){

                    dataAyatWantedIndexAyat.add(19);
                    dataAyatWantedIndexSurat.add(13);
                    dataAyatWantedIndexNama.add("Q.S Ar Ro'd 13:19");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(20);
                    dataAyatWantedIndexSurat.add(13);
                    dataAyatWantedIndexNama.add("Q.S Ar Ro'd 13:20");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(21);
                    dataAyatWantedIndexSurat.add(13);
                    dataAyatWantedIndexNama.add("Q.S Ar Ro'd 13:21");
                    dataAyatWantedIndexKeterangan.add("Maksudnya mengadakan hubungan silaturahmi dan tali persaudaraan");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 15){

                    dataAyatWantedIndexAyat.add(44);
                    dataAyatWantedIndexSurat.add(16);
                    dataAyatWantedIndexNama.add("Q.S An Nahl 16:44");
                    dataAyatWantedIndexKeterangan.add("Maksudnya perintah-perintah, larangan-larangan, aturan, dan lain-lain yang terdapat dalam Al Qur'an");

                    dataAyatWantedIndexAyat.add(17);
                    dataAyatWantedIndexSurat.add(57);
                    dataAyatWantedIndexNama.add("Q.S Al Hadiid 57:17");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(21);
                    dataAyatWantedIndexSurat.add(59);
                    dataAyatWantedIndexNama.add("Q.S Al Hasyr 59:21");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 16){

                    dataAyatWantedIndexAyat.add(3);
                    dataAyatWantedIndexSurat.add(13);
                    dataAyatWantedIndexNama.add("Q.S Ar Ra'd 13:3");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(69);
                    dataAyatWantedIndexSurat.add(16);
                    dataAyatWantedIndexNama.add("Q.S An Nahl 16:69");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(13);
                    dataAyatWantedIndexSurat.add(45);
                    dataAyatWantedIndexNama.add("Q.S Al Jaatsiyah 45:13");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 17){

                    dataAyatWantedIndexAyat.add(190);
                    dataAyatWantedIndexSurat.add(3);
                    dataAyatWantedIndexNama.add("Q.S Ali Imron 3:190");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(191);
                    dataAyatWantedIndexSurat.add(3);
                    dataAyatWantedIndexNama.add("Q.S Ali Imron 3:191");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 18){

                    dataAyatWantedIndexAyat.add(135);
                    dataAyatWantedIndexSurat.add(4);
                    dataAyatWantedIndexNama.add("Q.S An Nisaa' 4:135");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 19){

                    dataAyatWantedIndexAyat.add(190);
                    dataAyatWantedIndexSurat.add(3);
                    dataAyatWantedIndexNama.add("Q.S Al Maidah 5:77");
                    dataAyatWantedIndexKeterangan.add("Kaum yang dimaksud dalam ayat tersebut adalah golongan yang menyembunyikan atau mengubah sebagian isi kitab Allah");

                    dataAyatWantedIndexAyat.add(150);
                    dataAyatWantedIndexSurat.add(6);
                    dataAyatWantedIndexNama.add("Q.S Al An'aam 6:150");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 20){

                    dataAyatWantedIndexAyat.add(53);
                    dataAyatWantedIndexSurat.add(12);
                    dataAyatWantedIndexNama.add("Q.S Yusuf 12:53");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 21){

                    dataAyatWantedIndexAyat.add(27);
                    dataAyatWantedIndexSurat.add(4);
                    dataAyatWantedIndexNama.add("Q.S An Nisaa' 4:27");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 22){

                    dataAyatWantedIndexAyat.add(37);
                    dataAyatWantedIndexSurat.add(13);
                    dataAyatWantedIndexNama.add("Q.S Ar Ro'd 13:37");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(16);
                    dataAyatWantedIndexSurat.add(20);
                    dataAyatWantedIndexNama.add("Q.S Thooha 20:16");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 23) {

                    dataAyatWantedIndexAyat.add(56);
                    dataAyatWantedIndexSurat.add(6);
                    dataAyatWantedIndexNama.add("Q.S Al An'aam 6:56");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(59);
                    dataAyatWantedIndexSurat.add(19);
                    dataAyatWantedIndexNama.add("Q.S Maryam 19:59");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(50);
                    dataAyatWantedIndexSurat.add(28);
                    dataAyatWantedIndexNama.add("Q.S Al Qoshosh 28:50");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(26);
                    dataAyatWantedIndexSurat.add(38);
                    dataAyatWantedIndexNama.add("Q.S Shood 38:26");
                    dataAyatWantedIndexKeterangan.add("");


                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 24) {

                    dataAyatWantedIndexAyat.add(40);
                    dataAyatWantedIndexSurat.add(79);
                    dataAyatWantedIndexNama.add("Q.S An Naazi'aat 79:40");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(41);
                    dataAyatWantedIndexSurat.add(79);
                    dataAyatWantedIndexNama.add("Q.S An Naazi'aat 79:41");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 25){

                    dataAyatWantedIndexAyat.add(71);
                    dataAyatWantedIndexSurat.add(23);
                    dataAyatWantedIndexNama.add("Q.S Al Mu'minuun 23:71 ");
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
            startActivity(new Intent(MenuInnerBabMdP3.this,  App.class));
            // Handle the camera action
        } else if (id == R.id.nav_info) {


            startActivity(new Intent(MenuInnerBabMdP3.this,  AboutActivity.class));
        }else if (id == R.id.nav_exit){


            DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    switch (which) {
                        case DialogInterface.BUTTON_POSITIVE:
                            finishAffinity();
                            System.exit(0);
                            break;

                        case DialogInterface.BUTTON_NEGATIVE:
                            //No button clicked
                            break;
                    }
                }
            };

            AlertDialog.Builder builder = new AlertDialog.Builder(MenuInnerBabMdP3.this);
            builder.setMessage("Apakah yakin inigin keluar ?").setPositiveButton("Ya", dialogClickListener)
                    .setNegativeButton("Tidak", dialogClickListener).show();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}