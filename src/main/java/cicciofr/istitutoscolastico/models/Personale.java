package cicciofr.istitutoscolastico.models;

/**
 * @author Francesco
 * Definizione dell'oggetto Bidello
 */
public class Personale extends Persona {
    // variabili di ISTANZA
    private String sezione;
    private Integer nrBidello; // gli sarà assegnata la variabile static nrStudenti per conteggiare gli studenti creati

    // variabili di CLASSE con "static" visibili da tutta la classe
    private static Integer nrBidelliCreati = 0;  // sarà assegnata alla variabile nrStudente per conteggiare gli studenti creati

    /** Costruttore vuoto */
    public Personale() {
        nrBidello = nrBidelliCreati++;
    }

    /**
     * Costruttore dell'oggetto Bidello
     * @param nome           Nome del bidello
     * @param cognome        Cognome della bidello
     * @param eta            Età della bidello
     * @param sezione        sezioni da pulire
     */
    public Personale(String nome, String cognome, int eta, String sezione) {
        super(nome, cognome, eta);
        this.sezione = sezione;
        nrBidello = nrBidelliCreati++;
    }

    /**
     * Costruttore PARZIALE dell'oggetto Bidello
     * per iscrizione alla scuola senza mansioni
     * @param nome           Nome dello bidello
     * @param cognome        Cognome della bidello
     * @param eta            Età della bidello
     */
    public Personale(String nome, String cognome, int eta) {
        super(nome, cognome, eta);
        nrBidello = nrBidelliCreati++;
    }

    /** getter e setter */
    public String getSezione() {
        return sezione;
    }

    public void setSezione(String sezione) {
        this.sezione = sezione;
    }

    public static Integer getNrBidelliCreati() {
        return nrBidelliCreati;
    }

    @Override
    public String toString() {
        return "Scheda del bidello:\n" +
                "nome='" + getNome() + "\'\n" +
                "cognome='" + getCognome() + "\'\n" +
                "eta=" + getEta() + "\'\n" +
                "sezioni=" + sezione + "\'\n" +
                "bidello nr° " + nrBidello;
    }
}
