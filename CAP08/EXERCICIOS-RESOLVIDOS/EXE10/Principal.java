import java.util.Scanner;

public class CalculoExpressao {

    // Método para calcular a expressão S
    public static double calculoExpressao(int N) {
        double S = 0;
        
        // Laço para calcular o valor de S
        for (int i = 0; i <= N; i++) {
            double fat = 1;
            
            // Cálculo do fatorial
            for (int j = 1; j <= i; j++) {
                fat *= j;
            }
            
            S += 1 / fat;
        }

        return S;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;

        System.out.print("Digite um valor para N: ");
        N = scanner.nextInt();

        System.out.printf("S: %.20f\n", calculoExpressao(N)); // Exibe o valor de S com 20 casas decimais
    }
}
