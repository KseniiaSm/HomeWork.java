package lambda2.consumer;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Consumer_ {
    /**
     Consumer - принимает какой-то объект типа <T>
     Consumer <T> имеет метод void accept(T t)

     Мы хотим потребить объект, как-то его использовать, что-то с ним сделать
     (напр., вывести на экран элементы, изменить один из объектов)
     */

    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> carArrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            carArrayList.add(carSupplier.get());
        }
        return carArrayList;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(() -> new Car("Nissan", "red", 100));
        System.out.println("Наши машины: " + ourCars);

        changeCar(ourCars.get(0),car -> {
            car.color = "blue";
            car.engine = 1;
            System.out.println("\nИзмененная машина: " + car);
        });
        System.out.println("Наши машины: " + ourCars);

        System.out.println("\nИспользование foreach:");
        //пример 1
        List<String> list = List.of("Blue", "Red", "Green", "Gray", "White");
        list.forEach(someString -> System.out.println(someString));
        //пример 2
        List<Integer> listInt = new ArrayList<>();
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);
        listInt.add(4);
        listInt.add(5);
        listInt.add(6);
        listInt.forEach(someInteger -> {
            System.out.print(someInteger);
            someInteger *=2;
            System.out.println(" - " + someInteger);
        });
    }
}

class Car {
        String model;
        String color;
        double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

        @Override
        public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
