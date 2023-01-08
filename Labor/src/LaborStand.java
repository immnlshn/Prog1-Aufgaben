import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LaborStand {
    public static void main(String[] args){
        int maxAnzahlDatensaetze = Integer.parseInt(args[0]);
        MessReihe messReihe = new MessReihe(maxAnzahlDatensaetze);
        try {
            Scanner sc = new Scanner(new File(args[1]));
            while (sc.hasNext()){
                try {
                    int u = sc.nextInt();
                    double t = sc.nextDouble();
                    double d = sc.nextDouble();
                    try {
                        messReihe.neueMessung(u, t, d);
                    }
                    catch (CriticalValue e){
                        System.out.println(e.getMessage());
                        System.exit(1);
                    }
                    catch (IllegalValue | TooMuchData e){
                        System.out.println(e.getMessage());
                    }
                }
                catch (InputMismatchException e){
                    System.out.println("Fehler: Fehlerhafte Eingabe");
                    sc.next();
                }
            }
            sc.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Datei nicht gefunden");
        }
        double[] mittelwerte = messReihe.ermittleMittelwerte();
        System.out.println("Durchschnitt von Umdrehungszahl: " + mittelwerte[0]);
        System.out.println("Durchschnitt von Temperatur: " + mittelwerte[1]);
        System.out.println("Durchschnitt von Ladedruck: " + mittelwerte[2]);
    }
}
