package op8;

public class Prostopaloscian extends FiguraPrzestrzenna {

    private int stronaMin=0;
    private int stronaMax=0;
    private int wysokosc=0;

    public Prostopaloscian(int stronaMin, int stronaMax, int wysokosc) {
        this.stronaMin = stronaMin;
        this.stronaMax = stronaMax;
        this.wysokosc = wysokosc;
    }

    @Override
    public double obliczObjetosc() {
        return stronaMax*stronaMin*wysokosc;
    }

    @Override
    public double obliczPole() {
        return (2*stronaMin*stronaMax)+(2*stronaMin*wysokosc)+(2*stronaMax*wysokosc);
    }

    @Override
    public String toStrind() {
        return super.toStrind()+"  objetosc = "+obliczObjetosc()+" , pole = "+obliczPole();
    }
}
