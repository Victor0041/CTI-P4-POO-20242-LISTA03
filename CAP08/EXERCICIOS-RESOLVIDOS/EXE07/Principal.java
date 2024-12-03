import java.util.Scanner;

public class CalculoMedia {

    // Método para calcular as médias com base na opção escolhida
    public static float calcularMedia(float nota1, float nota2, float nota3, char opcao) {
        float media = 0;

        switch (Character.toLowerCase(opcao)) {
            case 'a':
                // Média aritmética
                media = (nota1 + nota2 + nota3) / 3;
                break;

            case 'p':
                // Média ponderada (pesos 5, 3, 2)
                media = ((nota1 * 5) + (nota2 * 3) + (nota3 * 2)) / 10;
                break;

            default:
                System.out.println("Opção inválida!");
                break;
        }

        return media;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada das notas do aluno
        System.out.print("Digite a primeira nota: ");
        float n1 = scanner.nextFloat();

        System.out.print("Digite a segunda nota: ");
        float n2 = scanner.nextFloat();

        System.out.print("Digite a terceira nota: ");
        float n3 = scanner.nextFloat();

        // Entrada da opção para o tipo de média
        System.out.print("Digite a opção desejada (A para média aritmética, P para média ponderada): ");
        char opc = scanner.next().charAt(0);

        // Cálculo e exibição da média
        float media = calcularMedia(n1, n2, n3, opc);

        if (Character.toLowerCase(opc) == 'a' || Character.toLowerCase(opc) == 'p') {
            System.out.printf("Média calculada: %.2f%n", media);
        }

        scanner.close();
    }
}
