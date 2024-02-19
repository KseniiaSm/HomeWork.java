package stream.methods;
import java.util.stream.Stream;
public class Method_peak {
    /**
     Peak - то же самое, что и forEach, но на выходе - коллекция
     у forEach тип void
     (промежуточный метод)
     */
    public static void main(String[] args) {
        Stream<Integer> steam = Stream.of(1,2,3,4,5,1,2,3);
        // выделим только уникальные элементы, потом выведем их на экран и посчитаем их кол-во
        System.out.println(steam.distinct().peek(System.out::println).count());
    }
}
