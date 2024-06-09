import java.util.Scanner;
public class ParOuImpar {
    public static void main(String[] args){
        Scanner enterScanner=new
                Scanner(System.in);
        int valor=enterScanner.nextInt();
        if(valor%2==0){
            System.out.println("PAR");
        }
        else{
            System.out.println("IMPAR");
        }
    }
}
