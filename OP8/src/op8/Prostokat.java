package op8;

public class Prostokat extends FiguraPlaska {

    private int a=0;
    private int b=0;

    public Prostokat(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double ObliczObwod() {
        return 2*a+2*b;
    }

    @Override
    public double obliczPole() {
        return a*b;
    }

    @Override
    public String toString() {
        return super.toString()+"  obwod = "+ObliczObwod()+" , pole = "+obliczPole();
    }
}
