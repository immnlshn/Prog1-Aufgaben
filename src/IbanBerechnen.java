import java.util.Scanner;

public class IbanBerechnen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String länderCode = normalisiereLänderCode(sc.next());
        String bankLeitzahl = sc.next();
        String kontoNummer = normalisiereKontoNummer(sc.next());
        System.out.println(erzeugeIban(länderCode, bankLeitzahl, kontoNummer));
    }

    public static String normalisiereLänderCode(String LänderCode) {
        return LänderCode.toUpperCase();
    }

    public static String normalisiereKontoNummer(String n) {
        if (n.length() < 10) {
            for (int i = n.length(); i < 10; i++) {
                n = "0" + n;
            }
        }
        return n;
    }

    public static String erzeugeBban(String länderCode, String bankLeitzahl, String kontoNummer) {
        return bankLeitzahl + kontoNummer + gibLändercodeInZahl(länderCode.charAt(0))
            + gibLändercodeInZahl(länderCode.charAt(1)) + "00";
    }

    public static int moduloBerechnung(String string) {
        if (string.length() < 3) {
            return Integer.parseInt(string);
        }
        String tmp = string;
        if (string.length() > 9) {
            tmp = string.substring(0, 9);
            string = string.replace(tmp, "");
            int zahl = Integer.parseInt(tmp);
            tmp = (zahl % 97) + string;
        } else {
            int zahl = Integer.parseInt(tmp);
            tmp = String.valueOf(zahl % 97);
        }
        return moduloBerechnung(tmp);
    }

    public static String erzeugeIban(String länderCode, String bankLeizahl, String kontoNummer) {
        String bban = erzeugeBban(länderCode, bankLeizahl, kontoNummer);
        int prüfzahl = 98 - moduloBerechnung(bban);
        if (prüfzahl < 10) {
            return länderCode + "0" + prüfzahl + bankLeizahl + kontoNummer;
        }
        return länderCode + prüfzahl + bankLeizahl + kontoNummer;

    }

    public static String gibLändercodeInZahl(char buchstabe) {
        int i = buchstabe - 64;
        i += 9;
        return String.valueOf(i);
    }


}