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



public class MenuInnerBabAlQuran2 extends Activity implements BackPressedListener {

    private ListView mainListView ;
    private ArrayAdapter<String> listAdapter ;

    List dataAyatWantedIndexAyat = new ArrayList();
    List dataAyatWantedIndexSurat = new ArrayList();
    List dataAyatWantedIndexNama = new ArrayList();
    List dataAyatWantedIndexKeterangan = new ArrayList();
    List titleSubBab = new ArrayList();
    EntityQuran entity = new EntityQuran();

    String[] ListSub1 = new String[] {"Al Qur'an Mengeluarkan Manusia dari Kegelapan", "Al Qur'an sebagai Peraturan", "Al Qur'an sebagai Pedoman Hidup", "Al Qur'an sebagai Pembimbing yang Lurus", "Al Qur'an sebagai Peneguh Hati Orang-orang yang Beriman", "Al Qur'an sebagai Penawar dan Rahmat", "Al Qur'an sebagai Petunjuk dan Rahmat", "Al Qur'an sebagai Pelajaran dan Penerangan", "Al Qur'an sebagai Peringatan", "Yang Inginkan Kebaikan Memerhatikan Peringatan Al Qur'an"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_inner_sub);

        titleSubBab.add("Fungsi Al Qur'an");


        mainListView = (ListView) findViewById( R.id.list );
        listAdapter = new ArrayAdapter<String>(this, R.layout.list_inner_sub, ListSub1);

        mainListView.setAdapter(listAdapter);


