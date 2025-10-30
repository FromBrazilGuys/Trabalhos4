import java.util.Scanner;
public class Atividade9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número de 1 á 10");
        int numero = leitor.nextInt();
        tabuada(numero);
    }
    public static void tabuada (int a) {
        int multiplicador = 0;
        for (int i = 0; i <= 10; i++) {
            System.out.println(a + " x " + i + " = " + (a * i));
        }
    }
}
