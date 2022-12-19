public abstract class Zahl {

    public Zahl() {
    }


    public abstract Zahl addieren(Zahl zahl);

    public abstract Zahl subtrahieren(Zahl zahl);

    public abstract Zahl multiplizieren(Zahl zahl);

    public abstract Zahl dividieren(Zahl zahl);

    @Override
    public abstract String toString();

}
