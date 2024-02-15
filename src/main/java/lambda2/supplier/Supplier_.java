package lambda2.supplier;

import java.util.ArrayList;
import java.util.function.Supplier;

public class Supplier_ {
    /**
     * Supplier (поставщик) - не передает никаких параметров и возвращает объект типа <T>
     * Supplier <T>   имеет метод:  T get();
     * <p>
     * ! не забыть импортировать
     * import java.util.function.Supplier;
     */

    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> carArrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            carArrayList.add(carSupplier.get());
        }
        return carArrayList;
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(() -> new Car("Nissan", "red", 100));
        System.out.println("Наши машины: " + ourCars);
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
