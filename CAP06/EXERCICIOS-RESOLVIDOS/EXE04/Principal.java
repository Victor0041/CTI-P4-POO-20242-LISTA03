import java.util.Scanner;

public class VetorPositivoNegativo {

    public static void main(String[] args) {
        int[] n = new int[8];
        int[] pos = new int[8];
        int[] neg = new int[8];
        int k = 0, j = 0;
        int contP = 0, contN = 0;
        Scanner sc = new Scanner(System.in);

        // Preenchendo o vetor e separando positivos e negativos
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            n[i] = sc.nextInt();

            if (n[i] > 0) {
                pos[k] = n[i];
                contP++;
                k++;
            } else if (n[i] < 0) {
                neg[j] = n[i];
                contN++;
                j++;
            }
        }

        // Imprimindo números positivos
        if (contP > 0) {
            System.out.print("\n\tTodos os números positivos digitados: ");
            for (int i = 0; i < contP; i++) {
                System.out.print(pos[i] + " ");
            }
        } else {
            System.out.println("\n\tNenhum número positivo digitado.");
        }

        // Imprimindo números negativos
        if (contN > 0) {
            System.out.print("\n\tTodos os números negativos digitados: ");
            for (int i = 0; i < contN; i++) {
                System.out.print(neg[i] + " ");
            }
        } else {
            System.out.println("\n\tNenhum número negativo digitado.");
        }

        sc.close();
    }
}
