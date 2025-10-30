import java.util.Scanner;
public class Atividade11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        int idade = leitor.nextInt();
        MDI(idade);
    }
    public static void MDI(int a) {
        if (a > 18){
            System.out.println("Acesso liberado, você é maior de idade");
        }else {
            System.out.println("Acesso negado, você é menor de idade");
        }
    }
}
