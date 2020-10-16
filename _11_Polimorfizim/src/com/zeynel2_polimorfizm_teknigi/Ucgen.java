package com.zeynel2_polimorfizm_teknigi;

public class Ucgen extends Dortgen{

    float kenar3;
    public Ucgen() {super();
    }

    public Ucgen(float kenar1, float kenar2,float kenar3) {
        super(kenar1, kenar2);
        this.kenar3=kenar3;
    }

    protected float alaniHesapla()
    {
        System.out.println("Üçgen Sınıfı Alan Hesabı");
        return (this.kenar1*this.kenar2)/2;
    }
    protected float cevreHesapla()
    {
        System.out.println("Üçgen Sınıfı Çevre Hesabı");

        return this.kenar1+this.kenar2+kenar3;
    }
}
