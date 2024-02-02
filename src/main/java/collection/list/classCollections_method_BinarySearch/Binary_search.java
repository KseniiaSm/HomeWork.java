package collection.list.classCollections_method_BinarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Binary_search {
    /**
     binarySearch - только для отсортированного массива
     + если нам нужен номер в отсортированном массиве
     (в неотсортированном бесполезно его использовать)

     Сущность работы метода binarySearch:
     1. Все данные сортируют по возрастанию
     2. Делят на 2 части
     3. Если наше искомое значение меньше значения в середине (которое делит на 2 части),
     то идем в правую часть, если больше, то в левую

     !!!затем опять делим нужную частичку пополам
     если не нашли, то нужную частичку опять пополам

     такой поиск значительно быстрее, чем перебирать все элементы по порядку
     напр. если у нас 1000 элементов и мы ищем элемент, который стоит на 999 позиции,
     то этот метод в разы быстрее, чем перебор

     напр., {30, 10, 0, -10, -5, 3, 100, 150}
     мы ищем 100
     перебором будет просмотрено 7 элементов,а так:

     1 этап: {-10, -5, 0, 3, 10, 30, 100, 150}
     2 этап: {-10, -5, 0, 3} {10, 30, 100, 150}
     3 этап: 100 больше 10, идем на право
     4 этап: делим нужную частичку еще пополам
     {{10, 30} {100, 150}}
     находим наше значение
     */

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-10);
        arrayList.add(-22);
        arrayList.add(150);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(88);
        arrayList.add(4);
        arrayList.add(44);
        arrayList.add(12);

        int indexWithoutSort = Collections.binarySearch(arrayList,12);
        System.out.println(indexWithoutSort + " - ошибочный индекс до сортировки");
        //Обязательно отсортировать!!!! или будет отрицательное значение (ошибка)
        Collections.sort(arrayList);
        int index = Collections.binarySearch(arrayList,12);
        System.out.println(index + " - индекс в новом отсортированном массиве");

        System.out.println();
        System.out.println("Пример номер 2:");
        /**
         Чтобы использовать binarySearch для поиска объектов, необходимо переопределить метод Comparable
         так как без него мы не сможем отсортировать => найти объект
         class Employee implements Comparable<Employee>
         */
        Employee emp1 = new Employee(100,"Masha", 7839);
        Employee emp2 = new Employee(155,"Kolya", 839);
        Employee emp3 = new Employee(182,"Ksusha", 3339);
        Employee emp4 = new Employee(15,"Lena", 9039);
        Employee emp5 = new Employee(250,"Vika", 7877);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        System.out.println("Лист employee: \n" + employeeList);
        Collections.sort(employeeList);
        System.out.println("Лист employee после сортировки: \n" + employeeList);
        int indexOfEmployee_15Kolya = Collections.binarySearch(employeeList,new Employee(155,"Kolya",0));
        System.out.println("Номер Коли в отсортированном листе: " + indexOfEmployee_15Kolya);
        //Мы ведем поиск по ID и name, поэтому не важно задавать правильную ЗП (можно любое число вписать)
    }
}

class Employee implements Comparable<Employee>{
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmployee) {
        int result = this.id - anotherEmployee.id;
        if(result == 0){
            result = this.name.compareTo(anotherEmployee.name);
        }
        return result;
    }
}
