import java.util.Scanner;

public class ReservaPassagens {

    public static void main(String[] args) {
        final int TAM = 12;
        int[] quantLugares = new int[TAM];
        int[] numVoo = new int[TAM];
        int opc, opcConsultar;
        Scanner sc = new Scanner(System.in);

        System.out.println("\t\tCONTROLE DE PASSAGENS \n\n");

        System.out.println("INFORMAÇÕES SOBRE OS VOOS \n");

        // Leitura da quantidade de lugares em cada avião e os números dos voos
        for (int i = 0; i < TAM; i++) {
            System.out.print("\tDigite a quantidade de lugares do avião " + (i + 1) + ": ");
            quantLugares[i] = sc.nextInt();

            System.out.print("\tDigite os números dos voos: ");
            numVoo[i] = sc.nextInt();
            System.out.println();
        }

        do {
            System.out.println("-------------------------------------------------------------");
            System.out.println("MENU DE OPÇÕES");
            System.out.println("1. Consultar");
            System.out.println("2. Efetuar reserva");
            System.out.println("3. Sair\n");

            do { // O usuário não poderá digitar valores inválidos
                System.out.print("Digite a opção desejada: ");
                opc = sc.nextInt();
                if (opc <= 0 || opc > 3) {
                    System.out.println("Opção inválida. Por favor digite uma opção válida para prosseguir.\n");
                }
            } while (opc <= 0 || opc > 3);

            System.out.println("-------------------------------------------------------------");

            switch (opc) {
                case 1:
                    System.out.println("VOCÊ DESEJA:");
                    System.out.println("1. Consultar por número de voo");
                    System.out.println("2. Consultar por origem");
                    System.out.println("3. Consultar por destino\n");
                    System.out.print("Digite a opção desejada: ");
                    opcConsultar = sc.nextInt();
                    switch (opcConsultar) {
                        case 1:
                            consultarPorNumeroVoo(sc, numVoo, quantLugares);
                            break;
                        case 2:
                            // A função de consulta por origem deve ser implementada
                            break;
                        case 3:
                            // A função de consulta por destino deve ser implementada
                            break;
                    }
                    break;

                case 2:
                    efetuarReserva(sc, numVoo, quantLugares);
                    break;

                case 3:
                    System.out.println("Programa encerrado.");
                    break;
            }
        } while (opc != 3);

        sc.close();
    }

    // Função para consultar por número de voo
    public static void consultarPorNumeroVoo(Scanner sc, int[] numVoo, int[] quantLugares) {
        System.out.print("Digite o número do voo: ");
        int numeroVoo = sc.nextInt();
        boolean vooEncontrado = false;

        for (int i = 0; i < numVoo.length; i++) {
            if (numVoo[i] == numeroVoo) {
                vooEncontrado = true;
                System.out.println("Número do voo: " + numVoo[i] + " | Lugares disponíveis: " + quantLugares[i]);
                break;
            }
        }

        if (!vooEncontrado) {
            System.out.println("Voo inexistente.");
        }
    }

    // Função para efetuar a reserva
    public static void efetuarReserva(Scanner sc, int[] numVoo, int[] quantLugares) {
        System.out.print("Digite o número do voo para realizar a reserva: ");
        int numeroVoo = sc.nextInt();
        boolean vooEncontrado = false;

        for (int i = 0; i < numVoo.length; i++) {
            if (numVoo[i] == numeroVoo) {
                vooEncontrado = true;
                if (quantLugares[i] > 0) {
                    quantLugares[i]--;
                    System.out.println("Reserva confirmada! Lugares restantes: " + quantLugares[i]);
                } else {
                    System.out.println("Voo lotado.");
                }
                break;
            }
        }

        if (!vooEncontrado) {
            System.out.println("Voo inexistente.");
        }
    }
}
