import java.util.Scanner;

public class UniaoVetores {

    public static void main(String[] args) {
        int[] x = new int[5];
        int[] y = new int[5];
        int[] u = new int[10];
        int aux;

        Scanner sc = new Scanner(System.in);

        // Preenchendo e ordenando o primeiro vetor (vetor X)
        System.out.println("Vetor X: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("\tDigite o " + (i + 1) + "º número: ");
            x[i] = sc.nextInt();
            u[i] = x[i];  // Copiar valores para o vetor u
        }

        // Ordenação do vetor X
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (x[i] > x[j]) {
                    aux = x[i];
                    x[i] = x[j];
                    x[j] = aux;
                }
            }
        }

        // Exibição do vetor X em ordem crescente
        System.out.print("\nVetor X em ordem crescente: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(x[i] + " | ");
        }

        // Preenchendo e ordenando o segundo vetor (vetor Y)
        System.out.println("\n\nVetor Y: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("\tDigite o " + (i + 1) + "º número: ");
            y[i] = sc.nextInt();
            u[i + 5] = y[i];  // Copiar valores para o vetor u
        }

        // Ordenação do vetor Y
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (y[i] > y[j]) {
                    aux = y[i];
                    y[i] = y[j];
                    y[j] = aux;
                }
            }
        }

        // Exibição do vetor Y em ordem crescente
        System.out.print("\nVetor Y em ordem crescente: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(y[i] + " | ");
        }

        // Uniões dos vetores X e Y
        System.out.println("\n\nUnião dos vetores X e Y: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(u[i] + " | ");
        }

        // Ordenação da união dos vetores X e Y
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (u[i] > u[j]) {
                    aux = u[i];
                    u[i] = u[j];
                    u[j] = aux;
                }
            }
        }

        // Exibição da união dos vetores em ordem crescente
        System.out.print("\nUnião dos vetores em ordem crescente: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(u[i] + " | ");
        }

        sc.close();
    }
}
