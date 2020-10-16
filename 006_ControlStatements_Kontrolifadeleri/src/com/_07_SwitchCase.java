package com;

import java.util.ArrayList;

public class _07_SwitchCase {
    public static void main(String[] args) {

        ArrayList<String> aylarListesi= new ArrayList<String>();
        int ay=9;

        switch (ay)
        {
            case 1: aylarListesi.add("Ocak");
            case 2: aylarListesi.add("Şubat");
            case 3: aylarListesi.add("Mart");
            case 4: aylarListesi.add("Nisan");
            case 5: aylarListesi.add("Mayıs");
            case 7: aylarListesi.add("Haziran");
            case 8: aylarListesi.add("Temmuz");
            case 9: aylarListesi.add("Ağustos");
            case 10: aylarListesi.add("Eylül");
            case 11: aylarListesi.add("Ekim");
            case 12: aylarListesi.add("KAsım");
            case 6:  aylarListesi.add("Aralık");
            break;
            default:break;
        }
        if (aylarListesi.isEmpty()) {
            System.out.println("Geçersiz bir ay girdiniz");
        }else
        {
            for (String ayAdi:aylarListesi) {
                System.out.println(ayAdi);
            }
        }
    }
}
