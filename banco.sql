CREATE DATABASE  IF NOT EXISTS `tcc` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci */;
USE `tcc`;
-- MySQL dump 10.13  Distrib 5.6.23, for Win64 (x86_64)
--
-- Host: localhost    Database: tcc
-- ------------------------------------------------------
-- Server version	5.5.16

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
  `descricao` text CHARACTER SET utf8mb4 NOT NULL,
  `arquivado` tinyint(1) DEFAULT '0',
  `quantidade_produtos` int(11) DEFAULT '0',
  `promocao` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id_categoria`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categorias`
--

LOCK TABLES `categorias` WRITE;
/*!40000 ALTER TABLE `categorias` DISABLE KEYS */;
INSERT INTO `categorias` VALUES (16,'Doces','Doces.',1,7,0),(17,'Bebidas','Bebidas.',0,14,0),(18,'Salgados','Salgados.',1,2,0),(19,'asd','Produtos da black friday.',1,0,1),(20,'promoção','produtos com promoção.',1,0,1),(21,'Cervejas','Cervejas: Milho, Cevada, Trigo, etc.',0,8,0),(22,'Catuabas','A categoria de Catuabas oferece uma seleção de bebidas alcoólicas tradicionais',1,0,0),(23,'Sucos','Bebidas deliciosas para crianças e adultos, geralmente com sabores frutiferos.',0,0,1),(24,'Gelos','mantém suas bebidas e alimentos na temperatura ideal.',0,2,0),(25,'Águas','Águas minerais',0,0,0),(26,'Refrigerantes','Bebidas Gaseficadas e Doce.',0,0,0);
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
  `obs` text CHARACTER SET utf8mb4,
  `ativo` tinyint(1) NOT NULL,
  `codigo` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `produtos` mediumtext CHARACTER SET utf8mb4 NOT NULL,
  `valor_total` float(10,2) NOT NULL,
  `fk_id_usuario` int(11) DEFAULT NULL,
  `quantidades` mediumtext COLLATE utf8mb4_unicode_ci,
  PRIMARY KEY (`id_compra`),
  KEY `fk_id_usuario` (`fk_id_usuario`),
  CONSTRAINT `compras_ibfk_1` FOREIGN KEY (`fk_id_usuario`) REFERENCES `usuarios` (`id_usuario`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `compras`
--

LOCK TABLES `compras` WRITE;
/*!40000 ALTER TABLE `compras` DISABLE KEYS */;
INSERT INTO `compras` VALUES (16,'03:47:32','2024-11-24','Passarei por volta das 14:00 hrs',0,'C306','50,51,49',45.70,37,'2,3,1'),(17,'14:13:13','2024-11-25','Sem observação',0,'C216','57,54,55,49,50,52,53',76.50,35,'2,2,10,2,2,2,2'),(18,'14:14:13','2024-11-25','Sem observação',0,'C562','49,50,51,57,52,53,54,55',44.45,35,'1,1,1,1,1,1,1,1'),(19,'14:16:03','2024-11-25','Sem observação',0,'C615','57',4.00,35,'4'),(20,'14:18:30','2024-11-25','Sem observação',1,'C722','57,51',11.20,35,'1,1'),(21,'10:01:54','2024-12-02','Quero mais um dps',1,'C471','49',2.50,35,'1'),(22,'10:03:27','2024-12-02','DALEEEE KIT',1,'C60','49',2.50,35,'1'),(23,'10:07:56','2024-12-02','QUERO 5 KITKAT',1,'C232','49',12.50,35,'5'),(24,'18:58:54','2024-12-03','horas testando',1,'C493','54,122',3011.60,35,'2,3'),(25,'23:19:22','2024-12-03','',0,'C152','53,54,110',1016.20,42,'1,1,1');
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
  `fk_id_usuario` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_notificacao`),
  KEY `fk_id_usuario` (`fk_id_usuario`),
  CONSTRAINT `notificacoes_ibfk_1` FOREIGN KEY (`fk_id_usuario`) REFERENCES `usuarios` (`id_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=168 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `notificacoes`
--

LOCK TABLES `notificacoes` WRITE;
/*!40000 ALTER TABLE `notificacoes` DISABLE KEYS */;
INSERT INTO `notificacoes` VALUES (143,3,1,'1 Venda realizada Valor: R$45,70','2024-11-24','03:47:32',NULL),(144,1,1,'Perfil atualizado.','2024-11-24','16:39:54',11),(145,1,1,'Perfil atualizado.','2024-11-24','16:42:30',11),(146,1,1,'Perfil atualizado.','2024-11-24','16:43:44',11),(147,1,1,'Perfil atualizado.','2024-11-24','16:44:01',11),(148,1,0,'Perfil atualizado.','2024-11-25','13:58:20',33),(149,1,0,'Perfil atualizado.','2024-11-25','13:58:36',33),(150,1,0,'Perfil atualizado.','2024-11-25','14:03:17',32),(151,1,0,'Perfil atualizado.','2024-11-25','14:03:39',32),(152,1,0,'Perfil atualizado.','2024-11-25','14:10:04',35),(153,1,0,'Perfil atualizado.','2024-11-25','14:10:09',35),(154,1,0,'Perfil atualizado.','2024-11-25','14:10:55',35),(155,1,0,'Perfil atualizado.','2024-11-25','14:11:09',35),(156,1,0,'Perfil atualizado.','2024-11-25','14:11:14',35),(157,3,1,'1 Venda realizada Valor: R$76,50','2024-11-25','14:13:13',NULL),(158,3,1,'1 Venda realizada Valor: R$44,45','2024-11-25','14:14:13',NULL),(159,3,1,'1 Venda realizada Valor: R$4,00','2024-11-25','14:16:03',NULL),(160,3,1,'1 Venda realizada Valor: R$11,20','2024-11-25','14:18:30',NULL),(161,1,1,'Perfil atualizado.','2024-11-25','14:43:25',11),(162,1,1,'Perfil atualizado.','2024-11-25','14:44:49',11),(163,3,0,'1 Venda realizada Valor: R$2,50','2024-12-02','10:01:54',NULL),(164,3,0,'1 Venda realizada Valor: R$2,50','2024-12-02','10:03:27',NULL),(165,3,0,'1 Venda realizada Valor: R$12,50','2024-12-02','10:07:56',NULL),(166,3,0,'1 Venda realizada Valor: R$3011,60','2024-12-03','18:58:54',NULL),(167,3,0,'1 Venda realizada Valor: R$1016,20','2024-12-03','23:19:22',NULL);
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
  `descricao_produto` text CHARACTER SET utf8mb4 NOT NULL,
  `disponivel` tinyint(1) NOT NULL DEFAULT '0',
  `fk_id_categoria` int(11) DEFAULT NULL,
  `valor` float(10,2) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `valor_custo` float(10,2) DEFAULT NULL,
  `arquivado` tinyint(1) NOT NULL DEFAULT '0',
  `imagem` text COLLATE utf8mb4_unicode_ci,
  `fk_id_compra` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_produto`),
  KEY `fk_id_categoria` (`fk_id_categoria`),
  KEY `fk_id_compra` (`fk_id_compra`),
  CONSTRAINT `produtos_ibfk_1` FOREIGN KEY (`fk_id_categoria`) REFERENCES `categorias` (`id_categoria`),
  CONSTRAINT `produtos_ibfk_2` FOREIGN KEY (`fk_id_compra`) REFERENCES `compras` (`id_compra`)
) ENGINE=InnoDB AUTO_INCREMENT=125 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produtos`
--

LOCK TABLES `produtos` WRITE;
/*!40000 ALTER TABLE `produtos` DISABLE KEYS */;
INSERT INTO `produtos` VALUES (49,'Kit Kat','Nestlé Kit Kat',1,16,2.50,99,2.00,0,'https://res.cloudinary.com/dh4zkueea/image/upload/v1732076510/imgKitKat_wpjjhu.jpg',NULL),(50,'Oreo','Biscoito oreo - 1 Uni',1,16,6.30,110,5.50,0,'https://res.cloudinary.com/dh4zkueea/image/upload/v1732131830/imgOreo_arj7uz.jpg',NULL),(51,'Bis','Bis chocolate - Caixinha',1,16,10.20,40,9.58,0,'https://res.cloudinary.com/dh4zkueea/image/upload/v1732076903/imgBis_kwvdju.jpg',NULL),(52,'Água mineral','Água mineral - Garrafa 500ml',1,17,6.25,200,5.33,0,'https://res.cloudinary.com/dh4zkueea/image/upload/v1732077026/imgAguaMineral_bynhme.jpg',NULL),(53,'Coca-Cola','Refrigerante Coca-Cola',1,17,9.90,30,8.53,0,'https://res.cloudinary.com/dh4zkueea/image/upload/v1732132064/imgCocaCola_hyyyy3.jpg',NULL),(54,'Sprite','Refrigerante Sprite 500ml',1,17,7.30,21,6.50,0,'https://res.cloudinary.com/dh4zkueea/image/upload/v1732077296/imgSprite_iqhw8i.jpg',NULL),(55,'Pão de queijo','Pão de queijo.',1,18,1.00,100,0.80,0,'https://res.cloudinary.com/dh4zkueea/image/upload/v1732077424/ukk2rctrtm6l0msjnoxj.jpg',NULL),(104,'Água Crystal com Gás - 500ml','Água gaseficada',1,17,3.50,120,2.99,0,'https://res.cloudinary.com/dh4zkueea/image/upload/v1733173633/xptfdq0khkcxelnubsg3.jpg',NULL),(105,'Amstel Lata  350ml','Cerveja Amstel',1,17,4.39,145,3.87,0,'https://res.cloudinary.com/dh4zkueea/image/upload/v1733173802/Amstel_350ml_b9gfzj.png',NULL),(106,'Amstel Ultra 269ml','Cerveja de Cevada Amstel - 269ml',1,17,5.20,80,4.60,0,'https://res.cloudinary.com/dh4zkueea/image/upload/v1733174321/Amstel_Ultra_-_269ml_xjfxrp.png',NULL),(107,'Artartica Sub Zero 350ml','Cerveja Antartica Zero 350ml',1,17,2.60,93,2.00,0,'https://res.cloudinary.com/dh4zkueea/image/upload/v1733174442/AntarticaSubZero_gen3w2.jpg',NULL),(108,'Bohemia Puro Malte 600ml','Cerveja Puro Malte Bohemia - 600ml',1,17,9.39,100,5.00,0,'https://res.cloudinary.com/dh4zkueea/image/upload/v1733226819/Bohemia_Puro_Malte_600ml_r6l4lr.jpg',NULL),(109,'Brahma Lata  350ml','Cerveja Brahama Lata 350ml',1,21,3.49,190,2.50,0,'https://res.cloudinary.com/dh4zkueea/image/upload/v1733226936/Brahma_350ml_-_lata_eizqlw.png',NULL),(110,'Brahma Long Neck 355ml','Cerveja Brahma Long Neck - 355ml',1,21,5.19,99,3.00,0,'https://res.cloudinary.com/dh4zkueea/image/upload/v1733227063/Brahma_Long_Neck_-_355ml_afzx8n.jpg',NULL),(111,'Brahma Puro Malte 355ml','Cerveja Brahma Puro Malte 355ml',1,21,4.99,167,3.50,0,'https://res.cloudinary.com/dh4zkueea/image/upload/v1733227412/Brahma_Puro_malte_fkgiwl.jpg',NULL),(112,'Brahma Zero 350ml','Brahma Lata Zero - 350ml',1,21,3.50,100,2.00,0,'https://res.cloudinary.com/dh4zkueea/image/upload/v1733227680/Brahma_Zero_rqxdqh.png',NULL),(113,'Budweiser 350ml','Cerveja Budweiser Lata - 350ml',1,21,4.29,145,2.50,0,'https://res.cloudinary.com/dh4zkueea/image/upload/v1733227786/Budweiser_-_350ml_dp5x0q.png',NULL),(114,'Budweiser Zero 350ml','Cerveja Budweiser Zero - 350ml',1,21,4.50,98,2.80,0,'https://res.cloudinary.com/dh4zkueea/image/upload/v1733227846/Budweiser_Zero-_350ml_qpic4h.jpg',NULL),(115,'Caracu 350ml','Cerveja Preta Carucu - 350ml',1,21,4.59,91,2.50,0,'https://res.cloudinary.com/dh4zkueea/image/upload/v1733227910/Caracu_qferap.jpg',NULL),(116,'Selvagem 900ml','Catuaba Selvagem Sabor Açaí - 900ml',0,21,999.00,30,999.00,1,'https://res.cloudinary.com/dh4zkueea/image/upload/v1733228066/Selvagem_900ml_slwvv1.png',NULL),(117,'Coca-Colla 2L','Refrigerante de Cola - 2L',1,17,11.99,199,6.00,0,'https://res.cloudinary.com/dh4zkueea/image/upload/v1733228393/Coca_2L_eh91kh.jpg',NULL),(118,'Coca-Colla Lata 350ml','Refrigerante de Cola Lata - 350ml',1,17,5.50,200,3.00,0,'https://res.cloudinary.com/dh4zkueea/image/upload/v1733228609/Coca-Colla_Lata_350ml_z9g8pb.jpg',NULL),(119,'Coca-Colla Lata Zero 350ml','Refrigerante de Cola Zero Açúcar - 350ml',1,17,5.50,187,3.00,0,'https://res.cloudinary.com/dh4zkueea/image/upload/v1733228671/Coca-Colla_Zero_Lata_350ml_yplxvv.jpg',NULL),(120,'Coca-Cola Zero 2L','Refrigerante de Cola Zero - 2L',1,26,11.99,200,5.00,0,'https://res.cloudinary.com/dh4zkueea/image/upload/v1733228820/Coca_Zero_-_2L_gvmq6s.jpg',NULL),(121,'Dell Vale Uva 1L','Suco Dell Vale Uva - 1L',1,23,10.99,159,5.50,0,'https://res.cloudinary.com/dh4zkueea/image/upload/v1733228926/Suco_dell_valle_gsund9.png',NULL),(122,'Dell Vale Laranja 1L','Suco Dell Vale Laranja - 1L',1,23,21.68,97,12.00,0,'https://res.cloudinary.com/dh4zkueea/image/upload/v1733228988/Del_valle_1L_hcnwky.jpg',NULL),(123,'Gelo 5kg','Cubos de Gelo - 5kg',1,24,14.00,100,6.00,0,'https://res.cloudinary.com/dh4zkueea/image/upload/v1733229324/Saco_de_Gelo_-_5Kg_d2gzu1.jpg',NULL),(124,'Gelo 10Kg','Saco de Gelo - 10Kg',1,24,16.00,100,8.00,0,'https://res.cloudinary.com/dh4zkueea/image/upload/v1733229369/Saco_de_Gelo_-_10Kg_o0tpxn.jpg',NULL);
/*!40000 ALTER TABLE `produtos` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ZERO_IN_DATE,NO_ZERO_DATE,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER atualizar_quantidade_produtos
AFTER INSERT ON produtos
FOR EACH ROW
BEGIN
    
    UPDATE categorias
    SET quantidade_produtos = quantidade_produtos + 1
    WHERE id_categoria = NEW.fk_id_categoria;
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

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
  `adm` tinyint(4) DEFAULT '0',
  `whatsapp` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `foto` text COLLATE utf8mb4_unicode_ci,
  `arquivado` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (10,'Aninha','aninha@gmail.com','123456','2007-10-01',0,'','',0),(11,'Leozinho','leo@gmail.com','123456','2007-10-01',1,'','',0),(30,'Junin','junin@gmail.com','123456','2009-11-04',1,'','https://res.cloudinary.com/dh4zkueea/image/upload/v1731858862/pica-pau_jsunw1.jpg',0),(31,'Junin','junin2@gmail.com','123456','2005-11-04',1,'','',0),(32,'Vini','vini@gmail.com','123456','2001-11-08',1,'','https://res.cloudinary.com/dh4zkueea/image/upload/v1732554196/Captura_de_tela_2024-11-25_135343_sjudjl.png',1),(33,'junin','teste@gmail.com','123456','2003-11-03',1,'',NULL,1),(34,'Juana','juana@gmail.com','123456','2009-11-04',1,'',NULL,0),(35,'Lucas','lucas@gmail.com','123456','2004-11-04',0,'',NULL,0),(36,'Joana','joana@gmail.com','123456','2005-11-04',0,'5527996065709',NULL,1),(37,'Maisa','maisa@gmail.com','123456','2024-11-21',0,NULL,NULL,0),(38,'lucas','lucas1@gmail.com','123456','2024-11-26',1,'',NULL,0),(39,'j','leoi@gmail.com','123','2024-11-10',0,NULL,NULL,0),(40,'juu','leoo@gmail.com','123456','2001-04-02',0,NULL,NULL,0),(41,'juu','leoo@gmail.com','123456','2024-11-14',0,NULL,NULL,0),(42,'juanaa','larinha@gmail.com','123456','2024-11-05',0,'5543984167577',NULL,0),(43,'KAKKA','kakazinho@gmail.com','123456','2002-02-22',1,'43998987967',NULL,0),(44,'Passoka','passoka@gmail.com','123456','1111-11-11',1,'439967856735','Paçoquita.jpg',0);
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
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER perfil_atualizado
AFTER UPDATE ON usuarios
FOR EACH ROW
BEGIN
    INSERT INTO notificacoes (
        tipo,
        visto,
        notificacao,
        data,
        horario,
        fk_id_usuario
    )
    VALUES (
        1,
        0,
        'Perfil atualizado.',
        CURDATE(),
        CURTIME(),
        OLD.id_usuario
    );
END */;;
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

-- Dump completed on 2024-12-04  1:14:09
