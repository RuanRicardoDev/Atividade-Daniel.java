package Q20;
import java.util.Scanner;

public class MonitoramentoClimatico {

    public static void analisar(int[][] matriz, int k) {
        int l = matriz.length;
        int c = matriz[0].length;

        int melhorTamanho = 0;
        int melhorLinha = 0;
        int melhorInicio = 0;
        int melhorFim = 0;

        for (int i = 0; i < l; i++) {
            int tamanhoAtual = 0;
            int inicioAtual = 0;

            for (int j = 0; j < c; j++) {
                if (matriz[i][j] > k) {
                    if (tamanhoAtual == 0) {
                        inicioAtual = j;
                    }
                    tamanhoAtual++;

                    if (tamanhoAtual > melhorTamanho) {
                        melhorTamanho = tamanhoAtual;
                        melhorLinha = i;
                        melhorInicio = inicioAtual;
                        melhorFim = j;
                    }
                } else {
                    tamanhoAtual = 0;
                }
            }
        }

        System.out.println("Maior sequencia acima de " + k + ": " + melhorTamanho);
        System.out.println("Linha da sequencia: " + melhorLinha);
        System.out.println("Indice inicial: " + melhorInicio);
        System.out.println("Indice final: " + melhorFim);
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

        analisar(matriz, k);

        sc.close();
    }
}