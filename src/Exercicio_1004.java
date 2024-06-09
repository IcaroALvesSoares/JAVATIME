import java.util.Scanner;
public class Exercicio_1004 {
    public static void main(String[] args){
        Scanner enterScanner=new
                Scanner(System.in);
        System.out.println("Digite o primeiro valor");
        int one=enterScanner.nextInt();
        System.out.println("Digite o segundo valor");
        int two=enterScanner.nextInt();
        int PROD=one*two;
        System.out.println("PROD = " + PROD);
    }
}
