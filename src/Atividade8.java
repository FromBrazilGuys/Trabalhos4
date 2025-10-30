public class Atividade8 {
    public static void main(String[] args) {
        MDN(90, 80);

    }
    public static void MDN(int a, int b) {
        //&& retorna quando ambos resultados são iguais
        if (a > b && b < a){
            System.out.println("O numero " + a +" é maior");
        }else {
            System.out.println("O numero" + a + "é menor");
        }
    }
}
