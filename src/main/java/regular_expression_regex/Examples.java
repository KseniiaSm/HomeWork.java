package regular_expression_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Examples {
    //саму табличку смотри в классе Table
    public static void main(String[] args) {
        String s1 = "ABCD ABCE33 ABCF5ABCG3ABCH44";
        Pattern pattern1 = Pattern.compile("\\w+"); //соот-ет одной или более букве или цифре
        Matcher matcher = pattern1.matcher(s1);

        while (matcher.find()) {
            System.out.println("Позиция в стринг: " + matcher.start() + "; группа: " +matcher.group());
        }
        System.out.println("___________________________________________");
        //Вывести все слова, состоящие из 4 букв (если больше букв, то их обрежут)
        String s2 = "Hello nice girl Masha Tanya Ira";
        Pattern pattern2 = Pattern.compile("\\w{4}"); //соот-ет 4 буквам или цифрам
        Matcher matcher2 = pattern2.matcher(s2);

        while (matcher2.find()) {
            System.out.println("Позиция в стринг: " + matcher2.start() + "; группа: " +matcher2.group());
        }

        System.out.println("___________________________________________");
        //Выведем все слова и цифры (без пробелов и знаков)
        String s
                = "Ivanov Vasiliy, Russia, Moscow, Lenin street, 51, Flat 48," +
                "email: vivanov@mail.ru, Postcode: AA99, Phone Number: +123456789;"
                +"Petrova Mariy, Ukraine, Kiyev, Lomonosov street, 33, Flat 18," +
                "email: masha@mail.ru, Postcode: UKR54, Phone Number: +987654321;"
                +"Chuck Norris, USA, Hollywood, All stars street, 87, Flat 21," +
                "email: chuck@gmail.com, Postcode: USA23, Phone Number: +136478952.";

        Pattern numbersAndLetters = Pattern.compile("\\w+");
        Matcher matcherWorlds = numbersAndLetters.matcher(s);
        while (matcherWorlds.find()) {
            System.out.println(matcherWorlds.group());
        }

        System.out.println("___________________________________________");
        //Выведем все номера домов и квартир (все двузначные числа)
        //    \b - граница слова
        Pattern numbersOfApartment = Pattern.compile("\\b\\d{2}\\b");
        Matcher matcherApartment = numbersOfApartment.matcher(s);
        while (matcherApartment.find()) {
            System.out.println(matcherApartment.group());
        }

        System.out.println("___________________________________________");
        //Выведем все номера телефонов
        // если нужно вывести +, то пишем: \\+
        Pattern phoneNumber = Pattern.compile("\\+\\d{9}");
        Matcher matcherPhoneNumbers = phoneNumber.matcher(s);
        while (matcherPhoneNumbers.find()) {
            System.out.println(matcherPhoneNumbers.group());
        }

        System.out.println("___________________________________________");
        //Выведем все emailы
        // (ru|com) - или или
        Pattern patternEmails = Pattern.compile("\\w+@\\w+\\.(ru|com)");
        Matcher matcherEmails = patternEmails.matcher(s);
        while (matcherEmails.find()) {
            System.out.println(matcherEmails.group());
        }
    }
}
