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
-- Table structure for table `patient`
--

DROP TABLE IF EXISTS `patient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patient` (
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
  `date_time` varchar(25) NOT NULL,
  `Age` varchar(3) NOT NULL,
  PRIMARY KEY (`patient_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient`
--

LOCK TABLES `patient` WRITE;
/*!40000 ALTER TABLE `patient` DISABLE KEYS */;
INSERT INTO `patient` VALUES ('11688','Jay Narayan','Manoj Shah','11/Jun/1999','Male','O+','Allahabad','Goldy@gmail.com','9412500001','','Chronical','Cardiac failureCardiomyopathyBronchiectasis','2021/01/21 15:44:51','21'),('209545','Nikhil Yadav ','Manohar Lal Yadav','6/Jun/2005','Male','O-','TYC, Agra','Manohar@gmail.com','8956471246','','Allergy','Ulcerative colitis','2021/02/02 22:39:00','16'),('349136','Kamal Rathor','Mukul Rathor','6/July/1953','Male','O-','Agra','Kamal@gmail.com','7845963255','','Allergy','Cardiomyopathy','2021/01/31 23:37:38','67'),('401003','Anjali Kumari ','Radhe Kumar','15/Jan/1998','Female','O+','Aligarh','aj1511@gmail.com','7896584557','','Allergy','Asthma','2021/01/21 15:49:14','23'),('412223',' Sachin Kumar','Ashok Kumar','11/Jun/1999','Male','O+','Allahabad','Goldy@gmail.com','9412500001','','Chronical','Cardiac failureCardiomyopathyBronchiectasis','2021/01/21 15:58:25','21'),('412824','Jay Narayan','Manoj Shah','11/Jun/1999','Male','O+','Allahabad','Goldy@gmail.com','9412500001','','Chronical','Cardiac failureCardiomyopathyBronchiectasis','2021/01/19 16:53:58','21'),('445390','Jay Narayan','Manoj Shah','11/Jun/1999','Male','O+','Allahabad','Goldy@gmail.com','9412500001','','Chronical','Cardiac failureCardiomyopathyBronchiectasis','2021/01/21 16:03:28','21'),('500786','Jay Narayan','Manoj Shah','11/Jun/1999','Male','O+','Allahabad','Goldy@gmail.com','9412500001','','Chronical','Cardiac failureCardiomyopathyBronchiectasis','2021/01/21 16:00:07','21'),('545475','Nayra ','Mukesh','8/Jun/2003','Female','B+','Agra','Nayra@gmail.com','7895654825','','Chronical','','2021/02/02 23:20:19','18'),('609224','Jay Narayan','Manoj Shah','11/Jun/1999','Male','O+','Allahabad','Goldy@gmail.com','9412500001','','Chronical','Cardiac failureCardiomyopathyBronchiectasis','2021/01/21 15:47:00','21'),('80681','Anuj Kumar ','Manish Kumar','28/Aug/2000','Female','B-','Agra ','AnujKumar@gmail.com','7895685852','','Allergy','Cardiomyopathy','2021/02/03 21:25:05','21'),('914504','Jay Narayan','Manoj Shah','11/Jun/1999','Male','O+','Allahabad','Goldy@gmail.com','9412500001','','Chronical','Cardiac failureCardiomyopathyBronchiectasis','2021/01/21 14:20:24','21'),('94603','Jay Narayan','Manoj Shah','11/Jun/1999','Male','O+','Allahabad','Goldy@gmail.com','9412500001','','Chronical','Cardiac failureCardiomyopathyBronchiectasis','2021/01/27 22:39:01','21');
/*!40000 ALTER TABLE `patient` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-02-21 21:49:09
