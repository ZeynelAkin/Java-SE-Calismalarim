package com;

public class _08_SwitchBreak {
    public static void main(String[] args) {

        int ay=9;
        String mevsim="";
        switch (ay)
        {
            case 12:
            case 1:
            case 2: mevsim="KKIŞ" ;break;
            case 3:
            case 4:
            case 5:mevsim="İlkbahar"; break;
            case 6:
            case 7:
            case 8: mevsim="Yaz"; break;
            case 9:
            case 10:
            case 11: mevsim="Sonbahar";break;

            default:
                System.out.println("Geçersiz 1 ay");break;
        }
        System.out.println("Sonuç :"+mevsim+".");

    }
}
