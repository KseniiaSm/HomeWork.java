package collection.list.classCollections_method_BinarySearch;

import java.util.ArrayList;
import java.util.Collections;

public class MethodsOfClassCollections {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(-10);
        arrayList.add(-22);
        arrayList.add(150);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(88);
        arrayList.add(4);
        arrayList.add(44);
        arrayList.add(12);

        //1. Отсортировать массив:
        System.out.println("1. Отсортировать массив:");
        System.out.println("Аррей лист до сортировки: " + arrayList);


        Collections.sort(arrayList);
        System.out.println("Аррей лист после сортировки: " + arrayList);

        //2.Отсортировать в обратном порядке:
        System.out.println();
        System.out.println("2.Отсортировать в обратном порядке:");
        System.out.println("Аррей лист до сортировки: " + arrayList);

        Collections.reverse(arrayList);
        System.out.println("Аррей лист после обратной сортировки: " + arrayList);

        //3.Перемешать значения:
        System.out.println();

        System.out.println("3.Перемешать значения:");
        System.out.println("Аррей лист до изменений: " + arrayList);

        Collections.shuffle(arrayList);
        System.out.println("Аррей лист после перемешивания: " + arrayList);

    }
}
