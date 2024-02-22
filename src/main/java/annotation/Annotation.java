package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 Аннотации - это специальные комментарии/метки, которые
 нужны для передачи определенной информации
 чтобы создать аннотацию, необходимо над методом поставить @ и выбрать или написать аннотацию

                                 Создание аннотации
 * просто пишем

 @interface название
 напр.:
 @interface MyAnnotation {
 }
 + аннотация может быть пустая или с информацией

  + аннотацию можно вставить в совершенно любое место кода (перед классом, методом, конструктором,
  переменной)

 + чтобы ограничить место использования аннотации используй @Target
 (для этого укажи ее перед аннотацией и укажи внутри тип)
 @Target - показывает область кода, к которой аннотация может быть применима.
 Самые распространенные области кода:
 + TYPE - class, interface, enum
 + FIELD - поле класса
 + METHOD - метод класса
 напр:
 @Target(ElementType.METHOD)
 @interface MyAnnotationForMethodsOnly {
 }


 @Override -позволяет понять точно ли метод в child классе переопределен

 @Deprecated -позволяет понять,что метод устарел
        (если использовали эту аннотацию,то напиши какой метод
        использовать вместо этого метода и причину почему он устарел)

 @Retention(значение) - описывает жизненный цикл аннотации.
                       До какого этапа программы аннотация будет видна.
 + SOURCE – Аннотация видна в source коде, отбрасывается компилятором и уже в byte коде не видна;
            (это для компилятора, чтобы компилятор мог проверить переопределен ли метод по @Override напр)
 + CLASS – Аннотация видна в byte коде, отбрасывается JVM во время выполнения программы;
           !!!эта дефолтная CLASS
 + RUNTIME – Аннотация видна во время выполнения программы - чаще всего используется


 !!! Если необходимо вытащить данные из аннотации, то смотри конец урока и урок по рефлексии
 */

public class Annotation {
    public static void main(String[] args) {
        Parent p = new Child("Zaur");
        p.showInfo();
    }
}

class Parent {
    String name;

    public Parent(String name) {
        this.name = name;
    }

    @Deprecated
    void showInfo() {
        System.out.println("Это родительский класс. Имя = " + name);
    }
}

class Child extends Parent {
    public Child(String name) {
        super(name);
    }

    @Override
    void showInfo() {
        super.showInfo();
    }
}

/**                Аннотации с полями внутри:      */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone {
    //создание полей
    String OperationSystem();
    int yearOfCompany();
    //создание дефолтного значения (можно поменять или не вводить)
    String nameOfCreator() default "Mr";
}

//Применим аннотацию c полями:
@SmartPhone(OperationSystem = "Android",yearOfCompany = 2010)
class Xiaomi{
    String model;
    double price;
}