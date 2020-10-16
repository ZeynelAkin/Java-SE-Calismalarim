package com.zeynel1_calisma_zamani_dinamik_metodlar;

public class Test {

    public static void main(String[] args) {
        A aNesnesi=new A();
        B bNesnesi=new B();
        C cNesnesi=new C();
        D dNesnesi=new D();

        aNesnesi.yaz();
        bNesnesi.yaz();
        cNesnesi.yaz();
        dNesnesi.yaz();

        A aSinifiNesneReferansi=aNesnesi;//alt sınıfın nesnesini referans alabiliriz  ama üst sınıfn nesnesini referans alamayız.
        aSinifiNesneReferansi.yaz();

        aSinifiNesneReferansi=bNesnesi;
        aSinifiNesneReferansi.yaz();
    }
}

