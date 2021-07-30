package aulas.oo.part03.javaDate;

import java.util.Date;

/**
 *  Exemplo de utilização dos metodos after e before
 */
public class Exemplo03 {

    public static void main(String[] args) {

        Date dataNoPassado = new Date(1513124807691L);

        Date dataNoFuturo = new Date(1613124807691L);

        /* Comparando se a dataNoPassado é posterior a dataNoFuturo */
        boolean isAfter = dataNoPassado.after(dataNoFuturo);

        System.out.println(isAfter);
        //false

        /* Comparando se a dataNoPassado é anterior a dataNoFuturo */
        boolean isBefore = dataNoPassado.before(dataNoFuturo);

        System.out.println(isBefore);
        //true

    }
}
