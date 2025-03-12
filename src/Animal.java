public class Animal {
    public void emitirSom(){
        System.out.println("Animal faz um som.");
    }
}

class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O cachorro faz: Au Au!");
    }
}

class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O gato faz: Miau!");
    }
}
