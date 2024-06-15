public class TesteFuncionario {
    public static void main(String[] args){
        Funcionario operador = new Funcionario();
        Data dataOpe = new Data();
        operador.dataDeEntrada = dataOpe;

        operador.nome = "Joaquin";
        operador.departamento = "Logistica";
        operador.salario = 2200;
        operador.rg = "123456789";
        operador.dataDeEntrada.dia = 22;
        operador.dataDeEntrada.mes = 11;
        operador.dataDeEntrada.ano = 1983;

        Funcionario rh = new Funcionario();
        Data dataRh = new Data();
        rh.dataDeEntrada = dataRh;

        rh.nome = "Bianca";
        rh.departamento = "RH";
        rh.salario = 1800;
        rh.rg = "987654321";
        rh.dataDeEntrada.dia = 11;
        rh.dataDeEntrada.mes = 5;
        rh.dataDeEntrada.ano = 1990;

        operador.recebeAumento(800);
        System.out.println(operador.salario);

        operador.calculoGanhoAtual();
        System.out.print("Ganho anual do " + operador.nome + ": " + operador.salario);

        operador.mostrar();
        operador.mostrarData();
        rh.mostrar();
        rh.mostrarData();

        if (operador == rh) {
            System.out.println("Iguais");
        }
        else {
            System.out.println("Diferentes");
        }
    }
}
