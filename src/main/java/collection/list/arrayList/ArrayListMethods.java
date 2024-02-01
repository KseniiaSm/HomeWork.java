package collection.list.arrayList;

import java.util.*;

/*
необходимо импортировать пакет для использования списочного массива
 */
public class ArrayListMethods {
    /**
     * ArrayList - списочный массив (также имеет нумерацию элементов и элементы могут повторяться
     * Массив - который может изменять свою длину
     * +не нужно указывать длину
     * Тип данных: Object (примитивы не используют в arrayList)
     * <p>
     * ArrayList можно создать так:
     * ArrayList <DataType> list1 = new ArrayList <DataType>();
     */
    public static void main(String[] args) {
        /**
         * ArrayList в который можно добавлять все типы данных в перемешку
         */
        ArrayList list = new ArrayList<>();

        list.add("Privet");
        Car car = new Car();
        list.add(car);
        Student student = new Student();
        list.add(student);


        /**
         * ArrayList в который можно добавлять только объекты одного типа данных
         * */
        ArrayList<String> list2 = new ArrayList<>(30);
        list2.add("Privet");
        /* При этом я не могу добавить объект типа Car
         * В скобках пишем вместимость, если необходимо
         * Есть понятие размер (сколько там объектов)
         * А есть понятие вместимость (максимально сколько можно поместить объектов)
         * ArrayList <String> list2 = new ArrayList<>(30);
         */

        ArrayList<String> list4 = new ArrayList<>(list2);
        /* Можно записать (list2)
         * это значит, что list4 ссылается на подобный лист, но не на тот же самый (с такой же вместимостью 30 */

        /** Можно записать через лист**/
        List<String> list3 = new ArrayList<>();

        /** Методы Списочного массива **/
        /**
         1. Добавление элемента .add(int номер элемента, "String");*/
        System.out.println(1);
        ArrayList<String> list5 = new ArrayList<>();
        list5.add("Privet");
        list5.add("Poka");
        System.out.println("list5: " + list5);
        list5.add(0, "Первый");
        System.out.println("list5: " + list5);

        /* Так делать нельзя, нельзя добавлять элементы слишком далеко (чтобы были пустые до него)
        list5.add(7,"ВосьмойЭлемент");
         */

        /**
         2. Вывести элемент .get(int номер элемента);*/
        System.out.println();
        System.out.println(2);
        System.out.println("Нулевой элемент листа5 " + list5.get(0));

        /**
         3. Заменить элемент .set(int номер элемента, "String");*/
        System.out.println();
        System.out.println(3);
        System.out.println("Лист5 до замены " + list5);
        list5.set(0, "ТеперьЯПервыйЭлемент");
        System.out.println("Лист5 после замены " + list5);

        /** Добавить в конец элемента что-то .append("String");*/
        StringBuilder sb1 = new StringBuilder("One");
        StringBuilder sb2 = new StringBuilder("Two");
        StringBuilder sb3 = new StringBuilder("Three");
        ArrayList<StringBuilder> sb = new ArrayList<>();
        sb.add(sb1);
        sb.add(sb2);
        sb.add(sb3);
        System.out.println(sb);
        /*        Вызвать размер листа с помощью метода size()         */
        for (int i = 0; i < list5.size(); i++) {
            sb.get(i).append("!!!");
        }
        System.out.println(sb);

        /**
         4. Удалить элемент .remove("Содержимое элемента (напр. стринг")
         или              .remove(int номер элемента)
         */
        System.out.println();
        System.out.println(4);
        System.out.println(list5);
        list5.remove(1);
        System.out.println(list5 + " после удаления первого элемента");

        list5.remove("Poka");
        System.out.println(list5 + " после удаления первого элемента Poka");

        /**
         !!!!!
         Это не работает если вписать содержимое объекта (т.е. если у нас есть стрингбилдер и мы вписываем
         в remove(его содержимое), то ничего не произвойдет
         необходимо вписать его имя!!!
         */
        System.out.println(sb);
        sb.remove("Two");
        System.out.println(sb + " ничего не произошло");
        System.out.println("А если вписать имя стрингБилдера, то удалится");
        sb.remove(sb2);
        System.out.println(sb + " все удалилось");

        /**
         5. Добавить в массив другой массив .addAll(имя массива, который надо вставить)
         или .addAll(int номер элемента куда,    имя массива, который надо вставить)
         */
        System.out.println();
        System.out.println(5);
        System.out.println(list5 + " list5");
        System.out.println(list2 + " list2");
        list5.addAll(list2);
        System.out.println(list5);
        /** Добавить не в конец, а в любое место
         * */
        list5.addAll(0, list2);
        System.out.println(list5);

        /**
         6. Очистить массив  .clear()
         */
        System.out.println();
        System.out.println(6);
        list5.clear();
        System.out.println(list5 + " list5 после очистки");

        /**
         7. Найти индекс элемента .indexOf("String");
         + .lastIndexOf("String") - последний индекс на котором найден данный элемент
         */
        System.out.println();
        System.out.println(7);
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Pineapple");
        int indexOfElement = fruits.indexOf("Banana");
        System.out.println(indexOfElement + " Banana");

        /*Для стрингБилдера так сделать нельзя (поиск по содержимому), а можно только по имени объекта*/
        System.out.println(sb);
        System.out.println(sb.indexOf("One!!!") + " по содержимому искать нельзя, так как это уже другой объект");
        System.out.println("А можно искать так: ");
        System.out.println(sb.indexOf(sb1) + " можно искать по имени объекта");

        /**
         8. Найти размер листа .size();

         9. Пустой ли лист isEmpty();
         */
        System.out.println();
        System.out.println(9);
        System.out.println(list2.isEmpty());

        /**
         10. Есть ли элемент .contains("String");
         */
        System.out.println();
        System.out.println(10);
        System.out.println(list2.contains("k"));

        /**
         11. Вывести на экран красиво .toString();
         */

        /**
         12. Склонировать лист в другой лист .clone(list2); (см ниже как клонировать)
         */
        System.out.println();
        System.out.println(12);
        ArrayList<StringBuilder> fruitALot = new ArrayList<>();
        StringBuilder apple = new StringBuilder("Apple");
        StringBuilder banana = new StringBuilder("Banana");
        StringBuilder pineapple = new StringBuilder("Pineapple");
        fruitALot.add(apple);
        fruitALot.add(banana);
        fruitALot.add(pineapple);

        //ArrayList <StringBuilder> cloneFruitALot = new ArrayList<>();

        //Необходимо так записать (по-другому не работает)
        ArrayList<StringBuilder> cloneFruitALot = (ArrayList<StringBuilder>) fruitALot.clone();
        System.out.println(cloneFruitALot.get(0));
        System.out.println(cloneFruitALot.get(0) == fruitALot.get(0)); // true
        System.out.println(cloneFruitALot == fruitALot); //false
        System.out.println(cloneFruitALot.equals(fruitALot)); //true

        /**
         13. Перевести в массив .toArray()
         */
        System.out.println();
        System.out.println(13);
        StringBuilder[] arrayFromFruitALot = fruitALot.toArray(new StringBuilder[3]);
        System.out.println(Arrays.toString(arrayFromFruitALot));

        /**
         14. Перевести массив в лист List
         */
        System.out.println();
        System.out.println(14);
        List<StringBuilder> listTypeList = Arrays.asList(arrayFromFruitALot);

        /**
         15. Отсортировать ArrayList
         Collections.sort(Имя аррейлиста <Тип данных>)
         */
        System.out.println();
        System.out.println(15);
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";
        ArrayList<String> list15 = new ArrayList<>();
        list15.add(s4);
        list15.add(s1);
        list15.add(s2);
        list15.add(s3);
        System.out.println(list15 + " List15 до сортировки");
        Collections.sort(list15);
        System.out.println(list15 + " List15 после сортировки");

        /**
         16. Равны ли ArrayList ы
         одинАррейЛист.equals(второйАррейЛист)
         */

        /**
         17. Compare - показывает какой массив больше или меньше по алфавиту или по списку цифр
         лексикографическое сравнение аррейЛистов
         как в словаре: сначала идет слово
         Привет
         Прививка потом (по алфавиту)
         также
         12345
         1235
         */
        System.out.println();
        System.out.println(17);
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 5};
        System.out.println(Arrays.compare(array1, array2));
        //Он вернет "-1" - если первый массив меньше второго (по алфавиту)
        //Он вернет "0" - если равны
        //Он вернет "1" - если второй массив меньше первого (по алфавиту)

        char[] array3 = {'P', 'r', 'i', 'v', 'e', 't'};
        char[] array4 = {'P', 'r', 'i', 'v', 'i', 'v', 'k', 'a'};
        System.out.println(Arrays.compare(array3, array4));
        //-4 так как первый меньше чем второй

        /**
         18. Mismatch - показывает индекс первого расхождения массивов
         лексикографическое сравнение аррейЛистов
         -1    - если массивы одинаковые
         или
         индекс первого расхождения массивов
         */
        System.out.println();
        System.out.println(18);
        System.out.println(Arrays.mismatch(array1, array2));
        System.out.println(Arrays.mismatch(array3, array4));
    }
}

class Car {
}

class Student {
}
