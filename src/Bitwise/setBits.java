package Bitwise;

public class setBits {
    public static void main(String[] args) {
        int no=15;

        int count=0;
        while(no>0){

            if((no&1)==1) count++;
            no=no>>1;
        }
        System.out.println(count);
    }
}
