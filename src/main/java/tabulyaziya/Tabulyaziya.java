package tabulyaziya;

public class Tabulyaziya {
    public static void main(String[] args) {
        String s1 = "Привет как дела?";
        System.out.println(s1);
        //Перенос на новую строку
        String s2 = "Привет \nкак дела?";
        System.out.println(s2);
        //Добавление большого пробела (символ табуляция)
        String s3 = "Привет \t как дела?";
        System.out.println(s3);
        //Задание любого символа из юникода
        //Смотри таблицы юникода в интернете
        // (можно использовать для поиска символов в тексте)
        String s4 = "Привет \u20AC как дела?";
        System.out.println(s4);
    }
}
