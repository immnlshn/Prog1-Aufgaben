public class KlausurAufgabe {


    public static void main(String[] args) {
        Grad b = new Grad(7, 11, 1, "Ost", 50, 46, 50, "Nord");
        Grad p = new Grad(6, 5, 50, "Ost", 50, 47, 28, "Nord");
        Projektionskoordinaten pk = new Projektionskoordinaten(b);
        double[] out = pk.berechneProjektionskoordinaten(b);
        System.out.println(b.gibLaengengrad());
        System.out.println(p.gibLaengengrad());
        System.out.println("x " + out[0]);
        System.out.println("y: " + out[1]);
    }


    private static class Grad {

        private final double laengengrad;
        private final double breitengrad;

        public Grad(int lgrad, int lminuten, int lsekunden, String lrichtung, int bgrad,
            int bminuten, int bsekunden, String brichtung) {
            laengengrad = umwandelnInGrad(lgrad, lminuten, lsekunden, lrichtung);
            breitengrad = umwandelnInGrad(bgrad, bminuten, bsekunden, brichtung);
        }

        public static double umwandelnInGrad(int grad, int minuten, int sekunden, String richtung) {
            double wert = grad + (minuten / 60) + (sekunden / 3600);
            if (richtung.equals("West") || richtung.equals("Süd")) {
                wert = 0 - wert;
            }
            return wert;
        }

        public double gibLaengengrad() {
            return laengengrad;
        }

        public double gibBreitengrad() {
            return breitengrad;
        }
    }


    private static class Projektionskoordinaten {

        private final Grad basis;

        public Projektionskoordinaten(Grad basis) {
            this.basis = basis;
        }


        public double[] berechneProjektionskoordinaten(Grad punkt) {
            double[] out = new double[2];
            out[0] = punkt.gibLaengengrad() - basis.gibLaengengrad();
            out[1] =
                (1.0 / 2.0) * Math.log(1 + Math.sin((punkt.gibBreitengrad() * Math.PI) / 180)) / (1
                    - Math.sin((punkt.gibBreitengrad() * Math.PI) / 180));
            return out;
        }

    }

}
