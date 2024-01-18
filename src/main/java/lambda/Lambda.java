package lambda;

import java.util.ArrayList;

public class Lambda {
}

class Student{
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    Student (String name, char sex, int age, int course, double avgGrade){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}
//Интерфейс при использовании лямбда выражений может иметь только один АБСТРАКТНЫЙ метод!!!
//это функциональный интерфейс
//может иметь дефолтные и статические методы (много)
interface StudentChecks{
    boolean test(Student1 s);
}

class StudentInfo{
    //Метод для красивой распечатки студента
    void printStudent(Student1 st){
        System.out.println("Student's name: " + st.name +
                           " sex: " + st.sex + " age: " + st.age +
                           " course: " + st.course + " average grade: " + st.avgGrade);
    }
    //Метод для сортировки студентов по определенному признаку
    //Сортируем студентов в списочном массиве
    //на всход идет списочный массив и объект интерфейса

    //Метод проверяет подходит ли объект sc под условия фильтрации интерфейса, использую метод test

    void testStudents(ArrayList<Student1> aL, StudentChecks sc){
        for (Student1 s:aL) {
            if(sc.test(s)){
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

        //Люмбда выражения позволяют не создавать класс, имплементирующий интерфейс
        //не нужно переопределять метод test
        //мы его сразу будем "перезаписывать, дополнять" в лямбда выражении
        //Лямбда выражения очень похожи на переопределения метода, записанного в функциональном интерфейсе

        //объект класса. метод тест (arrayList, (объект класса) -> {return условие;});
        System.out.println("Студенты с оценкой больше 8.5: ");
        si.testStudents(listOfStudents, (Student1 st) -> {return st.avgGrade>8.5;});
        //(параметр метода) -> {return условие (тело метода)}) - это как бы перезаписанный вариант метода тест
        System.out.println();
        System.out.println("Студенты с оценкой меньше 8: ");
        si.testStudents(listOfStudents, (Student1 st) -> {return st.avgGrade<8;});
        System.out.println();
        System.out.println("Студенты возрастом больше 25: ");
        si.testStudents(listOfStudents, (Student1 st) -> {return st.age>25;});
        System.out.println();
        System.out.println("Студенты с возрастом меньше или равно 25: ");
        si.testStudents(listOfStudents, (Student1 st) -> {return st.age<=25;});
        System.out.println();
        System.out.println("Студенты - женщины: ");
        si.testStudents(listOfStudents, (Student1 st) -> {return st.sex == 'f';});
        System.out.println();
        System.out.println("Студенты - мужчины: ");
        si.testStudents(listOfStudents, (Student1 st) -> {return st.sex == 'm';});
        System.out.println();
        System.out.println("Студенты с оценкой более 8.5, женщины, старше 1 курса: ");
        si.testStudents(listOfStudents, (Student1 st) -> {return (st.avgGrade>8.5 && st.sex == 'f' && st.course>1);});

        //Возможен короткий способ записи лямбда-выражения:
        //!!!!здесь доступен только одно условие
        System.out.println();
        System.out.println("Возможен короткий способ записи лямбда-выражения: ");
        System.out.println("Студенты первого курса: ");
        si.testStudents(listOfStudents, st -> st.course == 1);

    }

}


