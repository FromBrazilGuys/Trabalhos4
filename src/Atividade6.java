import java.util.Scanner;
public class Atividade6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu nome:");

        String nome = leitor.nextLine();
    }
    public static void exibirNome (String nome) {
        System.out.println("Olá: " + nome);
    }
}
