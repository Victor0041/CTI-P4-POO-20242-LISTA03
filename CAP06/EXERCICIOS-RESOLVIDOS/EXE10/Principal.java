import java.util.Scanner;

public class CorrecaoProvas {

    public static void main(String[] args) {
        char[] gab = new char[8]; // Gabarito
        char[] res = new char[8]; // Respostas dos alunos
        int pontos;
        int aprovados = 0;
        float p;

        Scanner sc = new Scanner(System.in);

        // Leitura do gabarito
        System.out.println("Digite o gabarito:");
        for (int i = 0; i < 8; i++) {
            System.out.print("\tDigite a resposta da questão " + (i + 1) + ": ");
            gab[i] = sc.next().charAt(0);
        }

        // Correção das provas
        System.out.println("\n\nCORREÇÃO DAS PROVAS");
        for (int i = 0; i < 10; i++) {
            System.out.println("Aluno " + (i + 1));
            System.out.print("\tDigite seu número: ");
            int num = sc.nextInt();
            pontos = 0; // A variável pontos deve ser zerada a cada novo laço

            // Leitura das respostas dos alunos e cálculo da nota
            for (int j = 0; j < 8; j++) {
                System.out.print("\tDigite a resposta da questão " + (j + 1) + ": ");
                res[j] = sc.next().charAt(0);
                if (res[j] == gab[j]) {
                    pontos++;
                }
            }

            System.out.println("\nNota do aluno de número " + num + ": " + pontos + " pontos.");
            if (pontos >= 6) { // Cálculo da porcentagem de aprovados
                aprovados++;
            }
            System.out.println("------------------------------------------------");
        }

        p = (float) aprovados * 100 / 10;
        System.out.println("Total de alunos que tiraram mais de 6: " + aprovados);
        System.out.printf("Porcentagem de alunos aprovados: %.2f%% \n", p);

        sc.close();
    }
}
