package com.zeynel3_interface_ve_degiskenler;

public class A {

    public static int say1=1299;
    protected static int say2=571;
    static int say3=632;
    private static int say4=1453;

    interface IA
    {
        public int say1=1299;
        //protected int say2=571; protected ve private interfacede kullanamyız
        int say3=632;
        //private int say4=1453;
    }

    interface IB
    {
        public static int ss1=571;
        static int ss2=1223;
    }
    interface IC
    {
        public final int s1=1234;
        final int s2=321;
    }
    interface ID
    {
//public abstract int deneme=1231;
//abstract int deneme1=111;
    }


}
