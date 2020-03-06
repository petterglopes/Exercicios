//Programador: Gabriel Rocha
//Data: 26/09/2019

package Sistema_De_Votação;

import java.io.IOException;
import javax.swing.JOptionPane;

public class MenuPrincipal {
    
    public static void main(String[] args) throws IOException {
        Votacao[] vot = new Votacao[100];
        Metodos m = new Metodos();
        int opc = 0;
        while(opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("    SISTEMA DE VOTAÇÃO   \n\n1 - Carregar seção e número de eleitor\n2 - Classificar por seção\n3 - Gravar registros\n4 - Mostrar indicadores\n5 - Ler arquivo TXT\n9 - Finalizar\n"));
            switch(opc) {
                case 1: vot = m.FCADASTRAVOTAÇÃO(vot);
                break;
                case 2: vot = m.FCLASSIFICASEÇÃO(vot);
                break;
                case 3: vot = m.FGRAVAVOTAÇÃO(vot);
                break;
                case 4: Indicadores(vot, m);
                break;
                case 5: m.LERGRAVAÇÃO();
                break;
                case 9: JOptionPane.showMessageDialog(null, "FIM!");
                break;
                default: JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }
    
    static void Indicadores(Votacao[] vot, Metodos m) throws IOException {
        int opc = 0;
        while(opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("   ESTATÍSTICAS DA VOTAÇÃO EM 2016   \n\n1 - Quantidade de eleitores por seção\n2 - Seção com maior e menor número de eleitores\n3 - Quantidade de votos por candidato\n4 - 10 primeiros colocados (nro cand. e qtd votos)\n9 - Finaliza consulta\n"));
            switch(opc) {
                case 1: m.QuantEleitores(vot);
                break;
                case 2: m.MaiorMenor(vot);
                break;
                case 3: m.VotosCand(vot);
                break;
                case 4: m.MaisVotados(vot);
                break;
                case 9:
                break;
                default: JOptionPane.showMessageDialog(null, "Opção Inválida!");
            }
        } 
    }
}
