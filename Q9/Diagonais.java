package Q9;
import java.util.Scanner;

public class Diagonais {

      public static void analisarMatriz(int[][] matriz) {
        int n = matriz.length;

        int somaPrincipal = 0;
        int somaSecundaria = 0;
        int somaTotal = 0;

        for (int i = 0; i < n; i++) {
            somaPrincipal += matriz[i][i];
            somaSecundaria += matriz[i][n - 1 - i];
        }

        somaTotal = somaPrincipal + somaSecundaria;

        if (n % 2 == 1) {
            int meio = matriz[n / 2][n / 2];
            somaTotal -= meio;
        }

        System.out.println("Soma da diagonal principal: " + somaPrincipal);
        System.out.println("Soma da diagonal secundaria: " + somaSecundaria);
        System.out.println("Soma total das diagonais sem repetir o centro: " + somaTotal);
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
