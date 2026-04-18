package Q15;
import java.util.Scanner;

public class Logistica {

    public static void analisarMatriz(int[][] matriz) {
        int n = matriz.length;

        boolean diagonalZero = true;

        int maior = Integer.MIN_VALUE;
        int linhaMaior = 0;
        int colunaMaior = 0;

        int menorSomaLinha = 0;
        int indiceLinha = 0;

        for (int i = 0; i < n; i++) {
            int somaLinha = 0;

            for (int j = 0; j < n; j++) {
                somaLinha += matriz[i][j];

                if (i == j && matriz[i][j] != 0) {
                    diagonalZero = false;
                }

                if (i != j && matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }

            if (i == 0 || somaLinha < menorSomaLinha) {
                menorSomaLinha = somaLinha;
                indiceLinha = i;
            }
        }

        System.out.println("Diagonal principal com zeros: " + (diagonalZero ? "sim" : "nao"));
        System.out.println("Maior valor fora da diagonal: " + maior + " (" + linhaMaior + "," + colunaMaior + ")");
        System.out.println("Linha com menor soma: " + indiceLinha);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        analisarMatriz(matriz);

        sc.close();
    }
}