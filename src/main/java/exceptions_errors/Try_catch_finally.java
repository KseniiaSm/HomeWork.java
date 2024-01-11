package exceptions_errors;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Try_catch_finally {
    /**
     * Блоки Try_catch_finally помогают программе работать несмотря на exceptions
     * try - попытаться что-то сделать - этот блок всегда один
     * catch - ловить исключение (их может быть сколько угодно, для разных исключений свой)
     * finally - блок который выполняется всегда, несмотря на исключения (только один допустим)

     try+catch or try+finally or try+catch+finally
     * по одному писать их нельзя
     * важна также последовательность Try_catch_finally только так
     * нельзя писать код между этими блоками

     * finally пишут обычно подчищающий код (напр., для закрытия считывания из файла
     * или для закрытия записи в файл

     Пишем как более точный exception (с конкретным именем) чтобы просто найти его потом
     и исправить
     общие типа catch(Exception e) лучше не писать!!!

     !!! finally в методах
     finally выполняется всегда и первым (если мы пишем его в методе), а
     потом уже выполняется try or catch
     поэтому если в методе есть return в блоке finally, то он будет выполняться всегда,
     остальные return не нужны

     */

    public static void main(String[] args) {
        int [] array = {1,3,5};
        System.out.println("У нас есть массив");
        //Выведем 5 элемент (которого нет) массива
        //Будет ArrayIndexOutOfBoundsException
        //System.out.println(array[5]);
        //System.out.println("Всем хорошего дня");

        //чтобы программа не остановилась пишем:
        try {
            System.out.println(array[5]);
            System.out.println("Всем хорошего дня");
        }

        //какой exception ловим (нужно обязательно правильный найти
        //тип эксепшон и переменная e
        catch (ArrayIndexOutOfBoundsException e){
            //если мы его поймали, то пусть выводится на экран
            System.out.println("Был пойман " + e);
        }

        //Если в try нет никакого exception, то в блок catch программа не заходит и
        //выполняется try

        //Блок finally обрабатывается всегда
        finally {
            System.out.println("Этот блок выполняется всегда");
        }

        //Данная строчка выведется, как обычно (если есть исключения, то не обрабатывается
        //если нет, то обрабатывается
        System.out.println("Данный код не имеет отношения к исключениям");


        /**
         * Еще пример
         * Часто try_catch_finally используют при записи или считвании из файла
         * (поэтому компилятор и требует позаботиться об exceptions)
         *
         * Если мы используем внешние конструкции, то джава не может гарантировать успешность работы
         * поэтому просит использовать try and catch
         */

        File f = new File("test11.txt");
        try {
            FileInputStream fis = new FileInputStream(f);
            fis.read();
        }
        catch (IOException e){
            System.out.println("Поймали " + e);
        }




    }
}
