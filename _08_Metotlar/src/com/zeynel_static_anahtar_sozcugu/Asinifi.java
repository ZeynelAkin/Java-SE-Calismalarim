package com.zeynel_static_anahtar_sozcugu;

public class Asinifi {

    static int sayi1=8;//Static bir tipi static bir kapsamda kullanabiliriz
    static int sayi2;

    static void yaz(int i)
    {
        System.out.println("i= "+i);
        System.out.println("sayi1= "+sayi1+" Sayi2= "+sayi2);
    }

    static//Static block program çalıştırılınca yalnızca 1 kere çalışır
    {
        System.out.println("Static block - kapsam içerisi");
        sayi2=5*sayi1;
    }

    public static void main(String[] args) {
        yaz(1453);
    }
}
