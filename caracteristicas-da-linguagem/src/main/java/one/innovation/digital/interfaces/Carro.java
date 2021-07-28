package one.innovation.digital.interfaces;

public interface Carro {

    String marca();

    default void ligar() {
        System.out.println("Ligando o Carro!");
    }

}
