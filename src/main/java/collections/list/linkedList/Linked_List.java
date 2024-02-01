package collections.list.linkedList;

import java.util.LinkedList;

/**
 Элементы LinkedList (связанный список) - это звенья одной цепочки.
 Элементы хранят данные, а также ссылки (адрес) на предыдущий и следующий элементы.

 Элементы знают своих соседей:
 Элемент1 <=> Элемент2 <=> Элемент3 <=> Элемент4 => null

 Элемент4 ссылается на null, т.е. это хвост (tail).
 Если элемнт ссылается на null, то линкед лист понимает, что это хвост.
 Элемент4 имеет адрес хвоста.

 Элемент1 тоже ссылается на null, т.е. это голова (head).
 Элемент1 имеет адрес головы.

 При поиске элемент происходит перебор всех последовательных соседей.
 Напр., если нужен 200 элемент, то необходимо "пробежаться" по всем элементам от 0 до 200.
 Потому что элементы не знают где 200элемент, а знают только своих соседей.

 При изменении одного из элементов или при добавлении элемента, происходит только изменение ссылок соседних элементов
 (т.е. это затрагивает только сам элемент и двух его соседей, остальной же линкед лист остается постоянным)

 По-сравнению с аррей листом, где при добавлении одного элемента меняется весь лист, что требует бОльшего времени.
 В линкед листе все эти изменения очень быстрые и не затратные.

 Плюсы и минусы LinkedList:
 + Если мы меняем, удаляем, вставляем элементы, то его выгодно использовать.
   (Особенно если много этих операций в начале листа)
 - Если мы делаем часто поиск по листу, то использовать лучше ArrayList

 */
public class Linked_List {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 3);
        Student st2 = new Student("Nikolay", 2);
        Student st3 = new Student("Elena", 1);
        Student st4 = new Student("Petr", 4);
        Student st5 = new Student("Mariya", 3);

        /**
         Создание линкед листа:
         */

        LinkedList<Student> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(st1);
        studentLinkedList.add(st2);
        studentLinkedList.add(st3);
        studentLinkedList.add(st4);
        studentLinkedList.add(st5);
        System.out.println("LinkedList: " + studentLinkedList);
    }
}

class Student{
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
