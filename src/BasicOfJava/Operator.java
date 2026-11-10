package BasicOfJava;

public class Operator {
    public static void main(String[] args) {
        int f=7;
        // System.out.println(a/0);
        System.out.println(10.0/0);
        System.out.println("f &= 0b1010: " + (f &= 0b1010));
        System.out.println("f |= 0b1100: " + (f |= 0b1100));
        System.out.println("f ^= 0b1010: " + (f ^= 0b1010));
    }
}
