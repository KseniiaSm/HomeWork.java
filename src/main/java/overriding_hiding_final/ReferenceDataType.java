package overriding_hiding_final;

public class ReferenceDataType {
    public static void main(String[] args) {
        Doctor d = new Doctor();
        Teacher t = new Teacher();
        Driver dr = new Driver();
        Employee e = new Employee();

        //Переменная типа данных родительского класса
        // может ссылаться на объект дочернего класса

        //!!! Это означает: доктор - это employee
        //читаем с права на лево
        Employee emp1 = new Doctor();
        Employee emp2 = new Teacher();
        Employee emp3 = new Driver();

        //Если хирург является наследником доктора, а значит и внуком имплоии,то:
        Employee emp4 = new Xirurg();
        Xirurg x = new Xirurg();
        Doctor doctorXirurg = new Xirurg();

        /**
         Компилятор всегда смотрит на тип данных переменной объекта
         (т.е. если тип данных emp1 - Employee это значит, что мы можем
         использовать переменные и методы только этого класса
         * Employee emp1 = new Doctor();
         * т.е переменные и методы класса доктор не доступны!!!
         */
        emp1.age = 10;
        emp1.name = "Vasya";
        emp1.eat();
        emp1.sleep();
        //emp1.lechit(); - нельзя так написать!! у него нет такого метода
        //т.к переменная (emp1), которая ссылается на объект типа доктор
        //имеет тип Employee

    }
    //Кроме того все объекты (массив, стринг объект,
    // объект любого класса) - наследники Обджекта
    //по этому в return можно написать что угодно (если написан обджект)
    public Object abc(){
        return new Doctor();
    }
    //или
    public Object abcd(){
        return new int []{1,2,5};
    }
    /**
     * Т.е. в return можно вернуть любого наследника или тип
     * данных, который шел на вход
     * Можно написать:
     * */

    public Doctor doctorskiiMethod (){
        return new Doctor();
    }
    //или
    public Doctor doctorskiiMethod2 (){
        return new Xirurg();
    }
}



class Employee {
    double salary = 100;
    String name = "Kolya";
    int age;
    int experience;

    void eat(){
        System.out.println("Kushat");
    }

    void sleep(){
        System.out.println("Spat");
    }

}

class Doctor extends Employee{
   public void lechit(){
        System.out.println("Lechit");
    }
}
class Xirurg extends Doctor{
    String skalpel;
    void operaziya(){

    }
}

class Teacher extends Employee{
    int collichectvoUchenikov;
    void uchit(){
        System.out.println("Uchit");
    }
}

class Driver extends Employee{
    String nazvanieMashini;
    void vodit(){
        System.out.println("Vodit");
    }
}
