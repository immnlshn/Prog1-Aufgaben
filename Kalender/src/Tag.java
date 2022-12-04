public class Tag {
    private String termin;
    private int prioritaet;
    public Tag(){
        this.termin=null;
        this.prioritaet=0;
    }
    public void eintragen(String termin, int priorität){
        this.termin = termin;
        this.prioritaet = priorität;
    }
    public String getVerabredung(){
        return termin;
    }
    public int getPrioritaet(){
        return prioritaet;
    }
}
