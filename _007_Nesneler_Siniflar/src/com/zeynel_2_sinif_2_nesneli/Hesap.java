package com.zeynel_2_sinif_2_nesneli;

import com.zeynel_2_sinif_1_nesne.Ev;

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

        Ev evNesnesi2;//Bellekte yer yok .Değişken gibi
        evNesnesi2=new Ev();

        evNesnesi2.yukseklik=5;
        evNesnesi2.boy=13;
        evNesnesi2.en=44;
        System.out.println("En2= "+ evNesnesi2.en);
        System.out.println("Boy2= "+ evNesnesi2.boy);
        System.out.println("Yükseklik2= "+ evNesnesi2.yukseklik);
        double hacim1= evNesnesi2.boy* evNesnesi2.en* evNesnesi2.yukseklik;
        System.out.println("Evin2 hacmi= "+hacim1);

    }

}
