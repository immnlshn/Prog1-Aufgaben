import java.util.Objects;
import java.util.Scanner;

public class Fahrrad {

    static int schritte = 0;
    static String aktuelleTätigkeit = "";
    static int aktuelleGeschwindigkeit = 0;
    static int aktuelleRichtung = 0;
    static String ausgestreckteHand = null;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int eingabe = sc.nextInt();

            if (eingabe == -1) {

                return;
            }

            // I gonna get some speeeeeed
            if ((eingabe & 0x1) == 1) {
                // shit, this thing gets executed
                pedaleTreten();
                aktuelleTätigkeit += "[treten] ";
                // when we are too fast.... WE WILL DIE!!!
                if (aktuelleGeschwindigkeit > 50) {
                    System.out.println("zu schnell");
                    return;
                }
            }

            // Bitshifting to the right by 1
            eingabe = eingabe >> 1;

            // I could slow down by using the front brake in order not to die
            if ((eingabe & 0x1) == 1) {
                // braking in the front
                aktuelleTätigkeit += "[bremsen vorne] ";
                bremseVorne();
            }

            // Stil only bitshifting, nothing special
            eingabe = eingabe >> 1;

            // shit, I still don't wonna die, so I could brake by using the back brake
            if ((eingabe & 0x1) == 1) {
                // braking in the back
                aktuelleTätigkeit += "[bremsen hinten] ";
                bremseHinten();
            }

            // Damn, I'm still bitshifting
            eingabe = eingabe >> 1;

            // I gonna put my hand out to the left
            if ((eingabe & 0x1) == 1) {
                // when both hands are out... WE WILL DIE!!!
                if (ausgestreckteHand == "rechts") {
                    System.out.println("freihaendig");
                    return;
                }
                // otherwise, we will put our hand out.
                aktuelleTätigkeit += "[Hand links] ";
                linkeHandRaus();
            }

            // Bro, stop asking me to bitshift, I'm already doing it
            eingabe = eingabe >> 1;

            // I gonna put my hand out to the right
            if ((eingabe & 0x1) == 1) {
                // when both hands are out... WE WILL DIE!!!
                if (ausgestreckteHand.equals("links")) {
                    System.out.println();
                    return;
                }
                // otherwise, we will put our hand out.
                aktuelleTätigkeit += "[Hand rechts] ";
                rechteHandRaus();
            }

            // What, I'm still not done bitshifting?
            eingabe = eingabe >> 1;

            // I could turn left, if I want to
            if ((eingabe & 0x1) == 1) {
                // Damn, I'm not a gangstar
                if (ausgestreckteHand.equals("links")) {
                    linksAbbiegen();
                    handZurück();
                }
                // Fuck got busted
                else {
                    System.out.println("falsches Abbiegen");
                    return;
                }
            }

            // Again and again.... I'm still bitshifting
            eingabe = eingabe >> 1;

            // I could turn right, if the bit says so...
            if ((eingabe & 0x1) == 1) {
                // Damn, I'm not a gangstar
                if (ausgestreckteHand.equals("rechts")) {
                    rechtsAbbiegen();
                    handZurück();
                }
                // Fuck got busted
                else {
                    System.out.println("falsches Abbiegen");
                    return;
                }
            }

            schritte++;
        }
    }

    public static void pedaleTreten() {
        aktuelleGeschwindigkeit += 5;
    }

    public static void bremseVorne() {
        if (aktuelleGeschwindigkeit > 2) {
            aktuelleGeschwindigkeit -= 2;
        } else {
            aktuelleGeschwindigkeit = 0;
        }
    }

    public static void bremseHinten() {
        if (aktuelleGeschwindigkeit > 1) {
            aktuelleGeschwindigkeit -= 1;
        } else {
            aktuelleGeschwindigkeit = 0;
        }
    }

    public static void linkeHandRaus() {
        ausgestreckteHand = "links";
    }

    public static void rechteHandRaus() {
        ausgestreckteHand = "rechts";
    }

    public static void linksAbbiegen() {
        aktuelleRichtung -= 90;
    }

    public static void rechtsAbbiegen() {
        aktuelleRichtung += 90;
    }

    public static void handZurück() {
        ausgestreckteHand = null;
    }

    public static void ausgabe(String x) {
        System.out.println();
    }

}
