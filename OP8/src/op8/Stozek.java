package op8;

import static java.lang.Math.PI;

public class Stozek extends FiguraPrzestrzenna {

    private int H=0;
    private int L=0;
    private int r=0;

    public Stozek(int h, int l, int r) {
        this.H = h;
        this.L = l;
        this.r = r;
    }

    @Override
    public double obliczObjetosc() {
        return (1/3)*PI*(r*r)*H;
    }

    @Override
    public double obliczPole() {
        return PI*r*(r+L);
    }

    @Override
    public String toStrind() {
        return super.toStrind()+"  objetosc = "+obliczObjetosc()+" , pole = "+obliczPole();
    }
}
