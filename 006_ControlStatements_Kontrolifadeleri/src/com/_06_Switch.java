package com;

public class _06_Switch {
    public static void main(String[] args) {

        /*
        switch(expression)
        {
            case value1
            break;

            case value2
            break;
        }
        * */

        int i=0;

        switch (i)//Break koymadığımız her bir case alanına giriş yapar
        {
            case 0:
                System.out.println("i: 0");
                break;

            case 1:
                System.out.println("i : 1");
                break;

            case 2:
                System.out.println("i : 2");
                break;
            default:
                System.out.println("Varsayılan mesaj");
        }

        int ay=1;
        String ayString = " ";
        switch (ay)
        {
            case 1:
                ayString="ocak";
                break;
            case 2:
                ayString="şubat";
                break;
            case 3:
                ayString="mart";
                break;
            case 4:
                ayString="nisan";
                break;
            default:
                System.out.println("Geçersiz");
                break;
        }
        System.out.println(ayString);

    }
}
