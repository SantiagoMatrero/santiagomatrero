function circulo(){
    var radio = document.getElementById("Radio").value;
    document.getElementById("resultado").innerHTML = Math.PI*radio*radio;
}

function esfera(){
    var radio = document.getElementById("Radio").value;
    document.getElementById("resultado").innerHTML = 4*Math.PI*radio*radio;
}

function cuadrado(){
    var lado = document.getElementById("Lado").value;
    document.getElementById("resultado").innerHTML = lado*lado;
}

function cubo(){
    var lado = document.getElementById("Lado").value;
    document.getElementById("resultado").innerHTML = 6*lado*lado;
}

function triangulo(){
    var base = document.getElementById("Base").value;
    var altura = document.getElementById("Altura").value;
    document.getElementById("resultado").innerHTML = base*altura/2;
}