package lambda;
import java.util.ArrayList;
import java.util.function.*;

public class InterfacePredicate {
    /**
                          Interface Predicate <T>

     необходим для создания интерфейсов и методов, которые могут использовать разные типы данных
     напр., не только Student, но также Human...и т.д.

     public interface Predicate<T>{
     boolean test(T t);
     }

     не забудь импортировать import java.util.function.*;
     !!!его не надо создавать, он уже есть в папке function, которую мы импортировали
     */
}

    class Student1 {
        String name;
        char sex;
        int age;
        int course;
        double avgGrade;

        Student1(String name, char sex, int age, int course, double avgGrade){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.course = course;
            this.avgGrade = avgGrade;
        }
    }


class StudentInfo1 {
        void printStudent(Student1 st){
            System.out.println("Student's name: " + st.name +
                    " sex: " + st.sex + " age: " + st.age +
                    " course: " + st.course + " average grade: " + st.avgGrade);
        }
        void testStudents(ArrayList<Student1> aL, Predicate<Student1> t){
            for (Student1 s:aL) {
                if(t.test(s)){
                    printStudent(s);
                }
            }
        }

        public static void main(String[] args) {
            Student1 st1 = new Student1("Nastya", 'f', 20, 1, 9.0);
            Student1 st2 = new Student1("Denis", 'm', 25, 5, 6.9);
            Student1 st3 = new Student1("Artem", 'm', 30, 4, 8.5);
            Student1 st4 = new Student1("Masha", 'f', 19, 2, 10.0);
            Student1 st5 = new Student1("Nikita", 'm', 34, 3, 7.9);

            ArrayList <Student1> listOfStudents = new ArrayList<>();
            listOfStudents.add(st1);
            listOfStudents.add(st2);
            listOfStudents.add(st3);
            listOfStudents.add(st4);
            listOfStudents.add(st5);

            StudentInfo1 si = new StudentInfo1();

            System.out.println("Студенты с оценкой больше 8.5: ");
            si.testStudents(listOfStudents, (Student1 st) -> {return st.avgGrade>8.5;});

            /**
             * Попробуем удалить студентов, чье имя оканчивается на "a" из ArrayList'a
             */
            System.out.println();
            System.out.println("Все имена студентов: ");
            for (Student1 s:listOfStudents) {
                System.out.println(s.name);
            }

            listOfStudents.removeIf(x->x.name.endsWith("a"));
            System.out.println();
            System.out.println("Имена студентов, не оканчивающиеся на а: ");
            for (Student1 s:listOfStudents) {
                System.out.println(s.name);
            }


        }}

