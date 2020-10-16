package com.zeynel_constructor_overloadig;

public class Oda {
    double en;
    double boy;
    double yukseklik;

    public Oda() {
        this.yukseklik=1;
        this.en=1;
        this.boy=1;
    }

    public Oda(double en) {
        this.en = en;
    }

    public Oda(double en, double boy) {
        this.en = en;
        this.boy = boy;
    }

    public Oda(double en, double boy, double yukseklik) {
        this.en = en;
        this.boy = boy;
        this.yukseklik = yukseklik;
    }
    double hacimHesapla()
    {
        return this.boy*this.en*this.yukseklik;
    }
    double hacimHesapla(double en,double boy,double yukseklik)
    {return en*boy*yukseklik;}
}
