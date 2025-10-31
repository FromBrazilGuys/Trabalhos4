import java.util.Scanner;
public class Atividade16 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a base:");
        double base = leitor.nextDouble();

        System.out.println("Digite o expoente:");
        double expoente = leitor.nextDouble();

        double resultado = potencia(base, expoente);
        System.out.println(base + " elevado a " + expoente + " é: " + resultado);

        leitor.close();
    }

    public static double potencia(double b, double e) {
        return Math.pow(b, e);
    }
}
