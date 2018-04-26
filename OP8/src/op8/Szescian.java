package op8;

public class Szescian extends FiguraPrzestrzenna {

    private int a=0;

    public Szescian(int a) {
        this.a = a;
    }

    @Override
    public double obliczObjetosc() {
        return a*a*a;
    }

    @Override
    public double obliczPole() {
        return 6*a*a;
    }

    @Override
    public String toStrind() {
        return super.toStrind()+"  objetosc = "+obliczObjetosc()+" , pole = "+obliczPole();
    }
}
