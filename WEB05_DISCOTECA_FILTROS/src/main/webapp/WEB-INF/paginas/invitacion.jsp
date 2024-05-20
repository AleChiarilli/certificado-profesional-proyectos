<%@ page contentType="text/html; charset=UTF-8" %>


<!DOCTYPE html>


<html lang="es">

	<head>
		<meta charset="UTF-8">
		<title>DESARROLLO WEB</title>
		
		<style type="text/css">
		
			body {
				color:orange;
				background-color:black;				
			}
			
			h1 {
				font-size:1cm;
				text-shadow:3px 3px 5px red;
			}
		
			img {
				width:250px;
				border-radius:30px;
			}
		
		</style>
		
	</head>


	<body>
	
		<div align="center">
			
			<h1> DISCOTECA </h1>
			
			<h3> ${requestScope.horaActual} </h3>
			
			
			<br/><br/>
			
			
			<p> BIENVENIDO ... ${param.nombre} </p>


			<br/><br/>
			
			
			<img src="imagenes/copa.jpg"/>
			
			
			<br/><br/>
			<br/><br/>
			
			
			<a href="index.jsp?nombre=${param.nombre}"> - SALIR - </a>

		</div>
		
	</body>

</html>