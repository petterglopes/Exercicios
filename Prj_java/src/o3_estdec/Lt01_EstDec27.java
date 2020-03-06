/*
Nome do Programa        : Lt01_EstDec27
Objetivo                : Cálculo de velocidade média                     
Nome do Programador     : Petter Gimenes Lopes
Data de desenvolvimento : 15/08/2019
*/

package o3_estdec;

import javax.swing.JOptionPane;

public class Lt01_EstDec27
{
    public static void main( String args[])
    {
        int p;
        int nv;
        int t;
        int v;
        p = Integer.parseInt(JOptionPane.showInputDialog("informe o valor do perimetro da circunferência em Km:"));
        nv = Integer.parseInt(JOptionPane.showInputDialog("informe o número de voltas:"));
        t = Integer.parseInt(JOptionPane.showInputDialog("informe o tempo do percurso em horas:"));
        v = (nv * p / t);
        JOptionPane.showMessageDialog(null, "A velocidade média é: " + v + "Km/h.");
    }
}