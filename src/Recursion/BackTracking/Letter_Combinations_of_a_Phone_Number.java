package Recursion.BackTracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Letter_Combinations_of_a_Phone_Number {

    HashMap<Character, String> map = new HashMap<>();

    public List<String> letterCombinations(String digits) {
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        List<String> ans = new ArrayList<>();
        combinations(digits, 0, ans, "");
        return ans;
    }

    public void combinations(String digits, int idx, List<String> ans, String s){

        if(idx >= digits.length()){
            ans.add(s);
            return;
        }

        char digit = digits.charAt(idx);
        String str = map.get(digit);

        for(int i = 0; i < str.length(); i++){
            combinations(digits, idx + 1, ans, s + str.charAt(i));
        }
    }
}
