import java.util.Scanner;

public class PercentualAumento {

    // Método para calcular o percentual de aumento
    public static float calcularPercentual(float valorAntigo, float valorAtual) {
        return ((valorAtual - valorAntigo) / valorAntigo) * 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Valor antigo: ");
        float valorAntigo = scanner.nextFloat();

        System.out.print("Valor atual: ");
        float valorAtual = scanner.nextFloat();

        // Cálculo do percentual de aumento
        float percentual = calcularPercentual(valorAntigo, valorAtual);

        // Exibição do resultado
        System.out.printf("\nPercentual de aumento foi de %.2f%%.\n", percentual);

        scanner.close();
    }
}
