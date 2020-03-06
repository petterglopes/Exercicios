//Programador: Gabriel Rocha
//Data: 18/10/2019

package Sistema_De_Transito;

class Estatistica {
    
    int codCid, qntAci, tipVei;
    String nomeCid;
    
    //método construtor
    Estatistica() {
        this(0, 0, 0, "");
    }
    
    Estatistica(int cod, int qnt, int tip, String nome) {
        codCid = cod;
        qntAci = qnt;
        tipVei = tip;
        nomeCid = nome;
    }
}
