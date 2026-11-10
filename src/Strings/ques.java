package Strings;

public class ques {
    public static void main(String[] args) {
        String str = reverseWords("     Raghav    Bansal  ");
        System.out.println(str);
    }
    public static String reverseWords(String s) {
        // Step 1: Trim leading and trailing spaces
        s = s.trim();

        // Step 2: Split by one or more spaces using regex
        String[] words = s.split("\\s+");

        // Step 3: Reverse the array of words
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) sb.append(" ");
        }

        return sb.toString();
    }

}
