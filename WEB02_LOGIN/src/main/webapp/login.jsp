<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>MARKETPLACE - login</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(135deg, #1c1c1c, #444);
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            color: #ffffff;
        }
        h1 {
            color: white;
            text-shadow: 1px 1px 10px #ffffff;
        }
        .login-container {
            background: rgba(255, 255, 255, 0.1);
            padding: 20px;
            border-radius: 15px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.5);
            text-align: center;
        }
        fieldset {
            border: none;
            margin: 0;
            padding: 0;
        }
        legend {
            font-size: 1.2em;
            margin-bottom: 10px;
            color: #ffffff;
        }
        label {
            display: block;
            margin: 10px 0 5px;
            text-align: left;
        }
        input[type="text"], input[type="password"] {
            width: calc(100% - 20px);
            padding: 10px;
            margin: 5px 0 20px;
            border: none;
            border-radius: 5px;
            box-shadow: inset 0 0 5px rgba(0, 0, 0, 0.5);
        }
        button {
            background: #ff4d4d;
            color: #fff;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background 0.3s;
        }
        button:hover {
            background: #e63939;
        }
        .error-message {
            color: #ff4d4d;
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <div class="login-container">
        <h1>MARKETPLACE - login</h1>
        <fieldset>
            <legend>Terminal de Acceso</legend>
            <form action="loginServlet.do" method="post">
                <label for="usuario">Usuario</label>
                <input type="text" name="usuario" id="usuario" value="${param.usuario}" required />
                
                <label for="clave">Clave</label>
                <input type="password" name="clave" id="clave" required />
                
                <button type="reset">Borrar</button>
                <button type="submit">Acceder</button>
            </form>
        </fieldset>
        <div class="error-message">
            ${param.mensajeError}
        </div>
    </div>
</body>
</html>
