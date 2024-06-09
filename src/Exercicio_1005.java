import java.util.Scanner;
public class Exercicio_1005 {
    public static void main(String[] args){
        Scanner enterScanner=new
                Scanner(System.in);
        System.out.println("Digite a primeira nota");
        double one=enterScanner.nextDouble();
        System.out.println("Digite a segunda nota");
        double two=enterScanner.nextDouble();
        double media=(one+two)/2;
        System.out.printf("Media: %.5f" , media);
    }
}
