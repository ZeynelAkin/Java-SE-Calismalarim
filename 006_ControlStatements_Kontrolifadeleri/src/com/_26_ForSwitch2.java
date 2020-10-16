package com;

public class _26_ForSwitch2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            switch (i)
            {
                case 0:
                case 1:
                case 2:
                case 3:
                    System.out.println("4 ten küçük= "+i);break;
                case 4:
                case 5:
                case 6:
                    System.out.println("7 den küçük= "+i);break;
                default:
                    System.out.println("7 den büyük = "+i);
            }
        }
    }
}
