package com;

public class _18_For_IleAsalSayilar {
    public static void main(String[] args) {
        int limit=50;

        for (int i = 1; i <limit ; i++) {
            boolean durum=true;
            for (int j = 2; j < i; j++) {
                if (i%j==0)
                {
                    durum=false;
                    break;
                }
            }
            if (durum) {
                System.out.println(i+" ");
            }
        }

    }

}
