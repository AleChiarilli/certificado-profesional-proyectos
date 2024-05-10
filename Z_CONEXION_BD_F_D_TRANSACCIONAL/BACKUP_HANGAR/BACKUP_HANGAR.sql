/*
SQLyog Community Edition- MySQL GUI v8.15 Beta1
MySQL - 6.0.0-alpha-community-nt-debug : Database - hangar
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`hangar` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `hangar`;

/*Table structure for table `aviones` */

DROP TABLE IF EXISTS `aviones`;

CREATE TABLE `aviones` (
  `AVION_ID` int(3) unsigned NOT NULL AUTO_INCREMENT,
  `MODELO` varchar(30) NOT NULL,
  `USO` varchar(30) NOT NULL,
  `PRECIO` int(12) NOT NULL,
  `STOCK` int(2) unsigned NOT NULL,
  PRIMARY KEY (`AVION_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `aviones` */

insert  into `aviones`(`AVION_ID`,`MODELO`,`USO`,`PRECIO`,`STOCK`) values (1,'F14','MILITAR',300000,3),(2,'A380','CIVIL',400000000,2);

/*Table structure for table `cobros` */

DROP TABLE IF EXISTS `cobros`;

CREATE TABLE `cobros` (
  `FACTURA_ID` int(3) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `EMPRESA` varchar(30) NOT NULL,
  `IMPORTE` int(12) unsigned NOT NULL,
  PRIMARY KEY (`FACTURA_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `cobros` */

insert  into `cobros`(`FACTURA_ID`,`EMPRESA`,`IMPORTE`) values (001,'NISU',100000);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
