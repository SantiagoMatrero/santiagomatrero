
function mostrardatos(){
    let nombreIngresado = $("#nombre").value;
    let apellidoIngresado = $("#apellido").value;
    let edadIngresada = $("#edad").value;

    document.getElementById(primercuadro).innerHTML = nombreIngresado;
    document.getElementById(segundocuadro).innerHTML = apellidoIngresado;
    document.getElementById(tercercuadro).innerHTML = edadIngresada;
}