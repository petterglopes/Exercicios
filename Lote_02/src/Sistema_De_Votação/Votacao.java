//Programador: Gabriel Rocha
//Data: 26/10/2019

package Sistema_De_Votação;

class Votacao {
    
    int numeroSecao, numeroCandidato;
    
    Votacao() {
        this(0, 0);
    }
    
    Votacao(int nSec, int nCan) {
        numeroSecao = nSec;
        numeroCandidato = nCan;
    }
}
