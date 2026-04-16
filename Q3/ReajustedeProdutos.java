package Q3;
import java.util.Scanner;

public class ReajustedeProdutos {
 
    public static void reajustarPrecos(double[] precos, int percentual) {
        double totalAntes = 0;
        double totalDepois = 0;
        
        System.out.println("Novos precos:");

        for (int i = 0; i < precos.length; i++) {
            totalAntes += precos[i];

            double novoPreco = precos[i] * (1 + percentual / 100.0);

            totalDepois += novoPreco;

            System.out.printf("%.2f ", novoPreco);
        }

        System.out.println();

         System.out.printf("Total antes do reajuste: %.2f\n", totalAntes);
        System.out.printf("Total depois do reajuste: %.2f\n", totalDepois);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] precos = new double[n];

        for (int i = 0; i < n; i++) {
            precos[i] = sc.nextDouble();
        }

        int p = sc.nextInt();

        reajustarPrecos(precos, p);

        sc.close();
    }

}
