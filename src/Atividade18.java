import java.util.Scanner;
public class Atividade18 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = leitor.nextInt();

        int resultado = somarAteN(numero);
        System.out.println("A soma de 1 até " + numero + " é: " + resultado);

        leitor.close();
    }

    public static int somarAteN(int n) {
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
        }
        return soma;
    }
}
