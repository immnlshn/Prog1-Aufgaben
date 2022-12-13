public class Salat extends Gericht {

    private static int verkaufteSalate = 0;
    private final double gewicht;

    public Salat(double gewicht) {
        this.gewicht = gewicht;
        verkaufteSalate++;
    }


    @Override
    public double getPreis() {
        return 0.3 * (this.gewicht / 100);
    }

    public static int getAnzahl() {
        return verkaufteSalate;
    }

}
