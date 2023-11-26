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
-- Table structure for table `room`
--

DROP TABLE IF EXISTS `room`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `room` (
  `wardno` int NOT NULL,
  `roomno` int NOT NULL,
  `RoomStatus` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room`
--

LOCK TABLES `room` WRITE;
/*!40000 ALTER TABLE `room` DISABLE KEYS */;
INSERT INTO `room` VALUES (1,1,'Available'),(1,2,'Available'),(1,3,'Available'),(1,4,'Unavail'),(1,5,'Available'),(1,6,'Available'),(1,7,'Available'),(1,8,'Available'),(1,9,'Available'),(1,10,'Available'),(1,11,'Available'),(1,12,'Available'),(1,13,'Available'),(1,14,'Available'),(1,15,'Available'),(1,16,'Available'),(2,101,'Available'),(2,102,'Available'),(2,103,'Available'),(2,104,'Available'),(2,105,'Unavail'),(2,106,'Available'),(2,107,'Available'),(2,108,'Unavail'),(2,109,'Available'),(2,110,'Available'),(2,111,'Available'),(2,112,'Available'),(2,113,'Available'),(2,114,'Available'),(2,115,'Available'),(2,116,'Available'),(21,125,NULL),(102,145,NULL),(102,146,NULL),(21,156,NULL),(3,201,'Available'),(3,202,'Available'),(3,203,'Unavail'),(3,204,'Available'),(3,205,'Available'),(3,206,'Available'),(3,207,'Available'),(3,208,'Available'),(3,209,'Available'),(3,210,'Available'),(3,211,'Available'),(3,212,'Available'),(3,213,'Available'),(3,214,'Available'),(3,215,'Available'),(3,216,'Available'),(21,256,NULL),(5,457,'Unavail'),(1,699,NULL),(102,846,'Unavail');
/*!40000 ALTER TABLE `room` ENABLE KEYS */;
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
