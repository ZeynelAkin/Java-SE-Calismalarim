package com.zeynel3_ust_sinif_degiskenler_ve_metodlar;

public class Arac {
    int hizKapasitesi,beygirgucu,modelYili;
    String yakitTuru,ureticiMarkaAdi;

    public Arac() {
    }

    public Arac(int hizKapasitesi, int beygirgucu, int modelYili, String yakitTuru, String ureticiMarkaAdi) {
        this.hizKapasitesi = hizKapasitesi;
        this.beygirgucu = beygirgucu;
        this.modelYili = modelYili;
        this.yakitTuru = yakitTuru;
        this.ureticiMarkaAdi = ureticiMarkaAdi;
    }

    public void calimayiBaslat()
    {
        System.out.println("Çalişma başlatıldı");
    }public void freneBas()
    {
        System.out.println("Frene Basıldı");
    }public void gazaBas()
    {
        System.out.println("Gaza Basıldı");
    }public void vitesDegistir()
    {
        System.out.println("Vites Degisti");
    }public void calismayiSonlandir()
    {
        System.out.println("Çalişma sonlandı");
    }

    public static void main(String[] args) {
        Arac arac=new Arac();
        arac.calimayiBaslat();
        arac.gazaBas();
        arac.freneBas();
        arac.vitesDegistir();
        arac.calismayiSonlandir();
    }
}
