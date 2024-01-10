package exceptions_errors;

import java.io.*;

public class Reading_Writing_fromFile {
    /**
     java.io - это пакет, в котором собраны классы и интерфейсы,
     которые предназначены, если обобщить, для чтения и записи
     информации из/в какой-то источник, напр. в файл

     */

    public static void main(String[] args) throws IOException {
        //1. Вписываем название файла, предварительно создав его в папке своего проекта
        //внутри главного файла (не заходя в src и т.д.)
        //класс File - абстракная репрезентация пути к файлу или папке
        File f = new File("test10.txt");
        //Создаем поток для считывания
        FileInputStream fis = new FileInputStream(f);
        fis.read();
        //Создаем поток для записи, причем будет записываться char, даже если впишешь int
        FileOutputStream fos = new FileOutputStream(f);
        fos.write('g');
        //FileNotFoundException - ошибка, которую выбрасывает компилятор, если файл не найден


    }

}
