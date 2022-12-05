public class Mannschaft {

    private Fussballspieler[] spieler;

    public Mannschaft(Fussballspieler s1, Fussballspieler s2, Fussballspieler s3,
        Fussballspieler s4, Fussballspieler s5) {
        this.spieler = new Fussballspieler[5];
        this.spieler[0] = s1;
        this.spieler[1] = s2;
        this.spieler[2] = s3;
        this.spieler[3] = s4;
        this.spieler[4] = s5;
    }

    public Mannschaft(Fussballspieler[] spieler) {
        this.spieler = spieler;
    }

    public int einkommen() {
        int ergebnis = 0;
        for (int i = 0; i < spieler.length; i++) {
            ergebnis += spieler[i].getEinkommen();
        }
        return ergebnis;
    }

    @Override
    public String toString() {
        String out = "";
        int i;
        for (i = 1; i <= spieler.length; i++) {
            out += i + ". " + spieler[i - 1].getName() + "\n";
        }
        return out;
    }
}
