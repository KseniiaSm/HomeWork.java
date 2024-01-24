package regular_expression_regex;

import java.util.Arrays;

public class RegularExpression {
/**
 * Regular Expression - регулярные выражения - способ описания текстов с помощью общих характеристик:
 - наборами символов
 - диапазонами символов
 - длинами

 используется для обработки текстов
 */


public static void main(String[] args) {

    /**
     1. Выделить только определенные символы из String:
     .replaceAll(что убрать (или оставить), на что заменить)

     [] - обозначает диапазон символов
     ^ - обозначает отрицание
     таким образом: [^0-9] - все цифры кроме от 0 до 9 заменить на ""

     */
    String phoneNumber = "+7 (953) 170-50-99";
    phoneNumber = phoneNumber.replaceAll("[^0-9]", "");
    System.out.println(phoneNumber + " - новый номер телефона");

    /**
     2. Разбить String на части:
     .split(c какого места (символа) разбить, ограничение на кол-во символов при необходимости)

     \\. - точка
     \\s+ - сколько угодно пробелов
     \\s - один пробел
     */

    String sentences = "Дмитрий Петрович пришел. Выходите";
    String [] newSentences = sentences.split("\\.\\s+");
    System.out.println(Arrays.toString(newSentences));


}

}
