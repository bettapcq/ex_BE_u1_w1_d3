package Es3;

import java.util.Arrays;

public class Carrello {

    //attributi:
    private final int cliente;
    private Articolo[] elencoArticoli;

    //costruttori:
    public Carrello(Cliente cliente) {
        this.cliente = cliente.getIdCliente();
        this.elencoArticoli = new Articolo[2];

    }

    //metodi:


    public int getTotalPrice() {
        int startTotal = 0;
        int finalTotal = 0;
        for (int i = 0; i < this.elencoArticoli.length; i++) {
            int price = elencoArticoli[i].getPrezzo();
            finalTotal += price;

        }
        return finalTotal;
    }

    public int getCliente() {
        return cliente;
    }

    public Articolo[] getElencoArticoli() {
        return elencoArticoli;
    }

    public void setElencoArticoli(Articolo[] elencoArticoli) {
        this.elencoArticoli = elencoArticoli;
    }

    @Override
    public String toString() {
        return "Carrello{" +
                "cliente=" + cliente +
                ", elencoArticoli=" + Arrays.toString(elencoArticoli) +
                '}';
    }
}




