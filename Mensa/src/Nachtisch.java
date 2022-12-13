public class Nachtisch extends Gericht {

    public static int verkaufteNachtische = 0;

    public Nachtisch() {
        verkaufteNachtische++;
    }

    @Override
    public double getPreis() {
        return 0.6;
    }

    public static int getAnzahl() {
        return verkaufteNachtische;
    }
}
