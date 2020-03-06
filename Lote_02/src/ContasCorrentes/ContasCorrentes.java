//Programador: Gabriel Rocha
//Data: 08/11/2019

package ContasCorrentes;

class ContasCorrentes {
    
    int codContaC, tipoContaC;
    double saldoContaC, limiteContaC;
    String nomeClientesC;
    
    ContasCorrentes() {
        this(0, 0, 0, 0, "");
    }
    
    ContasCorrentes(int cod, int tip, int sal, int lim, String nom) {
        codContaC = cod;
        tipoContaC = tip;
        saldoContaC = sal;
        limiteContaC = lim;
        nomeClientesC = nom;
    }
}
