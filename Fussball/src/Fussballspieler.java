public class Fussballspieler extends Person {

    private int einkommen;

    public Fussballspieler(String name, int einkommen) {
        super(name);
        this.einkommen = einkommen;
    }

    public int getEinkommen() {
        return this.einkommen;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.einkommen;
    }
}
