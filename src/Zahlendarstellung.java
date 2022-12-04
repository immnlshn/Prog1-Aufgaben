public class Zahlendarstellung {

    public static int[] ermittleZiffern(int x, int b) {
        int[] ziffern = new int[anzahlStellen(x, b)];
        for (int i = 0; i < ziffern.length; i++) {
            ziffern[i] = x % b;
            x = x / b;
        }
        return ziffern;
    }

    public static int anzahlStellen(int x, int b) {
        int anzahl = 0;
        while (x > 0) {
            anzahl++;
            x = x / b;
        }
        return anzahl;
    }


    public static int rekursivePotenz(int x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * rekursivePotenz(x, n - 1);
        }
    }
}
