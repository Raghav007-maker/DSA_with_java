package Strings;

import java.util.ArrayList;

public class operator {

    public static void main(String[] args) {
        System.out.println("a" + "b");
        System.out.println('a' + 'b');
        System.out.println("a" + 1);
        System.out.println(Integer.parseInt("2")+ "" + new ArrayList<>());
        // performance of String--->
        // as we Know that String are imutable so we can not add or delete any char in it
    String slice="";
    for(int i=0;i<26;i++){
        char ch=(char)('a'+i);
        slice+=ch;
    }
    System.out.println(slice);
    // Here at every iteration the new String is made and re-initializing the variable slice
    // This make much memory space due to garbage value which does n,t have any reference variable
    // so to save from this condition we use StringBuilder in which changes are allowed in String 
}


}
