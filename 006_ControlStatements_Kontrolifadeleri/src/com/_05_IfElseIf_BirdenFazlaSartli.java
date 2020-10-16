package com;

public class _05_IfElseIf_BirdenFazlaSartli {
    public static void main(String[] args) {


        int ay=2;
        String MEVSİM=" ";
        if (ay ==12||ay==1||ay==2) {
            MEVSİM="KIŞ";
        }else if (ay ==3||ay==4||ay==5) {
            MEVSİM="İlkbahar";
        }else if (ay ==6||ay==7||ay==8) {
            MEVSİM="Sonbahar";
        }else if (ay ==9||ay==10||ay==11)
        {
            MEVSİM="Yaz";
        }else
        {
            MEVSİM="Geçersiz bir ay";
        }
        System.out.println(MEVSİM);

        int yil=2012;
        if ((yil %400==0)||((yil %4==0)&&(yil %100!=0))) {
            System.out.println("senesi artık 1 yıl");
        }else
        {
            System.out.println("değildir");
        }

    }
}
