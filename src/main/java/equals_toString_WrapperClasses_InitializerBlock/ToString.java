package equals_toString_WrapperClasses_InitializerBlock;

import java.util.ArrayList;

public class ToString {
    public static void main(String[] args) {
        CarOne car1 = new CarOne("red", "V4");
        CarOne car2 = new CarOne("red", "V4");
        CarOne car3 = new CarOne("black", "V8");
        CarOne car4 = new CarOne("black", "V8");
        ArrayList<CarOne> listOfCarOnes = new ArrayList<>();
        listOfCarOnes.add(car1);
        listOfCarOnes.add(car2);
        listOfCarOnes.add(car3);
        //Если просто вывести на экран объект car1, то мы увидим его hashcode
        System.out.println(car1);
        //Переопределим метод toString() внизу, теперь возвращается так как надо

    }

}

class CarOne {
    String color;
    String engine;

    CarOne(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    public String toString (){
        return "Машина цвета " + color + " имеет тип двигателя " + engine;
    }
}
