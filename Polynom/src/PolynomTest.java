public class PolynomTest {
    public static void main(String[] args) {
        Polynom polynom = new Polynom(new double[] {3, 2, 1});
        System.out.println(polynom.toString());
        System.out.println(polynom.auswerten(2));
        System.out.println(Polynom.getAnzahl());
    }
}