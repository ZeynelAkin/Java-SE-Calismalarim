package com.zeynel3_ust_sinif_degiskenler_ve_metodlar;

public class Kamyon extends Arac {
    int kasaDurumu;
    public Kamyon() {
    }

    public Kamyon(int hizKapasitesi, int beygirgucu, int modelYili, String yakitTuru, String ureticiMarkaAdi) {
        super(hizKapasitesi, beygirgucu, modelYili, yakitTuru, ureticiMarkaAdi);
    }

    public static void main(String[] args) {

        Kamyon kamyon=new Kamyon();
        kamyon.beygirgucu=300;
        kamyon.hizKapasitesi=200;
        kamyon.calimayiBaslat();
        kamyon.calismayiSonlandir();

    }

}
