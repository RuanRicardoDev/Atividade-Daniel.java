package Q14;

import java.util.Scanner;

public class Fazenda {

    public static void analisarMatriz(int[][] matriz) {
        int l = matriz.length;
        int c = matriz[0].length;

        int maiorSomaLinha = 0;
        int indiceLinha = 0;

        int somaTotal = 0;

        for (int i = 0; i < l; i++) {
            int somaLinha = 0;

            for (int j = 0; j < c; j++) {
                somaLinha += matriz[i][j];
                somaTotal += matriz[i][j];
            }

            if (i == 0 || somaLinha > maiorSomaLinha) {
                maiorSomaLinha = somaLinha;
                indiceLinha = i;
            }
        }

        int menorSomaColuna = 0;
        int indiceColuna = 0;

        for (int j = 0; j < c; j++) {
            int somaColuna = 0;

            for (int i = 0; i < l; i++) {
                somaColuna += matriz[i][j];
            }

            if (j == 0 || somaColuna < menorSomaColuna) {
                menorSomaColuna = somaColuna;
                indiceColuna = j;
            }
        }

        double media = (double) somaTotal / (l * c);

        int contador = 0;

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                if (matriz[i][j] > media) {
                    contador++;
                }
            }
        }

        System.out.println("Linha com maior soma: " + indiceLinha);
        System.out.println("Coluna com menor soma: " + indiceColuna);
        System.out.printf("Media geral: %.2f\n", media);
        System.out.println("Quantidade acima da media: " + contador);
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

        analisarMatriz(matriz);

        sc.close();
    }
}