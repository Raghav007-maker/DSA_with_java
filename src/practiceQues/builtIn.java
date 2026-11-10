package src.practiceQues;

import java.util.Arrays;

public class builtIn {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6};
        System.out.println(Arrays.binarySearch(arr, 4));

        Dog[] dogName = new Dog[5];
        dogName[0] = new Dog("Tiger");
        dogName[1] = new Dog("Brunno");
        
        for(int i = 0; i < dogName.length; i++){
            System.out.print(dogName[i]+" ");
        }
    }
}

class Dog{

    String name;

    public Dog(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    } 
}


