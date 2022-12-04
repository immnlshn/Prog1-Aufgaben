public class Klausurnoten {

    public static void verarbeiteKlausurPunktzahl(int[] punkte, int[] punktGrenzen) {
        int besteNote = 5;
        int schlechtesteNote = 1;
        int anzahlBestanden = 0;
        int anzahlDurchgefallen = 0;
        float durchschnittsPunkte = 0;
        int[] notenVerteilung = new int[5];
        for (int i = 0; i < punkte.length; i++) {
            if (punkte[i] <= punktGrenzen[0]) {
                schlechtesteNote = 5;
                anzahlDurchgefallen++;
                durchschnittsPunkte += punkte[i];
                notenVerteilung[0]++;
            } else if (punkte[i] > punktGrenzen[0] && punkte[i] <= punktGrenzen[1]) {
                if (schlechtesteNote < 4) {
                    schlechtesteNote = 4;
                } else if (besteNote > 4) {
                    besteNote = 4;
                }
                anzahlBestanden++;
                durchschnittsPunkte += punkte[i];
                notenVerteilung[1]++;
            } else if (punkte[i] > punktGrenzen[1] && punkte[i] <= punktGrenzen[2]) {
                if (schlechtesteNote < 3) {
                    schlechtesteNote = 3;
                } else if (besteNote > 3) {
                    besteNote = 3;
                }
                anzahlBestanden++;
                durchschnittsPunkte += punkte[i];
                notenVerteilung[2]++;
            } else if (punkte[i] > punktGrenzen[2] && punkte[i] <= punktGrenzen[3]) {
                if (schlechtesteNote < 2) {
                    schlechtesteNote = 2;
                } else if (besteNote > 2) {
                    besteNote = 2;
                }
                anzahlBestanden++;
                durchschnittsPunkte += punkte[i];
                notenVerteilung[3]++;
            } else if (punkte[i] > punktGrenzen[3]) {
                if (schlechtesteNote < 1) {
                    schlechtesteNote = 1;
                } else if (besteNote > 1) {
                    besteNote = 1;
                }
                anzahlBestanden++;
                durchschnittsPunkte += punkte[i];
                notenVerteilung[4]++;
            }
        }
        durchschnittsPunkte /= punkte.length;
        System.out.println(punkte.length);
        System.out.println(besteNote + " " + schlechtesteNote);
        System.out.println(anzahlBestanden + " " + anzahlDurchgefallen);
        System.out.println(durchschnittsPunkte);
        gibHistogramm(umdrehen(notenVerteilung));


    }

    public static void gibHistogramm(int[] notenVerteilung) {
        for (int i = 1; i <= notenVerteilung.length; i++) {
            System.out.println(i + " " + notenVerteilung[i - 1]);
        }
    }

    public static int[] umdrehen(int[] x) {
        for (int i = 0; i < x.length / 2; i++) {
            int temp = x[i];
            x[i] = x[x.length - i - 1];
            x[x.length - i - 1] = temp;
        }
        return x;
    }
}
