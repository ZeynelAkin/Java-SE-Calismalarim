package com;

public class _20_Break {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Değer1= "+i);
            if (i==3)
                break;
        }


        int a=0;
        while (a<20)
        {   a++;
            if (a ==5) {
                System.out.println("Değer= "+a);
                break;
            }

            for (int i = 0; i < 5; i++) {
                for (int j = 1; j <5 ; j++) {
                    System.out.println("Değer 2 = "+i+" Değer3= "+j);
                    if (i == 3) {
                        break;
                    }
                }
            }
            
            int intDizi[]=new int[]{1,2,3,4,5,};
            for (int i = 0; i < intDizi.length; i++) {
                if (intDizi [i]==4) {
                    break;
                }else
                    System.out.println(intDizi[i]);
            }

            int []sayiDizisi={1,2,3,4,5,6,7,8,9};
            int arananSayi=15;
            boolean bulunan=false;
            for (int i = 0; i < sayiDizisi.length; i++) {
                if (sayiDizisi[i] == arananSayi) {
                    bulunan=true;
                    break;
                }
            }
            if (bulunan) {
                System.out.println("Aranan Sayi= "+arananSayi);
            }else
                System.out.println("Aranan Sayı Dizide Yok");


        }
    }
}
