package at.htl.exam01.document;

public class Bücher extends  Document{


    String titel;

    public Bücher(String autor,String titel){
     super(autor);
        this.titel = titel;
    }

    @Override
    public String toString() {
        return "Buch von"+this.autor+"mit dem Titel "+this.titel;
    }
}
