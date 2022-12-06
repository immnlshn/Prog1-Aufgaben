public class GuterKunde extends Kunde {

    private final double rabatt;

    public GuterKunde(String vorname, String nachname, double rabatt) {
        super(vorname, nachname);
        this.rabatt = rabatt;
    }

    public double getRabatt() {
        return rabatt;
    }

    public String getRabattInProzent() {
        return (rabatt * 100) + "%";
    }
}
