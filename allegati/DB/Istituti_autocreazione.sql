-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Creato il: Apr 18, 2022 alle 19:51
-- Versione del server: 10.4.22-MariaDB
-- Versione PHP: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `esercitazioni`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `istituti`
--

DROP TABLE IF EXISTS `istituti`;
CREATE TABLE IF NOT EXISTS `istituti` (
  `istituto_id` int(11) NOT NULL AUTO_INCREMENT,
  `istituto_nome` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dump dei dati per la tabella `istituti`
--

INSERT INTO `istituti` (`istituto_id`, `istituto_nome`) VALUES
(1, 'scuolaUno'),
(2, 'ScuolaDue');
COMMIT;
/*INSERT INTO `istituti` (`id`, `nome`) VALUES (NULL, 'scuolaUno'), (NULL, 'ScuolaDue');*/
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

/* carattere backtick ` (accento grave) (Protegge i nomi dei campi e tabelle che contengono caratteri speciali or parole chiave) */