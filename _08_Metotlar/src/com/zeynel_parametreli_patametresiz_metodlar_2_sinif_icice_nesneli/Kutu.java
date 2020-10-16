package com.zeynel_parametreli_patametresiz_metodlar_2_sinif_icice_nesneli;

public class Kutu {
    double en;
    double boy;
    double yukseklik;
    void hacimHesaplaParametresiz()
    {
        System.out.println("Parametresiz geri Dönüş olmadan");
        System.out.println(en*boy*yukseklik);
    }
    double hacimHesaplaParametresizDonuslu()
    {
        System.out.println("Parametresiz geri dönüşlü");
        return en*boy*yukseklik;
    }
    double hacimHesapParametreli(double en,double boy,double yukseklik)
    {
        System.out.println("Parametreli Hascim Hesap");
        System.out.println(en*boy*yukseklik);
        return en*boy*yukseklik;
    }
}
    class Hesap
    {
        public static void main(String[] args) {
            double hacim;
            Kutu kutuNesnesi=new Kutu();
            Kutu kutuNesnesi2=new Kutu();

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


