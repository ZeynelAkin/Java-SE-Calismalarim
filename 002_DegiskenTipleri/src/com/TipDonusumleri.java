package com;

public class TipDonusumleri {

    public static void main(String[] args) {

        byte sayi1;
        int sayi2=1453;
        float sayi3=15.17f;
        double sayi4=192.2;

        sayi1= (byte) sayi2;
        System.out.println("int verisi byte tipinde"+sayi1);

        sayi1= (byte) sayi3;
        System.out.println("float verisi byte tipinde"+sayi1);
        sayi1= (byte) sayi4;
        System.out.println("double verisi byte tipinde"+sayi1);

        sayi4=sayi2;
        System.out.println("double veri int tipinde "+sayi4);
        sayi4=sayi3;
        System.out.println("double veri float tipinde "+sayi4);

    }

}
