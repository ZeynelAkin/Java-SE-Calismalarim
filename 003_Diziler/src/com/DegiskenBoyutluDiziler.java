package com;

public class DegiskenBoyutluDiziler {
    public static void main(String[] args) {

        int sayilarIkiBoyutlu[][]=new int[3][4];

        sayilarIkiBoyutlu[0]=new int[1];
        sayilarIkiBoyutlu[1]=new int[2];
        sayilarIkiBoyutlu[2]=new int[3];

        for (int i=0;i<3;i++)
        {
            for (int j = 0; j < i+1; j++) {
                sayilarIkiBoyutlu[i][j]=i+j;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(" "+sayilarIkiBoyutlu[i][j]+" ");

            }System.out.println();
        }
    }
}
