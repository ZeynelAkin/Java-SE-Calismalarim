package com.zeynel_parametre_olarak_nesne_gönderilmesi;

public class Asinifi {
    double sayi1;
    double sayi2;

    public Asinifi() {
        this.sayi1=571;
        this.sayi2=632;
    }

    public Asinifi(double sayi1, double sayi2) {
        this.sayi1 = sayi1;
        this.sayi2 = sayi2;
    }

    boolean nesnelerinKarsilastirilmasi(Asinifi aNesnesiParametre)
    {
        if (aNesnesiParametre.sayi1 == this.sayi1&&aNesnesiParametre.sayi2==this.sayi2) {
         return true;
        }else return false;
    }
}
