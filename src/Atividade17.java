import java.util.Scanner;
public class Atividade17 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = leitor.nextInt();

        imprimirAteN(numero);

        leitor.close();
    }

    public static void imprimirAteN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
