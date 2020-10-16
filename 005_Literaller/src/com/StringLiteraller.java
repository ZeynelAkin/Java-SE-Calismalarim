package com;

public class StringLiteraller {
    public static void main(String[] args) {
        long kredKartNo=1234_5678_9012_3456L;//En sondaki 'L' long tipi olduğunu gösterir
        long sskNo=999_99_9999L;
        float piSayisi=3.14_15F;//Float sayiları belirlemek için sonuna 'f'koyuyoruz
        long hexBytes=0xFF_EC_DE_5E;
        long hexWords=0xCAFE_BABE;
        long maxLong=0x7fff_ffff_ffff_ffffL;
        byte nybbles=0b0010_0101;
        long bytes =0b11010010_01101001_10010100_10010010;

        System.out.println("Kredi Kart No= "+kredKartNo);
        System.out.println("SSK NO= "+sskNo);
        System.out.println("pi ="+piSayisi);
        System.out.println("hexBytes ="+hexBytes);
        System.out.println("hexWords= "+hexWords);
        System.out.println("maxLong= "+maxLong);
        System.out.println("nybbles= "+nybbles);
        System.out.println("bytes= "+bytes);

    }
}
