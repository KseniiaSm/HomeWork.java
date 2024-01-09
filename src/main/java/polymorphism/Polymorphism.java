package polymorphism;

public class Polymorphism {
    /** Перевод – множество форм
     * Полиморфизм – это способность объекта принимать несколько форм
     * Объект в джаве – считается полиморфным, если он имеет более 1 связи is-a (т.е. все объекты)

     * Полиморфизм – это способность метода вести себя по-разному в зависимости от того, объект
     * какого класса вызывает этот метод.

     * Например, объекты червяк и лев. Они имеют один метод – кушать.
     * Но этот метод ведет себя по-разному для них (червяк ест землю, а лев ест мясо)
     *
     * Overriding методы (перезаписанные) часто называют полиморфными
     */

    /**                         Оператор instanceof
     * instanceof - является ли объект объектом конкретного класса
     Car c = new Car();
     System.out.print(c instanceof Object);

     Оператор instanceof проверяет, есть ли связь между объектом
     и классом/интерфейсом связь is-A. Если связь is-A невозможна
     то компилятор выдает ошибку.

     */

}

class Test1{
    public static void main(String[] args) {
        Employee1 emp1 = new Teacher1();
        Employee1 emp2 = new Driver1();
        Employee1 emp3 = new Doctor1();
        emp1.work();
        emp2.work();
        emp3.work();

        //Полиморфизм
        Employee1[]array = {emp1, emp2, emp3};
        for (Employee1 emp:array) {
            emp.work();
        }

        //instanceof (является ли объект объектом класса)
        System.out.println("Является ли объект emp1 объектом класса Employee? " + (emp1 instanceof Employee1));
        System.out.println("Является ли объект emp1 объектом класса Teacher? " + (emp1 instanceof Teacher1));
        System.out.println("Является ли объект emp1 объектом класса Driver? " + (emp1 instanceof Driver1));
    }
}

abstract class Employee{
    void sleep (){
        System.out.println("Employee sleeps");
    }
    abstract void work();
}
class Teacher extends Employee1 {
    void work(){
        System.out.println("Teacher works");
    }
}
class Driver extends Employee1 {
    void work(){
        System.out.println("Driver works");
    }
}
class Doctor extends Employee1 {
    void work(){
        System.out.println("Doctor works");
    }
}





