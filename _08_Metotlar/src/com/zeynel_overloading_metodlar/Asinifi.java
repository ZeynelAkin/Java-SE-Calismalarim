package com.zeynel_overloading_metodlar;

import static java.lang.Math.pow;

public class Asinifi {
    double sayi1;
    double sayi2;
    double sayi3;

    public Asinifi() {
    }

    public Asinifi(double sayi1, double sayi2, double sayi3) {
        this.sayi1 = sayi1;
        this.sayi2 = sayi2;
        this.sayi3 = sayi3;
    }

    void deneme()
    {
        System.out.println("Parametresiz");
        System.out.println("Sayi1= "+sayi1+" Sayi2= "+sayi2+" Sayi3= "+sayi3);
    }
    void deneme(int sayi1)
    {
        System.out.println("Sayi1= "+sayi1);
    }
    void deneme(int sayi1,int sayi2)
    {
        System.out.println("sayi1 ="+sayi1+" Sayi2= "+sayi2);
    }
    void deneme(int sayi1,int sayi2,int sayi3)
    {
        System.out.println("sayi1 ="+sayi1+" Sayi2= "+sayi2+" Sayi3= "+sayi3);
    }
    double deneme(float sayi1)
    {
        System.out.println("float sayi1= "+sayi1);
        return pow(sayi1,2);
    }double deneme(double sayi1)
    {
        System.out.println("float sayi1= "+sayi1);
        return pow(sayi1,2);
    }

}
