package nested_classes.ananymous_classes;

/**
 Анонимные классы не имеют имени
 + часто используются
 */
public class Ananymous_class {
    public static void main(String[] args) {

        /**
         Создание анонимного класса - это объявление класса и одновременное создание его объекта

         Чтобы создать анонимный класс:
         Можно имплментировать интерфейс или extends класс + переопределять его метод

         мы тут не создаем объект, а пишем все то, что бы написали в классе, который имплементировал бы
         интерфейс Math

         !!! т.е. здесь мы создаем класс, который имплементирует интерфейс и переопределили метод интерфейса
         и у этого класса нет имени

         т.е это все одно выражение (один стейтмент), после которого идет ;

         + в анонимных классах нет конструктора
         + анонимный класс может обращаться к прайват переменным внешнего класса
         - анонимных интерфейсов не существует
         */
        Math mathSlozenie = new Math() {
            //можем также добавить сюда переменные и другие методы:
            int c = 10;
            void abc(){}
            @Override
            public int doOperation(int a, int b) {
                return a+b;
            }
        };
        System.out.println("После сложения: " + mathSlozenie.doOperation(3,5));

        Math mathUmnozenie = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a*b;
            }
        };
        System.out.println("После умножения: " + mathUmnozenie.doOperation(3, 5));

    }
}

interface Math {
    int doOperation(int a, int b);
}

/*
class Math {
    int doOperation(int a, int b) {
    return a/b;
    }
 */
