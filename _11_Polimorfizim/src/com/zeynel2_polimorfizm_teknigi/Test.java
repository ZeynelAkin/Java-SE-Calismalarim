package com.zeynel2_polimorfizm_teknigi;

public class Test {
    public static void main(String[] args) {

        Sekil sekilNesneReferansi;

        Sekil sekil1=new Sekil(14f,53f);

        Dortgen dortgen=new Dortgen(12f,99f);

        Ucgen ucgen=new Ucgen(10,20,30);

        sekilNesneReferansi=sekil1;

        System.out.println(sekilNesneReferansi.alaniHesapla());
        System.out.println(sekilNesneReferansi.alaniHesapla());


        sekilNesneReferansi=dortgen;
        System.out.println(sekilNesneReferansi.alaniHesapla());
        System.out.println(sekilNesneReferansi.alaniHesapla());


        sekilNesneReferansi=ucgen;

        System.out.println(sekilNesneReferansi.alaniHesapla());
        System.out.println(sekilNesneReferansi.alaniHesapla());

    }
}
