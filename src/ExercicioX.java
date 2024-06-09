public class ExercicioX {
    public static void main(String[] args){
        System.out.println("Atividade 1:");
        int numero=150;
        for(int i=1; i<=151; i++){
            System.out.println(numero);
            numero++;
        }
        System.out.println(" \nAtividade 2:");
        int soma=1;
        for(int i=1; i<=1000; i++){
            System.out.println(soma);
            soma++;
        }
        System.out.println(" \nAtividade 3:");
        for(int i=1; i<=100; i++){
            if(i%3==0){
                System.out.println(i);
            }
        }
        System.out.println(" \nAtividade 4:");
        for(int i=1; i<=40; i++){
            long fatorial=1;
            int valor=i;
            for(int j=1; j<=valor; j++){
                fatorial=fatorial*j;
            }
            System.out.println(fatorial);
        }
    }
}
