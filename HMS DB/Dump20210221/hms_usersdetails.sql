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
-- Table structure for table `usersdetails`
--

DROP TABLE IF EXISTS `usersdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usersdetails` (
  `id` varchar(6) NOT NULL,
  `emp_type` varchar(20) NOT NULL,
  `name` varchar(25) NOT NULL,
  `sex` varchar(6) NOT NULL,
  `dob` varchar(15) DEFAULT NULL,
  `contact` varchar(10) DEFAULT NULL,
  `email` varchar(40) DEFAULT NULL,
  `joinin` varchar(40) DEFAULT NULL,
  `education` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usersdetails`
--

LOCK TABLES `usersdetails` WRITE;
/*!40000 ALTER TABLE `usersdetails` DISABLE KEYS */;
INSERT INTO `usersdetails` VALUES ('155307','Admin','fpkgfpog','Female','okrog','7859658288','righ@gmail.com','Date: 2021/02/09 22:42:14','Post Graduate'),('191541','Admin','Madhu','Female','MMM d, yyyy','7895684855','madhu@gmail.com','Date: 2021/02/10','Graduate'),('269090','Admin','Sheetal Jain','Female','11/01/2001','9760162203','simmijain1101@gmail.com','Date: 2021/01/31 23:11:48','Graduate'),('360511','Staff','DJ','Female','Jun 9, 2021','8795877957','3rjojf@gmail.com','Date: 2021/02/10','Post Graduate'),('365411','Receptionist','Anuj Kumar ','Male','11/01/2001','8547854751','sj@gmail.com','Date: 2021/02/09 11:47:27','Post Graduate'),('736803','Receptionist','Mahak ','','11/01/2001','7895685825','simmijain1101@gmail.com','Date: 2021/02/09 22:29:18','Graduate'),('743434','Staff','Dipanshi Jain','Female','18/08/2000','7845126925','dj@gmail.com','Date: 2021/01/31 23:15:36','Post Graduate');
/*!40000 ALTER TABLE `usersdetails` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-02-21 21:49:10
