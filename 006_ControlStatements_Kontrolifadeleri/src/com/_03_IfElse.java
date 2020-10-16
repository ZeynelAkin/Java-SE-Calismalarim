package com;

public class _03_IfElse {
    public static void main(String[] args) {

        int i=0;

        if (i ==0) {
            System.out.println("SIFIR");
        }else
        {
            System.out.println("SIFIR DEĞİL");
        }

        int sayi=61;
        char harf='-';
        if (sayi >=90) {
            harf='A';
        }else
            {
                harf='B';
            }
        System.out.println("Sonuc= "+harf);
    }
}
