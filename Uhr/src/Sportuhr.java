public class Sportuhr extends Uhr {
    private boolean anzeigeUhrzeit = true;
    private int herzfrequenz;
    public Sportuhr(){
        super();
    }

    public void setHerzfrequenz(int herzfrequenz){
        this.herzfrequenz = herzfrequenz;
    }
    public void wechselAnzeige(){
        anzeigeUhrzeit = !anzeigeUhrzeit;
    }

    @Override
    public String toString(){
        return anzeigeUhrzeit ? "Uhrzeit: " + super.toString() : "Herzfrequenz: " + herzfrequenz;
    }

}
