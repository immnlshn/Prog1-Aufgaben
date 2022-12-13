public class KomplexeZahl extends Zahl{
    double a,b;
    public KomplexeZahl(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double getA(){
        return this.a;
    }

    public double getB(){
        return this.b;
    }

    @Override
    public Zahl addieren(Zahl zahl) {
        return new KomplexeZahl(this.getA() + ((KomplexeZahl)zahl).getA(), this.getB() + ((KomplexeZahl)zahl).getB());
    }

    @Override
    public Zahl subtrahieren(Zahl zahl) {
        return new KomplexeZahl(this.getA() - ((KomplexeZahl)zahl).getA(), this.getB() - ((KomplexeZahl)zahl).getB());
    }

    @Override
    public Zahl multiplizieren(Zahl zahl) {
        return new KomplexeZahl(this.getA() * ((KomplexeZahl)zahl).getA() - this.getB() * ((KomplexeZahl)zahl).getB(), this.getA() * ((KomplexeZahl)zahl).getB() + this.getB() * ((KomplexeZahl)zahl).getA());
    }

    @Override
    public Zahl dividieren(Zahl zahl) {
        return new KomplexeZahl((this.getA() * ((KomplexeZahl)zahl).getA() + this.getB() * ((KomplexeZahl)zahl).getB()) / (((KomplexeZahl)zahl).getA() * ((KomplexeZahl)zahl).getA() + ((KomplexeZahl)zahl).getB() * ((KomplexeZahl)zahl).getB()), (this.getB() * ((KomplexeZahl)zahl).getA() - this.getA() * ((KomplexeZahl)zahl).getB()) / (((KomplexeZahl)zahl).getA() * ((KomplexeZahl)zahl).getA() + ((KomplexeZahl)zahl).getB() * ((KomplexeZahl)zahl).getB()));
    }

    @Override
    public String toString() {
        return a+"+"+b+"*i";
    }
}
