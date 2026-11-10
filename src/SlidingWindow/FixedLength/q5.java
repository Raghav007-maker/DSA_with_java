package SlidingWindow.FixedLength;
// Count Occurrences of Anagram
public class q5 {
    public static void main(String[] args) {
        String text = "aabaabaa", pattern = "aaba";
        int ans = countAnagrams(text,pattern);
        System.out.println(ans);
    }

    public static int countAnagrams(String text, String pattern){
    int k = pattern.length();
    int count = 0;
    
    // Step 1: Build pattern frequency
    int[] patternFreq = new int[26];
    for(char ch : pattern.toCharArray()){
        patternFreq[ch - 'a']++;
    }
    
    // Step 2: Build first window frequency
    int[] windowFreq = new int[26];
    // TODO: Fill the first k characters of text into windowFreq
    for(int i = 0; i < k; i++){
        windowFreq[text.charAt(i) - 'a']++;
    }
    
    // Step 3: Check if first window is an anagram
    // TODO: Compare patternFreq with windowFreq
    
    // Step 4: Slide the window
    for(int i = k; i < text.length(); i++){
        // TODO: Remove the outgoing character (at index i-k)
        
        // TODO: Add the incoming character (at index i)
        // TODO: Check if current window is an anagram
    }
    
    return count;
}
}
