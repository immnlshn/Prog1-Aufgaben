public class ReelleZahl extends Zahl {

    double zahl;

    public ReelleZahl(double r) {
        this.zahl = r;
    }

    public double getZahl() {
        return this.zahl;
    }

    @Override
    public Zahl addieren(Zahl zahl) {
        return new ReelleZahl(this.getZahl() + ((ReelleZahl) zahl).getZahl());
    }

    @Override
    public Zahl subtrahieren(Zahl zahl) {
        return new ReelleZahl(this.getZahl() - ((ReelleZahl) zahl).getZahl());
    }

    @Override
    public Zahl multiplizieren(Zahl zahl) {
        return new ReelleZahl(this.getZahl() * ((ReelleZahl) zahl).getZahl());
    }

    @Override
    public Zahl dividieren(Zahl zahl) {
        return new ReelleZahl(this.getZahl() / ((ReelleZahl) zahl).getZahl());
    }

    @Override
    public String toString() {
        return zahl + "";
    }
}
