public interface Veiculo {
    void mover();
}

class Carro implements Veiculo {
    @Override
    public void mover() {
        System.out.println("O carro está se movendo rápido.");
    }
}

class Bicicleta implements Veiculo {
    @Override
    public void mover() {
        System.out.println("A bicicleta está se movendo devagar.");
    }
}