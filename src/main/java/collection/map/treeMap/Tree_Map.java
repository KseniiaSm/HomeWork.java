package collection.map.treeMap;

import java.util.Objects;
import java.util.TreeMap;

public class Tree_Map {
    /**
     TreeMap
     элементы: ключ-значение
     в TreeMap элементы хранятся в отсортированном по возратсанию массиве
     (сортировка по ключу)

     все элементы выводятся с ключами по возрастанию

     TreeMap - работает быстро, но не так быстро как HashMap

     основная цель использования:
     + найти ключ-значения в определенном отрезке (напр. больше скольки-то и меньше скольки-то)

     Значения могут быть не уникальными, но ключ - уникален
     Если ключ повторяется, то последнее значение будет перезаписано на его место и первая запись - удалится

     Если ключи - объекты (напр. типа Student), то необходимо имплементировать класс Comparable и переопределить метод
     CompareTo

     Основа TreeMap - красно-черное дерево, самобалансирующееся
     вверху будет ключ со средним значением, справа больше него, слева-меньше
     и от каждого тоже такие значения

     + скорость поиска за О(log n)
     */

    public static void main(String[] args) {
        TreeMap<Double,Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Masha", "S",5);
        Student st2 = new Student("Nastya", "L",1);
        Student st3 = new Student("Ksusha", "A",3);
        Student st4 = new Student("Tanya", "K",3);
        Student st5 = new Student("Katya", "B",5);
        Student st6 = new Student("Misha", "E",4);
        Student st7 = new Student("Olya", "S",2);
        treeMap.put(4.5,st1);
        treeMap.put(4.1,st7);
        treeMap.put(5.0,st2);
        treeMap.put(4.5,st5);
        treeMap.put(4.2,st4);
        treeMap.put(4.9,st6);
        treeMap.put(3.5,st3);
        System.out.println("TreeMap: " + treeMap);

        /**                       Методы                             */

        //1. Добавить значение - put()
        treeMap.put(3.5,st3);

        //2. Вызвать значение (вывести напр.) - get()
        System.out.println();
        System.out.println("Выведем студента с оценкой 5.0: " + treeMap.get(5.0));

        //3. Удалить ячейку с определенным ключом - remove()
        System.out.println();
        System.out.println("TreeMap: " + treeMap);
        System.out.println("Удалим студента с оценкой 3.5: ");
        treeMap.remove(3.5);
        System.out.println("TreeMap: " + treeMap);

        //4.Развернуть treemap по убыванию - descendingMap()
        System.out.println();
        System.out.println("4.Развернуть treemap по убыванию - descendingMap():");
        System.out.println(treeMap.descendingMap());

        //5. Найти значения с значением ключа больше значения - tailMap(), меньше определенного значения - headMap()
        System.out.println();
        System.out.println("5. Найти значения с значением ключа больше значения - tailMap(), меньше определенного значения - headMap()");
        System.out.println("Студенты со средним баллом более 4.5: " + treeMap.tailMap(4.5));

        //6. Последний элемент - lastEntry(), первый элемент - firstEntry()
        System.out.println();
        System.out.println("6. Последний элемент - lastEntry(), первый элемент - firstEntry()");
        System.out.println(treeMap.lastEntry()+ " последнее значение");
        System.out.println(treeMap.firstEntry() + " первое значение");














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

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, cours);
    }
}
