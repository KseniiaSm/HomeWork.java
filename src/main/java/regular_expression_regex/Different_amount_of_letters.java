package regular_expression_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Different_amount_of_letters {
    //саму табличку смотри в классе Table
    public static void main(String[] args) {
        String s1 = "ABCD ABCE33 ABCF5ABCG3ABCH44";
        Pattern pattern1 = Pattern.compile("\\w+"); //соот-ет одной или более букве или цифре
        Matcher matcher = pattern1.matcher(s1);

        while (matcher.find()) {
            System.out.println("Позиция в стринг: " + matcher.start() + "; группа: " +matcher.group());
        }

        //Вывести все слова, состоящие из 4 букв (если больше букв, то их обрежут)
        String s2 = "Hello nice girl Masha Tanya Ira";
        Pattern pattern2 = Pattern.compile("\\w{4}"); //соот-ет 4 буквам или цифрам
        Matcher matcher2 = pattern2.matcher(s2);

        while (matcher2.find()) {
            System.out.println("Позиция в стринг: " + matcher2.start() + "; группа: " +matcher2.group());
        }
    }
}
