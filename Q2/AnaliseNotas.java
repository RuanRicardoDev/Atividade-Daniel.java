package Q2;

import java.util.Scanner;

public class AnaliseNotas {

    public static void analisarNotas(double[] notas) {
        double maior = notas[0];
        double menor = notas[0];
        double soma = 0;
        int aprovados = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];

            if (notas[i] > maior) {
                maior = notas[i];
            }

            if (notas[i] < menor) {
                menor = notas[i];
            }

            if (notas[i] >= 7.0) {
                aprovados++;
            }
        }

        double media = soma / notas.length;

        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
        System.out.printf("Media da turma: %.2f\n", media);
        System.out.println("Quantidade de aprovados: " + aprovados);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] notas = new double[n];

        for (int i = 0; i < n; i++) {
            notas[i] = sc.nextDouble();
        }

        analisarNotas(notas);

        sc.close();
    }
}