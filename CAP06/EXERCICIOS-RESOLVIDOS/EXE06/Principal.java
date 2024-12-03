import java.util.Scanner;

public class OrdenacaoDecrescente {

    public static void main(String[] args) {
        int t = 10;
        int[] n = new int[t];
        int aux;

        Scanner sc = new Scanner(System.in);

        // Preenchendo o vetor com 10 números inteiros
        for (int i = 0; i < t; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            n[i] = sc.nextInt();
        }

        // Exibindo a ordem atual dos números
        System.out.print("\nOrdem atual dos números: ");
        for (int i = 0; i < t; i++) {
            System.out.print(n[i] + " | ");
        }

        // Ordenação em ordem decrescente usando o método bubble sort
        for (int i = 0; i < t; i++) {
            for (int j = i + 1; j < t; j++) {
                if (n[j] > n[i]) {
                    aux = n[i];
                    n[i] = n[j];
                    n[j] = aux;
                }
            }
        }

        // Exibindo os números ordenados em ordem decrescente
        System.out.print("\nNúmeros em ordem decrescente: ");
        for (int j = 0; j < t; j++) {
            System.out.print(n[j] + " | ");
        }

        sc.close();
    }
}
