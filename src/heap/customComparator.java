package heap;

import java.util.Arrays;

class Student implements Comparable<Student>{
    String name;
    int rno;
    double cgpa;
    Student(String name, int rno, double cgpa){
        this.name = name;
        this.rno = rno;
        this.cgpa = cgpa;
    }

    public int compareTo(Student s){
        return Integer.compare(this.rno, s.rno);
    }
}

public class customComparator {
    public static void main(String[] args) {

        Student s1 = new Student("raghav", 31, 79.9);
        Student s2 = new Student("udit", 40, 78);
        Student s3 = new Student("shrikant", 44, 79.3);

        Student[] arr = {s1, s2, s3};
        Arrays.sort(arr);
        for(Student s : arr){
            System.out.println(s.rno + " ");
        }
    }
}
