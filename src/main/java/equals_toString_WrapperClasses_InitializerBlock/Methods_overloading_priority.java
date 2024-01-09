package equals_toString_WrapperClasses_InitializerBlock;

public class Methods_overloading_priority {
    /**
     * Приоритет вызова overloaded методов:
     1. Точно совпадающие параметры
     2. Вызов метода с параметрами большого типа данных (напр., если есть long то вызовется он)
     3. Методы с параметрами классов-оберток (напр., Integer)
     4. Varargs (напр., int...a)
     */
//    void priority (int a, int b){
//        System.out.println("Первый приоритет у просто инта");
//    }
//    void priority (long a, long b){
//        System.out.println("Второй приоритет у лонга");
//    }
    void priority (short a, short b){
        System.out.println("short вообще не нравится ");
    }
//    void priority (Integer a, Integer b){
//        System.out.println("Третий приоритет");
//    }
    void priority (int ...a){
        System.out.println("Четвертый приоритет");
    }

    public static void main(String[] args) {
        Methods_overloading_priority m = new Methods_overloading_priority();
        m.priority(1,2);
    }
}
