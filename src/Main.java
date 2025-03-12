public class Main {
    public static void main(String[] args){
        //Att 1 ao 3
        Pessoa p1 = new Pessoa("Maria", 30);

        p1.apresentar();
        System.out.println();

        //Att 4
        ContaBancaria conta = new ContaBancaria();

        conta.depositar(500);
        System.out.printf("Saldo atual: R$%.2f\n", conta.getSaldo());
        System.out.println();

        //Att 5
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        cachorro.emitirSom();
        gato.emitirSom();
        System.out.println();

        //Att 6
        Funcionario f = new Funcionario("Carlos", 3000);
        Gerente g = new Gerente("Ana", 5000);

        System.out.println("Bônus Funcionário: " + f.calcularBonus());
        System.out.println("Bônus Gerente: " + g.calcularBonus());
        System.out.println();

        //Att 7
        Veiculo v1 = new Carro();
        Veiculo v2 = new Bicicleta();

        v1.mover();
        v2.mover();
        System.out.println();

        //Att 8
        int resultado = Calculadora.somar(5, 3);
        System.out.println("Soma: " + resultado);
    }
}
