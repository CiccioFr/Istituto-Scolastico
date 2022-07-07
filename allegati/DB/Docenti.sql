DROP TABLE IF EXISTS docenti;

CREATE TABLE IF NOT EXISTS docenti (
    `doc_id` INT NOT NULL AUTO_INCREMENT,
    `doc_nome` VARCHAR(50) NOT NULL,
    `doc_cognome` VARCHAR(50) NOT NULL,
    `sesso` CHAR(1) NOT NULL,
    `doc_materia` VARCHAR(50) NULL,
    PRIMARY KEY (`doc_id`)) ENGINE = InnoDB;

ALTER TABLE docenti ADD doc_data_nascita INT AFTER doc_cognome;
ALTER TABLE docenti ADD doc_preside TINYINT NOT NULL DEFAULT 0;
-- ALTER TABLE docenti ADD doc_preside BOOLEAN NOT NULL DEFAULT FALSE;
ALTER TABLE docenti ADD doc_materia INT NULL DEFAULT NULL;
ALTER TABLE docenti ADD doc_id_classe INT NULL DEFAULT NULL;

-- nella tabella 'docenti' Cambio nome attributo 'sesso' in 'doc_sesso'
ALTER TABLE `docenti` CHANGE `sesso` `doc_sesso` CHAR(1) NOT NULL;

-- nella tabella 'docenti' Cambio tipo all'attributo 'doc_data_nascita'  da INT(8) in 'DATE'
ALTER TABLE `docenti` CHANGE `doc_data_nascita` `doc_data_nascita` DATE NULL DEFAULT NULL;

INSERT INTO
    docenti (
        `doc_nome`,
        `doc_cognome`,
        `doc_data_nascita`,
        `doc_sesso`
    ) VALUE ('Caruso', 'Mizzega', '1977-02-18', 'm'),
            ('Giovanna', 'D arco', '1431-05-30', 'f'),
            ('Franco', 'Franchi', '1928-09-18', 'm'),
            ('Ciccio', 'Ingrassia', '1922-10-05', 'm'),
            ('Carlo', 'Magno', '742-04-02', 'm'),
            ('Giulio', 'Cesare', '100-07-12', 'm'),
            ('Alessandro', 'Manzoni', '1785-03-07', 'm'),
            ('Isaac', 'Newton', '1643-01-04', 'm'),
            ('Valeria', 'Bodina', '1981-07-27', 'f');

-- imposto Preside
UPDATE `docenti` SET `doc_preside` = 1
    WHERE `doc_nome` = 'Ciccio' AND `doc_cognome` = 'Ingrassia';

-- imposto Vice-Preside
UPDATE `docenti` SET `doc_preside` = 2
    WHERE `doc_nome` = 'Franco' AND `doc_cognome` = 'Franchi';

SELECT * FROM docenti;