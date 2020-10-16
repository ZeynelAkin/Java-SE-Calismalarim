package com.zeynel_parametresiz_1_nesneli_metod;

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
        Ev evNesnesi2=evNesnesi;//2 Nesne aynı yeri gösteriyor.
        Ev evNesnesi3=new Ev();//Bellekte yeni yere sahip.
        evNesnesi.boy=4;
        evNesnesi.en=6;
        evNesnesi.yukseklik=20;

        System.out.println("Deneme En=  "+evNesnesi3.en);

        System.out.println("En= "+ evNesnesi.en);
        System.out.println("Boy= "+ evNesnesi.boy);
        System.out.println("Yükseklik= "+ evNesnesi.yukseklik);
        evNesnesi.hacimHesapla();

    }

}
