package com.zeynel_constructor_hazirlayici_metod_2_sinif_2_nesneli;


public class Hesap {
    public static void main(String[] args) {
        double hacim;
        Kutu kutuNesnesi=new Kutu();
        Kutu kutuNesnesi2=new Kutu();
        Kutu kutuNesnesi3=new Kutu(3,4,5);//Parametreli construuctor metoduna değer gönderildi ve kutuNesnesi3 ile kontrol edildi
        kutuNesnesi3.hacimHesaplaParametresiz();
        System.out.println("KKutu nesnesi değerleri");
        kutuNesnesi.en=4;
        kutuNesnesi.boy=8;
        kutuNesnesi.yukseklik=6;

        System.out.println("En ="+kutuNesnesi.en);
        System.out.println("Boy ="+kutuNesnesi.boy);
        System.out.println("Yukseklik ="+kutuNesnesi.yukseklik);

        hacim=kutuNesnesi.en*kutuNesnesi2.boy*kutuNesnesi.yukseklik;
        System.out.println("Kutunun Hacmi = "+hacim);

        kutuNesnesi.hacimHesaplaParametresiz();

        hacim=kutuNesnesi.hacimHesaplaParametresizDonuslu();
        System.out.println("Parametresiz Dönüşlü Hacim= "+hacim);

        hacim=kutuNesnesi.hacimHesapParametreli(11.3,44.3,22.5);
        System.out.println("Parametreli Hacim= "+hacim);

        System.out.println("KKutu nesnesi2 değerleri");
        kutuNesnesi2.en=42;
        kutuNesnesi2.boy=2;
        kutuNesnesi2.yukseklik=4;

        System.out.println("En ="+kutuNesnesi2.en);
        System.out.println("Boy ="+kutuNesnesi2.boy);
        System.out.println("Yukseklik ="+kutuNesnesi2.yukseklik);

        hacim=kutuNesnesi2.en*kutuNesnesi2.boy*kutuNesnesi2.yukseklik;
        System.out.println("Kutunun Hacmi = "+hacim);

        kutuNesnesi2.hacimHesaplaParametresiz();

        hacim=kutuNesnesi2.hacimHesaplaParametresizDonuslu();
        System.out.println("Parametresiz Dönüşlü Hacim= "+hacim);

        hacim=kutuNesnesi2.hacimHesapParametreli(4.3,22.5,5.5);
        System.out.println("Parametreli Hacim= "+hacim);

    }
}
