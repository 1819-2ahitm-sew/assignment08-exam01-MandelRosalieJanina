package at.htl.exam01.document;

public class Email extends Document {

String betreff;
String adresssat;

public Email(){}

    public Email(String autor,String betreff,String adresssat) {
        super(autor);
        this.betreff = betreff;
        this.adresssat = adresssat;
    }

    @Override
    public String toString() {
        return "E-mail von"+this.autor+" mit Betreff"+this.betreff+"an"+this.adresssat;
    }



}
