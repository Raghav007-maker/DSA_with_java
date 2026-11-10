package Recursion.Practice;

public class str {
    public static void main(String[] args) {
        String str="baccad";
        String ans1=removeA(str);
        System.out.println(ans1);
        System.out.println(leavingString("bcaAppleacb"));

        
    }

    public static String removeA(String str){
        if(str.isEmpty()){
            return "";
        }
        
        if(str.charAt(0)!='a'){
            return (str.charAt(0)+removeA(str.substring(1)));
        }
        
        return removeA(str.substring(1));
        
    }
    public static String leavingString(String str){
        if(str.isEmpty()){
            return "";
        }

        if(str.startsWith("Apple")){
            return leavingString(str.substring(5));
        }
        return (str.charAt(0)+leavingString(str.substring(1)));
    }
}
