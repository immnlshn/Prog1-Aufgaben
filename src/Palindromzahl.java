public class Palindromzahl {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(spiegeln(n));
        System.out.println(spiegelAddieren(n));
        while (!palindromTest(n)) {
            n = spiegelAddieren(n);
        }
        System.out.println(n);
    }

    public static int spiegeln(int zahl) {
        int spiegelzahl = 0;
        while (zahl > 0) {
            spiegelzahl = spiegelzahl * 10 + zahl % 10;
            zahl = zahl / 10;
        }
        return spiegelzahl;
    }

    public static int spiegelAddieren(int zahl) {
        int spiegelzahl = 0;
        int tmp = zahl;
        while (tmp > 0) {
            spiegelzahl = spiegelzahl * 10 + tmp % 10;
            tmp = tmp / 10;
        }
        return zahl + spiegelzahl;
    }

    public static boolean palindromTest(int zahl) {
        return zahl == spiegeln(zahl);

    }

}
