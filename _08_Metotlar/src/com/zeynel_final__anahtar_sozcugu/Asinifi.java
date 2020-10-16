package com.zeynel_final__anahtar_sozcugu;

public class Asinifi {//Bir sınıf final se kimse miras alamaz
    public static final double sayi1=1.14E3;
    public final double PISAYISI=3.14;
    //public final class//final sınıf miras alınmaz
    //final metod override edilemez

    public static double getSayi1() {//Set metodları verilmedi , final olduğu için
        return sayi1;
    }

    public double getPISAYISI() {
        return PISAYISI;
    }
}
