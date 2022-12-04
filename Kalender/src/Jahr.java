public class Jahr {
    private int jahreszahl;
    private Tag[] tage = new Tag[365];
    private int belegteTage=0;
    public Jahr(int jahreszahl){
        this.jahreszahl = jahreszahl;
        for (int i = 0; i < tage.length; i++) {
            tage[i] = new Tag();
        }
    }

    public void eintragen(int tag, String termin, int prioritaet){
        if(tage[tag-1].getVerabredung() != null){
            System.out.println("Fehler: "+tage[tag-1].getVerabredung());
            return;
        }
        tage[tag-1].eintragen(termin, prioritaet);
        belegteTage++;
    }

    public String getTermin(int tag){
        return tage[tag-1].getVerabredung();
    }

    public int getPrioritaet(int tag){
        return tage[tag-1].getPrioritaet();
    }
    public int getBelegt(){
        return belegteTage;
    }
}
