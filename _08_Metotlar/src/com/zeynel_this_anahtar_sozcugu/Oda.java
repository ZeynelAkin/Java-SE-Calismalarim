package com.zeynel_this_anahtar_sozcugu;

public class Oda {
    public double en;
    public double boy;
    public double yukseklik;

    public Oda(){}

    public Oda(double en,double boy,double yukseklik)
    {   this.en=en;//Burada This bu sınıfın nesnesi olduğunu belirtiyor
        this.boy=boy;
        this.yukseklik=yukseklik;
    }
}
