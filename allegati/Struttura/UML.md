UML Progetto Scuola
Persona
    -   Attributi
        -   nome        String
        -   cognome     String
        -   eta         Integer

        -   static  (nrPersoneCreate)   Integer

    -   metodi
        -   costruttore     vuoto
        -   costruttore     (nome, cognome, eta, nrPersoneCreate)

        -   getNome     :   String
        -   getCognome  :   String
        -   getEta      :   Integer

        -   setNome         (nome)        String       **tipo opzionale: NON È ERRORE OMETTERLO
        -   setCognome      (cognome)     String
        -   setEta          (eta)         Integer

        -   toString        @Override
                :   String  (contiene attributi dell'oggetto in formato testo)

        -   static printNome       (persona) Persona
    -------------------------------------------------------

Studente extend Persona
    -   Attributi
        -   sezione                 char
        -   annoScolastico          Integer
        -   getGiorniFrequentati    Integer
        -   GIORNI_DI_SCUOLA        Integer
        -   GIORNI_DI_ASSENZA       Integer
        -   nrCompitiAssegnati      Integer
        -   nrCompitiSvolti         Integer

        -   static  (ntStudenti)   Integer

    -   metodi
        -   costruttore     vuoto
        -   costruttore     (super())
        -   costruttore     (super(), sezione, annoScolastico, ntStudenti)

        -   getSezione     :   char
        -   getCognome  :   String
        -   getEta      :   Integer

        -   setNome         (nome)        String       **tipo opzionale: NON È ERRORE OMETTERLO
        -   setCognome      (cognome)     String
        -   setEta          (eta)         Integer

        -   toString        @Override
                :   String  (contiene attributi dell'oggetto in formato testo)

        -   verificaAssenze    : Boolean
        -   svolgimentoCompiti : Boolean
    -------------------------------------------------------

Docente extend Persona
    -   Attributi
        -   classiSeguite   array<String>(sezione, annoScolastico)
    -   metodi
        -   assegnaCompiti  Boolean
    -------------------------------------------------------

Bidello extend Persona
    -   Attributi
        -   classiDaPulire  array<String>(sezione, annoScolastico)
    -   metodi
        -   puliziaClasse   (


___________________________________________________________________________________
come scrivere il ritorno di un metodo
static printNome   (persona) Persona  :   TipodiRitorno
