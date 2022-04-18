package cicciofr.istitutoscolastico.models;

/**
 * @author Francesco Ribatti
 * Definizione dell'oggetto Persona
 */
public class Persona {
    // variabili d'istanza
    private String nome;
    private String cognome;
    private int eta;

    // variabile di CLASSE con "static"    // è vista contestualmente da tutti i metodi/oggetti a crearsi
    public static int nrPersoneCreate = 0;

    /** Costruttore vuoto */
    public Persona(){
    }

    /**
     * Costruttore
     * @param nome      Nome della persona
     * @param cognome   Cognome della persona
     * @param eta       Età della persona
     */
    public Persona(String nome, String cognome, Integer eta) {
            // tipizzando la variabile quale Integer (la classe), e non col semplice int, è possibile assegnare valore null
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        nrPersoneCreate++;
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

    public Integer getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    /**
     * overload del metodo toString di Object
     * @return  attributi dell'oggetto in formato testo
     */
    @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", eta=" + eta +
                ", persone create=" + nrPersoneCreate +
                '}';
    }

    /**
     * metodo che stampa il nome dell'oggetto Persona
     * @param persona   Oggetto di tipo Persona
     */
    public static void stampaNome(Persona persona){
        System.out.println(persona.getNome());
    }
}
