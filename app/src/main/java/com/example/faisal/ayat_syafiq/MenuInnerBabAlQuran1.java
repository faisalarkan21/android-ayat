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



public class MenuInnerBabAlQuran1 extends Activity implements BackPressedListener {

    private ListView mainListView ;
    private ArrayAdapter<String> listAdapter ;

    List dataAyatWantedIndexAyat = new ArrayList();
    List dataAyatWantedIndexSurat = new ArrayList();
    List dataAyatWantedIndexNama = new ArrayList();
    List dataAyatWantedIndexKeterangan = new ArrayList();
    List titleSubBab = new ArrayList();
    EntityQuran entity = new EntityQuran();

    String[] ListSub1 = new String[] {"Al Qur'an Berasal dari Allah SWT", "Ahli Kitab Mengetahui Al Qur'an dari Allah SWT", "Al Qur'an Disebutkan Dalam Kitab Kitab Terdahulu", "Al Qur'an Dipelihara Allah SWT", "Al Qur'an Bernilai Tinggi", "Dalam Al Qur'an Tidak Ada Kebengkokan", "Dalam Al Qur'an Tidak Ada Pertentangan", "Al Qur'an Bukan Senda Gurau", "Larangan Meragukan Al Qur'an", "Ahli Kitab Akui Kebenaran Al Qur'an"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_inner_sub);

        titleSubBab.add("Kenapa Al Qur'an?");


        mainListView = (ListView) findViewById( R.id.list );
        listAdapter = new ArrayAdapter<String>(this, R.layout.list_inner_sub, ListSub1);

        mainListView.setAdapter(listAdapter);


        mainListView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position, long arg3)
            {

                Intent intent = new Intent(MenuInnerBabAlQuran1.this, MenuAyat.class);
                if (position == 0) {

                    dataAyatWantedIndexAyat.add(203);
                    dataAyatWantedIndexSurat.add(7);
                    dataAyatWantedIndexNama.add("Q.S Al A'roof 7:203");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(19);
                    dataAyatWantedIndexSurat.add(81);
                    dataAyatWantedIndexNama.add("Q.S At Takwiir 81:19");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 1){

                    dataAyatWantedIndexAyat.add(144);
                    dataAyatWantedIndexSurat.add(6);
                    dataAyatWantedIndexNama.add("Q.S Al An'aam 6:144");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 2){

                    dataAyatWantedIndexAyat.add(196);
                    dataAyatWantedIndexSurat.add(26);
                    dataAyatWantedIndexNama.add("Q.S Al Asy Syu'aroo' 26:196");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(197);
                    dataAyatWantedIndexSurat.add(26);
                    dataAyatWantedIndexNama.add("Q.S Al Asy Syu'aroo' 26:197");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 3){

                    dataAyatWantedIndexAyat.add(9);
                    dataAyatWantedIndexSurat.add(15);
                    dataAyatWantedIndexNama.add("Q.S Al Al Hijr 15:9");
                    dataAyatWantedIndexKeterangan.add("Ayat inilah yang memberi jaminan tentang kesucian dan kemurnian Al Qur'an sepanjang masa. Dan memang sudah terbukti beberapa kali usaha memalsukan ayat-ayat AlQur'an selalu dapat di gagalkan oleh kaum muslim");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 4){

                    dataAyatWantedIndexAyat.add(4);
                    dataAyatWantedIndexSurat.add(43);
                    dataAyatWantedIndexNama.add("Q.S Al Az Zukhruf 43:4");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 5){

                    dataAyatWantedIndexAyat.add(28);
                    dataAyatWantedIndexSurat.add(39);
                    dataAyatWantedIndexNama.add("Q.S Al Az Zumar 39:28");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 6){

                    dataAyatWantedIndexAyat.add(196);
                    dataAyatWantedIndexSurat.add(26);
                    dataAyatWantedIndexNama.add("Q.S Al An Nisaa'");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 7){

                    dataAyatWantedIndexAyat.add(13);
                    dataAyatWantedIndexSurat.add(86);
                    dataAyatWantedIndexNama.add("Q.S Al Ath Thooriq 86:13");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(14);
                    dataAyatWantedIndexSurat.add(86);
                    dataAyatWantedIndexNama.add("Q.S Ath Thooriq 86:14");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 8){

                    dataAyatWantedIndexAyat.add(14);
                    dataAyatWantedIndexSurat.add(86);
                    dataAyatWantedIndexNama.add("Q.S Al Baqrooh 2:147");
                    dataAyatWantedIndexKeterangan.add("Jangan Terpengaruhi oleh pihak yang mergukanrisalah Muhammad Saw");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 9){

                    dataAyatWantedIndexAyat.add(83);
                    dataAyatWantedIndexSurat.add(5);
                    dataAyatWantedIndexNama.add("Q.S Al Maidah 5:83");
                    dataAyatWantedIndexKeterangan.add("Saksi dalam arti meyakini kebenaran Al Qur'an dan Muhammad");

                    dataAyatWantedIndexAyat.add(6);
                    dataAyatWantedIndexSurat.add(34);
                    dataAyatWantedIndexNama.add("Q.S Saba' 34:6");
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
