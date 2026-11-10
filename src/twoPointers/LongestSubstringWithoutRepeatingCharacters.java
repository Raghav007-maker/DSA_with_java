package twoPointers;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        
        String s = "cadbzabcd";
        int ans = longestSubstringBruteForce(s);
        int ans2 = longestSubstringBetter(s);
        System.out.println(ans);
        System.out.println(ans2);
    }

    public static int longestSubstringBruteForce(String s){

        int maxLength = 0;
        for(int i = 0; i < s.length(); i++){

            for(int j = i; j < s.length(); j++){

                if(isUnique(s,i,j)){
                    maxLength = Math.max(maxLength,j-i+1);
                }
            }
        }
        return maxLength;
    }

    public static boolean isUnique(String s, int st, int end){
        HashSet<Character> set = new HashSet<>();

        for(int i = st; i <= end; i++){
            char ch = s.charAt(i);
            if(set.contains(ch)){
                return false;
            }
            set.add(ch);
        }
        return true;
    }

    public static int longestSubstringBetter(String s){

        HashMap<Character,Integer> map = new HashMap<>();

        int l = 0, r = 0, maxLength = 0;

        while(r < s.length()){

            char ch = s.charAt(r);

            if(map.containsKey(ch) && map.get(ch)>=l){
                
                l = map.get(ch)+1;
            }
            map.put(ch,r);
            maxLength = Math.max(maxLength,r-l+1);
            r++;
        }
        return maxLength;
    }
}
