package com.zeynel1_overriding_ezme_1;

public class Balik {

    private int yumurtlamaMevsimi;
    private double omur;
    private boolean gocDurumu;
    private String rengi;


    public Balik() {
    }

    public Balik(int yumurtlamaMevsimi, double omur, boolean gocDurumu, String rengi) {
        this.yumurtlamaMevsimi = yumurtlamaMevsimi;
        this.omur = omur;
        this.gocDurumu = gocDurumu;
        this.rengi = rengi;
    }

    public int getYumurtlamaMevsimi() {
        return yumurtlamaMevsimi;
    }

    public void setYumurtlamaMevsimi(int yumurtlamaMevsimi) {
        this.yumurtlamaMevsimi = yumurtlamaMevsimi;
    }

    public double getOmur() {
        return omur;
    }

    public void setOmur(double omur) {
        this.omur = omur;
    }

    public boolean isGocDurumu() {
        return gocDurumu;
    }

    public void setGocDurumu(boolean gocDurumu) {
        this.gocDurumu = gocDurumu;
    }

    public String getRengi() {
        return rengi;
    }

    public void setRengi(String rengi) {
        this.rengi = rengi;
    }

    protected String balikBilgisiniVer()
    {   String gocDurumBilgisi = "",mevsim = "";

        if (this.gocDurumu == false) {
            gocDurumBilgisi="Göçmez";
        } else {
            gocDurumBilgisi="Ferhat Göçer";
        }

        switch (this.yumurtlamaMevsimi)
        {
            case 1:
                mevsim="İlkbahar";
                break;
            case 2:
                mevsim="Yaz";
                break;
            case 3:
                mevsim="sonbahar";
             break;
            case 4:
                mevsim="Kış";
                break;
            default:
                mevsim="ilkbahar";
                break;
        }
        String sonuc="Göç Durumu = "+gocDurumBilgisi+" Rengi = "+this.rengi+" Omru = "+this.omur+" Yumurtlama Mevsimi = "+mevsim;
        return sonuc;
    }
    public static void main(String[] args) {

    }
}