        mainListView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position, long arg3)
            {

                Intent intent = new Intent(MenuInnerBabAlQuran2.this, MenuAyat.class);
                if (position == 0) {

                    dataAyatWantedIndexAyat.add(1);
                    dataAyatWantedIndexSurat.add(14);
                    dataAyatWantedIndexNama.add("Q.S Ibrohim 14:1");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title", titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 1){

                    dataAyatWantedIndexAyat.add(37);
                    dataAyatWantedIndexSurat.add(13);
                    dataAyatWantedIndexNama.add("Q.S Ar Ro'd 13:37");
                    dataAyatWantedIndexKeterangan.add("Keistimewaan bahasa Arab itu antara lain; sejak zaman dulu kala hingga sekarang, bahasa Arab merupakan bahasa yang hidup, bahasa Arab adalah bahasa yang lengkap dan luas untuk menjelaskan tentang ketuhanan dan keakhiratan, bentuk bentuk kata dalam bahasa Arab memunyai tasrif(konjungsi) yang amat luas hingga dapat mencapai 3000 bentuk perubahan.Yang demikian itu tidak terdapat dalam bahasa lain");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 2){

                    dataAyatWantedIndexAyat.add(155);
                    dataAyatWantedIndexSurat.add(6);
                    dataAyatWantedIndexNama.add("Q.S Al An'aam 6:155");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(20);
                    dataAyatWantedIndexSurat.add(45);
                    dataAyatWantedIndexNama.add("Q.S Al Jatsiyah 45:20");
                    dataAyatWantedIndexKeterangan.add("Al Qur'an dikatakan sebagai pedoman hidup yang sempurna karena berisi ketetapan yang mengatur hubungan antara manusia dengan pencipta-Nya, serta antara manusia dengan sesamanya dan dengan alam sekitarnya. Dengan demikian ayat-ayatnya brupa pelajaran dan penerangan, perintah dan larangan, petunjuk mengenai yang halal dan yang haram, serta antara yang benar dan yang salah. Dengan dmikian Al Qur'an memang pedoman hidup yang lengkap. Itulah sebabnya setiap muslim dianjurkan berpedoman kepada Al Qur'an");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 3){

                    dataAyatWantedIndexAyat.add(2);
                    dataAyatWantedIndexSurat.add(18);
                    dataAyatWantedIndexNama.add("Q.S Al Kahfi 18:1");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(2);
                    dataAyatWantedIndexSurat.add(18);
                    dataAyatWantedIndexNama.add("Q.S Al Kahfi 18:2");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 4){

                    dataAyatWantedIndexAyat.add(102);
                    dataAyatWantedIndexSurat.add(16);
                    dataAyatWantedIndexNama.add("Q.S Al An Nahl 16:102");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 5){

                    dataAyatWantedIndexAyat.add(82);
                    dataAyatWantedIndexSurat.add(17);
                    dataAyatWantedIndexNama.add("Q.S Al Al Isroo' 17:82");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(86);
                    dataAyatWantedIndexSurat.add(28);
                    dataAyatWantedIndexNama.add("Q.S Al Qoshsosh 28:86");
                    dataAyatWantedIndexKeterangan.add("Maksudnya Al Qur'an itu diturunkan bukan karena Nabi Muhammad Saw. mengharap agar diturunkan, melainkan karena rahmat dari Allah");

                    dataAyatWantedIndexAyat.add(51);
                    dataAyatWantedIndexSurat.add(29);
                    dataAyatWantedIndexNama.add("Q.S Al 'Ankabuut 29:51");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 6){

                    dataAyatWantedIndexAyat.add(52);
                    dataAyatWantedIndexSurat.add(7);
                    dataAyatWantedIndexNama.add("Q.S Al A'roof 7:52");
                    dataAyatWantedIndexKeterangan.add("Maksudnya atas dasar pengetahuan Kami tentang apa yang menjadi kemaslahatan bagi hamba-hamba Kami di dunia dan akhirat");

                    dataAyatWantedIndexAyat.add(44);
                    dataAyatWantedIndexSurat.add(16);
                    dataAyatWantedIndexNama.add("Q.S An Nahl 16:44");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(64);
                    dataAyatWantedIndexSurat.add(16);
                    dataAyatWantedIndexNama.add("Q.S An Nahl 16:64 ");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(89);
                    dataAyatWantedIndexSurat.add(16);
                    dataAyatWantedIndexNama.add("Q.S An Nahl 16:89 ");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(77);
                    dataAyatWantedIndexSurat.add(27);
                    dataAyatWantedIndexNama.add("Q.S An Naml 27:77 ");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(2);
                    dataAyatWantedIndexSurat.add(31);
                    dataAyatWantedIndexNama.add("Q.S Luqman 31:2 ");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(3);
                    dataAyatWantedIndexSurat.add(31);
                    dataAyatWantedIndexNama.add("Q.S Luqman 31:3 ");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(4);
                    dataAyatWantedIndexSurat.add(31);
                    dataAyatWantedIndexNama.add("Q.S Luqman 31:4 ");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 7){

                    dataAyatWantedIndexAyat.add(138);
                    dataAyatWantedIndexSurat.add(3);
                    dataAyatWantedIndexNama.add("Q.S Ali Imron 3:138");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(52);
                    dataAyatWantedIndexSurat.add(14);
                    dataAyatWantedIndexNama.add("Q.S Ibrohim 14:52");
                    dataAyatWantedIndexKeterangan.add("Maksudnya Al Qur'an itu diturunkan bukan karena Nabi Muhammad Saw. mengharap agar diturunkan, melainkan karena rahmat dari Allah");

                    dataAyatWantedIndexAyat.add(69);
                    dataAyatWantedIndexSurat.add(36);
                    dataAyatWantedIndexNama.add("Q.S Yaa Siin 36:69");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(48);
                    dataAyatWantedIndexSurat.add(69);
                    dataAyatWantedIndexNama.add("Q.S Al Haaqqoh 69:48");
                    dataAyatWantedIndexKeterangan.add("");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 8){

                    dataAyatWantedIndexAyat.add(2);
                    dataAyatWantedIndexSurat.add(20);
                    dataAyatWantedIndexNama.add("Q.S Thooha 20:2");
                    dataAyatWantedIndexKeterangan.add("");


                    dataAyatWantedIndexAyat.add(3);
                    dataAyatWantedIndexSurat.add(20);
                    dataAyatWantedIndexNama.add("Q.S Thooha 20:3");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(52);
                    dataAyatWantedIndexSurat.add(68);
                    dataAyatWantedIndexNama.add("Q.S Al Qolam 68:52");
                    dataAyatWantedIndexKeterangan.add("Maksudnya Al Qur'an itu diturunkan bukan karena Nabi Muhammad Saw. mengharap agar diturunkan, melainkan karena rahmat dari Allah");

                    intent.putStringArrayListExtra("listSurat", (ArrayList<String>) dataAyatWantedIndexSurat);
                    intent.putStringArrayListExtra("listAyat", (ArrayList<String>) dataAyatWantedIndexAyat);
                    intent.putStringArrayListExtra("listNama", (ArrayList<String>) dataAyatWantedIndexNama);
                    intent.putStringArrayListExtra("listKetangan", (ArrayList<String>) dataAyatWantedIndexKeterangan);
                    intent.putExtra("title",titleSubBab.get(0).toString());

                    startActivity(intent);

                }else if (position == 9){

                    dataAyatWantedIndexAyat.add(29);
                    dataAyatWantedIndexSurat.add(76);
                    dataAyatWantedIndexNama.add("Q.S Al Insaan 76:29");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(27);
                    dataAyatWantedIndexSurat.add(81);
                    dataAyatWantedIndexNama.add("Q.S At Takwiir 81:27");
                    dataAyatWantedIndexKeterangan.add("");

                    dataAyatWantedIndexAyat.add(28);
                    dataAyatWantedIndexSurat.add(81);
                    dataAyatWantedIndexNama.add("Q.S At Takwiir 81:28");
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