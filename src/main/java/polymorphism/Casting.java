package polymorphism;

public class Casting {
    /**
     * Casting - это процесс, когда вы заставляете переменную
     * одного типа вести себя как переменная другого типа данных.
     *
     * Casting возможен только тогда, когда между классами (интерфейсами)
     * есть связь is-A.
     * Делая кастинг вы не меняете тип данных объекта, а заставляете его
     * чувствовать себя как объект другого типа.
     *
     * Кастинг дает нам сказать компилятору "поверь тип данных такой как я написала"
     *
     * Если низходящая (т.е. для детей и внуков) - это upcasting
     * но он происходит автоматически (для этого писать ничего не надо)
     */
    public static void main(String[] args) {
        Employee1 emp1 = new Teacher1();
        Employee1 emp2 = new Driver1();
        Employee1 emp3 = new Doctor1();
        Employee1 emp = new Employee1();

        //для кастинга (необходимо) написать так:
        Doctor1 doc1 = (Doctor1)emp3;
        //Теперь метод доступен:
        doc1.specialization();
        //Или так кастинг можно сделать:
        ((Doctor1) emp3).specialization();

        //КАк использовать:
        Employee1 []array = {emp,emp1, emp2,emp3};
        for (Employee1 e : array) {
            if (e instanceof Driver1){
                System.out.println("Сделали кастинг объекта с типом данных драйвер1 ");
                System.out.println(((Driver1)e).staz);
                ((Driver1)e).vodit();
            }
        }
        //Тут инстенс оф помогает защитить нас от ошибки (чтобы мы не сделали кастинг объекта с другим типом)

    }
}

class Employee1 {
    void sleep (){
        System.out.println("Employee sleeps");
    }
    void work(){};
}
class Teacher1 extends Employee1 {
    void work(){
        System.out.println("Teacher works");
    }
}
class Driver1 extends Employee1 {
    int staz = 10;
    void vodit (){
        System.out.println("Drive");
    }
    void work(){
        System.out.println("Driver works");
    }
}
class Doctor1 extends Employee1 {
    void specialization(){
        System.out.println("Specialization ");
    }
    void work(){
        System.out.println("Doctor works");
    }
}



