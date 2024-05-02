import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test3 {
    public static int countHi(String str) {
        Pattern pattern = Pattern.compile("hi");
        Matcher matcher = pattern.matcher(str);
        int amount = 0;

        while (matcher.find()) {
            amount++;
        }
        System.out.println(amount);
        return amount;
    }

    public static void main(String[] args) {
        Test3.countHi("ABChi hi");
    }
}
