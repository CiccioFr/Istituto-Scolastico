package cicciofr.istitutoscolastico.models;

import javax.swing.*;

/**
 * @author Francesco Ribatti
 * Classe per generare personale scolastico
 */
public class PopolaScuola {
    /**
     * Creazione di un Studente/Docente/Bidello
     * Il metodo chiede all'utente di inserire valori attributo
     * @param ruoloScelto immettere il tipo di personaggio da creare
     * @return persona dettagliata dall'utente
     */
    public static Persona popolaScuola(String ruoloScelto) {
        Persona persona = null;
        switch (ruoloScelto) {
            case "Studente":
                Studente studente = new Studente();
                studente.setNome(JOptionPane.showInputDialog(null, "Inserire il nome dello studente"));
                studente.setCognome(JOptionPane.showInputDialog(null, "Inserire il cognome dello studente"));
                studente.setEta(Integer.valueOf(JOptionPane.showInputDialog(null, "Inserire l'età dello studente")));
                studente.setSezione(JOptionPane.showInputDialog(null, "Inserire la sezione del corso di studi dello studente"));
                studente.setAnnoScolastico(Integer.parseInt(JOptionPane.showInputDialog(null, "Inserire l'anno scolastico dello studente")));
                studente.setGiorniFrequentati(Integer.parseInt(JOptionPane.showInputDialog(null, "Inserire quanti giorni di presenza ha lo studente (max240)")));
                studente.setNrCompitiAssegnati(Integer.parseInt(JOptionPane.showInputDialog(null, "Inserire quanti compiti sono stati assegnati allo studente")));
                studente.setNrCompitiSvolti(Integer.parseInt(JOptionPane.showInputDialog(null, "Inserire quanti compiti ha svolto lo studente")));
                System.out.println(studente);
                JOptionPane.showMessageDialog(null, studente, "scheda dello studente " + studente.getNome(), -1);
                persona = studente;
                break;
            case "Docente":
                Docente docente = new Docente();
                docente.setNome(JOptionPane.showInputDialog(null, "Inserire il nome del docente"));
                docente.setCognome(JOptionPane.showInputDialog(null, "Inserire il cognome del docente"));
                docente.setEta(Integer.parseInt(JOptionPane.showInputDialog(null, "Inserire l'età del docente")));
                docente.setSezione(JOptionPane.showInputDialog(null, "Inserire la sezione del corso di studi il cui il docente insegna"));
                docente.setNrCompitiAssegnati(Integer.valueOf(JOptionPane.showInputDialog(null, "Inserire quanti compiti ha assegnato il docente")));
                System.out.println(docente);
                JOptionPane.showMessageDialog(null, docente, "scheda del docente " + docente.getNome(), -1);
                persona = docente;
                break;
            case "Bidello":
                Bidello bidello = new Bidello();
                bidello.setNome(JOptionPane.showInputDialog(null, "Inserire il nome del bidello"));
                bidello.setCognome(JOptionPane.showInputDialog(null, "Inserire il cognome del bidello"));
                bidello.setEta(Integer.parseInt(JOptionPane.showInputDialog(null, "Inserire l'età del bidello")));
                bidello.setSezione(JOptionPane.showInputDialog(null, "Inserire quanti sezioni deve pulire il bidello"));
                System.out.println(bidello);
                JOptionPane.showMessageDialog(null, bidello, "scheda del bidello " + bidello.getNome(), -1);
                persona = bidello;
                break;
            default:
                System.exit(0);
                int voto = 189;
                Studente gatto = new Studente("marco", "verdi", 15);
                System.out.println(gatto);
                if (gatto.verificaPresenze(voto))
                    System.out.println("Promosso");
                else
                    System.out.println("Bocciato");

                System.out.println(gatto.getNome());
                Studente ciccio = new Studente("ciccio", "verdi", 15, "s", 12, 2, 5, 8);
                Studente gatto3 = new Studente("marco", "verdi", 15);
                Studente gatto4 = new Studente("marco", "verdi", 15);

                System.out.println("new Studente()");
                System.out.println(ciccio);
                System.out.println(gatto3);
                System.out.println(gatto4);
                break;
        }
        return persona;
    }
}
