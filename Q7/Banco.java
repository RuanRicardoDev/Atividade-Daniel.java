package Q7;

import java.util.Scanner;

public class Banco {
    
    public static void analisarPatrimonio(int[][] matriz) {
        int maiorSoma = 0;

        for (int i = 0; i < matriz.length; i++) {
            int somarLinha = 0;

            for (int j = 0; j < matriz[i].length; j++) {
                somarLinha += matriz[i][j];
            }
            System.out.println("Soma da linha " + i + ": " + somarLinha);

            if (i == 0 || somarLinha > maiorSoma) {
                maiorSoma = somarLinha;
            }
        }

        System.out.println("Maior soma: " + maiorSoma);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int l = s.nextInt();
        int c = s.nextInt();

        int[][] matriz = new int[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = s.nextInt();
            }
        }

        analisarPatrimonio(matriz);
    
        s.close();
        
    }
}
