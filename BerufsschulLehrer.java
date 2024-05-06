package classes;

public class BerufsschulLehrer extends Lehrer {
    private String beruf;

    public String getBeruf() {
        return beruf;
    }

    public void setBeruf(String beruf) {
        this.beruf = beruf;
    }

    public BerufsschulLehrer() {
        this("LF8", "");
    }

    public BerufsschulLehrer(String lehrerSubject, String beruf) {
        super(lehrerSubject);
        this.setBeruf(beruf);
    }

    public void printIDCard() {
        super.printIDCard();
        System.out.println("Beruf ist: " + getBeruf());
    }

    public void getData() {
        super.getData();
        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte Beruf eingeben");
        this.beruf = scan.nextLine();
    }
}
