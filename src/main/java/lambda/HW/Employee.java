package lambda.HW;

import java.util.ArrayList;
import java.util.function.*;

public class Employee {
    String name;
    String department;
    double salary;

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

}

class TestEmployee {
    void printEmployee(Employee e) {
        System.out.println("Employee name: " + e.name +
                "; department: " + e.department +
                "; salary: " + e.salary);
    }

    void filteringOfEmployee(ArrayList<Employee> arrayListE, Predicate<Employee> empP) {
        for (Employee e : arrayListE) {
            if (empP.test(e)) {
                printEmployee(e);
            }
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Aleksey", "IT", 150);
        Employee emp2 = new Employee("Anastasiya", "D2", 200);
        Employee emp3 = new Employee("Evgeniy", "IT", 360);
        Employee emp4 = new Employee("Ksenia", "IT", 260);
        Employee emp5 = new Employee("Egor", "D1", 190);

        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(emp1);
        employeeArrayList.add(emp2);
        employeeArrayList.add(emp3);
        employeeArrayList.add(emp4);
        employeeArrayList.add(emp5);

        TestEmployee employeeT = new TestEmployee();

        System.out.println("Департамент работника - IT, зп>200");
        employeeT.filteringOfEmployee(employeeArrayList, (Employee e) -> {
            return e.department.equals("IT") && e.salary > 200;
        });
        System.out.println();
        System.out.println("Имя работника начинается на букву Е, зп не равна 450");
        employeeT.filteringOfEmployee(employeeArrayList, (Employee e) -> {
            return e.name.startsWith("E") && e.salary != 350;
        });
        System.out.println();
        System.out.println("Имя работника такое же как у департамента");
        employeeT.filteringOfEmployee(employeeArrayList, (Employee e) -> {
            return e.name.equals(e.department);
        });
    }


}


