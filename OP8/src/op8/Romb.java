package op8;

public class Romb extends FiguraPlaska {

    private int a=0;
    private int wysokosc=0;

    public Romb(int a,int wysokosc) {
        this.a = a;
        this.wysokosc=wysokosc;
    }

    @Override
    public double ObliczObwod() {
        return 4*a;
    }

    @Override
    public double obliczPole() {
        return a*wysokosc;
    }

    @Override
    public String toString() {
        return super.toString()+"  obwod = "+ObliczObwod()+" , pole = "+obliczPole();
    }
}
