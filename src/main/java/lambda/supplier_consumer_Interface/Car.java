package lambda.supplier_consumer_Interface;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Consumer - потребитель
 * Принимает параметры
 * позволяет изменять объекты
 */
public class Car {
    String model;
    String color;
    double engine;

    Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    public String toString() {
        return "Our car is " + model + ", color is " + color + ", engine " + engine;
    }
}

class Test10 {

    //Метод, созданный с помощью интерфейса Supplier, позволяет создать объекты
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> al = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            //вызвовем единственный метод интерфейса Supplier (get)
            al.add(carSupplier.get());
        }
        return al;
    }

    //Метод, созданный с помощью интерфейса Consumer, позволяет изменять объекты
    //Как именно пишем с помощью лямбда выражений
    //тут пишем, что мы принимаем на вход Car
    public static void changeCar(Car car, Consumer<Car> consumer) {
        consumer.accept(car);
    }

    public static void main(String[] args) {
        //Создадутся 3 машины (одинаковые)
        ArrayList<Car> ourCars = createThreeCars(() -> new Car("Nissan", "Silver", 1.6));
        System.out.println("Our Cars: " + ourCars);

        //Поменяем характеристики машины с помощью consumer
        changeCar(ourCars.get(0), car -> {
            car.color = "Red";
            car.engine = 2.4;
            System.out.println("Updated car: " + car);
        });
    }
}
