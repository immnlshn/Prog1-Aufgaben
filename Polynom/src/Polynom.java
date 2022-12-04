import java.util.Arrays;

public class Polynom {
    private static int anzahl = 0;
    private double[] koeffizienten;

    public Polynom(double[] koeffizienten) {
        if (koeffizienten.length == 0) {
            System.out.println("Fehler: Polynom muss mindestens einen Koeffizienten haben.");
            return;
        }
        int normalisiert = koeffizienten.length - 1;
        while (normalisiert >= 0 && koeffizienten[normalisiert] == 0) {
            normalisiert--;
        }
        if (normalisiert >= 0) {
            this.koeffizienten = Arrays.copyOfRange(koeffizienten, 0, normalisiert+1);
        } else {
            this.koeffizienten = new double[1];
            this.koeffizienten[0] = 0;
        }
        anzahl++;
    }

    @Override
    public String toString() {
        String polynom = "";
        for (int i = koeffizienten.length - 1; i >= 0; i--) {
            if (koeffizienten[i] == 0) continue;
            if (polynom.length() > 0) polynom += " + ";
            if (i > 1) polynom += koeffizienten[i] + "*x^" + i;
            else if (i == 1) polynom += koeffizienten[i] + "*x^1";
            else polynom += koeffizienten[i] + "*x^0";
        }
        return polynom;
    }

    public double auswerten(double x) {
        double wert = 0;
        for (int i = 0; i < koeffizienten.length; i++) {
            wert += koeffizienten[i] * Math.pow(x, i);
        }
        return wert;
    }

    public static int getAnzahl() {
        return anzahl;
    }
}