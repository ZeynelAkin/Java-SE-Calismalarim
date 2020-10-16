package com.zeynel1_nested_inner_classes_icice_siniflar;

public class DisSinif {
    int sayi=571;

    void disSinifMMEtodu()
    {
        IcSinif icSinifNesnesi=new IcSinif();
        icSinifNesnesi.icSinifMEtodu();
        System.out.println("DisSinif metodunun içi= "+sayi);
    }
    class IcSinif
    {
        int sayi=632;
        void icSinifMEtodu()
        {
            System.out.println("IcsinifMEtodu= "+sayi);
        }
    }

    public static void main(String[] args) {
        System.out.println("DisSinif");
        DisSinif disSinifNEsnesi=new DisSinif();
        disSinifNEsnesi.disSinifMMEtodu();

    }

}
