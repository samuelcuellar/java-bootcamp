-- MySQL dump 10.13  Distrib 5.6.23, for Win32 (x86)
--
-- Host: localhost    Database: high_school
-- ------------------------------------------------------
-- Server version	5.6.23-log

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
-- Table structure for table `courses`
--

DROP TABLE IF EXISTS `courses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `courses` (
  `courses_id` int(11) NOT NULL AUTO_INCREMENT,
  `c_name` varchar(50) NOT NULL,
  `week_hours` int(11) NOT NULL,
  `shedule_time` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`courses_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `courses`
--

LOCK TABLES `courses` WRITE;
/*!40000 ALTER TABLE `courses` DISABLE KEYS */;
INSERT INTO `courses` VALUES (1,'Java Basics',6,'Three'),(2,'Java Intermedia',8,'two'),(3,'Java Advanded',8,'two'),(4,'Power Builder',8,'two'),(5,'Genexus',8,'two');
/*!40000 ALTER TABLE `courses` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `students`
--

DROP TABLE IF EXISTS `students`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `students` (
  `registration_number` int(11) NOT NULL AUTO_INCREMENT,
  `s_f_name` varchar(40) NOT NULL,
  `s_l_name` varchar(40) NOT NULL,
  `s_date_birth` date DEFAULT NULL,
  `partial_note1` double DEFAULT NULL,
  `partial_note2` double DEFAULT NULL,
  `partial_note3` double DEFAULT NULL,
  `final_note` double DEFAULT NULL,
  `courses_id` int(11) NOT NULL,
  PRIMARY KEY (`registration_number`),
  KEY `fk_students` (`courses_id`),
  CONSTRAINT `fk_students` FOREIGN KEY (`courses_id`) REFERENCES `courses` (`courses_id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `students`
--

LOCK TABLES `students` WRITE;
/*!40000 ALTER TABLE `students` DISABLE KEYS */;
INSERT INTO `students` VALUES (1,'Cristian','Salazar','1986-12-07',NULL,NULL,NULL,NULL,1),(2,'Benjamin','Matienzo','1986-12-07',NULL,NULL,NULL,NULL,1),(3,'Karina','Perez','1986-12-07',NULL,NULL,NULL,NULL,1),(4,'Pedro','Matienzo','1986-12-07',NULL,NULL,NULL,NULL,1),(5,'Juan','de la Hoya','1986-12-07',NULL,NULL,NULL,NULL,1),(6,'Mirian','Ogas','1986-12-07',NULL,NULL,NULL,NULL,1),(7,'Raul','Salazar','1986-12-07',NULL,NULL,NULL,NULL,1),(8,'Miguel','Estevez','1986-12-07',NULL,NULL,NULL,NULL,1),(9,'Patricia','Estevez','1986-12-07',NULL,NULL,NULL,NULL,1),(10,'Jose','Ros','1986-12-07',NULL,NULL,NULL,NULL,1),(11,'Agustin','Carrasco','1986-12-07',NULL,NULL,NULL,NULL,1),(12,'Matias','Diaz','1986-12-07',NULL,NULL,NULL,NULL,1),(13,'Marcelo','Soria','1986-12-07',NULL,NULL,NULL,NULL,1),(14,'Bruno','Diaz','1986-12-07',NULL,NULL,NULL,NULL,1),(15,'Juan','Perez','1999-04-29',NULL,NULL,NULL,NULL,2),(16,'Juan','Lopez','1999-04-29',NULL,NULL,NULL,NULL,2),(17,'Juan','Gomez','1999-04-29',NULL,NULL,NULL,NULL,2);
/*!40000 ALTER TABLE `students` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teacher`
--

DROP TABLE IF EXISTS `teacher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `teacher` (
  `teacher_id` int(11) NOT NULL AUTO_INCREMENT,
  `t_f_name` varchar(40) NOT NULL,
  `t_l_name` varchar(40) NOT NULL,
  `t_date_birth` date DEFAULT NULL,
  `courses_id` int(11) NOT NULL,
  PRIMARY KEY (`teacher_id`),
  KEY `fk_courses_id` (`courses_id`),
  CONSTRAINT `fk_courses_id` FOREIGN KEY (`courses_id`) REFERENCES `courses` (`courses_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacher`
--

LOCK TABLES `teacher` WRITE;
/*!40000 ALTER TABLE `teacher` DISABLE KEYS */;
INSERT INTO `teacher` VALUES (1,'Maria','Montenegro','1987-11-07',1),(2,'Jose Luis','De la Cruz','1987-11-07',2),(3,'Juan Pedro','Perez','1987-11-07',3);
/*!40000 ALTER TABLE `teacher` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-02-06 16:04:35
