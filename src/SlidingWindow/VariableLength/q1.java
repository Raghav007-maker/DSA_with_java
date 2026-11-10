package SlidingWindow.VariableLength;
// Problem: Longest Substring Without Repeating Characters
import java.util.*;

public class q1 {
    public static void main(String[] args) {
        String str = "pwwkew";
        int ans = subWithoutRepeating(str);
        System.out.println(ans);
    }
    public static int subWithoutRepeating(String str){
        
        int n = str.length();

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int right = 0;
        int maxLength = 0;


        while(right < n){
            char ch = str.charAt(right);

            while(set.contains(ch)){
                set.remove(str.charAt(left));
                left++;
            }

            set.add(ch);
            maxLength = Math.max(maxLength,right - left + 1);
            
            right++;
            
        }
        return maxLength;
    }
}
