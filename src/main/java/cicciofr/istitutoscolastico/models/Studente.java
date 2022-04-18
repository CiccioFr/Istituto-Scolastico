package cicciofr.istitutoscolastico.models;

/**
 * @author Francesco
 * Definizione dell'oggetto Studente
 */
public class Studente extends Persona {
    // variabili di ISTANZA
    private String sezione;
    private Integer annoScolastico;
    private Integer giorniFrequentati;
    private Integer nrCompitiAssegnati;
    private Integer nrCompitiSvolti;
    private Integer nrStudente; // gli sarà assegnata la variabile static nrStudenti per conteggiare gli studenti creati

    // variabili di CLASSE con "static" visibili da tutta la classe
    private static final int GIORNI_DI_SCUOLA = 240;
    private static final int GIORNI_ASSENZE_AMMESSI = 50;
    private static Integer nrStudentiCreati = 0;  // sarà assegnata alla variabile nrStudente per conteggiare gli studenti creati

    /** Costruttore vuoto */
    public Studente() {
        nrStudente = nrStudentiCreati++;
    }

    /**
     * Costruttore dell'oggetto Studente
     * @param nome           Nome dello studente
     * @param cognome        Cognome della studente
     * @param eta            Età della studente
     * @param sezione        sezione a cui è iscritto
     * @param annoScolastico anno scolastico
     * @param giorniFrequentati     giorni frequentati dalle Studente
     * @param nrCompitiAssegnati    compiti assegnati allo Studente
     * @param nrCompitiSvolti       compiti svolti dallo Studente
     */
    public Studente(String nome, String cognome, int eta,
                    String sezione, Integer annoScolastico, Integer giorniFrequentati,
                    Integer nrCompitiAssegnati, Integer nrCompitiSvolti) {
        super(nome, cognome, eta);
        this.sezione = sezione;
        this.annoScolastico = annoScolastico;
        this.giorniFrequentati = giorniFrequentati;
        this.nrCompitiAssegnati = nrCompitiAssegnati;
        this.nrCompitiSvolti = nrCompitiSvolti;
        nrStudente = nrStudentiCreati++;
    }

    /**
     * Costruttore PARZIALE dell'oggetto Studente
     * per iscrizione alla scuola senza frequenza immediata
     * @param nome           Nome dello studente
     * @param cognome        Cognome della studente
     * @param eta            Età della studente
     */
    public Studente(String nome, String cognome, int eta) {
        super(nome, cognome, eta);
        nrStudente = nrStudentiCreati++;
    }

    /**
     * Costruttore PARZIALE dell'oggetto Studente
     * per fare delle PROVE!!!
     * @param nome           nome dello studente
     * @param sezione        sezione a cui è iscritto
     * @param annoScolastico anno scolastico
     */
    public Studente(String nome, String sezione, Integer annoScolastico) {
        super(nome, null, null);
        this.sezione = sezione;
        this.annoScolastico = annoScolastico;
        nrStudente = nrStudentiCreati++;
    }

    /** getter e setter */
    public String getSezione() {
        return sezione;
    }

    public void setSezione(String sezione) {
        this.sezione = sezione;
    }

    public Integer getAnnoScolastico() {
        return annoScolastico;
    }

    public void setAnnoScolastico(Integer annoScolastico) {
        this.annoScolastico = annoScolastico;
    }

    public Integer getGiorniFrequentati() {
        return giorniFrequentati;
    }

    public void setGiorniFrequentati(Integer giorniFrequentati) {
        this.giorniFrequentati = giorniFrequentati;
    }

    public Integer getNrCompitiAssegnati() {
        return nrCompitiAssegnati;
    }

    public void setNrCompitiAssegnati(Integer nrCompitiAssegnati) {
        this.nrCompitiAssegnati = nrCompitiAssegnati;
    }

    public Integer getNrCompitiSvolti() {
        return nrCompitiSvolti;
    }

    public void setNrCompitiSvolti(Integer nrCompitiSvolti) {
        this.nrCompitiSvolti = nrCompitiSvolti;
    }

    public Integer getNrStudente() {
        return nrStudente;
    }

    public void setNrStudente(Integer nrStudente) {
        this.nrStudente = nrStudente;
    }

    public static Integer getNrStudentiCreati() {
        return nrStudentiCreati;
    }

    public static void setNrStudentiCreati(Integer nrStudentiCreati) {
        Studente.nrStudentiCreati = nrStudentiCreati;
    }



    @Override
    public String toString() {
        return "Studente:\n" +
                "nome='" + getNome() + "\'\n" +
                "cognome='" + getCognome() + "\'\n" +
                "eta=" + getEta() + "\'\n" +
                "sezione=" + sezione + "\'\n" +
                "annoScolastico=" + annoScolastico + "\'\n" +
                "giorniFrequentati=" + giorniFrequentati + "\'\n" +
                "nrCompitiAssegnati=" + nrCompitiAssegnati + "\'\n" +
                "nrCompitiSvolti=" + nrCompitiSvolti + "\'\n" +
                "sudente nr° " + nrStudente;
    }

    /**
     * metodo che verifica il numero dei giorni di assenza dello studente
     * @param ggFrequenza  giorni di presenza a scuola dello studente
     * @return true se ha fatto poche assenze (forse promosso :)
     */
    public boolean verificaPresenze(int ggFrequenza) {
        setGiorniFrequentati(ggFrequenza);
        return GIORNI_DI_SCUOLA - getGiorniFrequentati() <= GIORNI_ASSENZE_AMMESSI;
    }

    public boolean svolgimentoCompiti(boolean svolgeCompiti) {
        return true;
    }
}
