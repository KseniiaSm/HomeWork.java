package generics;
public class TYPE_ERASURE {
    /**
     Созданы для обратной совместимости версий джавы, когда generics не существовало

     TYPE_ERASURE - стирание типов

     JVM не видит тип arrayLista, а видит
     ArrayList arrayList1 = new ArrayList();
     int a = arrayList1.get(0);
     сама JVM воспринимает аррей лист как лист из объектов типа Object, а
     затем сама она кастит 0 ое значение аррей листа в Integer
     int a = (Integer)arrayList1.get(0);

     Нельзя создать два одинаковых с точки зрения generics метода:
     1. public void abc(Info1<Integer> info1){
     Integer i = info1.getValue1();
     }
     2. public void abc(Info1<String> info1){
     String i = info1.getValue1();
     }
     JVM превращает их тип параметров в тип Object и не видит в них разницы
     */
}

class Info1<T>{
    private T value;
    public Info1(T value){
        this.value = value;
    }
    @Override
    public String toString() {
        return "{[" + value + "]}";
    }
    public T getValue1() {
        return value;
    }
}

class Parent {
    public void abc(Info1<Integer> info1){
        Integer i = info1.getValue1();
    }
//    public void abc(Info1<String> info1){
//        String i = info1.getValue1();
//    }

}

class Сhild extends Parent {
    /*
    Так перезаписывать методы тоже не получится, чтобы в родительском и детском классе
    были одинаковые методы с точки зрения JVM (параметры она делает типа обджект)

    public void abc(Info1<String> info1){
    String i = info1.getValue1();
    }
    */
}