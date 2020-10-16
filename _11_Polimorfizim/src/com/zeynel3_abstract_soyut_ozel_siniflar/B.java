package com.zeynel3_abstract_soyut_ozel_siniflar;

import com.zeynel3_abstract_soyut_ozel_siniflar.A;

public class B extends A {


    @Override//Abstract sınıftan miras alınıyorsa gövdesiz metodları override etmek mecburidir
    int hesapla() {
        return 0;
    }

    @Override
    double topla() {
        return 0;
    }

    @Override
    double bol() {
        return 0;
    }

    //A a=new A(); abstract sınıfın nesnesi oluşturulamaz

}
