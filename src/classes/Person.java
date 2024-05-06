package classes;

import java.util.Scanner;

public class Person {
    private String vorname;
    private String nachname;
    private String dob;

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Person() {
        this("Max", "Muster", "30.03.1999");
    }

    public Person(String vorname, String nachname, String dob) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.dob = dob;
    }

    public void printIDCard() {
        System.out.println("Vorname ist: " + getVorname());
        System.out.println("Nachname ist: " + getNachname());
        System.out.println("Geburtstag am: " + getDob());
    }

    public void getData() {
        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Bitte Vorname eingeben");
        this.vorname = scan.nextLine();
        System.out.println("Bitte Nachname eingeben");
        this.nachname = scan.nextLine();
        System.out.println("Bitte Geburtstag eingeben");
        this.dob = scan.nextLine();
    }
}
