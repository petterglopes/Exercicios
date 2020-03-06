/*
Programador : Ricardo Satoshi
Data                : 23/02/2017
Objetivo          : Calcula a Área do Triângulo 
                           Exemplo de Função

*/

import javax.swing.JOptionPane;
public class ExemploFunção {
  public static void main(String args [ ] )  {
     int Base , Altura;
     Base = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O VALOR DA BASE DO TRINGULO"));
     Altura = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O VALOR DA ALTURA DO TRINGULO"));
     JOptionPane.showMessageDialog(null,"A AREA É " + FunçãoArea(Base,Altura));
   }

  static int FunçãoArea (int B , int H) {
    int AR = 0;
    AR = (B * H) / 2;
    return AR;
  }
}