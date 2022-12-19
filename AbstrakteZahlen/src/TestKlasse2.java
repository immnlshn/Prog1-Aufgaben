public class TestKlasse2 {

    public static void main(String[] args) {
        System.out.println(gibZahl(4711));
    }

    public static String gibZahl(int wert) {
        return new ZahlKlasse(wert) {
            public String toString() {
                return "" + (getZahl() * 2);
            }
        }.toString();
    }
}
