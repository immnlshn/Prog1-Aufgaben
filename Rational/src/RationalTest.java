import java.util.Scanner;

public class RationalTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rational a = new Rational(sc.nextInt(), sc.nextInt());
        while (sc.hasNext()) {
            String op = sc.next();
            if (op.equals(".")) {
                break;
            }
            int zaehler = sc.nextInt();
            int nenner = sc.nextInt();
            switch (op) {
                case "+" -> a = a.add(new Rational(zaehler, nenner));
                case "-" -> a = a.sub(new Rational(zaehler, nenner));
                case "*" -> a = a.mul(new Rational(zaehler, nenner));
                case "/" -> a = a.div(new Rational(zaehler, nenner));
            }
        }
        System.out.println(a.toString());

    }
}
