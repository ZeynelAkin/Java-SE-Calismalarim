package com.zeynel6_object_sinif_instanceof;

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

        Object objectSinifReferansi=aNesnesi;

        A aSinifiNesneReferansi=aNesnesi;//alt sınıfın nesnesini referans alabiliriz  ama üst sınıfn nesnesini referans alamayız.
        aSinifiNesneReferansi.yaz();

        aSinifiNesneReferansi=bNesnesi;
        aSinifiNesneReferansi.yaz();

        if (dNesnesi instanceof D) {//Bir nesnenin hangi sınıfa ait olduğunu gösterir
            System.out.println("D sınıfına ait ");
        }else
            System.out.println("D değil");

    }
}

