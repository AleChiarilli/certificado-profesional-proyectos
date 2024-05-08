/*
SQLyog Community Edition- MySQL GUI v8.15 Beta1
MySQL - 6.0.0-alpha-community-nt-debug : Database - empresa_1x1
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`empresa_1x1` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `empresa_1x1`;

/*Table structure for table `dnis` */

DROP TABLE IF EXISTS `dnis`;

CREATE TABLE `dnis` (
  `DNI` varchar(9) NOT NULL,
  `NOMBRE` varchar(30) NOT NULL,
  `APELLIDO_1` varchar(30) NOT NULL,
  `APELLIDO_2` varchar(30) NOT NULL,
  `DIRECCION` varchar(100) NOT NULL,
  PRIMARY KEY (`DNI`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `dnis` */

insert  into `dnis`(`DNI`,`NOMBRE`,`APELLIDO_1`,`APELLIDO_2`,`DIRECCION`) values ('12345678A','ANA','GARCIA ','PEREZ ','C/PALERMO 22 3A - MADRID'),('77777777B','JUAN','LOPEZ','LOPEZ','C/SUIZA 15 9B - MOSTOLES');

/*Table structure for table `empleados` */

DROP TABLE IF EXISTS `empleados`;

CREATE TABLE `empleados` (
  `EMPLEADO_ID` int(3) unsigned NOT NULL AUTO_INCREMENT,
  `DNI` varchar(9) NOT NULL,
  `FECHA` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`EMPLEADO_ID`),
  UNIQUE KEY `DNI_IDX` (`DNI`),
  CONSTRAINT `FK_empleados_dnis` FOREIGN KEY (`DNI`) REFERENCES `dnis` (`DNI`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `empleados` */

insert  into `empleados`(`EMPLEADO_ID`,`DNI`,`FECHA`) values (1,'12345678A','2024-07-01 10:00:00'),(2,'77777777B','2024-05-08 14:16:00');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;




/*

PRUEBAS

SELECT e.DNI, e.FECHA AS "FECHA CONTRATACION", d.NOMBRE, d.DIRECCION 
	FROM empleados AS e
		JOIN dnis AS d 
			ON e.DNI = d.DNI
				WHERE d.NOMBRE LIKE "ANA";
				
				
UPDATE empleados SET FECHA = "2024-05-08 14:16:00";

UPDATE empleados SET FECHA = "2024-07-01 10:00:00" WHERE EMPLEADO_ID = 1;



*/