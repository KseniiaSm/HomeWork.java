package equals_toString_WrapperClasses_InitializerBlock;

public class WrappersClasses {
    /**
     * Классы обертки
     * Позволяют примитивным классам вести себя как классы
     *
     * Они имеют свойство конвертироваться автоматически в примитивный тип данных и наоборот
     *
     * Все числа типа Long, Short, Integer, Double, Float
     * являются потомками класса Number
     */

    public static void main(String[] args) {
        int a = 100;
        Integer yy = 100;
        /**
         * Доступные методы:
         *
         1. Перевести String в подходящий тип данных для чисел
         parseInt напр или другие

         или можно использовать valueOf
         можно то же самое с boolean сделать
         */
        String s = "50";
        int i1 = Integer.parseInt(s);
        short s1 = Short.parseShort(s);

        String s5 = "3.14";
        double d5 = Double.valueOf(s5);
        System.out.println(d5);






    }




}
