package com;

public class _19_ForEach {
    public static void main(String[] args) {
        int []sayilar={1453,1299,571,632,1923};
        for (int deger:sayilar) {
            System.out.println("Dizinin Elamanları= "+deger);
        }

        int sayi[]={1,4,5,3};
        int toplam=0;
        for (int say :sayi) {
            toplam+=say;
            System.out.println("Toplam= "+toplam);
        }

        int sonuc=0;
        int ciftBoyutluDizi[][]=new int[3][5];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                ciftBoyutluDizi[i][j]=(i+2)*(j+3);
            }
        }
        for (int tekBoyuıtluDizi[] :ciftBoyutluDizi) {
            for (int tbd : tekBoyuıtluDizi){
                System.out.println("Değer= "+tbd);
                sonuc+=tbd;
            }
        }
    }
}
