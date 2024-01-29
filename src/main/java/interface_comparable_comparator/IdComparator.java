package interface_comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class IdComparator implements Comparator <Employee> {
    /**
     Разница интерфесов Comparator и Comparable в параметрах, но работают они одинаково

     то же самое, что и в классе Employee переопределяли в первый раз

     !!! Преимущество Comparator перед Comparable в том, что мы можем String отсортировать по колличеству букв или в другом порядке
     с помощью Comparable можно только по алфавиту
     */
    @Override
    public int compare(Employee emp1, Employee emp2) {
        if(emp1.id == emp2.id) {
            return 0;
        } else if (emp1.id < emp2.id) {
            return -1;
        } else {
            return 1;
        }
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
        Collections.sort(listOfEmployee);
        System.out.println("After sorting \n" + listOfEmployee);


    }

}
