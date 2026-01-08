package Es1;

public class Main {
    public static void main(String[] args) {
        Rettangolo r1 = new Rettangolo(12, 5);
        Rettangolo r2 = new Rettangolo(3, 7);

        r1.stampaRettangolo();
        r2.stampaRettangolo();

        Es1.Rettangolo.stampa2Rettangoli(r1, r2);
    }
}
