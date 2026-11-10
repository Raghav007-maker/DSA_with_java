package BasicOfJava.loops;

import java.util.Scanner;
public class ques {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt(),sec_hcf=0;
        for(int i=1;i<=no;i++){
            if(no%i==0 && no!=i){
                sec_hcf=i;
            }
            else if (no%i==0 && no==i) {
                break;
            }
        }
        System.out.println(sec_hcf);
    }
}
