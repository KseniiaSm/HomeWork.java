package stream;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

public class Parallel_Stream {
    /**
     Parallel Stream - параллельные потоки
     это возможность использования нескольких ядер процессора при выполнении каких-либо операции со стрим

     метод используем если есть много одинаковых действий и очень много элементов
     (типа суммирование, умножение,...)
     но не используем, когда результат вычислений зависит от очередности вычислений
     (т.е для деления не используй)

     (напр.
     если необходимо в стриме уножить все числа от 1 - 100000,
     тогда при использовании Parallel Stream
     первый процессор умножит числа от 1 - 50000
     а второй от 50000 - 100000
     т.е. вся работа делится на кол-во процессоров

     Способы сделать стрим параллельным:
            1) Сделать стрим из готового листа:
              (вместо метода стрим вызываем метод parallelStream)
            2) Создать сразу параллельный стрим:
                Stream<T> s = Stream.of(значения);
                s.parallel()....;
     */

    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>();
        numbers.add(10.0);
        numbers.add(5.00);
        numbers.add(1.0);
        numbers.add(0.25);

        double sumResult = numbers.parallelStream().reduce((accum, element) -> accum+element).get();
        System.out.println("сумма:" + sumResult);
    }
}
