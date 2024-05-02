public class Test2 {
    public static String wordEnds(String str, String word) {
        int index;
        StringBuilder sb = new StringBuilder();

        if(!str.contains(word)) {
            return "";
        }


        for(int i=0; i<str.length();i++) {
            index = str.indexOf(word);
            if(i == index && i == 0) {
                sb.append(str.charAt(i + word.length()));
                str = "0".repeat(i + word.length() + 1) + str.substring(i + word.length());
            } else if (i == index && index == str.length()-word.length()) {
                sb.append(str.charAt(i-1));
            } else if (i == index) {
                sb.append(str.charAt(i-1));
                sb.append(str.charAt(i + word.length()));
                str = "0".repeat(i + word.length() + 1) + str.substring(i + word.length());
            }
        }
        System.out.println(sb);
        return sb.toString();
    }

    public static void main(String[] args) {
        Test2.wordEnds("XY1XY", "XY");
    }





}
