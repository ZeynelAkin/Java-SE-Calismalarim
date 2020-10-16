package com.zeynel_overloading_metodlar;

public class Bsinif {
    public static void main(String[] args) {
        Asinifi aNesnesi=new Asinifi();
        double sonuc;
        int i=3;
        aNesnesi.deneme();
        aNesnesi.deneme(2);
        aNesnesi.deneme(2,5);
        aNesnesi.deneme(2,5,6);

        sonuc=aNesnesi.deneme(26f);
        System.out.println(sonuc);
        System.out.println(aNesnesi.deneme(4.0));

        Asinifi aNesnesi2=new Asinifi();
        aNesnesi2.deneme();
    }
}
