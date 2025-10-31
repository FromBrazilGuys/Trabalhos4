import java.util.Scanner;
public class Atividade20 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = leitor.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = leitor.nextInt();

        System.out.println("Digite o terceiro número:");
        int num3 = leitor.nextInt();

        int menor = menorEntreTres(num1, num2, num3);
        System.out.println("O menor número é: " + menor);

        leitor.close();
    }

    public static int menorEntreTres(int a, int b, int c) {
        int menor = a;

        if (b < menor) {
            menor = b;
        }
        if (c < menor) {
            menor = c;
        }

        return menor;
    }
}
