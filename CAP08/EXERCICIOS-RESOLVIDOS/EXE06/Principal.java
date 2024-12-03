import java.util.Scanner;

public class TabelaMultiplicacao {

    // Método para calcular a multiplicação e exibir a tabela
    public static void mostrarMultiplicacao(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j * j) {
                    System.out.println(i * j);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite um número (1 a 9): ");
        int num = scanner.nextInt();

        if (num < 1 || num > 9) {
            System.out.println("Número inválido. Insira um número entre 1 e 9.");
        } else {
            // Exibe a tabela de multiplicação
            mostrarMultiplicacao(num);
        }

        scanner.close();
    }
}
