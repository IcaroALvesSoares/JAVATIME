import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args){
        Scanner enterScanner=new
                Scanner(System.in);
        System.out.println("Digite o número para ver a sua tabuada");
        int valor=enterScanner.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(valor + " X " + i + " = " + valor*i);
        }
    }
}
