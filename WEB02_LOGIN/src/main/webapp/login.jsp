<%@ page contentType="text/html; charset=UTF-8" %>


<!DOCTYPE html>


<html lang="es">

	<head>
		<meta charset="UTF-8">
		<title>DESARROLLO WEB</title>
		
		<style type="text/css">
		
			body {
				color:white;
				background-color:black;				
			}
			
		
			h1 {
				color:red;
				text-shadow: 2px 2px 5px yellow;
			}
		
			fieldset {
				
				border:2px solid green;
				border-radius:25px;
				width:200px;
				
				/*
				border-size:2px;
				border-style:solid;
				border-color:green;
				*/
				
			}
			
			input[type=number] {
				appearance:textfield;
				background-color:cyan;
			}
			
		</style>
		
	</head>


	<body>
	
		<div align="center">
			
			<h1> YAHOO JAPAN AUCTIONS </h1>

			<fieldset>
			
				<legend> TERMINAL DE ACCESO </legend>
				
				
				<form action="loginServlet.do" method="post">
				
					<label for="usuario"> USUARIO </label>
					
					
					<input type="text" name="usuario" id="usuario" value="${param.usuario}" 
									size="10" maxlength="10"
									autofocus required/>
					
					
					<br/><br/><br/>
					
					
					
					<label for="clave"> CLAVE </label>
					
					&nbsp;&nbsp;&nbsp;
					
					<input type="password" name="clave" id="clave" value="" size="10" maxlength="10"
									required/>
					
					
					
					<br/><br/><br/>
					
					
					<button type="reset"> BORRAR </button>
			
					&nbsp;&nbsp;&nbsp;
					
					<button> ACCEDER </button>
				
				</form>
			
			</fieldset>
			
			
			<br/><br/>
			
			<div style="color:red;">
				${param.mensajeError}
			</div>
			
		</div>
		
	</body>

</html>
