package classWork.Array_Assignment;

public class ex8 {
    public static void main(String[] args) {
        String[] arr={"Raghav","Ravi","Raman","Rishi","Ronak"};
        String name="Raghav";
        boolean check=findName(arr,name);
        System.out.println(check);
    }
    public static boolean findName(String[] arr, String name){
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(name)){
                return true;
            }
        }
        return false;
    }
}
