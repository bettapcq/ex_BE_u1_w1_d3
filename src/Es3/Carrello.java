package Es3;

import java.util.Arrays;

public class Carrello {

    //attributi:
    private final int IdClienteAssociato;
    private final int TotCostoArticoli;
    private Articolo elencoArticoli[];

    //costruttori:
    public Carrello(int IdClienteAssociato) {
        this.IdClienteAssociato = IdClienteAssociato;
        this.elencoArticoli = new Articolo[0];
        this.TotCostoArticoli = getTotalPrice();

    }

    //metodi:
    public int getTotalPrice() {
        int startTotal = 0;
        int finalTotal = 0;
        for (int i = 0; i < this.elencoArticoli.length; i++) {
            finalTotal = startTotal + i;

        }
        return finalTotal;
    }

    @Override
    public String toString() {
        return "Carrello{" +
                "IdClienteAssociato=" + IdClienteAssociato +
                ", elencoArticoli=" + Arrays.toString(elencoArticoli) +
                ", TotCostoArticoli=" + TotCostoArticoli +
                '}';
    }

    public int getIdClienteAssociato() {
        return IdClienteAssociato;
    }

    public Articolo[] getElencoArticoli() {
        return elencoArticoli;
    }

    public void setElencoArticoli(Articolo[] elencoArticoli) {
        this.elencoArticoli = elencoArticoli;
    }

    public int getTotCostoArticoli() {
        return TotCostoArticoli;
    }
}
