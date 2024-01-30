package generics;

public class SubtypingInGenerics {
    /**
     Subtyping в generic ах
     */

    A a = new B();
    //List<A> list1 = new ArrayList<B>();
    //Так писать нельзя

    /**
     С помощью записи:
     class Info2<T extends Number>
     extends можно ограничить возможные типы для generics

     после такого ограничения JVM воспринимает все не как Object, а как Number
     */
}
class A{
}
class B extends A{
}

class Info2<T extends Number>{
    private T value;
    public Info2(T value){
        this.value = value;
    }
    @Override
    public String toString() {
        return "{[" + value + "]}";
    }
    public T getValue2() {
        return value;
    }
}