package op8;

public class Trapez extends FiguraPlaska {

    private int podstawaA=0;
    private int podstawaB=0;
    private int stronaA=0;
    private int stronaB=0;
    private int wysokosc=0;


    public Trapez(int podstawaA, int podstawaB, int stronaA, int stronaB,int wysokosc) {
        this.podstawaA = podstawaA;
        this.podstawaB = podstawaB;
        this.stronaA = stronaA;
        this.stronaB = stronaB;
        this.wysokosc=wysokosc;
    }

    @Override
    public double ObliczObwod() {
        return stronaA+stronaB+podstawaB+podstawaA;
    }

    @Override
    public double obliczPole() {
        return ((podstawaA+podstawaB)/2)*wysokosc;
    }

    @Override
    public String toString() {
        return super.toString()+"  obwod = "+ObliczObwod()+" , pole = "+obliczPole();
    }
}
