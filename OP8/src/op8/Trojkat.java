package op8;

public class Trojkat extends FiguraPlaska {

    private int podstawa =0;
    private int wysokosc=0;
    private int stronaA=0;
    private int stronaB=0;

    public Trojkat(int podstawa, int wysokosc) {
        this.podstawa = podstawa;
        this.wysokosc = wysokosc;
    }

    @Override
    public double ObliczObwod() {
        return stronaB+stronaA+podstawa;
    }

    @Override
    public double obliczPole() {
        return (1/2)*podstawa*wysokosc;
    }

    @Override
    public String toString() {
        return super.toString()+"  obwod = "+ObliczObwod()+" , pole = "+obliczPole();
    }
}
