package at.htl.exam01.document;

import java.sql.BatchUpdateException;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    /**
     * Führen Sie hier folgendes durch:
     * <p>
     * 1. Erstellen Sie 2 Bücher und ein email
     * Buch: "Rowlings", "Harry Potter und der Stein der Weisen"
     * Email: "Susi", "Bewerbung", "CoolCompany"
     * Buch: "Tolkien", "lordOfTheRings"
     * <p>
     * 2. Erstellen Sie ein Document-Array und speichern Sie obige Dokumente in diesem Array.
     * <p>
     * 3. Geben Sir die Inhalte dieser Documente wie folgt aus.
     * Nutzen Sie dabei die Mechanismen der Vererbung.
     * Erstellen Sie außerdem geeignete toString-Methoden
     * <p>
     * 4. Zählen Sie die Bücher und emails im Array und geben Sie die jeweilige Anzahl aus.
     *
     * @param args
     */
    public static void main(String[] args) {
        Document[] documents = new Document[3];
        documents[0] = new Book("Rowling", "Harry Potter der Stein der Weisen");

        documents[1] = new Email("Susi", "Bewerbung", "CoolCompany");

        documents[2] = new Book("Tolkien", "lordOfTheRings");

        int buecherAnzahl = 0;
        int emailAnzahl = 0;


        for (int i = 0; i < documents.length; i++) {
            System.out.println(documents[i]);

        }

        for (int i = 0; i < documents.length; i++) {
            if (documents[i] instanceof Book) {
                buecherAnzahl++;
            } else if (documents[i] instanceof Email) {
                emailAnzahl++;
            }
        }

        System.out.println("Bücher" + buecherAnzahl);
        System.out.println("Emails" + emailAnzahl);
    }


}
