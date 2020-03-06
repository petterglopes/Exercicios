//Programador: Gabriel Rocha
//Data: 18/10/2019

package Sistema_De_Transito;

import java.io.IOException;
import javax.swing.JOptionPane;

public class MenuPrincipal {
    
    public static void main(String[] args) throws IOException {
        Estatistica[] estatistica = new Estatistica[2];
        Metodos m = new Metodos();
        int opc = 0;
        while(opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("   MENU PRINCIPAL\n\n   Estatísticas de acidentes em 2015\n\n1 - Cadastrar estatística\n2 - Consultar por tipo de veículo\n3 - Consultar por quantidade de acidentes\n4 - Consultar todas as cidades\n5 - Consultar maior e menor média de acidentes\n9 - Finalizar"));
            switch(opc) {
                case 1: estatistica = m.FCADRASTRAESTATISTICA(estatistica);
                break;
                case 2: m.FTIPO(estatistica);
                break;
                case 3: m.PQTACIDENTES(estatistica);
                break;
                case 4: m.PCONSULTAACIDENTES(estatistica);
                break;
                case 5: m.MAIORESMENORES(estatistica);
                break;
                case 9: JOptionPane.showMessageDialog(null, "FIM!");
                break;
                default: JOptionPane.showMessageDialog(null, "ERRO! INSIRA UM VALOR VÁLIDO!");
            }
        }
    }
}
