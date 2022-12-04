public class Rational {

    private int zaehler;
    private int nenner;

    public Rational(int zaehler, int nenner) {
        if (nenner == 0) {
            System.out.println("Fehler: Nenner ist 0");
            return;
        }
        if (nenner < 0) {
            this.zaehler = -zaehler;
            this.nenner = -nenner;
        } else {
            this.zaehler = zaehler;
            this.nenner = nenner;
        }
        this.trim();
    }

    public Rational(int zaehler) {
        this.zaehler = zaehler;
        this.nenner = 1;
    }

    public Rational add(Rational r) {
        int zaehler = this.zaehler * r.nenner + this.nenner * r.zaehler;
        int nenner = this.nenner * r.nenner;
        return trim(new Rational(zaehler, nenner));
    }

    public Rational sub(Rational r) {
        int zaehler = this.zaehler * r.nenner - this.nenner * r.zaehler;
        int nenner = this.nenner * r.nenner;
        return trim(new Rational(zaehler, nenner));
    }

    public Rational mul(Rational r) {
        int zaehler = this.zaehler * r.zaehler;
        int nenner = this.nenner * r.nenner;
        return trim(new Rational(zaehler, nenner));
    }

    public Rational div(Rational r) {
        int zaehler = this.zaehler * r.nenner;
        int nenner = this.nenner * r.zaehler;
        return trim(new Rational(zaehler, nenner));
    }

    public String toString() {
        return this.zaehler + "/" + this.nenner;
    }

    public static Rational trim(Rational r) {
        int ggt = ggt(r.zaehler, r.nenner);
        int zaehler = r.zaehler / ggt;
        int nenner = r.nenner / ggt;
        return new Rational(zaehler, nenner);
    }

    public void trim() {
        int ggt = ggt(this.zaehler, this.nenner);
        this.zaehler = this.zaehler / ggt;
        this.nenner = this.nenner / ggt;
    }

    private static int ggt(int a, int b) {
        if (Math.abs(b) == 0) {
            return Math.abs(a);
        }
        return ggt(Math.abs(b), Math.abs(a) % Math.abs(b));
    }

}
