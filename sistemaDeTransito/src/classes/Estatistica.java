package classes;

public class Estatistica {

    int codCidade;
    String nomeCidade;
    int qtdAcidentes;
    int tipoVeiculo;

    Estatistica() {
        this(0, "", 0, 0);
    }

    Estatistica(int cCidade, String nCidade, int qAcidentes, int tVeiculo) {
        cCidade = codCidade;
        nCidade = nomeCidade;
        qAcidentes = qtdAcidentes;
        tVeiculo = tipoVeiculo;
    }
}
