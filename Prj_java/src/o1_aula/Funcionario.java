
package o1_aula;

public class Funcionario {
    int codigo;
    String nome;
    double salario_bruto;
    int bonus;
    double salario_receber;
    
    Funcionario(){
        this(0,"",0,0,0);
    }
    Funcionario(int codigoFuncionario, String nomeFuncionario, double salarioBrutoFuncionario, int bonusFuncionario, double salarioReceberFuncionario){
        codigo = codigoFuncionario;
        nome = nomeFuncionario;
        salario_bruto = salarioBrutoFuncionario;
        bonus = bonusFuncionario;
        salario_receber = salarioReceberFuncionario;
    }
}
