import java.util.Scanner;
public class Atividade15 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número:");
        double numero = leitor.nextInt();
        double raiz = RQ(numero);
        System.out.println("A raiz de " + numero + " é: " + raiz);
        leitor.close();
    }
    public static double RQ(double N) {
        return Math.sqrt(N);
    }
}
