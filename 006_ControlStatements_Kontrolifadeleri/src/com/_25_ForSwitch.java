package com;

public class _25_ForSwitch {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            switch (i)
            { case 0:
                System.out.println("sıfır");
                break;
                case 1:
                    System.out.println("Bir");
                    break;
                case 2:
                    System.out.println("İki");
                    break;
                default:
                    System.out.println("farklı bir sayı girildi");
            }
        }
    }
}
