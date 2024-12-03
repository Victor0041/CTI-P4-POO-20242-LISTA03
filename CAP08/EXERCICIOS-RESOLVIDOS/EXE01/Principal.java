import java.util.Scanner;

public class VerificarNumero {

    // Método para verificar se o número é positivo ou negativo
    public static int verificarNum(int x) {
        if (x > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        int res = verificarNum(num);

        System.out.println(res);

        scanner.close();
    }
}
