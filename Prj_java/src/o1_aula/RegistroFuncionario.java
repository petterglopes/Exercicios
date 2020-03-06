package o1_aula;

import javax.swing.*;
public class RegistroFuncionario {
    public static void main(String args[]){
       Funcionario[] funcionario = new Funcionario[3];
        int codigo[] = {0,0,0};
        String mostrar = "";
        for(int i = 0; i < 3; i++){
            funcionario[i] = new Funcionario();
        }
        for(int i = 0; i < 3; i++){
            do{
                funcionario[i].codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o codigo do funcionário:"));
                if(funcionario[i].codigo < 11 || funcionario[i].codigo > 99){
                    JOptionPane.showMessageDialog(null, "Codigo inválido");
                }
                for(int j = 0; j < 3; j++){
                    if(funcionario[i].codigo == codigo[j]){
                        JOptionPane.showMessageDialog(null, "Codigo do funcioario ja incerido");
                        funcionario[i].codigo = 3;
                    }                    
                }
            }while(funcionario[i].codigo < 11 || funcionario[i].codigo > 99);
            codigo[i] = funcionario[i].codigo;
            funcionario[i].nome = JOptionPane.showInputDialog("Informe o nome do funcionario:");
            do{
                funcionario[i].salario_bruto = Integer.parseInt(JOptionPane.showInputDialog("Informe o salário bruto do funcionario " + funcionario[i].nome));
                if(funcionario[i].salario_bruto < 1001 || funcionario[i].salario_bruto > 7999){
                    JOptionPane.showMessageDialog(null, "O salario tem que ser maior que R$1000,00 e menor que R$8000,00");
                }
            }while(funcionario[i].salario_bruto < 1001 || funcionario[i].salario_bruto > 7999);
            do{
                funcionario[i].bonus = Integer.parseInt(JOptionPane.showInputDialog("Informe a clase de bonus do funcionario " + funcionario[i].nome));
                if(funcionario[i].bonus < 1 || funcionario[i].bonus > 4){
                    JOptionPane.showMessageDialog(null, "Clase incorreta. As opções são 1, 2, 3 e 4.");
                }
            }while(funcionario[i].bonus < 1 || funcionario[i].bonus > 4);
            funcionario[i].salario_receber = funcionario[i].salario_bruto * 90 / 100 + valorBonus(funcionario[i].bonus, funcionario[i].salario_bruto);
        }
        for (int i = 0; i < 3; i++){
            mostrar = mostrar + funcionario[i].salario_bruto + " receberá R$" + funcionario[i].salario_receber + "\n";
        }
        JOptionPane.showMessageDialog(null, mostrar);
    }
    public static double valorBonus(int classeBonus, double bonus){
        switch (classeBonus){
            case 1: bonus = bonus * 10 / 100;
                break;
            case 2: bonus = bonus * 15 / 100;
                break;
            case 3: bonus = bonus * 20 / 100;
                break;
            default: bonus = bonus * 25 / 100;
        }
        return bonus;
    }
}
