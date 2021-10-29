function getTodos(){
    
    $.ajax({
        url: "http://localhost:8080/api/datos/alumnos",
        type: 'GET',
    })

    .done(function (data) {
        $("#respuestas").text(JSON.stringify(data,null,"\t"));
    })

    .fail(function (jqXHR, textStatus, errorThrown) {
        $("#respuestas").text("error al conectarse con la api");
        console.log("no se pudieron ingresar los datos");
        console.log(jqXHR);
        console.log(textStatus);
        console.log(errorThrown);
    });
}

function getPorId(){

        var id = $("#inputIdGet").val();

        $.ajax({
            url: "http://localhost:8080/api/datos/alumnos/" + id,
            type: 'GET',
        })
    
        .done(function (data) {
            $("#respuestas").text(JSON.stringify(data,null,"\t"));
        })
    
        .fail(function (jqXHR, textStatus, errorThrown) {
            $("#respuestas").text("error al conectarse con la api");
            console.log("no se pudieron ingresar los datos");
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        });

}