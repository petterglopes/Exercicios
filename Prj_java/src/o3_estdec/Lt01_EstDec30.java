/*
Nome do Programa        : Lt01_EstDec30
Objetivo                : Cálculo de idade                       
Nome do Programador     : Petter Gimenes Lopes
Data de desenvolvimento : 15/08/2019
*/

package o3_estdec;

import javax.swing.JOptionPane;

public class Lt01_EstDec30
{
    public static void main (String args[])
    {
    int an; //ano de nascimento
    int mn; //mês de nascimento
    int dn; //dia de nascimento
    int aa; //ano atual
    int ma; //mês atual
    int da; //dia atual
    int ia; //idade ano
    int im; //idade mês
    int id; //idade dia
    int vaa; //verifcar ano atual
    int van; //verifcar ano de nascimento
    int dtm; //Dia total do mes atual, utilizad para o cálculo.
    int dtm1; //Dia total do mes atual, para verifcar se quantidade de dias é incorreta.
    int dtm2; //Dia total do mes de nascimento, para verifcar se quantidade de dias é incorreta.
    int aab; //ano atual bissexto
    int anb; //ano nascimento bissexto
    String tfd; //texto final dia
    String tfm; //texto final mês
    String tfa; //texto final ano
    
    an = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de nascimento."));
    mn = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês de nascimento."));
    dn = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia de nascimento."));
    aa = Integer.parseInt(JOptionPane.showInputDialog("Informe  o ano atual."));
    ma = Integer.parseInt(JOptionPane.showInputDialog("Informe  o mês atual."));
    da = Integer.parseInt(JOptionPane.showInputDialog("Informe  o dia atual."));
    //verificar se ano atual é bissexto.
    vaa = aa / 4;
    vaa = vaa * 4;
    if (vaa == aa){
        aab = 1;
    }
        else {
            aab = 0;
    }
    //verificar se ano de nascimeto é bissexto.
    van = an / 4;
    van = van * 4;
    if (van == an)
    {
        anb = 1;
    }
        else 
        {
            anb = 0;
        }
    //Definição da quantidade de dias dos meses do ano atual para verifcar se quantidade de dias é incorreta.
    if (ma == 4 || ma == 6 || ma == 9 || ma == 11)
    {
            dtm1 = 30;
    }
            else if (ma == 2 && aab == 1)
            {
                dtm1 = 29;
            }
                else if (ma == 2 && aab == 0)
                {
                    dtm1 = 28;
                }
    else {
        dtm1 = 31;
    }
    //Definição da quantidade de dias dos meses do ano de nascimento para verifcar se quantidade de dias é incorreta.
    if (mn == 4 || mn == 6 || mn == 9 || mn == 11)
    {
            dtm2 = 30;
    }
            else if (mn == 2 && anb == 1)
            {
                dtm2 = 29;
            }
                else if (mn == 2 && anb == 0)
                {
                    dtm2 = 28;
                }
    else {
        dtm2 = 31;
    }
    if (aa < an || aa == an && ma < mn || aa == an && ma == mn && da < dn || mn > 12 || ma > 12 || dn > dtm2 || da > dtm1)
    {
        JOptionPane.showMessageDialog(null,"Informação inserida está incorreta.");
    }
        else 
        {
            //Calculo da idade
            if (da < dn)
            {
                ma = ma - 1;
            }
            if (ma == 4 || ma == 6 || ma == 9 || ma == 11)
            {
                dtm = 30;
            }
                else if (ma == 2 && aab == 1)
                {
                    dtm = 29;
                }
                        else if (ma == 2 && aab == 0)
                        {
                            dtm = 28;
                        }
            else
            {
                dtm = 31;
            }
            ia = aa - an;
            if (ma >= mn)
            {
                im = ma - mn;
            }
                    else
                    {
                        im = (12 - mn + ma);
                        ia = (ia - 1);
                    }
            if (da >= dn)
            {
                id = da - dn;
            }
                    else 
                    {
                        id = dtm - dn + da;
                    }
            //Verifcar se a mensage deve estar no plural ou singular.
            if (id == 1)
            {
                tfd = " dia.";
            }
                else 
                {
                    tfd = " dias.";
                }
            if (im == 1)
            {
                tfm = " mês ";
            }
                else 
                {
                    tfm = " meses ";
                }
            if (ia == 1)
            {
                tfa = " ano ";
            }
                else
                {
                    tfa = " anos ";
                }
            JOptionPane.showMessageDialog(null,"A idade atual é: " + ia + tfa + im + tfm + id + tfd);
        }
    }
}
