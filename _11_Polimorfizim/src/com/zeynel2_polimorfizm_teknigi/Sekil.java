package com.zeynel2_polimorfizm_teknigi;

public class Sekil {

    float kenar1,kenar2;

    public Sekil() {
    }

    public Sekil(float kenar1, float kenar2) {
        this.kenar1 = kenar1;
        this.kenar2 = kenar2;
    }

    protected float alaniHesapla()
    {
        System.out.println("Şekil Sınıfı Alan Hesabı");
        return (float)0.0;
    }
    protected float cevreHesapla()
    {
        System.out.println("Şekil Sınıfı Çevre Hesabı");
        return (float)0.0;
    }
}
