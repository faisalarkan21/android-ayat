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



public class MenuInnerBabMdP1 extends Activity implements BackPressedListener {

    private ListView mainListView ;
    private ArrayAdapter<String> listAdapter ;

    List dataAyatWantedIndexAyat = new ArrayList();
    List dataAyatWantedIndexSurat = new ArrayList();
    List dataAyatWantedIndexNama = new ArrayList();
    List dataAyatWantedIndexKeterangan = new ArrayList();
    List titleSubBab = new ArrayList();
    EntityQuran entity = new EntityQuran();

    String[] ListSub1 = new String[] {"Manusia Diciptakan dari Tanah", "Kelak Manusia Kembali ke Tanah", "Asal-Usul Manusia", "Manusia Diciptakan Tidak Main-main", "Bahasa dan Warna Kulit Manusia Berbeda-beda", "Semula Manusia Satu Umat", "Manusia Dijadikan Berbangsa-bangsa", "Anjuran Perhatikan Penciptaan Manusia", "Proses Penciptaan Manusia Dalam Rahim", "Manusia Dilengkapi Pendengaran, Penglihatan dan Hati", "Bentuk Manusia Ditentukan Dalam Rahim", "Rupa Manusia Dibaguskan", "Umur Manusia Sudah Ditetapkan", "Jiwa(Ruh) Manusia Dalam Genggaman-Nya", "Kehudupan Manusia Bertahap", "Manusia Dilahirkan sebagai Bayi", "Semula Manusia Lemah lalu Menjadi Kuat dan Lemah Kembali", "Sebagian Manusia Hidup sampai Tua dan Pikun",
                                      "Manusia Wajib Beribadah kepada Allah", "Allah Tidak Membutuhkan Manusia", "Manusia yang Butuh Allah Swt", "Kebutuhan Manusia Dipenuhi Allah SWT", "Manusia Diistimewakan Allah SWT", "Manusia Dijadikan Kholifah di Bumi", "Manusia Dijadikan Pemimpin di Bumi", "Manusia Diberi Sedkit Ilmu", "Setiap Manusia Ditunjukkan Jalan Lurus", "Kehidupn Manusia Diperhatikan Allah SWT", "Manusia Tidak Lepas Dari Tanggung Jawab", "Manusia Harus Bertanggung Jawab Atas Amalnya", "Manusia Tidak mempertanggungjawabkan Amal Orang Lain",
                                      "Manusia Itu Lemah", "Manusia Itu Amat Bodoh", "Manusia Itu Sombong", "Manusia Tidak Tahu Terima kasih", "Manusia Sangat Zalim dan Ingkar Nikmat", "Manusia Sangat Kikir", "Manusia Suka Berselisih Pendapat", "Manusia Suka Membantah", "Manusia Suka Menantang", "Manusia Suka Tergesa-gesa", "Sebagian Manusia Rakus Terhadap Dunia", "Manusia Suka Membuat Kerusakan"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_inner_sub);

        titleSubBab.add("Asal-Usul Manusia dan Sifat-Sifatnya");
        titleSubBab.add("Tahapan Kehidupan Manusia");
        titleSubBab.add("Kewajiban dan Hak Manusia");
        titleSubBab.add("Sifat Manusia");

        mainListView = (ListView) findViewById( R.id.list );
        listAdapter = new ArrayAdapter<String>(this, R.layout.list_inner_sub, ListSub1);

        mainListView.setAdapter(listAdapter);


