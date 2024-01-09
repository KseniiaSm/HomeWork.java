package polymorphism;

public class Instanceof {
    //Является ли объект сыном или внуком класса или объектом этого класса
    public static void main(String[] args) {
        Jampable j = new Man();
        Man m = new Man();
        Student s = new Student();
        if (j instanceof Jampable){
            System.out.println("j is jampable");
        }
        if (m instanceof Human){
            System.out.println("m is Human");
        }
//        if (m instanceof Student){
//            System.out.println("m is Student");
//        }
        // Так писать нельзя!!!


        /**
         * Всегда проверяется instanceof конкретного объекта (не переменной)
         * Если объект является родственником (сыном или внуком)
         * класса, то ответ True
         * если объект является дедушкой или отцом класса, то компилятор не пропустит такое
         */


    }
}

interface Jampable{}
class Human implements Jampable{}
class Man extends Human{}
class Student extends Human{}
