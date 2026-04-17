package Q6;

import java.util.Scanner;
import java.util.Arrays;

public class Corrida {

    public static void analisarTempos(double[] tempos) {
        double menor = tempos[0];
        double maior = tempos[0];

        for (int i = 0; i < tempos.length; i++) {
            if (tempos[i] < menor) {
            menor = tempos[i];    
            }
        }

        Arrays.sort(tempos);

        System.out.println("Melhor tempo: " + menor);
        System.out.println("Pior tempo: " + maior);
        System.out.println("Tres melhores tempos:");
   
        for (int i = 0; i < 3; i++) {
            System.out.print(tempos[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        double[] tempos = new double[n];
    
            for (int i = 0; i < n; i++) {
                tempos[i] = s.nextDouble();
            }

            analisarTempos(tempos);

            s.close();

    }

}