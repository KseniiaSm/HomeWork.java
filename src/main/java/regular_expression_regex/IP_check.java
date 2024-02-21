package regular_expression_regex;

import java.util.regex.Pattern;

public class IP_check {
    void checkIP(String ip) {
        String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}" +
                        "(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)";
        System.out.println(ip + " is OK? " + Pattern.matches(regex, ip));
    }

    public static void main(String[] args) {
        //IP: 0-255.0-255.0-255.0-255
        String ipOK = "255.38.192.99";
        String ipNotOK = "255.262.192.99";
        IP_check ipCheck = new IP_check();
        ipCheck.checkIP(ipOK);
        ipCheck.checkIP(ipNotOK);
    }
}


