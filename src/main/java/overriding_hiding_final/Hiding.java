package overriding_hiding_final;

public class Hiding {
    /**
     * Перекрытие методов (перезаписанных) в сабклассах
     !!!!+ Перекрытие переменных в сабклассах с таким же именем как в суперклассе
     *
     !!!!
     Hiding - это перекрытие static методов из родительского класса

     Обязательно статичных методов!!!! А так отличий не много от overriding
     (кроме того, что hiding есть у переменных)

     Методы считаются Hiding, если:
     + имя метода в сабклассе такое же как в родительском
     + список аргументов такой же
     + return type такой же (т.е. тип суперкласса)
     (или тип сабкласс)
     + access modifier в сабклассе такой же или менее строгий чем в суперклассе
     + если метод static в родительском классе, то и в сабклассе тоже статик


     С помощью аннотации (@Override можно проверить хайдится или оверрайдится метод,
     если не оверрайдится, то аннотация @Override будет ошибочна)
     */
}

class Animal{
//    String showName(){
//        return "some animal";
//    }
    static String showName(){
        return "some animal";
    }

    void showInfoAboutAnimal(){
        System.out.println("Name of animal " + showName());
    }
}

class Mouse extends Animal{
//    String showName(){
//        return "Jerry";
//    }
    static String showName(){
        return "Jerry";
    }

    void showInfoAboutMouse(){
        System.out.println("Name of mouse " + showName());
    }

    public static void main(String[] args) {
        Mouse m = new Mouse();
        m.showInfoAboutAnimal();
        m.showInfoAboutMouse();
        //так как они статичные, они не перезаписываются, а перекрываются

    }
}

/**
 * Теперь посмотрим на перезаписанные
 * для этого убери слово static в методах и будет имя животного - Джери и имя мыши - Джери
 */


/**
 * Если переменные перекрываются (т.е. одно и то же имя у переменной в
 * родительском классе и в дочернем, то используют слово супер:
 * String s1 = super.s1 + " drug";
 * 
 */





