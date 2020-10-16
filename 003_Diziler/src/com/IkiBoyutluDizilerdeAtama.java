package com;

public class IkiBoyutluDizilerdeAtama {

    public static void main(String[] args) {

        double sayi[][]={{1299,1071,1923,1453},
        {5.71,6.32,6.22,10.71},
        {1,2,3,4,7},
        {2+4,6*2,5-2,1453-2016}};

       /* System.out.println(sayi[0][0]);
        System.out.println(sayi[1][0]);
        System.out.println(sayi[2][0]);
        System.out.println(sayi[3][0]);
*/
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" "+sayi[i][j]+" ");
            }
            System.out.println();
        }
        
    }

}
