public class Feldspieler extends Fussballspieler implements TorSchiessen {
    public Feldspieler(String name){
        super(name);
    }
    public String torSchiessen(){
        return "Tor schiessen";
    }

}
