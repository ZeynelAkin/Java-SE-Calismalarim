package com.zeynel_metod_icinde_nesne_olusturma;

public class Asinifi {

    int sayi;

    public Asinifi() {
    }
    Asinifi(int sayi)
    {
        this.sayi=sayi;
    }
    Asinifi metodIcindeNesneOlustur()
    {
        Asinifi aSinifNesnesi=new Asinifi(this.sayi+10);
        return aSinifNesnesi;
    }
}
