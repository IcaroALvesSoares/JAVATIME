import java.util.Scanner;
public class Exercicio_1012 {
    public static void main(String[] args){
        Scanner enterScanner=new
                Scanner(System.in);
        System.out.println("Digite o valor A");
        double A=enterScanner.nextDouble();
        System.out.println("Digite o valor B");
        double B=enterScanner.nextDouble();
        System.out.println("digite o valor C");
        double C=enterScanner.nextDouble();
        System.out.printf("Triangulo: %.3f\n" , (A*C)/2);
        System.out.printf("Circulo: %.3f\n" , (3.14159*C)*C);
        System.out.printf("Trapezio: %.3f\n" , ((A+B)*C)/2);
        System.out.printf("Quadrado: %.3f\n" , B*B);
        System.out.printf("Retangulo: %.3f" , A*B);
    }
}
