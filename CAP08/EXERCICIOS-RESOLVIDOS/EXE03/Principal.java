import java.util.Scanner;

public class SomaDivisiveisPorA {

    // Método para somar números entre b e c divisíveis por a
    public static int somaEntreAeB(int a, int b, int c) {
        int soma = 0;

        for (int i = b + 1; i < c; i++) {
            if (i % a == 0) {
                soma += i;
            }
        }

        return soma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = scanner.nextInt();

        System.out.print("Digite o valor de C: ");
        int c = scanner.nextInt();

        int resultado = somaEntreAeB(a, b, c);

        System.out.printf("Soma dos números entre %d e %d que são divisíveis por %d é de %d.%n", b, c, a, resultado);

        scanner.close();
    }
}
