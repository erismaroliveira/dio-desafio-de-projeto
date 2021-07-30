package aulas.oo.part06.javaLocalDate;

import java.time.LocalTime;

/**
 * Exemplo de como manipular LocalTime
 */
public class Exemplo04 {

    public static void main(String[] args) {

        LocalTime agora = LocalTime.now();

        System.out.println(agora);
        // 23:06:49.252605100

        LocalTime maisUmaHora = agora.plusHours(1);

        System.out.println(maisUmaHora);
        // 00:06:49.252605100

    }
}
