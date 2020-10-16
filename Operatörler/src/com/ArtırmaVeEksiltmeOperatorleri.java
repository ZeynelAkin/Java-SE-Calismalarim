package com;

public class ArtırmaVeEksiltmeOperatorleri {

    public static void main(String[] args) {

        int say1=9,say2=99,say3,say4;

        //say3=say1+1;
        //System.out.println("say3= "+say3);

       // say3=say1++; önce sayı1'i say3'e  ata sonra ata
       //System.out.println("say3= "+say3);

        say3=++say1;//önce say1'i artır sonra say3'e ata
        System.out.println("say3= "+say3);


        //say4=say2-1;
        //System.out.println("say4= "+say4);

       //say4=say2--;// önce sayı2'i say4'e  ata sonra eksilt
       //System.out.println("say4= "+say4);

        say4=--say2;//önce say2'i eksilt sonra say4'e ata
        System.out.println("say4= "+say4);

    }

}
