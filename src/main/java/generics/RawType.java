package generics;

import java.util.ArrayList;
import java.util.List;

public class RawType {
    public static void main(String[] args) {
        //Это сырой тип: (без указания типа,т.е. по умолчанию тип объектов object в листе)
        //!!! так лучше никогда не писать
        List list = new ArrayList();
        list.add("Hi");
        list.add("Hello");
        list.add("Bye");
        //можно также добавить int:
        //list.add(4);
        //но на run time будет exception

        //Если написали raw type, то необходимо кастить в его тип
        for (Object o:list) {
            System.out.println(o + " and it's length " + ((String)o).length());
        }


    }
}
