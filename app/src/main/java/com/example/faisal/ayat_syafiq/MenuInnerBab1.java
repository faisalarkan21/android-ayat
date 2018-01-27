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



public class MenuInnerBab1 extends Activity implements BackPressedListener {

    private ListView mainListView ;
    private ArrayAdapter<String> listAdapter ;

    List dataAyatWantedIndexAyat = new ArrayList();
    List dataAyatWantedIndexSurat = new ArrayList();
    List dataAyatWantedIndexNama = new ArrayList();
    List dataAyatWantedIndexKeterangan = new ArrayList();
    List titleSubBab = new ArrayList();
    EntityQuran entity = new EntityQuran();

    String[] ListSub1 = new String[] { "Allah itu Qidam",
            "Allah itu Hayyan", "Allah pemilik keagungan dan Kemulyaan",
            "Allah itu Qiamuhu Binafsihi (Beridiri Sendiri)",
            "Allah Maha Besar dan Maha Tinggi", "Allah berbeda dengan segala sesuatu"
            , "Allah Itu Wahdaniyat(Maha Esa)", "Tamsil Tentang Keesaan Allah"
            , "Perintah Bersaksi Tentang Keesaan Allah", "Yang Tak Beriman(kafir) Keesaan Allah", "Kekafiran Tidak Rugikan Allah SWT", "Allah Bukan Bagian dari Trinitas", "Allah Juga bukan Al-Masih Putra Maryam"
            ,"Allah Tiidak Beristri dan Tidak Beranak","Allah Tidak Beranak dan Di Peranakan", "Allah Melaknat Orang yang Mengatakan Al Masih Putra Maryam dan Uzair Anak Allah"
            ,"Larangan Mempersukutukan Allah","Kecelakaan Besar Bagi yang Menyekutukan-Nya", "Allah itu Muridan(Maha Berkehendak)"
            ,"Allah SWT Maha Pencipta dan Pembentuk", "Cara Allah SWT Menciptkan Segala Urusan", "Semua Ciptaan-Nya Seimbang", "Ciptaan Allah SWT Sempurna dan Diberi Petunjuk",
            "Allah Yang Menghidupkan dan Yang Mematikan", "Allah SWT Menghidupkan Yang Mati", "Allah SWT Maha Kaya", "Allah Maha Kaya lagi Maha Terpuji",
            "Allah SWT Maha Pengasih dan Maha Penyayang", "Allah SWWT Utamakan Kasih Sayang", "Allah SWT Maha Baik dan Penyayang", "Allah SWT Memiliki Karunia Yang Besar"
            ,"Allah SWT Pemberi Rejki", "Allah SWT Pemberi Kekayaan dan Kecukupan", "Pemberian Allah Amat Luas", "Allah SWT Pemberi Petunjuk", "Allah Pemberi Cahaya","Allah SWT Meninggikan Derajat Hambanya", "Allah SWT Sebaik-baik Penjaga", "Allah SWT Maha Pemelihara", "Cukuplah Allah SWT sebagai Pemelihara"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_inner_sub);

        titleSubBab.add("Sifat - Sifat Allah");
        titleSubBab.add("Allah Maha Esa & Tidak Bersekutu");
        titleSubBab.add("Allah Maha Berkehendak dan Maha Pencipta");
        titleSubBab.add("Allah Maha Kaya, Pengasih, dan Penyayang");

        mainListView = (ListView) findViewById( R.id.list );
        listAdapter = new ArrayAdapter<String>(this, R.layout.list_inner_sub, ListSub1);

        mainListView.setAdapter(listAdapter);


