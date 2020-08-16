CREATE DATABASE  IF NOT EXISTS `cinema_management` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `cinema_management`;
-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: localhost    Database: cinema_management
-- ------------------------------------------------------
-- Server version	8.0.20

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
-- Table structure for table `bookings`
--

DROP TABLE IF EXISTS `bookings`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bookings` (
  `BookingID` int NOT NULL AUTO_INCREMENT,
  `CustomerID` int NOT NULL,
  `Cinema` varchar(45) NOT NULL,
  `Movie` varchar(45) NOT NULL,
  `Seat` varchar(45) NOT NULL,
  PRIMARY KEY (`BookingID`),
  UNIQUE KEY `Cinema_Movie_Seat` (`Cinema`,`Movie`,`Seat`),
  KEY `Movie_idx` (`Movie`),
  KEY `Cinema_idx` (`Cinema`),
  KEY `Customer_idx` (`CustomerID`),
  CONSTRAINT `Cinema` FOREIGN KEY (`Cinema`) REFERENCES `cinema` (`Name`),
  CONSTRAINT `Customer` FOREIGN KEY (`CustomerID`) REFERENCES `customer` (`ID`) ON DELETE CASCADE,
  CONSTRAINT `Movie` FOREIGN KEY (`Movie`) REFERENCES `movies` (`Movie_Name`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bookings`
--

