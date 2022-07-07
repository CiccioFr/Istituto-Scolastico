DROP TABLE IF EXISTS `istituti`;

CREATE TABLE IF NOT EXISTS `istituti` (
    `istituto_id` int(11) NOT NULL AUTO_INCREMENT,
    `istituto_nome` varchar(30) NOT NULL UNIQUE,
    `istituto_tipologia` varchar(30) NULL,
    `istituto_citta` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci,
    `istituto_indirizzo` varchar(60),
    PRIMARY KEY (`istituto_id`) ) ENGINE = InnoDB ;

START TRANSACTION;  -- Opzionale.   Richiede di specificare COMMIT o ROLLBACK.
                    -- Per Obbligare la dichiarazione di COMMIT o ROLLBACK => default SET autocommit = 0;

    INSERT INTO
        `istituti` (`istituto_nome`)
    VALUES ('Pitagora'),
            ('Leonardo'),
            ('Marconi'),
            ('Newton');

COMMIT;   -- di default COMMIT, Processa le query. Necessario se presente START TRANSACTION; l'antagonista e' ROLLBACK.

SELECT * FROM istituti;

-- -- Note --
-- carattere backtick ` (accento grave) (Protegge i nomi dei campi e tabelle che contengono caratteri speciali or parole chiave) */