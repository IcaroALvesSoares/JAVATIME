class Funcionario {
    String nome;
    String departamento;
    double salario;
    String rg;
    Data dataDeEntrada;

    void recebeAumento(double valorAu) {
        this.salario += valorAu;
    }
    void calculoGanhoAtual() {
        this.salario *= 12;
    }
    void mostrar() {
        System.out.print("\nNome: " + this.nome);
        System.out.println("\nDepartamento: " + this.departamento);
        System.out.println("Salario: " + this.salario);
        System.out.println("RG: " + this.rg);
    }
    void mostrarData() {
        System.out.println("Data de entrada: " + this.dataDeEntrada.dataFormatada());
    }
}
