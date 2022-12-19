public class Uhr {

    private int stunden = 0;
    private int minuten = 0;
    private int sekunden = 0;

    public Uhr(int stunden, int minuten, int sekunden) {
        this.stunden = stunden;
        this.minuten = minuten;
        this.sekunden = sekunden;
    }

    public Uhr() {
    }

    public void tick() {
        sekunden++;
        if (sekunden == 60) {
            sekunden = 0;
            minuten++;
        }
        if (minuten == 60) {
            minuten = 0;
            stunden++;
        }
        if (stunden == 24) {
            stunden = 0;
        }
    }

    public int getStunden() {
        return stunden;
    }

    public int getMinuten() {
        return minuten;
    }

    public int getSekunden() {
        return sekunden;
    }

    @Override
    public String toString() {
        return stunden + ":" + minuten + ":" + sekunden;
    }

}
