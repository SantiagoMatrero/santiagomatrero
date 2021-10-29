function post(){

        var nombre = $("#inputNombrePost").val();
        var edad = $("#inputEdadPost").val();
        var objetoAlumno = {};
        objetoAlumno["nombre"] = nombre;
        objetoAlumno["edad"] = edad;

        $.ajax({
            url: "http://localhost:8080/api/datos/alumnos",
            type: 'POST',
            contentType: "application/json",
            data: JSON.stringify(objetoAlumno)
        })

        .done(function (data) {
            
            $("#respuestas").text("ingresado");
        })

        .fail(function (jqXHR, textStatus, errorThrown) {
            $("#respuestas").text("error al conectar la api");
            console.log("no se pudieron ingresar los datos");
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        });
}