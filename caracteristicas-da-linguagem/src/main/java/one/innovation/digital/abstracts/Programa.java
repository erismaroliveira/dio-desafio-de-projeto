package one.innovation.digital.abstracts;

public class Programa {

    public static void main(String[] args) {
        //final FormaGeometrica = new FormaGeometrica();

        final FormaGeometrica quadrado = new Quadrado("quadrado", 10.0);

        System.out.println(quadrado);

        System.out.println(quadrado.desenha(12, 34));
        System.out.println(quadrado.nome());
        System.out.println(quadrado.area());
    }
}
