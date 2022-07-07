## Progetto con connessione al DB con JDBC by CiccioFr
### Progetto creato con IntelliJ IDEA Ultimate
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
* il DB deve già esistere, dati necessari: nome DB, account, PW

query per ricreare il DB a questo [link](./allegati/DB/Docenti.sql)