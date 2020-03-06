/*
Nome do Programa        : Lt01_EstDec25
Objetivo                : Calculo de tempo de jogo                      
Nome do Programador     : Petter Gimenes Lopes
Data de desenvolvimento : 15/08/2019
*/

package o3_estdec;

import javax.swing.JOptionPane;

public class Lt01_EstDec25
{
    public static void main( String args[])
    {
    int hi;
    int mi;
    int hf;
    int mf;
    int hj;
    int mj;
    
    hi = Integer.parseInt(JOptionPane.showInputDialog("Informe a hora de início."));
    mi = Integer.parseInt(JOptionPane.showInputDialog("Informe o minuto de início."));
    hf = Integer.parseInt(JOptionPane.showInputDialog("Informe a hora de fim."));
    mf = Integer.parseInt(JOptionPane.showInputDialog("Informe a minuto de fim."));
    
    if (hi <= hf)
    {
        hj = (hf - hi);
    }
        else {
            hj = (24 - hi + hf);
            }
    if (mi <= mf){
        mj = (mf - mi);
    }
        else {
            mj = (60 - mi + mf);
            hj = (hj - 1);
        }
    if (hj >= 24){
        JOptionPane.showMessageDialog(null, "O tempo e jogo não pode ser maior que 23:59 hs. Favor inserir o horario de início e fim novamente.");
    }
        else if (hj < 10 && mj < 10){
            JOptionPane.showMessageDialog(null, "O tempo jogo é 0" + hj + ":0" + mj + "hs.");
            }
            else if (hj < 10){
                JOptionPane.showMessageDialog(null, "O tempo jogo é 0" + hj + ":" + mj + "hs.");
            }
                else if (mj < 10) {
                    JOptionPane.showMessageDialog(null, "O tempo jogo é " + hj + ":0" + mj + "hs.");
                }
                    else {
                        JOptionPane.showMessageDialog(null, "O tempo jogo é " + hj + ":" + mj + "hs.");
                    }
    }
}