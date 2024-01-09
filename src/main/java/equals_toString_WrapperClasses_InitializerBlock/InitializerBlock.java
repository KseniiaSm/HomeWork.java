package equals_toString_WrapperClasses_InitializerBlock;

public class InitializerBlock {
     /**
     * Это блок, который выполняется каждый раз при создании объекта
     * Блок пишут в { тут }
     * Initializer Block выполняется перед выполнением конструктора
     *
     * Initializer Block ов может быть много
     *
     * static Initializer Block - выполняется один раз без объекта даже
     * для его создания перед Initializer Blockом необходимо написать слово static
      *
      * Приоритет выполнения:
      * 1)статические инициализаторы
      * 2)просто инициалайзер блок
      * 3)выполнение конструктора
     */

    {
        System.out.println("Я Initializer Block");
    }
    InitializerBlock (){
        System.out.println("Я конструктор");
    }

    static {
        System.out.println("Я static InitializerBlock");
    }

    public static void main(String[] args) {
//        InitializerBlock i1 = new InitializerBlock();
//        InitializerBlock i2 = new InitializerBlock();
    }

}

class ClassSecond{
    public static void main(String[] args) {
        ClassSecond c1 = new ClassSecond();
    }
    //Тут разумеется ничего не будет

}
