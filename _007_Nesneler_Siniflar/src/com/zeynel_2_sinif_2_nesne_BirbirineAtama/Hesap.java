package com.zeynel_2_sinif_2_nesne_BirbirineAtama;

import com.zeynel_2_sinif_1_nesne.Ev;

public class Hesap {
    public static void main(String[] args) {
        Ev evNesnesi=new Ev();
        Ev evNesnesi2=evNesnesi;
        double hacim= evNesnesi.boy* evNesnesi.en* evNesnesi.yukseklik;
        System.out.println("Evin hacmi= "+hacim);


        System.out.println("En2= "+ evNesnesi2.en);
        System.out.println("Boy2= "+ evNesnesi2.boy);
        System.out.println("Yükseklik2= "+ evNesnesi2.yukseklik);
        double hacim1= evNesnesi2.boy* evNesnesi2.en* evNesnesi2.yukseklik;
        System.out.println("Evin2 hacmi= "+hacim1);

        System.out.println("Ev Nesnesi 2 Yeni değerler");
        evNesnesi2.boy=40;
        evNesnesi2.en=60;
        evNesnesi2.yukseklik=200;
        Ev evNesnesi3=new Ev();
        System.out.println("Deneme En=  "+evNesnesi3.en);

        System.out.println("En= "+ evNesnesi2.en);
        System.out.println("Boy= "+ evNesnesi2.boy);
        System.out.println("Yükseklik= "+ evNesnesi2.yukseklik);

        double hacim2= evNesnesi2.boy* evNesnesi2.en* evNesnesi2.yukseklik;
        System.out.println("Evin hacmi2= "+hacim2);


        System.out.println("En2= "+ evNesnesi.en);
        System.out.println("Boy2= "+ evNesnesi.boy);
        System.out.println("Yükseklik2= "+ evNesnesi.yukseklik);
        double hacim3= evNesnesi.boy* evNesnesi.en* evNesnesi.yukseklik;
        System.out.println("Evin2 hacmi= "+hacim3);

    }
}
