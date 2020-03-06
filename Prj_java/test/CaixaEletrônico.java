/*
Objetivo: Criar um caixa eletrônico com 4 opções de bancos que permita ao usuário carregar as notas do caixa e escolher receber, ou não, 2 notas de R$ 10 ou 1 nota de R$ 20 no ato da retirada de notas (caso haja notas de R$ 10 e R$ suficientes, claro). Também, mostrar a estatística de um banco escolhido pelo usuário, sendo elas: maior e menor valor sacado, média dos saques e o valor total dos saques do banco escolhido (Banco do Brasil, Santander, Itaú ou Caixa).
É um exercício da faculdade. Estou começando na linguagem ainda e queria implementar este caixa em jframes, mas não consegui aprender essa ferramenta direito.
Programador: GDRS
Data: 19/07/2019
*/
import java.util.Scanner;

public class CaixaEletrônico {

    static int[][] Notas = new int[3][6];
    static double[][] Bancos = new double[5][4];
    static String[] Nomes = {"Banco do Brasil", "Santander", "Itaú", "Caixa"};
    static Scanner input = new Scanner(System.in);
    static double Total = 0;
            
    public static void main(String[] args) {
        Inicia_Matrizes();
        Menu();
    }    
    
    //Menu principal para o usuário
    public static void Menu() {
        int Opc = 0;
        System.out.println("MENU\n");
        System.out.println("Digite [1] para CARREGAR NOTAS");
        System.out.println("Digite [2] para RETIRAR NOTAS");
        System.out.println("Digite [3] para ESTATÍSTICA");
        System.out.println("Digite [9] para FINALIZAR");
        while(Opc != 1 && Opc != 2 && Opc != 3 && Opc != 9) {
            System.out.print("\nSua opção: ");
            Opc = input.nextInt();
            switch(Opc) {
                case 1:
                    Carrega_Notas();
                    break;
                case 2:
                    Retira_Notas();
                    break;
                case 3:
                    Estatistica();
                    break;
                case 9:
                    System.out.println("\nFim! Tenha um bom dia!");
                    break;
                default:
            }
        } 
    }
    
    //Método que carrega as matrizes das notas e dos bancos
    public static void Inicia_Matrizes() {
        int I, J;
        Notas[0][0] = 2;
        Notas[0][1] = 5;
        Notas[0][2] = 10;
        Notas[0][3] = 20;
        Notas[0][4] = 50;
        Notas[0][5] = 100;
        for(J = 0; J <= 5; J++) {
            Notas[1][J] = 100;                  //O caixa começa com 100 notas de cada valor carregadas
        }
        Total = Calcula_Total(Notas);
        for(I = 0; I <= 4; I++) {
            for(J = 0; J <= 3; J++) {
                Bancos[I][J] = 0;       
            }
        }    
    }
    
    //Método em que o usuário faz a retirada das notas
    public static void Retira_Notas() {
        double V, Saque;
        int Trocados = 23;
        System.out.println("-------------------------------------");
        System.out.println("RETIRADA DE NOTAS\n");
        System.out.print("Digite o valor do saque: R$ ");
        V = input.nextInt();
        Saque = V;
        if(V <= Total && V > 1 && V != 3) {
            Verifica_Bancos(V);
            if(V > 20 && V != 21 && V != 23) {
                if(Notas[1][2] >= 2 && Notas[1][3] >= 1) {
                    System.out.println("\nDigite [1] caso você queira receber 1 nota de R$ 20");
                    System.out.println("Digite [2] caso você queira receber 2 notas de R$ 10");
                    System.out.println("Digite qualquer outra coisa caso não queira receber trocados\n");
                    System.out.print("Sua opção: ");
                    Trocados = input.nextInt();
                    if(Trocados == 1) {
                        V = V - 20;
                        Notas[2][3]++;
                        Notas[1][3] = Notas[1][3] - 1;
                    }else if(Trocados == 2) {
                        V = V - 20;
                        Notas[2][2] = Notas[2][2] + 2;
                        Notas[1][2] = Notas[1][2] - 2;
                    }
                }
            }
        Faz_Retirada(V, Trocados, Saque);
        }else {
            System.out.println("\nExcedeu o limite do caixa!");
            System.out.println("-------------------------------------");
        }
        Menu();
    }
    
    //Método para o carregamento de notas feito pelo usuário
    public static void Carrega_Notas() {
        System.out.println("-------------------------------------");
        System.out.println("CARREGAMENTO DE NOTAS\n");
        for(int J = 0; J <= 5; J++) {
            System.out.print("Quantas notas de R$ " + Notas[0][J] + " você deseja adicionar ao caixa? ");
            Notas[1][J] = Notas[1][J] + input.nextInt();
        }
        System.out.println("\nNotas carregadas com SUCESSO!");
        System.out.println("-------------------------------------");
        Total = Calcula_Total(Notas);
        Menu();
    }

