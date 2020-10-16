package com;

public class _04_IfElseIf {
    public static void main(String[] args) {
        /*int i=0;

        if (i ==0) {
            System.out.println("SIFIR");
        }else
        {
            System.out.println("SIFIR DEĞİL");
        }*/

        int sayi=61;
        char harf='-';
        if (sayi >=90) {
            harf='A';
        }else if (sayi >= 80) {
            harf='B';
        }else if (sayi >=70) {
            harf='C';
        }else if (sayi>=60)
        {
            harf='D';
        }else
        {
            harf='F';
        }
        System.out.println("Sonuc= "+harf);

        int sayi1=571,sayi2=632;
        if (sayi1 >sayi2) {
            System.out.println(sayi+"büyüktür "+sayi2+" küçüktür");
        }else if (sayi1 <sayi2) {
            System.out.println(sayi1+" küçüktür "+sayi2+" büyüktür");
        }else {
            System.out.println("Eşittir");
        }
    }
}
