package BasicOfJava;
public class increment_decrement {
    public static void main(String[] args) {
        int x=5;
        System.out.println(x);
        x++;
        System.out.println(x);

        System.out.println(x++);//first use then increment
        System.out.println(x);
        x=5;
        System.out.println(++x);//first increment then use
        System.out.println(x);
        
    }
}
