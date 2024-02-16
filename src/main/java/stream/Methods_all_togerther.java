package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Как использовать методы стрима вместе???
public class Methods_all_togerther {
    // промежуточные операторы принимают стрим и возвращают тоже стрим
    // промежуточные методы не начнут работать пока не будет в конце завершающего метода
    // (терминального метода)
    //после терминального метода не вызвать промежуточные методы
    // терминальные forEach, reduce, count, collect(Collect.toList)
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
