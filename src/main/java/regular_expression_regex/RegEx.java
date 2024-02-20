package regular_expression_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {
        String s1 = "ABCD ABCE ABCFABCGABCH";

        //          Создать шаблон регулярного выражения
        Pattern pattern1 = Pattern.compile("ABC");
        //       Найти соответствие (шаблон pattern сверяем со стрингом
        Matcher matcher = pattern1.matcher(s1);

        while (matcher.find()) {
            System.out.println("Позиция в стринг: " + matcher.start() + "; группа: " +matcher.group());
        }



    }
}
