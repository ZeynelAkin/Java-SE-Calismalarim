package com.zeynel5_final_degisken_metod_sinif;

public abstract class A {//Bir sınıf final ise miras alınamaz

    final double PISAYISI=3.14;

    protected  double hesapla1(int p1,int p2)
    {
        return p1*p2;
    }
    protected abstract double hesapla(int p1,double p2);

    protected final double hesapla3(int p1,double p2)//Final Metodları Override edilemez
    {
        return p1*p2*1000;
    }
}
