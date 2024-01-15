package dates_time;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Date_Time {
    /**
     * LocalDate - класс содержит информацию о дне: год, месяц, день
     * LocalTime - информация о времени: час, минута, секунда, наносекунда
     * LocalDateTime - информация о дне и времени: год, месяц, день,час, минута, секунда, наносекунда
     * java.time.* - данные классы содержатся в этом пакете
     * все данные классы имеют статический метод now(), который возвращает
       соответствующие объекты с текущими значениями
     */


    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        /**
         * Задать дату:
         */
        LocalDate ld1 = LocalDate.of(2024, 2, 10);
        System.out.println(ld1);
        LocalDate localDate = LocalDate.of(2000, Month.JULY,30);
        System.out.println(localDate);
        LocalTime lt1 = LocalTime.of(20,11,59);
        System.out.println(lt1);

        /**
         *                           Методы:
         */

        //1.Вычесть или прибавить определенное количество дней, или месяцев, или недель, или лет
        System.out.println();
        System.out.println(1);
        LocalDate ld3 = LocalDate.of(2000, 10, 10);
        System.out.println(ld3 + " дата ld3");
        ld3 = ld3.minusDays(2);
        System.out.println(ld3 + " дата ld3 после вычитания 2 дней");
        ld3 = ld3.plusDays(5);
        System.out.println(ld3 + " дата ld3 после прибавления 5 дней");

        //2.Вычесть или прибавить определенное количество часов, минут, секунд, наносекунд
        System.out.println();
        System.out.println(2);
        LocalTime lt3 = LocalTime.of(10,10,30,2);
        System.out.println(lt3 + " время lt3");
        lt3 = lt3.minusHours(12);
        System.out.println(lt3 + " время lt3 после вычитания 12 часов");
        lt3 = lt3.plusNanos(10001);
        System.out.println(lt3 + " время lt3 после прибавления 10001 наносекунд");

        //3. Какой из дней (или времени) был до или после с помощью методов .isBefore / .isAfter
        System.out.println();
        System.out.println(3);
        LocalTime lt4 = LocalTime.of(1,10,30,2);
        System.out.println(lt4.isAfter(lt3) + " время lt4 после времени lt3? ");

        //4. Можно вычитать или прибавлять не конкретный месяц, год и т.д. а ввести переменную период
        //Это только для LocalDate, для времени нельзя использовать
        //Period
        System.out.println();
        System.out.println(4);
        Period p = Period.ofYears(2);
        System.out.println(ld3);
        ld3 = ld3.minus(p);
        System.out.println(ld3 + " ld3 после вычитания периода времени");

        //5. Продолжительность (Duration)
        System.out.println();
        System.out.println(5);
        Duration d = Duration.ofHours(3);
        LocalTime ld5 = LocalTime.of(10,30);
        System.out.println(ld5 + " время ld5");
        ld5 = ld5.plus(d);
        System.out.println(ld5 + " время ld5 после прибавления Duration d = 3");

        //6. .getDayOfWeek какой день недели (пн,вт...)?
        //Через get можно достать любую информацию из даты
        System.out.println();
        System.out.println(6);
        LocalDateTime ldt6 = LocalDateTime.of(2024,Month.JANUARY, 15, 19, 23,10);
        System.out.println("Сейчас дата и время: (переменная ldt6) " + ldt6);
        System.out.println("Узнаем какой это день недели: " + ldt6.getDayOfWeek());
        System.out.println("Какое это число месяца: " + ldt6.getDayOfMonth());
        System.out.println("Какой это месяц по счету: " + ldt6.getMonthValue());
        System.out.println("Какой это день в году " + ldt6.getDayOfYear());

        /**
         *            Методы, позволяющие изменять формат даты и времени
         *            DateTimeFormatter
         */

        //7. Зададим определённый формат даты:
        System.out.println();
        System.out.println(7);
        DateTimeFormatter dtf7 = DateTimeFormatter.ISO_DATE_TIME;
        //Затем используем заданный формат
        LocalDateTime ldt7 = LocalDateTime.of(2000,Month.MARCH, 1, 00, 23);
        System.out.println("Дата и время ldt7 в привычном формате " + ldt7);
        System.out.println("Дата и время ldt7 в измененном формате " + ldt7.format(dtf7));

        //или так еще можно:
        DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println("Дата и время ldt7 в кратком формате: " + ldt7.format(shortFormat));

        //Создадим свой фомат:
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        //в зависимости от колличества букв MM Y будет по разному выводится дата и время
        System.out.println(ldt7 + " дата и время ldt7 до применения формата");
        System.out.println(ldt7.format(myFormat) + " дата и время ldt7 после применения созданного формата");

        //8. Перевести String в дату и время
        //  .parse(String a)
        // !!!! String должен иметь на 100% такой же формат
        System.out.println();
        System.out.println(8);
        DateTimeFormatter format8 = DateTimeFormatter.ofPattern("dd, MM, yyyy");
        String data = "04, 01, 1996";
        LocalDate myB = LocalDate.parse(data, format8);
        System.out.println(myB);

        //или можно по шаблонному написать и будет проще
        LocalDateTime shablonnayData = LocalDateTime.parse("2024-01-15T19:23:10");
        System.out.println(shablonnayData + " формата даты и времени");






    }
}

class Test {
    static void smenaDejurnogo (LocalDate nachalo, LocalDate konec){
        LocalDate date = nachalo;
        while (date.isBefore(konec)){
            System.out.println("Наступает дата " + date + ". Пора менять дежурного.");
            date = date.plusMonths(1);
        }
    }

    public static void main(String[] args) {
        LocalDate nachalo = LocalDate.of(2020, 9, 1);
        LocalDate konec = LocalDate.of(2021, 5, 31);
        smenaDejurnogo(nachalo,konec);

    }
}
