package aulas.oo.part02.construtores;

public class Programa {

    public static void main(String[] args) {

        Carro carro = new Carro("Palio", "Fiat", 2010, "blabla");

        System.out.println(carro.getMarca());
        System.out.println(carro.getModelo());
        System.out.println(carro.getAno());
        System.out.println(carro.getVariante());
    }
}
