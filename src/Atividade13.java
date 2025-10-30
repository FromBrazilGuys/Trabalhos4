import java.util.Scanner;
public class Atividade13 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número:");
        int N = leitor.nextInt();
        int qtPares = ContarPar(N);
        System.out.println("Existem " + qtPares + " numeros pares de 1 até " + N);
    }
    public static int ContarPar (int N){
        int qtd = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                qtd++;
            }
        }
        return qtd;
    }
}
