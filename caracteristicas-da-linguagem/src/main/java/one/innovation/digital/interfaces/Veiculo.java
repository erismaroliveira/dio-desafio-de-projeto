package one.innovation.digital.interfaces;

public interface Veiculo {

    String registro();

    default void ligar() {
        System.out.println("Ligando o Veículo!");
    }
}
