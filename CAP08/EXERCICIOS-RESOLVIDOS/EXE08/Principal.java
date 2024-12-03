import java.util.Scanner;

public class DuracaoJogo {

    // Método para calcular a duração do jogo em minutos
    public static int duracaoPartida(int horaI, int minI, int horaT, int minT) {
        int inicioEmMinutos = horaI * 60 + minI;
        int terminoEmMinutos = horaT * 60 + minT;

        // Caso o jogo termine no dia seguinte
        if (terminoEmMinutos < inicioEmMinutos) {
            terminoEmMinutos += 24 * 60; // Adiciona 24 horas em minutos
        }

        return terminoEmMinutos - inicioEmMinutos;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada da hora e minuto de início
        System.out.println("Início do jogo:");
        System.out.print("\tHora: ");
        int horaInicio = scanner.nextInt();
        System.out.print("\tMinutos: ");
        int minutoInicio = scanner.nextInt();

        // Entrada da hora e minuto de término
        System.out.println("Término do jogo:");
        System.out.print("\tHora: ");
        int horaTermino = scanner.nextInt();
        System.out.print("\tMinutos: ");
        int minutoTermino = scanner.nextInt();

        // Cálculo e exibição da duração
        int duracao = duracaoPartida(horaInicio, minutoInicio, horaTermino, minutoTermino);
        System.out.printf("A partida teve duração de %d minutos.%n", duracao);

        scanner.close();
    }
}
