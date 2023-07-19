package dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class app {
    public static void main(String[] args){

        DateTimeFormatter fat1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fat2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        //o instant tem o fuso de londres

        LocalDate d04 = LocalDate.parse("2023-07-25");
        LocalDateTime d05 = LocalDateTime.parse("2023-07-25T17:30:26");
        Instant d06 = Instant.parse("2023-07-25T17:30:26Z");
        Instant d07 = Instant.parse("2023-07-25T17:30:26-03:00");

        LocalDate d08 = LocalDate.parse("20/07/2023", fat1);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2023 01:30", fat2);

        LocalDate d10 = LocalDate.of(2022, 7, 20);

        System.out.println(d01.toString());
        System.out.println(d02);
        System.out.println(d03.toString());
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d06.toString());
        System.out.println(d07.toString());
        System.out.println(d08.toString());
        System.out.println(d09.toString());
        System.out.println(d10.toString());
        System.out.println(d08.format(fat1));


    }
}
