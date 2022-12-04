public class BitQuersumme {

    public static void main(String[] args) {
        int wert = Integer.parseInt(args[0]);
        int summe = 0;
        for (int i = 0; i < 16; i++) {
            summe = summe + (wert & 0x1);
            wert = wert >> 1;
        }
        System.out.println(summe);

    }

}
