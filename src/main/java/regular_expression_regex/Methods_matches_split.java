package regular_expression_regex;

import java.util.Arrays;

public class Methods_matches_split {
    /**
     public boolean matches(String regEx) - сравнивает регулярное выражение со
     стрингом и возвращает булиан

     public String[] split(String regEx) - делит стринг на части по регулярному выражению
     */

    public static void main(String[] args) {
        String s
                = "Ivanov Vasiliy, Russia, Moscow, Lenin street, 51, Flat 48," +
                "email: vivanov@mail.ru, Postcode: AA99, Phone Number: +123456789;"
                +"Petrova Mariy, Ukraine, Kiyev, Lomonosov street, 33, Flat 18," +
                "email: masha@mail.ru, Postcode: UKR54, Phone Number: +987654321;"
                +"Chuck Norris, USA, Hollywood, All stars street, 87, Flat 21," +
                "email: chuck@gmail.com, Postcode: USA23, Phone Number: +136478952.";

        String s1 = "chuck@gmail.com";

        boolean isEmail = s1.matches("\\w+@\\w+\\.(ru|com)");
        System.out.println("isEmail - " + isEmail);

        String[] array = s.split(" ");
        System.out.println(Arrays.toString(array));
    }
}
