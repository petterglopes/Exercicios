
package o1_aula;

import javax.swing.JOptionPane;

public class ExemploEscolhaCaso 
{
    public static void main (String args[])
    {
        int opc = Integer.parseInt(JOptionPane.showInputDialog("Digite Opc"));
    
        switch (opc)
        {
            case 1: System.out.println("Sabado");
                break;
            case 2: System.out.println("Domingo");
                break;
            default: System.out.println("Opc invalida");
        }
    }
}
