package com.zeynel2_overloading_asiriyukleme;

public class Hamsi extends Balik {
    private String turu;

    public Hamsi() {
        super();
    }

    public Hamsi(int yumurtlamaMevsimi, double omur, boolean gocDurumu, String rengi) {
        super();
    }

    public Hamsi(String turu) {
        this.turu = turu;
    }

    public Hamsi(int yumurtlamaMevsimi, double omur, boolean gocDurumu, String rengi, String turu) {
        super(yumurtlamaMevsimi, omur, gocDurumu, rengi);
        this.turu = turu;
    }

    protected String balikBilgisiniVer()
    {
        return super.balikBilgisiniVer()+" Türü : "+this.turu+"\n";
    }

    protected String balikBilgisiniVer(int uzunluk,int agırlık)
    {
        return super.balikBilgisiniVer(uzunluk,agırlık)+" Türü : "+this.turu+"\n";
    }
}
