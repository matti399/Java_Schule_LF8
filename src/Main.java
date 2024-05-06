import classes.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Anlegen eines Schülers:");
        Schueler Matti = new Schueler("Matti", "Schäwitz");
        Matti.getData();
        Matti.printIDCard();
        System.out.println("Anlegen eines Lehrers:");
        Lehrer Schmidtke = new Lehrer();
        Schmidtke.getData();
        Schmidtke.printIDCard();
    }
}
