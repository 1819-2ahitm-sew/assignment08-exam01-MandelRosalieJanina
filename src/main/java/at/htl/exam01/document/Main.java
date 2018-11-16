package at.htl.exam01.document;

import java.sql.BatchUpdateException;
import java.util.Scanner;

public class Main {
static Scanner scanner = new Scanner(System.in);
    /**
     *
     * Führen Sie hier folgendes durch:
     *
     * 1. Erstellen Sie 2 Bücher und ein email
     *    Buch: "Rowlings", "Harry Potter und der Stein der Weisen"
     *    Email: "Susi", "Bewerbung", "CoolCompany"
     *    Buch: "Tolkien", "lordOfTheRings"
     *
     * 2. Erstellen Sie ein Document-Array und speichern Sie obige Dokumente in diesem Array.
     *
     * 3. Geben Sir die Inhalte dieser Documente wie folgt aus.
     *    Nutzen Sie dabei die Mechanismen der Vererbung.
     *    Erstellen Sie außerdem geeignete toString-Methoden
     *
     * 4. Zählen Sie die Bücher und emails im Array und geben Sie die jeweilige Anzahl aus.
     *
     * @param args
     */
    public static void main(String[] args) {



        int zaehler = 0;
        int buecherAnzahl =0;
        int emailAnzahl =0;
        Document[] documents = new Document[100];
        documents = readDokuments(documents);
        zaehler = readLines(zaehler,documents);

        for (int i = 0; i < zaehler; i++) {
            System.out.println(documents[i]);

        }

        for (int i = 0; i < zaehler; i++) {
            if (documents[i] instanceof Bücher){
                buecherAnzahl++;
            }else if(documents[i] instanceof Email){
                emailAnzahl++;
            }
        }

        System.out.println("Bücher"+buecherAnzahl);
        System.out.println("Emails" +emailAnzahl);
        }

    private static int readLines(int zahler, Document[] dokuments) {
        for (int i = 0; i < dokuments.length; i++) {
            if (dokuments[i] != null)
                zahler++;

        }
        return zahler;
    }

    private static Document[] readDokuments(Document[] documents) {

      documents[0]= new Bücher("Rowling","Harry Potter der Stein der Weisen");

      documents[1]= new Email("Susi","Bewerbung","CoolCompany");

      documents[2] = new Bücher("Tolkien","lordOfTheRings");


        return documents;

    }




}
