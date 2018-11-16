package at.htl.exam01.document;

public abstract class Document {
    String autor;
    public Document(){}
    public Document(String autor){
        this.autor = autor;
    }

    public abstract String toString();


}
