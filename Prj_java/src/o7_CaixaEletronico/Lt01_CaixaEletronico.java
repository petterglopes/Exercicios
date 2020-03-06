/*
Nome do Programa        : Lt01_CaixaEletronico
Objetivo                : CAIXA ELETRÔNICO
Nome do Programador     : Petter Gimenes Lopes
Data de desenvolvimento : 13/09/2019
*/
package o7_CaixaEletronico;

import javax.swing.JOptionPane;

public class Lt01_CaixaEletronico
{
    static int ci[] = new int [6];
    static int cr [] = new int [6];
    static int valorCedula [] = {2, 5, 10, 20, 50, 100};
    static int maxv [] = new int [4];
    static int minv [] = new int [4];
    static int medv [] = new int [4];
    static int count [] = new int [4];
    static int totalSaques [] = new int [4];
    static int totalSaqueGeral = 0;
    static int saqEstatistica;
    static int n1;
    static int banco;
    static int sobras;
    static int qtdsaque;
        
    public static void main(String args[]){
        int opc = 0;
        while (opc != 9){
            calcResto();
            if (calcResto() == 0 || qtdsaque >= 100){
                opc = Integer.parseInt(JOptionPane.showInputDialog("Selecione a opçao desejada\n1 – Carregar Notas\n2 – Retirar Notas\n3 – Estatística\n9 – Fim"));
            }
            else{
                opc = Integer.parseInt(JOptionPane.showInputDialog("Selecione a opçao desejada\n2 – Retirar Notas\n3 – Estatística\n9 – Fim"));
            }
            switch (opc){
                case 1:
                    if (calcResto() == 0 || qtdsaque>=100){
                        CarregarNotas();
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Opção inválida. Selecione uma opção válida");
                    }
                    break;
                case 2: RetirarNotas();
                    break;
                case 3: mostrarEstatistica();
                    break;
                case 9:
                    break;
                default: JOptionPane.showMessageDialog(null, "Opção inválida. Selecione uma opção válida");
            }
        }
    }
    public static void CarregarNotas(){
        for (int i = 0; i < ci.length; i++){
            ci[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de sedula de R$" + valorCedula[i] + ",00:"));
        }
    }
    public static void RetirarNotas(){
        int saq;
        do{
            banco = Integer.parseInt(JOptionPane.showInputDialog("Selecione o banco desejado:\n1 – Banco do Brasil\n2 – Santander\n3 – Itau\n4 – Bradesco"));
            if(banco < 1 || banco > 4){
                JOptionPane.showMessageDialog(null, "Opção inválida. Selecione uma opção válida");
            }
        }while (banco < 1 || banco > 4);
        banco = banco - 1;
	saq = Integer.parseInt(JOptionPane.showInputDialog("informe o valor do saque: "));
        saqEstatistica = saq;	
	if (saq < 5)
	    JOptionPane.showMessageDialog(null,"O valor mínimo de para saque é R$5,00");
        else{
            if (saq % 10 == 1 || saq % 10 == 3 || saq % 10 == 6 || saq % 10 == 8){
                n1 = 4;
            }
            else{
                n1 = 0;
            }
            saq = saq - n1;
            seletor(saq);
        }
        entregaCedulas();
    }
    public static void entregaCedulas(){
        String qtd = "Quantidade de cedulas:\n";
        int resultado = 0;
        for (int i = 5; i >= 0; i--){
            if (cr[i] >= 1){
                qtd = qtd + cr[i] + " cédula(s) de R$" + valorCedula[i] + ",00.\n";
            }
        }
        for(int i = 0;i < cr.length;i++){
            if (cr[i] > 0){
                resultado = resultado + 1;
            }
        }
        if (resultado >= 1){
            JOptionPane.showMessageDialog(null,qtd);
        }
        for(int i = 0;i < cr.length;i++){
            cr[i] = 0;
        }
    }
    public static void seletor(int saq){
        if(calcResto() >= saq){
            cr = contador(opsDeSaque(saq), saq);
        }
        else{
            JOptionPane.showMessageDialog(null,"EXCEDEU O LIMITE DO CAIXA");
            saq = 0;
            saqEstatistica = 0;
        }
        for (int i = 0; i < cr.length; i++){
            saq = saq - cr[i]*valorCedula[i];
        }
        if (saq == 0){
            for (int i = 0; i < cr.length; i++){
                ci[i] = ci[i] - cr[i];
            }
            estatistica();
        }
        else{
            for (int i = 0; i<cr.length; i++){
                cr[i] = 0;
            }
            JOptionPane.showMessageDialog(null,"Não há quantidade de cedulas suficiente para o Saque. A guarde o caixa ser recaregado.");
        }
    }
    public static int opsDeSaque(int saq){
        int maior = 0;
        int resto = 0;
        int opc = 0;
        String qtd = "Quantidade de cedulas:\n";
        for (int i = 0; i > 5; i++){
            if(saq > valorCedula[i]){
                maior = i;
            }
        }
        for(int i = 0; i < (maior - 1); i++){
            resto = resto + ci[i]*valorCedula[i];
        }
        if (resto > saq && maior > 1){
            qtd = qtd + "Opção 1 -\n";
            cr = contador(maior,saq);
            for (int i = 5; i >= 0; i--){
                if (cr[i] >= 1){
                    qtd = qtd + cr[i] + " cédula(s) de R$" + valorCedula[i] + ",00.\n";
                }
            }
            cr = contador(maior - 1, saq);
            qtd = qtd + "\nOpção 2 -\n";
            for (int i = 5; i >= 0; i--){
                if (cr[i] >= 1){
                    qtd = qtd + cr[i] + " cédula(s) de R$" + valorCedula[i] + ",00.\n";
                }
            }
            while (opc != 3){
                opc = Integer.parseInt(JOptionPane.showInputDialog(qtd));
                switch (opc){
                case 1: opc = 3;
                    break;
                case 2: maior--;
                    opc = 3;
                    break;
                default: JOptionPane.showMessageDialog(null, "Opção inválida. Selecione uma opção válida");
                }
            }
        }
        return maior;
    }
    public static int[] contador(int maior, int saq){
        for (int i = 5; i >=0; i-- ){
            if(i > maior){
                cr[i] = 0;
            }
        }
        for(int i = maior; i >= 0; i--){
            if(i==0){
                saq = saq + n1;
            }
            if (saq >= valorCedula[i]){
                cr[i] = (saq - saq % valorCedula[i]) / valorCedula[i];
                if (cr[i] > ci[i]){
                    cr[i] = ci[i];
                    saq = saq - cr[i] * valorCedula[i];
                }
                else{
                    saq = saq % valorCedula[i];
                }
            }
            else{
                cr[i] = 0;
            }
        }
        return cr;
    }
    public static void estatistica(){
        if(maxv[banco] == 0){
            maxv[banco] = saqEstatistica;
        }        
        if(minv[banco] == 0){
            minv[banco] = saqEstatistica;
        }        
        if (saqEstatistica > maxv[banco]){
            maxv[banco] = saqEstatistica;
        }        
        if(saqEstatistica < minv[banco]){
            minv[banco] = saqEstatistica;
        }        
        count[banco] = count[banco] + 1;
        totalSaques[banco] = totalSaques[banco] + saqEstatistica;
        medv[banco] = totalSaques[banco]/count[banco];
        totalSaqueGeral = totalSaqueGeral + totalSaques[banco];
    }
    public static int calcResto(){
        int resto = 0;
        for (int i = 0; i < ci.length; i++){
            resto = resto + ci[i]*valorCedula[i];
        }
        return resto;
    }
    public static void mostrarEstatistica(){
        calcResto();
        String mostrar = "                                 Valor Minimo     Valor máximo    Valor médio   Valor total\n";
        String b[] = {"Banco do Brasil           ","Santander                     ","Itau                                  ","Bradesco                       "}; 
        for (int i = 0; i < b.length; i++){
            mostrar = mostrar + b[i] + minv[i] + "                              " + maxv[i] + "                   " + medv[i] + "                    " + totalSaques[i] + "\n";
        }
        mostrar = mostrar + "                             Total geral de saques: " + totalSaqueGeral+ "                                            Saldo Caixa: " + calcResto();
        JOptionPane.showMessageDialog(null, mostrar);
    }
}
