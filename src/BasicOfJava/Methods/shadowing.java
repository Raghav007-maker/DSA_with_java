package BasicOfJava.Methods;

public class shadowing {
    static int x=23;//this will be shadowed by line no 9
    public static void main(String[] args) {
        System.out.println(x);
        int x;//the class variable is shadowed by this line
        // System.out.println(x);//scope will begin when the variable is initailized
        x=40;
        System.out.println(x);
        check();
    }
    static void check(){
        System.out.println(x);
    }
}
