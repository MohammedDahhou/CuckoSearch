-- phpMyAdmin SQL Dump
-- version 4.6.6
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Generation Time: Apr 18, 2017 at 02:34 PM
-- Server version: 5.6.35
-- PHP Version: 5.5.38

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database: `CuckoSearch`
--

-- --------------------------------------------------------

--
-- Table structure for table `Intervention`
--

CREATE TABLE `Intervention` (
  `Id` int(255) NOT NULL,
  `Patient` int(255) NOT NULL,
  `Periode` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Intervention`
--

INSERT INTO `Intervention` (`Id`, `Patient`, `Periode`) VALUES
(16, 1, 1),
(17, 1, 9),
(18, 1, 4),
(19, 1, 16),
(20, 2, 1),
(21, 2, 20),
(22, 2, 7),
(23, 2, 13),
(24, 3, 3),
(25, 3, 13),
(26, 3, 1),
(27, 3, 2),
(28, 3, 20),
(29, 20, 20),
(30, 20, 1),
(31, 20, 19);

-- --------------------------------------------------------

--
-- Table structure for table `Patient`
--

CREATE TABLE `Patient` (
  `Id` int(255) NOT NULL,
  `Nom` varchar(255) NOT NULL,
  `Prénom` varchar(255) NOT NULL,
  `Age` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Patient`
--

INSERT INTO `Patient` (`Id`, `Nom`, `Prénom`, `Age`) VALUES
(1, 'ouassi', 'younes', 25),
(2, 'dahhou', 'mohammed', 23),
(3, 'dodo', 'fofo', 30),
(20, 'test', 'test', 44);

-- --------------------------------------------------------

--
-- Table structure for table `Periode`
--

CREATE TABLE `Periode` (
  `Id` int(255) NOT NULL,
  `Debut` time(4) NOT NULL,
  `Fin` time(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Periode`
--

INSERT INTO `Periode` (`Id`, `Debut`, `Fin`) VALUES
(1, '08:00:00.0000', '08:30:00.0000'),
(2, '08:30:00.0000', '09:00:00.0000'),
(3, '09:00:00.0000', '09:30:00.0000'),
(4, '09:30:00.0000', '10:00:00.0000'),
(5, '10:00:00.0000', '10:30:00.0000'),
(6, '10:30:00.0000', '11:00:00.0000'),
(7, '11:30:00.0000', '12:00:00.0000'),
(8, '12:00:00.0000', '12:30:00.0000'),
(9, '12:30:00.0000', '13:00:00.0000'),
(10, '13:00:00.0000', '13:30:00.0000'),
(11, '13:30:00.0000', '14:00:00.0000'),
(12, '14:00:00.0000', '14:30:00.0000'),
(13, '14:30:00.0000', '15:00:00.0000'),
(14, '15:00:00.0000', '15:30:00.0000'),
(15, '15:30:00.0000', '16:00:00.0000'),
(16, '16:00:00.0000', '16:30:00.0000'),
(17, '16:30:00.0000', '17:00:00.0000'),
(18, '17:00:00.0000', '17:30:00.0000'),
(19, '17:30:00.0000', '18:00:00.0000'),
(20, '18:00:00.0000', '18:30:00.0000');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Intervention`
--
ALTER TABLE `Intervention`
  ADD PRIMARY KEY (`Patient`,`Periode`) USING BTREE,
  ADD UNIQUE KEY `Id` (`Id`) USING BTREE,
  ADD KEY `Periode` (`Periode`) USING BTREE,
  ADD KEY `Patient` (`Patient`) USING BTREE;

--
-- Indexes for table `Patient`
--
ALTER TABLE `Patient`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `Periode`
--
ALTER TABLE `Periode`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Intervention`
--
ALTER TABLE `Intervention`
  MODIFY `Id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;
--
-- AUTO_INCREMENT for table `Patient`
--
ALTER TABLE `Patient`
  MODIFY `Id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;
--
-- AUTO_INCREMENT for table `Periode`
--
ALTER TABLE `Periode`
  MODIFY `Id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `Intervention`
--
ALTER TABLE `Intervention`
  ADD CONSTRAINT `intervention_ibfk_1` FOREIGN KEY (`Patient`) REFERENCES `Patient` (`Id`),
  ADD CONSTRAINT `intervention_ibfk_2` FOREIGN KEY (`Periode`) REFERENCES `Periode` (`Id`);
