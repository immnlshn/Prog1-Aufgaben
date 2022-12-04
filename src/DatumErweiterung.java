import java.util.Scanner;

public class DatumErweiterung {

    public static void main(String[] args) {
        //Jahr, Monat, Tag, Stunden und Minuten werden eingelesen und in Variablen gespeichert. Es werden Minuten addiert und das neue Datum wird augerechnet.

        //inputs per Scanner
        Scanner sc = new Scanner(System.in);
        int jahr = sc.nextInt();
        int monat = sc.nextInt();
        int tag = sc.nextInt();
        int stunden = sc.nextInt();
        int minuten = sc.nextInt();
        int minutenAdd = sc.nextInt();
        int minutenNeu = minuten + minutenAdd;
        int stundenNeu = stunden;
        int tagNeu = tag;
        int monatNeu = monat;
        int jahrNeu = jahr;
        //Wenn die Minuten größer als 59 sind, wird die Anzahl der Stunden addiert und die Minuten werden auf 0 gesetzt.
        if (minutenNeu > 59) {
            stundenNeu = stundenNeu + (minutenNeu / 60);
            minutenNeu = minutenNeu % 60;
        }
        //Wenn die Stunden größer als 23 sind, wird die Anzahl der Tage addiert und die Stunden werden auf 0 gesetzt.
        if (stundenNeu > 23) {
            tagNeu = tagNeu + (stundenNeu / 24);
            stundenNeu = stundenNeu % 24;
        }
        //Wenn der Monat 1, 3, 5, 7, 8, 10 oder 12 ist, wird die Anzahl der Tage addiert und die Monate werden auf 0 gesetzt.
        if (monatNeu == 1 || monatNeu == 3 || monatNeu == 5 || monatNeu == 7 || monatNeu == 8
            || monatNeu == 10 || monatNeu == 12) {
            if (tagNeu > 31) {
                monatNeu = monatNeu + (tagNeu / 31);
                tagNeu = tagNeu % 31;
            }
        }
        //Wenn der Monat 4, 6, 9 oder 11 ist, wird die Anzahl der Tage addiert und die Monate werden auf 0 gesetzt.
        if (monatNeu == 4 || monatNeu == 6 || monatNeu == 9 || monatNeu == 11) {
            if (tagNeu > 30) {
                monatNeu = monatNeu + (tagNeu / 30);
                tagNeu = tagNeu % 30;
            }
        }
        //Wenn der Monat 2 ist, wird die Anzahl der Tage addiert und die Monate werden auf 0 gesetzt.
        if (monatNeu == 2) {
            if (tagNeu > 28) {
                monatNeu = monatNeu + (tagNeu / 28);
                tagNeu = tagNeu % 28;
            }
        }
        //Wenn der Monat größer als 12 ist, wird die Anzahl der Jahre addiert und die Monate werden auf 0 gesetzt.
        if (monatNeu > 12) {
            jahrNeu = jahrNeu + (monatNeu / 12);
            monatNeu = monatNeu % 12;
        }
        //Das neue Datum wird ausgegeben.
        System.out.println(
            jahrNeu + " " + monatNeu + " " + tagNeu + " " + stundenNeu + " " + minutenNeu);

    }
}
