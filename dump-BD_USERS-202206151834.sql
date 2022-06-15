-- MySQL dump 10.13  Distrib 5.5.62, for Win64 (AMD64)
--
-- Host: 127.0.0.1    Database: BD_USERS
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.19-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tbl_phones`
--

DROP TABLE IF EXISTS `tbl_phones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_phones` (
  `co_phone` int(11) NOT NULL AUTO_INCREMENT,
  `tx_city_code` varchar(255) DEFAULT NULL,
  `co_user_fk` int(11) DEFAULT NULL,
  `tx_contry_code` varchar(255) DEFAULT NULL,
  `tx_number` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`co_phone`),
  KEY `FKrofv98pju4xqjg0tej0d5j2su` (`co_user_fk`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_phones`
--

LOCK TABLES `tbl_phones` WRITE;
/*!40000 ALTER TABLE `tbl_phones` DISABLE KEYS */;
INSERT INTO `tbl_phones` VALUES (1,'9',4,'56','32178229'),(2,'9',6,'56','32178229'),(3,'9',7,'56','32178229'),(4,'9',8,'56','32178229'),(5,'9',9,'56','32178229'),(6,'9',10,'56','32178229');
/*!40000 ALTER TABLE `tbl_phones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_users`
--

DROP TABLE IF EXISTS `tbl_users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_users` (
  `co_user` int(11) NOT NULL AUTO_INCREMENT,
  `fe_created` timestamp NOT NULL DEFAULT current_timestamp(),
  `tx_email` varchar(255) DEFAULT NULL,
  `tx_name` varchar(255) DEFAULT NULL,
  `tx_password` varchar(255) DEFAULT NULL,
  `fe_update` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  PRIMARY KEY (`co_user`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_users`
--

LOCK TABLES `tbl_users` WRITE;
/*!40000 ALTER TABLE `tbl_users` DISABLE KEYS */;
INSERT INTO `tbl_users` VALUES (1,'2022-06-15 17:15:47','leonardoeqv@gmail.com','Leonardo Villalobos','123456','2022-06-15 22:06:30'),(10,'2022-06-15 22:27:36','leonardoeqv3@gmail.com','leonardo villalobos','Leo1010','2022-06-15 22:27:36'),(9,'2022-06-15 22:07:29','leonardoeqv2@gmail.com','leonardo villalobos','12345','2022-06-15 22:07:29'),(8,'2022-06-15 22:06:58','leonardoeqv1@gmail.com','leonardo villalobos','leo123456','2022-06-15 22:06:58');
/*!40000 ALTER TABLE `tbl_users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'BD_USERS'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-15 18:34:34
