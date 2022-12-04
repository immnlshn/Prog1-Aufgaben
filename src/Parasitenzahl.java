public class Parasitenzahl {

    public static void main(String[] args) {
        long graenze = Long.parseLong(args[0]);
        for (long i = 1; i <= graenze; i++) {
            if (istParasit(i)) {
                System.out.println(i);
            }
        }
    }

    public static long parasitenZahl(long x) {
        long neueZahl = x % 10;
        neueZahl = neueZahl * (pow(10, gibStellen(x) - 1));
        neueZahl = neueZahl + (x / 10);
        return neueZahl;
    }

    public static long pow(long x, long y) {
        long ergebnis = 1;
        for (long i = 1; i <= y; i++) {
            ergebnis = ergebnis * x;
        }
        return ergebnis;
    }

    public static int gibStellen(long x) {
        int stellen = 0;
        while (x > 0) {
            x = x / 10;
            stellen++;
        }
        return stellen;
    }


    public static boolean istParasit(long x) {
        return (x * (x % 10)) == parasitenZahl(x);
    }
}
