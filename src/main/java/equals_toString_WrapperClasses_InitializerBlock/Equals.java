package equals_toString_WrapperClasses_InitializerBlock;

import java.util.ArrayList;

public class Equals {
    public static void main(String[] args) {
        CarOne carOne = new CarOne("red", "V4");
        CarOne car12 = new CarOne("red", "V4");
        CarOne car13 = new CarOne("black", "V8");
        System.out.println(car12.equals(car13));
        System.out.println(car12.equals(carOne));
        System.out.println(carOne.equals(car12));
        //Для ArrayList используется метод containsOf, который содержит в себе метод equals
        //Если мы переопределили данный метод, то вернется true
        // (даже если такого объекта нет, а есть только объект с такими же значениями полей:
        CarOne car14 = new CarOne("black", "V8");
        ArrayList <CarOne> listOfCarOnes = new ArrayList<>();
        listOfCarOnes.add(carOne);
        listOfCarOnes.add(car12);
        listOfCarOnes.add(car13);
        System.out.println(listOfCarOnes.contains(car14) + " содержит ли листМашин машину4?");
        //Если закомментировать переопределение метода equals, то будет false
    }

}

class Car {
    String color;
    String engine;
    Car (String color,String engine){
        this.color = color;
        this.engine = engine;
    }
/**
 * Напишем метод equals
 * Это стандартный метод equals, который записан в классе Object

 @Override
 public boolean equals(Object obj) {
 return super.equals(obj);
 }

 */

    /**
     * Перезапишем его правильно в классе Car
     !!!! На вход всегда идет объект типа Object
     напр, Object obj
     если нет, то это уже не перезаписанный метод, а просто ваш написанный метод
     который уже будет работать не так как нужно

     !!! null нельзя нигде ставить (т.е. сравниваемый объект не может быть равен null,
     так как будет exception
     и нельзя сравнивать с null
     */
    @Override
    public boolean equals(Object obj) {
        //Является ли объект obj объектом класса Car?
        if (obj instanceof CarOne){
            //Если является, то мы делаем casting данного объекта в класс Car
            CarOne car12 = (CarOne)obj;
            return (color.equals(car12.color) && engine.equals(car12.engine));
        } else {
        return false;
        }
    }

/** Так перезаписывается автоматически
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return Objects.equals(color, car.color) && Objects.equals(engine, car.engine);
    }
    */

}




