package collection.map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Hash_Map {
    /**
    1.1 HashMap:
    элементы: пара ключ-значение
                - не запоминает порядок добавления элементов
                   (все элементы будут перемешаны)
                +++ его методы работают очень быстро

     Правила:
     + значения и ключи могут быть null
     + ключи должны быть уникальными!!!
       (ключ первое значение при добавлении)
       если добавить два значения с одинаковыми ключами, то первый сотрется
     + ключи и значения могут быть любых типов данных, а также могут совпадать (по типу данных)
        напр., String-String

     */

    public static void main(String[] args) {
        //Создание HashMap (номер паспорта - ключ, ФИ - значение):
        Map<Integer,String> map1 = new HashMap<>();

        /**             Методы:                   */
        //1. Добавление элементов (put):
        System.out.println("1. Добавление элементов (put):");
        map1.put(1000, "Ksenia S");
        map1.put(5463, "Tatiana L");
        map1.put(3462, "Aleksey B");
        map1.put(5890, "Maria L");
        map1.put(2145, "Artem P");
        System.out.println("map1: " + map1);

        //2. Добавление элемента, если его нет (putIfAbsent):
        System.out.println("2. Добавление элемента, если его нет (putIfAbsent):");
        map1.putIfAbsent(3453,"Diana D");
        System.out.println("map1 с добавленным элементом: " + map1);

        //3. Вывести значение по  (get(ключ)):
        System.out.println("3. Вывести значение по  (get(ключ)):");
        System.out.println(map1.get(5890));

        //4. Удалить значение remove(ключ):
        System.out.println("4. Удалить значение remove(ключ):");
        map1.remove(1000);
        System.out.println("map1 без элемента Ксения с ключом 1000: " + map1);

        //5. Содержит ли HashMap определенное значение (.containsValue()) или ключ (.containsKey()) :
        System.out.println("5. Содержит ли HashMap определенное значение (.containsValue()) или ключ (.containsKey()):");
        System.out.println("Содержит ли map1 значение Diana D: " + map1.containsValue("Diana D"));

        //6. Вывести все ключи или значения, которые содержит HashMap (keySet()):
        System.out.println("6. Вывести все ключи или значения, которые содержит HashMap (keySet() или values()):");
        System.out.println(map1.keySet());
        System.out.println(map1.values());


    }
}
