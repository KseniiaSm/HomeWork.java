package lambda2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentInfo {
//    void printSudentsOverGrade(ArrayList<Student> arrayList, double grade) {
//        for (Student s : arrayList) {
//            if(s.avgGrade > grade) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printSudentsUnderAge(ArrayList<Student> arrayList, int age) {
//        for (Student s : arrayList) {
//            if(s.age < age) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printSudentsMixCondition(ArrayList<Student> arrayList, int age, double grade, char sex) {
//        for (Student s : arrayList) {
//            if(s.avgGrade < grade && s.age > age && s.sex == sex) {
//                System.out.println(s);
//            }
//        }
//    }

    public void check(ArrayList<Student> studentArrayList, StudentChecks sc) {
        for (Student student : studentArrayList) {
            //типа если этот метод - true, то выводи на экран:
            if(sc.check(student)){
                System.out.println(student);
            }
        }
    }
}
interface StudentChecks {
    boolean check(Student s);
}


class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 19, 1, 8.9);
        Student st2 = new Student("Dmitrii", 'm', 30, 5, 8.2);
        Student st3 = new Student("Maria", 'f', 18, 1, 7.5);
        Student st4 = new Student("Nikolay", 'm', 25, 4, 6.9);
        Student st5 = new Student("Ksenia", 'f', 22, 2, 8.0);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo studentInfo  = new StudentInfo();
//        studentInfo.printSudentsOverGrade(students, 8);
//        System.out.println();
//        studentInfo.printSudentsUnderAge(students, 25);
//        System.out.println();
//

        //сделаем то же самое через анонимные классы:
        studentInfo.check(students, new StudentChecks() {
            @Override
            public boolean check(Student s) {
                return false;
            }
        });

        //через лямбда выражения
        //для этого возьмем самую суть анонимного класса (параметры и return)
        studentInfo.check(students,(Student s) -> {return s.age<25;});
        //класс в котором метод. имя метода (параметры метода) -> условия

        /**
         Область видимости переменных в лямбда выражении - это только лямбда выражение
         строчкой ниже они не будут видны

         В лямбда выражении можно использовать переменные извне, только если они final или
         мы их нигде и никогда не изменим

         */


        /**         Варианты записи:         */
        //1 Самый длинный:
        studentInfo.check(students,(Student s) -> {return s.age<25;});
        //2 Самый короткий:
        studentInfo.check(students, s -> s.age<25);
        //3 смешанные варианты
        studentInfo.check(students, s -> {return s.age<25;});
        studentInfo.check(students,(Student s) -> s.age<25);
        //4 если нужно что-то дописать
        studentInfo.check(students,(Student s) -> {System.out.println("Hi"); return s.age<25;});
        //5. !!!!!!!
        // Чтобы использовать лямбда выражение несколько раз:
        //выносим в переменную
        StudentChecks sCh = (Student s) -> {return s.age<25;};
        studentInfo.check(students, sCh);

        /**         Примеры с существующим интерфейсом (Comparator)


         * анонимный класс:
         */
        System.out.println("\nИспользование анонимного класса для сортировки по курсу:");
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.course - o2.course;
            }
        });
        System.out.println(students);

        /**
         Лямбда выражения:
         */
        System.out.println("\nИспользование лямбда выражения для сортировки по возрасту:");
        Collections.sort(students,(Student s1, Student s2) -> {return s1.age - s2.age;});
        System.out.println(students);
    }
}
