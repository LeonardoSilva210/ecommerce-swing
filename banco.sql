CREATE DATABASE  IF NOT EXISTS `tcc` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci */;
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
-- Table structure for table `categorias`
--

DROP TABLE IF EXISTS `categorias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `categorias` (
  `id_categoria` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) CHARACTER SET utf8mb4 NOT NULL,
  `descricao` varchar(100) CHARACTER SET utf8mb4 NOT NULL,
  `arquivado` tinyint(1) DEFAULT 0,
  PRIMARY KEY (`id_categoria`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categorias`
--

LOCK TABLES `categorias` WRITE;
/*!40000 ALTER TABLE `categorias` DISABLE KEYS */;
INSERT INTO `categorias` VALUES (1,'Refrigerantes','Bebidas Doces',1),(2,'Temperos','categoria de temperos',1),(3,'Teste','',1),(10,'iji','jijij',NULL),(11,'okok','okok',0),(12,'Sucos','Delicias das Frutas',0);
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
  `horario` time NOT NULL,
  `data` date NOT NULL,
  `obs` text CHARACTER SET utf8mb4 DEFAULT NULL,
  `ativo` tinyint(1) NOT NULL,
  `codigo` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `produtos` mediumtext CHARACTER SET utf8mb4 NOT NULL,
  `valor_total` float(10,2) NOT NULL,
  `fk_id_usuario` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_compra`),
  KEY `fk_id_usuario` (`fk_id_usuario`),
  CONSTRAINT `compras_ibfk_1` FOREIGN KEY (`fk_id_usuario`) REFERENCES `usuarios` (`id_usuario`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=73 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `compras`
--

LOCK TABLES `compras` WRITE;
/*!40000 ALTER TABLE `compras` DISABLE KEYS */;
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
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER venda_realizada
AFTER INSERT ON compras
FOR EACH ROW
BEGIN
    INSERT INTO notificacoes(tipo, visto, notificacao, data, horario)
    VALUES(3, 0, CONCAT('1 Venda realizada Valor: R$', REPLACE(NEW.valor_total, '.', ',')), NOW(), NOW());
END */;;
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
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `notificacoes` (
  `id_notificacao` int(11) NOT NULL AUTO_INCREMENT,
  `tipo` int(3) NOT NULL,
  `visto` tinyint(1) NOT NULL,
  `notificacao` mediumtext CHARACTER SET utf8mb4 NOT NULL,
  `data` date NOT NULL,
  `horario` time NOT NULL,
  PRIMARY KEY (`id_notificacao`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `notificacoes`
--

LOCK TABLES `notificacoes` WRITE;
/*!40000 ALTER TABLE `notificacoes` DISABLE KEYS */;
INSERT INTO `notificacoes` VALUES (9,1,1,'Perfil atualizado','2024-10-05','22:47:49'),(10,1,1,'Perfil atualizado','2024-10-05','23:36:11'),(11,1,1,'Perfil atualizado','2024-10-06','00:12:52'),(12,1,1,'Perfil atualizado','2024-10-06','00:13:14'),(18,1,1,'Perfil atualizado','2024-10-12','21:06:32'),(19,1,1,'Perfil atualizado','2024-10-12','21:08:03'),(20,1,1,'Perfil atualizado','2024-10-12','21:17:24'),(21,1,1,'Perfil atualizado','2024-10-13','10:49:11'),(22,1,1,'Perfil atualizado','2024-10-31','22:17:04'),(23,3,1,'1 Venda realizada Valor: R$91,90','2024-11-02','21:00:23'),(24,1,1,'Perfil atualizado','2024-11-07','17:29:37');
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
  `nome_produto` varchar(45) CHARACTER SET utf8mb4 NOT NULL,
  `descricao_produto` varchar(100) CHARACTER SET utf8mb4 NOT NULL,
  `disponivel` tinyint(1) NOT NULL DEFAULT 0,
  `fk_id_categoria` int(11) DEFAULT NULL,
  `valor` float(10,2) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `valor_custo` float NOT NULL,
  `arquivado` tinyint(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id_produto`),
  KEY `fk_id_categoria` (`fk_id_categoria`),
  CONSTRAINT `produtos_ibfk_1` FOREIGN KEY (`fk_id_categoria`) REFERENCES `categorias` (`id_categoria`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produtos`
--

LOCK TABLES `produtos` WRITE;
/*!40000 ALTER TABLE `produtos` DISABLE KEYS */;
INSERT INTO `produtos` VALUES (23,'Coca-Cola 350ml','Bebida Refrescante e Marcante',1,1,3.99,59,50.28,0),(24,'Pepsi 350ml','Bebida Refrescante e Marcante',0,1,3.00,35,46.98,1),(25,'Fanta Laranja 350ml','Bebida Refrescante e Marcante',1,1,3.29,65,49.43,0),(26,'Guaraná Antarctica 350ml','Bebida Refrescante e Marcante',0,1,3.59,59,50,1),(27,'Sprite 350ml','Bebida Refrescante e Marcante',1,1,3.99,59,50.28,0),(28,'Suco de Laranja ','Bebida Refrescante e Marcante',1,12,3.99,59,50.28,0),(29,'Suco de Uva','Bebida Refrescante e Marcante',1,12,7.90,32,120,0),(30,'Sprite ','Bebida Refrescante e Marcante',1,1,3.99,59,50.28,0),(31,'Sprite ','Bebida Refrescante e Marcante',1,1,3.99,59,50.28,0),(32,'Sprite ','Bebida Refrescante e Marcante',1,1,3.99,59,50.28,0),(33,'Sprite ','Bebida Refrescante e Marcante',1,1,3.99,59,50.28,0),(34,'Sprite ','Bebida Refrescante e Marcante',1,1,3.99,59,50.28,0),(35,'Sprite ','Bebida Refrescante e Marcante',1,1,3.99,59,50.28,0),(36,'Sprite ','Bebida Refrescante e Marcante',1,1,3.99,59,50.28,0),(37,'Sprite ','Bebida Refrescante e Marcante',1,1,3.99,59,50.28,0),(38,'Sprite ','Bebida Refrescante e Marcante',1,1,3.99,59,50.28,0),(39,'Sprite ','Bebida Refrescante e Marcante',1,1,3.99,59,50.28,0),(40,'Sprite ','Bebida Refrescante e Marcante',1,1,3.99,59,50.28,0),(41,'Sprite ','Bebida Refrescante e Marcante',1,1,3.99,59,50.28,0);
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
  `nome` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `email` varchar(150) COLLATE utf8mb4_unicode_ci NOT NULL,
  `senha` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `data_nascimento` date DEFAULT NULL,
  `adm` tinyint(4) DEFAULT 0,
  `whatsapp` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (4,'Rober','bertin@gmail.com','123','2007-10-01',0,'552796065709'),(7,'VInicius','vini@gmail.com','123','2007-10-01',0,'554384167577'),(10,'teste','aninha@gmail.com','123','2007-10-01',0,NULL),(11,'Leozinh','leo@gmail.com','123','2007-10-01',1,NULL);
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

-- Dump completed on 2024-11-07 17:37:35
