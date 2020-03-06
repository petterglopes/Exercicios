package classes;

import javax.swing.JOptionPane;
import java.io.*;

public class Metodos {

    public Estatistica[] cadastroEstatistica(Estatistica estatistica[]) throws IOException {

        String fileName = "DB.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

        for (int i = 0; i < estatistica.length; i++) {
            estatistica[i] = new Estatistica();
            estatistica[i].codCidade = Integer.parseInt(JOptionPane.showInputDialog("Informe o codigo da cidade:"));
            writer.write(Integer.toString(estatistica[i].codCidade));
            writer.newLine();
            estatistica[i].nomeCidade = JOptionPane.showInputDialog("Informe o nome da cidade:");
            writer.write(estatistica[i].nomeCidade);
            writer.newLine();
            estatistica[i].qtdAcidentes = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de acidentes:"));
            writer.write(estatistica[i].qtdAcidentes);
            writer.newLine();
            estatistica[i].tipoVeiculo = Integer.parseInt(JOptionPane.showInputDialog("Informe o codigo da cidade:"));
            writer.write(estatistica[i].tipoVeiculo);
            writer.newLine();
        }
        writer.close();
        return estatistica;
    }

    public void tipo(Estatistica estatistica[]) throws IOException {

        ler(estatistica);

        int tipo = Integer.parseInt(JOptionPane.showInputDialog("Informe o codigo do tipo de veículo:"));

        for (int i = 0; i < estatistica.length; i++) {
            if (estatistica[i].tipoVeiculo == tipo) {
                JOptionPane.showMessageDialog(null, "Cidades com veiculos do tipo " + estatistica[i].tipoVeiculo + "\n\nCódigo da cidade: " + estatistica[i].codCidade + " Cidade: " + estatistica[i].nomeCidade + "Quantidade de acidentes: " + estatistica[i].qtdAcidentes);
            }
        }
    }

    public void pQtaCidade(Estatistica estatistica[]) throws IOException {

    }

    public void pConsultaAcidentes(Estatistica estatistica[]) throws IOException {

    }

    public void ler(Estatistica estatistica[]) throws IOException {
        String fileName = "DB";
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        for (int i = 0; i < estatistica.length; i++) {
            estatistica[i] = new Estatistica();
            estatistica[i].codCidade = Integer.parseInt(reader.readLine());
            estatistica[i].nomeCidade = reader.readLine();
            estatistica[i].qtdAcidentes = Integer.parseInt(reader.readLine());
            estatistica[i].tipoVeiculo = Integer.parseInt(reader.readLine());
        }
    }
}
