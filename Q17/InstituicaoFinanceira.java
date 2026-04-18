package Q17;
import java.util.Scanner;

public class InstituicaoFinanceira {

    public static int kadane(int[] arr) {
        int maxAtual = arr[0];
        int maxGlobal = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxAtual = Math.max(arr[i], maxAtual + arr[i]);
            maxGlobal = Math.max(maxGlobal, maxAtual);
        }

        return maxGlobal;
    }

    public static void analisar(int[][] matriz) {
        int l = matriz.length;
        int c = matriz[0].length;

        int maiorLinha = Integer.MIN_VALUE;
        int indiceLinha = 0;

        for (int i = 0; i < l; i++) {
            int soma = kadane(matriz[i]);

            if (i == 0 || soma > maiorLinha) {
                maiorLinha = soma;
                indiceLinha = i;
            }
        }

        int maiorColuna = Integer.MIN_VALUE;
        int indiceColuna = 0;

        for (int j = 0; j < c; j++) {
            int[] coluna = new int[l];

            for (int i = 0; i < l; i++) {
                coluna[i] = matriz[i][j];
            }

            int soma = kadane(coluna);

            if (j == 0 || soma > maiorColuna) {
                maiorColuna = soma;
                indiceColuna = j;
            }
        }

        System.out.println("Maior soma contigua em linha: " + maiorLinha);
        System.out.println("Linha da maior soma contigua: " + indiceLinha);
        System.out.println("Maior soma contigua em coluna: " + maiorColuna);
        System.out.println("Coluna da maior soma contigua: " + indiceColuna);
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

        analisar(matriz);

        sc.close();
    }
}