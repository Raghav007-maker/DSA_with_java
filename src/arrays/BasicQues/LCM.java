package arrays.BasicQues;

public class LCM {

    public static void main(String[] args) {
        int a=3;
        int b=6;
        int i=2;
        int lcm=1;
        while(a!=1 || b!=1){
            if(a%i==0 && b%i==0){
                lcm=lcm*i;
                a/=i;
                b/=i;
            }
            else if(a%i==0 || b%i==0){
                if(a%i==0){
                    a/=i;
                }
                else{
                    b/=i;
                }
                lcm=lcm*i;
            }
            else{
                i++;
            }
        }
        System.out.println(lcm);
    }
}
