package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Method_filter {
    /**
     Метод filter() фильтрует данные из определенного набора
     */

    public static void main(String[] args) {
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

        System.out.println("ArrayList до фильтрации: " + students);

        //Метод фильтр использует в себе интерфейс Predicate
        students = students.stream().filter(element ->
                element.getAge() < 25 && element.getAvgGrade()>7).collect(Collectors.toList());
        System.out.println("ArrayList после фильтрации: " + students);
    }
}

