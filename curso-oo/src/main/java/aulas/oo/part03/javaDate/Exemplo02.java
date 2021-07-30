package aulas.oo.part03.javaDate;

import java.util.Date;

/**
 * Exemplo de utilização do construtor com passagem de parametro em milisegundos
 */
public class Exemplo02 {

    public static void main(String[] args) {

        long currentTimeMillis = System.currentTimeMillis();

        System.out.println(currentTimeMillis);

        Date novaData = new Date(currentTimeMillis);

        System.out.println(novaData);
    }
}
