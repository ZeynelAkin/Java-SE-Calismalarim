package com;

public class _21_BreakLabel {
    public static void main(String[] args) {
        boolean durum=true;
        setiket1:
        {
            etiket2:
            {
                etiket3:
                {
                    System.out.println("Break Öncesi");
                    if (durum) {
                        break etiket2;
                    }System.out.println("Break Sonrası");

                }
                System.out.println("Etiket3 Sonrası");
            }
            System.out.println("Etiket2 Sonrası");
        }

        etiket:
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <4 ; j++) {
                System.out.println("i= "+i+" J= "+j);
                if (i ==2) {
                    break etiket;
                }
            }
        }


        int[][]tamSayiDizisi={
                {32,87,123,589},
                {12,1706,2000,8},
                {622,127,77,955}
        };
        int arananSayi=12;
        int i = 0;
        int j = 0;
        boolean durum1=false;
        etiketeGit:
        for (i=0; i < tamSayiDizisi.length; i++) {
            for (j = 0; j < tamSayiDizisi.length; j++) {
                if (tamSayiDizisi[i][j] == arananSayi) {
                    durum1=true;
                    break etiketeGit;
                }
            }
        }
        if (durum1) {
            System.out.println("Aranan Sayi= "+arananSayi+"  "+i+" . Satır "+j+" . Sütun");
        }else
            System.out.println("Sayı Bulunamadı");



    }
}
