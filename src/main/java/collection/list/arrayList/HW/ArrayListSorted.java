package collection.list.arrayList.HW;
import java.util.ArrayList;
import java.util.Collections;

/*
Создайте класс, в котором создайте метод abc. Инпут параметром данного метода
будет N-ое количество параметров типа String. Метод должен возвращать уже отсортированный
объект ArrayList из неповторяющихся объектов типа String, взятых из параметра метода и
выводить данный объект на экран.
Продемонстрируйте данный метод.
 */

public class ArrayListSorted {
    public static ArrayList<String> abc (String...a){
        ArrayList <String> arrayList = new ArrayList<>();
        for (int i=0; i<a.length; i++){
            if (!arrayList.contains(a[i])){
                arrayList.add(a[i]);
            }
        }
        Collections.sort(arrayList);
        System.out.println(arrayList);
        return arrayList;
    }

    public static void main(String[] args) {
        String one = "One";
        String two = "Abc";
        String three = "Z";
        String four = "Banana";
        String five = "C";
        String six = "Banana";
        String seven = "One";
        //abc(one,two, three, four, five, six, seven);
        ArrayList<String> arraylist = abc(one,two, three, four, five, six, seven);
    }
}
