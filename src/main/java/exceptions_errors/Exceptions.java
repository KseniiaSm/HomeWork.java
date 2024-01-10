package exceptions_errors;

public class Exceptions {
    /**
     * Exceptions - исключения
     * когда jvm не может что-то выполнить

     * nullPointmentException - когда напр. ходим узнать длинну String s = null;
     * exception напр. когда ходим вывести на экран 5 элемент массива, состоящего из 3х элементов

     * При взаимодействии с внешними источниками (чтением или записью в файл)
     1)необходимо или объявить исключения:
     написать в main throws exception
     напр., public static void main(String[] args) throws IOException {}
     2)или необходимо обработать исключения с помощью try catch (см. класс ниже)

     точно также необходимо или объявить(throws) или обработать (try catch) исключения в методах
     причем если в методе может быть исключение(при чтении записи файла), то необходимо везде
     прописать throws какоетоимяexception (везде, в методе, при использовании этого метода)
     (проще сразу один раз обработать)

     Причем когда мы ловим исключения (catch)
     мы должны самые маленькие группы исключений, а потом уже более крупные
     напр. см ниже
     это нужно, чтобы не было недостижимых условий
     нужно сначала subклассы исключений проверять, а потом уже superклассы
     */

    public static void main(String[] args) {
        try{
            System.out.println("Privet");
        }
        catch (NullPointerException e){
            System.out.println("Поймано исключение " +e);
        }
        catch (Exception e1){
            System.out.println("Поймано исключение " +e1);
        }
    }
}
