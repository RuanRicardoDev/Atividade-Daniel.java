package Q5;
import java.util.Scanner;

public class ProducaoFabrica {
    
    public static void analisarProducao(int[] producao) {
        int maior = producao[0];
        int menor = producao[0];
        int maiorCrescimento = 0;

        for (int i = 0; i < producao.length; i++) {

            if (producao[i] < menor) {
                maior = producao[i];
        }

        if (producao[i] < menor) {
            menor = producao[i];
        }

        if (i > 0) {
            int diferenca = producao[i] - producao[i - 1];

            if (diferenca > maiorCrescimento) {
                maiorCrescimento = diferenca;
            }
        }
        }

        System.out.println("Maior producao: " + maior);
        System.out.println("Menor producao: " + menor);
        System.out.println("Maior crescimento consecutivo: " + maiorCrescimento);
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] producao = new int[n];

        for (int i = 0; i < n; i++) {
            producao[i] = sc.nextInt();
        }

        analisarProducao(producao);

        sc.close();
    }
}
