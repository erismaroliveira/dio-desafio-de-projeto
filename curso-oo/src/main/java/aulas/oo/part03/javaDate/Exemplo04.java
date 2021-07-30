package aulas.oo.part03.javaDate;

import java.util.Date;

/**
 *  Exemplo de utilização dos metodos compareTo e equals
 */
public class Exemplo04 {

    public static void main(String[] args) {

        Date dataNoPassado = new Date(1513124807691L); //Tue Dec 12 22:26:47 BRST 2017

        Date dataNoFuturo = new Date(1627608810091L); //Thu Jul 30 08:13:27 BRST 2021

        Date mesmaDataNoFuturo = new Date(1627608810091L); //Thu Jul 30 08:13:27 BRST 2021

        /* Comparando se as datas são iguais */
        boolean isEquals = dataNoFuturo.equals(mesmaDataNoFuturo);

        System.out.println(isEquals); //true

        /* Comparando uma data com a outra */
        int compareCase1 = dataNoPassado.compareTo(dataNoFuturo); //passado -> futuro

        int compareCase2 = dataNoFuturo.compareTo(dataNoPassado); //futuro -> passado

        int compareCase3 = dataNoFuturo.compareTo(mesmaDataNoFuturo); //datas equivalentes

        System.out.println(compareCase1); // -1

        System.out.println(compareCase2); // 1

        System.out.println(compareCase3); // 0

    }
}
