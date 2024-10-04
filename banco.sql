CREATE DATABASE  IF NOT EXISTS `tcc` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `tcc`;
-- MySQL dump 10.13  Distrib 5.6.23, for Win64 (x86_64)
--
-- Host: localhost    Database: tcc
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.24-MariaDB

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
-- Table structure for table `carrinho`
--

DROP TABLE IF EXISTS `carrinho`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `carrinho` (
  `id_carrinho` int(11) NOT NULL AUTO_INCREMENT,
  `quantidade` int(11) DEFAULT NULL,
  `fk_id_usuario` int(11) DEFAULT NULL,
  `valor_total` float(10,2) DEFAULT NULL,
  `fk_id_produto` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_carrinho`),
  KEY `fk_id_usuario` (`fk_id_usuario`),
  KEY `fk_id_produto` (`fk_id_produto`),
  CONSTRAINT `carrinho_ibfk_1` FOREIGN KEY (`fk_id_usuario`) REFERENCES `usuarios` (`id_usuario`),
  CONSTRAINT `carrinho_ibfk_2` FOREIGN KEY (`fk_id_produto`) REFERENCES `produtos` (`id_produto`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carrinho`
--

LOCK TABLES `carrinho` WRITE;
/*!40000 ALTER TABLE `carrinho` DISABLE KEYS */;
INSERT INTO `carrinho` VALUES (8,2,4,2.00,2),(9,1,5,3.00,3);
/*!40000 ALTER TABLE `carrinho` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categorias`
--

DROP TABLE IF EXISTS `categorias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `categorias` (
  `id_categoria` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) DEFAULT NULL,
  `descricao` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_categoria`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categorias`
--

LOCK TABLES `categorias` WRITE;
/*!40000 ALTER TABLE `categorias` DISABLE KEYS */;
INSERT INTO `categorias` VALUES (1,'Doces','categorias de doces'),(2,'Temperos','categoria de temperos'),(3,'Teste',NULL);
/*!40000 ALTER TABLE `categorias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `compras`
--

DROP TABLE IF EXISTS `compras`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `compras` (
  `id_compra` int(11) NOT NULL AUTO_INCREMENT,
  `horario` time DEFAULT NULL,
  `data` date DEFAULT NULL,
  `fk_id_usuario` int(11) DEFAULT NULL,
  `fk_id_produto` int(11) DEFAULT NULL,
  `fk_id_carrinho` int(11) DEFAULT NULL,
  `codigo` text DEFAULT NULL,
  PRIMARY KEY (`id_compra`),
  KEY `fk_id_usuario` (`fk_id_usuario`),
  KEY `fk_id_produto` (`fk_id_produto`),
  KEY `fk_id_carrinho` (`fk_id_carrinho`),
  CONSTRAINT `compras_ibfk_1` FOREIGN KEY (`fk_id_usuario`) REFERENCES `usuarios` (`id_usuario`),
  CONSTRAINT `compras_ibfk_2` FOREIGN KEY (`fk_id_produto`) REFERENCES `produtos` (`id_produto`),
  CONSTRAINT `compras_ibfk_3` FOREIGN KEY (`fk_id_carrinho`) REFERENCES `carrinho` (`id_carrinho`)
) ENGINE=InnoDB AUTO_INCREMENT=60 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `compras`
--

LOCK TABLES `compras` WRITE;
/*!40000 ALTER TABLE `compras` DISABLE KEYS */;
INSERT INTO `compras` VALUES (51,'14:30:00','2024-10-04',11,7,8,'COD123ABC'),(52,'09:00:00','2024-10-03',11,3,9,'COD456XYZ'),(53,'17:45:00','2024-09-30',11,5,8,'COD789DEF'),(54,'12:15:00','2024-10-01',11,2,9,'COD111GHI'),(55,'19:00:00','2024-10-02',11,9,8,'COD222JKL'),(56,'19:00:00','2024-10-02',11,9,8,'COD222JKL'),(57,'19:00:00','2024-10-02',11,9,8,'COD222JKL'),(58,'19:00:00','2024-10-02',11,9,8,'COD222JKL'),(59,'19:30:00','2024-12-02',11,9,8,'COD222JOL');
/*!40000 ALTER TABLE `compras` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `notificacoes`
--

DROP TABLE IF EXISTS `notificacoes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `notificacoes` (
  `id_notificacao` int(11) NOT NULL AUTO_INCREMENT,
  `tipo` int(3) DEFAULT NULL,
  `visto` tinyint(1) DEFAULT NULL,
  `fk_id_usuario` int(11) DEFAULT NULL,
  `notificacao` text DEFAULT NULL,
  PRIMARY KEY (`id_notificacao`),
  KEY `fk_id_usuario` (`fk_id_usuario`),
  CONSTRAINT `notificacoes_ibfk_1` FOREIGN KEY (`fk_id_usuario`) REFERENCES `usuarios` (`id_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `notificacoes`
--

LOCK TABLES `notificacoes` WRITE;
/*!40000 ALTER TABLE `notificacoes` DISABLE KEYS */;
INSERT INTO `notificacoes` VALUES (1,3,1,11,'Noti 1'),(2,3,1,11,'Noti 2'),(3,2,1,11,'Noti 1'),(4,1,1,11,'Noti 1');
/*!40000 ALTER TABLE `notificacoes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produtos`
--

DROP TABLE IF EXISTS `produtos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `produtos` (
  `id_produto` int(11) NOT NULL AUTO_INCREMENT,
  `nome_produto` varchar(45) DEFAULT NULL,
  `descricao_produto` varchar(100) DEFAULT NULL,
  `disponivel` tinyint(1) DEFAULT 0,
  `fk_id_categoria` int(11) DEFAULT NULL,
  `valor` float(10,2) DEFAULT NULL,
  `quantidade` int(11) DEFAULT NULL,
  `valor_custo` float DEFAULT NULL,
  PRIMARY KEY (`id_produto`),
  KEY `fk_id_categoria` (`fk_id_categoria`),
  CONSTRAINT `produtos_ibfk_1` FOREIGN KEY (`fk_id_categoria`) REFERENCES `categorias` (`id_categoria`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produtos`
--

LOCK TABLES `produtos` WRITE;
/*!40000 ALTER TABLE `produtos` DISABLE KEYS */;
INSERT INTO `produtos` VALUES (2,'Casquinha','Sorvete de chocolate',0,1,2.00,6,1),(3,'Brigadeiro','sabor moranho',0,1,3.00,7,2),(5,'Produto teste','produto para fazer teste',1,3,5.00,2,3),(7,'Camiseta','Camiseta de algodão',1,2,29.90,100,15),(8,'Calça Jeans','Calça jeans unissex',1,3,99.90,50,50),(9,'Tênis Esportivo','Tênis ideal para corrida',0,1,199.90,30,120),(10,'Teste','SOCIAL',1,2,111.00,6,12.9),(12,'Fone de Ouvido','Fone de ouvido sem fio',0,1,89.90,40,40),(13,'Sofa','Sofá de três lugares',1,2,899.90,5,300),(14,'Mesa de Jantar','Mesa de jantar de madeira',1,3,499.90,15,200),(16,'Lampada LED','Lâmpada LED 10W',1,2,19.90,200,10),(17,'Cafeteira','Cafeteira elétrica com jarra',1,3,199.90,15,100),(18,'Microondas','Microondas 20L',1,1,399.90,10,250),(19,'Xbox Series X','Console de videogame',1,2,4999.90,8,4500),(20,'Camiseta Esportiva','Camiseta de corrida',1,3,59.90,60,30),(21,'Balinha','docinha',1,1,12.80,100,15),(22,'ko','koko',2,3,80.00,80,97);
/*!40000 ALTER TABLE `produtos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuarios` (
  `id_usuario` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `email` varchar(150) NOT NULL,
  `senha` varchar(100) NOT NULL,
  `data_nascimento` date NOT NULL,
  `adm` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (4,'Rober','bertin@gmail.com','123','0000-00-00',NULL),(5,'Junin','junin@gmail.com','123','0000-00-00',NULL),(7,'VInicius','vini@gmail.com','123','0000-00-00',NULL),(10,'teste','teste@teste','123','2010-03-24',NULL),(11,'Leozinh','leo','123','2007-06-21',1);
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'tcc'
--

--
-- Dumping routines for database 'tcc'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-10-04 15:34:07
