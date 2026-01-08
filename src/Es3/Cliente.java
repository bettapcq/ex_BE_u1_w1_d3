package Es3;

import java.time.LocalDate;
import java.util.Random;

public class Cliente {

    //attributi:
    private final int idCliente;
    private final String dataIscrizione;
    private String nome;
    private String cognome;
    private String email;

    //costruttori:
    public Cliente(String nome, String cognome, String email) {
        Random rndm = new Random();
        this.idCliente = rndm.nextInt(1, 10000);
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataIscrizione = LocalDate.now().toString();
    }


    //metodi:


    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", dataIscrizione='" + dataIscrizione + '\'' +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataIscrizione() {
        return dataIscrizione;
    }
}


