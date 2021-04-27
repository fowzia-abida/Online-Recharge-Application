-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Aug 28, 2016 at 08:09 AM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 7.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `std`
--

-- --------------------------------------------------------

--
-- Table structure for table `dbtable`
--

CREATE TABLE `dbtable` (
  `CardNumber` varchar(30) NOT NULL,
  `PinNumber` varchar(30) NOT NULL,
  `BankName` varchar(30) NOT NULL,
  `CardType` varchar(30) NOT NULL,
  `Balance` int(30) NOT NULL,
  `CBalance` int(30) NOT NULL,
  `PhoneNo` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dbtable`
--

INSERT INTO `dbtable` (`CardNumber`, `PinNumber`, `BankName`, `CardType`, `Balance`, `CBalance`, `PhoneNo`) VALUES
('123', '123', 'Brac Bank', 'American Express Card', 0, 200, '0123'),
('1', '1', 'Brac Bank', 'American Express Card', 770, 336, '123');

-- --------------------------------------------------------

--
-- Table structure for table `mbtable`
--

CREATE TABLE `mbtable` (
  `number` varchar(30) NOT NULL,
  `balance` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mbtable`
--

INSERT INTO `mbtable` (`number`, `balance`) VALUES
('123', 35);

-- --------------------------------------------------------

--
-- Table structure for table `mytable`
--

CREATE TABLE `mytable` (
  `name` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `pass` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mytable`
--

INSERT INTO `mytable` (`name`, `email`, `pass`) VALUES
('a', 'a', 'a'),
('a', 'b', 'a'),
('asd', 'c', 'a');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
