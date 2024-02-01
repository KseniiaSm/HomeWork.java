package collections.list.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {
    /**
     * List - это не изменяемая структура
     * <p>
     * Если убрать тип данных в листе (<String> напр.), то тип данных станет Object
     * и могут возникнуть проблемы, которые не заметит компилятор
     */


    public static void main(String[] args) {
        /**
         1. Удалить все элементы в массиве, которые есть в другом массиве
         .removeAll(ArrayList)
         */
        System.out.println(1);

        ArrayList<String> bigArrayList = new ArrayList<>();
        bigArrayList.add("One");
        bigArrayList.add("Two");
        bigArrayList.add("Three");
        bigArrayList.add("Four");
        bigArrayList.add("Five");
        System.out.println(bigArrayList + " bigArrayList");

        ArrayList<String> smallArrayList = new ArrayList<>();
        smallArrayList.add("Three");
        smallArrayList.add("Five");
        smallArrayList.add("Ten");
        System.out.println(smallArrayList + " smallArrayList");

        bigArrayList.removeAll(smallArrayList);
        System.out.println(bigArrayList + " bigArrayList после применения метода removeAll");

        /**
         2. Сохранить только элементы, которые есть в другом массиве
         .retainAll(ArrayList)
         */
        System.out.println();
        System.out.println(2);

        ArrayList<String> bigArrayList2 = new ArrayList<>();
        bigArrayList2.add("One");
        bigArrayList2.add("Two");
        bigArrayList2.add("Three");
        bigArrayList2.add("Four");
        bigArrayList2.add("Five");
        System.out.println(bigArrayList2 + " bigArrayList2");

        ArrayList<String> smallArrayList2 = new ArrayList<>();
        smallArrayList2.add("Three");
        smallArrayList2.add("Five");
        smallArrayList2.add("Ten");
        System.out.println(smallArrayList2 + " smallArrayList2");

        bigArrayList2.retainAll(smallArrayList2);
        System.out.println(bigArrayList2 + " bigArrayList2 после применения метода retaintAll");

        /**
         3. Содержит ли массив все элементы, которые есть в другом массиве
         .containsAll(ArrayList)
         */
        System.out.println();
        System.out.println(3);

        ArrayList<String> bigArrayList3 = new ArrayList<>();
        bigArrayList3.add("One");
        bigArrayList3.add("Two");
        bigArrayList3.add("Three");
        bigArrayList3.add("Four");
        bigArrayList3.add("Five");
        System.out.println(bigArrayList3 + " bigArrayList3");

        ArrayList<String> smallArrayList3 = new ArrayList<>();
        smallArrayList3.add("Three");
        smallArrayList3.add("Five");
        smallArrayList3.add("Ten");
        System.out.println(smallArrayList3 + " smallArrayList3");

        boolean containsElements = bigArrayList3.containsAll(smallArrayList3);
        System.out.println(containsElements + " содержит ли все элементы маленького массива?");

        /**
         4. Кусок ArrayList - но возвращает уже List !!!!!!
         .sublist(index начала, index конца) => List
         */
        System.out.println();
        System.out.println(4);

        System.out.println(bigArrayList3 + " bigArrayList3");
        List<String> sublist = bigArrayList3.subList(2, 4); // 4 - не включительно
        System.out.println(sublist + " sublist");

        /**
         5. List !!!!!!
         Быстро создать List
         List.of(элементы)
         List <String> list = List.of("One", "Two", "Three");
         */
        System.out.println();
        System.out.println(5);

        List<String> list = List.of("Raz", "Dva", "Tri");
        System.out.println(list + " list");
        //!!!Лист потом никак не изменить!!!

        /**
         6. List !!!!!!
         Скопировать в List
         List.copyOf(элементы)
         */
        System.out.println();
        System.out.println(6);

        List<String> list2 = List.copyOf(list);
        System.out.println(list2 + " list2 скопированный");
        //!!!Лист потом никак не изменить!!!


    }

}
