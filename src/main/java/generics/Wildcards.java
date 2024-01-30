package generics;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {
    /**
     Wildcard название пришло из покера и обозначает супер сильную карту.

     из TYPE_ERASURE мы знаем, что так писать нельзя:
     List <Number> listOne = new ArrayList<Integer>();

     а можно так:
     List <?> listOne = new ArrayList<Integer>();

     <?> - Wildcard
     здесь может быть любой тип данных
     знак вопроса в generics означает, что вместо вопроса можно подставить абсолютно любой класс

     - !!! если мы используем wildcards, то мы не можем вызывать методы, которые изменяют объект
     */

    public static void main(String[] args) {
        List <?> listOne = new ArrayList<String>();
        /*
        listOne.add("Hello");
        в лист с wildcards нельзя добавить элементы
        так как компилятор не знает какой тип данных в листе

        !!! если мы используем wildcards, то мы не можем вызывать методы, которые изменяют объект (напр. метод add)
         */

        System.out.println(1);
        List<Double> list1 = new ArrayList<>();
        list1.add(3.13);
        list1.add(3.15);
        list1.add(3.20);
        showListInfo(list1);

        System.out.println();
        System.out.println(2);
        List<String> list2 = new ArrayList<>();
        list2.add("Hi");
        list2.add("Hello");
        list2.add("Good morning");
        showListInfo(list2);

        System.out.println();
        System.out.println(3);
        ArrayList<Double> list3 = new ArrayList<>();
        list3.add(3.13);
        list3.add(3.15);
        list3.add(3.20);
        System.out.println(summ(list3));
    }

    public static void showListInfo(List<?> list){
        System.out.println("Лист содержит следующие элементы: " + list);
    }

    //Пример
    public static double summ (ArrayList<? extends Number> al){
        double summ = 0;
        for(Number n: al){
            summ+=n.doubleValue();
        }
        return summ;
    }


}
