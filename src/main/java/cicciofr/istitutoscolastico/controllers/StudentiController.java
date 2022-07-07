package cicciofr.istitutoscolastico.controllers;

import cicciofr.istitutoscolastico.models.Studente;
import cicciofr.istitutoscolastico.models.repository.StudenteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //decoratore | annotazione: questa risorsa rest (classe) contiene risorse rest, ovvero consumabili dall'esterno
@RequestMapping(value = "/studente")  // mappa le richieste che partono con indirizzo studente (equivalente del routing)
//indirizzo del controller
// con questo mappo tutti i metodi all'interno del controller, avrò in modo implicito //offre un mapping globale con
public class StudentiController {

    @GetMapping(value = "/selezionaStudente")
    public List<Studente> getStudenti(){
        return StudenteRepository.selectStudente();
    }

    @PostMapping(value = "/inserisciStudente")  // PostMapping inserire valore (indirizzo)
    public String inserisciStudente(@RequestBody Studente studente){
                // per indicare che ricevo il corpo dall'esterno - fatto come indicato dopo
            //  RequestBody -
        return StudenteRepository.insertStudente(studente);
            // qui ultimo passaggio del messaggio mostrato a video
    }

    @DeleteMapping(value = "/cancellaStudente/{nome}/{cognome}/{genere}")  // PostMapping inserire valore (indirizzo)
    public String cancellaStudente(@PathVariable("nome")String nome, @PathVariable("cognome")String cognome,
                                   @PathVariable("genere") String genere){
        // per indicare che ricevo il corpo dall'esterno - fatto come indicato dopo
        //  RequestBody -
        return StudenteRepository.cancellaStudente(nome, cognome, genere);
    }
    //in postMan verbo: Delete - url (solo) http://localhost:8081/studente/cancellaStudente/nomeDelCaso/cognomeDelCaso
}

//in browser per leggere.. http://localhost:8081/indirizzo del controller/indirizzo del metodo