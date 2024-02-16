package stream;

import java.util.stream.Stream;

public class Method_concat {
    //Concat соединяет два стрима. Но его нельзя использовать в цепочке методов
    //(после него нельзя вызвать другой промежуточный метод

    public static void main(String[] args) {
        Stream<Integer> strim1 = Stream.of(1,2,2,3,5,6,70);
        Stream<Integer> strim2 = Stream.of(50,6,7,2,1,3);
        Stream<Integer> strim3 = Stream.concat(strim1,strim2);
        strim3.forEach(element -> System.out.println(element));
    }
}
