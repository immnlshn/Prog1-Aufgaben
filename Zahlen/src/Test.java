public class Test {

    public static void main(String[] args) {
        Zahl z1 = new ReelleZahl(3);
        Zahl z2 = new ReelleZahl(5);
        System.out.println(z1.multiplizieren(z2));

        z1 = new KomplexeZahl(3, 1);
        z2 = new KomplexeZahl(5, 1);
        System.out.println(z1.multiplizieren(z2));

    }
}

