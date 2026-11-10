package Strings;

public class basic {

    public static void main(String[] args) {
        // 1.> strings are immutable--> String object never change.
        // we can assign the variable to new object which will point to new object.
        // like
        String var = "Raghav";
        System.out.println(var);
        var = "Bansal";
        System.out.println(var);

        //2.> Strings are compared by two methods--->
        // a.) == (comparison operator):this operator will check if both the variable are pointing to the same object 
        // b.) by eqauls(): this just checks that both the variable have same value or not.
        // like
        String a="raghav";
        String b="raghav";
        System.out.println(a==b);  //true
        System.out.println(a.equals(b));  //true
        
        // ex:2
        String c =new String("raghav");
        String d =new String("raghav");
        System.out.println(c==d);  //false becoz here the objects now created out of the String pool and different variable pointing to differnet objects 
        System.out.println(c.equals(d));  //true
    }

}
