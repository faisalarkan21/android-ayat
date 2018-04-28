package com.example.faisal.ayat_syafiq;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;

public class MenuAyat extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private SQLiteDatabase db;
    private TextView textAyat, textArti;
    private String keteranganCheck;
    int jumlahSurat;
    static EntityQuran ayatJadi;
    Toolbar mActionBarToolbar;
    ArrayList<String> listNamaArray, listAyatArray, listSuratArray, listKeterangan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // actionbar
//        getSupportActionBar().setTitle(getIntent().getStringExtra("title"));
//        Drawable d =getResources().getDrawable(R.drawable.bgheader);
//
//        getSupportActionBar().setBackgroundDrawable(d);

        EntityQuran entity = new EntityQuran();
        LinearLayout layout = (LinearLayout) findViewById(R.id.layoutAyat);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        DAOQuran databaseAccess = DAOQuran.getInstance(this);
        databaseAccess.open();

        listAyatArray = getIntent().getStringArrayListExtra("listAyat");
        listSuratArray = getIntent().getStringArrayListExtra("listSurat");
        listNamaArray = getIntent().getStringArrayListExtra("listNama");
        listKeterangan = getIntent().getStringArrayListExtra("listKetangan");

        ayatJadi = databaseAccess.getDataQuranByAyatTest(listAyatArray, listSuratArray);
        databaseAccess.close();


        List<TextView> textListNama = new ArrayList<TextView>(listSuratArray.size());
        List<TextView> textListAyat = new ArrayList<TextView>(listSuratArray.size());
        List<TextView> textListArti = new ArrayList<TextView>(listSuratArray.size());
        List<TextView> textListKeterangan = new ArrayList<TextView>(listSuratArray.size());
        List<TextView> textListLabelArti = new ArrayList<TextView>(listSuratArray.size());
        List<TextView> textListLabelKeterangan = new ArrayList<TextView>(listSuratArray.size());

        List<TextView> textListLines = new ArrayList<TextView>(listSuratArray.size());
        List<ImageView> imgList = new ArrayList<ImageView>(listSuratArray.size());

        for (int i = 0; i < ayatJadi.getListAyat().size(); i++) {



            /*
                Nama Surat
             */

            TextView newNama = new TextView(MenuAyat.this);
//            newNama.setBackgroundResource(R.drawable.bgheader);
            newNama.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#b50909")));
            newNama.setText(listNamaArray.get(i).toString());
            newNama.setPadding(50, 50, 20, 20);
            newNama.setTextColor(Color.parseColor("#FFFFFF"));
            newNama.setTextSize(17);



            /*
                Text Ayat Arab
             */

            TextView newAyat = new TextView(MenuAyat.this);
            newAyat.setText(ayatJadi.getListAyat().get(i).toString());
            newAyat.setTextColor(Color.parseColor("#000000"));
            newAyat.setPadding(20, 60, 50, 20);
            newAyat.setLineSpacing(0, 1.6f);
            newAyat.setTextSize(20);

             /*
                Text Ayat Arti
             */

            // untuk label Ayat Arti
            TextView newArtiLabel = new TextView(MenuAyat.this);
            newArtiLabel.setText("Artinya : ");
            newArtiLabel.setPadding(50, 60, 20, 0);
            newArtiLabel.setTextColor(Color.parseColor("#000000"));
            newArtiLabel.setLineSpacing(0, 1.5f);
            newArtiLabel.setTextSize(13);

            // untuk isi ayat arti
            TextView newArti = new TextView(MenuAyat.this);
            newArti.setText(ayatJadi.getListArti().get(i).toString().replace("&quot;", ""));
            newArti.setPadding(50, 20, 20, 20);
            newArti.setTextColor(Color.parseColor("#000000"));
            newArti.setLineSpacing(0, 1.5f);
            newArti.setTextSize(15);

            /*
                Text Ayat Keterangan
             */


            // untuk label keterangan
            TextView newKeteranganLabel = new TextView(MenuAyat.this);

            // test jika keterangan berisi null with .isEmpty()

            if (listKeterangan.get(i).toString().isEmpty()) {
                newKeteranganLabel.setText("");
            } else {
                newKeteranganLabel.setText("Keterangan : ");
            }
            newKeteranganLabel.setPadding(50, 30, 20, 0);
            newKeteranganLabel.setTextColor(Color.parseColor("#000000"));
            newKeteranganLabel.setLineSpacing(0, 1.5f);
            newKeteranganLabel.setTextSize(13);

            // untuk isi keterangan
            TextView newKeterangan = new TextView(MenuAyat.this);
            newKeterangan.setText(listKeterangan.get(i).toString().replace("&quot;", ""));
            newKeterangan.setPadding(50, 20, 20, 80);
            newKeterangan.setTextColor(Color.parseColor("#000000"));
            newKeteranganLabel.setLineSpacing(0, 1.7f);
            newKeterangan.setTextSize(14);

            // Tambah nama
            textListNama.add(newNama);
            layout.addView(newNama);


            // Tambah Ayat
            layout.addView(newAyat);
            textListAyat.add(newAyat);

            layout.addView(newArtiLabel);
            textListLabelArti.add(newArtiLabel);

            // Tambah Arti
            layout.addView(newArti);
            textListArti.add(newArti);


            layout.addView(newKeteranganLabel);
            textListLabelKeterangan.add(newKeteranganLabel);

            // Tambah Keterangan
            layout.addView(newKeterangan);
            textListKeterangan.add(newKeterangan);


        }
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
            startActivity(new Intent(MenuAyat.this, MenuSubBab3.class));
            // Handle the camera action
        } else if (id == R.id.nav_info) {

            startActivity(new Intent(MenuAyat.this, AboutActivity.class));

        } else if (id == R.id.nav_exit) {


            finishAffinity();
            System.exit(0);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
