-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: GrpWare
-- ------------------------------------------------------
-- Server version	8.0.30

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `board`
--

DROP TABLE IF EXISTS `board`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `board` (
  `idx` int NOT NULL AUTO_INCREMENT,
  `title` varchar(100) NOT NULL,
  `username` varchar(20) NOT NULL,
  `content` varchar(500) NOT NULL,
  `visit` int DEFAULT NULL,
  `regdate` date DEFAULT NULL,
  PRIMARY KEY (`idx`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `board`
--

LOCK TABLES `board` WRITE;
/*!40000 ALTER TABLE `board` DISABLE KEYS */;
INSERT INTO `board` VALUES (9,'node프로젝트 금요일까지 제출','박현영','node프로젝트 금요일까지 제출... 예\r\n였는데 수요일까지로 바뀜\r\n                ',1,'2022-09-30'),(10,'오늘 저녁은 피자','박현영','이마트가서 피자 사가야징 룰루  ',1,'2022-09-29'),(11,'집에 가고 싶은 사라마맘ㅁ','박현여','집에 가고싶어요\r\n집에 가고싶어요\r\n집에 가고싶어요\r\n집에 가고싶어요\r\n집에 가고싶어요\r\n집에 가고싶어요집에 가고싶어요\r\n집에 가고싶어요집에 가고싶어요\r\n집에 가고싶어요집에 가고싶어요\r\n집에 가고싶어요집에 가고싶어요\r\n집에 가고싶어요\r\n집에 가고싶어요\r\n집에 가고싶어요집에 가고싶어요\r\n집에 가고싶어요집에 가고싶어요\r\n집에 가고싶어요집에 가고싶어요\r\n집에 가고싶어요\r\n집에 가고싶어요\r\n집에 가고싶어요집에 가고싶어요\r\n집에 가고싶어요집에 가고싶어요\r\n집에 가고싶어요',1,'2022-09-29'),(12,'과제 오늘까지','현영','예\r\n                ',1,'2022-10-05'),(13,'아ㅏㅇ아ㅏ아아아아아아','치킨','맛있겠다\r\n                ',1,'2022-10-05');
/*!40000 ALTER TABLE `board` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `member`
--

DROP TABLE IF EXISTS `member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `member` (
  `idx` int NOT NULL AUTO_INCREMENT,
  `username` varchar(10) NOT NULL,
  `userid` varchar(20) NOT NULL,
  `pw` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `grade` varchar(10) DEFAULT NULL,
  `regdate` date DEFAULT NULL,
  PRIMARY KEY (`idx`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member`
--

LOCK TABLES `member` WRITE;
/*!40000 ALTER TABLE `member` DISABLE KEYS */;
INSERT INTO `member` VALUES (1,'박현영','aud8637282','gusdud1001!','aud8637282@naver.com','최고관리자','2022-09-29'),(2,'김현영','abc1234','1234','aaa1234@naver.com','일반','2022-09-29'),(3,'이현영','asdfg','asdfg','asdfg@google.com','일반','2022-09-29'),(4,'조현영','qwer1234','456789','qwer1234@naver.com','일반','2022-09-29');
/*!40000 ALTER TABLE `member` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-10-05 15:05:11
