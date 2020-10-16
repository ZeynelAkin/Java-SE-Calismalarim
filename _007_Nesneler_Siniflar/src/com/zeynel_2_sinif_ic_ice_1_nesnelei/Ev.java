package com.zeynel_2_sinif_ic_ice_1_nesnelei;

public class Ev {
    double en;
    double boy;
    double yukseklik;
}


class Hesap
{
    public static void main(String[] args) {
        Ev evNesnesi=new Ev();
        evNesnesi.boy=6;
        evNesnesi.en=4;
        evNesnesi.yukseklik=2;

        System.out.println("En= "+ evNesnesi.en);
        System.out.println("Boy= "+ evNesnesi.boy);
        System.out.println("Yükseklik= "+ evNesnesi.yukseklik);

        double hacim= evNesnesi.boy* evNesnesi.en* evNesnesi.yukseklik;
        System.out.println("Evin hacmi= "+hacim);

    }
}