package com;

public class _23_ContinueLabel {
    public static void main(String[] args) {

        etiket:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if (j ==2) {
                    continue etiket;
                }
                System.out.println("i= "+i+", j= "+j);
            }
        }
        
        int intArray[][]=new int[][]{{1,2},{2,3}};
        Outer:
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                if (intArray[i][j] ==3) {
                    continue Outer;
                }
                System.out.println("Elemanlar= "+intArray[i][j]);
            }
        }

        String cumle="Güzel Gören Güzel Düşünür,Güzel Düşünen Hayatından Lezzet Alır";
        String aranan="Görend";
        boolean durum= false;
        int max =cumle.length()-aranan.length();
        test:
        for (int i = 0; i < max; i++) {
            int n=aranan.length();
            int j=i;
            int k=0;
            while (n--!=0)
            {
                if (cumle.charAt(j++) !=aranan.charAt(k++)) {//cumledeki kelime ile aranan kelimenin harfleri karşılaştırılıyor.
                    continue test;
                }
            }
            durum=true;
            break test;
        }
        System.out.println(durum ? "Bulundu":"Bulunamadı");//durum ?  "True ise burası":"False ise burası"
    }
}
