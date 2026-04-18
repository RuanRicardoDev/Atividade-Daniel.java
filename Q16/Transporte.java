package Q16;
import java.util.Scanner;

public class Transporte {

    public static void analisar(int[][] matriz) {
        int n = matriz.length;

        int[] saidas = new int[n];
        int[] chegadas = new int[n];

        boolean simetrica = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                saidas[i] += matriz[i][j];
                chegadas[j] += matriz[i][j];

                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Saidas do terminal " + i + ": " + saidas[i]);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Chegadas no terminal " + i + ": " + chegadas[i]);
        }

        int maiorDif = 0;
        int indice = 0;

        for (int i = 0; i < n; i++) {
            int diferenca = Math.abs(saidas[i] - chegadas[i]);

            if (i == 0 || diferenca > maiorDif) {
                maiorDif = diferenca;
                indice = i;
            }
        }

        System.out.println("Terminal com maior diferenca absoluta entre saidas e chegadas: " + indice);
        System.out.println("Matriz simetrica: " + (simetrica ? "sim" : "nao"));
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

        analisar(matriz);

        sc.close();
    }
}