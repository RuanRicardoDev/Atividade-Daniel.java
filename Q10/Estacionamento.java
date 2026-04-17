package Q10;
import java.util.Scanner;


public class Estacionamento {
    
     public static void analisarEstacionamento(int[][] matriz) {
        int l = matriz.length;
        int c = matriz[0].length;

        int maiorSomaLinha = 0;
        int indiceLinha = 0;

        for (int i = 0; i < l; i++) {
            int somaLinha = 0;

            for (int j = 0; j < c; j++) {
                somaLinha += matriz[i][j];
            }

            System.out.println("Soma da linha " + i + ": " + somaLinha);

            if (i == 0 || somaLinha > maiorSomaLinha) {
                maiorSomaLinha = somaLinha;
                indiceLinha = i;
            }
        }

        int maiorSomaColuna = 0;
        int indiceColuna = 0;

        for (int j = 0; j < c; j++) {
            int somaColuna = 0;

            for (int i = 0; i < l; i++) {
                somaColuna += matriz[i][j];
            }

            System.out.println("Soma da coluna " + j + ": " + somaColuna);

            if (j == 0 || somaColuna > maiorSomaColuna) {
                maiorSomaColuna = somaColuna;
                indiceColuna = j;
            }
        }

        System.out.println("Linha com maior soma: " + indiceLinha);
        System.out.println("Coluna com maior soma: " + indiceColuna);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int c = sc.nextInt();

        int[][] matriz = new int[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        analisarEstacionamento(matriz);

        sc.close();
    }
}