public class Weg {

    private Punkt[] punkte;

    public Weg(int x, int y) {
        this.punkte = new Punkt[1];
        this.punkte[0] = new Punkt(x, y);
    }

    public int getAnzahl() {
        return this.punkte.length;
    }

    public void verlaengern(Weg w) {
        Punkt[] temp = new Punkt[this.punkte.length + w.punkte.length];
        for (int i = 0; i < this.punkte.length; i++) {
            temp[i] = this.punkte[i];
        }
        for (int i = 0; i < w.punkte.length; i++) {
            temp[i + this.punkte.length] = w.punkte[i];
        }
        this.punkte = temp;
    }

    @Override
    public String toString() {
        String s = this.punkte[0].toString();
        for (int i = 1; i < this.punkte.length; i++) {
            s += "-" + this.punkte[i].toString();
        }
        return s;
    }
}
