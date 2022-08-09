import sun.util.calendar.BaseCalendar;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;
import java.util.Scanner;

public class Tekrar {
    public static void main(String[] args) {

        LocalDate tarih=LocalDate.now();
        System.out.println(tarih);
        System.out.println(tarih.getMonth());

        System.out.println(tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL) ));

        DateTimeFormatter ozelformat= DateTimeFormatter.ofPattern("EEEE dd.MM.yyyy");
        System.out.println(tarih.format(ozelformat));

        LocalTime saat=LocalTime.now();
        System.out.println(saat);

        DateTimeFormatter timeformat=DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(saat.format(timeformat));

        String time=saat.format(timeformat);
        System.out.println(time);
    }

}
