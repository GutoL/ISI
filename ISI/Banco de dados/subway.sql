-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 26-Nov-2015 às 05:17
-- Versão do servidor: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `subway`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `venda`
--

CREATE TABLE IF NOT EXISTS `venda` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pao` varchar(32) NOT NULL,
  `tamanho` int(11) NOT NULL,
  `recheio` varchar(69) NOT NULL,
  `queijo` varchar(20) NOT NULL,
  `adicionais` varchar(100) NOT NULL,
  `vegetais` varchar(100) NOT NULL,
  `molho` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=19 ;

--
-- Extraindo dados da tabela `venda`
--

INSERT INTO `venda` (`id`, `pao`, `tamanho`, `recheio`, `queijo`, `adicionais`, `vegetais`, `molho`) VALUES
(4, 'Italiano', 15, 'Frango Teriaki', 'Suico', 'Nada', 'Nada', 'Babercue; Maionese; '),
(5, 'Italiano', 15, 'Frango Teriaki', 'Suico', 'Nada', 'Nada', 'Babercue; Maionese; '),
(6, 'Italiano', 15, 'Frango Teriaki', 'Suico', 'Nada', 'Nada', 'Nada'),
(7, 'Italiano', 15, 'Frango Teriaki', 'Suico', 'Nada', 'Nada', 'Nada'),
(8, '9 Graos', 15, 'Frango Teriaki', 'Suico', 'Nada', 'Nada', 'Nada'),
(9, 'Parmesao e Oregano', 15, 'Frango Teriaki', 'Suico', 'Nada', 'Nada', 'Nada'),
(10, 'Tres Queijos', 15, 'Frango Teriaki', 'Suico', 'Nada', 'Nada', 'Nada'),
(11, '9 Graos com Aveia e Mel', 15, 'Frango Teriaki', 'Suico', 'Nada', 'Nada', 'Nada'),
(12, '9 Graos', 15, 'Frango Teriaki', 'Suico', 'Nada', 'Nada', 'Nada'),
(13, 'Italiano', 15, 'Frango Teriaki', 'Suico', 'Nada', 'Nada', 'Nada'),
(14, 'Italiano', 15, 'B.M.T.', 'Suico', 'Nada', 'Nada', 'Nada'),
(15, 'Italiano', 15, 'Vegetariano', 'Suico', 'Nada', 'Nada', 'Nada'),
(16, 'Italiano', 15, 'Italiano', 'Suico', 'Nada', 'Nada', 'Nada'),
(17, 'Italiano', 15, 'Frango e Bacon Sublime', 'Suico', 'Nada', 'Nada', 'Nada'),
(18, 'Italiano', 15, 'B.M.T.', 'Suico', 'Nada', 'Nada', 'Nada');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
