package com;

public class _17_For_Ile_TekVeCiftSayilariYazdirma {
    public static void main(String[] args) {
        int limit=50;
        for (int i = 0; i < limit; i++) {
            if (i %2!=0) {
                System.out.print(i+" ");
            }
        }

        System.out.println("\nÇift Sayılar");

        for (int i2 = 0; i2 < limit; i2++) {
            if (i2%2==0) {
                System.out.print(i2+" ");
            }
        }
    }
}
