package com.zeynel_2_sinif_1_nesne;

public class Hesap {

    public static void main(String[] args) {
        Ev evNesnesi=new Ev();

        evNesnesi.boy=4;
        evNesnesi.en=6;
        evNesnesi.yukseklik=20;

        System.out.println("En= "+ evNesnesi.en);
        System.out.println("Boy= "+ evNesnesi.boy);
        System.out.println("Yükseklik= "+ evNesnesi.yukseklik);

        double hacim= evNesnesi.boy* evNesnesi.en* evNesnesi.yukseklik;
        System.out.println("Evin hacmi= "+hacim);

    }

}
