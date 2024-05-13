/*
SQLyog Community v13.2.1 (64 bit)
MySQL - 8.0.33 : Database - hangar
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`hangar` /*!40100 DEFAULT CHARACTER SET utf8mb3 */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `hangar`;

/*Table structure for table `aviones` */

DROP TABLE IF EXISTS `aviones`;

CREATE TABLE `aviones` (
  `AVION_ID` int unsigned NOT NULL AUTO_INCREMENT,
  `MODELO` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `USO` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `IMPORTE_UNITARIO` int unsigned NOT NULL,
  `STOCK` int unsigned NOT NULL,
  PRIMARY KEY (`AVION_ID`),
  UNIQUE KEY `modelo_IDX` (`MODELO`),
  KEY `aviones_usos_FK` (`USO`),
  CONSTRAINT `aviones_usos_FK` FOREIGN KEY (`USO`) REFERENCES `usos` (`USO`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;

/*Data for the table `aviones` */

insert  into `aviones`(`AVION_ID`,`MODELO`,`USO`,`IMPORTE_UNITARIO`,`STOCK`) values 
(1,'F14 TOMCAT','MILITAR',300000,1),
(2,'AIRBUS A380','CIVIL',400000000,2),
(3,'PEGASUS VBJ','PRIVADO',6000000,3);

/*Table structure for table `cobros` */

DROP TABLE IF EXISTS `cobros`;

CREATE TABLE `cobros` (
  `FACTURA_ID` int(3) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `EMPRESA_CLIENTE` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `MODELO` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `UNIDADES` int unsigned NOT NULL,
  `IMPORTE_UNITARIO` int unsigned NOT NULL,
  `IMPORTE_TOTAL` int unsigned NOT NULL,
  PRIMARY KEY (`FACTURA_ID`),
  KEY `cobros_aviones_FK` (`MODELO`),
  CONSTRAINT `cobros_aviones_FK` FOREIGN KEY (`MODELO`) REFERENCES `aviones` (`MODELO`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;

/*Data for the table `cobros` */

/*Table structure for table `usos` */

DROP TABLE IF EXISTS `usos`;

CREATE TABLE `usos` (
  `USO_ID` int unsigned NOT NULL AUTO_INCREMENT,
  `USO` varchar(100) NOT NULL,
  PRIMARY KEY (`USO_ID`),
  UNIQUE KEY `USO_IDX` (`USO`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3;

/*Data for the table `usos` */

insert  into `usos`(`USO_ID`,`USO`) values 
(2,'CIVIL'),
(1,'MILITAR'),
(3,'PRIVADO');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
