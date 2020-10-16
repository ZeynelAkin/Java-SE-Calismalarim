package com.zeynel2_nested_inner_classes_icice_siniflar_2;

public class AnaSinif {
    double say1,say2;

    public AnaSinif(double say1, double say2) {
        this.say1 = say1;
        this.say2 = say2;
    }

    public double getSay1() {
        return say1;
    }

    public void setSay1(double say1) {
        this.say1 = say1;
    }

    public double getSay2() {
        return say2;
    }

    public void setSay2(double say2) {
        this.say2 = say2;
    }

    public static void main(String[] args) {

    }
}

class EvlatSinif extends AnaSinif
{
    double sayi3;
    public EvlatSinif(double say1, double say2,double s3) {
        super(say1, say2);
        this.sayi3=s3;
    }
}
