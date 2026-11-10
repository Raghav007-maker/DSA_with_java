package BasicOfJava;
public class imp1{
    public static void main(String[] args) {
        String str="ragxav";
        char[] string=str.toCharArray();
        string[3]='h';
        str=new String(string);
        System.out.println(str);
        // System.out.println(str.charAt(0));
        
    }
}