package nested_classes.static_nested_class;

/**
 nested static class (внутренний статичный класс) мы можем использовать точно так же,
 как обычный внешний класс (просто указывая в каком внешнем классе внутренний находится)

 + можно создавать объект внутреннего класса без создания объекта внешнего класса

 + nested static class может содержать статичные и не статичные элементы

 + nested static class может обращаться к статичным переменным внешнего класса (к нестатичным нельзя обращаться)

 + nested static class и внешний класс могут обращаться к переменным друг друга (даже к прайват переменным)
 (только внутренний к статичным, а внешний к любым)

 !!!внутри и снаружи могут быть классы или интерфейсы (не важно)

 */
public class Car {
    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    /**      Создание внутреннего статичного класса:        */
    public static class Engine {
        private int horsPower;
        private static int countOfObjects;

        public Engine(int horsPower) {
            this.horsPower = horsPower;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "horsPower=" + horsPower +
                    '}';
        }
    }

    //чтобы создать метод в внешнем классе не нужно писать Car.Engine
    void method() {
        System.out.println(Engine.countOfObjects);
        Engine engine1 = new Engine(200);
        System.out.println(engine1.horsPower);
    }
}


class Test{
    public static void main(String[] args) {
        //Создание объекта внутреннего класса (необходимо просто указать в каком
        // внешнем классе он находится)
        Car.Engine myEngine = new Car.Engine(1000);
        System.out.println(myEngine);

        //создадим объект внешнего класса:
        Car car = new Car("red", 4, myEngine);
        System.out.println(car);



    }
}
