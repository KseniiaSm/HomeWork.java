package comandLineForeach;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String[] array = new String[4];
        int index = 0;
        for (String a : array) {
            a = "10";
            array[index++] = a;
        }
        System.out.println(Arrays.toString(array));


    }
}
