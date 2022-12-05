public class Stadion {

    public static void main(String[] args) {
        Person[] zuschauer = new Person[45000];
        for (int i = 0; i < zuschauer.length; i++) {
            zuschauer[i] = new Person("Zuschauer-" + (i+1));
        }
        Fussballspieler[] spieler = new Fussballspieler[5];
        for (int i = 1; i <= spieler.length; i++) {
            spieler[i-1] = new Fussballspieler("Spieler-rot-" + (i), 10000*i);
        }
        Mannschaft rot = new Mannschaft(spieler);

        spieler = new Fussballspieler[5];
        for (int i = 1; i <= spieler.length; i++) {
            spieler[i-1] = new Fussballspieler("Spieler-blau-" + (i), 20000*i);
        }
        Mannschaft blau = new Mannschaft(spieler);
        System.out.println(rot.toString());
        System.out.println(blau.toString());
        System.out.println(rot.einkommen());
        System.out.println(blau.einkommen());
        System.out.println(zuschauer[0].toString());

    }

}