LOCK TABLES `bookings` WRITE;
/*!40000 ALTER TABLE `bookings` DISABLE KEYS */;
INSERT INTO `bookings` VALUES (1,1,'Cinema X 1','Apollo 11','A1'),(2,5,'Nu Metro 9','In the Shadow of the Moon','F5'),(3,10,'Ster Kinekor 3','Once Upon a Time in…Hollywood','D2'),(4,7,'Cinema X 1','The Main Event','A1'),(5,3,'Nu Metro 1','Ford v Ferrari','B10'),(6,6,'Colosseum 6','Ghost Stories','C9'),(7,2,'Colosseum 1','Apollo 11','A5'),(8,9,'Ster Kinekor 1','Line of Duty','B7'),(9,4,'Cinema X 4','Gemini Man','E3'),(10,8,'Nu Metro 4','The Willoughbys','D5'),(11,11,'Colosseum 8','Bloodshot','F3');
/*!40000 ALTER TABLE `bookings` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cinema`
--

DROP TABLE IF EXISTS `cinema`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cinema` (
  `Name` varchar(45) NOT NULL,
  `Province` varchar(45) NOT NULL,
  `Location` varchar(45) NOT NULL,
  `Number` varchar(45) NOT NULL,
  `ManagerID` int NOT NULL,
  PRIMARY KEY (`Name`),
  KEY `Manager_idx` (`ManagerID`),
  CONSTRAINT `Manager` FOREIGN KEY (`ManagerID`) REFERENCES `manager` (`ManagerID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cinema`
--

LOCK TABLES `cinema` WRITE;
/*!40000 ALTER TABLE `cinema` DISABLE KEYS */;
INSERT INTO `cinema` VALUES ('Cinema X 1','Western Cape','Franshoek','0834912478',1),('Cinema X 2','Gauteng','Benoni','0827839073',2),('Cinema X 3','Northen Cape','Pofadder','0846610548',3),('Cinema X 4','Limpopo','Alldays','0821221091',4),('Cinema X 5','Free State','Bloukop','0858017759',5),('Cinema X 6','North West','Edenburg','0847300802',6),('Cinema X 7','KwaZulu Natal','Newcastle','0828094512',7),('Cinema X 8','Mpumalanga','Kriel','0839325526',8),('Cinema X 9','Eastern Cape','Tsomo','0837301918',9),('Colosseum 1','Western Cape','Wellington','0833944540',10),('Colosseum 2','Gauteng','Soweto','0848161383',11),('Colosseum 3','Northen Cape','Uppington','0847437174',12),('Colosseum 4','Limpopo','Blouberg','0851167638',13),('Colosseum 5','Free State','Welkom','0851835065',14),('Colosseum 6','North West','Vryburg','0856824821',15),('Colosseum 7','KwaZulu Natal','Ladysmith','0839912009',16),('Colosseum 8','Mpumalanga','Meerlus','0859522931',17),('Colosseum 9','Eastern Cape','Port Elizabeth','0834892940',18),('Nu Metro 1','Western Cape','Milnerton','0824832282',19),('Nu Metro 2','Gauteng','Johannesburg','0844776421',20),('Nu Metro 3','Northen Cape','Toekoms','0834216947',21),('Nu Metro 4','Limpopo','Brombeek','0841390304',22),('Nu Metro 5','Free State','Bankfontein','0846343624',23),('Nu Metro 6','North West','Mahikeng','0848830129',24),('Nu Metro 7','KwaZulu Natal','Durban','0844553374',25),('Nu Metro 8','Mpumalanga','Komati','0821877142',26),('Nu Metro 9','Eastern Cape','Hogsback','0821213790',27),('Ster Kinekor 1','Western Cape','Brackenfell','0825460299',28),('Ster Kinekor 2','Gauteng','Pretoria','0832065560',29),('Ster Kinekor 3','Northen Cape','Brandvlei','0826624233',30),('Ster Kinekor 4','Limpopo','Thohoyandou','0832867067',31),('Ster Kinekor 5','Free State','Bloemfontein','0823345648',32),('Ster Kinekor 6','North West','Piet Plessis','0855339226',33),('Ster Kinekor 7','KwaZulu Natal','Gwebu','0858042728',34),('Ster Kinekor 8','Mpumalanga','Presidentrus','0824457893',35),('Ster Kinekor 9','Eastern Cape','East London','0859434629',36);
/*!40000 ALTER TABLE `cinema` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(45) NOT NULL,
  `Surname` varchar(45) NOT NULL,
  `Username` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `Username_UNIQUE` (`Username`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1,'Julian','Anderson','ja','ja'),(2,'Jacobus','Bouwer','jb','jb'),(3,'Celeste','Ally','ca','ca'),(4,'Philip','Maluleka','pm','pm'),(5,'Garth','Maluleka','gm','gm'),(6,'Paul','Jordaan','pj','pj'),(7,'Bongiwe','Jordaan','bj','bj'),(8,'Bianca','Mbele','bm','bm'),(9,'Siyabonga','Minnaar','sm','sm'),(10,'Esther','Mnisi','em','em'),(11,'Kagiso','Kubheka','kk','kk');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `manager`
--

DROP TABLE IF EXISTS `manager`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `manager` (
  `ManagerID` int NOT NULL,
  `Manager Name` varchar(45) NOT NULL,
  `Manager Number` varchar(45) NOT NULL,
  `Username` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL,
  PRIMARY KEY (`ManagerID`),
  UNIQUE KEY `Username_UNIQUE` (`Username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `manager`
--

LOCK TABLES `manager` WRITE;
/*!40000 ALTER TABLE `manager` DISABLE KEYS */;
INSERT INTO `manager` VALUES (1,'Nonhlanhla','0586410309','m1','m1'),(2,'Simon','0449824739','m2','m2'),(3,'Contact','0279382680','m3','m3'),(4,'Andiswa','0576253118','m4','m4'),(5,'Nonhlanhla','0437615349','m5','m5'),(6,'Stephanie','0210483829','m6','m6'),(7,'Isaac','0435017827','m7','m7'),(8,'Charlotte','0189451246','m8','m8'),(9,'Abigail','0344567377','m9','m9'),(10,'Lydia','0314256748','m10','m10'),(11,'Fikile','0410961714','m11','m11'),(12,'Juanita','0127150393','m12','m12'),(13,'Sibusiso','0138802026','m13','m13'),(14,'Leon','0282115352','m14','m14'),(15,'Adele','0245846834','m15','m15'),(16,'Martin','0314975996','m16','m16'),(17,'Nicolaas','0228177761','m17','m17'),(18,'Gerald','0233597417','m18','m18'),(19,'Pearl','0425849435','m19','m19'),(20,'Adrian','0233743482','m20','m20'),(21,'Sibongile','0436710485','m21','m21'),(22,'Karen','0585584875','m22','m22'),(23,'Bulelwa','0130740800','m23','m23'),(24,'Kelebogile','0281205446','m24','m24'),(25,'Hannes','0547571817','m25','m25'),(26,'Maureen','0356421138','m26','m26'),(27,'Xolani','0568152131','m27','m27'),(28,'Donovan','0238882198','m28','m28'),(29,'Tsholofelo','0334190221','m29','m29'),(30,'Refiloe','0446949640','m30','m30'),(31,'Anthony','0582139564','m31','m31'),(32,'Candice','0229113499','m32','m32'),(33,'Gail','0541983539','m33','m33'),(34,'Yvette','0312467916','m34','m34'),(35,'Chantel','0548744720','m35','m35'),(36,'Clifford','0451311633','m36','m36');
/*!40000 ALTER TABLE `manager` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movies`
--

DROP TABLE IF EXISTS `movies`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `movies` (
  `Movie_Name` varchar(45) NOT NULL,
  `Genre` varchar(45) NOT NULL,
  `Showing` tinyint NOT NULL,
  PRIMARY KEY (`Movie_Name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movies`
--

LOCK TABLES `movies` WRITE;
/*!40000 ALTER TABLE `movies` DISABLE KEYS */;
INSERT INTO `movies` VALUES ('Abominable','Comedy',1),('All the Bright Places','Romance',1),('Apollo 11','Documentary',1),('Black and Blue','Action',1),('Bloodshot','Action',1),('Brahms: The Boy II','Horror',1),('Ford v Ferrari','Sports',1),('Fractured','Thriller',1),('Gemini Man','Action',1),('Ghost Stories','Horror',1),('In the Shadow of the Moon','Science-Fiction Thriller',1),('In the Tall Grass','Horror',1),('Invader Zim: Enter the Florpus','Science-Fiction Comedy',1),('It Chapter Two','Horror',1),('Jexi','Comedy',1),('John Wick: Chapter 3 – Parabellum','Action',1),('Joker','Psychological Thriller',1),('Jumanji: The Next Level','Adventure',1),('Klaus','Animation',1),('Let it Snow','Romance',1),('Like a Boss','Comedy',1),('Line of Duty','Action',1),('NiNoKuni','Anime',1),('Once Upon a Time in…Hollywood','Comedy',1),('Onward','Animation',1),('Parasite','Thriller',1),('Playing with Fire','Comedy',1),('Spenser Confidential','Action',1),('Spies in Disguise','Comedy',1),('Steven Universe: The Movie','Fantasy',1),('Survive the Night','Action',1),('The Adams Family','Animation',1),('The Great Hack','Documentary',1),('The Kissing Booth 2','Romance',1),('The Last Days of American Crime','Action',1),('The Last Thing He Wanted','Mystery',1),('The Lion King Live Action','Musical',1),('The Main Event','Comedy',1),('The Willoughbys','Comedy',1),('The Wrong Missy','Romance',1);
/*!40000 ALTER TABLE `movies` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-08-14 10:00:50
