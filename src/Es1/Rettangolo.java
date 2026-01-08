package Es1;

public class Rettangolo {

    //attributi:
    private final double altezza;
    private final double larghezza;

    //costruttore:
    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public static void stampa2Rettangoli(Rettangolo a, Rettangolo b) {
        stampaRettangolo(a);
        stampaRettangolo(b);
        System.out.println("Tot area rettangoli: " + (a.getArea() + b.getArea()));
        System.out.println("Tot perimetro rettangoli: " + (a.getPerimeter() + b.getPerimeter()));
    }

    public static void stampaRettangolo(Rettangolo rettangolo) {     // correzione : la consegna chiedeva di passare il rettangolo come parametro
        System.out.println("Il perimetro è: " + rettangolo.getPerimeter());
        System.out.println("L'area è: " + rettangolo.getArea());
        ;
    }

    //metodi:
    public double getPerimeter() {
        return (this.altezza + this.larghezza) * 2;
    }

    public double getArea() {
        return this.altezza * this.larghezza;
    }

    @Override
    public String toString() {
        return "Rettangolo{" +
                "altezza=" + altezza +
                ", larghezza=" + larghezza +
                '}';
    }
}
