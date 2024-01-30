package generics;
import java.util.ArrayList;
public class ParameterizedMethod {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(10);
        arrayList1.add(20);
        arrayList1.add(5);
        int secondE = GenMethod.getSecondElement(arrayList1);
        System.out.println(secondE);

        //То же самое для String
        ArrayList <String> arrayList2 = new ArrayList<>();
        arrayList2.add("A");
        arrayList2.add("B");
        arrayList2.add("C");
        String secondEString = GenMethod.getSecondElement(arrayList2);
        System.out.println(secondEString);
    }
}
class GenMethod{
    // ParameterizedMethod - могут быть static или нет
    public static <T> T getSecondElement(ArrayList<T> al){
        return al.get(1);
    }
}
