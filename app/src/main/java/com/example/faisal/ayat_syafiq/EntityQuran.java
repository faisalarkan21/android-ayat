package com.example.faisal.ayat_syafiq;

import java.util.List;

/**
 * Created by faisal on 1/19/18.
 */

public class EntityQuran {

    private int suraId;
    private int ayaId;
    private String textAyat;
    private String suratArtiId;
    private String ayatArtiId;
    private String textArti;

    private List listSurat;
    private List listAyat;
    private List listArti;
    private List listNamaSurat;



    public int getSuraId() {
        return suraId;
    }

    public void setSuraId(int suraId) {
        this.suraId = suraId;
    }

    public int getAyaId() {
        return ayaId;
    }

    public void setAyaId(int ayaId) {
        this.ayaId = ayaId;
    }

    public String getTextAyat() {
        return textAyat;
    }

    public void setTextAyat(String textAyat) {
        this.textAyat = textAyat;
    }

    public String getSuratArtiId() {
        return suratArtiId;
    }

    public void setSuratArtiId(String suratArtiId) {
        this.suratArtiId = suratArtiId;
    }

    public String getAyatArtiId() {
        return ayatArtiId;
    }

    public void setAyatArtiId(String ayatArtiId) {
        this.ayatArtiId = ayatArtiId;
    }

    public String getTextArti() {
        return textArti;
    }

    public void setTextArti(String textArti) {
        this.textArti = textArti;
    }

    public List getListAyat() {
        return listAyat;
    }

    public void setListAyat(List listAyat) {
        this.listAyat = listAyat;
    }

    public List getListArti() {
        return listArti;
    }

    public void setListArti(List listArti) {
        this.listArti = listArti;
    }

    public List getListNamaSurat() {
        return listNamaSurat;
    }

    public void setListNamaSurat(List listNamaSurat) {
        this.listNamaSurat = listNamaSurat;
    }


    public List getListSurat() {
        return listSurat;
    }

    public void setListSurat(List listSurat) {
        this.listSurat = listSurat;
    }
}
