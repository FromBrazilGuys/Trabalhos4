import java.util.Scanner;
public class Atividade12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius:");
        double celsius = leitor.nextDouble();
        double fahrenheit = Temp(celsius);
        System.out.println("A temperatura é de " + fahrenheit + "ºF");
        leitor.close();
    }
    public static double Temp(double C) {
    return (C * 9/5) + 32;
    }
}