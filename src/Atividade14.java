import java.util.Scanner;
public class Atividade14 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número:");
        int N = leitor.nextInt();
        if (NPrimo(N)) {
            System.out.println(N + " é primo");
        } else {
            System.out.println(N + " não é primo");
        }
        leitor.close();
    }
    public static boolean NPrimo (int N) {
        if (N <= 1) {
            return false;
        }
        for (int i = 2; i <= N / 2; i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }
}
