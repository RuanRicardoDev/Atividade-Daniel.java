package Q8;
import java.util.Scanner;


public class Escola {

     public static void analisarNotas(double[][] matriz) {
        int alunosAprovados = 0;

        for (int i = 0; i < matriz.length; i++) {
            double soma = 0;

            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }

            double mediaAluno = soma / matriz[i].length;

            System.out.printf("Media do aluno %d: %.2f\n", i, mediaAluno);

            if (mediaAluno >= 7.0) {
                alunosAprovados++;
            }
        }

        for (int j = 0; j < matriz[0].length; j++) {
            double soma = 0;

            for (int i = 0; i < matriz.length; i++) {
                soma += matriz[i][j];
            }

            double mediaAvaliacao = soma / matriz.length;

            System.out.printf("Media da avaliacao %d: %.2f\n", j, mediaAvaliacao);
        }

        System.out.println("Quantidade de alunos aprovados: " + alunosAprovados);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt(); // alunos
        int c = sc.nextInt(); // avaliações

        double[][] matriz = new double[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = sc.nextDouble();
            }
        }

        analisarNotas(matriz);

        sc.close();
    }
}

