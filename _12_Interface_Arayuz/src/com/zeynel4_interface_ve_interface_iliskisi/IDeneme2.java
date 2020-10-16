package com.zeynel4_interface_ve_interface_iliskisi;

public interface IDeneme2 extends IDeneme{//Interfaceler birbirini extend edebilir
    public void oku1();
    void oku2();

    interface IDeneme3
    {

    }
    class B
    {

    }

    abstract class C
    {
        public abstract void ekle1();
        abstract void ekle2();

    }

    final class D
    {
        public  void ekle1()
        {

        }
         void ekle2()
         {

         }

    }

}
