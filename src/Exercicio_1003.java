import java.util.Scanner;
public class Exercicio_1003 {
    public static void main(String[] args){
        Scanner enterScanner=new
                Scanner(System.in);
        System.out.println("Digite o primeiro valor");
        int valor1=enterScanner.nextInt();
        System.out.println("Digite o segundo valor");
        int valor2=enterScanner.nextInt();
        int soma=valor1+valor2;
        System.out.println("Soma = " + soma);
    }
}
