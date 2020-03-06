//Programador: Gabriel Rocha
//Data: 10/11/2019

package ContasCorrentes;

class ContasAtualizadas {
    
    int codContaA, limiteContaA, tipoContaA;
    double saldoContaA;
    String nomeClientesA;
    
    ContasAtualizadas() {
        this(0, 0, 0, 0, "");
    }
    
    ContasAtualizadas(int cod, int lim, int tip, double sal, String nom) {
        codContaA = cod;
        limiteContaA = lim;
        tipoContaA = tip;
        saldoContaA = sal;
        nomeClientesA = nom;
    }
}
