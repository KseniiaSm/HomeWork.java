package collection.queue;

public class PriorityQueue {
    /**
     PriorityQueue отличается от обычной очереди тем, что у нее есть сортировка
     или по натуральному порядку или
     необходимо реализовать метод CompareTo (если в очереди объекты)

     PriorityQueue - это специальный вид очереди, в котором используется натуральная
     сортировка или та, которую мы описываем с помощью Comparable или Comparator
     Таким образом, используется тот элемент из очереди, приоритет которого выше.

     !!! если используешь объекты класса, то не забудь переопределить compareTo
     */

    public static void main(String[] args) {
        java.util.PriorityQueue<Integer> priorityQueue = new java.util.PriorityQueue<>();
        priorityQueue.add(10);
        priorityQueue.add(5);
        priorityQueue.add(20);
        priorityQueue.add(2);
        priorityQueue.add(1);
        priorityQueue.add(11);
        //когда выводим на экран priorityQueue, то он не имеет натуральной сортировки
        System.out.println("priorityQueue" + priorityQueue);

        //Удаляться они будут по возрастанию, т.е. сначала 1 2 5 10 11 20
        //Другие методы тоже будут использовать элементы по возрастанию
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());


    }
}
