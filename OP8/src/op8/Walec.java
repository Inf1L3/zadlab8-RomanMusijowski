package op8;

import static java.lang.Math.PI;

public class Walec extends FiguraPrzestrzenna {

    private int wysokosc=0;
    private int r=0;

    public Walec(int wysokosc, int r) {
        this.wysokosc = wysokosc;
        this.r = r;
    }

    @Override
    public double obliczObjetosc() {
        return PI*(r*r)*wysokosc;
    }

    @Override
    public double obliczPole() {
        return (2*PI*r*r)+(2*PI*r*wysokosc);
    }


    @Override
    public String toStrind() {
        return super.toStrind()+"  objetosc = "+obliczObjetosc()+" , pole = "+obliczPole();
    }
}
