import java.util.Scanner;

public class MaiorMenorValor {

    // Método para ler 5 números e encontrar o maior e o menor valor
    public static void pegarMaiorEMenorValor() {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[5];
        int maior, menor;

        // Leitura dos números
        for (int i = 0; i < 5; i++) {
            System.out.printf("%dº número: ", i + 1);
            num[i] = scanner.nextInt();
        }

        maior = num[0];
        menor = num[0];

        // Encontrar maior e menor valor
        for (int i = 0; i < 5; i++) {
            if (num[i] > maior) {
                maior = num[i];
            }

            if (num[i] < menor) {
                menor = num[i];
            }
        }

        System.out.println("\nMaior: " + maior);
        System.out.println("Menor: " + menor);
    }

    public static void main(String[] args) {
        // Chama o método para calcular e mostrar o maior e menor valor
        pegarMaiorEMenorValor();
    }
}
