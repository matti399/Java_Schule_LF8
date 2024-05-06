import classes.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Anlegen eines Schülers:");
        Schueler matti = new Schueler("Matti", "Schäwitz", "IT22/6");
        matti.getData();
        matti.printIDCard();
        System.out.println("Anlegen eines Lehrers:");
        Lehrer schmidtke = new Lehrer();
        schmidtke.getData();
        schmidtke.printIDCard();
    }
}
