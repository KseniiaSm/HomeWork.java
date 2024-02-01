package collection.list.arrayList;

import java.util.ArrayList;

public class ArrayListCreation {
    /**
     ArrayList используем тогда, когда не знаем какое количество элементов будет в нем
     + В основе лежит массив Object

     Способы задания arrayList:
     */

    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();

        //Можно задать вместимость:
        ArrayList<String> arrayList2 = new ArrayList<>(200);

        //Можно в один arrayList вставить другой, при этом они не будут равны, просто будут включать одинаковые объекты
        ArrayList<String> arrayListSmall = new ArrayList<>();
        arrayListSmall.add("Hi");
        arrayListSmall.add("Hello");
        System.out.println(arrayListSmall + " маленький аррей лист");

        ArrayList<String> arrayList3 = new ArrayList<>(arrayListSmall);
        System.out.println(arrayList3 + " новый большой аррей лист");
        arrayList3.add("Banana");
        System.out.println(arrayList3 + " новый большой аррей лист c доп.элементами");
    }

}
