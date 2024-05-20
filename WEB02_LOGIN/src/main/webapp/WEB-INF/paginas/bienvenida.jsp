<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mi Página de Inicio</title>
    <style type="text/css">
        /* Estilos CSS */
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f0f0f0;
        }

        header {
            background-color: #333;
            color: #fff;
            text-align: center;
            padding: 20px 0;
        }

        nav ul {
            list-style-type: none;
            margin: 0;
            padding: 0;
            text-align: center;
        }

        nav ul li {
            display: inline;
            margin-right: 20px;
        }

        nav ul li a {
            text-decoration: none;
            color: #fff;
        }

        section {
            padding: 20px;
            text-align: center;
        }

        footer {
            background-color: #333;
            color: #fff;
            text-align: center;
            padding: 10px 0;
            position: fixed;
            bottom: 0;
            width: 100%;
        }

        /* Estilos para los botones */
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

        /* Efectos adicionales */
        .hidden {
            display: none;
        }

        .fade-in {
            animation: fadeIn 1s ease-in-out;
        }

        @keyframes fadeIn {
            from {
                opacity: 0;
            }
            to {
                opacity: 1;
            }
        }
    </style>
</head>
<body>

<header>
    <h1 id="title">Hola, ${param.usuario} !</h1>
</header>

<nav>
    <ul>
        <li><a href="#" class="nav-link">Inicio</a></li>
        <li><a href="#" class="nav-link">Acerca de</a></li>
        <li><a href="#" class="nav-link">Servicios</a></li>
        <li><a href="#" class="nav-link">Contacto</a></li>
    </ul>
</nav>

<section>
    <div class="container">
        <h1>¡Bienvenido a tu apartado personal!</h1>
        <p id="welcomeText">Estimado ${param.usuario}, nos complace darte la bienvenida a nuestro sitio. Aquí encontrarás una variedad de servicios e información útil para hacer tu experiencia más agradable y productiva.</p>
        <p>En nuestra página, puedes explorar diferentes secciones, conocer más sobre nosotros y nuestros servicios, y ponerte en contacto con nosotros para cualquier consulta o asistencia que necesites.</p>
        <button onclick="saludar()">Saludar</button>
        <button onclick="mostrarInformacion()">Mostrar Información</button>
        <div id="information" class="hidden">
           
            <p>Este es el lugar perfecto para encontrar información, recursos y más. ¡Disfruta tu tiempo aquí!</p>
        </div>
    </div>
</section>

<footer>
    <p>&copy; 2024. Todos los derechos reservados. Diseñado con ❤️ para brindarte la mejor experiencia.</p>
</footer>

<script>
    // JavaScript
    var usuario = '<%= request.getParameter("usuario") %>';

    function saludar() {
        alert('¡Hola! Bienvenido a mi página de inicio, estimado ' + usuario);
    }

    function mostrarInformacion() {
        var information = document.getElementById('information');
        information.classList.remove('hidden');
        information.classList.add('fade-in');
    }
</script>

</body>
</html>
