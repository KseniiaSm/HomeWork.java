package collection.set;

import java.util.Set;
import java.util.TreeSet;

public class Tree_Set {
    /**
     TreeSet - хранит элементы в отсортированном по возрастанию порядке.
     В основе лежит - TreeMap.
     У элементов данного TreeMap - ключи - это элементы TreeSet
     значения - это константа-заглушка

     null - нельзя хранить

     если нужно сравнивать объекты, то необходимо имплементировать
     Comparable и переопределить compareTo

     */

    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(10);
        treeSet.add(7);
        System.out.println(treeSet);

        /**        Методы (+ см TreeMap)            */
        //1. Вывести то, что выше значения headSet(), или ниже - tailSet(), или середину - subSet()
        System.out.println(((TreeSet<Integer>) treeSet).headSet(5));
        System.out.println(((TreeSet<Integer>) treeSet).subSet(5,7));


    }
}
