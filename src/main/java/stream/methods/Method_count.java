package stream.methods;

import java.util.stream.Stream;

public class Method_count {
    //count - считает количество элментов в стриме. Возвращает тип данных - long
    //count - терминальный метод (конечный), после него нельзя промежуточные вызывать

    public static void main(String[] args) {
        Stream<Integer> strim1 = Stream.of(1,2,2,3);
        System.out.println("Количество элементов: " + strim1.count());

        //нельзя переиспользовать стрим еще раз (если он уже закрыт). Создадим еще один:
        Stream<Integer> strim2 = Stream.of(1,2,2,3);
        System.out.println("Количество уникальных элементов: " + strim2.distinct().count());
    }
}
