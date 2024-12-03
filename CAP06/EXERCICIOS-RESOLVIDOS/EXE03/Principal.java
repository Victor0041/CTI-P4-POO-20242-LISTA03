import java.util.Scanner;

public class IntercalaVetor {

    public static void main(String[] args) {
        int[] v1 = new int[10];
        int[] v2 = new int[10];
        int[] v3 = new int[20];
        Scanner sc = new Scanner(System.in);

        // Preenchendo o primeiro vetor
        System.out.println("Preenchendo o primeiro vetor");
        for (int i = 0; i < 10; i++) {
            System.out.print("\tDigite um valor para a posição " + i + ": ");
            v1[i] = sc.nextInt();
            v3[i] = v1[i];
        }

        // Preenchendo o segundo vetor
        System.out.println("Preenchendo o segundo vetor");
        for (int i = 0; i < 10; i++) {
            System.out.print("\tDigite um valor para a posição " + i + ": ");
            v2[i] = sc.nextInt();
            v3[i + 10] = v2[i];
        }

        // Exibindo a intercalação dos vetores
        System.out.println("\nIntercalação dos Vetores 1 e 2:");
        for (int i = 0; i < 20; i++) {
            System.out.print(v3[i] + " | ");
        }

        sc.close();
    }
}
