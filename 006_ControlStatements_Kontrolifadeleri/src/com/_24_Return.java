package com;

public class _24_Return {
    public static void main(String[] args) {
        boolean  durum=true;
        for (int i = 0; i < 2; i++) {
            System.out.println("return öncesi");
            if (durum) {
                return;//Direkt döngüyü bitirir. ne başına gider ne de  sonuna .
            }
            System.out.println("resturn sonrsası");
        }

    }
}
