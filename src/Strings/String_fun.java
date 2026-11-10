package Strings;

public class String_fun {
    public static void main(String[] args) {
        String str="raghav";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.length());
        System.out.println(str.charAt(2)); // prints character at index 2
        System.out.println(str.indexOf('g')); // returns the index of first occurrence of 'g'
        System.out.println(str.indexOf('g', 3)); // returns the index of 'g' starting from index 3
        System.out.println(str.substring(2)); // returns substring from index 2 to end  
        System.out.println(str.substring(2, 5)); // returns substring from index 2 to 4 (5 is exclusive)
        System.out.println(str.contains("gh")); // checks if "gh" is present in the string
        System.out.println(str.startsWith("ra")); // checks if the string starts with "ra"
        System.out.println(str.endsWith("av")); // checks if the string ends with "av"
        System.out.println(str.replace('g', 'z')); // replaces 'g' with '   z'
        System.out.println(str.replace("gh", "zz")); // replaces "gh" with "    zz"
        System.out.println(str.trim()); // removes leading and trailing whitespace (if any)  
        System.out.println(str);  
        // System.out.println(str.substring(4,8)); //Error
        int[] arr={1,2,3,3};
        System.out.println();

    }
}
