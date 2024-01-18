package lambda;

import java.util.ArrayList;
import java.util.List;

public class SomeMethodsLambda {
    public static void main(String[] args) {

        /**
                  Вывод на экран с помощью ламбда выражений:
         */
        List<String> list = List.of("privet", "poka", "kak dela?");
        for (String s:list) {
            System.out.println(s);
        }
        /**
         Или то же самое с помощью лямбда выражений:
         */
        System.out.println("С помощью лямбда выражений: ");
        list.forEach(s-> System.out.println(s));


        /**
                  Удаление из arrayList определенных значений:
         */
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(7);
        al.add(3);
        al.add(5);
        al.add(6);
        al.add(8);
        al.add(2);
        al.add(4);
        al.removeIf(element->element%3 == 0);
        System.out.println(al);

        /**
         Сортировка arrayList определенных значений:
         */
        al.sort((x,y)->x.compareTo(y));
        System.out.println(al);
        //Сортировка в обратном порядке:
        al.sort((x,y)->-x.compareTo(y));
        System.out.println(al + " Сортировка аррейлиста в обратном порядке");


    }
}
