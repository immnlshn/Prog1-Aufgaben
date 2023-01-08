public class MessReihe {
    int n;
    MessDatum[] messdaten;
    private MessBereich umdrehungenBereich, oeltemperaturBereich, ladedruckBereich;
    public MessReihe(int n){
        this.n = n;
        messdaten = new MessDatum[n];
        umdrehungenBereich = new MessBereich(0, 12000, 8000);
        oeltemperaturBereich = new MessBereich(0, 200, 150);
        ladedruckBereich = new MessBereich(0, 6, 5);
    }

    public void neueMessung(int u, double t, double d) throws CriticalValue, IllegalValue, TooMuchData{
        for(int i = 0; i < n; i++){
            if(messdaten[i] == null){
                umdrehungenBereich.pruefen(u);
                oeltemperaturBereich.pruefen(t);
                ladedruckBereich.pruefen(d);
                messdaten[i] = new MessDatum(u, t, d);
                return;
            }
        }
        throw new TooMuchData("Fehler: Es wurden zu viele Messungen durchgeführt");
    }

    public double[] ermittleMittelwerte(){
        double[] mittelwert = new double[3];
        int count = 0;
        for(int i = 0; i < n; i++){
            if(messdaten[i] != null){
                mittelwert[0] += messdaten[i].getU();
                mittelwert[1] += messdaten[i].getT();
                mittelwert[2] += messdaten[i].getD();
                count++;
            }
        }
        mittelwert[0] /= count;
        mittelwert[1] /= count;
        mittelwert[2] /= count;
        return mittelwert;
    }
}
