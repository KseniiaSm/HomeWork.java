package overriding_hiding_final;

public class Overriding {
    /**
     * Overriding - это изменение non-static, non-final метода в сабкласее,
     * который он унаследовал от родительского класса
     * Это перезаписанные методы (измененные по сравнению с родительским
     * классом
     */

    /** Overriding - признаки:
     * (должно совпадать на 100%!!!!!!)
     * имя
     * параметры
     * return type (такой же или сабкласса)
     +++access modifier метода в сабклассе должен быть такой же или
     менее строгий, чем в родительском методе
     - метод должен быть non-static
     */

    public static void main(String[] args) {
        Teacher1 t = new Teacher1();
        t.eat();
        //Хоть метод принадлежит родительскому классу, мы его перезаписали
        //поэтому он теперь делает как перезаписано в дочернем классе

        Employee1 employee1 = new Teacher1();
        employee1.eat();
        //Тут можно вызвать только методы, которые есть в Employee1
        //Если они перезаписаны, то они будут в исполнении класса Teacher1
        //Потому что мы имеем тут объект класса Teacher1

    }
}



class Employee1 {
    double salary = 100;
    String name = "Kolya";
    int age;
    int experience;

    void eat(){
        System.out.println("Kushat employee");
    }

    void sleep(){
        System.out.println("Spat");
    }

}
class Teacher1 extends Employee1{
    int collichectvoUchenikov;
    void uchit(){
        System.out.println("Uchit");
    }
    void eat(){
        System.out.println("Kushat uchitel");
    }
}