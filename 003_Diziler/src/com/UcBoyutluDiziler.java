package com;

public class UcBoyutluDiziler {

    public static void main(String[] args) {
        int sayilarUcBoyutlu[][][]=new int[3][4][5];



        for (int i=0;i<3;i++)
        {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                     sayilarUcBoyutlu[i][j][k]=(i+j+k)*2;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    System.out.print( sayilarUcBoyutlu[i][j][k]+" ");
                }System.out.println();
            }System.out.println();
        }
    }

}
