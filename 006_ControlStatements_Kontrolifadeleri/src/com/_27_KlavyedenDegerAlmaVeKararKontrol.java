package com;

import java.io.IOException;

public class _27_KlavyedenDegerAlmaVeKararKontrol {
    public static void main(String[] args) throws IOException {
        char secilen;
        do {
            System.out.println("Ana Menüye Hoş Geldiniz");
            System.out.println("1. Güncel");
            System.out.println("2. Havale Yap");
            System.out.println("3. Kontör Gönder");
            System.out.println("4. Hesap Aç");
            System.out.println("5. Limitleri Gör");
            System.out.println("Lütfen Birini Seçiniz: ");
            secilen=(char)System.in.read();
        }while (secilen<'1'||secilen>'5');


        System.out.println("\n");

        switch (secilen)
        {
            case '1':
                System.out.println("Güncel seçildi");break;
            case '2':
                System.out.println("Havale yap seçildi");break;
            case '3':
                System.out.println("Kontör Gönder Seçildi");break;
            case '4':
                System.out.println("Hesap AÇ seçildi");break;
            case '5':
                System.out.println("Limitleri Gör Seçildi");break;
            default:
                System.out.println("Farklı bir seçim Yaptınız");
        }

    }
}
