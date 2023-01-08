public class MessBereich {
    private double min,max,critical;

    public MessBereich(double min, double max, double critical){
        this.min = min;
        this.max = max;
        this.critical = critical;
    }

    public void pruefen(double wert) throws CriticalValue, IllegalValue{
        if(min > wert || wert > max){
            throw new IllegalValue("Fehler: Der eingegebene Wert liegt nicht im Messbereich");
        }
        if(wert > critical){
            throw new CriticalValue("Fehler: Der eingegebene Wert ist kritisch");
        }
    }
}
