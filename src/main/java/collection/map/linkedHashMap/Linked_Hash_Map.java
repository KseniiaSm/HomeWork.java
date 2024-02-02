package collection.map.linkedHashMap;

import java.util.LinkedHashMap;

public class Linked_Hash_Map {
    /**
     LinkedHashMap является наследником HashMap.
     Хранит информацию о порядке добавления элементов или порядке
     их использования.
     Производительность методов немного ниже, чем у методов HashMap

     + есть информация о соседях

     Для увеличения производительности, можно:
     1) задать начальный размер массива- Initial capacity
     2) Load factor - коэффициент заполненности массива, после достижения которого массив будет увеличен в 2 раза
     (тип данных float, не забудь про букву ф на конце)
     3)accessOrder:
               false - ничего не будет меняться
               true - при использовании элементов они передвигаются в конец списка


     */

    public static void main(String[] args) {
        LinkedHashMap<Double,String> linkedHashMap = new LinkedHashMap<>(16,0.75f,false);
        linkedHashMap.put(3.1,"Masha");
        linkedHashMap.put(5.0,"Katya");
        linkedHashMap.put(4.1,"Sasha");
        linkedHashMap.put(4.5,"Ksusha");
        linkedHashMap.put(3.6,"Larisa");

        //тут нет никакой сортировки, просто последовательно добавили
        System.out.println(linkedHashMap);
    }
}




