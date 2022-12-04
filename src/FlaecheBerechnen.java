public class FlaecheBerechnen {

    public static float flaecheBerechnen(float[][] coord) {
        float flaeche = 0;
        for (int i = 0; i < coord.length; i++) {
            flaeche += ((coord[i][0] + coord[(i + 1) % coord.length][0]) * (
                coord[(i + 1) % coord.length][1] - coord[i][1])) / 2;
        }
        return Math.abs(flaeche);
    }
}

