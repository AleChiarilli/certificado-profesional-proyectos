/*
SQLyog Community Edition- MySQL GUI v8.15 Beta1
MySQL - 6.0.0-alpha-community-nt-debug : Database - login_from_japan
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`login_from_japan` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `login_from_japan`;

/*Table structure for table `login` */

DROP TABLE IF EXISTS `login`;

CREATE TABLE `login` (
  `USER_ID` int(3) unsigned NOT NULL AUTO_INCREMENT,
  `USER_EMAIL` varchar(100) NOT NULL DEFAULT '',
  `PASSWORD` varchar(50) NOT NULL DEFAULT '',
  PRIMARY KEY (`USER_ID`),
  UNIQUE KEY `USER_EMAIL_IDX` (`USER_EMAIL`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `login` */

insert  into `login`(`USER_ID`,`USER_EMAIL`,`PASSWORD`) values (1,'ariel32@gmail.com','12345'),(2,'bombillaloca','7406'),(3,'itchhassekinder@gmail.com','666'),(4,'bombillaloca2','888');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
