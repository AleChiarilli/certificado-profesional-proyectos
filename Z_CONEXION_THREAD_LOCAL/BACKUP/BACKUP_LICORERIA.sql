/*
SQLyog Community Edition- MySQL GUI v8.15 Beta1
MySQL - 6.0.0-alpha-community-nt-debug : Database - licoreria
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`licoreria` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `licoreria`;

/*Table structure for table `bebidas` */

DROP TABLE IF EXISTS `bebidas`;

CREATE TABLE `bebidas` (
  `BEBIDA_ID` int(3) unsigned NOT NULL AUTO_INCREMENT,
  `NOMBRE` varchar(30) NOT NULL,
  `PRECIO` double(5,2) unsigned NOT NULL,
  `ALCOHOL` tinyint(1) NOT NULL,
  PRIMARY KEY (`BEBIDA_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `bebidas` */

insert  into `bebidas`(`BEBIDA_ID`,`NOMBRE`,`PRECIO`,`ALCOHOL`) values (1,'MIRINDA',30.00,0),(2,'JUDAS',7.50,1),(3,'BALLANTINES',12.90,1),(4,'COCACOLA',2.20,0),(5,'PUERTO DE INDIAS',11.69,1),(6,'ANIS DEL MONO',9.99,1),(7,'TEQUILA DON JULIO',82.45,1),(8,'JOHNNIE WALKER BLUE LABEL',666.00,1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
