import java.util.Scanner;
public class Atividade10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número para calcular a fatorial");
        int numero = leitor.nextInt();
        double resultado = fatorial(numero);
        System.out.println("O fatorial de " + numero + " é :" + resultado);

    }
    public static double fatorial (int N) {
        double fatorial = 1;

        for (int i = 1; i <= N; i++){
            fatorial *= i;
        }
        return fatorial;
    }
}
