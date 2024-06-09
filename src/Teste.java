import java.util.Scanner;
public class Teste {
    public static int soma(int valor1, int valor2) {
        int plus=(valor1 + valor2);
        return plus;
    }
    public static void main(String[] args) {
        Scanner enterScanner=new
                Scanner(System.in);
        int valores1, valores2;
        System.out.println("Digite o primeiro valor ");
        valores1=enterScanner.nextInt();
        System.out.println("Digite o segundo valor ");
        valores2=enterScanner.nextInt();
        int resposta1=valores1;
        int resposta2=valores2;
        int respostasdasoma=soma(resposta1, resposta2);
        System.out.println("A soma dos valores "+resposta1+" e "+resposta2+" e igual a "+respostasdasoma);
    }
}
