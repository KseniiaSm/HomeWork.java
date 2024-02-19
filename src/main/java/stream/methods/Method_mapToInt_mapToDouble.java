package stream.methods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Method_mapToInt_mapToDouble {
    /**
     mapToInt - возвращает после себя int - стрим
     mapToDouble - возвращает после себя double - стрим

     метод sum() -суммирует элементы
     getAverage - возвращает среднее double значение

     min()
     max() - возвращают минимальное и максимальное значение после mapToInt
     (!!!! не забудь в конце написать .getAsInt() )


     intermediate (промежуточный)

     !!! если хочешь получить лист Integer, то используй метод
     boxed() - конвертирует значения int => Integer

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

        List<Integer> courses = students.stream()
                .mapToInt(el -> el.getCourse())
                .boxed()
                .collect(Collectors.toList());
        System.out.println("Курсы: " + courses);

        //метод суммирование:
        int sumCourses = students.stream()
                .mapToInt(el -> el.getCourse()).sum();
        System.out.println("Сумма курсов: " + sumCourses);

        //найдем среднее значение (не забудь getAsDouble написать):
        double avgCourse = students.stream()
                .mapToInt(el -> el.getCourse()).average().getAsDouble();
        System.out.println("среднее значение курса: " + avgCourse);
    }
}
