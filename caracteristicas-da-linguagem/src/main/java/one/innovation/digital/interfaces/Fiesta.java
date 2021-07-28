package one.innovation.digital.interfaces;

public class Fiesta implements Carro, Veiculo {

    @Override
    public String marca() {
        return "Ford";
    }

    @Override
    public String registro() {
        return "d546df6sdf652";
    }

    @Override
    public void ligar() {
        Carro.super.ligar();

        Veiculo.super.ligar();
    }


}
