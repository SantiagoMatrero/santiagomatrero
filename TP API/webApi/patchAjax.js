function patch(){

        var id = $("#inputIdUpdate").val();
        var nombre = $("#inputNombreUpdate").val();
        var edad = $("#inputEdadUpdate").val();

        var objetoAlumno = {};
        objetoAlumno["id"] = id;
        objetoAlumno["nombre"] = nombre;
        objetoAlumno["edad"] = edad;

        $.ajax({
            url: "http://localhost:8080/api/datos/alumnos",
            type: 'PATCH',
            contentType: "application/json",
            data: JSON.stringify(objetoAlumno)
        })

        .done(function (data) {
            $("respuestas").text("modificado");
        })

        .fail(function (jqXHR, textStatus, errorThrown) {
            console.log("no se pudieron ingresar los datos");
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        });
}