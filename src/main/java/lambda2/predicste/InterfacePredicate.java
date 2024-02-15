
package lambda2.predicste;

import lambda2.Student;

import java.util.ArrayList;
import java.util.function.Predicate;

public class InterfacePredicate {
    /**
     Interface Predicate <T>

     !!!смотри папку лямбда1 (это продолжение)

     необходим для создания интерфейсов и методов, которые могут использовать разные типы данных
     напр., не только Student, но также Human...и т.д.

     public interface Predicate<T>{
     boolean test(T t);
     }

     не забудь импортировать import java.util.function.*;
     !!!его не надо создавать, он уже есть в папке function, которую мы импортировали
     */

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Привет");
        arrayList.add("Пока");
        arrayList.add("Hello");
        arrayList.add("Bye");
        arrayList.add("How are you?");

        System.out.println("ArrayList до удаления " + arrayList);
        arrayList.removeIf(element -> element.length()>5);
        System.out.println("ArrayList после удаления " + arrayList +"\n\n");


        /**         Пример со студентами          */

       // Predicate<Student> sortCours = stud1 -> stud1.course > 2;
       // Predicate<Student> sortAge = stud1 -> stud1.age > 20;

        /**
         1. Объединить условия
        studentInfo.check(students, sortCours.and(sortAge));
         2. Или или or
         sortAge.or(sortCours)
         3.Противоположные условия
         sortAge.negate()

         */
    }
}




