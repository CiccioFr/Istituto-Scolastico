package cicciofr.istitutoscolastico;

import cicciofr.istitutoscolastico.models.*;

import javax.swing.*;

import static cicciofr.istitutoscolastico.models.PopolaScuola.popolaScuola;

public class Test {
    public static void main(String[] args) {
        String[] elencoRuoliDisponibili = {"Studente", "Docente", "Bidello"};

        String sceltaNomeScuola = "Scegli il nome della scuola a cui sei interessato";
        String nomeScuola = JOptionPane.showInputDialog(null, sceltaNomeScuola,
                "Immetti nome scuola", JOptionPane.INFORMATION_MESSAGE).trim();
        boolean x = nomeScuola.length() > 0;
//        boolean x = nomeScuola.replace(" ", "").length() > 0;

        String msgBenvenuto = "Buongiorno,\nBenvenuto all'istituto " + nomeScuola;
        JOptionPane.showMessageDialog(null, msgBenvenuto, "Benvenuto", JOptionPane.PLAIN_MESSAGE);

        String testoSceltaRuolo = "Scegli il tuo ruolo all'interno dell'istituto " + nomeScuola;
        String ruoloScelto = (String) JOptionPane.showInputDialog(null,
                testoSceltaRuolo, "Scegli il tuo ruolo", 3, null, elencoRuoliDisponibili, elencoRuoliDisponibili[0]);

        /**
         *  crea l'oggetto Studente/Docente/Bidello dipendentemente dalla scelta dell'utente
        */
        popolaScuola(ruoloScelto);

        System.out.println();
        System.out.println("Scuola creata: " + nomeScuola);
        System.out.println("Ruolo scelto: " + ruoloScelto);

        System.out.println();
        System.out.println("Persone create: " + Persona.nrPersoneCreate);
        System.out.println("nr Sudenti creati: " + Studente.getNrStudentiCreati());
        System.out.println("nr Docenti creati: " + Docente.getNrDocentiCreati());
        System.out.println("nr Bidelli creati: " + Bidello.getNrBidelliCreati());

        assert x : "trovato False; Fine Programma";
        System.exit(0);
    }

}
