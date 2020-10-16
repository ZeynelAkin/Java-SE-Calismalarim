package com.zeynel4_polimorfizim_teknigi_abstract;

public class Dortgen extends Sekil {

    public Dortgen() {
        super();
    }

    public Dortgen(float kenar1, float kenar2) {
        super(kenar1, kenar2);
    }


    protected float alaniHesapla()
    {
        System.out.println("Dörtgen Sınıfı Alan Hesabı");
        return this.kenar1*this.kenar2;
    }
    protected float cevreHesapla()
    {
        System.out.println("Dörtgen Sınıfı Çevre Hesabı");
        return (this.kenar1+this.kenar2)/2;
    }
}
