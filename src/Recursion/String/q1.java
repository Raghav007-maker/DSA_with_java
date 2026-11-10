package Recursion.String;

public class q1 {
    public static void main(String[] args) {
        String str="baccad";
        leaving(str,"");
        System.out.println(leaving2("baccad"));
        System.out.println(leavingString("bcaAppleacb"));
        
    }
    // by passing new String as argument
    public static  void leaving(String str,String newStr){
        if(str.length()==0){
            System.out.println(newStr);
            return;
        }
        char ch=str.charAt(0);
        if(ch=='a'){
            leaving(str.substring(1),newStr);
        }
        else{
            leaving(str.substring(1),newStr+ch);
        }
    }
    // changing the exisiting String inside the Function
    public static String leaving2(String str){
        if(str.isEmpty()) return "";

        char ch=str.charAt(0);
        if(ch=='a'){
            return leaving2(str.substring(1));
        }
        else{
            return ch+leaving2(str.substring(1));
        }
    }

    public static String leavingString(String str){
        if(str.isEmpty()) return "";
      

        if(str.startsWith("Apple")){
            return leavingString(str.substring(5));
        }
        else{
            return str.charAt(0)+leavingString(str.substring(1));
        }
    }


    
}
