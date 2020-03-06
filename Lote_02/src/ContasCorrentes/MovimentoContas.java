//Programador: Gabriel Rocha
//Data: 10/11/2019

package ContasCorrentes;

class MovimentoContas {
    
    int codContaM, tipoMovimentoM, statusM;
    double valorMovimentoM;
    
    MovimentoContas() {
        this(0, 0, 0, 0);
    }
    
    MovimentoContas(int cod, int tip, int sta, double val) {
        codContaM = cod;
        tipoMovimentoM = tip;
        statusM = sta;
        valorMovimentoM = val;
    }
}
