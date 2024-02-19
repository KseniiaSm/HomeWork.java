package stream.methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Method_collect {
    /**
     Метод collect: grouping и partitioning
     Метод collect - метод для преобразования потока в какую-либо коллекцию.

     Это конечный метод.

     groupingBy - группировка по (признаку, параметру)
     .collect(Collectors.groupingBy - вернет Map (в котором ключ - это курс студента,
     а значение - лист студентов)

     partitioningBy - разделение по (признаку, параметру)

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

        System.out.println("Группировка студентов по курсу:");

        Map<Integer, List<Student>> mapOfStudents = students.stream().map(el -> {el.setName(el.getName().toUpperCase());return el;})
                .collect(Collectors.groupingBy(st -> st.getCourse()));

        for (Map.Entry<Integer,List<Student>> entry: mapOfStudents.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("Разделение студентов по оценке:");

        Map<Boolean, List<Student>> mapOfStudents2 = students.stream()
                .collect(Collectors.partitioningBy(el -> el.getAvgGrade() > 7));

        for (Map.Entry<Boolean,List<Student>> entry: mapOfStudents2.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
