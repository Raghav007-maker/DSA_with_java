package Bitwise;

public class powOfTwo {
    public static void main(String[] args) {
        int no=16;//note-fix for n=0
        boolean ans= (no&(no-1))==0;
        System.out.println(ans);
    }
}
