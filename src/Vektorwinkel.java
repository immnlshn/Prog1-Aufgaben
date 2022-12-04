

public class Vektorwinkel {

    public static double winkel(double[] v1, double[] v2) {
        return Math.acos(berechneSkalar(v1, v2) / (berechneBetrag(v1) * berechneBetrag(v2))) * (180
            / Math.PI);
    }

    public static double berechneSkalar(double[] v1, double[] v2) {
        double summe = 0;
        if (v1.length != v2.length) {
            return 0;
        }
        for (int i = 0; i < v1.length; i++) {
            summe += v1[i] * v2[i];
        }
        return summe;
    }

    public static double berechneBetrag(double[] v) {
        double summe = 0;
        for (int i = 0; i < v.length; i++) {
            summe += Math.pow(v[i], 2);
        }
        return Math.sqrt(summe);
    }
}
