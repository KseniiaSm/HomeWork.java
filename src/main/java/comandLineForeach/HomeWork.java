package comandLineForeach;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork {
    public static String[][] abc(String[]... array) {
        String[][] bigArray = new String[10][];
        for (int i = 0; i < bigArray.length; i++) {
            bigArray = array.clone();
        }
        for (String[] s1 : bigArray) {
            System.out.println(Arrays.toString(s1));
        }
        return bigArray;
    }

    public static void main(String[] args) {
        String[] arrayOne = new String[3];
        String[] arrayTwo = new String[3];
        String[] arrayThree = new String[3];
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter value of " + 1 + " array, that consists of 3 String value");
        for (int i = 0; i < arrayOne.length; i++) {
            System.out.println("Enter " + (i + 1) + " value");
            arrayOne[i] = scaner.next();
        }
        System.out.println("Enter value of " + 2 + " array, that consists of 3 String value");
        for (int i = 0; i < arrayTwo.length; i++) {
            System.out.println("Enter " + (i + 1) + " value");
            arrayTwo[i] = scaner.next();
        }
        System.out.println("Enter value of " + 3 + " array, that consists of 3 String value");
        for (int i = 0; i < arrayThree.length; i++) {
            System.out.println("Enter " + (i + 1) + " value");
            arrayThree[i] = scaner.next();
        }
        String[][]allArraysTogether = abc(arrayOne, arrayTwo, arrayThree);
    }
}
