package Q18;
import java.util.Scanner;

public class Laboratorio {

    public static void analisar(int[][] matriz) {
        int l = matriz.length;
        int c = matriz[0].length;

        int quantidade = 0;
        int maiorValor = Integer.MIN_VALUE;
        int posI = -1;
        int posJ = -1;

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {

                int atual = matriz[i][j];
                boolean pico = true;

                if (i > 0 && atual <= matriz[i - 1][j]) pico = false;
                if (i < l - 1 && atual <= matriz[i + 1][j]) pico = false;
                if (j > 0 && atual <= matriz[i][j - 1]) pico = false;
                if (j < c - 1 && atual <= matriz[i][j + 1]) pico = false;

                if (pico) {
                    quantidade++;

                    if (atual > maiorValor) {
                        maiorValor = atual;
                        posI = i;
                        posJ = j;
                    }
                }
            }
        }

        System.out.println("Quantidade de pontos de pico: " + quantidade);

        if (quantidade > 0) {
            System.out.println("Posicao do maior ponto de pico: " + posI + " " + posJ);
            System.out.println("Valor do maior ponto de pico: " + maiorValor);
        }
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