/*
Nome do Programa        : Lt01_EstRep31
Objetivo                : Cálculo do quadrado dos valores entre 10 e 150                       
Nome do Programador     : Petter Gimenes Lopes
Data de desenvolvimento : 15/08/2019
*/
package o4_estrep;

public class Lt01_EstRep31 
{
    public static void main(String args[])
    {
        int n = 10, n1;
        while (n <= 150)
        {
            n1 = n * n;
            System.out.println(n + " ao quadrado é " + n1);
            n = n + 1;
        }
    }
}
