package cicciofr.istitutoscolastico.models.repository;
// repository sono i metodi che permettono la connessione al DB
//driverManager - permette la connessione

import cicciofr.istitutoscolastico.models.Studente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudenteRepository {
    private static final  String URL = "jdbc:mysql://localhost:3306/istituto";
    private static final  String USER = "docente";
    private static final  String PASSWORD = "password";

    /**
     * Metodo che serve a selezionare tutti gli studenti
     * presenti all'interno del nostro DB
     * @return lista degli studenti presenti
     */
    public static List<Studente> selectStudente(){
        try{
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD); // apre la connessione
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM studenti");
                //altro metodo: dopo = invochi una funzione che crei all'interno del DB
            List<Studente> studenteList = new ArrayList<>();
            while (rs.next()){  // next restituisce True quando trova una riga
                Studente st = new Studente(rs.getString("stud_nome"),
                                            rs.getString("stud_cognome"),
                        Integer.parseInt(rs.getString("stud_data_nascita")));
                studenteList.add(st);
            }
            conn.close();   //chiude la connessione
            stmt.close();   //non esegue più quella
            return studenteList;
        }
        catch (SQLException ex){
            System.out.println("SQLException" + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return new ArrayList<>(); // opp. null
    }

    public static String insertStudente(Studente studente)
    // possibile dichiarare metodo (volendo) anche void o String
    {
        try{
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement preparedStatement = conn.prepareStatement("" +
                    "INSERT INTO studente(stud_nome, stud_cognome, stud_sesso) VALUES(?, ?, ?)");
            preparedStatement.setString(1, studente.getNome());
            // possiamo inserire String o anche altro... .setAltro
            preparedStatement.setString(2, studente.getCognome());
            preparedStatement.setString(3, String.valueOf(studente.getEta()));
            int row = preparedStatement.executeUpdate();    //aggiorna ed esegue preparedStatement
            conn.close();   //chiude la connessione
            return ("studente " + studente.getNome() + " inserito").toUpperCase();    // return per un feedback
        }
        catch (SQLException ex){
            System.out.println("SQLException" + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            return "errore di " + ex.getMessage();

        }
    }

    public static String cancellaStudente(String nome, String cognome, String sesso)
    // possibile dichiarare metodo (volendo) anche void o String
    {
        try{
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement preparedStatement = conn.prepareStatement("" +
                    "DELETE FROM STUDENTE WHERE stud_nome=? AND stud_cognome=? AND stud_sesso=?");
            preparedStatement.setString(1, nome);
            // possiamo inserire String o anche altro... .setAltro
            preparedStatement.setString(2, cognome);
            preparedStatement.setString(3, sesso);
            int row = preparedStatement.executeUpdate();    //aggiorna ed esegue preparedStatement
            conn.close();   //chiude la connessione
            return ("Lo studente " + nome + " è stato eliminato".toUpperCase());    // return per un feedback
        }
        catch (SQLException ex){
            System.out.println("SQLException" + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            return "errore di " + ex.getMessage();

        }
    }
}
