public class ExercicioX {
    public static void main(String[] args){
        System.out.println("Atividade 1:");
        for(int i=150; i<=300; i++){
            System.out.println(i);
        }
        System.out.println(" \nAtividade 2:");
        int soma=0;
        for(int i=1; i<=1000; i++){
            soma+=i;
        }
        System.out.println(soma);
        System.out.println(" \nAtividade 3:");
        for(int i=1; i<=100; i++){
            if(i%3==0){
                System.out.println(i);
            }
        }
        System.out.println(" \nAtividade 4:");
        for(int i=1; i<=40; i++){
            long fatorial=1;
            for(int j=1; j<=i; j++){
                fatorial=fatorial*j;
            }
            System.out.println(fatorial);
        }
    }
}
