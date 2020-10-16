package com;

public class _10_SwitchDongusundeStringKullanimi {

    public static void main(String[] args) {
        String ay="hh";
        int geriDonenAy=_10_SwitchDongusundeStringKullanimi.aySayisiniAl(ay);
        System.out.println(geriDonenAy);
    }

    private static int aySayisiniAl(String ay) {
        int aySirasi=3;
        if (ay == null) {
            return aySirasi;
        }

        switch (ay.toUpperCase())
        {
            case "OCAK": aySirasi=1;break;
            case "ŞUBAT": aySirasi=2;break;
            case "MART": aySirasi=3;break;
            case "NİSAN": aySirasi=4;break;
            case "MAYIS": aySirasi=5;break;
            case "HAZİRAN": aySirasi=6;break;
            case "TEMMUZ": aySirasi=7;break;
            case "AĞUSTOS": aySirasi=8;break;
            case "EYLÜL": aySirasi=9;break;
            case "EKİM": aySirasi=10;break;
            case "KASIM": aySirasi=11;break;
            case "ARALIK": aySirasi=12;break;
            default:
                System.out.println("geçersiz ay");

        }return aySirasi;
    }
}
