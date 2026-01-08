package Es3;


public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Betta", "Piac", "betta.piac@g.com");
        Cliente c2 = new Cliente("tizio", "caio", "tizio.caio@g.com");
        Articolo a1 = new Articolo("1234", "funzionale", 15);
        Articolo a2 = new Articolo("1244", "bello", 20);

        Articolo[] arrayArticoli = {a1, a2};
        Carrello car = new Carrello(c1);
        car.setElencoArticoli(arrayArticoli);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(car);
    }

}
