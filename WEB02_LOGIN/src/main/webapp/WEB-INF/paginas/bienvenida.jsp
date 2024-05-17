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
            padding: 10px 20px;
            font-size: 16px;
            border: none;
            border-radius: 4px;
            background-color: #007bff;
            color: #fff;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        button:hover {
            background-color: #0056b3;
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
    <h1 id="title">BIENVENIDA ${param.usuario}</h1>
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
        <h1>Bienvenido a Mi Página de Inicio</h1>
        <p id="welcomeText">¡Hola! Esta es una página de inicio generada con HTML, CSS y JavaScript.</p>
        <button onclick="saludar()">Saludar</button>
        <button onclick="mostrarInformacion()">Mostrar Información</button>
        <div id="information" class="hidden">
            <p>¡Bienvenido a mi página de inicio!</p>
            <p>Esta página contiene contenido dinámico y efectos.</p>
        </div>
    </div>
</section>

<footer>
    <p>&copy; 2024 Mi Página. Todos los derechos reservados.</p>
</footer>

<script>
    // JavaScript
    function saludar() {
        alert('¡Hola! Bienvenido a mi página de inicio.');
    }

    function mostrarInformacion() {
        var information = document.getElementById('information');
        information.classList.remove('hidden');
        information.classList.add('fade-in');
    }
</script>

</body>
</html>
