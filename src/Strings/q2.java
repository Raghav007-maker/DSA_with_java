package Strings;

public class q2 {
    
    public static void main(String[] args) {
        // 1.>
        String str = null;
        System.out.println(str + 10);
        System.out.println("abc".compareTo("abcd"));


        // 2.>
        String x = "hello";
        x.toUpperCase();
        System.out.println(x); //here the output will be "hello" only because String is immutable and it is not assigned to x

        // 3.>
        String s = "012345";
        System.out.println(s.substring(2,2));
    }
}
