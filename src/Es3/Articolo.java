package Es3;

public class Articolo {

    //attributi:
    private final String codice;
    private final String descrizione;
    private int prezzo;
    private int numeroInStock;


    //costruttori:
    public Articolo(String codice, String descrizione, int prezzo) {
        this.codice = codice;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.numeroInStock = 0;
    }

    //metodi:


    @Override
    public String toString() {
        return "Articolo{" +
                "codice='" + codice + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", prezzo=" + prezzo +
                ", numeroInStock=" + numeroInStock +
                '}';
    }

    public String getCodice() {
        return codice;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public int getNumeroInStock() {
        return numeroInStock;
    }

    public void setNumeroInStock(int numeroInStock) {
        this.numeroInStock = numeroInStock;
    }

}
