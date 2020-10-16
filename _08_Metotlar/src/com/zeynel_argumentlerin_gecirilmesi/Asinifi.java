package com.zeynel_argumentlerin_gecirilmesi;

public class Asinifi {
    int degisken1,degisken2;

    public Asinifi() {
    }

    public Asinifi(int degisken1, int degisken2) {
        this.degisken1 = degisken1;
        this.degisken2 = degisken2;
    }
    void degerGonder(int say1,int say2)
    {
        say1-=2;
        say2+=2;
        System.out.println("Metod içindeki Değerler sayi1= "+say1+" Sayi2= "+say2);
    }

    void nesneGonder(Asinifi gelenNesne)
    {
        gelenNesne.degisken1-=5;
        gelenNesne.degisken2+=5;

    }

}
