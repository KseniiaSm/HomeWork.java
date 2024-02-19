package stream;

import stream.methods.Student;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 Stream используется для сокращения размера кода
 упростить работу с данными (напр. операции фильтрации, сортировки), работу с коллекциями или массивами

 Stream - это последовательность элементов, поддерживающих последовательные или параллельные
 операции над ними.
 Stream - это поток данных, которые содержит коллекция

 Stream позволяют писать код в функциональном стиле (используя лямбда выражения)

 При этом мы работаем с коллекциями не на прямую, а преобразуя их в потоки (Streams)

 Стримы не меняют старую коллекцию, поэтому ее нужно приравнивать к другой новой коллекции
  */
public class Streams {
    //Создание стрима с нуля (минуя стадию создания массива или коллекции)
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 19, 1, 8.9);
        Student st2 = new Student("Dmitrii", 'm', 30, 5, 8.2);
        Student st3 = new Student("Maria", 'f', 18, 1, 7.5);
        Student st4 = new Student("Nikolay", 'm', 25, 4, 6.9);
        Student st5 = new Student("Ksenia", 'f', 22, 2, 8.0);

        Stream<Student> myStream = Stream.of(st1,st2,st3,st4,st5);

        //и можно сразу вызывать методы:
        List<Student> studentList = myStream.filter(element -> element.getSex() == 'f').collect(Collectors.toList());
        System.out.println(studentList);
    }
}
