package enum_;

import java.util.Arrays;

public class Enum_ {
    /**
     Enum (enumeration перечисление)
     используется тогда, когда нужно ограничить пользователя в выборе
     (выбор только из определенного списка)

     Конструктор enum имеет access modifier - private
     и не нуждается во внешнем вызове

     enum является дочерним классом для java.lang.Enum

     */
    public static void main(String[] args) {
        Today today = new Today(WeekDays.MONDAY);
        //Теперь в поле параметров Today() мы не можем написать ничего, кроме слов из Enum
        today.daysInfo();

        /**         Методы         */

        //1. valueOf - позволяет задать enum значение через стринг
        WeekDays w1 = WeekDays.valueOf("MONDAY");
        System.out.println(w1);

        //2. values - возвращает массив констант enum
        WeekDays[] array = WeekDays.values();
        System.out.println("Массив констант в enum Weekdays " + Arrays.toString(array));
    }

}

//                        Создание enum:
enum WeekDays {
    MONDAY("Bad"),
    TUESDAY("Good"),
    WEDNESDAY("OK"),
    SUNDAY("Perfect");

    //Конструктор в enum
    //он прайват по умолчанию и после его создания необходимо каждому из
    // элементов задать поле из конструктора (mood)
    private String mood;
    WeekDays(String mood) {
        this.mood = mood;
    }

    //можно добавить геттер
    public String getMood() {
        return mood;
    }
}

class Today {
    WeekDays weekDay;
    public Today(WeekDays weekDay) {
        this.weekDay = weekDay;
    }

    void daysInfo(){
        switch (weekDay){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
                System.out.println("Иди на работу");
                break;
            case SUNDAY:
                System.out.println("Отдыхай");
                break;
        }
        System.out.println("Настроение в этот день: " + weekDay.getMood());
    }
}
