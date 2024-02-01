package collection.Big_O_notation;

public class Big_O_notation {
    /**
     Big O notation - показывает разницу во времени при поиске информации в коллекции
     +всегда рассматривает худший вариант (т.е. самый долгий, как будто наш элемент стоит в конце списка)

     (напр., есть ли разница при выводе 1го элемента из коллекции {1,5,20} и
     1000го элемента в коллекции из 80000 элементов)

     O(1) - сложность порядка 1
     или алгоритм выполняется за постоянное (константное) время
     О(1) - самый быстрый
     + вне зависимости от количества элементов в ArrayListe метод get будет работать одно и то же время
     + количество шагов и время, затраченное на вывод элемента get(5) и get(100), будут одинаковы

     О(n) - линейный алгоритм - этот алгоритм линейно масштабируется
     чем больше элементов в массиве, тем больше времени необходимо на поиск элемента

     O(log n) - логарифмическая сложность
     (хуже чем О(1), но лучше, чем О(n))


     Array and ArrayList:
     О(1) для int
     Метод get(номер элемента) для Array and ArrayList выполняется с постоянной скоростью,
     так как он не перебирает все элементы, а просто просчитывает, где в памяти лежит нужная ячейка
     O(1) - при удалении с конца массива

     О(1) - Для ссылочных типов данных напр. String
     Array and ArrayList не содержат сами объекты, а содержат только ссылки на объекты
     O(1) - при удалении с конца массива

     O(n) для ArrayList
     - при добавлении элемента(ов) в конец или в середину, потому что массив при этом меняется
     - при удалении элемента из середины массива, так как все сместится
     !!! + но O(1) - при удалении с конца массива



     LinkedList
     O(n) - при добавлении элемента в середину
     O(n) - при удалении элемента
     О(1) - при добавлении элемента в начало листа

     */
}
