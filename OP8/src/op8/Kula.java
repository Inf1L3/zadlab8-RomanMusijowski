package op8;

import static java.lang.Math.PI;

public class Kula extends FiguraPrzestrzenna {

    private int R=0;

    public Kula(int r) {
        R = r;
    }

    @Override
    public double obliczObjetosc() {
        return (4/3)*PI*(R*R);
    }

    @Override
    public double obliczPole() {
        return 4*PI*(R*R);
    }

    @Override
    public String toStrind() {
        return super.toStrind()+"  objetosc = "+obliczObjetosc()+" , pole = "+obliczPole();
    }
}
