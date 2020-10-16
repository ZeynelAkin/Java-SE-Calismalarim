package com.zeynel_parametresiz_2_nesneli_metod;

public class Ev {

  static   double en;
   static double boy;
   static double yukseklik;

    void hacimHesapla()
    {
        System.out.println("Metodun içinden yapılan hacim");
        System.out.println(en*yukseklik*boy);
    }

    public static void main(String[] args) {
        Ev evNesnesi=new Ev();
       evNesnesi.boy=4;
        evNesnesi.en=6;
        evNesnesi.yukseklik=20;


        System.out.println("En= "+ evNesnesi.en);
        System.out.println("Boy= "+ evNesnesi.boy);
        System.out.println("Yükseklik= "+ evNesnesi.yukseklik);
        System.out.println("Yükseklik= "+ evNesnesi.yukseklik);
        System.out.println(" Mainden hacim"+(en*yukseklik*boy));
        evNesnesi.hacimHesapla();
        Ev evNesnesi2=new Ev();
       evNesnesi2.boy=40;
        evNesnesi2.en=7;
        evNesnesi2.yukseklik=30;


        System.out.println("En= "+ evNesnesi2.en);
        System.out.println("Boy= "+ evNesnesi2.boy);
        System.out.println("Yükseklik= "+ evNesnesi2.yukseklik);

        System.out.println(" Mainden hacim"+(en*yukseklik*boy));
        evNesnesi2.hacimHesapla();




    }

}
