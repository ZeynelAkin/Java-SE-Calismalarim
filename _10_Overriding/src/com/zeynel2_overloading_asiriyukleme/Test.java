package com.zeynel2_overloading_asiriyukleme;

public class Test {
    public static void main(String[] args) {
        Hamsi hamsi=new Hamsi(2,4,true,"gri","büyük");
        System.out.println(hamsi.balikBilgisiniVer());
        System.out.println(hamsi.balikBilgisiniVer(12,10.55));
    }
}
