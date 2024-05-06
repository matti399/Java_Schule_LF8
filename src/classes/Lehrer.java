package classes;

import java.util.Scanner;

public class Lehrer extends Person {
    private String lehrerSubject;

    public String getLehrerSubject() {
        return lehrerSubject;
    }

    public void setLehrerSubject(String lehrerSubject) {
        this.lehrerSubject = lehrerSubject;
    }

    public Lehrer() {
        this.setLehrerSubject("LF8");
    }

    public void printIDCard() {
        super.printIDCard();
        System.out.println("Fach ist: " + getLehrerSubject());
    }

    public void getData() {
        super.getData();
        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte Fach eingeben");
        this.lehrerSubject = scan.nextLine();
    }
}
