package Q12;

import java.util.Scanner;

public class ReorganizarMatriz {

     public static void reorganizar(int[][] matriz, int r, int s) {
        int l = matriz.length;
        int c = matriz[0].length;

        if (l * c != r * s) {
            System.out.println("Reorganizacao impossivel");
            return;
        }

        System.out.println("Matriz reorganizada:");

        int index = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < s; j++) {

                int linhaOriginal = index / c;
                int colunaOriginal = index % c;

                System.out.print(matriz[linhaOriginal][colunaOriginal] + " ");

                index++;
            }
            System.out.println();
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

        int r = sc.nextInt();
        int s = sc.nextInt();

        reorganizar(matriz, r, s);

        sc.close();
    }
}