    //Método responsável por mostrar as estatísticas do banco escolhido pelo usuário
    public static void Estatistica() {
        int B;
        System.out.println("-------------------------------------");
        System.out.println("ESTATÍSTICAS\n");
        System.out.println("De qual banco você deseja ver as estatísticas?\n");
        System.out.println("Digite [1] para BANCO DO BRASIL");
        System.out.println("Digite [2] para SANTANDER");
        System.out.println("Digite [3] para ITAÚ");
        System.out.println("Digite [4] para CAIXA");
        System.out.print("\nCódigo do banco escolhido: ");
        B = input.nextInt();
        while(B != 1 && B != 2 && B != 3 && B != 4) {
            System.out.print("\nCódigo do banco escolhido: ");
            B = input.nextInt();
        }
        System.out.println("\nBanco: " + Nomes[B - 1]);
        System.out.println("Menor valor sacado: R$ " + Bancos[0][B - 1]);
        System.out.println("Maior valor sacado: R$ " + Bancos[1][B - 1]);
        System.out.println("Média dos saques: R$ " + Bancos[2][B - 1]);
        System.out.println("Valor total sacado: R$ " + Bancos[3][B - 1]);
        if(Total > 0) {
            System.out.println("\nAinda há R$ " + Total + " no caixa, sendo:\n");
            for(int J = 5; J >= 0; J--) {
                if(Notas[1][J] != 0) {
                    if(Notas[1][J] > 1) {
                        System.out.println("" + Notas[1][J] + " notas de R$ " + Notas[0][J]);
                    }else {
                        System.out.println("" + Notas[1][J] + " nota de R$ " + Notas[0][J]);
                    }
                }
            }
        }else {
            System.out.println("\nO caixa está ZERADO! Recarregue-o!");
        }
        System.out.println("-------------------------------------");
        Menu();
    }

    //Função que recebe a matriz das notas e retorna quanto dinheiro há no caixa
    public static double Calcula_Total(int[][]Mat) {
        double Soma = 0;
        for(int J = 0; J <= 5; J++) {
            Soma = Soma + (Mat[0][J] * Mat[1][J]);
        }
        return Soma;
    }
    
    //Método que armazena os dados do usuário na posição correta da matriz Bancos
    public static void Verifica_Bancos(double V1){
        int B = 23;
        System.out.println("\nEm qual banco você tem conta?\n");
        System.out.println("Digite [1] para BANCO DO BRASIL");
        System.out.println("Digite [2] para SANTANDER");
        System.out.println("Digite [3] para ITAÚ");
        System.out.println("Digite [4] para CAIXA");  
        while(B != 0 && B != 1 && B != 2 && B != 3) {
            System.out.print("\nCódigo do banco escolhido: ");
            B = input.nextInt() - 1;
        }
        Bancos[3][B] = Bancos[3][B] + V1;                    //Soma o valor sacado ao total de dinheiro sacado neste banco
        Bancos[4][B]++;                                     //Soma 1 ao número de saques realizados neste banco
        Bancos[2][B] = Bancos[3][B] / Bancos[4][B];         //Calcula a média dos valores sacados neste banco
        if(Bancos[4][B] == 1) {
            Bancos[0][B] = V1;                               //Menor valor sacado deste banco recebe o saque
            Bancos[1][B] = V1;                               //Maior valor sacado neste banco recebe o saque
        }else if(V1 < Bancos[0][B]) {
            Bancos[0][B] = V1;
        }else if(V1 > Bancos[1][B]) {
            Bancos[1][B] = V1;
        }
    }
    
    public static void Faz_Retirada(double V1, int T, double S){
        int J;
        for(J = 5; J >= 0; J--) {
            Notas[2][J] =(int)V1 / Notas[0][J];            //Notas[2][J] é onde ficam armazenadas as notas retiradas na operação
            if(Notas[2][J] >= Notas[1][J]) {
                Notas[2][J] = Notas[1][J];
            }
            V1 = V1 - (Notas[2][J] * Notas[0][J]);
            if(V1 == 1 || V1 == 3) {
                Notas[2][J]--;
                V1 = V1 + Notas[0][J];
            }
            Notas[1][J] = Notas[1][J] - Notas[2][J];        //Subtraindo as notas retiradas das notas totais daquele valor no caixa
        }
        System.out.println("\nSaque de R$ " + S + " realizado com SUCESSO! Você receberá:\n");
        switch (T) {
            case 1:
                Notas[2][3]++;
                break;
            case 2:
                Notas[2][2] = Notas[2][2] + 2;
                break;
            default:
                break;
        }
        for(J = 5; J >= 0; J--) {
            if(Notas[2][J] != 0) {
                if(Notas[2][J] > 1) {
                    System.out.println("" + Notas[2][J] + " notas de R$ " + Notas[0][J]);
                }else{
                    System.out.println("" + Notas[2][J] + " nota de R$ " + Notas[0][J]);
                }
            }
        }
        System.out.println("-------------------------------------");
        Total = Calcula_Total(Notas);
    }
}