package op8;

public class Kwadrat extends FiguraPlaska {

    private int a=0;

    public Kwadrat(int a) {
        this.a = a;
    }


    @Override
    public double ObliczObwod() {
        return 4*a;
    }

    @Override
    public double obliczPole() {
        return a*a;
    }

    @Override
    public String toString() {
        return  super.toString()+"  obwod = "+ObliczObwod()+" , pole = "+obliczPole();
    }
}

