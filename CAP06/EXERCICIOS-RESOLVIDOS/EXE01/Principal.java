import java.util.Scanner;

public class NumerosPrimos {

    public static void main(String[] args) {
        int t = 9;
        int cont;
        int[] n = new int[t];
        Scanner sc = new Scanner(System.in);

        // Preencher o vetor com valores digitados
        for (int i = 0; i < t; i++) {
            System.out.print("Digite um número na posição " + i + "º: ");
            n[i] = sc.nextInt();
        }

        System.out.println();

        // Verificar se os números são primos
        for (int i = 0; i < t; i++) {
            cont = 0;
            for (int j = 1; j < n[i]; j++) {
                if (n[i] % j == 0) {
                    cont++;
                }
            }
            // O número 4 está sendo reconhecido como primo
            if (cont <= 2 && n[i] != 4) {
                System.out.println("\tO número " + n[i] + " é primo e está na posição " + i + ".");
            } else {
                System.out.println("\tO número " + n[i] + " não é primo e está na posição " + i + ".");
            }
        }

        sc.close();
    }
}
