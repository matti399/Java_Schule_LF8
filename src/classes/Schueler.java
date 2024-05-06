package classes;

import java.util.Scanner;

public class Schueler extends Person {
    private String schuelerClass;

    public String getSchuelerClass() {
        return schuelerClass;
    }

    public void setSchuelerClass(String schuelerClass) {
        this.schuelerClass = schuelerClass;
    }

    public Schueler(String Vorname, String Nachname) {
        this.setVorname(Vorname);
        this.setNachname(Nachname);
        this.setSchuelerClass("IT22/6");
    }

    public void printIDCard() {
        super.printIDCard();
        System.out.println("Your Class is: " + getSchuelerClass());
    }

    public void getData() {
        super.getData();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Class");
        this.schuelerClass = scan.nextLine();
    }
}
