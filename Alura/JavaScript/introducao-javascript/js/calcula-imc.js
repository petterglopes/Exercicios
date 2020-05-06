var titulo = document.querySelector(".titulo");
titulo.textContent = "Aparecida Nutricionista";

var pacientes = document.querySelectorAll(".paciente");

for (var i = 0; i < pacientes.length; i++) {

    var paciente = pacientes[i];

    var peso = paciente.querySelector(".info-peso").textContent;
    
    var altura = paciente.querySelector(".info-altura").textContent;
    
    var tdImc = paciente.querySelector(".info-imc");
    
    var pesoValido = validaPeso(peso);
    var alturaValida = validaAltura(altura);

    if(!pesoValido){
        console.log("Peso inválido!");
        pesoValido = false;
        tdImc.textContent = "Peso inválido!";
        paciente.classList.add("paciente-invalido");
    }

    if(!alturaValida){
        console.log("Altura inválido!");
        alturaValida = false;
        tdImc.textContent = "Altura inválido!";
        paciente.classList.add("paciente-invalido");
    }
        
    if(pesoValido && alturaValida){
        tdImc.textContent = calculaImc(peso, altura);
    }
}

function calculaImc(peso, altura){
    return (peso / (altura * altura)).toFixed(2)
}

function validaPeso(peso){
    if(peso >= 0 && peso <= 500){
        return true;
    }else{
        return false;
    }
}

function validaAltura(altura){
    if(altura >= 0 && altura <= 3.00){
        return true;
    }else{
        return false;
    }
}