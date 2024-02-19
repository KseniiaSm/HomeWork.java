package stream.methods;

import java.util.ArrayList;
import java.util.List;

public class Method_skip {
    /**
     skip - пропускает первые n элементов стрима

     intermediate (промежуточный)
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

        System.out.println("Все студенты старше 19:");
        students.stream().filter(el -> el.getAge()>19).forEach(System.out::println);
        System.out.println();

        //Оставить 2 студентов старше 19
        System.out.println("Оставить 2 студентов старше 19:");
        students.stream().filter(el -> el.getAge()>19).limit(2).forEach(System.out::println);
        System.out.println();

        System.out.println("Пропустить 2 студентов старше 19:");
        students.stream().filter(el -> el.getAge()>19).skip(2).forEach(System.out::println);
    }
}
