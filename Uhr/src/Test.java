public class Test {

    public static void main(String[] args) {
        Uhr u = new Uhr(9, 59, 59);
        System.out.println(u);
        u.tick();
        System.out.println(u);

        Sportuhr s = new Sportuhr();
        s.tick();
        System.out.println(s);
        s.setHerzfrequenz(91);
        s.wechselAnzeige();
        System.out.println(s);
    }
}