        mainListView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position, long arg3)
            {

                Intent intent = new Intent(MenuInnerBab1.this, MenuAyat.class);
                if (position == 0){

                    dataAyatWantedIndexAyat.add(3);
                    dataAyatWantedIndexSurat.add(57);
                    dataAyatWantedIndexNama.add("Al-Hadiid 57:3");
                    dataAyatWantedIndexKeterangan.add("Ini keterangan haddid");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);



                } else if (position == 1){

                    dataAyatWantedIndexAyat.add(111);
                    dataAyatWantedIndexSurat.add(20);
                    dataAyatWantedIndexNama.add("Thoohaa 20:111");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(58);
                    dataAyatWantedIndexSurat.add(25);
                    dataAyatWantedIndexNama.add("Al-Furqoon 58:25");
                    dataAyatWantedIndexKeterangan.add("duaasasas");

                    dataAyatWantedIndexAyat.add(65);
                    dataAyatWantedIndexSurat.add(40);
                    dataAyatWantedIndexNama.add("Al-Mu'min 40:65");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }
                else if (position == 2){

                    dataAyatWantedIndexAyat.add(23);
                    dataAyatWantedIndexSurat.add(59);
                    dataAyatWantedIndexNama.add("Hasyr 59:23");
                    dataAyatWantedIndexKeterangan.add("Ini keterangan Hasyr");

                    dataAyatWantedIndexAyat.add(27);
                    dataAyatWantedIndexSurat.add(55);
                    dataAyatWantedIndexNama.add("Ar-Rochmaan 58:25");
                    dataAyatWantedIndexKeterangan.add("Ini keterangan Hasyr");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 3){

                    dataAyatWantedIndexAyat.add(255);
                    dataAyatWantedIndexSurat.add(2);
                    dataAyatWantedIndexNama.add("Al-Baqaroh 2:255");
                    dataAyatWantedIndexKeterangan.add("Yang dimaksudkan senantiasa berdiri adalah tidak memerlukan yang lain, tetapi di butuhkan selain-Nya");

                    dataAyatWantedIndexAyat.add(2);
                    dataAyatWantedIndexSurat.add(3);
                    dataAyatWantedIndexNama.add("Ali Imron 3:2");
                    dataAyatWantedIndexKeterangan.add("Ini keterangan Hasyr");



                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 4){

                    dataAyatWantedIndexAyat.add(9);
                    dataAyatWantedIndexSurat.add(13);
                    dataAyatWantedIndexNama.add("Ar Ro'd 13:9");
                    dataAyatWantedIndexKeterangan.add("Ini keterangan Hasyr");


                    dataAyatWantedIndexAyat.add(62);
                    dataAyatWantedIndexSurat.add(22);
                    dataAyatWantedIndexNama.add("Al-Hajj 22:62");
                    dataAyatWantedIndexKeterangan.add("Ini keterangan Hasyr");

                    dataAyatWantedIndexAyat.add(30);
                    dataAyatWantedIndexSurat.add(31);
                    dataAyatWantedIndexNama.add("Al-Luqman 31:30");
                    dataAyatWantedIndexKeterangan.add("Ini keterangan Hasyr");


                    dataAyatWantedIndexAyat.add(23);
                    dataAyatWantedIndexSurat.add(34);
                    dataAyatWantedIndexNama.add("Saba 34:23");
                    dataAyatWantedIndexKeterangan.add("Ini keterangan Al-Hajj");

                    dataAyatWantedIndexAyat.add(74);
                    dataAyatWantedIndexSurat.add(56);
                    dataAyatWantedIndexNama.add("Luqman 56:74");
                    dataAyatWantedIndexKeterangan.add("Ini keterangan Al-Hajj");








                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());
                    startActivity(intent);

                }else if (position == 5){

                    dataAyatWantedIndexAyat.add(11);
                    dataAyatWantedIndexSurat.add(42);
                    dataAyatWantedIndexNama.add("Asy Syuroo 42:11");
                    dataAyatWantedIndexKeterangan.add("Ini keterangan Hasyr");



                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());
                    startActivity(intent);

                }else if (position == 6){

                    dataAyatWantedIndexAyat.add(163);
                    dataAyatWantedIndexSurat.add(2);
                    dataAyatWantedIndexNama.add("Q.S Al Baqaroh 2:163");
                    dataAyatWantedIndexKeterangan.add("Ini keterangan");

                    dataAyatWantedIndexAyat.add(51);
                    dataAyatWantedIndexSurat.add(16);
                    dataAyatWantedIndexNama.add("Q.S An Nahl 16:51");
                    dataAyatWantedIndexKeterangan.add("Ini keterangan");

                    dataAyatWantedIndexAyat.add(65);
                    dataAyatWantedIndexSurat.add(38);
                    dataAyatWantedIndexNama.add("Q.S Shood 38:65");
                    dataAyatWantedIndexKeterangan.add("Ini keterangan");



                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(1).toString());
                    startActivity(intent);

                }else if (position == 7){

                    dataAyatWantedIndexAyat.add(28);
                    dataAyatWantedIndexSurat.add(30);
                    dataAyatWantedIndexNama.add("Q.S Ar Ruum 30:28");
                    dataAyatWantedIndexKeterangan.add("Ini keterangan");


                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(1).toString());
                    startActivity(intent);

                }else if (position == 8){

                    dataAyatWantedIndexAyat.add(19);
                    dataAyatWantedIndexSurat.add(6);
                    dataAyatWantedIndexNama.add("Q.S Al-An'aam 6:19");
                    dataAyatWantedIndexKeterangan.add("Ini keterangan");


                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(1).toString());
                    startActivity(intent);

                }else if (position == 9){

                    dataAyatWantedIndexAyat.add(22);
                    dataAyatWantedIndexSurat.add(16);
                    dataAyatWantedIndexNama.add("Q.S An Nahl 16:22");
                    dataAyatWantedIndexKeterangan.add("Ini keterangan");


                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(1).toString());
                    startActivity(intent);

                }else if (position == 10){

                    dataAyatWantedIndexAyat.add(170);
                    dataAyatWantedIndexSurat.add(4);
                    dataAyatWantedIndexNama.add("Q.S An Nissa 4:170 ");
                    dataAyatWantedIndexKeterangan.add("Ini keterangan");


                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(1).toString());
                    startActivity(intent);

                }else if (position == 11){

                    dataAyatWantedIndexAyat.add(171);
                    dataAyatWantedIndexSurat.add(4);
                    dataAyatWantedIndexNama.add("Q.S An Nissa 4:171 ");
                    dataAyatWantedIndexKeterangan.add("Ini keterangan");

                    dataAyatWantedIndexAyat.add(173);
                    dataAyatWantedIndexSurat.add(5);
                    dataAyatWantedIndexNama.add("Q.S Al Maidah 5:173 ");
                    dataAyatWantedIndexKeterangan.add("Tiga yang dimaksud adalah tritunggal(trinitas), yaitu Tuhan bapak, Tuhan anak, dan Roh Kudus");




                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(1).toString());
                    startActivity(intent);

                }else if (position == 12){

                    dataAyatWantedIndexAyat.add(17);
                    dataAyatWantedIndexSurat.add(5);
                    dataAyatWantedIndexNama.add("Q.S Al Maidah 5:17 ");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(72);
                    dataAyatWantedIndexSurat.add(5);
                    dataAyatWantedIndexNama.add("Q.S Al Maidah 5:72 ");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(116);
                    dataAyatWantedIndexSurat.add(5);
                    dataAyatWantedIndexNama.add("Q.S Al Maidah 5:116 ");
                    dataAyatWantedIndexKeterangan.add("");



                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(1).toString());
                    startActivity(intent);

                }else if (position == 13){

                    dataAyatWantedIndexAyat.add(3);
                    dataAyatWantedIndexSurat.add(72);
                    dataAyatWantedIndexNama.add("Q.S Al Jin 72:3 ");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(101);
                    dataAyatWantedIndexSurat.add(6);
                    dataAyatWantedIndexNama.add("Q.S Al An'aam");
                    dataAyatWantedIndexKeterangan.add("");



                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(1).toString());
                    startActivity(intent);

                }else if (position == 14){

                    dataAyatWantedIndexAyat.add(116);
                    dataAyatWantedIndexSurat.add(2);
                    dataAyatWantedIndexNama.add("Q.S Al Baqaroh 2:116 ");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(10);
                    dataAyatWantedIndexSurat.add(6);
                    dataAyatWantedIndexNama.add("Q.S Al An'aam");
                    dataAyatWantedIndexKeterangan.add("Mereka Menganggapnya sebagai perantara antara dirinya dengan Allah dalam memohon pertolongan dan dalam mencapai keinginan" +
                            "Anggapan ersebut timbul karena kejahilan mereka");

                    dataAyatWantedIndexAyat.add(111);
                    dataAyatWantedIndexSurat.add(17);
                    dataAyatWantedIndexNama.add("Q.S Al Isroo 17:111 ");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(35);
                    dataAyatWantedIndexSurat.add(19);
                    dataAyatWantedIndexNama.add("Q.S Maryam 19:35 ");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(4);
                    dataAyatWantedIndexSurat.add(39);
                    dataAyatWantedIndexNama.add("Q.S Az Zumar 39:4 ");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(3);
                    dataAyatWantedIndexSurat.add(112);
                    dataAyatWantedIndexNama.add("Q.S Al Ikhlas 112:3");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(4);
                    dataAyatWantedIndexSurat.add(112);
                    dataAyatWantedIndexNama.add("Q.S Al Ikhlas 112:4");
                    dataAyatWantedIndexKeterangan.add("");




                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(1).toString());
                    startActivity(intent);

                }else if (position == 15){

                    dataAyatWantedIndexAyat.add(30);
                    dataAyatWantedIndexSurat.add(9);
                    dataAyatWantedIndexNama.add("Q.S At Taubah 9:30 ");
                    dataAyatWantedIndexKeterangan.add("Ini keterangan");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(1).toString());
                    startActivity(intent);

                }else if (position == 16){

                    dataAyatWantedIndexAyat.add(36);
                    dataAyatWantedIndexSurat.add(4);
                    dataAyatWantedIndexNama.add("Q.S An Nisaa 4:36 ");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(51);
                    dataAyatWantedIndexSurat.add(16);
                    dataAyatWantedIndexNama.add("Q.S An Nahl 16:51 ");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(213);
                    dataAyatWantedIndexSurat.add(26);
                    dataAyatWantedIndexNama.add("Q.S Asy Syu'aroo' 26:213 ");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(1).toString());
                    startActivity(intent);

                }else if (position == 17){

                    dataAyatWantedIndexAyat.add(6);
                    dataAyatWantedIndexSurat.add(41);
                    dataAyatWantedIndexNama.add("Q.S Fushshilat 41:6 ");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(1).toString());
                    startActivity(intent);

                }else if (position == 18){

                    dataAyatWantedIndexAyat.add(6);
                    dataAyatWantedIndexSurat.add(41);
                    dataAyatWantedIndexNama.add("Q.S Hud 11:107");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(40);
                    dataAyatWantedIndexSurat.add(16);
                    dataAyatWantedIndexNama.add("Q.S Hud 16:40");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(2).toString());
                    startActivity(intent);

                }else if (position == 19){

                    dataAyatWantedIndexAyat.add(86);
                    dataAyatWantedIndexSurat.add(15);
                    dataAyatWantedIndexNama.add("Q.S Al Hijr 15:86");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(81);
                    dataAyatWantedIndexSurat.add(36);
                    dataAyatWantedIndexNama.add("Q.S Yaa Sin 36:81");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(24);
                    dataAyatWantedIndexSurat.add(59);
                    dataAyatWantedIndexNama.add("Q.S Al Hasyr 59:24");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(2).toString());
                    startActivity(intent);

                }else if (position == 20){

                    dataAyatWantedIndexAyat.add(117);
                    dataAyatWantedIndexSurat.add(2);
                    dataAyatWantedIndexNama.add("Q.S Al Baqoroh 2:117");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(59);
                    dataAyatWantedIndexSurat.add(3);
                    dataAyatWantedIndexNama.add("Q.S Ali Imron 3:59");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(73);
                    dataAyatWantedIndexSurat.add(6);
                    dataAyatWantedIndexNama.add("Q.S Al An'aam 6:73");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(2).toString());
                    startActivity(intent);

                }else if (position == 21){

                    dataAyatWantedIndexAyat.add(3);
                    dataAyatWantedIndexSurat.add(67);
                    dataAyatWantedIndexNama.add("Q.S Al Mulk 67:3");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(2).toString());
                    startActivity(intent);

                }else if (position == 22){

                    dataAyatWantedIndexAyat.add(1);
                    dataAyatWantedIndexSurat.add(87);
                    dataAyatWantedIndexNama.add("Q.S Al A'laa 87:1-3");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(2);
                    dataAyatWantedIndexSurat.add(87);
                    dataAyatWantedIndexNama.add("Q.S Al A'laa 87:1-3");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(3);
                    dataAyatWantedIndexSurat.add(87);
                    dataAyatWantedIndexNama.add("Q.S Al A'laa 87:1-3");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(2).toString());
                    startActivity(intent);

                }else if (position == 23){

                    dataAyatWantedIndexAyat.add(19);
                    dataAyatWantedIndexSurat.add(29);
                    dataAyatWantedIndexNama.add("Q.S Al Ankabut 29:19");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(81);
                    dataAyatWantedIndexSurat.add(36);
                    dataAyatWantedIndexNama.add("Q.S Yaa Sin 36:81");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(2).toString());
                    startActivity(intent);

                }else if (position == 24){

                    dataAyatWantedIndexAyat.add(28);
                    dataAyatWantedIndexSurat.add(2);
                    dataAyatWantedIndexNama.add("Q.S Al Baqoroh 2:28");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(116);
                    dataAyatWantedIndexSurat.add(9);
                    dataAyatWantedIndexNama.add("Q.S At Taubah 9:116");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(56);
                    dataAyatWantedIndexSurat.add(10);
                    dataAyatWantedIndexNama.add("Q.S Yunus 10:56");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(43);
                    dataAyatWantedIndexSurat.add(53);
                    dataAyatWantedIndexNama.add("Q.S AnNajm 53:43");
                    dataAyatWantedIndexKeterangan.add("");
                    dataAyatWantedIndexAyat.add(44);
                    dataAyatWantedIndexSurat.add(53);
                    dataAyatWantedIndexNama.add("Q.S AnNajm 53:44");
                    dataAyatWantedIndexKeterangan.add("");


                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(2).toString());
                    startActivity(intent);

                }else if (position == 25){

                    dataAyatWantedIndexAyat.add(160);
                    dataAyatWantedIndexSurat.add(2);
                    dataAyatWantedIndexNama.add("Q.S Al Baqoroh 2:160");
                    dataAyatWantedIndexKeterangan.add("Bagian Burung yang diletakkan di atas setiap bukit ittu sudah dalam keadaan terpotong, lalu dengan kekuasaan Allah hidup kembali setelah di panggil oleh Nabi Ibrohim as.");


                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(2).toString());
                    startActivity(intent);

                }else if (position == 26){

                    dataAyatWantedIndexAyat.add(133);
                    dataAyatWantedIndexSurat.add(6);
                    dataAyatWantedIndexNama.add("Q.S Al An'aam 6:133");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(6);
                    dataAyatWantedIndexSurat.add(29);
                    dataAyatWantedIndexNama.add("Q.S Al Ankabuut 29:6");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(3).toString());
                    startActivity(intent);

                }else if (position == 27){

                    dataAyatWantedIndexAyat.add(267);
                    dataAyatWantedIndexSurat.add(2);
                    dataAyatWantedIndexNama.add("Q.S Al Baqoroh 2:267");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(131);
                    dataAyatWantedIndexSurat.add(4);
                    dataAyatWantedIndexNama.add("Q.S An Nisaa' 4:131");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(64);
                    dataAyatWantedIndexSurat.add(22);
                    dataAyatWantedIndexNama.add("Q.S Al Hajj 22:64");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(15);
                    dataAyatWantedIndexSurat.add(35);
                    dataAyatWantedIndexNama.add("Q.S Faathir 35:15");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(6);
                    dataAyatWantedIndexSurat.add(60);
                    dataAyatWantedIndexNama.add("Q.S Al Mumtahanah 60:6");
                    dataAyatWantedIndexKeterangan.add("");



                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(3).toString());
                    startActivity(intent);

                }else if (position == 28){

                    dataAyatWantedIndexAyat.add(1);
                    dataAyatWantedIndexSurat.add(1);
                    dataAyatWantedIndexNama.add("Q.S Al Faatihah 1:1");
                    dataAyatWantedIndexKeterangan.add("Berarti kita memulai membaca surat Al Faatihah ini dengan menyebut nama Allah setiap pekerjaan yang baik hendaklah dimulai dengan menyebut asma Allah, Misalnya ketika mulai makan, munum dan lain sebagainya");

                    dataAyatWantedIndexAyat.add(163);
                    dataAyatWantedIndexSurat.add(2);
                    dataAyatWantedIndexNama.add("Q.S Al Baqoroh 2:163");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(3).toString());
                    startActivity(intent);

                }else if (position == 29){

                    dataAyatWantedIndexAyat.add(12);
                    dataAyatWantedIndexSurat.add(6);
                    dataAyatWantedIndexNama.add("Q.S Al An'aam 6:12");
                    dataAyatWantedIndexKeterangan.add("Kasis Sayang Allah mendahului murka-Nya.Maksudnya adalah Allah memberikan kesempatan kepada hamba-hamba-Nya yang berbuat dosa untuk segera bertaubat dan tidak segera mengabzabnya.");

                    dataAyatWantedIndexAyat.add(54);
                    dataAyatWantedIndexSurat.add(6);
                    dataAyatWantedIndexNama.add("Q.S Al An'aam 6:54");
                    dataAyatWantedIndexKeterangan.add("Yang dimaksud rahmat Allah disini adalah kasih sayang Allah kepada makhluk-Nya. Allah mendahulukan kasih sayang-Nya dari Murka-Nya");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(3).toString());
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
