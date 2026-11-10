package BasicOfJava.Methods;
import java.util.Arrays;
public class Var_length_Arg {
    public static void main(String[] args) {
        fun(43,5,68,8,45,67);
        multiple(34, 56, "raghav","Bansal");
        
    }
    static void multiple(int a,int b,String ...v){
        System.out.println(Arrays.toString(v));

    }
    static void fun(int ...a){
        System.out.println(Arrays.toString(a));
    }
}
