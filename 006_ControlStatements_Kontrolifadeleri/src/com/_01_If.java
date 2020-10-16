package com;

public class _01_If {
    public static void main(String[] args) {
        /*
        *
            if(condition)
            * stateman
        *
        * */


        boolean durum=true;

        if (durum ) {
            System.out.println("Durum True");
        }

        int puan=99;
        char harf='-';
        if (puan >=90) {
            harf='A';
            System.out.println("Sonuc= "+harf);
        }

    }
}
