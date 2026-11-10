package BasicOfJava.Methods;

public class Return_type {
    public static void main(String[] args) {
        int a=sum(34,65);
        System.out.println(a);
        
    }
    public static int sum(int a,int b){
        int sum=a+b;
        return sum;
    }
    
}
