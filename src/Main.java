public class Main {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa("Maria", 30);

        p1.apresentar();

        ContaBancaria conta = new ContaBancaria();

        conta.depositar(500);
        System.out.println("Saldo atual: R$ " + conta.getSaldo());
    }
}
