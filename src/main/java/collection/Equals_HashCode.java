package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Equals_HashCode {
    /**
     !!!!
     1. Есть правило в java: если переопределили equals, то необходимо переопределить и hashcode

     2. Результат выполнения метода hashcode для одного и того же объекта
     должен быть всегда одинаков

     3. Если два объекта equals = true, то hashcodы их равны

     4. Если два объекта не равны по методу equals, то и хэшкоды их не равны

     5. Если объекты равны по хэшкоду, то equals не всегда true

     Хэширование - это преобразование любого объекта с помощью метода hashcode в int.
     Хэшкод возвращает int значение.

     По методу equals сначала сравниваются hashcode, а потом уже сам метод equals применяется

     Коллизия - это когда два разных объекта имеют одинаковый хэшкод. Коллизий не избежать, если объектов много.

     Хэшкод намного быстрее, чем метод икволс
     */
    public static void main(String[] args) {
        Map<Student,Double> mapOfStudents = new HashMap<>();
        Student st1 = new Student("Zaur","Tregulov",4);
        Student st2 = new Student("Masha","Belikova",1);
        Student st3 = new Student("Katya","Vasenina",3);
        mapOfStudents.put(st1,4.5);
        mapOfStudents.put(st2,4.9);
        mapOfStudents.put(st3,4.0);
        System.out.println(mapOfStudents);

        Student st4 = new Student("Zaur","Tregulov",4);
        boolean result = mapOfStudents.containsKey(st4);

        /**
         если не переопределить hashcode, то результат будет false. Если переопределить, то true

         Результат такой, так как некоторые коллекции (напр. HashMap HashCode используют хэширование для сравнения
         если не переопределить hashcode, то сравнение будет не корректно
         */
        System.out.println(result);




    }


}

class Student{
    String name;
    String surname;
    int cours;

    public Student(String name, String surname, int cours) {
        this.name = name;
        this.surname = surname;
        this.cours = cours;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", cours=" + cours +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return cours == student.cours && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name, surname, cours);
//    }
}
