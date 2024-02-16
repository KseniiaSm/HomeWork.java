package stream;

import java.util.stream.Stream;

public class Method_distinct {
    //Distinct - проверяет элементы с помощью метода equals() и
    // возвращает стрим уникальных элементов

    public static void main(String[] args) {
        Stream<Integer> strim1 = Stream.of(50,6,7,2,50);
        strim1.distinct().forEach(element -> System.out.println(element));
    }
}
