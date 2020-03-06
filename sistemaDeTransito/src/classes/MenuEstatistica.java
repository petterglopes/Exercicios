package classes;

import java.io.IOException;
import javax.swing.JOptionPane;

public class MenuEstatistica {

    public static void main(String args[]) throws IOException {
        Estatistica estatistica[] = new Estatistica[2];
        Metodos m = new Metodos();
        int opc = 0;
        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("Estatísticas de acidentes em 2015\n\nEscolha a Opção:\n1 - Cadastro Estatística\n2 - Consultas\n9 - Finaliza."));
            switch (opc) {
                case 1:
                    estatistica = m.cadastroEstatistica(estatistica);
                    break;
                case 2:
                    while (opc != 8) {
                        opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha a Opção:\n1 - Consulta por tipo de veículo\n2 - Consulta por quantidade de acidentes\n3 - Consulta todos as cidades\n4 - Consulta maior menor média de acidentes\n8 - Finaliza."));
                        switch (opc) {
                            case 1:
                                m.tipo(estatistica);
                                break;
                            case 2:
                                m.tipo(estatistica);
                                break;
                            case 3:
                                m.pQtaCidade(estatistica);
                                break;
                            case 4:
                                m.pConsultaAcidentes(estatistica);
                                break;
                            case 8:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opção Invalida");
                        }
                    }
                    break;
                case 9:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Invalida");
            }
        }
    }
}
