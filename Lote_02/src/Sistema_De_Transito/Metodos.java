//Programador: Gabriel Rocha
//Data: 18/10/2019

package Sistema_De_Transito;

import java.io.*;
import javax.swing.JOptionPane;

public class Metodos {
    
    public Estatistica[] FCADRASTRAESTATISTICA(Estatistica[] estatistica) throws IOException {
        int i;
        String fileName = "Estatisticas.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        for(i = 0; i <= 1; i++) {
            estatistica[i] = new Estatistica();
            estatistica[i].codCid = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da cidade: "));
            writer.write(Integer.toString(estatistica[i].codCid));
            writer.newLine();
            estatistica[i].qntAci = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de acidentes da cidade: "));
            writer.write(Integer.toString(estatistica[i].qntAci));
            writer.newLine();
            estatistica[i].tipVei = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de veículos da cidade: "));
            writer.write(Integer.toString(estatistica[i].tipVei));
            writer.newLine();
            estatistica[i].nomeCid = JOptionPane.showInputDialog("Digite o nome da cidade: ");
            writer.write(estatistica[i].nomeCid);
            writer.newLine();
        }
        System.out.println("Gravação feita com SUCESSO!");
        writer.close();
        return estatistica;
    }
    
    public void FTIPO(Estatistica[] estatistica) throws IOException {
        for(int i = 0; i <= 1; i++) {
            System.out.println("\nCódigo da cidade: " + estatistica[i].codCid + "\nTipo de veículo: " + estatistica[i].tipVei + "\nNúmero de acidentes: " + estatistica[i].qntAci);
        }
    }
    
    public void PQTACIDENTES(Estatistica[] estatistica) throws IOException {
        JOptionPane.showMessageDialog(null, "Cidades com número de acidentes entre 100 e 500:");
        for(int i = 0; i <= 1; i++) {
            if(estatistica[i].qntAci > 100 && estatistica[i].qntAci < 500) {
                System.out.println("\nCódigo da cidade: " + estatistica[i].codCid + "\nNúmero de acidentes: " + estatistica[i].qntAci);
            }
        }
    }
    
    public void PCONSULTAACIDENTES(Estatistica[] estatistica) throws IOException {
        for(int i = 0; i <= 1; i++) {
            System.out.println("\nCódigo da cidade: " + estatistica[i].codCid + "\nNome da cidade: " + estatistica[i].nomeCid + "\nNúmero de acidentes: " + estatistica[i].qntAci);
        }
    }
    
    public void MAIORESMENORES(Estatistica[] estatistica) throws IOException {
        int maior = 0, menor = 0;
        double media = 0;
        for(int i = 0; i <= 1; i++) {
            media = media + estatistica[i].qntAci;
            if(i == 0) {
                maior = estatistica[i].qntAci;
                menor = maior;
            }else if(estatistica[i].qntAci > maior){
                maior = estatistica[i].qntAci;
            }else if(estatistica[i].qntAci < menor) {
                menor = estatistica[i].qntAci;
            }
        }
        media = media / 2;
        System.out.println("\nMédia de acidentes das cidades: " + media + "\nMenor quantidade de acidentes: " + menor + "\nMaior número de acidentes: " + maior);
        for(int i = 0; i <= 1; i++) {
            if(estatistica[i].qntAci > media) {
                System.out.println("\nA cidade " + estatistica[i].nomeCid + " tem quantidade de acidentes acima da média!");
            }
        }
    }
}
