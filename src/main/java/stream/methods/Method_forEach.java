package stream.methods;

import java.util.Arrays;

public class Method_forEach {
    /**
     forEach - Позволяет пройти по всем элементам и напр. вывести их на экран

     !!! этот метод возвращает void (т.е. можно ни к чему не приравнивать)

     здесь можно не создавать другой массив и не нужно преобразовывать в лист или аррей
     (можно сразу сделать операцию и вывести на экран)

     */
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        Arrays.stream(array).forEach(element -> {
            element *= 2;
            System.out.println(element);
        });
        //или:
        Arrays.stream(array).forEach(element -> {System.out.println(element*2); });

        //вывести на экран все элементы:
        //можно сделать так:
        Arrays.stream(array).forEach(System.out::println);

        //Каждый элемент потока вставь в метод, который находится в классе Utils
        Arrays.stream(array).forEach(Utils::myMethod);
        //или то же самое, но полная запись
        Arrays.stream(array).forEach(element -> Utils.myMethod(element));
    }
}

class Utils {
    public static void myMethod(int a) {
        a+=5;
        System.out.println("Element: " + a);
    }
}
