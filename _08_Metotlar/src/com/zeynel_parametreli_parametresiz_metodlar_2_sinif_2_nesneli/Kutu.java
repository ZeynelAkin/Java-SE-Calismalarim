package com.zeynel_parametreli_parametresiz_metodlar_2_sinif_2_nesneli;

public class Kutu {
   public double en;
   public double boy;
   public double yukseklik;
   public void hacimHesaplaParametresiz()
    {
        System.out.println("Parametresiz geri Dönüş olmadan");
        System.out.println(en*boy*yukseklik);
    }
    public double hacimHesaplaParametresizDonuslu()
    {
        System.out.println("Parametresiz geri dönüşlü");
        return en*boy*yukseklik;
    }
    public double hacimHesapParametreli(double en,double boy,double yukseklik)
    {
        System.out.println("Parametreli Hascim Hesap");
        System.out.println(en*boy*yukseklik);
        return en*boy*yukseklik;
    }
}
