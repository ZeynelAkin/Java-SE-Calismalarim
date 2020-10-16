public class Denetim extends Exception {

    private double miktar;

    public Denetim(double miktar)
    {
        this.miktar=miktar;
    }

    public double getMiktar() {
        return miktar;
    }
}
