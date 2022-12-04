public class Vertauschen {

    public static void main(String[] args) {
        String[] inhalt = vertauscheInhalt(args);
        String[] referenz = vertauscheReferenz(args);
        if (!testeInhalt(inhalt, referenz)) {
            System.out.println("Fehler: Inhalte stimmen nicht ueberein!");
        }
        if (testeReferenz(inhalt, referenz)) {
            System.out.println("Fehler: Referenzen muessen unterschiedlich sein!");
        }
    }

    public static boolean testeInhalt(String[] x, String[] y) {
        for (int i = 0; i < x.length && i < y.length; i++) {
            if (!x[i].equals(y[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean testeReferenz(String[] x, String[] y) {
        for (int i = 0; i < x.length && i < y.length; i++) {
            if (!(x[i] == y[i])) {
                return false;
            }
        }
        return true;
    }

    public static String[] vertauscheInhalt(String[] x) {
        String[] y = new String[x.length];
        for (int i = 0; i < Math.round((float) x.length / 2); i++) {
            y[i] = "" + x[x.length - 1 - i];
            y[x.length - 1 - i] = "" + x[i];
        }
        return y;
    }

    public static String[] vertauscheReferenz(String[] x) {
        String[] y = new String[x.length];
        for (int i = 0; i < Math.round((float) x.length / 2); i++) {
            y[i] = x[x.length - 1 - i];
            y[x.length - 1 - i] = x[i];
        }
        return y;
    }
}
