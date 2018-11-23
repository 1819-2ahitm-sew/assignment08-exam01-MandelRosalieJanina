package at.htl.exam01.document;

public class Book extends Document {


    private String title;


    public Book(String author, String title) {
        super(author);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Buch von" + this.author + "mit dem Titel " + this.title;
    }


}
