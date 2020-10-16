public class Hesap {

    private double bakiye;
    private long hesapNo;

    public Hesap(int hesapNo)
    {
        this.hesapNo=hesapNo;
    }
    public void ekle(double miktar)
    {
        this.bakiye=this.bakiye+miktar;
    }

    public void cikar(double miktar) throws Denetim//kendi istisnamızı oluşturduk
    {
        if (miktar <=this.bakiye) {
            this.bakiye=this.bakiye-miktar;
        }else
        {
            double fark=miktar-this.bakiye;
            throw new Denetim(fark);
        }
    }
    public double getBakiye()
    {
        return bakiye;
    }

}
