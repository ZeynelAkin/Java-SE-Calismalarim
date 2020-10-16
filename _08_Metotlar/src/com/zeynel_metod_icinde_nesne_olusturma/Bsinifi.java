package com.zeynel_metod_icinde_nesne_olusturma;

public class Bsinifi {
    public static void main(String[] args) {
        Asinifi obj1=new Asinifi(5);
        Asinifi obj2;

        obj2=obj1.metodIcindeNesneOlustur();
        System.out.println("obj1 e göre sayi= "+obj1.sayi);
        System.out.println("obj1 e göre sayi= "+obj2.sayi);

        obj2=obj2.metodIcindeNesneOlustur();
        System.out.println("obj2 üzerinden metod çağrılmasından sonra obj2 sayi değeri= "+obj2.sayi);
        System.out.println("obj2 üzerinden metod çağrılmasından sonra obj1 sayi değeri= "+obj1.sayi);
    }
}
