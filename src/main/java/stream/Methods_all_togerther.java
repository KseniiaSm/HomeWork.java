package stream;

import stream.methods.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Как использовать методы стрима вместе???
public class Methods_all_togerther {
    // промежуточные операторы принимают стрим и возвращают тоже стрим
    // промежуточные методы не начнут работать пока не будет в конце завершающего метода
    // (терминального метода)
    //после терминального метода не вызвать промежуточные методы
    // терминальные forEach, reduce, count, collect(Collect.toList)

    /**                      Методы

     1. Intermediate (промежуточные)

     1.1. collect: grouping и partitioning - метод для преобразования потока в какую-либо коллекцию.
                  groupingBy - группировка по (признаку, параметру)
                  partitioningBy - разделение по (признаку, параметру)
     1.2. distinct - проверяет элементы с помощью метода equals() и возвращает стрим уникальных элементов
     1.3. filter() фильтрует данные из определенного набора
     1.4. findFirst - метод возвращает первый элемент стрима
     1.5. flatMap используем тогда, когда нужно работать с элементами элементов коллекции
     1.6. limit - ограничивает кол-во элементов в стриме
     1.7. map - совершает операции с каждым элементом коллекции
     1.8. peak - то же самое, что и forEach, но на выходе - коллекция у forEach тип void
     1.9. skip - пропускает первые n элементов стрима
     1.10. sorted - метод для сортировки


     2. Terminal (терминальный, завершающий метод)

     2.1. concat -  соединяет два стрима
     2.2. count - считает количество элментов в стриме
     2.3. forEach - Позволяет пройти по всем элементам и напр. вывести их на экран
     2.4. reduce - уменьшить все элементы до 1 элемента
     2.5. min_max - найти минимальное или максимальное значение в стриме


     3. Не те не те

     mapToInt - возвращает после себя int - стрим
     mapToDouble - возвращает после себя double - стрим

     метод sum() -суммирует элементы
     getAverage - возвращает среднее double значение

     min()
     max() - возвращают минимальное и максимальное значение после mapToInt
     (!!!! не забудь в конце написать .getAsInt() )
     */
    public static void main(String[] args) {
        //задача отфильтровать только не четные, разделить кратные 3 на 3 и сосчитать сумму чисел
        int[] array = {1, 10, 9, 12, 33, 1, 81, 76, 42};

        int result = Arrays.stream(array).filter(elem -> elem%2==1)
                                         .map(elem -> {if(elem%3==0){elem/=3;};
                                                       return elem;})
                                         .reduce((accum, elem) -> accum + elem).getAsInt();
        System.out.println(result);


        Student st1 = new Student("Ivan", 'm', 19, 1, 8.9);
        Student st2 = new Student("Dmitrii", 'm', 30, 5, 8.2);
        Student st3 = new Student("Maria", 'f', 18, 1, 7.5);
        Student st4 = new Student("Nikolay", 'm', 25, 4, 6.9);
        Student st5 = new Student("Ksenia", 'f', 22, 2, 8.0);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        //задача перевести все имена на большие буквы, отфильтровать по полу и отсортировать по возрасту
        students.stream().map(s1 -> {s1.setName(s1.getName().toUpperCase());
                                                 return s1;})
                .filter(s1 -> s1.getSex() == 'f')
                .sorted((s1, s2) -> s1.getAge()-s2.getAge())
                .forEach(s1 -> System.out.println(s1));
    }
}
