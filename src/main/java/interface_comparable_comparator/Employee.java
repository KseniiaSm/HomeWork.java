package interface_comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 Interface Comparable - используется для сравнения объектов с использованием естественного порядка
 (по алфавиту, по возрастанию чисел)
 */
public class Employee implements Comparable<Employee> {
    int id;
    String name;
    String surname;
    int salary;
    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public static void main(String[] args) {
        List<Employee> listOfEmployee = new ArrayList<>();
        Employee emp1 = new Employee(100, "Zaur", "Tregulov", 12345);
        Employee emp2 = new Employee(15, "Ivan", "Petrov", 6542);
        Employee emp3 = new Employee(123, "Ivan", "Sidorov", 8542);
        listOfEmployee.add(emp1);
        listOfEmployee.add(emp2);
        listOfEmployee.add(emp3);
        System.out.println("Before sorting \n" + listOfEmployee);
        // Отсортировать невозможно просто так
        //Collections.sort(listOfEmployee);

        /**
         Тогда мы пишем, что наш класс имплементирует (реализовывает) интерфейс Comparable:
         Employee implements Comparable<Employee>
         данный интерфейс имеет только один метод:

         @Override public int compareTo(Employee o) {
         return 0;
         }

         мы должны его переопределить

         обычно пишут:
         return 1; - если объект this (Текущий объект) > о (объект в скобках)
         return -1; this<o
         return 0; - this равен о

         сравниваем по 1 параметру только:

         @Override public int compareTo(Employee anotherEmp) {
         if(this.id == anotherEmp.id) {
         return 0;
         } else if (this.id < anotherEmp.id) {
         return -1;
         } else {
         return 1;
         }
         }
         Теперь при сравнении нет проблем:
         */
        Collections.sort(listOfEmployee);
        System.out.println("After sorting \n" + listOfEmployee);


    }

    @Override
    public String toString() {
        return "Employee {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    /*
        @Override
        public int compareTo(Employee anotherEmp) {
            if(this.id == anotherEmp.id) {
            return 0;
            } else if (this.id < anotherEmp.id) {
                return -1;
            } else {
                return 1;
            }
        }
     */

    /*
    Или можно так:
    @Override
    public int compareTo(Employee anotherEmp) {
       return this.id - anotherEmp.id;
    }
    */

    /*
    Если нужно сравнить String параметр:
    @Override
    public int compareTo(Employee anotherEmp) {
        return this.name.compareTo(anotherEmp.name);
    }
    */

    /*
    Если имена одинаковые, то сравним фамилии:
     */
    @Override
    public int compareTo(Employee anotherEmp) {
        int result = this.name.compareTo(anotherEmp.name);
        if(result == 0){
            result = this.surname.compareTo(anotherEmp.surname);
        }
        return result;
    }

}
