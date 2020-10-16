package com.zeynel_bir_sinif_bir_nesneli;

public class Ev {

    double en;
    double boy;
    double yükseklik;

    public static void main(String[] args) {
        Ev evNesnesi=new Ev();

        evNesnesi.en=6;
        evNesnesi.boy=3;
        evNesnesi.yükseklik=2;

        System.out.println("En   ="+evNesnesi.en);
        System.out.println("Boy   ="+evNesnesi.boy);
        System.out.println("Yükseklik   ="+evNesnesi.yükseklik);

    }

}
