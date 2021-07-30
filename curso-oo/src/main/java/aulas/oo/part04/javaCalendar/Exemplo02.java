package aulas.oo.part04.javaCalendar;

import java.util.Calendar;

/**
 *  Exemplo de utilização da classe Calendar
 */
public class Exemplo02 {

    public static void main(String[] args) {

        Calendar agora = Calendar.getInstance();

        System.out.println("A data corrente é : " + agora.getTime());
        // A data corrente é : Thu Jul 29 22:52:26 BRT 2021

        agora.add(Calendar.DATE, -15);
        System.out.println("15 dias atrás: " + agora.getTime());
        // 15 dias atrás: Wed Jul 14 22:52:26 BRT 2021

        agora.add(Calendar.MONTH, 4);
        System.out.println("4 meses depois: " + agora.getTime());
        // 4 meses depois: Sun Nov 14 22:52:26 BRT 2021

        agora.add(Calendar.YEAR, 2);
        System.out.println("2 anos depois: " + agora.getTime());
        // 2 anos depois: Tue Nov 14 22:52:26 BRT 2023

    }
}