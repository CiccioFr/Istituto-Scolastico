## Progetto per la gestione di personale scolastico

Il programma è una esercitazione allo sviluppo, cercate di non pretendere troppo ;)  
L'applicazione permette la gestire (più sotto il profilo anagrafico/ruoli) del personale scolastico e degli studenti di alcuni istituti scolastici.  
Versione attuale 0.1. (ovvero è in piena fase di svilutto.)
Permette:
- inserimento in DB di:
  - Personale amministrativo dell'istituto
  - Corpo docenti
  - Studenti  
- creazione di classe popolata da studenti

<pre>
<details><summary>spoiler sviluppo</summary>
Il progetto mira alla realizzazione di:  
- un registro di classe  
  - per assenze quotidiane di ogni studente  
  - assegnamento voti per ogni studente in ogni materia
- Assegnare ad ogni docente la materia da insegnare
- Assegnare i docenti alle classi secondo calendarizzazione settimanale
</pre>
</details>

## Tecnologie utilizzate per la realizzazione dell'applicazione
### IDE
- IntelliJ IDEA Ultimate 2021
### Linguaggio di programmazione
- Java ver. 1.8.0_291 - SDK 13 - Oracle OpenJDK
### Framwork
- Spring
  - nota personale. [Spring Initializr](https://start.spring.io/) - Spring Boot 2.6.6
### Moduli:
- maven
- Spring.web
### Dipendenze
- Spring web
- JDBC API
- MySQL Driver
### Librerie:
- mysql.connector.java

---
# Struttura del Progetto
### UML 
[link](https://lucid.app/lucidchart/65024785-1780-476d-833c-ae7d0cb49cf8/edit?beaconFlowId=93C58C33F00DE370&invitationId=inv_95c6fde8-ba74-4883-b81a-599ca241810b&page=0_0#)
### DataBase
[file sql](allegati/DB/ReadMe.md)
- configurations
- controllers
  - `StudentiController.java`
- exception
- model
  - Studente.java
    - repository
    - `StudenteRepository.java`
- payloads
- DemoApplication.java - File di avvio dell'applicazione
### altro elemento importante:
- in resources/application.properties
  - server.port: 8081 //porta alternativa
--------

  