package com;

public class _22_Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            System.out.print(i+" ");
            if (i%3 ==0) {
                continue;
            }System.out.println("");
        }


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if (j ==2) {
                    continue;
                }
                System.out.println("i= "+i+", j= "+j);
            }
        }

        int intDizi[]=new int[]{1,2,3,4,5};
        System.out.println("3 hariç hepsini Yaz");
        for (int i:intDizi) {
            if (i ==3) {
                continue;
            }else
                System.out.println("i Değeri = "+i);
        }


        String cumle="Güzel Gören Güzel Düşünür";
        int uzunluk=cumle.length();
        int adet=0;
        for (int i = 0; i < uzunluk; i++) {
            if (cumle.charAt(i)!='ü') {
            continue;
            }
            adet++;
        }
        System.out.println("Adet= "+adet);
    }
}
