class Conta {
    String nome;
    String cpf;
    double dinheiro;
    double limite;

    void saca(double quanSac) {
        this.dinheiro -= quanSac;
    }
    void deposita(double quanDep) {
        this.dinheiro += quanDep;
    }
    boolean saca2(double valor) {
        if (this.dinheiro < valor) {
           return false;
        }
        else {
            this.dinheiro -= valor;
            return true;
        }
    }
    boolean TransferePara(Conta destino, double valorTran) {
        boolean retirou = this.saca2(valorTran);
        if (retirou == false) {
            return false;
        }
        else {
            destino.deposita(valorTran);
            return true;
        }
    }
}
