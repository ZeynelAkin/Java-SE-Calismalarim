package com.zeynel4_polimorfizim_teknigi_abstract;

public class Test {
    public static void main(String[] args) {

        Sekil sekilNesneReferansi;


        Dortgen dortgen=new Dortgen(12f,99f);

        Ucgen ucgen=new Ucgen(10,20,30);

        sekilNesneReferansi=dortgen;
        System.out.println(sekilNesneReferansi.alaniHesapla());
        System.out.println(sekilNesneReferansi.alaniHesapla());


        sekilNesneReferansi=ucgen;

        System.out.println(sekilNesneReferansi.alaniHesapla());
        System.out.println(sekilNesneReferansi.alaniHesapla());

    }
}
