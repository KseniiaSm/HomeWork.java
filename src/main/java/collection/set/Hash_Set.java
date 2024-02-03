package collection.set;

import java.util.HashSet;
import java.util.Set;

public class Hash_Set {
    /**
     Основа HashSet - это урезанная HashMap, которая имеет только ключи,
     а вместо значений - "заглушка"(какая-то константа)

     HashSet не запоминает порядок добавления элементов, так же как HashMap


     */

    public static void main(String[] args) {
        Set<String> setOfNames = new HashSet<>();
        setOfNames.add("Ksenia");
        setOfNames.add("Masha");
        setOfNames.add("Nastya");
        setOfNames.add("Tanya");
        setOfNames.add("Vika");
        //не содержит дубликатов:
        setOfNames.add("Vika");

        //HashSet не хранит элементы в порядке добавления
        System.out.println(setOfNames);

        /**        Методы         */

        //1. Добавить - add
        setOfNames.add("Nikita");

        //2. Удалить - remove()
        setOfNames.remove("Ksenia");

        //3. Узнать размер - size()
        System.out.println(setOfNames.size() + " - размер HashSet");

        //4. Пустой ли? - isEmpty()

        //5. Есть ли элемент? - contains()

        //6. Объединить 2 HashSeta: - addAll
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(5);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        set1.addAll(set2);
        System.out.println(set1);

        //7. Найти (удалить )общие элементы - retainAll
        //нужно именно так делать
        Set<Integer> theSameElements = new HashSet<>(set2);
        theSameElements.retainAll(set1);
        System.out.println(theSameElements + " - их общие элементы");

        //8. Найти (удалить) разные элементы - removeAll()
        Set<Integer> set3 = new HashSet<>();
        set3.add(1);
        set3.add(2);
        set3.add(5);

        Set<Integer> set4 = new HashSet<>();
        set4.add(1);
        set4.add(2);
        set4.add(7);
        //обязательно отдельной строкой надо записать
        set3.removeAll(set4);
        System.out.println(set3 + " - разные элементы set3 и set4");








    }


}
