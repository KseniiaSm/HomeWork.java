package stream.methods;

import java.util.ArrayList;
import java.util.List;

public class Method_flatMap {
    /**
     flatMap используем тогда, когда нужно работать с элементами элементов коллекции

     (промежуточный метод)

     похож на метод Map (он берет каждый из элементов коллекции или массива,
     потом лямбда выражения изменяет каждый из элементов
     и стрим возвращает измененную коллекцию)
     */

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 19, 1, 8.9);
        Student st2 = new Student("Dmitrii", 'm', 30, 5, 8.2);
        Student st3 = new Student("Maria", 'f', 18, 1, 7.5);
        Student st4 = new Student("Nikolay", 'm', 25, 4, 6.9);
        Student st5 = new Student("Ksenia", 'f', 22, 2, 8.0);

        Faculty f1 = new Faculty("Economic");
        Faculty f2 = new Faculty("Mathematics");
        f1.addStudentToFaculty(st1);
        f1.addStudentToFaculty(st2);
        f1.addStudentToFaculty(st3);
        f2.addStudentToFaculty(st4);
        f2.addStudentToFaculty(st5);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);

        //Вызовем всех студентов из facultyList:
        facultyList.stream().flatMap(faculty -> faculty.getStudentsOfFaculty().stream()).forEach(student -> System.out.println(student.getName()));



    }
}

class Faculty {
    String name;
    List<Student> studentsOfFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOfFaculty = new ArrayList<>();
    }

    public List<Student> getStudentsOfFaculty() {
        return studentsOfFaculty;
    }

    public void addStudentToFaculty(Student st){
        studentsOfFaculty.add(st);
    }
}
