package Leason20;

import java.util.Date;
import java.util.GregorianCalendar;

public class Test1Date {

    public static void main(String[] args) {

    GregorianCalendar gregorianCalendar = new GregorianCalendar();

        Date data = gregorianCalendar.getTime();
        System.out.println(data);
    }
}
