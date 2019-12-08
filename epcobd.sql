-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 13, 2019 at 02:26 PM
-- Server version: 10.4.8-MariaDB
-- PHP Version: 7.3.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: 'epcobd'
--

-- --------------------------------------------------------

--
-- Table structure for table `cost'
--

CREATE TABLE `cost` (
  `SL No` int(11) NOT NULL,
  `Ticket_Cost` int(11) NOT NULL,
  `Manpower_Cost` int(11) NOT NULL,
  `Mofa_Cost` int(11) NOT NULL,
  `Total_Cost` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `passanger_details`
--

CREATE TABLE `passanger_details` (
  `SL No` int(255) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Passport No.` varchar(30) NOT NULL,
  `NID` varchar(30) NOT NULL,
  `Phone No.` varchar(12) NOT NULL,
  `Reff. Name` varchar(100) NOT NULL,
  `Country` varchar(50) NOT NULL,
  `Profession` varchar(30) NOT NULL,
  `Flight_date` date DEFAULT NULL,
  `Charge` int(100) DEFAULT NULL,
  `Recieve` int(100) DEFAULT 0,
  `Due` int(100) DEFAULT 0,
  `Cost` int(100) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `passanger_details`
--

INSERT INTO `passanger_details` (`SL No`, `Name`, `Passport No.`, `NID`, `Phone No.`, `Reff. Name`, `Country`, `Profession`, `Flight_date`, `Charge`, `Recieve`, `Due`, `Cost`) VALUES
(445, 'sgasga', '5637483', '53453', '5345345', 'fdfhfhsg', 'gaefasf', 'ewgesgesd', '2019-01-01', NULL, 0, 0, NULL),
(123, 'gbrr', '54545', '234', '643666', 'rbrgb', 'trgtrtg', 'sdgsdfs', '0000-00-00', NULL, 0, 0, 44),
(222, 'hhxhgc', '675', '675', '675', 'gfjhf', 'jhfjhfjf', 'gfgfhgf', NULL, NULL, 0, 0, NULL),
(1313, 'vvvvv', '45666', '6657', '121413', 'aaaaaa', 'bbbbb', 'nananan', NULL, NULL, 0, 0, NULL),
(112, 'hvhkvk', '15131', '35132', '3535651', 'hvjhvhjv', 'hvjhvhjvv', 'jhvytcgvh', NULL, 50000, 0, 0, NULL),
(115, 'saaaa', '98765', '12453', '35412', 'asas', 'sasa', 'trtr', NULL, 1000, 0, 0, 15000),
(96, 'tushar', '963852', '45748', '587547', 'rafsan', 'india', 'teacher', NULL, 50000, 0, 0, 0),
(65, 'rajib', '321321', '123123', '25252525', 'safkat', 'brunai', 'student', NULL, 50000, 50000, 0, 0),
(5151, 'jkbkjb', '854651', '64615', '5154', 'jgvjyv', 'ygyvyhv', 'hjvjvjhvh', '2019-06-05', 165151, 5156, 55465, 0),
(420, 'Safkat', '11111', '22222', '33333', 'rafsan', 'bd', 'teacher', '2019-11-11', 20000, 10000, 10000, 7000),
(52, 'Nusrat Jahan Rimi', 'j1a2n3i4n5a6', '3571523', '01628529839', 'Rafsan Pranto', 'Maldip', 'Student', '2025-11-12', 500000, 100000, 400000, 0);

-- --------------------------------------------------------

--
-- Table structure for table `reset_password`
--

