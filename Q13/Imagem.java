package Q13;

import java.util.Scanner;

public class Imagem {
    
     public static void analisarImagem(int[][] matriz, int k) {
        int l = matriz.length;
        int c = matriz[0].length;

        int soma = 0;
        int maior = matriz[0][0];
        int contador = 0;

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {

                soma += matriz[i][j];

                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }

                if (matriz[i][j] > k) {
                    contador++;
                }
            }
        }

        double media = (double) soma / (l * c);

        System.out.printf("Media dos elementos: %.2f\n", media);
        System.out.println("Maior elemento: " + maior);
        System.out.println("Quantidade acima de " + k + ": " + contador);
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

        int k = sc.nextInt();

        analisarImagem(matriz, k);

        sc.close();
    }
}
