package collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque_arrayDeque {
    /**
     Deque - double ended queue - двунаправленная очередь (работают правила LIFO FIFO последний зашел первый вышел и первый зашел первый вышел)

     Если в обычной очереди можно добавить (удалять, использовать )элементы только в конец, то
     в Deque можно добавлять (удалять, использовать) элементы как в начало, так и в конец очереди

     Интерфейс Deque может реализоваться классами LinkedList и ArrayDeque.
     */

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        /**         Методы         */

        /*
        1. Добавление элемента (без учета переполнения deque, если задана вместимость) при переполении будет ошибка
                 1.1 addFirst
                 1.2 addLast
        2. Добавление элемента (с учетом переполнения deque, если задана вместимость)
                 2.1 offerFirst
                 2.2 offerLast
        */

        deque.addFirst(10);
        deque.offerFirst(5);
        deque.offerLast(7);
        deque.offerFirst(1);
        System.out.println(deque);

        /*
        3. Удаление элемента (без учета достижения пустоты), если нечего удалить,то будет ошибка
                 1.1 removeFirst
                 1.2 removeLast
        4. Удаление элемента (c учетом достижения пустоты)
                 2.1 pollFirst
                 2.2 pollLast
        */

        /*
        5. Выдать элемент (без учета достижения пустоты), если нечего дать,то будет ошибка
                 1.1 getFirst
                 1.2 getLast
        6. Выдать элемент (с учетом достижения пустоты)
                 2.1 peekFirst
                 2.2 peekLast
        */



    }

}
