import java.util.Scanner;
public class Atividade19 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu peso:");
        double peso = leitor.nextDouble();
        System.out.println("Digite sua altura:");
        double altura = leitor.nextDouble();
        double imc = CalculoIMC(peso, altura);
        System.out.println("Seu IMC é: " + imc);
        leitor.close();
    }
    public static double CalculoIMC(double peso, double altura) {
        return peso / (altura * altura);
    }
}
