package aulas.oo.part06.javaLocalDate;

import java.time.LocalDate;

/**
 * Exemplo de como manipular LocalDate
 */
public class Exemplo02 {

    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();

        LocalDate ontem = hoje.minusDays(1);

        System.out.println(hoje);
        // 2021-07-29

        System.out.println(ontem);
        // 2021-07-28

    }
}