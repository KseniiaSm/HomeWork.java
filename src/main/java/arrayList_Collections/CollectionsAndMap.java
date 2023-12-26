package arrayList_Collections;

import java.util.HashMap;
import java.util.Map;

public class CollectionsAndMap {
    /**
     * Collections - это набор данных
     * <p>
     * Collections делится на:
     * <p>
     * 1.List (лист)
     * 1.1 ArrayList
     * abcd
     * + лист основан на массиве
     * + может содержать дублирующие элементы
     * + при добавлении элемента он идет в конец (если мы не задали обратное)
     * + ArrayList добавляет элементы по мере необходимости
     * 1.2 LinkedList
     * null <= a <=> b <=> c <=> d => null
     * + каждый элемент знает своего соседа
     * (+у первого элемента нет одного соседа и у последнего тоже
     * одного нет - null)
     * + чтобы найти нужный элемент джава пробежится по всему листу
     * - поиск элементов поэтому не такой быстрый как в аррейлисте
     * <p>
     * 2.Set (набор)
     * - не может содержать дублирующие друг друга элементы
     * 2.1 HashSet
     * 2.2 ThreeSet
     * <p>
     * 3. Queue (очередь)
     * 3.1 Queue (кто первый встал в очередь, тот первый и уйдет)
     * 3.2 Dequeue (кто последний втсал в очередь, тот первый уйдет)
     * <p>
     * <p>
     * *************************************
     * <p>
     * <p>
     * Map (карта) - key/value
     * + пара ключ - значение
     * - не относят к коллекциям
     * HashMap
     * ThreeMap
     */

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(777, "Ivanov");
        map.put(778, "Sidorov");
        map.put(779, "Petrov");
        System.out.println("map: " + map);
        map.put(779, "Carlos");
        //Если на этот же ключ добавить новое значение, то оно перезапишется
        System.out.println("map: " + map);
        //Дубликаты с точки зрения ключей быть не может

        //Удалить элемент:
        //для этого необходимо ввести ключ
        map.remove(777);
        System.out.println("map после удаления элемента: " + map);
    }


}