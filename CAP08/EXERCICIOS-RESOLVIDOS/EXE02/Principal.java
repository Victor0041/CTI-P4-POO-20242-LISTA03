import java.util.Scanner;

public class SomaEntreNumeros {

    // Método para calcular a soma dos números inteiros entre dois valores
    public static int soma(int a, int b) {
        int soma = 0;

        for (int i = a + 1; i < b; i++) {
            soma += i;
        }

        return soma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número 1: ");
        int x = scanner.nextInt();

        System.out.print("Número 2: ");
        int y = scanner.nextInt();

        int resultado = soma(x, y);

        System.out.printf("A soma dos números entre %d e %d é %d.%n", x, y, resultado);

        scanner.close();
    }
}
