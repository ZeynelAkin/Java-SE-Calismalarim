package com.zeynel_parametre_olarak_nesne_gönderilmesi;

public class Bsinifi {
    public static void main(String[] args) {
        Asinifi aNesnesi=new Asinifi();
        Asinifi aNesnesi1=new Asinifi(1,4);
        Asinifi aNesnesi2=new Asinifi(5,3);
        Asinifi aNesnesi3=new Asinifi();
        Asinifi aNesnesi4=new Asinifi(5,3);

        System.out.println("nesne1==nesne2 "+aNesnesi.nesnelerinKarsilastirilmasi(aNesnesi1));
        System.out.println("nesne1==nesne3 "+aNesnesi.nesnelerinKarsilastirilmasi(aNesnesi2));
        System.out.println("nesne1==nesne4 "+aNesnesi.nesnelerinKarsilastirilmasi(aNesnesi3));
        System.out.println("nesne5==nesne3 "+aNesnesi4.nesnelerinKarsilastirilmasi(aNesnesi2));
    }
}
