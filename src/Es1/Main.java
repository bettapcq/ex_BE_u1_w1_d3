package Es1;

import static Es1.Rettangolo.stampaRettangolo;

public class Main {
    public static void main(String[] args) {
        Rettangolo r1 = new Rettangolo(12, 5);
        Rettangolo r2 = new Rettangolo(3, 7);

        stampaRettangolo(r1);
        stampaRettangolo(r2);

        Rettangolo.stampa2Rettangoli(r1, r2);
    }
}
