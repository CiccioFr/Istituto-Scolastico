package cicciofr.istitutoscolastico.models;

/**
 * @author Francesco
 * Definizione dell'oggetto docente
 */
public class Docente extends Persona {
    // variabili di ISTANZA
    private String sezione;
    private Integer nrCompitiAssegnati;
    private Integer nrDocente; // gli sarà assegnata la variabile static nrStudenti per conteggiare gli studenti creati

    // variabili di CLASSE con "static" visibili da tutta la classe
    private static Integer nrDocentiCreati = 0;  // sarà assegnata alla variabile nrStudente per conteggiare gli studenti creati

    /** Costruttore vuoto */
    public Docente() {
        nrDocente = nrDocentiCreati++;
    }

    /**
     * Costruttore dell'oggetto docente
     * @param nome           Nome del docente
     * @param cognome        Cognome del docente
     * @param eta            Età del docente
     * @param sezione        sezioni da gestire
     * @param nrCompitiAssegnati    compiti assegnati allo docente
     */
    public Docente(String nome, String cognome, int eta,
                   String sezione, Integer annoScolastico, Integer giorniFrequentati,
                   Integer nrCompitiAssegnati, Integer nrCompitiSvolti) {
        super(nome, cognome, eta);
        this.sezione = sezione;
        this.nrCompitiAssegnati = nrCompitiAssegnati;
        nrDocente = nrDocentiCreati++;
    }

    /**
     * Costruttore PARZIALE dell'oggetto docente
     * per iscrizione alla scuola senza cattedra
     * @param nome           Nome del docente
     * @param cognome        Cognome del docente
     * @param eta            Età del docente
     */
    public Docente(String nome, String cognome, int eta) {
        super(nome, cognome, eta);
        nrDocente = nrDocentiCreati++;
    }

    /** getter e setter */
    public String getSezione() {
        return sezione;
    }

    public void setSezione(String sezione) {
        this.sezione = sezione;
    }

    public Integer getNrCompitiAssegnati() {
        return nrCompitiAssegnati;
    }

    public void setNrCompitiAssegnati(Integer nrCompitiAssegnati) {
        this.nrCompitiAssegnati = nrCompitiAssegnati;
    }

    public static Integer getNrDocentiCreati() {
        return nrDocentiCreati;
    }

    @Override
    public String toString() {
        return "Scheda del docente:\n" +
                "nome='" + getNome() + "\'\n" +
                "cognome='" + getCognome() + "\'\n" +
                "eta=" + getEta() + "\'\n" +
                "sezione=" + sezione + "\'\n" +
                "nrCompitiAssegnati=" + nrCompitiAssegnati + "\'\n" +
                "docente nr° " + nrDocente;
    }
}
