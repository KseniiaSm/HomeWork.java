package collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedList_implements_Queue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        /**         Методы          */

        //1. add - добавление элемента (при ограниченной длине очереди, будет ошибка при заполнении ее)
        queue.add("Masha");
        queue.add("Tanya");
        queue.add("Nastya");
        queue.add("Arina");
        queue.add("Ksusha");
        System.out.println(queue);

        //1.2. offer - добавление элемента (при ограниченной длине очереди, не будет ошибки при ее заполнении,
        // элемент просто не добавится)
        queue.offer("Larisa");

        //2. remove() - удаляется элемент (из начала очереди), но если элементы закончатся, то будет ошибка
        System.out.println("Исходная очередь: " + queue);
        queue.remove();
        System.out.println("Очередь после удаления одного элемента" + queue);

        //2.1 poll() - удаляет элементы, если они кончились, то ошибки нет
        queue.poll();
        System.out.println(queue);

        //3. element() - показывает какой элемент на 1 месте, дает ошибку, если элементы кончились
        System.out.println(queue.element() + " - первый элемент");

        //3.1 peek() - показывает 1 элемент, выдает null, если элементов нет
        System.out.println(queue.peek());







    }
}
