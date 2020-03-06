/*
Programador : Ricardo Satoshi
Data                : 23/02/2017
Objetivo          : Calcula das Áreas  
                           Exemplo de Switch … Case

*/

import javax.swing.JOptionPane;
public class Exercicio_Area {

    public static void main (String arg [ ]) {
      int opc;
      opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Quadrado \n 2 - Retângulo \n 3 - Triângulo \n 4 - Trapézio"));
      switch (opc)
         {
            case 1: JOptionPane.showMessageDialog(null,"QUADRADO ");
                          break;
            case 2: JOptionPane.showMessageDialog(null,"RETANGULO ");
                           break;
            case 3: JOptionPane.showMessageDialog(null,"TRANGULO ");
                          break;
            case 4: JOptionPane.showMessageDialog(null,"TRAPEZIO ");
                           break;
            default: JOptionPane.showMessageDialog(null,"inválido");
         }

   }
}
