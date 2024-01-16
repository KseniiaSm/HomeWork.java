package dates_time;

import java.time.format.DateTimeFormatter;
import java.time.*;

public class HW {

    static DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("YYYY, MMMM-dd !! hh:mm");
    static DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/YY");

    public static void schedule(LocalDateTime localDateTime1, LocalDateTime localDateTime2, Period period, Duration duration) {
        while (localDateTime1.isBefore(localDateTime2)) {
            System.out.println("Работаем с: " + localDateTime1.format(dateTimeFormatter1));
            localDateTime1 = localDateTime1.plus(period);
            System.out.println("До: " + localDateTime1.format(dateTimeFormatter1));
            System.out.println("Отдыхаем с: " + localDateTime1.format(dateTimeFormatter2));
            localDateTime1 = localDateTime1.plus(duration);
            System.out.println("До: " + localDateTime1.format(dateTimeFormatter2));
        }

    }

}

class ScheduleOfTeam{
    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.of(2016, 1,1,9,0);
        LocalDateTime ldt2 = LocalDateTime.of(2016, 2,3,9,0);
        Period work = Period.ofDays(2);
        Duration holidays = Duration.ofHours(33);
        HW.schedule(ldt1,ldt2,work,holidays);




    }


}
