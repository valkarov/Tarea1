function consultar(){
    var cedula = document.getElementById("txt_identificacion").value;
    fetch('https://api.hacienda.go.cr/fe/ae?identificacion='+cedula).then(function(response) {
        return response.json();
    }).then(function(myJson) {
        if(myJson.code == 400){
            document.getElementById('txt_nombre').value = "Identificacion no valida";

        }else{
            document.getElementById('txt_nombre').value = myJson.nombre;
        }
    });
}

