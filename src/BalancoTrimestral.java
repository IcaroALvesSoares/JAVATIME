public class BalancoTrimestral {
    public static void main(String[] args){
        int gastosJaneito=15000;
        int gastosFevereiro=23000;
        int gastosMarco=17000;
        int gastosTrimestres=gastosFevereiro+gastosJaneito+gastosMarco;
        int mediaMensal=gastosTrimestres/3;
        System.out.println(gastosTrimestres);
        System.out.println("Valor da média mensal =" + mediaMensal);
    }
}
