CREATE DATABASE  IF NOT EXISTS `tcc` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `tcc`;
-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: localhost    Database: tcc
-- ------------------------------------------------------
-- Server version	5.5.16

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
-- Table structure for table `carrinho`
--

DROP TABLE IF EXISTS `carrinho`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
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
/*!50503 SET character_set_client = utf8mb4 */;
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
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `compras` (
  `id_compra` int(11) NOT NULL AUTO_INCREMENT,
  `horario` time DEFAULT NULL,
  `data` date DEFAULT NULL,
  `fk_id_usuario` int(11) DEFAULT NULL,
  `obs` varchar(255) DEFAULT NULL,
  `ativo` tinyint(1) DEFAULT NULL,
  `codigo` varchar(255) NOT NULL,
  `produtos` text,
  `valor_total` float(10,2) DEFAULT NULL,
  PRIMARY KEY (`id_compra`),
  KEY `fk_id_usuario` (`fk_id_usuario`),
  CONSTRAINT `compras_ibfk_1` FOREIGN KEY (`fk_id_usuario`) REFERENCES `usuarios` (`id_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=75 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `compras`
--

LOCK TABLES `compras` WRITE;
/*!40000 ALTER TABLE `compras` DISABLE KEYS */;
INSERT INTO `compras` VALUES (51,'14:30:00','2024-10-04',11,'Passarei por volta da tarde na loja',1,'C51','2,3,21',30.10),(68,'10:00:00','2024-10-05',4,'Pedido para retirada.',1,'C61','2,3,21',30.10),(69,'14:00:00','2024-10-06',5,'Favor entregar na portaria.',1,'C62','2,3,21',30.10),(70,'16:30:00','2024-10-07',7,'Sem lactose, por favor.',1,'C63','2,3,21',30.10),(71,'19:00:00','2024-10-08',10,'Aguardo confirma‡Æo de entrega.',1,'C64','2,3,21',30.10);
/*!40000 ALTER TABLE `compras` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = latin1 */ ;
/*!50003 SET character_set_results = latin1 */ ;
/*!50003 SET collation_connection  = latin1_swedish_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 trigger venda_realizada
after insert on compras
for each row
begin
insert into notificacoes(tipo,visto,notificacao,data,horario)
values(3,0,'1 Venda realizada',now(),now());
end */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `notificacoes`
--

DROP TABLE IF EXISTS `notificacoes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `notificacoes` (
  `id_notificacao` int(11) NOT NULL AUTO_INCREMENT,
  `tipo` int(3) DEFAULT NULL,
  `visto` tinyint(1) DEFAULT NULL,
  `notificacao` text,
  `data` date DEFAULT NULL,
  `horario` time DEFAULT NULL,
  PRIMARY KEY (`id_notificacao`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `notificacoes`
--

LOCK TABLES `notificacoes` WRITE;
/*!40000 ALTER TABLE `notificacoes` DISABLE KEYS */;
INSERT INTO `notificacoes` VALUES (8,3,1,'1 Venda realizada','2024-10-05','22:02:45'),(9,1,1,'Perfil atualizado','2024-10-05','22:47:49'),(10,1,1,'Perfil atualizado','2024-10-05','23:36:11'),(11,1,1,'Perfil atualizado','2024-10-06','00:12:52'),(12,1,1,'Perfil atualizado','2024-10-06','00:13:14'),(13,3,1,'1 Venda realizada','2024-10-06','13:44:55'),(14,3,1,'1 Venda realizada','2024-10-06','16:50:52'),(15,3,1,'1 Venda realizada','2024-10-06','16:50:52'),(16,3,1,'1 Venda realizada','2024-10-06','16:50:52'),(17,3,1,'1 Venda realizada','2024-10-06','16:50:52'),(18,1,1,'Perfil atualizado','2024-10-12','21:06:32'),(19,1,1,'Perfil atualizado','2024-10-12','21:08:03'),(20,1,1,'Perfil atualizado','2024-10-12','21:17:24'),(21,1,1,'Perfil atualizado','2024-10-13','10:49:11');
/*!40000 ALTER TABLE `notificacoes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produtos`
--

DROP TABLE IF EXISTS `produtos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `produtos` (
  `id_produto` int(11) NOT NULL AUTO_INCREMENT,
  `nome_produto` varchar(45) DEFAULT NULL,
  `descricao_produto` varchar(100) DEFAULT NULL,
  `disponivel` tinyint(1) DEFAULT '0',
  `fk_id_categoria` int(11) DEFAULT NULL,
  `valor` float(10,2) DEFAULT NULL,
  `quantidade` int(11) DEFAULT NULL,
  `valor_custo` float DEFAULT NULL,
  `arquivado` tinyint(1) DEFAULT '0',
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
INSERT INTO `produtos` VALUES (2,'Casquinha','Sorvete de chocolate',1,1,2.00,6,1,0),(3,'Brigadeiro','sabor moranho',1,1,3.00,7,2,0),(5,'Produto teste','produto para fazer teste',0,3,5.00,2,3,1),(7,'Camiseta','Camiseta de algodão',1,2,29.90,100,15,0),(8,'Calça Jeans','Calça jeans unissex',1,3,99.90,50,50,0),(9,'Tênis Esportivo','Tênis ideal para corrida',1,1,199.90,30,90.12,0),(10,'Teste','SOCIAL',0,2,111.00,6,12.9,1),(12,'Fone de Ouvido','Fone de ouvido sem fio',1,1,89.90,40,40,0),(13,'Sofa','Sofá de três lugares',1,2,899.90,5,300,0),(14,'Mesa de Jantar','Mesa de jantar de madeira',1,3,499.90,15,200,0),(16,'Lampada LED','Lâmpada LED 10W',0,2,19.90,200,10,0),(17,'Cafeteira','Cafeteira elétrica com jarra',1,3,199.90,15,100,0),(18,'Microondas','Microondas 20L',1,1,399.90,10,250,0),(19,'Xbox Series X','Console de videogame',1,2,4999.90,8,4500,0),(20,'Camiseta Esportiva','Camiseta de corrida',1,3,59.90,60,30,0),(21,'Balinha','docinha',1,1,12.80,100,15,0),(22,'ko','koko',0,3,80.00,80,97,1);
/*!40000 ALTER TABLE `produtos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
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
INSERT INTO `usuarios` VALUES (4,'Rober','bertin@gmail.com','123','2007-10-01',NULL),(5,'Junin','junin@gmail.com','123','2007-10-01',NULL),(7,'VInicius','vini@gmail.com','123','2007-10-01',NULL),(10,'teste','aninha@gmail.com','123','2007-10-01',NULL),(11,'Leozinho','leo@gmail.com','123','2007-10-01',1);
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = latin1 */ ;
/*!50003 SET character_set_results = latin1 */ ;
/*!50003 SET collation_connection  = latin1_swedish_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 trigger perfil_atualizado
after update on usuarios
for each row
begin
if OLD.adm = 1 then
insert into notificacoes(tipo,visto,notificacao,data,horario)
values(1,0,'Perfil atualizado',now(),now());
end if;
end */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

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

-- Dump completed on 2024-10-13 13:58:39
