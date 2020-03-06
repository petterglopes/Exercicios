package Salario_Funcionarios;

class Funcionario {
    
    int Cod;
    String Nome;
    double Sal_Bruto;
    int Bonus;
    double Sal_Liq;
    
    Funcionario() {
        this(0, "", 0, 0, 0);
    }
    
    Funcionario(int Co, String No, double SalB, int Bo, double SalL) {
        Cod = Co;
        Nome = No;
        Sal_Bruto = SalB;
        Bonus = Bo;
        Sal_Liq = SalL;
    }
}
