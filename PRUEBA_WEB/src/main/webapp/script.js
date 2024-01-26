
function showCountry(country) {
	var selectedCountry = country.innerHTML.toLowerCase();
	
	document.querySelector("#display").innerHTML = "<img src='imagenes/" + selectedCountry + ".png'/>";
}

function verPassword(event) {
	var mostrarPassword = false;
	event.preventDefault();
	var passwordInput = document.getElementById("password");

	// Cambiar el tipo de input en función del booleano
	passwordInput.type = mostrarPassword ? "password" : "text";

	// Invertir el valor del booleano para la próxima vez
	mostrarPassword = !mostrarPassword;
			}
function prueba() {
	alert("js vinculado");
}

function animateContainer(event) {
	event.preventDefault();
    var container = document.querySelector('.container');
    container.classList.add('clicked');
    
    setTimeout(function () {
        window.location.href = "404.html";
    }, 1000);
}

