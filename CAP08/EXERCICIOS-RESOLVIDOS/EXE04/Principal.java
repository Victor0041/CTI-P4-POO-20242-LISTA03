import java.util.Scanner;

public class ConversaoSegundos {

    public static void converterSegundos(int seg) {
        int hr = (seg / 60) / 60; // Cálculo das horas
        int min = (seg / 60) % 60; // Cálculo dos minutos
        int segundos = seg % 60; // Cálculo dos segundos

        System.out.printf("%d : %d : %d \n", hr, min, segundos);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite os segundos: ");
        int segundos = scanner.nextInt();

        converterSegundos(segundos);
    }
}
