-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Nov 13, 2019 at 09:50 PM
-- Server version: 10.1.22-MariaDB
-- PHP Version: 7.1.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `footnews`
--

-- --------------------------------------------------------

--
-- Table structure for table `match`
--

CREATE TABLE `match` (
  `id` int(11) NOT NULL,
  `equipe1` varchar(20) NOT NULL,
  `equipe2` varchar(20) NOT NULL,
  `resultatEQ1` int(11) NOT NULL,
  `resultatEQ2` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `match`
--

INSERT INTO `match` (`id`, `equipe1`, `equipe2`, `resultatEQ1`, `resultatEQ2`) VALUES
(1, 'Kuwait', 'Qatar', 1, 2),
(2, 'SAUDI', 'Qatar', 5, 2),
(3, 'SPAIN', 'UAE', 2, 3);

-- --------------------------------------------------------

--
-- Table structure for table `news`
--

CREATE TABLE `news` (
  `id` int(11) NOT NULL,
  `titre` text NOT NULL,
  `contenu` text NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `news`
--

INSERT INTO `news` (`id`, `titre`, `contenu`, `date`) VALUES
(1, 'Ligue 1 : Quel prix à payer pour le PSG après le transfert de Neymar ?', 'LIGUE 1 - Pour s\'offrir Neymar, potentiel Ballon d\'or capable de le hisser dans une autre dimension, le PSG n\'a pas discuté du prix mais le club parisien, déjà sanctionné par le fair-play financier en 2014, risque de payer fort les 222 millions d\'euros déboursés s\'il ne dégage pas vite des revenus supplémentaires.\r\nL\'histoire retiendra que c\'est via une forme d\'acquisition méconnue en France que le PSG s\'est offert Neymar : l\'activation d\'une clause libératoire, payée par le club parisien pour le libérer du contrat le liant au FC Barcelone, et non par le biais d\'une transaction conventionnelle de club à club.', '2019-11-13'),
(2, 'Un retourné acrobatique et Arsenal lâche deux points à Guimaraes\r\n', 'LIGUE EUROPA - Arsenal a été tenu en échec ce mercredi sur la pelouse de Vitoria Guimaraes (1-1) lors de la 4e journée de la phase de groupes de la Ligue Europa. les Portugais sont revenus au score dans les derniers instants d\'un superbe retourné acrobatique. es hommes d\'Unai Emery restent en tête de leur groupe.', '2019-11-15'),
(3, 'Leonardo répond à Platini : \"Ça fait huit ans qu\'il dit ça (...) On peut parler de jalousie\"', 'LIGUE DES CHAMPIONS - Suite au succès parisien mercredi en Ligue des champions face à Bruges (1-0), Leonardo est revenu sur les propos de Michel Platini sur le club de la capitale. L\'ancien numéro 10 de l\'équipe de France a critiqué le manque de joueurs de nationalité française au sein de l\'effectif du PSG. Une affirmation que Leonardo ne comprend pas.', '2019-11-16');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `match`
--
ALTER TABLE `match`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `news`
--
ALTER TABLE `news`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `match`
--
ALTER TABLE `match`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `news`
--
ALTER TABLE `news`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
