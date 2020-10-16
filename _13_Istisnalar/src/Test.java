public class Test {

    public static void main(String[] args) {


        Hesap hesap=new Hesap(10712023);
        System.out.println("\n Hesap Bakiyes 1453 TT \n");
        hesap.ekle(1453);

        try {
            System.out.println("\n Para Cekiliyor: 571 tl\n");
            hesap.cikar(571);
            System.out.println("\n para çekiliyor : 632 tl \n");
            hesap.cikar(632);
            System.out.println("\n para çekiliyor : 500 tl \n");
            hesap.cikar(500);
        } catch (Denetim denetim) {
            System.out.println("\n Sınırınızı "+denetim.getMiktar()+"Tl astınız hata meydana geldi");
            denetim.printStackTrace();
        }
    }

}
