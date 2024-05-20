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
		
			p.noEntrar {
				color:red;
				font-size:22px;
			}
		
		</style>		
		
	</head>


	<body>
	
		<div align="center">
			
			<h1> DISCOTECA </h1>
			
			
			<br/><br/>
			
			
			<form action="DiscotecaServlet" method="POST">
			
				<label for="nombre"> TU NOMBRE: </label>
				
				&nbsp;&nbsp;&nbsp;
				
				<input type="text" 
						name="nombre" 
						id="nombre" 
						value="${param.nombre}" 
						size="21" 
						maxlength="20"
						autofocus 
						required/>
			
				<br/><br/>
				<br/><br/>
				
				<button>
					- ENTRAR -
				</button>
			
				<br/><br/>
			
				<p class="noEntrar"> ${param.mensaje} </p>
			
			</form>

		</div>
		
	</body>

</html>