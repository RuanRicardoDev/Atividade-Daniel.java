package Q1;

import java.util.Scanner;

public class ConsumoEnergia {

    public static void analisarConsumo(int[] vetor) {
        int soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        double media = (double) soma / vetor.length;

        int acimaMedia = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > media) {
                acimaMedia++;
            }
        }

        System.out.println("Consumo total: " + soma);
        System.out.printf("Consumo medio: %.2f\n", media);
        System.out.println("Dias acima da media: " + acimaMedia);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] consumo = new int[n];

        for (int i = 0; i < n; i++) {
            consumo[i] = sc.nextInt();
        }

        analisarConsumo(consumo);

        sc.close();
    }
}