public class Torwart extends Fussballspieler implements Halten, TorSchiessen {

    public Torwart(String name) {
        super(name);
    }

    public String halten() {
        return "halten";
    }

    public String torSchiessen() {
        return "Tor schiessen";
    }
}
