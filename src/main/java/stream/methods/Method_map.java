package stream.methods;

import java.util.*;
import java.util.stream.Collectors;

public class Method_map {
    /** map() метод
     list.stream().map()
     он берет каждый из элементов коллекции или массива,
     потом лямбда выражения изменяет каждый из элементов
     и стрим возвращает измененную коллекцию

     !!!однако стрим не меняет старую коллекцию, необходимо приравнивать ее к новой коллекции!!!

     */
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Coconut");
        stringList.add("Peach");
        stringList.add("lemon");

        //Необходимо найти длину каждого слова:
//        for (int i = 0; i < stringTreeSet.size(); i++) {
//            stringTreeSet.set(i, String.valueOf(stringTreeSet.get(i).length()));
//        }
//        System.out.println(stringTreeSet);

        System.out.println("Исходный аррей лист: " + stringList);

        //Напишем то же самое с помощью стрима:
        //На выходе у нас должен быть тип данных Стринг, но получили Интеджер, поэтому приравниваем к новому листу
        //пишем collect(Collectors.toList()), чтобы преобразовать стрим в лист
        List<Integer> integerList = stringList.stream().map(element -> element.length()).collect(Collectors.toList());
        System.out.println("Измененный аррей лист: " + integerList);

        /**         метод map() для array         */

        //необходимо все элементы, которые делятся на 3 заменить на элемент/3
        int[] array = {10, 9, 4, 5, 6};
        System.out.println("Исходный аррей: " + Arrays.toString(array));
        array = Arrays.stream(array).map(element -> {
            if(element%3 == 0) {
                element = element/3;
            }
            return element;
        }).toArray();
        System.out.println("Измененный аррей: " + Arrays.toString(array));

        /**         метод map() для set       */

        Set<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("Banana");
        stringTreeSet.add("Orange");
        stringTreeSet.add("Coconut");
        stringTreeSet.add("Peach");
        stringTreeSet.add("lemon");

        Set<Integer> treeSetNew = stringTreeSet.stream().map(element -> element.length()).collect(Collectors.toSet());
        System.out.println("treeSetNew: " + treeSetNew);
        //или можно в другой тип коллекций сразу сделать:
        List<Integer> listFromTreeSet = stringTreeSet.stream().map(element -> element.length()).collect(Collectors.toList());
        System.out.println("listFromTreeSet: " + listFromTreeSet);
    }
}
