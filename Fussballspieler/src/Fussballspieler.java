public abstract class Fussballspieler implements Finanzen{
    private String name;
    private int jahresgehalt;
    public Fussballspieler(String name){
        this.name = name;
        this.jahresgehalt = 0;
    }
    public String getName(){
        return this.name;
    }
    public int getJahresgehalt(){
        return this.jahresgehalt;
    }

    public void gehaltBeziehen(int gehalt){
        this.jahresgehalt += gehalt;
    }

    @Override
    public String toString(){
        return this.name + " " + this.getJahresgehalt();
    }
}
