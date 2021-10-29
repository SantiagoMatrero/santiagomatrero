function deletePorId(){

    var id = $("#inputIdDelete").val();

    $.ajax({

        url: "http://localhost:8080/api/datos/alumnos/" + id,
        type: 'DELETE'

    })

    .done(function (data) {

        $("#respuestas").text("done");
        $("#inputIdDelete").val("");

    })

    .fail(function (jqXHR, textStatus, errorThrown) {

        console.log("no se pudieron ingresar los datos");
        console.log(jqXHR);
        console.log(textStatus);
        console.log(errorThrown);

    });

}