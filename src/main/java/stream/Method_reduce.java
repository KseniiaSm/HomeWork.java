package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Method_reduce {
    /**
     reduce - уменьшить -
     Уменьшаем все элементы до 1 элемента!!!
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(10);

        /**         1 вариант использования:         */
        int result = list.stream().reduce((accumulator, element) -> accumulator * element).get();
        //accumulator - это что-то типа sum (то где хранится сначала промежуточная сумма/произведение
        // при сложении/умножении
        // т.е. происходит 5*3*2*1*10 напр:
        //accumulator   5  15  30  30  300
        //element       3  2   1   10
        System.out.println(result);

        //но если в листе есть null, то будет ошибка, поэтому пишем так:
        Optional<Integer> optional = list.stream().reduce((accumulator, element) -> accumulator * element);
        if(optional.isPresent()) {
            System.out.println(optional.get());
        } else {
            System.out.println("Not present");
        }

        /**         2 вариант использования:         */
        int result2 = list.stream().reduce(1, (accumulator, element) -> accumulator * element);
        // цифра 1 позволяет нам не писать get() и мы точно не получим null
        System.out.println(result2);

        List<String> stringList = new ArrayList<>();
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Coconut");
        stringList.add("Peach");
        stringList.add("lemon");

        String result3 = stringList.stream().reduce((accumulator, element) -> accumulator +" "+ element).get();
        System.out.println(result3);
    }
}
