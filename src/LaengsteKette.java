import java.util.Scanner;

public class LaengsteKette {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aktuelleZahl = 0;
        int laengsteKette = 0;
        int aktuelleKette = 1;
        while (sc.hasNextInt()) {
            int i = sc.nextInt();
            if (aktuelleZahl == i) {
                aktuelleKette++;
            } else {
                aktuelleZahl = i;
                aktuelleKette = 1;
            }
            if (aktuelleKette > laengsteKette) {
                laengsteKette = aktuelleKette;
            }
        }
        System.out.println(laengsteKette);
    }
}
