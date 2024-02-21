package regular_expression_regex;

public class RegEx_Table {
    /**
     !!!!
     в RegEx когда пишут \, его удваивают, так как чтобы найти кавычки пишут так: \"
                                                   чтобы найти один слэш пишут так: \\


                        Часто используемые символы в REGEX

     abc – Соответствует последовательно идущим abc

     [abc] – Соответствует или a, или b, или c

     [d-j] – Соответствует одной из букв из диапазона d - j

     [3-8] – Соответствует одной из цифр из диапазона 3-8

     [B-Fd-j3-8] – Соответствует одной из букв из обоих
     диапазонов или одной из цифр из диапазона 3 - 8

     a|b – Соответствует либо букве a, либо букве b

     [^d-j] – Данный символ, стоящий в начале этих
     скобок, означает отрицание. Соответствует одной из
     букв НЕ из диапазона d - j

     . – Соответствует одному любому символу.
     Исключение: символ новой строки

     ^выражение – Соответствует выражению в начале строки
                          String s = "ABC 5ABC";
                          ("^ABC") - найдет именно те символы, которые в начале строки

     выражение$ – Соответствует выражению в конце строки



                           Часто используемые МЕТАсимволы в REGEX
                           (тут везде не забудь двойной слэш написать)

     \d – Соответствует одной цифре

     \D – Соответствует одной НЕ цифре

     \w – Соответствует одной букве, цифре или «_»

     \W – Соответствует одному символу, который НЕ буква, НЕ цифра и НЕ «_»

     \s – Соответствует любому пробельному символу и включает:
                \t - таб (пробел)
                \n - начало новой строки
                \r - начало новой строки
                \f - символ окончания страницы

     \S – Соответствует НЕ пробельному символу
           (любой знак препинания, любая цифра)

     \A – Соответствует выражению в начале String-а

     \Z – Соответствует выражению в конце String-а

     \b – Соответствует границе слова или числа

     \B – Соответствует границе НЕ слова и НЕ числа



                              Часто используемые символы в REGEX, обозначающие количество повторений

     *** если нужно найти соответствие повторения выражения
     * напр 2 раза (AB){2} - не забудь (АВ) взять в скобки

     выражение? – Соответствует 0 или 1 повторению

     выражение* – Соответствует 0 или большему количеству повторений

     выражение+ – Соответствует 1 или большему количеству повторений

     выражение{n} – Соответствует количеству повторений «n»

     выражение{m, n} – Соответствует количеству повторений от «m» до «n»

     выражение{n,} – Соответствует n или большему количеству повторений

     */
}