        mainListView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position, long arg3)
            {

                Intent intent = new Intent(MenuInnerBabMdP1.this, MenuAyat.class);
                if (position == 0) {

                    dataAyatWantedIndexAyat.add(26);
                    dataAyatWantedIndexSurat.add(15);
                    dataAyatWantedIndexNama.add("Q.S Al Hijr 15:26");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(14);
                    dataAyatWantedIndexSurat.add(55);
                    dataAyatWantedIndexNama.add("Q.S Ar Rohchman 55:14");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 1){

                    dataAyatWantedIndexAyat.add(55);
                    dataAyatWantedIndexSurat.add(20);
                    dataAyatWantedIndexNama.add("Q.S Thooha 20:55");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(17);
                    dataAyatWantedIndexSurat.add(71);
                    dataAyatWantedIndexNama.add("Q.S Nuh 71:17");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(18);
                    dataAyatWantedIndexSurat.add(71);
                    dataAyatWantedIndexNama.add("Q.S Nuh 71:18");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 2){

                    dataAyatWantedIndexAyat.add(98);
                    dataAyatWantedIndexSurat.add(6);
                    dataAyatWantedIndexNama.add("Q.S Al An'aam 6:98");
                    dataAyatWantedIndexKeterangan.add("Di antara para mufassirin ada yang berpendapat, bahwa yang dimaksud tempat tetap adalah tulang sulbi ayah, dan tempat simpanan adalah rahim ibu. Juga ada yang berpendapat bahwa tempat tetapadalah di atas bumi sewaktu masih hidup, dan tempat simpanan adalah alam kubur setelah manusia meninggal duna.");


                    dataAyatWantedIndexAyat.add(189);
                    dataAyatWantedIndexSurat.add(7);
                    dataAyatWantedIndexNama.add("Q.S Al A'roof 7:189");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(6);
                    dataAyatWantedIndexSurat.add(39);
                    dataAyatWantedIndexNama.add("Q.S Az Zumar 39:6");
                    dataAyatWantedIndexKeterangan.add("Tiga kegelapan tersebut adalah kegelapan dalam perut, kegelapan dalam rahim, dan kegelapan selaput yang menutup anak dalam rahim");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 3){

                    dataAyatWantedIndexAyat.add(115);
                    dataAyatWantedIndexSurat.add(23);
                    dataAyatWantedIndexNama.add("Q.S Al Mu'minuun 23:115");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 4){

                    dataAyatWantedIndexAyat.add(22);
                    dataAyatWantedIndexSurat.add(30);
                    dataAyatWantedIndexNama.add("Q.S Al Ar Ruum 30:22");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 5){

                    dataAyatWantedIndexAyat.add(213);
                    dataAyatWantedIndexSurat.add(2);
                    dataAyatWantedIndexNama.add("Q.S Al Baqooroh 2:213");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(19);
                    dataAyatWantedIndexSurat.add(10);
                    dataAyatWantedIndexNama.add("Q.S Yunus 10:19");
                    dataAyatWantedIndexKeterangan.add("1.Maksudnya, semula manusia hidup rukun, bersatu dalam suatu agama sebagai suatu keluarga. namun setelah mereka berkembangbiak dan memiliki kepentingan yang berlainan, muncullah bermacam-macam kepercayaan menimbulkan perpecahan. oleh sebab itu Allah mengutus para rosul membawa wahyu dan memberi petunjuk kepada mereka" +
                            "2.Ketetapan Allah itu adalah bahwa perselisihan manusia di dunia ini akan diputuskan di akhirat kelak" +
                            "3.Maksudnya adalah diberi keputusan di dunia");

                    dataAyatWantedIndexAyat.add(93);
                    dataAyatWantedIndexSurat.add(16);
                    dataAyatWantedIndexNama.add("Q.S An Nahl 16:93");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(8);
                    dataAyatWantedIndexSurat.add(42);
                    dataAyatWantedIndexNama.add("Q.S Asy Syuuroo 42:8");
                    dataAyatWantedIndexKeterangan.add("");


                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 6){

                    dataAyatWantedIndexAyat.add(13);
                    dataAyatWantedIndexSurat.add(49);
                    dataAyatWantedIndexNama.add("Q.S Al Hujuroot 49:13");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 7){

                    dataAyatWantedIndexAyat.add(20);
                    dataAyatWantedIndexSurat.add(29);
                    dataAyatWantedIndexNama.add("Q.S Al 'Ankabut 29:20");
                    dataAyatWantedIndexKeterangan.add("Maksudnya Allah SWT membangkitkan kembali manusia yang telah mati pada hari kiamat kelak");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 8){

                    dataAyatWantedIndexAyat.add(12);
                    dataAyatWantedIndexSurat.add(23);
                    dataAyatWantedIndexNama.add("Q.S Al Mu'minuun 23:12");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(13);
                    dataAyatWantedIndexSurat.add(23);
                    dataAyatWantedIndexNama.add("Q.S Al Mu'minuun 23:13");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(14);
                    dataAyatWantedIndexSurat.add(23);
                    dataAyatWantedIndexNama.add("Q.S Al Mu'minuun 23:14");
                    dataAyatWantedIndexKeterangan.add("Setelah melalui proses tertentu, sari tanah menjadi air mani yang merupakan asal-usul manusia");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 9){

                    dataAyatWantedIndexAyat.add(78);
                    dataAyatWantedIndexSurat.add(16);
                    dataAyatWantedIndexNama.add("Q.S An Nahl 16:78");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(78);
                    dataAyatWantedIndexSurat.add(23);
                    dataAyatWantedIndexNama.add("Q.S Al Mu'minuun 23:78");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(9);
                    dataAyatWantedIndexSurat.add(32);
                    dataAyatWantedIndexNama.add("Q.S As Sajdah 32:9");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(23);
                    dataAyatWantedIndexSurat.add(67);
                    dataAyatWantedIndexNama.add("Q.S Al Mulk 67:23");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 10){

                    dataAyatWantedIndexAyat.add(6);
                    dataAyatWantedIndexSurat.add(3);
                    dataAyatWantedIndexNama.add("Q.S Ali Imron 3:6");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(20);
                    dataAyatWantedIndexSurat.add(77);
                    dataAyatWantedIndexNama.add("Q.S Al Mursalaat 77:20");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(21);
                    dataAyatWantedIndexSurat.add(77);
                    dataAyatWantedIndexNama.add("Q.S Al Mursalaat 77:21");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(22);
                    dataAyatWantedIndexSurat.add(77);
                    dataAyatWantedIndexNama.add("Q.S Al Mursalaat 77:22");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(23);
                    dataAyatWantedIndexSurat.add(77);
                    dataAyatWantedIndexNama.add("Q.S Al Mursalaat 77:23");
                    dataAyatWantedIndexKeterangan.add("Yang dimaksud dengan 'air yang hina' adalah air mani");

                    dataAyatWantedIndexAyat.add(18);
                    dataAyatWantedIndexSurat.add(80);
                    dataAyatWantedIndexNama.add("Q.S Abasa 80:18");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(19);
                    dataAyatWantedIndexSurat.add(80);
                    dataAyatWantedIndexNama.add("Q.S Abasa 80:19");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(20);
                    dataAyatWantedIndexSurat.add(80);
                    dataAyatWantedIndexNama.add("Q.S Abasa 80:20");
                    dataAyatWantedIndexKeterangan.add("1.Yang dimaksud 'menentukannya' adalah menentukan tahap-tahap kehidupannya baik menyangkut umurnya, rejekinya, dan nasibnya" +
                            "2.Maksudnya memudahkan kelahirannya atau memberi persediaan kepadanya untuk menjalani kehidupan yang benar atau jalan yang sesat");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 11){

                    dataAyatWantedIndexAyat.add(64);
                    dataAyatWantedIndexSurat.add(40);
                    dataAyatWantedIndexNama.add("Q.S Al Mu'min 40:64");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(3);
                    dataAyatWantedIndexSurat.add(64);
                    dataAyatWantedIndexNama.add("Q.S At Taghoobun 64:3");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 12){

                    dataAyatWantedIndexAyat.add(11);
                    dataAyatWantedIndexSurat.add(35);
                    dataAyatWantedIndexNama.add("Q.S Faathir 35:11");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 13){

                    dataAyatWantedIndexAyat.add(42);
                    dataAyatWantedIndexSurat.add(39);
                    dataAyatWantedIndexNama.add("Q.S Az Zumar 39:42");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 14){

                    dataAyatWantedIndexAyat.add(19);
                    dataAyatWantedIndexSurat.add(84);
                    dataAyatWantedIndexNama.add("Q.S Al Insyiqooq 84:19");
                    dataAyatWantedIndexKeterangan.add("Maksudnya, kejadian manusia itu dari setetes mani hingga dilahirkan, kmudian melalui masa balita, kanak-kanak, remaja, hingga memasuki usia senja. Akhirnya mati, dan kemudian dibangkitkan kembali");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 15){

                    dataAyatWantedIndexAyat.add(5);
                    dataAyatWantedIndexSurat.add(22);
                    dataAyatWantedIndexNama.add("Q.S Al Hajj 22:5");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 16){

                    dataAyatWantedIndexAyat.add(54);
                    dataAyatWantedIndexSurat.add(30);
                    dataAyatWantedIndexNama.add("Q.S Ar Ruum 30:54");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(68);
                    dataAyatWantedIndexSurat.add(36);
                    dataAyatWantedIndexNama.add("Q.S Yaa Siin 36:68");
                    dataAyatWantedIndexKeterangan.add("Maksudnya menjadi lemah dan kurang akal");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 17){

                    dataAyatWantedIndexAyat.add(70);
                    dataAyatWantedIndexSurat.add(16);
                    dataAyatWantedIndexNama.add("Q.S An Nahl 16:70");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(5);
                    dataAyatWantedIndexSurat.add(22);
                    dataAyatWantedIndexNama.add("Q.S Al Hajj 22:5");
                    dataAyatWantedIndexKeterangan.add("Maksudnya menjadi lemah dan kurang akal");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 18){

                    dataAyatWantedIndexAyat.add(56);
                    dataAyatWantedIndexSurat.add(51);
                    dataAyatWantedIndexNama.add("Q.S Adz Dzariyat 51:56");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(5);
                    dataAyatWantedIndexSurat.add(98);
                    dataAyatWantedIndexNama.add("Q.S Al Bayyinah 98:5");
                    dataAyatWantedIndexKeterangan.add("Lurus berarti jauh dari perbuatan syirik(mempersekutukan Allah) dan jauh dari kesesatan");

                    dataAyatWantedIndexAyat.add(162);
                    dataAyatWantedIndexSurat.add(6);
                    dataAyatWantedIndexNama.add("Q.S Al An'aam 6:122");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 19){

                    dataAyatWantedIndexAyat.add(57);
                    dataAyatWantedIndexSurat.add(51);
                    dataAyatWantedIndexNama.add("Q.S Adz Dzariyat 51:57");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 20){

                    dataAyatWantedIndexAyat.add(15);
                    dataAyatWantedIndexSurat.add(35);
                    dataAyatWantedIndexNama.add("Q.S Faathir 35:15");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 21){

                    dataAyatWantedIndexAyat.add(20);
                    dataAyatWantedIndexSurat.add(15);
                    dataAyatWantedIndexNama.add("Q.S Al Hijr 15:20");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 22){

                    dataAyatWantedIndexAyat.add(70);
                    dataAyatWantedIndexSurat.add(17);
                    dataAyatWantedIndexNama.add("Q.S Al Isroo' 17:70");
                    dataAyatWantedIndexKeterangan.add("Maksudnya Allah memudahkan manusia pengangkutan-pengangkutan di daratan dan di lautan untuk memperoleh kehidupan");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 23){

                    dataAyatWantedIndexAyat.add(30);
                    dataAyatWantedIndexSurat.add(2);
                    dataAyatWantedIndexNama.add("Q.S Al Baqorooh 2:30");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(39);
                    dataAyatWantedIndexSurat.add(35);
                    dataAyatWantedIndexNama.add("Q.S Al Baqorooh 35:39");
                    dataAyatWantedIndexKeterangan.add("yang dimaksud kholifah disini adalah Nabi Adam as. ditugaskan menjadi pemimpin di bumi sesuai dengan petunjuk Allah");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 24){

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

                }else if (position == 25){

                    dataAyatWantedIndexAyat.add(85);
                    dataAyatWantedIndexSurat.add(17);
                    dataAyatWantedIndexNama.add("Q.S Al Isroo' 17:85");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 26){

                    dataAyatWantedIndexAyat.add(3);
                    dataAyatWantedIndexSurat.add(76);
                    dataAyatWantedIndexNama.add("Q.S Al Insaan 76:3");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 27){

                    dataAyatWantedIndexAyat.add(31);
                    dataAyatWantedIndexSurat.add(55);
                    dataAyatWantedIndexNama.add("Q.S Ar Rochman 55:31");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 28){

                    dataAyatWantedIndexAyat.add(36);
                    dataAyatWantedIndexSurat.add(75);
                    dataAyatWantedIndexNama.add("Q.S Al Qiyaamah 75:36");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 29){

                    dataAyatWantedIndexAyat.add(38);
                    dataAyatWantedIndexSurat.add(74);
                    dataAyatWantedIndexNama.add("Q.S Al Muddatstsir 74:38");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(93);
                    dataAyatWantedIndexSurat.add(16);
                    dataAyatWantedIndexNama.add("Q.S An Nahl 16:93");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 30){

                    dataAyatWantedIndexAyat.add(134);
                    dataAyatWantedIndexSurat.add(2);
                    dataAyatWantedIndexNama.add("Q.S Al Baqorooh 2:134");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(141);
                    dataAyatWantedIndexSurat.add(2);
                    dataAyatWantedIndexNama.add("Q.S Al Baqorooh 2:141");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(141);
                    dataAyatWantedIndexSurat.add(2);
                    dataAyatWantedIndexNama.add("Q.S Al An'aam 6:52");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 31){

                    dataAyatWantedIndexAyat.add(28);
                    dataAyatWantedIndexSurat.add(4);
                    dataAyatWantedIndexNama.add("Q.S An Nisaa' 4:28");
                    dataAyatWantedIndexKeterangan.add("Maksudnya keringan dalam syari'at agama");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 32){

                    dataAyatWantedIndexAyat.add(72);
                    dataAyatWantedIndexSurat.add(33);
                    dataAyatWantedIndexNama.add("Q.S Al Ahzab 33:72");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 33){

                    dataAyatWantedIndexAyat.add(49);
                    dataAyatWantedIndexSurat.add(39);
                    dataAyatWantedIndexNama.add("Q.S Az Zumar 39:49");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 34){

                    dataAyatWantedIndexAyat.add(67);
                    dataAyatWantedIndexSurat.add(17);
                    dataAyatWantedIndexNama.add("Q.S Al Isroo' 17:67");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 35){

                    dataAyatWantedIndexAyat.add(34);
                    dataAyatWantedIndexSurat.add(14);
                    dataAyatWantedIndexNama.add("Q.S Abrohim 14:34");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 36){

                    dataAyatWantedIndexAyat.add(100);
                    dataAyatWantedIndexSurat.add(17);
                    dataAyatWantedIndexNama.add("Q.S Al Isroo' 17:100");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 37){

                    dataAyatWantedIndexAyat.add(118);
                    dataAyatWantedIndexSurat.add(11);
                    dataAyatWantedIndexNama.add("Q.S Huud 11:118");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(119);
                    dataAyatWantedIndexSurat.add(11);
                    dataAyatWantedIndexNama.add("Q.S Huud 11:119");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 38){

                    dataAyatWantedIndexAyat.add(4);
                    dataAyatWantedIndexSurat.add(16);
                    dataAyatWantedIndexNama.add("Q.S An Nahl 16:4");
                    dataAyatWantedIndexKeterangan.add("Pembantah yang dimaksud dalam ayat tersebut ialah orang-orang kafir yang tidak menyadari asal kejadiannya");

                    dataAyatWantedIndexAyat.add(54);
                    dataAyatWantedIndexSurat.add(18);
                    dataAyatWantedIndexNama.add("Q.S Al Kahfi 18:54");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 39){

                    dataAyatWantedIndexAyat.add(77);
                    dataAyatWantedIndexSurat.add(36);
                    dataAyatWantedIndexNama.add("Q.S Yaa Sin 36:77");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 40){

                    dataAyatWantedIndexAyat.add(11);
                    dataAyatWantedIndexSurat.add(17);
                    dataAyatWantedIndexNama.add("Q.S Al Isroo' 17:11");
                    dataAyatWantedIndexKeterangan.add("Apabila menginginkan kebaikan, manusia berharap segera terwujud, sebaliknya jika menghadapi kesusahan dia tidak sabar, kcuali orang-orang mu'min");


                    dataAyatWantedIndexAyat.add(37);
                    dataAyatWantedIndexSurat.add(21);
                    dataAyatWantedIndexNama.add("Q.S Al Ambiyaa' 21:37");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 41){

                    dataAyatWantedIndexAyat.add(96);
                    dataAyatWantedIndexSurat.add(2);
                    dataAyatWantedIndexNama.add("Q.S Al Baqorooh 2:96");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 42){

                    dataAyatWantedIndexAyat.add(5);
                    dataAyatWantedIndexSurat.add(75);
                    dataAyatWantedIndexNama.add("Q.S Al Qiyaamah 75:5");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(205);
                    dataAyatWantedIndexSurat.add(2);
                    dataAyatWantedIndexNama.add("Q.S Al Baqorooh 2:205");
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


}