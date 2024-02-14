package nested_classes.inner_class;

/**
Главное отличие static nested class и inner class (т.е. статического и не статического) в том,
 что в статическом можно создать объект внутреннего класса без создания объекта внешнего класса.
 В нестатическом внутреннем классе создание его объекта возможно только после создания объекта
 внешнего класса

 + внутренний класс может содержать только не статичные элементы

 + внутренний класс может обращаться к прайват переменным внешнего класса

 + внешний класс может обращаться к прайват переменным внутреннего класса, но
 !!!необходимо создать объект внутреннего класса!!!
 */
public class Car {
    String color;
    int doorCount;
    Engine engine;

    /**
     Можно создать мотор так:
    public Car(String color, int doorCount, int horsPower) {
        this.color = color;
        this.doorCount = doorCount;
        //Создание объекта внутреннего класса
        this.engine = this.new Engine(horsPower);
    }

     или так:

     */

    public Car(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
    }

    public void setEngine (Engine engine) {
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

    /**      Создание внутреннего класса:        */
    public class Engine {
        private int horsPower;
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
}


class Test{
    public static void main(String[] args) {
        Car car = new Car("red", 2);
        //создание объекта внутреннего класса
        Car.Engine engine = car. new Engine(1000);
        //обязательно использовать setter (или используй вариант, который закомментирован)
        car.setEngine(engine);
        System.out.println(car);

        //Можно сразу создать объект внешнего класса и внутреннего класса:
        // !!! однако теряется ссылка на машину и ее не найти
        Car.Engine engine1 = new Car("red", 4).new Engine(100);
        System.out.println(engine1);
    }
}
