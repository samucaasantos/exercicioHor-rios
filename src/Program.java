import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public static void main(String[] args) {
    LocalDate d01 = LocalDate.now();
    LocalDateTime d02 = LocalDateTime.now();
    Instant d03 = Instant.now();
    LocalDate do4 = LocalDate.parse("2024-09-30");
    LocalDateTime d05 = LocalDateTime.parse("2024-02-28T21:30:05.0954");
    Instant d06 = Instant.parse("2024-02-28T21:30:05.0954Z");
    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
    DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
    LocalDate pastd04 = do4.minusDays(7);
    LocalDate futured04 = do4.plusDays(7);
    Instant pastd06 = d06.minus(7, ChronoUnit.DAYS);
    System.out.println(d01.format(fmt1));
    System.out.println(d02);
    System.out.println(d03);
    System.out.println(do4.format(fmt1));
    System.out.println(d05.format(fmt2));
    System.out.println(d05.format(fmt4));
    System.out.println(fmt3.format(d06));
    System.out.println(pastd04);
    System.out.println(futured04);
    System.out.println(pastd06);
}
