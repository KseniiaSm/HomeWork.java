package collection.list.iterator;

import java.util.LinkedList;
import java.util.ListIterator;

public class List_Iterator {
    /**

     Интерфейс ListIterator - расширяет возможности Iteratora(который мог работать только с следующим элементом)
     Данный Интерфейс ListIterator может работать как с следующим элементом, так и с предыдущим.

     hasPrevious()
     previous()
     */

    public static void main(String[] args) {
        /**
         Задача: проверить одинаково ли пишется слово с право на лево и с лево на право (напр., Мадам == мадаМ)
         */
        String s = "madam";

        LinkedList<Character> letters = new LinkedList<>();
        for(char ch : s.toCharArray()){
            letters.add(ch);
        }

        ListIterator<Character> listIterator = letters.listIterator();
        ListIterator<Character> listIteratorRevers = letters.listIterator(letters.size());

        boolean isTheSame = true;

        while (listIterator.hasNext() && listIteratorRevers.hasPrevious()){
            if(listIterator.next() != listIteratorRevers.previous()) {
                isTheSame = false;
                break;
            }
        }

        if(isTheSame){
            System.out.println("Это слово одинаково пишется с право на лево и с лево на право");
        } else {
            System.out.println("Это слово по-разному пишется с право на лево и с лево на право");
        }
    }


}
