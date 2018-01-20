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



public class MenuInnerSub1 extends Activity implements BackPressedListener {

    private ListView mainListView ;
    private ArrayAdapter<String> listAdapter ;

    List dataAyatWantedIndexAyat = new ArrayList();
    List dataAyatWantedIndexSurat = new ArrayList();
    List dataAyatWantedIndexNama = new ArrayList();
    List dataAyatWantedIndexKeterangan = new ArrayList();
    EntityQuran entity = new EntityQuran();

    String[] ListSub1 = new String[] { "Allah itu Qidam",
            "Allah itu Hayyan", "Allah pemilik keagungan dan Kemulyaan",
            "Allah itu Qiamuhu Binafsihi (Beridiri Sendiri)",
            "Allah Maha Besar dan Maha Tinggi", "Allah berbeda dengan segala sesuatu"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_inner_sub);



        mainListView = (ListView) findViewById( R.id.list );
        listAdapter = new ArrayAdapter<String>(this, R.layout.list_inner_sub, ListSub1);

        mainListView.setAdapter(listAdapter);


        mainListView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position, long arg3)
            {

                Intent intent = new Intent(MenuInnerSub1.this, MenuAyat.class);
                if (position == 0){



                    dataAyatWantedIndexAyat.add("111");
                    dataAyatWantedIndexSurat.add("20");
                    dataAyatWantedIndexNama.add("Al-Hadiid 57:3");
                    dataAyatWantedIndexKeterangan.add("Ini keterangan haddid");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);

                    startActivity(intent);



                } else if (position == 1){



                    dataAyatWantedIndexAyat.add(111);
                    dataAyatWantedIndexSurat.add(20);
                    dataAyatWantedIndexNama.add("Thoohaa 20:111");
                    dataAyatWantedIndexKeterangan.add("Ini keterangan Thoohaa");

                    dataAyatWantedIndexAyat.add(58);
                    dataAyatWantedIndexSurat.add(25);
                    dataAyatWantedIndexNama.add("Al-Furqoon 58:25");
                    dataAyatWantedIndexKeterangan.add("Ini keterangan Furqoon");

                    dataAyatWantedIndexAyat.add(65);
                    dataAyatWantedIndexSurat.add(40);
                    dataAyatWantedIndexNama.add("Al-Mu'min 40:65");
                    dataAyatWantedIndexKeterangan.add("Ini keterangan Mu'min");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);

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
