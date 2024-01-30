package generics;

public class ParameterizedClass {
    public static void main(String[] args) {
        /**
         1. С одним типом данных:
         */
        System.out.println(1);
        Info<String> info1 = new Info<>("Hi");
        //Создаем объект класса info с типом данных (которое подставили, напр. Стринг)
        //и происходит простая подстановка
        System.out.println(info1);

        //Подставим Integer и все тоже будет работать
        Info<Integer> info2 = new Info<>(18);
        System.out.println(info2);

        /**
         2. С двумя типами данных:
         */
        System.out.println();
        System.out.println(2);

        Pair<String,Integer> pair1 = new Pair<>("Hello",22);
        System.out.println(pair1.getValue1() + ", " + pair1.getValue2() + " - первая пара");
        Pair<Double,Integer> pair2 = new Pair<>(2.22,4);
        System.out.println(pair2.getValue1() + ", " + pair2.getValue2() + " - вторая пара");
    }
}

class Info<T>{
    private T value;
    //переменная value не может быть разумеется static, так как не понятно какое значение
    //и какой тип данных будет у нее в следующий раз, а статическая переменная - это переменная класса
    public Info(T value){
        this.value = value;
    }

    @Override
    public String toString() {
        return "{[" + value + "]}";
    }
}

        /**                       2. С двумя типами данных:                                            */
class Pair<V1, V2>{
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2){
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getValue1(){
        return value1;
    }

    public V2 getValue2(){
        return value2;
    }
}
