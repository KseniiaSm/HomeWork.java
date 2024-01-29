package interface_comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable_Comparator {
    /**
     Интерфейсы Comparable и Comparator - позволяют сравнивать объекты.
     Позволяют узнать, какой объект больше, какой объект меньше, чтобы мы смогли сортировать
     эти объекты в коллекции или массиве.
     */

    public static void main(String[] args) {
        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("Zaur");
        listOfNames.add("Ivan");
        listOfNames.add("Maria");
        System.out.println("Лист до сортировки: " + listOfNames);
        Collections.sort(listOfNames);
        System.out.println("Лист после сортировки: " + listOfNames);

        //Тут все логично, отсортировалось по алфавиту
        //Как отсортировать, если у нас объеткы различных типов?
    }



}
