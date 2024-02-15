package lambda2.function;
import lambda2.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
public class Function_ {
    /**
     Function <T, R> имеет метод: R apply(T t)
     принимает 2 параметра
     T - входной параметр
     R - return type (какой тип возвращается)

     !!! не забудь импортировать

     //название интерфейса <тип параметров, тип результата> имяметода = имяПеременной на вход -> имяПеременнойНаВыход
     Function<Student, Double> ourFunction = student -> student.avgGrade;
     */

    private static double avgOfSmth(List<Student> list, Function<Student, Double> ourFunction) {
        double result = 0;
        for (Student st : list) {
            result +=ourFunction.apply(st);
        }
        result = result / list.size();
        return result;
    }

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

        Function<Student, Double> ourFunction = student -> student.avgGrade;
        double resultGrade = (avgOfSmth(students, oneStudent -> oneStudent.avgGrade));
        System.out.println(resultGrade);

        Function<Student, Double> ourFunction2 = student -> (double) student.course;
        double resultCourse = (avgOfSmth(students, oneStudent -> (double)oneStudent.course));
        System.out.println(resultCourse);
    }
}
