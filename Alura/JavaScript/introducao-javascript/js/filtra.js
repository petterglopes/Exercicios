var campoFiltro = document.querySelector("#filtrar-tabela");

campoFiltro.addEventListener("input", function(){
    var pacientes = document.querySelectorAll(".paciente");

    if(this.value.length > 0){
        pacientes.forEach(function(paciente){
            var nome = paciente.querySelector(".info-nome").textContent;
            if(new RegExp(campoFiltro.value, "i").test(nome)){
                paciente.classList.remove("invisivel");
            }else{
                paciente.classList.add("invisivel");
            }
        });
    }else{
        pacientes.forEach(function(paciente){
            paciente.classList.remove("invisivel");
        });
    }
});