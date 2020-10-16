package com.zeynel_constructor_overloadig;

public class Hesap {
    public static void main(String[] args) {
        Oda odaNesnesi=new Oda();
        Oda odaNesnesi1=new Oda(6);
        Oda odaNesnesi2=new Oda(7,3);
        Oda odaNesnesi3=new Oda(7,8,9);
        System.out.println("Parametresiz= "+odaNesnesi.hacimHesapla());
        System.out.println("1 Parametreli = "+odaNesnesi1.hacimHesapla());
        System.out.println("2 Parametreli = "+odaNesnesi2.hacimHesapla());
        System.out.println("3 Parametreli = "+odaNesnesi3.hacimHesapla());

        double hacim= odaNesnesi1.hacimHesapla(6,3,2);
        System.out.println("parametreli1= "+hacim);
        System.out.println("parametreli2= "+odaNesnesi2.hacimHesapla(14,5,3));
    }
}