CREATE TABLE `reset_password` (
  `Username` varchar(50) NOT NULL,
  `Password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `reset_password`
--

INSERT INTO `reset_password` (`Username`, `Password`) VALUES
('Hasaan', 'asd123'),
('Hasaan', '#��=\"�\'e_�c�e��'),
('Hasaan', 'r����]���8o�~/�'),
('Hamza', 'y�\",Y�����-��i'),
('Hamza', 'p��t��<�g.��.'),
('Hamza', '�jVd4�:����O'),
('Hasaan', '���RB��\Z���k�K�/'),
('Hasaan', '��4�g�9Ȉ��=��Y'),
('Hamza', '��Cz������-��D'),
('Hamza', '\'bB�i���8X�vb-�'),
('Hamza', 's�?tOw�:�KB�ʕ�'),
('Hamza', '>����]�h�*��`ge'),
('Hamza', '���}\0���\ZT$xP'),
('safkat', 'safkat'),
('asd', 'y�\",Y�����-��i'),
('asd', '��]?�0�|���E�2'),
('asas', '�OAU�ى����� l'),
('fshahid', '�k_�L�������'),
('fshahid', '�OL�y��5\rJ�8�݋'),
('shuvo', '�x��XC����d6)'),
('chadni', ')4��/c`�R�D?M>'),
('zczvzdv', 'S,��	]|��f����`a'),
('zczvzdv', '��\\J�x��S����l6'),
('zczvzdv', '�Ս�%g��w@28�Q�'),
('zczvzdv', '?>P�������1���|'),
('zczvzdv', 'z`���R�ޗ��q࿺'),
('zczvzdv', 'Z1X�������k�'),
('alvi', '�_|��phh��M�y'),
('Rimi', 'ꕤ_�oԲFt�odS�');

-- --------------------------------------------------------

--
-- Table structure for table `staff_info`
--

CREATE TABLE `staff_info` (
  `id` int(50) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Phone Number` varchar(14) NOT NULL,
  `Address` text NOT NULL,
  `Salary(tk)` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `staff_info`
--

INSERT INTO `staff_info` (`id`, `Name`, `Phone Number`, `Address`, `Salary(tk)`) VALUES
(1, 'Md. Alamgir Hossain', '01313131311', 'Keranigonj', '15000'),
(3, 'Riad Ajim', '01656565651', 'Kishorgonj', '8000'),
(4, 'fhxfgxfh', '23151223', 'fdzsgdx', '12000');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `full_name` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `phone number` varchar(11) NOT NULL,
  `Security Question` varchar(255) NOT NULL,
  `Answer` varchar(255) NOT NULL,
  `Reg_Date` date NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`full_name`, `username`, `email`, `password`, `phone number`, `Security Question`, `Answer`, `Reg_Date`) VALUES
('Alvi Rahman', 'alvi', 'alvi@gmail.com', '�_|��phh��M�y', '01345678', 'What primary school did you attend?', 'Barishal Central Memorial Academy', '2019-11-10'),
('asas', 'asas', 'aaa@gmail.com', '�OAU�ى����� l', '016545', '', '', '2019-11-09'),
('asd', 'asd', 'a@g.com', '��]?�0�|���E�2', '1213', '', '', '2019-11-09'),
('Sadia jabeen', 'chadni', 'chadni@gmail.com', ')4��/c`�R�D?M>', '016546545', 'mhvfhjcghc', 'gncgcgc', '2019-11-09'),
('farhana', 'farhana', 'fshahid@gmail.com', 'abc', '1738748', '', '', '2019-11-09'),
('farhana', 'fshahid', 'fshahid12@gmail.com', '�OL�y��5\rJ�8�݋', '0197384787', '', '', '2019-11-09'),
('Hamzah Usmani', 'Hamza', 'hamzahusmani00@gmail.com', 'asd', '127368132', '', '', '2019-11-09'),
('Shafkat', 'Hasaan', 'asd@asd.com', 'asd123', '12345', '', '', '2019-11-09'),
('Farhana Hossain', 'Khushi', 'farhana@gmail.com', 'khushi', '01671334874', '', '', '2019-11-09'),
('Md. Zakir Hoassin', 'mamunkhan', 'epcco550@gmail.com', 'mamun', '01712185146', '', '', '2019-11-09'),
('nagib shuvo', 'nagib', 'nagib@gmail.com', '12345', '01521334991', '', '', '2019-11-09'),
('Abdullah', 'pranto', 'rafsanpr@gmail.com', '12345', '01671334444', '', '', '2019-11-09'),
('Nusrat Jahan Rimi', 'Rimi', 'nusrat.rimi@northsouth.edu', 'ꕤ_�oԲFt�odS�', '01628529839', 'What primary school did you attend?', 'janina', '2019-11-13'),
('Safkat Karim', 'safkat', 'safkat@gmail.com', 'safkat', '01655555', '', '', '2019-11-09'),
('nagib ', 'shuvo', 'nagibcr7@yahoo.com', '�x��XC����d6)', '04752133', '', '', '2019-11-09'),
('Afia Ibnath Zarin', 'Zarin', 'zarin@gmail.com', 'zarin', '01561334874', '', '', '2019-11-09'),
('xfbfbsd', 'zczvzdv', 'vvvvvvdz@gddg.com', 'Z1X�������k�', '254353', 'What is the middle name of your oldest child?', 'asas', '2019-11-10');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `staff_info`
--
ALTER TABLE `staff_info`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `staff_info`
--
ALTER TABLE `staff_info`
  MODIFY `id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
