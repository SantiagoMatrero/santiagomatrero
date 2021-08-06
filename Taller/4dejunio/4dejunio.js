
function mostrarInputs() {
    document.getElementById("Nombre").style.visibility = "visible";
    document.getElementById("Apellido").style.visibility = "visible";
    document.getElementById("Edad").style.visibility = "visible";
    document.getElementById("ingresarDatos").style.visibility = "visible";
}


function ocultarInputs() {
    document.getElementById("Nombre").style.visibility = "hidden";
    document.getElementById("Nombre").value = "";
    document.getElementById("Apellido").style.visibility = "hidden";
    document.getElementById("Apellido").value = "";
    document.getElementById("Edad").style.visibility = "hidden";
    document.getElementById("Edad").value = "";
}

function agregarDatos() {
    var fila = tabla.insertRow(-1);
    for (var i=0; i<3; i++){
        var celda = fila.insertCell(i)
        if (i == 0){
            var input = document.getElementById("Nombre").value;
            celda.innerHTML = input
        }
        else if(i == 1){
            var input = document.getElementById("Apellido").value;
            celda.innerHTML = input
        }
        else {
            var input = document.getElementById("Edad").value;
            celda.innerHTML = input
        }
    }
    ocultarInputs();
}