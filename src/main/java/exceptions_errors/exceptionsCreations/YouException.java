package exceptions_errors.exceptionsCreations;

/**
 * История:
 *
 */

public class YouException {

    /**
     * Создадим метод для использования исключений, которые создали ниже сами
     */
    //Так как разные подсемейства исключений, то в первом случае нужно писать
    //throws PodvernutNogyException, так как его подсемейство Exception
    //во втором случае не пишем, так как его подсемейство рантаймэкспепшон
    void marafon (int temperatutaVozduha, int tempBega) throws PodvernutNogyException{
        if(tempBega>12){
            throw new PodvernutNogyException("Темп бега был слишком высоким " + tempBega);
        }
        if(temperatutaVozduha>32){
            throw new SveloMyshzyException();
        }
        System.out.println("Вы пробежали марафон");
    }

    /**
     * Проверим работу метода и исключений, заданных нами
     */
    public static void main(String[] args) {
        YouException yourE = new YouException();
        try {
            yourE.marafon(50,10);
            //Создан наш exception
            //причем ловится только первый exception
        }
        catch (PodvernutNogyException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("В любом случае вы получите грамоту");
        }

        /**
         * Или можно было просто после main написать throws PodvernutNogyException
         * и будет красным написан наш exception
         */

    }


}

class PodvernutNogyException extends Exception{
    PodvernutNogyException(String massage){
        super(massage);
    }
    PodvernutNogyException(){}

}
class SveloMyshzyException extends RuntimeException{
    SveloMyshzyException(String massage){
        super(massage);
    }
    SveloMyshzyException(){}
}
