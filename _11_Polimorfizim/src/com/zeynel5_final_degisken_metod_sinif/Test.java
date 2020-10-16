package com.zeynel5_final_degisken_metod_sinif;

public class Test {
    public static void main(String[] args) {
    B nesne=new B();
    A aReferansi;

    System.out.println(nesne.hesapla3(12,13));

    aReferansi=nesne;
        System.out.println(aReferansi.hesapla3(33,11));

    }
}
