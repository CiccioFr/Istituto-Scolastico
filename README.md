## Progetto con connessione al DB con JDBC by CiccioFr
### Progetto realizzato con IntelliJ IDEA Ultimate

Il programma è una esercitazione allo sviluppo, cercate di non pretendere troppo ;)  
Esso è una predisposizione a gestire (più sotto il profilo anagrafico/ruoli) il personale e gli studenti di alcuni istituti scolastici.  
Per gli studenti si sta creando un registro di classe.  
Attualmente è alla versione 0.1, ovvero è in piena fase di svilutto.  
Al momento è impostato per un singolo istituto ed una singola classe, e poco personale..  


### Java ver. 1.8.0_291
### SDK: 13 - Oracle OpenJDK
- ##### Sele
  - Spring Initializr - Spring Boot 2.6.6
### Dipendenze
- Spring web
- JDBC API
- MySQL Driver
### Moduli:
- maven
- Spring.web
### Librerie:
- mysql.connector.java
### Struttura del Progetto
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
### Il DB deve già esistere, dati pre-necessari: nome DB, account, PW  
Le tabelle possono essere ricreate facendo eseguire le query ai link sotto:  
- query per ricreare il DB -> [query unica](./allegati/DB)
- query esercitative per ricreare il DB 
  - Tabella [Istituti](./allegati/DB/Istituti.sql)
  - Tabella [Docenti](./allegati/DB/Docenti.sql)
  - Tabella [Personale](./allegati/DB/Personale.sql)
  - Tabella [Studenti](./allegati/DB/Studenti.sql)
