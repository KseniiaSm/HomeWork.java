package stream.methods;

import java.util.ArrayList;
import java.util.List;

public class Method_findFirst {
    /**
     findFirst - метод возвращает первый элемент стрима

     (промежуточный метод)
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


        Student first = students.stream().filter(el -> el.getSex() == 'f')
                .sorted((s1,s2) -> s1.getAge() - s2.getAge())
                .findFirst().get();

        System.out.println("Первый студент: " + first);
    }
}
