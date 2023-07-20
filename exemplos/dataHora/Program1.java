package dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Program1 {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2023-07-25");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-25T01:30:26");
        Instant d03 = Instant.parse("2022-07-25T01:30:26Z");

        LocalDate pastWeekLocal = d01.minusWeeks(1);
        System.out.println(pastWeekLocal);
    }
}
