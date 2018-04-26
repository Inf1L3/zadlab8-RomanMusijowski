package op8;

import static java.lang.Math.PI;

public class Kolo extends FiguraPlaska {

    private int r=0;

    public Kolo(int r) {
        this.r = r;
    }

    @Override
    public double ObliczObwod() {
        return 2*PI*r;
    }

    @Override
    public double obliczPole() {
        return PI*(r*r);
    }

    @Override
    public String toString() {
        return super.toString()+"  obwod = "+ObliczObwod()+" , pole = "+obliczPole();
    }
}
