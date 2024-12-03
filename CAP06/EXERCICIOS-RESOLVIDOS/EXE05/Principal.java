import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Vetores {

    public static void main(String[] args) {
        int T = 3; // Tamanho dos vetores
        int[] vet1 = new int[T];
        int[] vet2 = new int[T];
        Set<Integer> uniao = new HashSet<>();
        Set<Integer> diferenca = new HashSet<>();
        int[] soma = new int[T];
        int[] produto = new int[T];
        Set<Integer> intersecao = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        // Leitura do primeiro vetor
        System.out.println("Vetor 1");
        for (int i = 0; i < T; i++) {
            System.out.print("\tV[" + i + "] = ");
            vet1[i] = sc.nextInt();
        }

        // Leitura do segundo vetor
        System.out.println("Vetor 2");
        for (int i = 0; i < T; i++) {
            System.out.print("\tV2[" + i + "] = ");
            vet2[i] = sc.nextInt();
        }

        // União de X e Y sem repetições
        for (int i = 0; i < T; i++) {
            uniao.add(vet1[i]);
            uniao.add(vet2[i]);
        }

        System.out.print("União X & Y (Sem repetições): ");
        for (Integer num : uniao) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Diferença entre X e Y (Elementos de X que não estão em Y)
        for (int i = 0; i < T; i++) {
            boolean encontrado = false;
            for (int j = 0; j < T; j++) {
                if (vet1[i] == vet2[j]) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                diferenca.add(vet1[i]);
            }
        }

        System.out.print("Diferença X & Y (Sem repetições): ");
        for (Integer num : diferenca) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Soma entre X e Y (soma de elementos de mesma posição)
        System.out.print("Soma X & Y: ");
        for (int i = 0; i < T; i++) {
            soma[i] = vet1[i] + vet2[i];
            System.out.print(soma[i] + " ");
        }
        System.out.println();

        // Produto entre X e Y (multiplicação de elementos de mesma posição)
        System.out.print("Produto X & Y: ");
        for (int i = 0; i < T; i++) {
            produto[i] = vet1[i] * vet2[i];
            System.out.print(produto[i] + " ");
        }
        System.out.println();

        // Intersecção entre X e Y (apenas elementos comuns)
        for (int i = 0; i < T; i++) {
            for (int j = 0; j < T; j++) {
                if (vet1[i] == vet2[j]) {
                    intersecao.add(vet1[i]);
                    break;
                }
            }
        }

        System.out.print("Intersecção X & Y (Sem repetições): ");
        for (Integer num : intersecao) {
            System.out.print(num + " ");
        }
        System.out.println();

        sc.close();
    }
}
