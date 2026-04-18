package Q19;
import java.util.Scanner;

public class MatrizConsistente {

    public static void analisar(int[][] matriz) {
        int n = matriz.length;

        int somaBase = 0;
        for (int j = 0; j < n; j++) {
            somaBase += matriz[0][j];
        }

        int inconsistentes = 0;

        for (int i = 0; i < n; i++) {
            int soma = 0;
            for (int j = 0; j < n; j++) {
                soma += matriz[i][j];
            }
            if (soma != somaBase) inconsistentes++;
        }

        for (int j = 0; j < n; j++) {
            int soma = 0;
            for (int i = 0; i < n; i++) {
                soma += matriz[i][j];
            }
            if (soma != somaBase) inconsistentes++;
        }

        int somaPrincipal = 0;
        for (int i = 0; i < n; i++) {
            somaPrincipal += matriz[i][i];
        }
        if (somaPrincipal != somaBase) inconsistentes++;

        int somaSecundaria = 0;
        for (int i = 0; i < n; i++) {
            somaSecundaria += matriz[i][n - 1 - i];
        }
        if (somaSecundaria != somaBase) inconsistentes++;

        if (inconsistentes == 0) {
            System.out.println("Matriz consistente: sim");
            System.out.println("Valor comum das somas: " + somaBase);
        } else {
            System.out.println("Matriz consistente: nao");
            System.out.println("Quantidade de estruturas com soma diferente da primeira linha: " + inconsistentes);
        }
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