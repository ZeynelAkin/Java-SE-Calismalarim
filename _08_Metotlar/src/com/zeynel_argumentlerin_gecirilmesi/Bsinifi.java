package com.zeynel_argumentlerin_gecirilmesi;

public class Bsinifi {
    public static void main(String[] args) {
        int say1=14,say2=53;
        Asinifi nesne1=new Asinifi();
        System.out.println("Değerler Geçirilmeden Önce= "+say1+" sayi2= "+say2);
        nesne1.degerGonder(say1,say2);
        System.out.println("Değerler gönderildiktensonra = "+say1+" sayi2= "+say2);

        Asinifi nesne2=new Asinifi(say1,say2);
        System.out.println("Nesne Geçirilmeden Önce= "+nesne2.degisken1+" "+ nesne2.degisken2);
        nesne2.nesneGonder(nesne2);
        System.out.println("nesne geçirildikten sonra= "+ nesne2.degisken1+" "+nesne2.degisken2);
    }
}
