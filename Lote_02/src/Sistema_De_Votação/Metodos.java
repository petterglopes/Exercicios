//Programador: Gabriel Rocha
//Data: 26/20/2019

package Sistema_De_Votação;

import java.io.*;
import java.util.Random;

public class Metodos {
    
    public Votacao[] FCADASTRAVOTAÇÃO(Votacao[] vot) throws IOException {
        Random R = new Random();
        for(int i = 0; i <= 99; i++) {
            vot[i] = new Votacao();
            vot[i].numeroSecao = R.nextInt(11);
            vot[i].numeroCandidato = R.nextInt(301);
        }
        return vot;
    }
    
    public Votacao[] FCLASSIFICASEÇÃO(Votacao[] vot) throws IOException {
        Votacao aux;
        for(int i = 0; i <= 98; i++) {
            for(int j = i + 1; j <= 99; j++) {
                if(vot[i].numeroSecao > vot[j].numeroSecao) {
                    aux = vot[i];
                    vot[i] = vot[j];
                    vot[j] = aux;
                }
            }
        }
        System.out.println("Dados classificados com SUCESSO!");
        return vot;
    }
    
    public Votacao[] FGRAVAVOTAÇÃO(Votacao[] vot) throws IOException {
        String fileName = "Votação2016.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        for(int i = 0; i <= 99; i++) {
            writer.write("Número da seção: " + Integer.toString(vot[i].numeroSecao));
            writer.newLine();
            writer.write("Número do candidato: " + Integer.toString(vot[i].numeroCandidato));
            writer.newLine();
            writer.newLine();
        }
        writer.close();
        System.out.println("Arquivo gerado com SUCESSO!");
        return vot;
    }
    
    public void LERGRAVAÇÃO() throws IOException {
        String fileName = "Votação2016.txt";
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        System.out.println("Leitura do arquivo TXT:\n");
        for(int i = 0; i <= 299; i++) {
            System.out.println(reader.readLine());
        }
        reader.close();
    }
    
    public void QuantEleitores(Votacao[] vot) throws IOException {
        int i = -1, j = 0, eleit = 0;
        System.out.println("\nNÚMERO DA SEÇÃO    TOTAL DE ELEITORES");
        while(i < 99) {
            i++;
            eleit++;
            if(i < 99 && vot[i].numeroSecao != vot[i + 1].numeroSecao) {
                System.out.print("    " + vot[i].numeroSecao + "                     " + eleit);
                System.out.println();
                eleit = 0;
            }else if(i == 99 && vot[i].numeroSecao != vot[i - 1].numeroSecao) {
                eleit--;
                System.out.print("    " + vot[i - 1].numeroSecao + "                     " + eleit);
                System.out.println();
                eleit = 1;
                System.out.print("    " + vot[i].numeroSecao + "                     " + eleit);
                System.out.println();
            }else if(i == 99 && vot[i].numeroSecao == vot[i - 1].numeroSecao) {
                System.out.print("    " + vot[i].numeroSecao + "                     " + eleit);
                System.out.println();
            }
        }
    }
    
    public void MaiorMenor(Votacao[] vot) throws IOException {
        int[] secoes = new int[11];
        int maior = 0, menor = 0, secMaior = 0, secMenor = 0;
        for(int i = 0; i <= 99; i++) {
            secoes[vot[i].numeroSecao]++;
        }
        for(int k = 0; k <= 9; k++) {
            if(k == 0) {
                maior = secoes[k];
                menor = maior;
                secMaior = k;
                secMenor = secMaior;
            }else if(secoes[k] > maior) {
                maior = secoes[k];
                secMaior = k;
            }else if(secoes[k] < menor) {
                menor = secoes[k];
                secMenor = k;
            }
        }
        System.out.println("\nSeção com MAIOR número de eleitores: seção " + secMaior);
        System.out.println("Seção com MENOR número de eleitores: seção " + secMenor);
    }
    
    public void VotosCand(Votacao[] vot) throws IOException {
        int n = 0;
        System.out.println("\nCANDIDATO      NÚMERO DE VOTOS");
        for(int cand = 0; cand <= 300; cand++) {
            for(int i = 0; i <= 99; i++) {
                if(cand == vot[i].numeroCandidato) {
                    n++;
                }
            }
            if(n != 0) {
                System.out.print("   " + cand + "                   " + n);
                System.out.println();
                n = 0;
            }
        }
    }
    
    public void MaisVotados(Votacao[] vot) throws IOException {
        int i, j, aux, aux1;
        int[][] candidatos = new int[2][301];
        for(int cand = 0; cand <= 300; cand++) {
            candidatos[0][cand] = cand;
        }
        for(i = 0; i <= 99; i++) {
            candidatos[1][vot[i].numeroCandidato]++; 
        }
        for(j = 0; j <= 299; j++) {
            for(int k = j + 1; k <= 300; k++) {
                if(candidatos[1][j] < candidatos[1][k]) {
                    aux = candidatos[1][j];
                    candidatos[1][j] = candidatos[1][k];
                    candidatos[1][k] = aux;
                    aux1 = candidatos[0][j];
                    candidatos[0][j] = candidatos[0][k];
                    candidatos[0][k] = aux1;
                }
            }
        }
        System.out.println("\nPOSIÇÃO NA VOTAÇÃO    CANDIDATO       VOTOS\n");
        for(i = 0; i <= 9; i++) {
            System.out.print("       " + (i + 1) + "                  " + candidatos[0][i] + "            " + candidatos[1][i]);
            System.out.println();
        }
    }
}
