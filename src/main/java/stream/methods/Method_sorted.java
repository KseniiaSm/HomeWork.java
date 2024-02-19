package stream.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Method_sorted {
    //sorted - метод для сортировки
    public static void main(String[] args) {
        int[] array = {3, 100, 2, 33, 10};
        System.out.print(Arrays.toString(array));
        array = Arrays.stream(array).sorted().toArray();
        System.out.print(Arrays.toString(array));


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

        //если сортируем объекты, то необходимо в параметры sorted переопределить компаратор
        students = students.stream().sorted((s1, s2)-> s1.getName().compareTo(s2.getName())).collect(Collectors.toList());
        System.out.println(students);
    }
}
