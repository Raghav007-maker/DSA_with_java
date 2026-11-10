package BasicOfJava.Methods;
// two or more function with same name can exist if there parameters are different
public class function_overloading {
    public static void main(String[] args) {
        fun(45);
        fun("Raghav");
    }
    public static void fun(int a){
        System.out.println(a);
    }
    public static void fun(String name){
        System.out.println(name);
    }
    
}
