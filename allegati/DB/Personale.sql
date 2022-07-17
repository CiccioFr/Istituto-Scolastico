DROP TABLE IF EXISTS personale;

CREATE TABLE IF NOT EXISTS personale (
    `per_id` INT NOT NULL AUTO_INCREMENT,
    `per_nome` VARCHAR(50) NOT NULL,
    `per_cognome` VARCHAR(50) NOT NULL,
    `per_sesso` CHAR(1) NOT NULL,
    `per_ruolo` VARCHAR(50) NOT NULL DEFAULT 'senza mansione',
    PRIMARY KEY (`per_id`)) ENGINE = InnoDB;

ALTER TABLE personale ADD per_data_nascita DATE DEFAULT NULL AFTER per_cognome;
    -- data_creazione timestamp not null default now(), 

INSERT INTO personale (
        per_nome,
        per_cognome,
        per_data_nascita,
        per_sesso
    ) VALUE ('Ponzio', 'Pilato', '1967-02-12', 'm'),
            ('Cesare', 'Valle', '1976-04-11', 'm'),
            ('Angela', 'Perla', '1974-09-13', 'f'),
            ('Giuseppina', 'Balena', '1976-05-19', 'f');

UPDATE personale SET per_ruolo = 'Segretario' WHERE per_nome = 'Angela' AND per_cognome = 'Perla';
UPDATE personale SET per_ruolo = 'Messo' WHERE per_nome = 'Ponzio' AND per_cognome = 'Pilato';
UPDATE personale SET per_ruolo = 'Bidello' WHERE per_nome = 'Cesare' AND per_cognome = 'Valle';
UPDATE personale SET per_ruolo = 'Bidello' WHERE per_nome = 'Giuseppina' AND per_cognome = 'Balena';

SELECT * FROM personale;