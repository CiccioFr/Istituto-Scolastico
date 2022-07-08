DROP TABLE IF EXISTS studenti;

CREATE TABLE IF NOT EXISTS studenti (
    `stud_id` INT NOT NULL AUTO_INCREMENT,
    `stud_nome` VARCHAR(50) NOT NULL,
    `stud_cognome` VARCHAR(50) NOT NULL,
    `sesso` CHAR(1) NOT NULL,
    PRIMARY KEY (`stud_id`)) 
    ENGINE = InnoDB;

ALTER TABLE
    `studenti` CHANGE `sesso` `stud_sesso` CHAR(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL;

ALTER TABLE studenti
    ADD stud_data_nascita CHAR(8) NULL DEFAULT NULL AFTER stud_cognome,
    ADD stud_corso VARCHAR(50) NULL DEFAULT NULL AFTER stud_sesso,
    ADD stud_classe CHAR(2) NULL DEFAULT NULL AFTER stud_corso;

INSERT INTO
    studenti (
        stud_nome,
        stud_cognome,
        stud_data_nascita,
        stud_sesso) 
    VALUE   ('Alberto', 'Verdone', 11041999, 'm'),
            ('Mara', 'Green', 11041989, 'f'),
            ('Francesco', 'Verdone', 30112005, 'm'),
            ('Teresa', 'Brava', 06011998, 'f'),
            ('Francesco', 'Riba', 07072002, 'm');

INSERT INTO studenti (
        stud_nome,
        stud_cognome,
        stud_data_nascita,
        stud_sesso) 
    VALUE ('Giuseppe', 'Cardo', 05052001, 'm'),
    ('Silvia', 'Salemi', 11042002, 'f'),
    ('Ilaria', 'Fiore', 11041999, 'f'),
    ('Cristina', 'Ricordi', 15051988, 'f'),
    ('Domenico', 'Salute', 21121998, 'm'),
    ('Giulia', 'Ricca', 01041981, 'f'),
    ('Giovanni', 'della Valle', 01041991, 'm'),
    ('Luciana', 'Commercia', 01041994, 'f'),
    ('Luciano', 'Commercio', 01081994, 'm'),
    ('Lucio', 'Commercia', 01081994, 'm'),
    ('Dario', 'Sommo', 01041994, 'm');

SELECT * FROM studenti;