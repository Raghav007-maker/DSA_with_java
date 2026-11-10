package classWork.ArrayList_Assignment;

import java.util.ArrayList;


class students{
    int rollNo;
    String name;
    public students(int rollno,String name){
        this.rollNo = rollno;
        this.name = name;
    }

    public String toString(){
        return rollNo + name;
    }

}
public class function {
    public static void main(String[] args) {
        ArrayList<students> list =new ArrayList<>();
        list.add(new students(48,"Raghav"));
        list.add(new students(40,"Mradul"));
        list.add(new students(12,"Anuj"));

        System.out.println(list);
    }
}


