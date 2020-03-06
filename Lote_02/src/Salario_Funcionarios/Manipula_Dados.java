package Salario_Funcionarios;

import javax.swing.JOptionPane;

public class Manipula_Dados {
    
    public static void main(String[] args) {
        Funcionario[] funcionario = new Funcionario[3];
        int I, C, B;
        int []Cods = new int[3];
        boolean Rep;
        double SB;
        for(I = 0; I <= 2; I++) {
            funcionario[I] = new Funcionario();
            funcionario[I].Nome = JOptionPane.showInputDialog("Digite o nome do funcionário: ");
            C = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do funcionário: "));
            Cods[I] = C;
            Rep = Verifica(Cods, C, I);
            while(C <= 10 || C >= 100 || Rep == true) {
                C = Integer.parseInt(JOptionPane.showInputDialog("ERRO! Digite o código do funcionário novamente: "));
                Cods[I] = C;
                Rep = Verifica(Cods, C, I);
            }
            funcionario[I].Cod = C;
            SB = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário bruto do funcionário: "));
            while(SB <= 1000 || SB >= 8000) {
                SB = Double.parseDouble(JOptionPane.showInputDialog("ERRO! Digite o salário bruto do funcionário novamente: "));
            }
            funcionario[I].Sal_Bruto = SB;
            B = Integer.parseInt(JOptionPane.showInputDialog("Digite o bônus do funcionário: "));
            while(B != 1 && B != 2 && B != 3 && B != 4) {
                B = Integer.parseInt(JOptionPane.showInputDialog("ERRO! Digite o bônus novamente: "));
            }
            funcionario[I].Bonus = B;
            switch(B) {
                case 1: funcionario[I].Sal_Liq = funcionario[I].Sal_Bruto * 0.9 + funcionario[I].Sal_Bruto * 0.1;
                break;
                case 2: funcionario[I].Sal_Liq = funcionario[I].Sal_Bruto * 0.9 + funcionario[I].Sal_Bruto * 0.15;
                break;
                case 3: funcionario[I].Sal_Liq = funcionario[I].Sal_Bruto * 0.9 + funcionario[I].Sal_Bruto * 0.2;
                break;
                case 4: funcionario[I].Sal_Liq = funcionario[I].Sal_Bruto * 0.9 + funcionario[I].Sal_Bruto * 0.25;
                break;
            }
        }
        for(I = 0; I <= 2; I++) {
            System.out.println("Nome do funcionário: " + funcionario[I].Nome + "\nSalário bruto: R$ " + funcionario[I].Sal_Bruto + "\nCódigo do funcionário: " + funcionario[I].Cod + "\nBônus do funcionário: " + funcionario[I].Bonus + "\nSalário a receber: R$ " + funcionario[I].Sal_Liq + "\n");
        }
    }
    
    static boolean Verifica(int[]Vt, int N, int J) {
        boolean Igual = false;
        for(int I = 0; I <= 2; I++) {
            if(Vt[I] == N && I != J) {
                Igual = true;
            }
        }
        return Igual;
    }
}
