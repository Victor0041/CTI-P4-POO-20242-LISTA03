import java.util.Scanner;

public class LojaDeArtesanato {

    public static void main(String[] args) {
        int TAM = 2; // Tamanho dos vetores
        int maisVendido, posMaisVendido;
        int[] quantObj = new int[TAM];
        float[] vlrObj = new float[TAM];
        float totalObj, totalVenda = 0, comissao, vlrMaisVendido = 0;

        Scanner sc = new Scanner(System.in);

        // Leitura do valor e da quantidade de cada objeto da loja
        System.out.println("VALORES E QUANTIDADES DOS PRODUTOS\n");
        for (int i = 0; i < TAM; i++) {
            System.out.print("Digite o valor do " + (i + 1) + "º produto: ");
            vlrObj[i] = sc.nextFloat();
            System.out.print("Digite a quantidade do " + (i + 1) + "º produto: ");
            quantObj[i] = sc.nextInt();
            System.out.println();
        }

        maisVendido = quantObj[0];

        System.out.println("RELATÓRIO");
        for (int i = 0; i < TAM; i++) {
            totalObj = quantObj[i] * vlrObj[i];
            System.out.println("Produto " + (i + 1));
            System.out.println("\tQuantidade vendida: " + quantObj[i]);
            System.out.printf("\tValor unitário: R$ %.2f \n", vlrObj[i]);
            System.out.printf("\tTotal: R$ %.2f \n\n", totalObj);
            totalVenda += totalObj; // Total de vendas

            // Descobrir o objeto mais vendido da loja
            if (quantObj[i] > maisVendido) {
                vlrMaisVendido = vlrObj[i];
                posMaisVendido = i;
                maisVendido = quantObj[i];
            }
        }

        comissao = totalVenda * 0.05;
        System.out.printf("O vendedor receberá R$ %.2f de comissão; \n", comissao);
        System.out.printf("O valor do objeto mais vendido é R$ %.2f e está na posição %d.\n", vlrMaisVendido, posMaisVendido + 1);

        sc.close();
    }
}
