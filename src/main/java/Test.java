import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String str = "aaxxxxbb";
        String word = "xx";
        StringBuilder strNew = new StringBuilder();
        String plus = "+";
        int index;

        for(int i=0; i<str.length();i++) {
            index = str.indexOf(word);
            if (i == index) {
                strNew.append(word);
                i += word.length();
                str = str.substring(index + word.length());
                str = plus.repeat(word.length() + index +1) + str;
            } else {
                strNew.append(plus);
            }
        }
        System.out.println(strNew);





//        for(int i=0; i<str.length();i++) {
//            int index = str.indexOf(word);
//            System.out.println(index);
//            if(i < index) {
//                strNew = strNew + "+";
//                System.out.println(strNew + " strNew первая строчка ");
//            } else if (i == index) {
//                strNew = strNew + word;
//                System.out.println(strNew + " strNew вторая строчка ");
//                i += word.length();
//                str = str.substring(index + word.length());
//                System.out.println(str + " str первая строчка ");
//                str = plus.repeat(word.length() + index +1) + str;
//                System.out.println(str + " str вторая строчка ");
//            } else {
//                strNew = strNew + "+";
//               System.out.println(strNew + " strNew псоледняя строчка ");
//            }
//        }






    }

}
