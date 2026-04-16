package Q4;
import java.util.Scanner;


public class BuscaCodigo {
    
    public static void buscarCodigo(int[] vetor, int x) {
        int posicao = -1;
    
    for (int i = 0; i < vetor.length; i++) {
        if (vetor[i] ==  x) {
            posicao = i;
            break;
        }
    }
    
    if (posicao != -1) {
        System.out.println("Codigo encontrado");
        System.out.println("Primeira posicao: " + posicao);
    } else {
        System.out.println("Codigo nao encontrado");
    }
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] codigos = new int[n];

        for (int i = 0; i < n; i++) {
            codigos[i] = s.nextInt();
        }

        int x = s.nextInt();

        buscarCodigo(codigos, x);

        s.close();
    }
}
