-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: hms
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `dischargedpatient`
--

DROP TABLE IF EXISTS `dischargedpatient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dischargedpatient` (
  `patient_id` varchar(7) NOT NULL,
  `name` varchar(30) NOT NULL,
  `father_name` varchar(30) NOT NULL,
  `DOB` varchar(11) NOT NULL,
  `gender` varchar(6) NOT NULL,
  `blood_group` varchar(5) NOT NULL,
  `address` varchar(60) NOT NULL,
  `email` varchar(40) NOT NULL,
  `P_no1` varchar(10) NOT NULL,
  `P_no2` varchar(10) DEFAULT NULL,
  `disease_type` varchar(10) DEFAULT NULL,
  `diseases` varchar(100) DEFAULT NULL,
  `admitted_on` varchar(25) NOT NULL,
  `Age` varchar(3) NOT NULL,
  `discharged_on` varchar(40) DEFAULT NULL,
  `AssignedWR` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`patient_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dischargedpatient`
--

LOCK TABLES `dischargedpatient` WRITE;
/*!40000 ALTER TABLE `dischargedpatient` DISABLE KEYS */;
INSERT INTO `dischargedpatient` VALUES ('23818','Latika Singh','Bhushan Kumar Singh','15/May/1992','Female','AB-','Bagh Bihar, Aligarh','Latika@gmail.com','9412500001','7895584581','Chronical','7895584581','2021/01/21 15:54:16','30','Date: 2021/02/02','Ward:2 Room:104'),('270759','Seema Ambani','Mukesh Ambaani','20/Oct/2000','Female','B-','Nagla Balchand, Agra','seema11@gmail.com','7895682454','','Allergy','','2021/02/03 20:40:13','21','Date: 2021/02/03','Ward:1 Room:6'),('358613','Aasha','Raghu Ram','1/Jan/1980','Female','O-','TYC, Kirawali','Aasha@gmail.com','9856472512','','Allergy','','2021/02/03 07:58:50','40','Date: 2021/02/03','Ward:1 Room:1'),('468407','Anita Singh','Mohanj Shah','11/Jun/1999','Female','O+',' Agra','Goldy@gmail.com','9412500001','','Chronical','','2021/01/21 15:57:09','21','Date: 2021/02/02','Ward:1 Room:1'),('479901','Chinku','Pinku','1/Jan/1997','Female','B+','Agra','chinku@gmail.com','7895648250','','Allergy','','2021/02/08 14:33:15','24','Date: 2021/02/08','Ward:1 Room:1'),('738138','Mukul Manohar','Ram Kishan ','5/May/1970','Male','A-','Aligarh','mukul8858@gmail.com','7854692358','','Allergy','','2021/02/03 07:45:31','51','Date: 2021/02/03','Ward:1 Room:1');
/*!40000 ALTER TABLE `dischargedpatient` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-02-21 21:49:08
