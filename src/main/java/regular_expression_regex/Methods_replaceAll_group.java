package regular_expression_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Methods_replaceAll_group {
    public static void main(String[] args) {
        //1234 5678 9123 4567 (987) 03/25
        String dataOfCreditCard = "12345678912345679870325";

        //1. Создадим шаблон, который разбивает номер карты на составные элементы:
        //1234 5678 9123 4567 (987) 03/25
        //                                                        1        2      3       4       5       6       7
        Pattern patternOfCreditCard = Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{3})(\\d{2})(\\d{2})");

        Matcher matcher = patternOfCreditCard.matcher(dataOfCreditCard);

        //Мы хотим получить: 03/25 1234 5678 9123 4567 (987)
        String creditCard = matcher.replaceAll("$6/$7 $1 $2 $3 $4 ($5)");
        System.out.println("Данные карты: " + creditCard);

        //это работает только если верхнее закомментировать
        while (matcher.find()) {
            System.out.println(matcher.group(3));
        }
    }
}
