package classWork.Array_Assignment;


public class ex10 {

    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        int num = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = num;
                num++;
            }
        }

        int sum = 0;
        for (int i = 0; i <arr.length;i++) {
            sum+=arr[i][i];
            sum+=arr[i][arr.length-i-1];
        }

        if(arr.length%2!=0){
            sum-=arr[arr.length/2][arr.length/2];
        }
        System.out.println(sum);
    }
}
