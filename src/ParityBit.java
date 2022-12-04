public class ParityBit {

    public static void main(String[] args) {
        int wert = 0x18;
        int summe = 0;
        int paritätsbit = wert % 2;
        wert = wert >> 1;
        for (int i = 0; i < 4; i++) {
            summe = summe + (wert & 0x1);
            wert = wert >> 1;
        }
        System.out.println((summe % 2) == paritätsbit);
        System.out.println(summe);
        System.out.println(paritätsbit);
    }

}
