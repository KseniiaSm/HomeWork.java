package smallTopics;

public class TernerryOperator {
    public static void main(String[] args) {
        /**
         boolean expression? expression1 : expression2
         при этом expression1 и 2 могут быть любыми типами данных
         */
        int a = 3;
        System.out.println(a<5? "privet" : 5);

        //Если в выражениях разный тип данных, то тернариОператор нельзя!!!
        // приравнивать к переменной (логично, так как не понятно какой тип данных
        // хотим получить)
        // int z = (a<5? "privet" : 5) нельзя написать

        /**   А можно так   */
        int b=5;
        int c=2;
        int d = (b==c? b++ : c++);
        System.out.println(b+" " + c);

        System.out.println();
        int z=7;
        System.out.println(z>2? z<5? 3 : 6 : 9);

    }
}
