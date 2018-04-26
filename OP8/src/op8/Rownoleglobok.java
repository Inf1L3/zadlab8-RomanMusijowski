package op8;

public class Rownoleglobok extends FiguraPlaska  {

    private int stronaMin=0;
    private int stronaB=0;
    private int wysokosc =0;

    public Rownoleglobok(int stronaMin, int stronaB, int wysokosc) {
        this.stronaMin = stronaMin;
        this.stronaB = stronaB;
        this.wysokosc= wysokosc;
    }

    @Override
    public double ObliczObwod() {
        return 2*stronaMin+2*stronaB;
    }

    @Override
    public double obliczPole() {
        return stronaMin*wysokosc;
    }

    @Override
    public String toString() {
        return super.toString()+"  obwod = "+ObliczObwod()+" , pole = "+obliczPole();
    }
}
