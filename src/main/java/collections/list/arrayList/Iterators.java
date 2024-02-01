package collections.list.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterators {
    public static void main(String[] args) {
        /** Iterators (Итераторы) - "повторитель"
         * с помощью них мы можем пробежаться по элементам листа
         * для этого необходимо импортировать:
         * import java.util.Iterator;

         Итератор очень похож на foreach loop, но основное отличие:
         +++   мы можем удалять с его помощью элементы !!!

         */

        ArrayList<String> list = new ArrayList<>();
        list.add("Cat");
        list.add("Leon");
        list.add("Elephant");
        list.add("Monkey");

        //Создание итератора
        Iterator<String> it = list.iterator();
        //пока (есть следующий элемент итератора)
        /*
        while (it.hasNext()) {
            //выводим его на экран
            System.out.println(it.next());
        }
        тут я закомментировала, чтобы следующий метод сработал
         */
        //Вывели элементы аррейлиста на экран

        //C помощью итератора можно удалить элементы
        while (it.hasNext()) {
            it.next(); //это обязательная строка (если мы не получили элемент, то мы с ним ничего не можем сделать
            it.remove();
        }
        System.out.println(list);
    }

}
