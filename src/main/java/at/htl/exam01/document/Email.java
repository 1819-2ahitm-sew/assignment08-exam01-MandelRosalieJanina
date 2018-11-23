package at.htl.exam01.document;

public class Email extends Document {

    private String subject;
    private String to;

    public Email() {
    }

    public Email(String author, String subject, String to) {
        super(author);
        this.subject = subject;
        this.to = to;
    }

    @Override
    public String toString() {
        return "E-mail von" + this.author + " mit Betreff" + this.subject + "an" + this.to;
    }


}
