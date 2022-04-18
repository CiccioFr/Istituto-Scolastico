## Progetto con connessione al DB con JDBC by CiccioFr
### Progetto creato con IntelliJ IDEA Ultimate
- Spring Initializr - Spring Boot 2.6.6
### Dipendenze
- Spring web
- JDBC API
- MySQL Driver
### OpenJDK richiesto: superiore di 11 / 1.8
- a casa 17.0.2
### Moduli:
- maven
- Spring.web
### Librerie:
- mysql.connector.java
### Struttura del Progetto
- configurations
- controllers
- - StudentiController.java
- exception
- model
- - Studente.java
- - repository
- - - StudenteRepository.java
- payloads
- DemoApplication.java - File di avvio dell'applicazione
### altro elemento importante:
- in resources/application.properties
- - server.port: 8081 //porta alternativa
--------
* il DB deve già esistere, dati necessari: nome DB, account, PW
