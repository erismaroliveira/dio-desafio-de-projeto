package aulas.oo.part04.javaCalendar;

import java.util.Calendar;

/**
 *  Algumas conversões de data
 */
public class Exemplo03 {

    public static void main(String[] args) {

        Calendar agora = Calendar.getInstance();

        System.out.printf("%tc\n", agora);
        //qui jul 29 22:55:09 BRT 2021

        System.out.printf("%tF\n", agora);
        //2021-07-29

        System.out.printf("%tD\n", agora);
        //07/29/21

        System.out.printf("%tr\n", agora);
        //10:55:09 PM

        System.out.printf("%tT\n", agora);
        //22:55:09

    }
}
