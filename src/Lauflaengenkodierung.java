import java.util.Scanner;

public class Lauflaengenkodierung {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zahl = -1;
        int anzahl = 0;
        String ausgabe = "";
        while (sc.hasNextInt()) {
            int i = sc.nextInt();
            if (zahl == i) {
                anzahl++;
            } else {
                if (anzahl > 0) {
                    ausgabe = ausgabe + anzahl + "x" + zahl + ".";
                }
                zahl = i;
                anzahl = 1;

            }
        }
        ausgabe = ausgabe + anzahl + "x" + zahl + ".";
        System.out.println(ausgabe);
        sc.close();
    }
}
