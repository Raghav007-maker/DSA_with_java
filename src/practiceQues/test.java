package src.practiceQues;

public class test {
    public static void main(String[] args) {
        
        Students[] arr=new Students[5];

        arr[0]=new Students(1,"raghav");
        arr[1]=new Students(2,"rishi");
        arr[2]=new Students(3,"ronak");
        arr[3]=new Students(4,"ram");
        arr[4]=new Students(5,"ravi");

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i].roll_no+" "+arr[i].name);
        }

    }
}
class Students{

    int roll_no;
    String name;

    Students(int roll,String name){
        this.roll_no=roll;
        this.name=name;
    }
}