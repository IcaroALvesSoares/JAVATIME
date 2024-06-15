public class Programa {
    public static void main(String[] args){
        //Atributos
        Conta minhaConta;
        minhaConta = new Conta();

        minhaConta.nome = "Guilerme";
        minhaConta.cpf = "131.312.412-10";
        minhaConta.dinheiro = 10578;
        minhaConta.limite = 50000;
        System.out.println(minhaConta.nome);

        Conta milhonaria;
        milhonaria = new Conta();

        milhonaria.nome = "Milramães";
        milhonaria.cpf = "999.999.999-99";
        milhonaria.dinheiro = 512900;
        milhonaria.limite = 999.999;
        System.out.println(milhonaria.nome);

        // Métodos
        minhaConta.saca(1200);
        minhaConta.deposita(3000);
        System.out.println(minhaConta.dinheiro);

        if (minhaConta.saca2(15000)) {
            System.out.println("Sacou :)");
        }
        else {
            System.out.println("Não sacou :(");
        }
        milhonaria.TransferePara(minhaConta, 100000);
        System.out.println(minhaConta.dinheiro);
    }
}

